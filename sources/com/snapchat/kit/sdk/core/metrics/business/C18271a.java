package com.snapchat.kit.sdk.core.metrics.business;

import android.content.SharedPreferences;
import com.snapchat.kit.sdk.core.dagger.scope.SnapConnectScope;
import com.snapchat.kit.sdk.core.metrics.C18267b;
import com.snapchat.kit.sdk.core.metrics.MetricPublisher;
import com.snapchat.kit.sdk.core.metrics.MetricPublisher.PublishCallback;
import com.snapchat.kit.sdk.core.metrics.MetricsClient;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.metrics.model.ServerEventBatch.Builder;
import com.snapchat.kit.sdk.core.metrics.p1091b.C18268a;
import java.io.IOException;
import java.util.List;
import p2666g.C53061b;
import p2666g.C53094d;
import p2666g.C53133m;

@SnapConnectScope
/* renamed from: com.snapchat.kit.sdk.core.metrics.business.a */
public final class C18271a implements MetricPublisher<ServerEvent> {

    /* renamed from: a */
    private final SharedPreferences f50455a;

    /* renamed from: b */
    private final C18279h f50456b;

    /* renamed from: c */
    private final MetricsClient f50457c;

    /* renamed from: d */
    private final C18268a f50458d;

    public final List<C18267b<ServerEvent>> getPersistedEvents() {
        return this.f50458d.mo36432a(ServerEvent.ADAPTER, this.f50455a.getString("unsent_analytics_events", null));
    }

    public final void persistMetrics(List<C18267b<ServerEvent>> list) {
        this.f50455a.edit().putString("unsent_analytics_events", this.f50458d.mo36431a(list)).apply();
    }

    public final void publishMetrics(List<ServerEvent> list, final PublishCallback publishCallback) {
        this.f50457c.postAnalytics(new Builder().server_events(list).max_sequence_id_on_instance(Long.valueOf(this.f50456b.f50473b)).build()).mo110595a(new C53094d<Void>() {
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
                }
                try {
                    publishCallback.onServerError(new Error(mVar.f131637c.string()));
                } catch (IOException | NullPointerException unused) {
                    publishCallback.onServerError(new Error("response unsuccessful"));
                }
            }
        });
    }

    C18271a(SharedPreferences sharedPreferences, C18279h hVar, MetricsClient metricsClient, C18268a aVar) {
        this.f50455a = sharedPreferences;
        this.f50456b = hVar;
        this.f50457c = metricsClient;
        this.f50458d = aVar;
    }
}
