package com.google.android.gms.common.util;

import android.content.Context;
import com.google.android.gms.common.internal.C15464q;

/* renamed from: com.google.android.gms.common.util.g */
public final class C15516g {

    /* renamed from: a */
    private static final String[] f39984a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    /* renamed from: b */
    private static int f39985b = -1;

    /* renamed from: a */
    public static boolean m32278a(Context context, Throwable th) {
        return m32279a(context, th, 536870912);
    }

    /* renamed from: a */
    private static boolean m32279a(Context context, Throwable th, int i) {
        try {
            C15464q.m32123a(context);
            C15464q.m32123a(th);
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
