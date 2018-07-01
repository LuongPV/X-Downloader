package com.pv.xdownloader.di.module

import android.content.Context
import com.kaopiz.kprogresshud.KProgressHUD
import com.pv.xdownloader.data.preference.Preference
import com.pv.xdownloader.di.qualifier.ActivityContext
import com.pv.xdownloader.di.scope.ActivityScope
import com.pv.xdownloader.ui.UIConstant
import com.pv.xdownloader.ui.guide.GuideContract
import com.pv.xdownloader.ui.guide.GuidePresenterImpl
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
    @ActivityScope
    fun provideSplashPresenter(preference: Preference): SplashContract.SplashPresenter<SplashContract.SplashView> {
        return SplashPresenterImpl(preference)
    }

    @Provides
    fun provideGuidePresenter(preference: Preference): GuideContract.GuidePresenter<GuideContract.GuideView> {
        return GuidePresenterImpl(preference)
    }

}