package com.pv.xdownloader.ui.commonview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.pv.xdownloader.R;

public class BottomBarItemView extends View {
    private TextView tvNumberOfDownload;
    private TextView tvDownloadStatus;
    private ImageView ivIndicator;

    public BottomBarItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    @SuppressLint("InflateParams")
    private void initView(Context context) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rootView = layoutInflater.inflate(R.layout.layout_bottom_item, null);
        tvNumberOfDownload = (TextView) rootView.findViewById(R.id.tv_number_of_download);
        tvDownloadStatus = (TextView) rootView.findViewById(R.id.tv_download_status);
        ivIndicator = (ImageView) rootView.findViewById(R.id.iv_indicator);
    }


}
