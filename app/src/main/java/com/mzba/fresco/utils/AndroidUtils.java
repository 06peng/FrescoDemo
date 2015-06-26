package com.mzba.fresco.utils;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/**
 * Created by 06peng on 15/6/26.
 */
public class AndroidUtils {

    private static int width = 0;
    private static int height = 0;

    private static void getDisplay(Context context) {
        if (width <= 0 || height <= 0) {
            WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
            DisplayMetrics dm = new DisplayMetrics();
            wm.getDefaultDisplay().getMetrics(dm);
            width = dm.widthPixels;
            height = dm.heightPixels;
        }
    }

    public static int getScreenWidth(Context context) {
        getDisplay(context);
        return width;
    }

    public static int getScreenHeight(Context context) {
        getDisplay(context);
        return height;
    }
}
