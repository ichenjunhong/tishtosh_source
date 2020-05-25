package com.snapchat.kit.sdk.core.metrics;

import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.core.metrics.p1090a.C18264a;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;
import java.util.concurrent.ScheduledExecutorService;
import javax.p2677a.C53188a;

/* renamed from: com.snapchat.kit.sdk.core.metrics.e */
public final class C18282e implements C52867d<MetricQueue<OpMetric>> {

    /* renamed from: a */
    private final C53188a<C18264a> f50477a;

    /* renamed from: b */
    private final C53188a<ScheduledExecutorService> f50478b;

    public final /* synthetic */ Object get() {
        C18256a aVar = new C18256a((C18264a) this.f50477a.get(), (ScheduledExecutorService) this.f50478b.get(), 1);
        aVar.mo36420a();
        return (MetricQueue) C52869f.m112471a(aVar, "Cannot return null from a non-@Nullable @Provides method");
    }

    public C18282e(C53188a<C18264a> aVar, C53188a<ScheduledExecutorService> aVar2) {
        this.f50477a = aVar;
        this.f50478b = aVar2;
    }
}
