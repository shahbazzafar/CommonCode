package com.example.commoncode.beforeproduction

//points to checks in every build:
//(01)-> Update all dependencies and gradle, kotlin versions
//(02)-> checking ad ids of release and debug.
//(03)-> remote config values
//(04)-> analytics and crashlytics
//(05)-> version 33 supported or not
//(06)-> check billing class
//(07)-> fcm in manifest
//(08)-> in App rating (on completion of core task, 2nd time app open show on home, or any other best placement as per app.) Rating should be always greater then 3 will go to play store else redirect it to Feedback screen.
//(09)-> link text in share
//(10)-> notification icon
//(11)-> post notification android 33
//(12)-> update version
//(13)-> update all gradle libraries
//(14)-> link options in manifest
//(15)-> ads performance meta flag in manifest
//(16)-> check language split in gradle file if languages added in project
//(17)-> add Glide performance tag
//(18)-> check shrinkResources and minifyEnabled true in buildTypes release gradle file
//(19)-> check READ_MEDIA_IMAGES, READ_MEDIA_VIDEO and READ_MEDIA_AUDIO permission in Android 13 if these permissions are used in project
//(20)-> Add resizeableActivity, hardwareAccelerated, largeHeap, usesCleartextTraffic in manifest Application Tag
//(21)-> Check Force update (do not use flexible update)
//(22)-> Convert all .png images to .webp
//(23)-> Feedback App ID
//(24)-> No repeated toasts

/**
 * General Remote Config for Ads
 */

//(1) Keep All ID's on Remote
//(2) Keep all ads on off on Remote
//(3) Keep App Open Capping Time on Remote Default 10 Sec ( Minium allowable input 0)
//(4) Keep Interstitial Ads Capping time on Remote Default 30 Sec ( Minimum input allowable 10 Sec)
//(5) Add Border on all natives ( Via remote Key On Off ) ( Single key)
//(6) Border Color on all native on remote ( Single key)
//(7) Native CTA Color all Native ( Single key On remote )

/**
 * Manifest
 */

//Add these in application tag
//
//android:resizeableActivity="false"
//android:hardwareAccelerated="true"
//android:largeHeap="true"
//android:usesCleartextTraffic="true"

//<meta-data
//android:name="com.google.android.gms.ads.APPLICATION_ID"
//android:value="@string/admob_app_id" />
//
//<meta-data
//android:name="preloaded_fonts"
//android:resource="@array/preloaded_fonts" />
//
//<meta-data
//android:name="google_analytics_automatic_screen_reporting_enabled"
//android:value="false" />
//
//<meta-data
//android:name="com.google.firebase.messaging.default_notification_icon"
//android:resource="@drawable/ic_notification" />
//
//<meta-data
//android:name="com.google.firebase.messaging.default_notification_color"
//android:resource="@color/color_app" />
//
//<meta-data
//android:name="firebase_crashlytics_collection_enabled"
//android:value="${crashlyticsCollectionEnabled}" />
//
//<meta-data
//android:name="com.google.android.gms.ads.flag.OPTIMIZE_INITIALIZATION"
//android:value="true" />
//
//<meta-data
//android:name="com.google.android.gms.ads.flag.OPTIMIZE_AD_LOADING"
//android:value="true" />


/**
 * App Gradle
 */

//https://developer.android.com/build/releases/gradle-plugin
//https://firebase.google.com/support/release-notes/android

// For crashlytics enable and disable
//buildTypes {
//    release {
//        minifyEnabled true
//        shrinkResources true
//        proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
//
//        manifestPlaceholders["crashlyticsCollectionEnabled"] = true
//    }
//    debug {
//        minifyEnabled false
//        shrinkResources false
//        proguardFiles getDefaultProguardFile ('proguard-android-optimize.txt'), 'proguard-rules.pro'
//
//        manifestPlaceholders["crashlyticsCollectionEnabled"] = false
//    }
//}

// Note: For checking release build
//lintOptions {
//    This option controls whether lint runs on release builds. It's generally a good idea to run lint on release builds to catch potential issues before releasing your app.
//    checkReleaseBuilds true
//    This option determines whether the build process should be aborted if any critical issues are found by the lint tool. If set to true, the build will fail if lint reports any issues marked as "error."
//    abortOnError true
//}
//
//
// Note: to avoid splitting languages (by default it will split language in bundle and user will only be able to download app with language of his/her region.)
//bundle {
//    language {
//        enableSplit = false
//    }
//}
//
//This code snippet provide meaningful and informative APK file names
//android.applicationVariants.all { variant ->
//    variant.outputs.all {
//        def appName = "AntiTheftAlarm"
//        def versionName = variant.versionName
//                def versionCode = variant.versionCode
//                def formattedDate = new Date().format('dd-MM-yy HH-mm')
//        def variantName = variant.name // e. g. freeDebug
//                def apkName = appName + '_' + variantName + ' VCodes ' + versionCode + '  VName ' + versionName + ' _' + formattedDate + '.apk'
//        outputFileName = apkName
//    }
//}

//configurations.all {
//    resolutionStrategy {
//        force 'androidx.core:core-ktx:1.6.0'
//    }
//}

//signingConfigs {
//    release {
//        storeFile file('F:\\Phone Cleaner\\app\\onetouch.jks')
//        storePassword 'onetouch'
//        keyAlias 'onetouch'
//        keyPassword 'onetouch'
//    }
//}

/**
 * ProGuard rules
 */
//-keep public class * implements com.bumptech.glide.module.GlideModule
//-keep class * extends com.bumptech.glide.module.AppGlideModule {
//    <init>(...);
//}
//-keep public enum com.bumptech.glide.load.ImageHeaderParser$** {
//    **[] $VALUES;
//    public *;
//}
//-keep class com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$InternalRewinder {
//    *** rewind();
//}
//# Uncomment for DexGuard only
//#-keepresourcexmlelements manifest/application/meta-data@value=GlideModule

//https://github.com/bumptech/glide/blob/master/library/proguard-rules.txt