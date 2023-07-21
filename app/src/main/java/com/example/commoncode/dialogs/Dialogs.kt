package com.example.commoncode.dialogs

//import android.app.Dialog
//import android.graphics.Color
//import android.graphics.drawable.ColorDrawable
//import android.view.Gravity
//import android.view.WindowManager
//
//private fun showPopUpSetStartTime() {
//    val bind = SetStartOrEndTimeDialogBinding.inflate(layoutInflater)
//    val dialog = context?.let { Dialog(it) }
//    dialog?.setContentView(bind.root)
//    dialog?.setCancelable(true)
//    dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
//    dialog?.window?.setLayout(
//        WindowManager.LayoutParams.MATCH_PARENT,
//        WindowManager.LayoutParams.WRAP_CONTENT
//    )
//
//    //For Bottom Dialog
//    val lp = WindowManager.LayoutParams()
//    lp.copyFrom(exitDialog.window?.attributes)
//    lp.width = WindowManager.LayoutParams.MATCH_PARENT
//    lp.height = WindowManager.LayoutParams.WRAP_CONTENT
//    lp.gravity = Gravity.BOTTOM
//    exitDialog.window?.attributes = lp
//    exitDialog.setCancelable(true)
//    exitDialog.show()
//}