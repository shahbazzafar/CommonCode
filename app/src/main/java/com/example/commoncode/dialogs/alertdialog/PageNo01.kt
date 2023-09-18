package com.example.commoncode.dialogs.alertdialog

import android.content.Context
import androidx.appcompat.app.AlertDialog
//
//fun showRenameDialog(context: Context) {
//    val view: DialogSetAsDeafultBinding = DialogSetAsDeafultBinding.inflate(layoutInflater)
//    val builder: AlertDialog.Builder = AlertDialog.Builder(context, R.style.CustomAlertDialog).setView(view.root)
//    val dialog: AlertDialog = builder.create()
//
//    view.tvCancel.setOnOneClickListener {
//        context.let { fragmentActivity->
//            if (fragmentActivity is MainActivity){
//                fragmentActivity.postAnalytic("rename_dialog_closed")
//            }
//        }
//        dialog.dismiss()
//    }
//
//    view.tvRename.setOnOneClickListener {
//        context.let { fragmentActivity->
//            if (fragmentActivity is MainActivity){
//                fragmentActivity.postAnalytic("rename_done")
//            }
//        }
//    }
//    dialog.show()
//}