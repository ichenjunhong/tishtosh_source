package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.jn */
final class C15999jn extends cam {

    /* renamed from: a */
    private final /* synthetic */ C15998jm f45088a;

    C15999jn(C15998jm jmVar) {
        this.f45088a = jmVar;
    }

    /* renamed from: a */
    public final void mo30869a() throws RemoteException {
        this.f45088a.f45087a.add(new C16000jo(this));
    }

    /* renamed from: a */
    public final void mo30870a(int i) throws RemoteException {
        this.f45088a.f45087a.add(new C16001jp(this, i));
        abv.m32494a("Pooled interstitial failed to load.");
    }

    /* renamed from: b */
    public final void mo30871b() throws RemoteException {
        this.f45088a.f45087a.add(new C16002jq(this));
    }

    /* renamed from: c */
    public final void mo30872c() throws RemoteException {
        this.f45088a.f45087a.add(new C16003jr(this));
        abv.m32494a("Pooled interstitial loaded.");
    }

    /* renamed from: d */
    public final void mo30873d() throws RemoteException {
        this.f45088a.f45087a.add(new C16004js(this));
    }

    /* renamed from: e */
    public final void mo30874e() throws RemoteException {
        this.f45088a.f45087a.add(new C16005jt(this));
    }

    /* renamed from: f */
    public final void mo30875f() throws RemoteException {
        this.f45088a.f45087a.add(new C16006ju(this));
    }
}
