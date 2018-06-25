package com.pv.xdownloader.di.component

import com.pv.xdownloader.di.module.ActivityModule
import com.pv.xdownloader.ui.base.BaseActivity
import dagger.Component

@Component(modules = arrayOf(ActivityModule::class))
interface ActivityComponent {

    fun inject(baseActivity: BaseActivity)

}