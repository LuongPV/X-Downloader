package com.pv.xdownloader.ui.tour;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.layer_net.stepindicator.StepIndicator;
import com.pv.xdownloader.R;
import com.pv.xdownloader.ui.home.HomeActivity;

public class GuideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        //Set the pager with an adapter
        OverflowViewPager pager = (OverflowViewPager) findViewById(R.id.vp_guide);
        pager.setListener(new OverflowViewPager.OnSwipeOutListener() {
            @Override
            public void onSwipeOutAtEnd() {
                startActivity(new Intent(GuideActivity.this, HomeActivity.class));
                finish();
            }
        });
        pager.setAdapter(new GuideAdapter(this,  GuideProvider.getGuide()));

        //Bind the step indicator to the adapter
        StepIndicator stepIndicator = (StepIndicator) findViewById(R.id.si_step_indicator);
        stepIndicator.setupWithViewPager(pager);
    }
}
