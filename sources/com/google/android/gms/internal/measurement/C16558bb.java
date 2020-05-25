package com.google.android.gms.internal.measurement;

import android.os.Build.VERSION;

/* renamed from: com.google.android.gms.internal.measurement.bb */
public final class C16558bb {
    /* renamed from: a */
    public static int m39511a() {
        try {
            return Integer.parseInt(VERSION.SDK);
        } catch (NumberFormatException unused) {
            C16567bk.m39526a("Invalid version number", VERSION.SDK);
            return 0;
        }
    }
}
