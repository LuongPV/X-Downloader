package com.pv.xdownloader.di.component

import com.pv.xdownloader.data.preference.Preference
import com.pv.xdownloader.di.module.ApplicationModule
import com.pv.xdownloader.di.module.NetModule
import com.pv.xdownloader.ui.XDownloaderApplication
import dagger.Component
import javax.inject.Singleton

@Component(modules = arrayOf(ApplicationModule::class, NetModule::class))
@Singleton
interface ApplicationComponent {

    fun inject(xDownloaderApplication: XDownloaderApplication)

    fun providePreference(): Preference



}