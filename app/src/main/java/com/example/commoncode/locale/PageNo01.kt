package com.example.commoncode.locale

import android.content.Context
import android.content.res.Configuration
import android.content.res.Resources
import java.util.Locale

//override fun attachBaseContext(context: Context) {
//    val sharedPreferences = context.getSharedPreferences("prefs", MODE_PRIVATE)
//    val language: String = sharedPreferences.getString(ConstantFunctions.CHANGE_LANGUAGE, Locale.getDefault().language)!!
//    super.attachBaseContext(MyContextWrapper.wrap(context, language))
//    val locale = Locale(language)
//    val resources: Resources = baseContext.resources
//    val config: Configuration = resources.configuration
//    config.setLocale(locale)
//    resources.updateConfiguration(config, resources.displayMetrics)
//}


//private fun setLocale(languageCode: String) {
//    val locale = Locale(languageCode)
//    Locale.setDefault(locale)
//
//    val resources = resources
//    val configuration: Configuration = resources.configuration
//    configuration.setLocale(locale)
//
//    val appContext = requireContext().applicationContext
//    val appResources = appContext.resources
//    val appConfiguration: Configuration = appResources.configuration
//    appConfiguration.setLocale(locale)
//
//    resources.updateConfiguration(configuration, resources.displayMetrics)
//    appResources.updateConfiguration(appConfiguration, appResources.displayMetrics)
//
//    // Set layout direction based on selected language
//    if (TextUtils.getLayoutDirectionFromLocale(locale) == ViewCompat.LAYOUT_DIRECTION_RTL) {
//        // Set layout direction to right-to-left
//        activity?.window?.decorView?.layoutDirection = View.LAYOUT_DIRECTION_RTL
//    } else {
//        // Set layout direction to left-to-right
//        activity?.window?.decorView?.layoutDirection = View.LAYOUT_DIRECTION_LTR
//    }
//}

//private fun openMainFragment() {
//    if (findNavController().currentDestination?.id == R.id.languagesFragment) {
//        val navOptions = NavOptions.Builder().setPopUpTo(R.id.languagesFragment, true).build()
//        findNavController().navigate(R.id.action_languagesFragment_to_mainFragment, null, navOptions)
//    }
//}

//Note: How to call
//val language: String = sharedPreferences.getString(CHANGE_LANGUAGE, Locale.getDefault().language)!!
//setLocale(language)
//openMainFragment()