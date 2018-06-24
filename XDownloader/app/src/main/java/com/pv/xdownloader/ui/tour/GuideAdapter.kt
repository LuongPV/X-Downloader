package com.pv.xdownloader.ui.tour

import android.content.Context
import android.support.v4.view.PagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import com.pv.xdownloader.R

class GuideAdapter(private val mContext: Context, private val guides: Array<Guide>) : PagerAdapter() {

    override fun instantiateItem(collection: ViewGroup, position: Int): Any {
        val guide = guides[position]
        val inflater = LayoutInflater.from(mContext)
        var rootView = inflater.inflate(R.layout.layout_guide_item, collection, false)
        rootView = bindData(guide, rootView)
        collection.addView(rootView)
        return rootView
    }

    private fun bindData(guide: Guide, rootView: View): View {
        val ivIcon = rootView.findViewById<View>(R.id.iv_icon) as ImageView
        val tvTitle = rootView.findViewById<View>(R.id.tv_title) as TextView
        val tvDescription = rootView.findViewById<View>(R.id.tv_description) as TextView
        ivIcon.setImageResource(guide.resImage)
        tvTitle.setText(guide.resTitle)
        tvDescription.setText(guide.resDescription)
        return rootView
    }

    override fun destroyItem(collection: ViewGroup, position: Int, view: Any) {
        collection.removeView(view as View)
    }

    override fun getCount(): Int {
        return guides.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }

}