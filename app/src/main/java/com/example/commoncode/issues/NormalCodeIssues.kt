package com.example.commoncode.issues

import android.annotation.SuppressLint
import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager

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

/**
 * Status Bar Full Screen
 */

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


//Glide.with(this@MainActivity).load(R.drawable.main_layer_blur)
//.apply(RequestOptions.bitmapTransform(BlurTransformation(50, 3)))
//.into(layerBlur)