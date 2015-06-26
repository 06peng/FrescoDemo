package com.mzba.fresco.ui;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.drawable.ProgressBarDrawable;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;
import com.mzba.fresco.R;
import com.mzba.fresco.ui.widget.CustomProgressbarDrawable;
import com.mzba.fresco.ui.widget.ImageDownloadListener;

/**
 * Created by 06peng on 2015/6/25.
 */
public class GifActivity extends AppCompatActivity implements ImageDownloadListener {

    private SimpleDraweeView mImageView;
    private String url = "http://ww2.sinaimg.cn/large/dd412be4gw1esr6ijoebog208e0e1qv6.gif";

    private TextView mProgressTv;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gif);
        mImageView = (SimpleDraweeView) findViewById(R.id.gifview);
        mProgressTv = (TextView) findViewById(R.id.progress_text);

        GenericDraweeHierarchyBuilder builder =
                new GenericDraweeHierarchyBuilder(getResources());
        GenericDraweeHierarchy hierarchy = builder
                .setFadeDuration(300)
                .setProgressBarImage(new CustomProgressbarDrawable(this))
                .build();
        DraweeController controller = Fresco.newDraweeControllerBuilder()
                .setUri(Uri.parse(url))
                .setAutoPlayAnimations(true)
                .build();
        mImageView.setHierarchy(hierarchy);
        mImageView.setController(controller);

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.KITKAT) return;
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
    }

    @Override
    public void onUpdate(int progress) {
        mProgressTv.setText(progress + "%");
        if (progress >= 100) {
            mProgressTv.setVisibility(View.GONE);
        }
    }
}
