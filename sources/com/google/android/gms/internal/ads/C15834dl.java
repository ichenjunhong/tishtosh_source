package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.dl */
final class C15834dl implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15832dj f44870a;

    C15834dl(C15832dj djVar) {
        this.f44870a = djVar;
    }

    public final void run() {
        if (this.f44870a.f44861a != null) {
            this.f44870a.f44861a.mo31029l();
            this.f44870a.f44861a.mo31028k();
        }
        this.f44870a.f44861a = null;
    }
}
