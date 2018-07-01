package com.pv.xdownloader.ui

import android.app.Application
import com.pv.xdownloader.data.DataConstant
import com.pv.xdownloader.di.component.ApplicationComponent
import com.pv.xdownloader.di.component.DaggerApplicationComponent
import com.pv.xdownloader.di.module.ApplicationModule
import com.pv.xdownloader.di.module.NetModule

class XDownloaderApplication : Application() {
    private lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        initializeInjector()
    }

    private fun initializeInjector() {
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .netModule(NetModule(DataConstant.BASE_SERVER_URL))
                .build()
    }

    fun getApplicationComponent(): ApplicationComponent {
        return applicationComponent
    }

}