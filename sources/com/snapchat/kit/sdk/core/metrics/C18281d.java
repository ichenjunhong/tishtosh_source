package com.snapchat.kit.sdk.core.metrics;

import com.snapchat.kit.sdk.core.networking.ClientFactory;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;
import javax.p2677a.C53188a;

/* renamed from: com.snapchat.kit.sdk.core.metrics.d */
public final class C18281d implements C52867d<MetricsClient> {

    /* renamed from: a */
    private final C53188a<ClientFactory> f50476a;

    public final /* synthetic */ Object get() {
        return (MetricsClient) C52869f.m112471a((MetricsClient) ((ClientFactory) this.f50476a.get()).generateFingerprintedClient("https://api.snapkit.com", MetricsClient.class), "Cannot return null from a non-@Nullable @Provides method");
    }

    public C18281d(C53188a<ClientFactory> aVar) {
        this.f50476a = aVar;
    }
}
