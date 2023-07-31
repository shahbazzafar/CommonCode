package com.example.commoncode.domain.utils

import android.annotation.TargetApi
import android.content.Context
import android.content.res.Resources
import android.os.Build
import android.util.Log
import com.example.commoncode.ui.activities.MainActivity
import java.util.*

object LocaleHelper {

    var langs = arrayOf(
        "en",
        "fr",
        "hi",
        "es",
        "ar",
        "bn",
        "cs",
        "de",
        "fa",
        "in",
        "it",
        "ja",
        "ko",
        "ms",
        "nl",
        "pl",
        "pt",
        "ru",
        "sv",
        "th",
        "tr",
        "uk",
        "ur",
        "vi",
        "zh",
        "ta"
    )

   /* fun onAttach(context: Context): Context {
        var locale: String? = null
        Log.i("AmbLogs", "onAttach: ${SharedPrefManager.getLanguage(context)}")
        if (SharedPrefManager.getLanguage(context).equals(MainActivity.DEFAULT_LANG_CODE)) {
            for ((index, lang) in langs.withIndex()) {
//                Log.i("LocaleLanguage", "onAttach: ${Locale.getDefault().language}")
                if (lang == Locale.getDefault().language) {
                    SharedPrefManager.setLanguage(context, index)
//                    preferences.set("currentLanguage", lang)
//                    preferences.setLang("language", index)
                    locale = langs[index]
                    break
                } else {
                    SharedPrefManager.setLanguage(context, 0)
                    locale = langs[0]
                }

//                preferences.setString("currentLanguage", "en")
//                preferences.setLang("language", 0)
            }
        } else {
            locale = langs[SharedPrefManager.getLanguage(context)]
        }


        return if (locale?.isNotEmpty() == true) {
            setLocale(context, locale)
        } else {
            setLocale(context, "en")
        }


    }*/


    /**
     * Set the app's locale to the one specified by the given String.
     *
     * @param context
     * @param localeSpec a locale specification as used for Android resources (NOTE: does not
     * support country and variant codes so far); the special string "system" sets
     * the locale to the locale specified in system settings
     * @return
     */

    fun setLocale(context: Context, localeSpec: String): Context {
        val locale: Locale = if (localeSpec == "system") {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                Resources.getSystem().configuration.locales[0]
            } else {
                Resources.getSystem().configuration.locale
            }
        } else {
            Locale(localeSpec)
        }
        Locale.setDefault(locale)
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            updateResources(context, locale)
        } else {
            updateResourcesLegacy(context, locale)
        }
    }

    @TargetApi(Build.VERSION_CODES.N)
    private fun updateResources(context: Context, locale: Locale): Context {
        val configuration = context.resources.configuration
        configuration.setLocale(locale)
        configuration.setLayoutDirection(locale)
        return context.createConfigurationContext(configuration)
    }

    private fun updateResourcesLegacy(context: Context, locale: Locale): Context {
        val resources = context.resources
        val configuration = resources.configuration
        configuration.locale = locale
        configuration.setLayoutDirection(locale)
        resources.updateConfiguration(configuration, resources.displayMetrics)
        return context
    }

}