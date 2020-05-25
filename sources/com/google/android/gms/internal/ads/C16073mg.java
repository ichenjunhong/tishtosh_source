package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.mg */
final class C16073mg implements C15948hq<C16090mx> {

    /* renamed from: a */
    private final /* synthetic */ beh f45209a;

    /* renamed from: b */
    private final /* synthetic */ C16053ln f45210b;

    /* renamed from: c */
    private final /* synthetic */ aej f45211c;

    /* renamed from: d */
    private final /* synthetic */ C16064ly f45212d;

    C16073mg(C16064ly lyVar, beh beh, C16053ln lnVar, aej aej) {
        this.f45212d = lyVar;
        this.f45209a = beh;
        this.f45210b = lnVar;
        this.f45211c = aej;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo27606a(Object obj, Map map) {
        synchronized (this.f45212d.f45186a) {
            abv.m32796d("JS Engine is requesting an update");
            if (this.f45212d.f45191f == 0) {
                abv.m32796d("Starting reload.");
                this.f45212d.f45191f = 2;
                this.f45212d.mo31172a(this.f45209a);
            }
            this.f45210b.mo31167b("/requestReload", (C15948hq) this.f45211c.f40356a);
        }
    }
}
