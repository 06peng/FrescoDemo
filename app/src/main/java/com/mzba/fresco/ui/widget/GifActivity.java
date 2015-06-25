package com.mzba.fresco.ui.widget;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.mzba.fresco.R;

/**
 * Created by 06peng on 2015/6/25.
 */
public class GifActivity extends AppCompatActivity {

    private CustomGifView mImageView;
    private String url = "http://ww2.sinaimg.cn/large/dd412be4gw1esr6ijoebog208e0e1qv6.gif";


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gif);
        mImageView = (CustomGifView) findViewById(R.id.gifview);
        mImageView.setImageUri(url);
    }
}
