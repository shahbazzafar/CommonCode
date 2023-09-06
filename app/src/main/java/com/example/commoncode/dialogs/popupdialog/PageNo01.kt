package com.example.commoncode.dialogs.popupdialog


//private var sScreenHeight = 0
//private var screenSize: Point? = null

//fun showViewPDFOptionWindow(context: Activity, isDrawModeOn: Boolean?, hasChanges: Boolean?, triggerView: View, popUp: PopUpViewPDFInterface,onEyeCare: (Boolean)-> Unit) {
//    val contentView: OptionViewPdfBinding = OptionViewPdfBinding.inflate((context as DocumentActivity).layoutInflater)
//    val popupWindow = PopupWindow(contentView.root, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, true)
//    popupWindow.isOutsideTouchable = true
//    popupWindow.isTouchable = true
//    popupWindow.isFocusable = true
//    popupWindow.isClippingEnabled = true
//    popupWindow.elevation = 5.0f
//
//    pref = SharedPrefUtils(context)
//
//    if (isDrawModeOn == true) {
//        contentView.tvFreeEditing.canShow(false)
//        contentView.viewFreeEditing.canShow(false)
//    }
//
//    contentView.btnDarkModeToggle.isChecked = pref.getBoolean(EyeCareOption,false)
//
//    if (context.pref.getBoolean(ConstantFunctions.isHorizontal, false)) {
//        contentView.tvDirectionPDF.text = context.getString(R.string.vertical)
//    } else {
//        contentView.tvDirectionPDF.text = context.getString(R.string.horizontal)
//    }
//    if (context.pref.getBoolean(ConstantFunctions.isNightModePDF, false)) {
//        contentView.tvNightDay.text = context.getText(R.string.dayMode)
//    } else {
//        contentView.tvNightDay.text = context.getText(R.string.night_mode)
//    }
//    if (hasChanges != null && hasChanges) {
//        contentView.tvSave.canShow(true)
//        contentView.viewSave.canShow(true)
//    }
//    contentView.btnDarkModeToggle.setOnCheckedChangeListener { _, isChecked ->
//        if (isChecked) {
//            pref.setBoolean(EyeCareOption,true)
//            onEyeCare.invoke(true)
//            popupWindow.dismiss()
//        } else {
//            pref.setBoolean(EyeCareOption,false)
//            onEyeCare.invoke(false)
//            popupWindow.dismiss()
//        }
//    }
//    contentView.tvSave.setOnOneClickListener {
//        popupWindow.dismiss()
//        popUp.save()
//    }
//    contentView.tvSharePDFs.setOnOneClickListener {
//        popupWindow.dismiss()
//        popUp.sharePDF()
//    }
//    contentView.tvPrintPDF.setOnOneClickListener(600) {
//        popupWindow.dismiss()
//        popUp.printPDF()
//    }
//    contentView.tvDirectionPDF.setOnOneClickListener {
//        popupWindow.dismiss()
//        popUp.pageSwipeDirection()
//    }
//    contentView.tvNightDay.setOnOneClickListener {
//        popupWindow.dismiss()
//        popUp.dayNightPDF()
//    }
//    contentView.tvFreeEditing.setOnOneClickListener {
//        popupWindow.dismiss()
//        popUp.editPDF()
//    }
//    contentView.tvGotoPage.setOnOneClickListener {
//        popupWindow.dismiss()
//        popUp.callGotoDialog()
//    }
//    val windowPos = calculatePopWindowPos(triggerView, contentView.root, context)
//    if (!isRtl(context)) {
//        popupWindow.showAsDropDown(triggerView, -dip2px(160f, context) + triggerView.width / 2, windowPos[1])
//    } else {
//        popupWindow.showAsDropDown(triggerView, -dip2px(25f, context) + triggerView.width / 2, windowPos[1])
//    }
//}


//02
//private fun calculatePopWindowPos(anchorView: View, contentView: View, context: Context): IntArray {
//    val windowPos = IntArray(2)
//    val anchorLoc = IntArray(2)
//    anchorView.getLocationOnScreen(anchorLoc)
//    val screenHeight = getScreenHeight(context)
//    contentView.measure(View.MeasureSpec.UNSPECIFIED, View.MeasureSpec.UNSPECIFIED)
//    val windowHeight = contentView.measuredHeight
//    val windowWidth = contentView.measuredWidth
//    val isNeedShowUp = anchorLoc[1] + windowHeight > screenHeight - 180
//    if (isNeedShowUp) {
//        windowPos[1] = anchorView.y.toInt() - windowHeight - anchorView.height - 20
//    } else {
//        windowPos[1] = -dip2px(30f, context)
//    }
//    windowPos[0] = anchorView.x.toInt() - windowWidth - windowWidth
//    return windowPos
//}


//03
//private fun isRtl(context: Context): Boolean {
//    return context.resources.configuration.layoutDirection == ViewCompat.LAYOUT_DIRECTION_RTL
//}


//04
//private fun dip2px(dipValue: Float, context: Context): Int {
//    val scale = context.resources.displayMetrics.density
//    return (dipValue * scale + 0.5f).toInt()
//}


//05
//private fun getScreenHeight(context: Context): Int {
//    if (sScreenHeight == 0) {
//        sScreenHeight = getScreenSize(context)!!.y
//    }
//    return sScreenHeight
//}


//06
//private fun getScreenSize(context: Context): Point? {
//    if (null == screenSize) {
//        val wm = context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
//        screenSize = Point()
//        val display = wm.defaultDisplay
//        display?.getRealSize(screenSize)
//    }
//    return screenSize
//}