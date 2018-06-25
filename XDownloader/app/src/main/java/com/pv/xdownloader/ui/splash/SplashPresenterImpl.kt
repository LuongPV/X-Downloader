package com.pv.xdownloader.ui.splash

import android.os.Handler
import com.pv.xdownloader.ui.UIConstant

class SplashPresenterImpl(private val handler: Handler) : SplashContract.SplashPresenter {

    override fun runLoading() {
        handler.postDelayed({
            // TODO Use MVP to change screen
        }, UIConstant.SPLASH_LOADING_TIME)
    }

}