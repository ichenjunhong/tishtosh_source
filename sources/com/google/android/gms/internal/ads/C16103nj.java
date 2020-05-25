package com.google.android.gms.internal.ads;

import android.content.Context;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.nj */
public final class C16103nj {

    /* renamed from: a */
    private static final C15567adm<C16053ln> f45249a = new C16104nk();

    /* renamed from: b */
    private static final C15567adm<C16053ln> f45250b = new C16105nl();

    /* renamed from: c */
    private final C16064ly f45251c;

    public C16103nj(Context context, zzbgz zzbgz, String str) {
        C16064ly lyVar = new C16064ly(context, zzbgz, str, f45249a, f45250b);
        this.f45251c = lyVar;
    }

    /* renamed from: a */
    public final <I, O> C16095nb<I, O> mo31193a(String str, C16098ne<I> neVar, C16097nd<O> ndVar) {
        return new C16106nm(this.f45251c, str, neVar, ndVar);
    }
}
