package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mj */
final class C16076mj implements agq<C16053ln> {

    /* renamed from: a */
    private final /* synthetic */ C16085ms f45217a;

    /* renamed from: b */
    private final /* synthetic */ C16064ly f45218b;

    C16076mj(C16064ly lyVar, C16085ms msVar) {
        this.f45218b = lyVar;
        this.f45217a = msVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo28832a(Object obj) {
        synchronized (this.f45218b.f45186a) {
            this.f45218b.f45191f = 0;
            if (!(this.f45218b.f45193h == null || this.f45217a == this.f45218b.f45193h)) {
                abv.m32494a("New JS engine is loaded, marking previous one as destroyable.");
                this.f45218b.f45193h.mo31185c();
            }
            this.f45218b.f45193h = this.f45217a;
        }
    }
}
