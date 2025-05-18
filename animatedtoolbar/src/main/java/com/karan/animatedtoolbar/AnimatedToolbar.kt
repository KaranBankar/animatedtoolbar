package com.karan.animatedtoolbar

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.Toolbar
import android.view.animation.AnimationUtils
import com.karan.animatedtoolbar.R

class AnimatedToolbar @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) : Toolbar(context, attrs) {

    init {
        val animation = AnimationUtils.loadAnimation(context, R.anim.slide_down)
        this.startAnimation(animation)
    }
}
