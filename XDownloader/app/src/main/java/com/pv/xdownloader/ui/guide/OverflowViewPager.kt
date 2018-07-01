package com.pv.xdownloader.ui.guide

import android.content.Context
import android.support.v4.view.ViewPager
import android.util.AttributeSet

class OverflowViewPager(context: Context, attrs: AttributeSet) : ViewPager(context, attrs) {
    internal var startDragX: Float = 0.toFloat()
    internal var listener: OnSwipeOutListener? = null
    private var isLastPageSwiped: Boolean = false
    private var counterPageScroll: Int = 0

    fun setListener(listener: OnSwipeOutListener) {
        this.listener = listener
    }

    public override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
        super.onPageScrolled(position, positionOffset, positionOffsetPixels)
        val lastIndex = adapter.count - 1
        val isLastPosition = position == lastIndex
        if (isLastPosition && positionOffset == 0f && !isLastPageSwiped) {
            if (counterPageScroll != 0) {
                isLastPageSwiped = true
                if (listener != null) {
                    listener!!.onSwipeOutAtEnd()
                }
            }
            counterPageScroll++
        } else {
            counterPageScroll = 0
        }
    }


    interface OnSwipeOutListener {

        fun onSwipeOutAtEnd()

    }
}
