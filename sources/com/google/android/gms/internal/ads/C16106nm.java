package com.google.android.gms.internal.ads;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.nm */
public final class C16106nm<I, O> implements C16095nb<I, O> {

    /* renamed from: a */
    final C16097nd<O> f45252a;

    /* renamed from: b */
    final C16098ne<I> f45253b;

    /* renamed from: c */
    final String f45254c;

    /* renamed from: d */
    private final C16064ly f45255d;

    C16106nm(C16064ly lyVar, String str, C16098ne<I> neVar, C16097nd<O> ndVar) {
        this.f45255d = lyVar;
        this.f45254c = str;
        this.f45253b = neVar;
        this.f45252a = ndVar;
    }

    /* renamed from: b */
    public final aga<O> mo31188b(I i) {
        agl agl = new agl();
        C16081mo b = this.f45255d.mo31173b((beh) null);
        b.mo28829a(new C16108no(this, b, i, agl), new C16109np(this, agl, b));
        return agl;
    }

    /* renamed from: a */
    public final aga<O> mo27633a(I i) throws Exception {
        return mo31188b(i);
    }
}
