package com.mzba.fresco.ui;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;
import com.mzba.fresco.R;

/**
 * Created by 06peng on 2015/6/25.
 */
public class GifActivity extends AppCompatActivity {

    private SimpleDraweeView mImageView;
    private String url = "http://ww2.sinaimg.cn/large/dd412be4gw1esr6ijoebog208e0e1qv6.gif";


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gif);
        mImageView = (SimpleDraweeView) findViewById(R.id.gifview);
        DraweeController controller = Fresco.newDraweeControllerBuilder()
                .setUri(Uri.parse(url))
                .setAutoPlayAnimations(true)
        .build();
        mImageView.setController(controller);
    }
}
