package com.example.commoncode.ui.activities

import android.content.Context
import android.content.res.Configuration
import android.content.res.Resources
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import android.util.Log
import com.example.commoncode.R
import com.example.commoncode.domain.utils.MyPreferences
import java.util.*

class BaseActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        val lang = MyPreferences().getStringPreferences(this, "language")
//        if (lang.isNullOrEmpty()) {
//            setLocale(this, Locale.getDefault().language)
//        } else {
//            setLocale(this, lang)
//        }


    }

    open fun setLocale(context: Context, locale: String?) {

        val res: Resources = context.resources
        val dm: DisplayMetrics = res.displayMetrics
        val conf: Configuration = res.configuration
        conf.setLocale(Locale(locale))
        res.updateConfiguration(conf, dm)
    }


    /**
     * Method to send analytics to firebase.
     */
//    open fun postAnalytic(event: String) {
//        val fEvent = event.replace(" ", "_").lowercase()
//        Log.i("eventTest", "postAnalytic: $fEvent")
//        val bundle = Bundle()
//        bundle.putString(fEvent, "AntiTheftAlarm -> $fEvent")
//        mFirebaseAnalytics?.logEvent(fEvent, bundle)
//    }

//    fun isNetworkAvailable(context: Context): Boolean {
//        val connectivityManager =
//            context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//            val nw = connectivityManager.activeNetwork ?: return false
//            val actNw = connectivityManager.getNetworkCapabilities(nw) ?: return false
//            return when {
//                actNw.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true
//                actNw.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true
//                actNw.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) -> true
//                else -> false
//            }
//        } else {
//            val nwInfo = connectivityManager.activeNetworkInfo ?: return false
//            return nwInfo.isConnected
//        }
//    }
}