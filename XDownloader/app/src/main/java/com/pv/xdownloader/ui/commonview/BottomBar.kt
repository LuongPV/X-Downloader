package com.pv.xdownloader.ui.commonview

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View

import com.pv.xdownloader.R

class BottomBar(context: Context, attrs: AttributeSet) : View(context, attrs) {

    init {
        initView(context)
    }

    @SuppressLint("InflateParams")
    private fun initView(context: Context) {
        val layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val rootView = layoutInflater.inflate(R.layout.layout_bottom_bar, null)

    }


}
