package com.example.commoncode.viewpager

import android.content.Context
import android.util.Log
import android.view.MotionEvent
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

//https://github.com/dipanshukr/Viewpager-Transformation

//https://developer.android.com/develop/ui/views/animations/screen-slide-2

//for viewpager indication
//implementation 'com.tbuonomo:dotsindicator:4.3'

//https://github.com/AkbaraliKhasanov/Image-Slider

//https://medium.com/busoft/how-to-use-viewpager2-with-tablayout-in-android-eaf5b810ef7c

//https://dharmeshbasapati.medium.com/working-with-viewpager2-23424111aec1

/**
 * Scrolling Issue With Multiple Viewpager
 * */

//fun isParentViewpagerScrollable(isEnable: Boolean = true) {
//    binding.viewPager.isUserInputEnabled = isEnable
//}

//root.setOnTouchListener { _, event ->
//    // Handle touch events here
//    when (event.action) {
//        MotionEvent.ACTION_DOWN -> {
//            onScrollable.invoke(false)
//            true
//        }
//        MotionEvent.ACTION_MOVE->{
//            onScrollable.invoke(false)
//            true
//        }
//        MotionEvent.ACTION_UP -> {
//            onScrollable.invoke(true)
//            true
//        }
//    }
//    false
//}

//Adapter Callback

//if (it) {
//    HomeFragment.getInstance().isParentViewpagerScrollable(true)
//} else {
//    HomeFragment.getInstance().isParentViewpagerScrollable(false)
//}


/*private fun setUpViewPager2() {
    activity?.let {
        val howToUseTitles = arrayOf(
            it.getString(R.string.clap_to_find),
            it.getString(R.string.whistle_to_find)
        )

        val viewPager = binding.viewPager
        val tabLayout = binding.tabLayout

        if (adapter == null) {
            adapter = HowToUseViewPagerAdapter(it.supportFragmentManager, lifecycle)
        }

        viewPager.isSaveEnabled = false
        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = howToUseTitles[position]
        }.attach()

        // Function to customize the each tab margins
        customizeTabMargins(
            tabLayout = tabLayout
        )

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {

            }

            override fun onTabUnselected(tab: TabLayout.Tab) {

            }

            override fun onTabReselected(tab: TabLayout.Tab) {

            }
        })
    }
}*/

private fun customizeTabMargins(
    tabLayout: TabLayout,
    firstTabLeftMarginInDp: Int = 10, // 10dp left margin for first tab
    firstTabRightMarginInDp: Int = 5, // 5dp right margin for first tab
    secondTabLeftMarginInDp: Int = 5, // 5dp left margin for second tab
    secondTabRightMarginInDp: Int = 10 // 10dp right margin for second tab
) {
    for (i in 0 until tabLayout.tabCount) {
        Log.d("TabCustomization", "Customizing Tab: $i")

        // Get the individual tab view (assuming the first child of the TabLayout is a ViewGroup)
        val tab = (tabLayout.getChildAt(0) as? ViewGroup)?.getChildAt(i)
        if (tab != null) {
            // Get current layout parameters
            val layoutParams = tab.layoutParams as ViewGroup.MarginLayoutParams

            // Apply different margins for the first tab vs. others
            if (i == 0) {
                // First tab margins
                layoutParams.setMargins(
                    convertDpToPx(tabLayout.context, firstTabLeftMarginInDp),
                    0,
                    convertDpToPx(tabLayout.context, firstTabRightMarginInDp),
                    0
                )
            } else {
                // Other tabs' margins
                layoutParams.setMargins(
                    convertDpToPx(tabLayout.context, secondTabLeftMarginInDp),
                    0,
                    convertDpToPx(tabLayout.context, secondTabRightMarginInDp),
                    0
                )
            }

            // Apply changes
            tab.requestLayout()
        }
    }
}

// Helper function to convert DP to PX
private fun convertDpToPx(context: Context, dp: Int): Int {
    return (dp * context.resources.displayMetrics.density).toInt()
}