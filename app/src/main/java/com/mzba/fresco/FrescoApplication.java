package com.mzba.fresco;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.mzba.fresco.utils.ImagePipelineConfigFactory;

/**
 * Created by 06peng on 2015/6/24.
 */
public class FrescoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this, ImagePipelineConfigFactory.getImagePipelineConfig(this));
    }
}
