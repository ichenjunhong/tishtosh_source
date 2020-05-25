package com.twitter.sdk.android.core.internal.p2618b;

/* renamed from: com.twitter.sdk.android.core.internal.b.d */
public final class C52108d<T> {

    /* renamed from: a */
    public final C52106b f129712a;

    /* renamed from: b */
    public final C52109e<T> f129713b;

    /* renamed from: c */
    public final String f129714c;

    /* renamed from: a */
    public final void mo108810a() {
        this.f129712a.mo108809b().remove(this.f129714c).commit();
    }

    /* renamed from: a */
    public final void mo108811a(T t) {
        this.f129712a.mo108808a(this.f129712a.mo108809b().putString(this.f129714c, this.f129713b.mo108765a(t)));
    }

    public C52108d(C52106b bVar, C52109e<T> eVar, String str) {
        this.f129712a = bVar;
        this.f129713b = eVar;
        this.f129714c = str;
    }
}
