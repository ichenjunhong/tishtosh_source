package com.p683ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.dx */
public final class C43302dx {
    /* renamed from: a */
    public static boolean m94966a(int i, int i2) {
        if (i2 * 9 < i * 16) {
            double d = (double) i2;
            double d2 = (double) i;
            Double.isNaN(d);
            Double.isNaN(d2);
            if (Math.abs((d / d2) - 1.7777777910232544d) >= 0.1d) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static void m94965a(View view, int i, int i2) {
        if (view != null) {
            Context context = view.getContext();
            int a = C43303dy.m94967a(context);
            int b = C43303dy.m94971b(context);
            LayoutParams layoutParams = new LayoutParams(-1, -1);
            int i3 = a * i;
            int i4 = i2 * b;
            if (i3 > i4) {
                layoutParams.width = b;
                layoutParams.height = i4 / i;
                layoutParams.topMargin = (a - layoutParams.height) / 2;
                layoutParams.leftMargin = 0;
            } else {
                layoutParams.width = i3 / i2;
                layoutParams.height = a;
                layoutParams.leftMargin = (b - layoutParams.width) / 2;
                layoutParams.topMargin = 0;
            }
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(layoutParams.leftMargin);
            }
            view.setLayoutParams(layoutParams);
        }
    }
}
