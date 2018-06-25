package com.pv.xdownloader.ui.splash

interface SplashContract {

    interface SplashView {

        fun moveToGuideScreen()

        fun moveToHomeScreen()

    }

    interface SplashPresenter {

        fun runLoading()

    }

}
