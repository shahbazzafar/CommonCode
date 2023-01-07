package com.example.commoncode.domain.utils

import android.app.AlertDialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.view.View
import com.example.commoncode.R
import java.lang.Exception
import java.util.*

object LoadingDialog {

    var dialogs: AlertDialog? = null

    fun showLoadingDialog(context: Context) {
        val factory = LayoutInflater.from(context)
//        val loadingDialogView: View = factory.inflate(R.layout.ads_loading_dialog, null)
       dialogs = AlertDialog.Builder(context).create()
       dialogs?.setCanceledOnTouchOutside(false)
       dialogs?.setCancelable(false)
       dialogs?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
//       dialogs?.setView(loadingDialogView)


        try {
            if (dialogs?.isShowing == false) {
                dialogs?.show()
            }
        } catch (e: java.lang.IllegalArgumentException) {
        } catch (e: Exception) {

        }
    }

    fun hideLoadingDialog() {
        try {
            dialogs?.dismiss()
        } catch (e: java.lang.IllegalArgumentException) {
        } catch (e: Exception) {

        }
    }

    fun inShowing(): Boolean? {
        return dialogs?.isShowing
    }

}