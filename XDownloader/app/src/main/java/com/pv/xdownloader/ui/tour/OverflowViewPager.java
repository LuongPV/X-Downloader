package com.pv.xdownloader.ui.tour;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;

public class OverflowViewPager extends ViewPager {
    float startDragX;
    OnSwipeOutListener listener;
    private boolean isLastPageSwiped;
    private int counterPageScroll;

    public OverflowViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setListener(OnSwipeOutListener listener) {
        this.listener = listener;
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        super.onPageScrolled(position, positionOffset, positionOffsetPixels);
        int lastIndex = getAdapter().getCount() - 1;
        boolean isLastPosition = position == lastIndex;
        if (isLastPosition && positionOffset == 0 && !isLastPageSwiped) {
            if (counterPageScroll != 0) {
                isLastPageSwiped = true;
                if (listener != null) {
                    listener.onSwipeOutAtEnd();
                }
            }
            counterPageScroll++;
        } else {
            counterPageScroll = 0;
        }
    }


    public interface OnSwipeOutListener {

        public void onSwipeOutAtEnd();

    }
}
