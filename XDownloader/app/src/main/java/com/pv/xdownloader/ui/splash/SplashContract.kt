package com.pv.xdownloader.ui.splash

import com.pv.xdownloader.ui.base.MVPPresenter
import com.pv.xdownloader.ui.base.MVPView

interface SplashContract {

    interface SplashView : MVPView {

        fun moveToGuideScreen()

        fun moveToHomeScreen()

    }

    interface SplashPresenter<V : SplashContract.SplashView> : MVPPresenter<V> {

        fun runLoading()

    }

}
