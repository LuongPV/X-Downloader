package com.pv.xdownloader.ui.splash

import android.os.Handler
import com.pv.xdownloader.data.DataConstant
import com.pv.xdownloader.data.preference.Preference
import com.pv.xdownloader.ui.UIConstant
import com.pv.xdownloader.ui.base.MVPPresenterImpl

class SplashPresenterImpl(private val handler: Handler, private val preference: Preference) : MVPPresenterImpl<SplashContract.SplashView>(), SplashContract.SplashPresenter {

    override fun runLoading() {
        handler.postDelayed({
            if (preference.getNativePref().getBoolean(DataConstant.PREF_GUIDE_COMPLETE, false)) {
                getMVPView().moveToHomeScreen()
            } else {
                getMVPView().moveToGuideScreen()
            }
        }, UIConstant.SPLASH_LOADING_TIME)
    }

}