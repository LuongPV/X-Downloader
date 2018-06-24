package com.pv.xdownloader.ui.splash

import android.content.Intent
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.pv.xdownloader.R
import com.pv.xdownloader.ui.tour.GuideActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val handler = Handler()
        handler.postDelayed({
            startActivity(Intent(this@SplashActivity, GuideActivity::class.java))
            finish()
        }, 3000)
    }
}
