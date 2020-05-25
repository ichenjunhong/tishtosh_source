package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.stats.C17157a;

/* renamed from: com.google.android.gms.internal.measurement.bu */
public final class C16577bu {

    /* renamed from: a */
    public static Object f46582a = new Object();

    /* renamed from: b */
    public static C17157a f46583b;

    /* renamed from: c */
    private static Boolean f46584c;

    /* renamed from: a */
    public static boolean m39573a(Context context) {
        C15464q.m32123a(context);
        if (f46584c != null) {
            return f46584c.booleanValue();
        }
        boolean a = C16585cb.m39591a(context, "com.google.android.gms.analytics.AnalyticsReceiver", false);
        f46584c = Boolean.valueOf(a);
        return a;
    }
}
