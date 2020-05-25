package com.snapchat.kit.sdk.core.metrics.p1090a;

import android.content.SharedPreferences;
import com.snapchat.kit.sdk.core.dagger.scope.SnapConnectScope;
import com.snapchat.kit.sdk.core.metrics.C18267b;
import com.snapchat.kit.sdk.core.metrics.MetricPublisher;
import com.snapchat.kit.sdk.core.metrics.MetricPublisher.PublishCallback;
import com.snapchat.kit.sdk.core.metrics.MetricsClient;
import com.snapchat.kit.sdk.core.metrics.model.Metrics.Builder;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.core.metrics.p1091b.C18268a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p2666g.C53061b;
import p2666g.C53094d;
import p2666g.C53133m;

@SnapConnectScope
/* renamed from: com.snapchat.kit.sdk.core.metrics.a.a */
public final class C18264a implements MetricPublisher<OpMetric> {

    /* renamed from: a */
    private final SharedPreferences f50441a;

    /* renamed from: b */
    private final MetricsClient f50442b;

    /* renamed from: c */
    private final C18268a f50443c;

    public final List<C18267b<OpMetric>> getPersistedEvents() {
        return this.f50443c.mo36432a(OpMetric.ADAPTER, this.f50441a.getString("unsent_operational_metrics", null));
    }

    public final void persistMetrics(List<C18267b<OpMetric>> list) {
        this.f50441a.edit().putString("unsent_operational_metrics", this.f50443c.mo36431a(list)).apply();
    }

    public final void publishMetrics(List<OpMetric> list, final PublishCallback publishCallback) {
        MetricsClient metricsClient = this.f50442b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (OpMetric opMetric : list) {
            if (opMetric.counter_metric != null) {
                arrayList.add(opMetric.counter_metric);
            } else if (opMetric.timer_metric != null) {
                arrayList2.add(opMetric.timer_metric);
            } else if (opMetric.level_metric != null) {
                arrayList3.add(opMetric.level_metric);
            }
        }
        metricsClient.postOperationalMetrics(new Builder().counters(arrayList).timers(arrayList2).levels(arrayList3).build()).mo110595a(new C53094d<Void>() {
            /* renamed from: a */
            public final void mo36429a(C53061b<Void> bVar, Throwable th) {
                if (th instanceof IOException) {
                    publishCallback.onNetworkError();
                } else {
                    publishCallback.onServerError(new Error(th));
                }
            }

            /* renamed from: a */
            public final void mo36428a(C53061b<Void> bVar, C53133m<Void> mVar) {
                if (mVar.mo110646c()) {
                    publishCallback.onSuccess();
                    return;
                }
                try {
                    publishCallback.onServerError(new Error(mVar.f131637c.string()));
                } catch (IOException | NullPointerException unused) {
                    publishCallback.onServerError(new Error("response unsuccessful"));
                }
            }
        });
    }

    C18264a(SharedPreferences sharedPreferences, MetricsClient metricsClient, C18268a aVar) {
        this.f50441a = sharedPreferences;
        this.f50442b = metricsClient;
        this.f50443c = aVar;
    }
}
