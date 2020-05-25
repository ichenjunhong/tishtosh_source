package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wi */
final class C16345wi implements agq<C16090mx> {

    /* renamed from: a */
    private final /* synthetic */ C16344wh f45807a;

    C16345wi(C16344wh whVar) {
        this.f45807a = whVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo28832a(Object obj) {
        try {
            ((C16090mx) obj).mo29247b("AFMA_getAdapterLessMediationAd", this.f45807a.f45804a);
        } catch (Exception e) {
            abv.m32793b("Error requesting an ad url", e);
            C16341we.f45791c.mo31088a(this.f45807a.f45805b);
        }
    }
}
