package com.pv.xdownloader.ui.commonview

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.pv.xdownloader.R
import kotlinx.android.synthetic.main.view_bottom_menu_item.view.*

class BottomMenuItemView : LinearLayout {
    private var number: Int = 0

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        initView(attrs)
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        initView(attrs)
    }

    private fun initView(attrs: AttributeSet?) {
        LayoutInflater.from(context).inflate(R.layout.view_bottom_menu_item, this)
        val typedArray = context.theme.obtainStyledAttributes(attrs, R.styleable.BottomMenuItemView, 0, 0)
        val name = typedArray.getString(R.styleable.BottomMenuItemView_bottom_menu_name)
        number = typedArray.getInt(R.styleable.BottomMenuItemView_bottom_menu_number, -1)
        tv_name.text = name
        tv_number.text = number.toString()
        typedArray.recycle()
    }

}