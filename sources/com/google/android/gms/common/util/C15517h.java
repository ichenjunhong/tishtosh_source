package com.google.android.gms.common.util;

import android.os.SystemClock;

/* renamed from: com.google.android.gms.common.util.h */
public final class C15517h implements C15514e {

    /* renamed from: a */
    private static final C15517h f39986a = new C15517h();

    /* renamed from: d */
    public static C15514e m32280d() {
        return f39986a;
    }

    /* renamed from: a */
    public final long mo28523a() {
        return System.currentTimeMillis();
    }

    /* renamed from: b */
    public final long mo28524b() {
        return SystemClock.elapsedRealtime();
    }

    /* renamed from: c */
    public final long mo28525c() {
        return System.nanoTime();
    }

    private C15517h() {
    }
}
