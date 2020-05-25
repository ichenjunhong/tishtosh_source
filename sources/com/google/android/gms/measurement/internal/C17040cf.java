package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.cf */
final class C17040cf implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f48083a;

    /* renamed from: b */
    private final /* synthetic */ String f48084b;

    /* renamed from: c */
    private final /* synthetic */ long f48085c;

    /* renamed from: d */
    private final /* synthetic */ Bundle f48086d;

    /* renamed from: e */
    private final /* synthetic */ boolean f48087e;

    /* renamed from: f */
    private final /* synthetic */ boolean f48088f;

    /* renamed from: g */
    private final /* synthetic */ boolean f48089g;

    /* renamed from: h */
    private final /* synthetic */ String f48090h;

    /* renamed from: i */
    private final /* synthetic */ C17038cd f48091i;

    C17040cf(C17038cd cdVar, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.f48091i = cdVar;
        this.f48083a = str;
        this.f48084b = str2;
        this.f48085c = j;
        this.f48086d = bundle;
        this.f48087e = z;
        this.f48088f = z2;
        this.f48089g = z3;
        this.f48090h = str3;
    }

    public final void run() {
        this.f48091i.m41348a(this.f48083a, this.f48084b, this.f48085c, this.f48086d, this.f48087e, this.f48088f, this.f48089g, this.f48090h);
    }
}
