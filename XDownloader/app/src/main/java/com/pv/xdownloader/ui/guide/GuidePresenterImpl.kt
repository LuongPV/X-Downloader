package com.pv.xdownloader.ui.guide

import com.pv.xdownloader.data.preference.Preference
import com.pv.xdownloader.ui.base.MVPPresenterImpl

class GuidePresenterImpl(private val preference: Preference) : MVPPresenterImpl<GuideContract.GuideView>(), GuideContract.GuidePresenter<GuideContract.GuideView> {

    override fun onGuideCompleted() {
        preference.setGuideComplete(true)
        getMVPView().moveToHome()
    }

}