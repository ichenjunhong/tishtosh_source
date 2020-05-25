package com.bytedance.android.live.core.paging.p237b;

import android.arch.lifecycle.C0198r;
import android.arch.p010b.C0082h.C0085a;

/* renamed from: com.bytedance.android.live.core.paging.b.b */
public final class C3947b<V> extends C0085a<V> {

    /* renamed from: a */
    private C0198r<Boolean> f10981a = new C0198r<>();

    /* renamed from: b */
    private C0198r<Boolean> f10982b = new C0198r<>();

    /* renamed from: a */
    public final void mo138a() {
        super.mo138a();
        this.f10982b.postValue(Boolean.valueOf(true));
    }

    /* renamed from: a */
    public final void mo139a(V v) {
        super.mo139a(v);
        this.f10981a.postValue(Boolean.valueOf(false));
    }

    public C3947b(C0198r<Boolean> rVar, C0198r<Boolean> rVar2) {
        this.f10981a = rVar;
        this.f10982b = rVar2;
    }
}
