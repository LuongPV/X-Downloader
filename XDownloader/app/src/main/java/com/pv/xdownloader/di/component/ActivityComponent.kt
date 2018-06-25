package com.pv.xdownloader.di.component

import com.pv.xdownloader.di.module.ActivityModule
import com.pv.xdownloader.ui.base.BaseActivity
import com.pv.xdownloader.ui.splash.SplashActivity
import dagger.Component
import javax.inject.Singleton

@Component(modules = arrayOf(ActivityModule::class))
@Singleton
interface ActivityComponent {

    fun inject(baseActivity: BaseActivity)

    fun inject(splashActivity: SplashActivity)

}