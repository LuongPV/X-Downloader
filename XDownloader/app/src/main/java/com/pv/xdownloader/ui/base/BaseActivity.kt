package com.pv.xdownloader.ui.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.kaopiz.kprogresshud.KProgressHUD
import com.pv.xdownloader.di.component.ActivityComponent
import com.pv.xdownloader.di.component.DaggerActivityComponent
import com.pv.xdownloader.di.module.ActivityModule
import com.pv.xdownloader.ui.UIConstant
import com.pv.xdownloader.ui.XDownloaderApplication
import javax.inject.Inject

abstract class BaseActivity : AppCompatActivity() {
    @Inject
    lateinit var progressDialog: KProgressHUD

    private lateinit var activityComponent: ActivityComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initInjector()
    }

    private fun initInjector() {
        activityComponent = DaggerActivityComponent.builder()
                .activityModule(ActivityModule(this))
                .applicationComponent((application as XDownloaderApplication).getApplicationComponent())
                .build()
        activityComponent.inject(this)
    }

    fun getActivityComponent(): ActivityComponent {
        return activityComponent
    }

    fun showLoading() {
        progressDialog.show()
    }

    fun hideLoading() {
        progressDialog.dismiss()
    }

    fun showMessage(message: String) {
        Toast.makeText(this, message, UIConstant.TOAST_LENGTH).show()
    }

}