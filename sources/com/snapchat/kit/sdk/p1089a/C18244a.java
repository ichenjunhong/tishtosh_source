package com.snapchat.kit.sdk.p1089a;

import com.C2240a;
import com.bytedance.sysoptimizer.BuildConfig;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.OpMetricFactory;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import dagger.C52863a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.snapchat.kit.sdk.a.a */
public final class C18244a {

    /* renamed from: a */
    private final C52863a<MetricQueue<OpMetric>> f50377a;

    /* renamed from: b */
    private final Map<C18245a, Long> f50378b = new ConcurrentHashMap();

    /* renamed from: com.snapchat.kit.sdk.a.a$a */
    public enum C18245a {
        REVOKE,
        REFRESH,
        GRANT
    }

    public C18244a(C52863a<MetricQueue<OpMetric>> aVar) {
        this.f50377a = aVar;
    }

    /* renamed from: b */
    private static String m44463b(String str) {
        return C2240a.m6772a("%s:login:%s", new Object[]{BuildConfig.VERSION_NAME.replace('.', '_'), str});
    }

    /* renamed from: a */
    public final synchronized void mo36395a(String str) {
        ((MetricQueue) this.f50377a.get()).push(OpMetricFactory.createCount(m44463b(str), 1));
    }

    /* renamed from: a */
    public final synchronized void mo36393a(C18245a aVar) {
        MetricQueue metricQueue = (MetricQueue) this.f50377a.get();
        StringBuilder sb = new StringBuilder();
        sb.append(aVar.toString().toLowerCase());
        sb.append("TokenRequest");
        metricQueue.push(OpMetricFactory.createCount(m44463b(sb.toString()), 1));
        this.f50378b.put(aVar, Long.valueOf(System.currentTimeMillis()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0044, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo36394a(com.snapchat.kit.sdk.p1089a.C18244a.C18245a r6, boolean r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            dagger.a<com.snapchat.kit.sdk.core.metrics.MetricQueue<com.snapchat.kit.sdk.core.metrics.model.OpMetric>> r0 = r5.f50377a     // Catch:{ all -> 0x006d }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x006d }
            com.snapchat.kit.sdk.core.metrics.MetricQueue r0 = (com.snapchat.kit.sdk.core.metrics.MetricQueue) r0     // Catch:{ all -> 0x006d }
            if (r7 == 0) goto L_0x0045
            java.util.Map<com.snapchat.kit.sdk.a.a$a, java.lang.Long> r7 = r5.f50378b     // Catch:{ all -> 0x006d }
            java.lang.Object r7 = r7.remove(r6)     // Catch:{ all -> 0x006d }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x006d }
            if (r7 == 0) goto L_0x0043
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x006d }
            r1.<init>()     // Catch:{ all -> 0x006d }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x006d }
            java.lang.String r6 = r6.toLowerCase()     // Catch:{ all -> 0x006d }
            r1.append(r6)     // Catch:{ all -> 0x006d }
            java.lang.String r6 = "TokenLatency"
            r1.append(r6)     // Catch:{ all -> 0x006d }
            java.lang.String r6 = r1.toString()     // Catch:{ all -> 0x006d }
            java.lang.String r6 = m44463b(r6)     // Catch:{ all -> 0x006d }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x006d }
            long r3 = r7.longValue()     // Catch:{ all -> 0x006d }
            r7 = 0
            long r1 = r1 - r3
            com.snapchat.kit.sdk.core.metrics.model.OpMetric r6 = com.snapchat.kit.sdk.core.metrics.OpMetricFactory.createTimer(r6, r1)     // Catch:{ all -> 0x006d }
            r0.push(r6)     // Catch:{ all -> 0x006d }
        L_0x0043:
            monitor-exit(r5)
            return
        L_0x0045:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x006d }
            r7.<init>()     // Catch:{ all -> 0x006d }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x006d }
            java.lang.String r6 = r6.toLowerCase()     // Catch:{ all -> 0x006d }
            r7.append(r6)     // Catch:{ all -> 0x006d }
            java.lang.String r6 = "TokenFailure"
            r7.append(r6)     // Catch:{ all -> 0x006d }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x006d }
            java.lang.String r6 = m44463b(r6)     // Catch:{ all -> 0x006d }
            r1 = 1
            com.snapchat.kit.sdk.core.metrics.model.OpMetric r6 = com.snapchat.kit.sdk.core.metrics.OpMetricFactory.createCount(r6, r1)     // Catch:{ all -> 0x006d }
            r0.push(r6)     // Catch:{ all -> 0x006d }
            monitor-exit(r5)
            return
        L_0x006d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.p1089a.C18244a.mo36394a(com.snapchat.kit.sdk.a.a$a, boolean):void");
    }
}
