package com.snapchat.kit.sdk.creative.api;

import android.content.Context;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.creative.p1093b.C18307a;
import com.snapchat.kit.sdk.creative.p1093b.C18308b;
import dagger.p2651a.C52867d;
import javax.p2677a.C53188a;

public final class SnapCreativeKitApi_Factory implements C52867d<SnapCreativeKitApi> {
    private final C53188a<String> clientIdProvider;
    private final C53188a<Context> contextProvider;
    private final C53188a<C18308b> creativeKitOpMetricsManagerProvider;
    private final C53188a<C18307a> eventFactoryProvider;
    private final C53188a<MetricQueue<ServerEvent>> eventQueueProvider;
    private final C53188a<String> redirectUrlProvider;

    public final SnapCreativeKitApi get() {
        SnapCreativeKitApi snapCreativeKitApi = new SnapCreativeKitApi((Context) this.contextProvider.get(), (String) this.clientIdProvider.get(), (String) this.redirectUrlProvider.get(), (C18308b) this.creativeKitOpMetricsManagerProvider.get(), (MetricQueue) this.eventQueueProvider.get(), (C18307a) this.eventFactoryProvider.get());
        return snapCreativeKitApi;
    }

    public SnapCreativeKitApi_Factory(C53188a<Context> aVar, C53188a<String> aVar2, C53188a<String> aVar3, C53188a<C18308b> aVar4, C53188a<MetricQueue<ServerEvent>> aVar5, C53188a<C18307a> aVar6) {
        this.contextProvider = aVar;
        this.clientIdProvider = aVar2;
        this.redirectUrlProvider = aVar3;
        this.creativeKitOpMetricsManagerProvider = aVar4;
        this.eventQueueProvider = aVar5;
        this.eventFactoryProvider = aVar6;
    }

    public static C52867d<SnapCreativeKitApi> create(C53188a<Context> aVar, C53188a<String> aVar2, C53188a<String> aVar3, C53188a<C18308b> aVar4, C53188a<MetricQueue<ServerEvent>> aVar5, C53188a<C18307a> aVar6) {
        SnapCreativeKitApi_Factory snapCreativeKitApi_Factory = new SnapCreativeKitApi_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
        return snapCreativeKitApi_Factory;
    }

    public static SnapCreativeKitApi newSnapCreativeKitApi(Context context, String str, String str2, C18308b bVar, MetricQueue<ServerEvent> metricQueue, C18307a aVar) {
        SnapCreativeKitApi snapCreativeKitApi = new SnapCreativeKitApi(context, str, str2, bVar, metricQueue, aVar);
        return snapCreativeKitApi;
    }
}
