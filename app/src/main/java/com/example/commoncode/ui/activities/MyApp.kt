package com.example.commoncode.ui.activities

import android.app.Activity
import android.app.Application
import android.content.res.Configuration
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatDelegate
import java.util.Locale

class MyApp: Application() {

    override fun onCreate() {
        super.onCreate()

        application = this

        systemDefaultLanguage = Locale.getDefault().language

        registerActivityLifecycle()

//        val preferences = MyPreferences(this)
//
//        when (preferences.getUiMode()) {
//            0 -> {
//                AppCompatDelegate.setDefaultNightMode(
//                    AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM
//                )
//            }
//
//            1 -> {
//                AppCompatDelegate.setDefaultNightMode(
//                    AppCompatDelegate.MODE_NIGHT_NO
//                )
//            }
//
//            2 -> {
//                AppCompatDelegate.setDefaultNightMode(
//                    AppCompatDelegate.MODE_NIGHT_YES
//                )
//            }
//        }

    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        systemDefaultLanguage = newConfig.locale.language
    }

    private fun registerActivityLifecycle() {
        registerActivityLifecycleCallbacks(object : ActivityLifecycleCallbacks {
            override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
                activity.window.setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE)
            }
            override fun onActivityStarted(activity: Activity) {}
            override fun onActivityResumed(activity: Activity) {}
            override fun onActivityPaused(activity: Activity) {}
            override fun onActivityStopped(activity: Activity) {}
            override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {}
            override fun onActivityDestroyed(activity: Activity) {}
        })
    }

    companion object {
        private var application: MyApp? = null
        fun getApplication(): MyApp {
            return application ?: MyApp()
        }

        var systemDefaultLanguage: String? = null
    }
}