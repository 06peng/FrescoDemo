package com.mzba.fresco.ui;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.mzba.fresco.ui.widget.CustomGifView;

/**
 * Created by 06peng on 2015/6/25.
 */
public class CustomGifViewActivity extends AppCompatActivity {

    private CustomGifView mImageView;
    private String url = "http://ww2.sinaimg.cn/large/dd412be4gw1esr6ijoebog208e0e1qv6.gif";



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mImageView = new CustomGifView(this);
        setContentView(mImageView);
        mImageView.setImageUrl(url);


        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.KITKAT) return;
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
    }

}
