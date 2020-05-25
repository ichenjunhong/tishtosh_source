package com.google.android.gms.common.util;

import android.content.Context;

/* renamed from: com.google.android.gms.common.util.i */
public final class C15518i {

    /* renamed from: a */
    public static Boolean f39987a;

    /* renamed from: b */
    public static Boolean f39988b;

    /* renamed from: c */
    private static Boolean f39989c;

    /* renamed from: d */
    private static Boolean f39990d;

    /* renamed from: a */
    public static boolean m32284a(Context context) {
        if (f39989c == null) {
            f39989c = Boolean.valueOf(C15524o.m32298f() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return f39989c.booleanValue();
    }

    /* renamed from: b */
    public static boolean m32285b(Context context) {
        return m32284a(context) && (!C15524o.m32300h() || (m32286c(context) && !C15524o.m32301i()));
    }

    /* renamed from: c */
    public static boolean m32286c(Context context) {
        if (f39990d == null) {
            f39990d = Boolean.valueOf(C15524o.m32299g() && context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f39990d.booleanValue();
    }
}
