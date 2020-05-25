package com.p683ss.android.ttve.utils;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: com.ss.android.ttve.utils.b */
public final class C20141b {

    /* renamed from: a */
    public static final boolean f55391a;

    /* renamed from: b */
    public static int f55392b = -1;

    /* renamed from: c */
    public static C20142a f55393c = new C20142a();

    /* renamed from: com.ss.android.ttve.utils.b$a */
    public static class C20142a {
    }

    static {
        boolean z;
        if (VERSION.SDK_INT > 19) {
            z = true;
        } else {
            z = false;
        }
        f55391a = z;
    }

    /* renamed from: a */
    public static final int m49697a(Context context) {
        if (context == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics == null) {
            return 0;
        }
        return displayMetrics.widthPixels;
    }

    /* renamed from: b */
    public static final int m49699b(Context context) {
        if (context == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics == null) {
            return 0;
        }
        return displayMetrics.heightPixels;
    }

    /* renamed from: c */
    public static final int m49701c(Context context) {
        int i = 0;
        if (context == null) {
            return 0;
        }
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i = context.getResources().getDimensionPixelSize(identifier);
        }
        return i;
    }

    /* renamed from: a */
    public static float m49696a(Context context, float f) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    /* renamed from: b */
    public static int m49700b(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: a */
    public static final void m49698a(View view, int i) {
        boolean z;
        if (!(view == null || view.getVisibility() == i)) {
            if (i == 0 || i == 8 || i == 4) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                view.setVisibility(i);
            }
        }
    }
}
