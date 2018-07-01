package com.pv.xdownloader.di.module

import android.content.Context
import com.pv.xdownloader.data.database.Database
import com.pv.xdownloader.data.database.DefaultDatabase
import com.pv.xdownloader.data.network.ApiClient
import com.pv.xdownloader.data.network.DefaultApiClient
import com.pv.xdownloader.data.preference.DefaultPreference
import com.pv.xdownloader.data.preference.Preference
import com.pv.xdownloader.data.storage.DefaultStorageHelper
import com.pv.xdownloader.data.storage.StorageHelper
import com.pv.xdownloader.di.qualifier.ApplicationContext
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule(private val context: Context) {

    @Provides
    @ApplicationContext
    fun provideApplicationContext(): Context {
        return context
    }

    @Provides
    @Singleton
    fun providePreference(@ApplicationContext context: Context): Preference {
        return DefaultPreference(context)
    }

    @Provides
    @Singleton
    fun provideDatabase(database: DefaultDatabase): Database {
        return database
    }

    @Provides
    @Singleton
    fun provideApiClient(apiClient: DefaultApiClient): ApiClient {
        return apiClient
    }

    @Provides
    @Singleton
    fun provideStorageHelper(): StorageHelper {
        return DefaultStorageHelper()
    }

}