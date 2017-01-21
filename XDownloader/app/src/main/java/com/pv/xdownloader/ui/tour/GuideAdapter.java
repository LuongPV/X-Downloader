package com.pv.xdownloader.ui.tour;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.pv.xdownloader.R;

class GuideAdapter extends PagerAdapter {
    private Context mContext;
    private Guide[] guides;

    GuideAdapter(Context mContext, Guide[] guides) {
        this.mContext = mContext;
        this.guides = guides;
    }

    @Override
    public Object instantiateItem(ViewGroup collection, int position) {
        Guide guide = guides[position];
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View rootView = inflater.inflate(R.layout.layout_guide_item, collection, false);
        rootView = bindData(guide, rootView);
        collection.addView(rootView);
        return rootView;
    }

    private View bindData(Guide guide, View rootView) {
        ImageView ivIcon = (ImageView) rootView.findViewById(R.id.iv_icon);
        TextView tvTitle = (TextView) rootView.findViewById(R.id.tv_title);
        TextView tvDescription = (TextView) rootView.findViewById(R.id.tv_description);
        ivIcon.setImageResource(guide.getResImage());
        tvTitle.setText(guide.getResTitle());
        tvDescription.setText(guide.getResDescription());
        return rootView;
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        collection.removeView((View) view);
    }

    @Override
    public int getCount() {
        return guides.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

}