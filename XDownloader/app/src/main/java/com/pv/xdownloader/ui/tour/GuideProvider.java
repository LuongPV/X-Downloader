package com.pv.xdownloader.ui.tour;

import com.pv.xdownloader.R;

public class GuideProvider {

    private GuideProvider() {

    }

    public static Guide[] getGuide() {
        return new Guide[] {
                new Guide(R.mipmap.ic_guide_1, R.string.text_title_guide1, R.string.text_description_guide1),
                new Guide(R.mipmap.ic_guide_2, R.string.text_title_guide2, R.string.text_description_guide2),
                new Guide(R.mipmap.ic_guide_3, R.string.text_title_guide3, R.string.text_description_guide3),
                new Guide(R.mipmap.ic_guide_4, R.string.text_title_guide4, R.string.text_description_guide4)
        };
    }

}
