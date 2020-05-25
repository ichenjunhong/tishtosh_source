package com.bytedance.android.live.core.paging.p238c;

import com.bytedance.android.live.base.model.feed.C2974a;
import com.bytedance.android.live.core.paging.p237b.C3948c;
import p064c.p065a.C2201v;

/* renamed from: com.bytedance.android.live.core.paging.c.a */
public final class C3951a<CacheKey, V> extends C3953c<Long, V, CacheKey> {

    /* renamed from: l */
    private final C3952b<V> f11003l;

    public C3951a(C3948c<CacheKey, V> cVar) {
        super(cVar);
        this.f11003l = cVar.f10992i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo9342a(C2974a aVar) {
        if (aVar == null || !aVar.hasMore) {
            return null;
        }
        return Long.valueOf(aVar.f8715e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2201v mo9341a(boolean z, Object obj, int i) {
        return this.f11003l.mo9343a(z, (Long) obj, i);
    }
}
