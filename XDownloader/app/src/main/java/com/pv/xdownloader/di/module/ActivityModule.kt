package com.pv.xdownloader.di.module

import android.content.Context
import android.os.Handler
import com.kaopiz.kprogresshud.KProgressHUD
import com.pv.xdownloader.data.preference.DefaultPreference
import com.pv.xdownloader.di.qualifier.ActivityContext
import com.pv.xdownloader.ui.UIConstant
import com.pv.xdownloader.ui.splash.SplashContract
import com.pv.xdownloader.ui.splash.SplashPresenterImpl
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private val activityContext: Context) {

    @Provides
    @ActivityContext
    fun provideActivityContext(): Context {
        return activityContext
    }

    @Provides
    fun provideProgressDialog(@ActivityContext context: Context): KProgressHUD {
        return KProgressHUD.create(context)
                .setStyle(KProgressHUD.Style.SPIN_INDETERMINATE)
                .setCancellable(UIConstant.LOADING_CANCELLABLE)
                .setAnimationSpeed(UIConstant.LOADING_ANIMATION_SPEED)
                .setDimAmount(UIConstant.LOADING_DIM_AMOUNT)
    }

    @Provides
    fun provideHandler(): Handler {
        return Handler()
    }

    @Provides
    fun provideSplashPresenter(handler: Handler, @ActivityContext context: Context): SplashContract.SplashPresenter {
        return SplashPresenterImpl(handler, DefaultPreference(context))
    }

}