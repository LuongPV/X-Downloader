package com.pv.xdownloader.ui.commonview

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.SeekBar
import com.pv.xdownloader.R
import kotlinx.android.synthetic.main.view_value_slider.view.*

class ValueSliderView : LinearLayout {
    private var max: Int = 0

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        initView(attrs)
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        initView(attrs)
    }

    private fun initView(attrs: AttributeSet?) {
        LayoutInflater.from(context).inflate(R.layout.view_value_slider, this)
        val typedArray = context.theme.obtainStyledAttributes(attrs, R.styleable.ValueSliderView, 0, 0)
        val name = typedArray.getString(R.styleable.ValueSliderView_slider_name)
        max = typedArray.getInt(R.styleable.ValueSliderView_slider_number, -1)
        tv_name.text = name
        sb_slider.max = max
        tv_value.text = (sb_slider.progress + 1).toString()
        typedArray.recycle()
        sb_slider.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {

            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                tv_value.text = (progress + 1).toString()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
            }

        })
    }

}