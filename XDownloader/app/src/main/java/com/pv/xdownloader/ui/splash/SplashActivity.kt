package com.pv.xdownloader.ui.splash

import android.content.Intent
import android.os.Bundle
import com.pv.xdownloader.R
import com.pv.xdownloader.ui.base.BaseActivity
import com.pv.xdownloader.ui.home.HomeActivity
import com.pv.xdownloader.ui.tour.GuideActivity
import javax.inject.Inject

class SplashActivity : BaseActivity(), SplashContract.SplashView {
    @Inject
    lateinit var splashPresenter: SplashContract.SplashPresenter

    override fun moveToGuideScreen() {
        startActivity(Intent(this, GuideActivity::class.java))
        finish()
    }

    override fun moveToHomeScreen() {
        startActivity(Intent(this, HomeActivity::class.java))
        finish()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        getActivityComponent().inject(this)
        splashPresenter.injectView(this)
        splashPresenter.runLoading()
    }
}
