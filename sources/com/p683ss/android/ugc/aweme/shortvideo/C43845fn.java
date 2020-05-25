package com.p683ss.android.ugc.aweme.shortvideo;

import android.content.Context;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.fn */
public final class C43845fn {
    /* renamed from: a */
    public static int m96282a(double d, Context context) {
        if (context == null || context.getResources() == null || context.getResources().getDisplayMetrics() == null) {
            return 0;
        }
        double d2 = (double) context.getResources().getDisplayMetrics().density;
        Double.isNaN(d2);
        return (int) ((d * d2) + 0.5d);
    }
}
