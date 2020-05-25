package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.cg */
final class C17041cg implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f48092a;

    /* renamed from: b */
    private final /* synthetic */ String f48093b;

    /* renamed from: c */
    private final /* synthetic */ Object f48094c;

    /* renamed from: d */
    private final /* synthetic */ long f48095d;

    /* renamed from: e */
    private final /* synthetic */ C17038cd f48096e;

    C17041cg(C17038cd cdVar, String str, String str2, Object obj, long j) {
        this.f48096e = cdVar;
        this.f48092a = str;
        this.f48093b = str2;
        this.f48094c = obj;
        this.f48095d = j;
    }

    public final void run() {
        this.f48096e.mo32993a(this.f48092a, this.f48093b, this.f48094c, this.f48095d);
    }
}
