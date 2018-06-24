package com.pv.xdownloader.ui.tour

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

import com.layer_net.stepindicator.StepIndicator
import com.pv.xdownloader.R
import com.pv.xdownloader.ui.home.HomeActivity

class GuideActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guide)

        //Set the pager with an adapter
        val pager = findViewById<OverflowViewPager>(R.id.vp_guide)
        pager.setListener(object: OverflowViewPager.OnSwipeOutListener {
            override fun onSwipeOutAtEnd() {
                startActivity(Intent(this@GuideActivity, HomeActivity::class.java))
                finish()
            }
        })
        pager.adapter = GuideAdapter(this, GuideProvider.guide)

        //Bind the step indicator to the adapter
        val stepIndicator = findViewById<View>(R.id.si_step_indicator) as StepIndicator
        stepIndicator.setupWithViewPager(pager)
    }
}
