package com.example.commoncode.gradle

//(1)
//Note: this is how to set application name to apk in gradle.kts
//
//applicationVariants.all {
//    val variant = this
//    variant.outputs
//        .map { it as com.android.build.gradle.internal.api.BaseVariantOutputImpl }
//        .forEach { output ->
//            val outputFileName = "ChatBot - ${variant.baseName} - ${variant.versionName} ${variant.versionCode}.apk"
//            output.outputFileName = outputFileName
//        }
//}