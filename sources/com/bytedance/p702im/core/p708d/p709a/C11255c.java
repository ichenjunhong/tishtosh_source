package com.bytedance.p702im.core.p708d.p709a;

import com.bytedance.p702im.core.internal.p718b.p719a.C11406q;
import com.bytedance.p702im.core.internal.p720c.C11447f;
import com.bytedance.p702im.core.proto.ClientMetric.Builder;
import com.bytedance.p702im.core.proto.ClientMetricType;
import com.bytedance.p702im.core.proto.IMCMD;
import com.bytedance.p702im.core.proto.ReportClientMetricsRequestBody;
import com.bytedance.p702im.core.proto.RequestBody;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.bytedance.im.core.d.a.c */
public final class C11255c extends C11406q {
    /* renamed from: a */
    public final void mo20946a(C11447f fVar, Runnable runnable) {
    }

    public C11255c() {
        super(IMCMD.REPORT_CLIENT_METRICS.getValue());
    }

    /* renamed from: a */
    public final boolean mo20947a(C11447f fVar) {
        if (fVar == null || fVar.f30732g == null || fVar.f30732g.body == null || fVar.f30732g.body.report_client_metrics_body == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo20950a(int i, String str, long j, Map<String, String> map) {
        m22851a(i, ClientMetricType.COUNTER, str, 1, map);
    }

    /* renamed from: b */
    public final void mo20951b(int i, String str, long j, Map<String, String> map) {
        m22851a(i, ClientMetricType.TIMER, str, j, map);
    }

    /* renamed from: a */
    private void m22851a(int i, ClientMetricType clientMetricType, String str, long j, Map<String, String> map) {
        Builder v = new Builder().metric_type(clientMetricType).mo21156k(str).mo21159v(Long.valueOf(j));
        if (map != null) {
            v.tags(map);
        }
        mo21053a(i, new RequestBody.Builder().report_client_metrics_body(new ReportClientMetricsRequestBody.Builder().report_metrics_list(Collections.singletonList(v.build())).build()).build(), null, new Object[0]);
    }
}
