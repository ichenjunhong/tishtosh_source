package com.google.android.gms.analytics;

import com.google.android.gms.internal.measurement.C16567bk;

/* renamed from: com.google.android.gms.analytics.f */
public final class C15092f {
    /* renamed from: a */
    public static String m31243a(int i) {
        return m31244a("cd", i);
    }

    /* renamed from: b */
    public static String m31245b(int i) {
        return m31244a("cm", i);
    }

    /* renamed from: a */
    private static String m31244a(String str, int i) {
        if (i <= 0) {
            C16567bk.m39526a("index out of range for prefix", str);
            return "";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11);
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: c */
    public static String m31246c(int i) {
        return m31244a("pr", i);
    }

    /* renamed from: d */
    public static String m31247d(int i) {
        return m31244a("promo", i);
    }

    /* renamed from: e */
    public static String m31248e(int i) {
        return m31244a("pi", i);
    }

    /* renamed from: f */
    public static String m31249f(int i) {
        return m31244a("il", i);
    }
}
