package com.google.android.gms.internal.ads;

public final class bru extends bmp {

    /* renamed from: b */
    private static final Object f43718b = new Object();

    /* renamed from: c */
    private final long f43719c;

    /* renamed from: d */
    private final long f43720d;

    /* renamed from: e */
    private final boolean f43721e;

    public bru(long j, boolean z) {
        this(j, j, 0, 0, z, false);
    }

    /* renamed from: b */
    public final int mo30414b() {
        return 1;
    }

    /* renamed from: c */
    public final int mo30415c() {
        return 1;
    }

    private bru(long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.f43719c = j;
        this.f43720d = j2;
        this.f43721e = z;
    }

    /* renamed from: a */
    public final bms mo30412a(int i, bms bms, boolean z, long j) {
        bti.m36696a(i, 0, 1);
        boolean z2 = this.f43721e;
        long j2 = this.f43720d;
        bms.f42983a = null;
        bms.f42984b = -9223372036854775807L;
        bms.f42985c = -9223372036854775807L;
        bms.f42986d = z2;
        bms.f42987e = false;
        bms.f42990h = 0;
        bms.f42991i = j2;
        bms.f42988f = 0;
        bms.f42989g = 0;
        bms.f42992j = 0;
        return bms;
    }

    /* renamed from: a */
    public final bmr mo30410a(int i, bmr bmr, boolean z) {
        bti.m36696a(i, 0, 1);
        Object obj = z ? f43718b : null;
        long j = this.f43719c;
        bmr.f42977a = obj;
        bmr.f42978b = obj;
        bmr.f42979c = 0;
        bmr.f42980d = j;
        bmr.f42982f = 0;
        bmr.f42981e = false;
        return bmr;
    }

    /* renamed from: a */
    public final int mo30409a(Object obj) {
        return f43718b.equals(obj) ? 0 : -1;
    }
}
