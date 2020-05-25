package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.ck */
final class C17045ck implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f48106a;

    /* renamed from: b */
    private final /* synthetic */ String f48107b;

    /* renamed from: c */
    private final /* synthetic */ String f48108c;

    /* renamed from: d */
    private final /* synthetic */ String f48109d;

    /* renamed from: e */
    private final /* synthetic */ boolean f48110e;

    /* renamed from: f */
    private final /* synthetic */ C17038cd f48111f;

    C17045ck(C17038cd cdVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f48111f = cdVar;
        this.f48106a = atomicReference;
        this.f48107b = str;
        this.f48108c = str2;
        this.f48109d = str3;
        this.f48110e = z;
    }

    public final void run() {
        this.f48111f.f48052r.mo32931j().mo33034a(this.f48106a, this.f48107b, this.f48108c, this.f48109d, this.f48110e);
    }
}
