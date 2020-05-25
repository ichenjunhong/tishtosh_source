package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mk */
final class C16077mk implements ago {

    /* renamed from: a */
    private final /* synthetic */ C16085ms f45219a;

    /* renamed from: b */
    private final /* synthetic */ C16064ly f45220b;

    C16077mk(C16064ly lyVar, C16085ms msVar) {
        this.f45220b = lyVar;
        this.f45219a = msVar;
    }

    /* renamed from: a */
    public final void mo28831a() {
        synchronized (this.f45220b.f45186a) {
            this.f45220b.f45191f = 1;
            abv.m32494a("Failed loading new engine. Marking new engine destroyable.");
            this.f45219a.mo31185c();
        }
    }
}
