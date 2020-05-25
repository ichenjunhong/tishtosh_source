package com.p683ss.android.ugc.aweme.base.utils;

import android.content.Context;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.account.task.FbUploadTokenTime;

/* renamed from: com.ss.android.ugc.aweme.base.utils.o */
public final class C23728o {
    /* renamed from: a */
    public static long m58243a(long j) {
        return j / 1000;
    }

    /* renamed from: b */
    public static int m58245b(long j) {
        return (int) (j / FbUploadTokenTime.group0);
    }

    /* renamed from: b */
    public static int m58244b(double d) {
        double d2 = (double) C11010c.m22280a().getResources().getDisplayMetrics().density;
        Double.isNaN(d2);
        return (int) ((d / d2) + 0.5d);
    }

    /* renamed from: c */
    public static int m58246c(double d) {
        double d2 = (double) C11010c.m22280a().getResources().getDisplayMetrics().scaledDensity;
        Double.isNaN(d2);
        return (int) ((d * d2) + 0.5d);
    }

    /* renamed from: a */
    public static int m58241a(double d) {
        Context a = C11010c.m22280a();
        if (a == null || a.getResources() == null || a.getResources().getDisplayMetrics() == null) {
            return 0;
        }
        double d2 = (double) a.getResources().getDisplayMetrics().density;
        Double.isNaN(d2);
        return (int) ((d * d2) + 0.5d);
    }

    /* renamed from: a */
    public static int m58242a(Context context, int i) {
        return (int) ((((float) i) * context.getResources().getDisplayMetrics().density) / 2.0f);
    }
}
