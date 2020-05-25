package com.p683ss.android.vesdk.utils;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* renamed from: com.ss.android.vesdk.utils.b */
public final class C50786b {
    /* renamed from: a */
    public static int m109900a(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }
}
