package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.ct */
final class C17054ct implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C17050cp f48129a;

    /* renamed from: b */
    private final /* synthetic */ C17051cq f48130b;

    C17054ct(C17051cq cqVar, C17050cp cpVar) {
        this.f48130b = cqVar;
        this.f48129a = cpVar;
    }

    public final void run() {
        C17051cq.m41395a(this.f48130b, this.f48129a, false);
        this.f48130b.f48119a = null;
        this.f48130b.mo32844g().mo33026a((C17050cp) null);
    }
}
