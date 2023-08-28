package com.example.commoncode.proguardrules

//-keep class com.google.android.material.bottomnavigation.BottomNavigationView
//-keep class com.google.android.material.internal.*
//
//-keepattributes RuntimeVisibleAnnotations
//-keep class * extends androidx.navigation.Navigator
//
//#-keep class com.google.ads.** # Don't proguard AdMob classes
//#-dontwarn com.google.ads.** # Temporary workaround for v6.2.1. It gives a warning that you can ignore