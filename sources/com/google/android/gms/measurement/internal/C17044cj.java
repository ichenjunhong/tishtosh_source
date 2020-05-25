package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.cj */
final class C17044cj implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f48101a;

    /* renamed from: b */
    private final /* synthetic */ String f48102b;

    /* renamed from: c */
    private final /* synthetic */ String f48103c;

    /* renamed from: d */
    private final /* synthetic */ String f48104d;

    /* renamed from: e */
    private final /* synthetic */ C17038cd f48105e;

    C17044cj(C17038cd cdVar, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f48105e = cdVar;
        this.f48101a = atomicReference;
        this.f48102b = str;
        this.f48103c = str2;
        this.f48104d = str3;
    }

    public final void run() {
        this.f48105e.f48052r.mo32931j().mo33033a(this.f48101a, this.f48102b, this.f48103c, this.f48104d);
    }
}
