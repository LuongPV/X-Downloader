package com.pv.xdownloader.ui.splash

import com.pv.xdownloader.data.preference.Preference
import com.pv.xdownloader.ui.UIConstant
import com.pv.xdownloader.ui.base.MVPPresenterImpl
import io.reactivex.Completable
import java.util.concurrent.TimeUnit

class SplashPresenterImpl(private val preference: Preference) : MVPPresenterImpl<SplashContract.SplashView>(), SplashContract.SplashPresenter<SplashContract.SplashView> {

    override fun runLoading() {
        Completable.create { emitter -> emitter.onComplete() }.delay(UIConstant.SPLASH_LOADING_TIME, TimeUnit.MILLISECONDS)
                .subscribe {
                    if (preference.isGuideCompleted()) {
                        getMVPView().moveToHomeScreen()
                    } else {
                        getMVPView().moveToGuideScreen()
                    }
                }
    }

}