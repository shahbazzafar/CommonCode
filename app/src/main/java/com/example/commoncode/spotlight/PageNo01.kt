package com.example.commoncode.spotlight

//https://github.com/TakuSemba/Spotlight

////Spotlight
//implementation 'com.github.takusemba:spotlight:1.3.3'

//fun showSpotlight(spotlightContainer: FrameLayout, spotlightView: ImageView, from: Int) {
//
//    if (((from == 1 && showRecoverSpotlight) || (from == 3 && showCleanSpotlight)) && SharedPrefManager.getShowSpotlightAgain(
//            this
//        )
//    ) {
//
//        if (spotlightContainer.visibility == View.GONE) {
//
//            spotlightContainer.setOnClickListener {}
//
//            val height = spotlightView.height
//            val width = spotlightView.width
//            val posXY = IntArray(2)
//            spotlightView.getLocationOnScreen(posXY)
//            val x = posXY[0]
//            val y = posXY[1]
//            val targets = ArrayList<SpotlightTarget>()
//            val firstRoot = FrameLayout(this)
//            val first = layoutInflater.inflate(R.layout.spotlight_target, firstRoot)
//            val firstTarget = SpotlightTarget.Builder()
//                .setAnchor((x.toFloat() + (width / 2)), (y.toFloat() + (height / 2)))
//                .setShape(Circle(width.toFloat() / 2))
//                .setEffect(RippleEffect(100f, 200f, Color.argb(30, 0, 139, 148)))
//                .setOverlay(first).setOnTargetListener(object : OnTargetListener {
//                    override fun onStarted() {}
//                    override fun onEnded() {}
//                }).build()
//
//            targets.add(firstTarget)
//
//            val spotlight = Spotlight.Builder(this).setTargets(targets)
//                .setBackgroundColorRes(R.color.spotlight_background).setDuration(1000L)
//                .setAnimation(DecelerateInterpolator(2f))
//                .setOnSpotlightListener(object : OnSpotlightListener {
//                    override fun onStarted() {}
//                    override fun onEnded() {}
//                }).build()
//
//            spotlightContainer.show()
//
//            spotLight = spotlight
//            spotLight?.let {
//                spotlight.start()
//            }
//
//            when (from) {
//                1 -> {
//                    showRecoverSpotlight = false
//                    first.findViewById<TextView>(R.id.button_text).text =
//                        getString(R.string.recover)
//                    first.findViewById<TextView>(R.id.detailsText).text =
//                        getString(R.string.touch_and_hold_to_select_multiple_images_then_tap_recover_button_to_save_them)
//                }
//
//                3 -> {
//                    showCleanSpotlight = false
//                    "${getString(R.string.delete)} ".also {
//                        first.findViewById<TextView>(R.id.button_text).text = it
//                    }
//                    first.findViewById<TextView>(R.id.detailsText).text =
//                        getString(R.string.touch_and_hold_to_select_multiple_images_then_tap_delete_button_to_permanently_delete_them)
//                }
//            }
//
//            first.findViewById<MaterialButton>(R.id.got_it_btn).setOnClickListener {
//                spotlightContainer.hide()
//                spotLight?.finish()
//            }
//
//            first.findViewById<TextView>(R.id.dont_show_btn).setOnClickListener {
//                spotlightContainer.hide()
//                SharedPrefManager.setShowSpotlightAgain(this, false)
//                spotLight?.finish()
//            }
//        }
//    }
//}
//
//fun endSpotlight(spotlightContainer: FrameLayout) {
//    spotLight?.finish()
//    spotlightContainer.hide()
//}

/**
 * In XML
 * */

//<FrameLayout
//android:id="@+id/spotlight_container"
//android:layout_width="0dp"
//android:layout_height="0dp"
//android:elevation="0dp"
//android:visibility="gone"
//app:layout_constraintBottom_toBottomOf="parent"
//app:layout_constraintEnd_toEndOf="parent"
//app:layout_constraintStart_toStartOf="parent"
//app:layout_constraintTop_toTopOf="parent" />