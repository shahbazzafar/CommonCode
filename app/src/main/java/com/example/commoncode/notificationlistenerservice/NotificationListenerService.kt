package com.example.commoncode.notificationlistenerservice

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.provider.Settings
import android.service.notification.StatusBarNotification
import android.text.TextUtils
import android.util.Log
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.app.NotificationManagerCompat

// override fun onNotificationPosted(sbn: StatusBarNotification) {
//    super.onNotificationPosted(sbn)
//    if (sbn.tag != null) {
//        /*I found something, the second notification always brings null tag, so this will be trigger only 1 time.*/
//        if (sbn.tag != null) {
//            // Do something
//        } else {
//            cancelNotification(statusBarNotification.key)
//        }
//    }
//}

// private fun allowNotificationPermission(){
//    if (isNotificationServiceEnabled(context)) {
//        // Do something
//    } else {
//        mStartForResult.launch(Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"))
//    }
//}
//
// private var mStartForResult = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
//    if (NotificationManagerCompat.getEnabledListenerPackages(requireContext())
//            .contains(context?.packageName)
//    ) {
//        Log.d("MyRequestPermission", "Notification permission granted")
//    } else {
//        Log.d("MyRequestPermission", "Notification Permission not granted")
//    }
//}

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