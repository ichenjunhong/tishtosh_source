package com.snapchat.kit.sdk.core.metrics;

import com.snapchat.kit.sdk.core.metrics.model.Metrics;
import com.snapchat.kit.sdk.core.metrics.model.ServerEventBatch;
import p2666g.C53061b;
import p2666g.p2672c.C53070a;
import p2666g.p2672c.C53084o;

public interface MetricsClient {
    @C53084o(mo110612a = "/v1/sdk/metrics/business")
    C53061b<Void> postAnalytics(@C53070a ServerEventBatch serverEventBatch);

    @C53084o(mo110612a = "/v1/sdk/metrics/operational")
    C53061b<Void> postOperationalMetrics(@C53070a Metrics metrics);
}
