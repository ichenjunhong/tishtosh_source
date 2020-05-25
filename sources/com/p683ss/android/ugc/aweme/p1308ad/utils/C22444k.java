package com.p683ss.android.ugc.aweme.p1308ad.utils;

import android.content.Context;
import com.bytedance.ies.ugc.p694a.C11010c;

/* renamed from: com.ss.android.ugc.aweme.ad.utils.k */
public final class C22444k {
    /* renamed from: a */
    public static int m55474a(double d) {
        Context a = C11010c.m22280a();
        if (a == null || a.getResources() == null || a.getResources().getDisplayMetrics() == null) {
            return 0;
        }
        double d2 = (double) a.getResources().getDisplayMetrics().density;
        Double.isNaN(d2);
        return (int) ((d * d2) + 0.5d);
    }
}
