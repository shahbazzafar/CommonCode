package com.example.commoncode.domain.utils

import android.content.Context
import android.net.ConnectivityManager
import android.net.Network
import android.net.NetworkCapabilities
import android.net.NetworkRequest
import android.os.SystemClock
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow

object Extensions {
    fun View.setOnOneClickListener(debounceTime: Long = 600L, action: () -> Unit) {
        this.setOnClickListener(object : View.OnClickListener {
            private var lastClickTime: Long = 0

            override fun onClick(v: View) {
                if (SystemClock.elapsedRealtime() - lastClickTime < debounceTime) return
                else action()

                lastClickTime = SystemClock.elapsedRealtime()
            }
        })
    }

    inline fun Context.showToast(message:()->String){
        Toast.makeText(this, message() , Toast.LENGTH_LONG).show()
    }

    inline fun Fragment.showToast(message:()->String){
        Toast.makeText(this.context, message() , Toast.LENGTH_LONG).show()
    }

    fun Context.checkConnection() : Flow<Boolean> = callbackFlow{
        val callback = object : ConnectivityManager.NetworkCallback() {
            override fun onAvailable(network: Network) {
                super.onAvailable(network)
                trySend(true).isSuccess
            }

            override fun onLost(network: Network) {
                super.onLost(network)
                trySend(false).isSuccess
            }
        }
        val manager = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        manager.registerNetworkCallback(
            NetworkRequest.Builder()
            .addCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET)
            .build(),callback)
        awaitClose { manager.unregisterNetworkCallback(callback) }
    }

    fun EditText.textChange() : Flow<Editable?> = callbackFlow{
        val callback = object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                trySend(s).isSuccess
            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) { }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) { }

        }
        addTextChangedListener(callback)
        awaitClose { removeTextChangedListener(callback) }
    }


//    fun BottomNavigationView.disableTooltipText() {
//        val menuIterator = menu.iterator()
//        while(menuIterator.hasNext()) {
//            val menu = menuIterator.next()
//            findViewById<View>(menu.itemId)?.let { view ->
//                TooltipCompat.setTooltipText(view, null)
//            }
//        }
//    }
}