package com.example.commoncode.spotlight.pandaspotlight


import android.graphics.PointF
import android.view.View
import com.example.commoncode.spotlight.pandaspotlight.effects.Effect
import com.example.commoncode.spotlight.pandaspotlight.effects.EmptyEffect
import com.example.commoncode.spotlight.pandaspotlight.shapes.Circle
import com.example.commoncode.spotlight.pandaspotlight.shapes.Shape

class SpotlightTarget(
    val anchor: PointF,
    val shape: Shape,
    val effect: Effect,
    val overlay: View?,
    val listener: OnTargetListener?
) {

    class Builder {

        private var anchor: PointF = DEFAULT_ANCHOR
        private var shape: Shape = DEFAULT_SHAPE
        private var effect: Effect = DEFAULT_EFFECT
        private var overlay: View? = null
        private var listener: OnTargetListener? = null

        fun setAnchor(view: View): Builder = apply {
            val location = IntArray(2)
            view.getLocationInWindow(location)
            val x = location[0] + view.width / 2f
            val y = location[1] + view.height / 2f
            setAnchor(x, y)
        }

        fun setAnchor(x: Float, y: Float): Builder = apply {
            setAnchor(PointF(x, y))
        }

        fun setAnchor(anchor: PointF): Builder = apply {
            this.anchor = anchor
        }

        fun setShape(shape: Shape): Builder = apply {
            this.shape = shape
        }

        fun setEffect(effect: Effect): Builder = apply {
            this.effect = effect
        }

        fun setOverlay(overlay: View): Builder = apply {
            this.overlay = overlay
        }

        fun setOnTargetListener(listener: OnTargetListener): Builder = apply {
            this.listener = listener
        }

        fun build() = SpotlightTarget(
            anchor = anchor,
            shape = shape,
            effect = effect,
            overlay = overlay,
            listener = listener
        )

        companion object {
            private val DEFAULT_ANCHOR = PointF(0f, 0f)
            private val DEFAULT_SHAPE = Circle(100f)
            private val DEFAULT_EFFECT = EmptyEffect()
        }
    }
}