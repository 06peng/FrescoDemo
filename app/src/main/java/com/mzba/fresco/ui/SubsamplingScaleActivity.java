package com.mzba.fresco.ui;

import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.mzba.fresco.R;

/**
 * Created by 06peng on 2015/6/25.
 */
public class SubsamplingScaleActivity extends AppCompatActivity {

    private SubsamplingScaleImageView mImageView;
    private String url = "http://ww2.sinaimg.cn/large/612edf3ajw1etgaryxgbnj20c82f07f8.jpg";


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subsamplingscale);
        mImageView = (SubsamplingScaleImageView) findViewById(R.id.subsamplingscale_image);
        mImageView.setImageUri(url);

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.KITKAT) return;
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
    }
}
