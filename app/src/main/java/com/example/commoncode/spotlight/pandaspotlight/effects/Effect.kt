package com.example.commoncode.spotlight.pandaspotlight.effects

import android.animation.TimeInterpolator
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.PointF


interface Effect {
    val duration: Long
    val interpolator: TimeInterpolator
    val repeatMode: Int
    fun draw(canvas: Canvas, point: PointF, value: Float, paint: Paint)
}