package com.pv.xdownloader.ui.commonview

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView

import com.pv.xdownloader.R

class BottomBarItemView(context: Context, attrs: AttributeSet) : View(context, attrs) {
    private var tvNumberOfDownload: TextView? = null
    private var tvDownloadStatus: TextView? = null
    private var ivIndicator: ImageView? = null

    init {
        initView(context)
    }

    @SuppressLint("InflateParams")
    private fun initView(context: Context) {
        val layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val rootView = layoutInflater.inflate(R.layout.layout_bottom_item, null)
        tvNumberOfDownload = rootView.findViewById<View>(R.id.tv_number_of_download) as TextView
        tvDownloadStatus = rootView.findViewById<View>(R.id.tv_download_status) as TextView
        ivIndicator = rootView.findViewById<View>(R.id.iv_indicator) as ImageView
    }


}
