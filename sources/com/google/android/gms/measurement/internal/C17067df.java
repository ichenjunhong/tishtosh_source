package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.df */
final class C17067df implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f48184a;

    /* renamed from: b */
    private final /* synthetic */ zzfv f48185b;

    /* renamed from: c */
    private final /* synthetic */ zzk f48186c;

    /* renamed from: d */
    private final /* synthetic */ C17055cu f48187d;

    C17067df(C17055cu cuVar, boolean z, zzfv zzfv, zzk zzk) {
        this.f48187d = cuVar;
        this.f48184a = z;
        this.f48185b = zzfv;
        this.f48186c = zzk;
    }

    public final void run() {
        C17124i c = this.f48187d.f48131a;
        if (c == null) {
            this.f48187d.mo32854q().f48445b.mo33376a("Discarding data. Failed to set user attribute");
            return;
        }
        this.f48187d.mo33028a(c, this.f48184a ? null : this.f48185b, this.f48186c);
        this.f48187d.m41431F();
    }
}
