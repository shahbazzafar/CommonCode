package com.example.commoncode.ui.activities

import android.content.Context
import android.content.res.Configuration
import android.content.res.Resources
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.DisplayMetrics
import android.util.Log
import android.view.View
import androidx.core.view.ViewCompat
import com.example.commoncode.R
import com.example.commoncode.domain.utils.MyPreferences
import java.util.*

class BaseActivity : AppCompatActivity() {

//    private val mFirebaseAnalytics by lazy { FirebaseAnalytics.getInstance(this) }

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

    //Note: This is very useful for set layout direction both sides without restart the activity
    private fun setLocale(languageCode: String) {
        val locale = Locale(languageCode)
        Locale.setDefault(locale)

        val resources = resources
        val configuration: Configuration = resources.configuration
        configuration.setLocale(locale)

        val appContext = this.applicationContext
        val appResources = appContext.resources
        val appConfiguration: Configuration = appResources.configuration
        appConfiguration.setLocale(locale)

        resources.updateConfiguration(configuration, resources.displayMetrics)
        appResources.updateConfiguration(appConfiguration, appResources.displayMetrics)

        // Set layout direction based on selected language
        if (TextUtils.getLayoutDirectionFromLocale(locale) == ViewCompat.LAYOUT_DIRECTION_RTL) {
            // Set layout direction to right-to-left
            this.window?.decorView?.layoutDirection = View.LAYOUT_DIRECTION_RTL
        } else {
            // Set layout direction to left-to-right
            this.window?.decorView?.layoutDirection = View.LAYOUT_DIRECTION_LTR
        }
    }


    /**
     * Method to send analytics to firebase.
     */
//Note: How to call in Fragment or Activity
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        activity?.let {
//            if (it is MainActivity) {
//                it.postAnalytic("language_fragment_onCreate")
//                it.postFragNameAnalytic("language_fragment")
//            }
//        }
//    }

//    open fun postAnalytic(event: String) {
//        val fEvent = event.replace(" ", "_").lowercase()
//        Log.i("eventTest", "postAnalytic: $fEvent")
//        val bundle = Bundle()
//        bundle.putString(fEvent, "AntiTheftAlarm -> $fEvent")
//        mFirebaseAnalytics?.logEvent(fEvent, bundle)
//    }

//    fun postAnalytic(event: String) {
//        val fString = event.lowercase(Locale.getDefault()).replace(' ', '_').trim()
//        val bundle = Bundle()
//        if (BuildConfig.DEBUG) myToast(fString)
//        bundle.putString(fString, fString)
//        mFirebaseAnalytics.logEvent(fString, bundle)
//    }

//    fun postFragNameAnalytic(name: String?) {
//        try {
//            val bundle = Bundle()
//            bundle.putString(FirebaseAnalytics.Param.SCREEN_NAME, name)
//            mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SCREEN_VIEW, bundle)
//        } catch (_: java.lang.Exception) {
//        } catch (_: Exception) {
//        }
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