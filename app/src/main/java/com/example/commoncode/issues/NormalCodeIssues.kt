package com.example.commoncode.issues

/**
 * BuildConfig Issue
 */

//add below line of code in gradle.properties its needed if project gradle version is 8.0 or above
//android.defaults.buildfeatures.buildconfig=true

//Note: Text padding solution
//android:includeFontPadding="false"

//mainContainer.layoutParams.height = TypedValue.applyDimension(
//TypedValue.COMPLEX_UNIT_DIP, 290f, resources.displayMetrics).toInt()
//admobContainer.layoutParams.height = TypedValue.applyDimension(
//TypedValue.COMPLEX_UNIT_DIP, 280f, resources.displayMetrics).toInt()
//nativeVideoSites.loadAdsWithConfiguration(mainContainer, admobContainer,native_btn_color,ConstantFunctions.all_native_home_round_percent, 420, getString(R.string.native_ad_id), "", 1)