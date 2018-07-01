package com.pv.xdownloader.ui.guide

import com.pv.xdownloader.ui.base.MVPPresenter
import com.pv.xdownloader.ui.base.MVPView

interface GuideContract {
    interface GuideView : MVPView {

        fun moveToHome()

    }

    interface GuidePresenter<V : MVPView> : MVPPresenter<V> {

        fun onGuideCompleted()

    }


}