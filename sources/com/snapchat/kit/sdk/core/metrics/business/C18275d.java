package com.snapchat.kit.sdk.core.metrics.business;

import com.snapchat.kit.sdk.core.metrics.C18256a;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import dagger.p2651a.C52867d;
import javax.p2677a.C53188a;

/* renamed from: com.snapchat.kit.sdk.core.metrics.business.d */
public final class C18275d implements C52867d<C18274c> {

    /* renamed from: a */
    private final C53188a<C18279h> f50467a;

    /* renamed from: b */
    private final C53188a<C18256a<ServerEvent>> f50468b;

    public final /* synthetic */ Object get() {
        return new C18274c((C18279h) this.f50467a.get(), (C18256a) this.f50468b.get());
    }

    public C18275d(C53188a<C18279h> aVar, C53188a<C18256a<ServerEvent>> aVar2) {
        this.f50467a = aVar;
        this.f50468b = aVar2;
    }
}
