package com.example.commoncode.notificationlistenerservice

import android.content.ComponentName
import android.content.Context
import android.provider.Settings
import android.text.TextUtils

private fun isNotificationServiceEnabled(context: Context): Boolean {
    try {
        val pkgName: String = context.packageName
        val flat =
            Settings.Secure.getString(context.contentResolver, "enabled_notification_listeners")
        if (!TextUtils.isEmpty(flat)) {
            val names = flat.split(":".toRegex()).toTypedArray()
            for (i in names.indices) {
                val cn = ComponentName.unflattenFromString(names[i])
                if (cn != null) {
                    if (TextUtils.equals(pkgName, cn.packageName)) {
                        return true
                    }
                }
            }
        }
        return false
    } catch (e: Exception) {
        return false
    }
}