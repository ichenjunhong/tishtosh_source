package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.bt */
final class C17027bt implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f48047a;

    /* renamed from: b */
    private final /* synthetic */ String f48048b;

    /* renamed from: c */
    private final /* synthetic */ String f48049c;

    /* renamed from: d */
    private final /* synthetic */ long f48050d;

    /* renamed from: e */
    private final /* synthetic */ C17008ba f48051e;

    C17027bt(C17008ba baVar, String str, String str2, String str3, long j) {
        this.f48051e = baVar;
        this.f48047a = str;
        this.f48048b = str2;
        this.f48049c = str3;
        this.f48050d = j;
    }

    public final void run() {
        if (this.f48047a == null) {
            this.f48051e.f47992a.f48236b.mo32930i().mo33020a(this.f48048b, null);
            return;
        }
        this.f48051e.f47992a.f48236b.mo32930i().mo33020a(this.f48048b, new C17050cp(this.f48049c, this.f48047a, this.f48050d));
    }
}
