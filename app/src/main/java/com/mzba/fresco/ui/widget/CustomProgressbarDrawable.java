package com.mzba.fresco.ui.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/**
 * Created by 06peng on 15/6/26.
 */
public class CustomProgressbarDrawable extends Drawable {

    private ImageDownloadListener mListener;

    public CustomProgressbarDrawable(ImageDownloadListener listener) {
        mListener = listener;
    }

    @Override
    public void draw(Canvas canvas) {

    }

    @Override
    public void setAlpha(int alpha) {

    }

    @Override
    public void setColorFilter(ColorFilter cf) {

    }

    @Override
    public int getOpacity() {
        return 0;
    }

    @Override
    protected boolean onLevelChange(int level) {
        int progress = (int) ((level / 10000.0) * 100);
        System.out.println("==================" + progress);
        if (mListener != null) {
            mListener.onUpdate(progress);
        }
        return super.onLevelChange(level);
    }
}
