package com.example.commoncode.ui.activities

/*
import android.annotation.SuppressLint
import android.app.Activity
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.net.ConnectivityManager
import android.net.Network
import android.net.NetworkCapabilities
import android.net.NetworkRequest
import android.os.Build
import android.os.Handler
import android.os.Looper
import android.os.SystemClock
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.EditText
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import androidx.navigation.fragment.findNavController
import com.android.ar.ruler.utils.Constants.Companion.ACTION_INIT
import com.android.ar.ruler.utils.Constants.Companion.REMOTE_ACCESS_SERVICE
import com.google.android.material.snackbar.Snackbar
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.withContext
import org.videolan.medialibrary.interfaces.Medialibrary
import java.io.IOException

object Extensions {

    private var lastClickTime: Long = 0

    fun View.setOnOneClickListener(debounceTime: Long = 0L, action: () -> Unit) {
        this.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                if (SystemClock.elapsedRealtime() - lastClickTime < debounceTime) return
                else action()

                lastClickTime = SystemClock.elapsedRealtime()
            }
        })
    }

    inline fun <T> T.tryCatch(block: T.() -> Unit) {
        try {
            block()
        } catch (t: Throwable) {
            t.localizedMessage.debug()
        } catch (e: NullPointerException) {
            e.localizedMessage.debug()
        } catch (e: IllegalArgumentException) {
            e.localizedMessage.debug()
        } catch (e: IllegalStateException) {
            e.localizedMessage.debug()
        } catch (e: IndexOutOfBoundsException) {
            e.localizedMessage.debug()
        } catch (e: UnsupportedOperationException) {
            e.localizedMessage.debug()
        } catch (e: ClassCastException) {
            e.localizedMessage.debug()
        } catch (e: IOException) {
            e.localizedMessage.debug()
        } catch (e: Exception) {
            e.localizedMessage.debug()
        } catch (e: java.lang.Exception) {
            e.localizedMessage.debug()
        } catch (e: java.io.IOException) {
            e.localizedMessage.debug()
        } catch (e: java.io.FileNotFoundException) {
            e.localizedMessage.debug()
        } catch (e: UninitializedPropertyAccessException) {
            e.localizedMessage.debug()
        }
    }

    inline fun Context.showToast(message:()->String){
        Toast.makeText(this, message() , Toast.LENGTH_LONG).show()
    }

    inline fun Fragment.showToast(message:()->String){
        Toast.makeText(this.context, message() , Toast.LENGTH_LONG).show()
    }

    inline fun NavController.canGoBack(isPressed:(Boolean)->Unit){
        isPressed.invoke(this.currentBackStackEntry?.lifecycle?.currentState == Lifecycle.State.RESUMED)
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

    */
/**
     * Common extensions.
     *//*


    @SuppressLint("UnspecifiedRegisterReceiverFlag")
    fun Context.registerReceiverCompat(receiver: BroadcastReceiver, filter: IntentFilter, exported: Boolean) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU)
            registerReceiver(receiver, filter, if (exported) Context.RECEIVER_EXPORTED else Context.RECEIVER_NOT_EXPORTED)
        else
            registerReceiver(receiver, filter)
    }

    @Suppress("DEPRECATION")
    fun PackageManager.getPackageInfoCompat(packageName: String, vararg flagArgs: Int): PackageInfo {
        var flags = 0
        flagArgs.forEach { flag -> flags = flags or flag }
        return if (Build.VERSION.SDK_INT >= 33) {
            getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(flags.toLong()))
        } else {
            getPackageInfo(packageName, flags)
        }
    }

//    fun Context.startRemoteAccess() {
//        val intent = Intent(ACTION_INIT).setClassName(applicationContext, REMOTE_ACCESS_SERVICE)
//        launchForeground(intent)
//    }

    inline fun <T: Any,R> T?.withNotNull(block:(T) -> R): R?{
        return this?.let (block)
    }

    fun Drawable.toBitmap(): Bitmap {
        if (this is BitmapDrawable){
            return bitmap
        }

        val bitmap = Bitmap.createBitmap(intrinsicWidth,intrinsicHeight, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bitmap)
        setBounds(0,0,canvas.width,canvas.height)
        draw(canvas)

        return bitmap
    }

    private fun containsRussiaTimeZone(timeZoneIdList: Array<String>, timeZone: String): Boolean {
        return timeZoneIdList.any { it == timeZone }
    }

    fun Any?.debug() {
        Log.d("tag", "$this")
    }

    */
/**
     * View's visibility extensions.
     *//*


    fun View.visible() {
        visibility = View.VISIBLE
    }

    fun View.gone() {
        visibility = View.GONE
    }

    fun View.invisible() {
        visibility = View.INVISIBLE
    }

    fun View.canShow(isVisible: Boolean) {
        visibility = if (isVisible) View.VISIBLE else View.GONE
    }

    */
/**
     * SnackBar's extensions.
     *//*


    fun View.showSmallSnackBar(text: String) {
        Handler(Looper.getMainLooper()).post{
            Snackbar.make(this, text, Snackbar.LENGTH_SHORT).show()
        }
    }

    fun View.showLongSnackBar(text: String) {
        Handler(Looper.getMainLooper()).post{
            Snackbar.make(this, text, Snackbar.LENGTH_LONG).show()
        }
    }

    fun View.showIndefiniteSnackBar(text: String) {
        Handler(Looper.getMainLooper()).post {
            Snackbar.make(this, text, Snackbar.LENGTH_INDEFINITE).show()
        }
    }

    */
/**
     * Toast extensions.
     *//*


    fun Context.showSmallLengthToast(text: String) {
        Handler(Looper.getMainLooper()).post{
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        }
    }

    fun Context.showLongLengthToast(text: String) {
        Handler(Looper.getMainLooper()).post {
            Toast.makeText(this, text, Toast.LENGTH_LONG).show()
        }
    }

    */
/**
     * Collections & permissions extensions.
     *//*


    fun <T:Any> ArrayList<T>.refreshList(items: List<T>): ArrayList<T> {
        this.clear()
        this.addAll(items)
        return this
    }

    fun <T:Any> ArrayList<T>.addOnlyNewItems(items: List<T>): ArrayList<T> {
        items.forEach { if(!this.contains(it)) this.add(it) }
        return this
    }

    fun Activity.hasPermission(permission: String): Boolean {
        return ActivityCompat.checkSelfPermission(
            this,
            permission
        ) == PackageManager.PERMISSION_GRANTED
    }

    */
/**
     * viewModel extensions.
     *//*


//    fun ViewModel.loadRequest(context: Context, block: suspend () -> Unit): Job {
//        return viewModelScope.launch {
//            try {
//                block()
//            }catch (ex: Exception) {
//                Toast.makeText(context, ex.message, Toast.LENGTH_SHORT).show()
//            }
//        }
//    }

    */
/**
     * Fragments extensions.
     *//*


    fun <T> Fragment.setBackStackData(key: String, data: T, doBack: Boolean = false){
        findNavController().previousBackStackEntry?.savedStateHandle?.set(key,data)
        if (doBack){
            findNavController().popBackStack()
        }
    }

    fun <T> Fragment.getBackStackData(key: String, singleCall: Boolean = true, result: (T) -> (Unit)){
        findNavController().currentBackStackEntry?.savedStateHandle?.getLiveData<T>(key)?.observe(viewLifecycleOwner){
            result(it)
            //if not removed then when click back without set data. it will return previous data
            if (singleCall){
                findNavController().currentBackStackEntry?.savedStateHandle?.remove<T>(key)
            }
        }
    }

//    suspend fun <T:Any> ControlledRunner<T>.cancelLastRequestThenRun(block: suspend () -> T): T {
//        return cancelPreviousThenRun(block)
//    }
//
//    suspend fun <T:Any> ControlledRunner<T>.joinLastRequestThenRun(block: suspend () -> T): T {
//        return joinPreviousOrRun(block)
//    }

    */
/**
     * Status Bar Full Screen
     * *//*

    fun Activity.setFullScreen(rootView: View?, bottomView: View?, createPadding: Boolean = true) {
        this.window.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
//        rootView?.setPadding(0, getStatusBarHeight(this), 0, getBottomNavHeight(this))
        if (createPadding) {
            val param = rootView?.layoutParams as ViewGroup.MarginLayoutParams
            param.setMargins(0, getStatusBarHeight(this), 0, getBottomNavHeight(this))
            rootView.layoutParams = param
        } else {
            val param = rootView?.layoutParams as ViewGroup.MarginLayoutParams
            param.setMargins(0, 0, 0, 0)
            rootView.layoutParams = param
        }
        val param1 = bottomView?.layoutParams as ViewGroup.MarginLayoutParams
        param1.setMargins(0, 0, 0, getBottomNavHeight(this))
        bottomView.layoutParams = param1
    }

    fun Activity.removeFullScreen(rootView: View?, bottomView: View?) {
        this.window.clearFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
//        rootView?.setPadding(0, 0, 0, 0)
        val param = rootView?.layoutParams as ViewGroup.MarginLayoutParams
        param.setMargins(0, 0, 0, 0)
        rootView.layoutParams = param
        val param1 = bottomView?.layoutParams as ViewGroup.MarginLayoutParams
        param1.setMargins(0, 0, 0, 0)
        bottomView.layoutParams = param1
    }

    @SuppressLint("InternalInsetResource")
    fun getStatusBarHeight(activity: Activity): Int {
        var result = 0
        val resourceId = activity.resources.getIdentifier("status_bar_height", "dimen", "android")
        if (resourceId > 0) {
            result = activity.resources.getDimensionPixelSize(resourceId)
        }
        return result
    }

    @SuppressLint("InternalInsetResource")
    private fun getBottomNavHeight(activity: Activity): Int {
        val resourceId =
            activity.resources.getIdentifier("navigation_bar_height", "dimen", "android")
        return if (resourceId > 0) {
            activity.resources.getDimensionPixelSize(resourceId)
        } else 0
    }
}*/
