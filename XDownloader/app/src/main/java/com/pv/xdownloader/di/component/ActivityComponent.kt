package com.pv.xdownloader.di.component

import com.pv.xdownloader.di.module.ActivityModule
import com.pv.xdownloader.di.scope.ActivityScope
import com.pv.xdownloader.ui.base.BaseActivity
import com.pv.xdownloader.ui.guide.GuideActivity
import com.pv.xdownloader.ui.home.HomeActivity
import com.pv.xdownloader.ui.splash.SplashActivity
import dagger.Component

@Component(dependencies = arrayOf(ApplicationComponent::class), modules = arrayOf(ActivityModule::class))
@ActivityScope
interface ActivityComponent {

    fun inject(baseActivity: BaseActivity)

    fun inject(splashActivity: SplashActivity)

    fun inject(guideActivity: GuideActivity)

    fun inject(homeActivity: HomeActivity)

}