package com.example.commoncode.beforeproduction

//points to checks in every build:
//-> Update all dependencies and gradle, kotlin versions
//-> checking ad ids of release and debug.
//-> remote config values
//-> analytics and crashlytics
//-> version 33 supported or not
//-> check billing class
//-> fcm in manifest
//-> in App rating
//-> link text in share
//-> notification icon
//-> post notification android 33
//-> update version
//-> update all gradle libraries
//-> link options in manifest
//-> ads performance meta flag in manifest
//-> check language split in gradle file if languages added in project
//-> add Glide performance tag
//-> check shrinkResources and minifyEnabled true in buildTypes release gradle file
//-> check READ_MEDIA_IMAGES, READ_MEDIA_VIDEO and READ_MEDIA_AUDIO permission in Android 13 if these permissions are used in project
//-> Add resizeableActivity, hardwareAccelerated, largeHeap, usesCleartextTraffic in manifest Application Tag
//-> Check force update

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

//lintOptions {
//    checkReleaseBuilds true
//    abortOnError true
//}
//
//
//bundle {
//    language {
//        enableSplit = false
//    }
//}
//
//
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