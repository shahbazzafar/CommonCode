package com.example.commoncode.beforeproduction

//points to checks in every build:
//(01)-> Update all dependencies and gradle, kotlin versions
//(02)-> checking ad ids of release and debug.
//(03)-> remote config values
//(04)-> analytics and crashlytics
//(05)-> version 33 supported or not
//(06)-> check billing class
//(07)-> fcm in manifest
//(08)-> in App rating
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
//(21)-> Check force update
//(22)-> Convert all .png images to .webp

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

////added as workaround
//lintOptions {
//    checkReleaseBuilds true
//    // Or, if you prefer, you can continue to check for errors in release builds,
//    // but continue the build even when errors are found:
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