package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wg */
final class C16343wg implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ abc f45802a;

    /* renamed from: b */
    private final /* synthetic */ C16341we f45803b;

    C16343wg(C16341we weVar, abc abc) {
        this.f45803b = weVar;
        this.f45802a = abc;
    }

    public final void run() {
        this.f45803b.f45796e.mo27454a(this.f45802a);
        if (this.f45803b.f45800m != null) {
            this.f45803b.f45800m.mo31182a();
            this.f45803b.f45800m = null;
        }
    }
}
