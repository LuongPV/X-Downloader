package com.pv.xdownloader.ui.guide

import android.content.Intent
import android.os.Bundle
import com.pv.xdownloader.R
import com.pv.xdownloader.ui.base.BaseActivity
import com.pv.xdownloader.ui.home.HomeActivity
import kotlinx.android.synthetic.main.activity_guide.*
import javax.inject.Inject

class GuideActivity : BaseActivity(), GuideContract.GuideView {
    @Inject
    lateinit var guidePresenter: GuideContract.GuidePresenter<GuideContract.GuideView>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guide)
        getActivityComponent().inject(this)
        guidePresenter.injectView(this)

        //Set the pager with an adapter
        vp_guide.adapter = GuideAdapter(this, GuideProvider.guide)

        //Bind the step indicator to the adapter
        si_step_indicator.setupWithViewPager(vp_guide)

        vp_guide.setListener(object : OverflowViewPager.OnSwipeOutListener {

            override fun onSwipeOutAtEnd() {
                guidePresenter.onGuideCompleted()
            }
        })
    }

    override fun moveToHome() {
        startActivity(Intent(this@GuideActivity, HomeActivity::class.java))
        finish()
    }

}
