package com.snapchat.kit.sdk.creative.p1093b;

import com.C2240a;
import com.bytedance.sysoptimizer.BuildConfig;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.OpMetricFactory;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.creative.dagger.scope.CreativeScope;

@CreativeScope
/* renamed from: com.snapchat.kit.sdk.creative.b.b */
public final class C18308b {

    /* renamed from: a */
    private static final String f50524a = BuildConfig.VERSION_NAME.replace('.', '_');

    /* renamed from: b */
    private final MetricQueue<OpMetric> f50525b;

    public C18308b(MetricQueue<OpMetric> metricQueue) {
        this.f50525b = metricQueue;
    }

    /* renamed from: a */
    private static String m44502a(String str) {
        return C2240a.m6772a("%s:creative:%s", new Object[]{f50524a, str});
    }

    /* renamed from: b */
    public final synchronized void mo36708b(String str, long j) {
        this.f50525b.push(OpMetricFactory.createTimer(m44502a(str), j));
    }

    /* renamed from: a */
    public final synchronized void mo36707a(String str, long j) {
        this.f50525b.push(OpMetricFactory.createCount(m44502a(str), 1));
    }
}
