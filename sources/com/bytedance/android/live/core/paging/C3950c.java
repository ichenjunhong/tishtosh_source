package com.bytedance.android.live.core.paging;

import android.arch.lifecycle.LiveData;
import android.arch.p010b.C0082h;
import com.bytedance.android.live.core.p222a.C3810b;
import com.bytedance.android.live.core.paging.p237b.C3948c;

/* renamed from: com.bytedance.android.live.core.paging.c */
public final class C3950c<CacheKey, T> extends C3925a<T> {

    /* renamed from: a */
    private C3810b<CacheKey, T> f11001a;

    /* renamed from: b */
    private CacheKey f11002b;

    /* renamed from: j */
    public final int mo9306j() {
        return this.f11001a.mo9189b(this.f11002b);
    }

    /* renamed from: a */
    public final int mo9294a(T t) {
        return this.f11001a.mo9190b(this.f11002b, t);
    }

    /* renamed from: b */
    public final void mo9298b(int i) {
        this.f11001a.mo9187a(this.f11002b, 0);
        mo9304h();
    }

    public C3950c(C3948c<CacheKey, T> cVar, LiveData<C0082h<T>> liveData) {
        super(cVar, liveData);
        this.f11002b = cVar.f10988e;
        this.f11001a = cVar.f10989f;
    }
}
