package com.pv.xdownloader.di.module

import android.content.Context
import com.google.gson.GsonBuilder
import com.pv.xdownloader.data.DataConstant
import dagger.Module
import dagger.Provides
import okhttp3.Cache
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
class NetModule(private val baseUrl: String) {

    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
                .baseUrl(baseUrl)
                .client(okHttpClient)
                .build()
    }

    @Provides
    fun provideOkHttpClient(cache: Cache, interceptor: Interceptor): OkHttpClient {
        val client = OkHttpClient.Builder()
        client.addInterceptor(interceptor)
        client.cache(cache)
        return client.build()
    }

    @Provides
    fun provideCache(context: Context): Cache {
        return Cache(context.cacheDir, DataConstant.CACHE_SIZE.toLong())
    }

    @Provides
    fun provideInterceptor(): Interceptor {
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        return loggingInterceptor
    }
}