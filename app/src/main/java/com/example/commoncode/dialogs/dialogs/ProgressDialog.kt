package com.example.commoncode.dialogs.dialogs

import android.app.Activity
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.Window
import android.widget.TextView
import com.example.commoncode.R

object ProgressDialog {

    var dialog: Dialog? = null

    @JvmStatic
    fun showLoadingDialog(context: Activity, title: String?) {
        if (!context.isFinishing && !context.isDestroyed) {
            try {
                dialog?.dismiss()
                dialog = Dialog(context)
                dialog?.requestWindowFeature(Window.FEATURE_NO_TITLE)
                dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                dialog?.setCancelable(false)
                dialog?.setContentView(R.layout.dialog_loading_old)
                val textView = dialog?.findViewById<TextView>(R.id.progress_text)
                if (title != null) {
                    textView?.text = title
                }
                dialog?.show()
            } catch (_: Exception) {
            } catch (_: java.lang.Exception) {
            } catch (_: IllegalArgumentException) {
            }
        }
    }

    @JvmStatic
    fun hideLoadingDialog(activity: Activity) {
        try {
            if (!activity.isFinishing && !activity.isDestroyed && dialog != null) {
                dialog?.dismiss()
            }
        } catch (_: IllegalArgumentException) {
        }
    }
}