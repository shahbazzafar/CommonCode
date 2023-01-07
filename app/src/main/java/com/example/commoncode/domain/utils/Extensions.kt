package com.example.commoncode.domain.utils

import android.app.Activity
import android.os.SystemClock
import android.view.View
import androidx.appcompat.widget.TooltipCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.iterator
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

object Extensions {
    fun View.setOnOneClickListener(debounceTime: Long = 600L, action: () -> Unit) {
        this.setOnClickListener(object : View.OnClickListener {
            private var lastClickTime: Long = 0

            override fun onClick(v: View) {
                if (SystemClock.elapsedRealtime() - lastClickTime < debounceTime) return
                else action()

                lastClickTime = SystemClock.elapsedRealtime()
            }
        })
    }

//    fun BottomNavigationView.disableTooltipText() {
//        val menuIterator = menu.iterator()
//        while(menuIterator.hasNext()) {
//            val menu = menuIterator.next()
//            findViewById<View>(menu.itemId)?.let { view ->
//                TooltipCompat.setTooltipText(view, null)
//            }
//        }
//    }
}