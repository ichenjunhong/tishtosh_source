package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;

public class acu extends act {
    /* renamed from: a */
    public final boolean mo28691a(Activity activity, Configuration configuration) {
        if (!((Boolean) caf.m37099d().mo30717a(C15740bx.f44322cC)).booleanValue()) {
            return false;
        }
        if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44324cE)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        int a = aes.m32748a((Context) activity, configuration.screenHeightDp);
        int a2 = aes.m32748a((Context) activity, configuration.screenWidthDp);
        DisplayMetrics a3 = acd.m32572a((WindowManager) activity.getApplicationContext().getSystemService("window"));
        int i = a3.heightPixels;
        int i2 = a3.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        double d = (double) activity.getResources().getDisplayMetrics().density;
        Double.isNaN(d);
        int round = ((int) Math.round(d + 0.5d)) * ((Integer) caf.m37099d().mo30717a(C15740bx.f44321cB)).intValue();
        if (!(m32668a(i, a + dimensionPixelSize, round) && m32668a(i2, a2, round))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m32668a(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }
}
