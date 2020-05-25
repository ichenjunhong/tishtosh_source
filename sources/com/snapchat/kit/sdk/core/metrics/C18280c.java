package com.snapchat.kit.sdk.core.metrics;

import com.snapchat.kit.sdk.core.metrics.business.C18271a;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;
import java.util.concurrent.ScheduledExecutorService;
import javax.p2677a.C53188a;

/* renamed from: com.snapchat.kit.sdk.core.metrics.c */
public final class C18280c implements C52867d<C18256a<ServerEvent>> {

    /* renamed from: a */
    private final C53188a<C18271a> f50474a;

    /* renamed from: b */
    private final C53188a<ScheduledExecutorService> f50475b;

    public final /* synthetic */ Object get() {
        C18256a aVar = new C18256a((C18271a) this.f50474a.get(), (ScheduledExecutorService) this.f50475b.get(), 1);
        aVar.mo36420a();
        return (C18256a) C52869f.m112471a(aVar, "Cannot return null from a non-@Nullable @Provides method");
    }

    public C18280c(C53188a<C18271a> aVar, C53188a<ScheduledExecutorService> aVar2) {
        this.f50474a = aVar;
        this.f50475b = aVar2;
    }
}
