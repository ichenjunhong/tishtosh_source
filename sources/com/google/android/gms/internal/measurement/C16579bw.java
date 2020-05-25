package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.bw */
final /* synthetic */ class C16579bw implements Runnable {

    /* renamed from: a */
    private final C16578bv f46588a;

    /* renamed from: b */
    private final int f46589b;

    /* renamed from: c */
    private final C16568bl f46590c;

    C16579bw(C16578bv bvVar, int i, C16568bl blVar) {
        this.f46588a = bvVar;
        this.f46589b = i;
        this.f46590c = blVar;
    }

    public final void run() {
        C16578bv bvVar = this.f46588a;
        int i = this.f46589b;
        C16568bl blVar = this.f46590c;
        if (((C16582bz) bvVar.f46587b).mo27807a(i)) {
            blVar.mo32493b("Local AnalyticsService processed last dispatch request");
        }
    }
}
