package com.snapchat.kit.sdk.creative;

import android.content.Context;
import com.snapchat.kit.sdk.SnapKitComponent;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.business.KitEventBaseFactory;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.creative.api.SnapCreativeKitApi;
import com.snapchat.kit.sdk.creative.api.SnapCreativeKitApi_Factory;
import com.snapchat.kit.sdk.creative.media.SnapMediaFactory;
import com.snapchat.kit.sdk.creative.media.SnapMediaFactory_Factory;
import com.snapchat.kit.sdk.creative.p1093b.C18307a;
import com.snapchat.kit.sdk.creative.p1093b.C18308b;
import com.snapchat.kit.sdk.creative.p1093b.C18309c;
import dagger.p2651a.C52866c;
import dagger.p2651a.C52869f;
import javax.p2677a.C53188a;

/* renamed from: com.snapchat.kit.sdk.creative.a */
public final class C18302a implements CreativeComponent {

    /* renamed from: a */
    private SnapKitComponent f50516a;

    /* renamed from: b */
    private C53188a<MetricQueue<OpMetric>> f50517b;

    /* renamed from: c */
    private C53188a<C18308b> f50518c;

    /* renamed from: com.snapchat.kit.sdk.creative.a$a */
    public static final class C18304a {

        /* renamed from: a */
        public SnapKitComponent f50519a;

        private C18304a() {
        }
    }

    /* renamed from: com.snapchat.kit.sdk.creative.a$b */
    static class C18305b implements C53188a<MetricQueue<OpMetric>> {

        /* renamed from: a */
        private final SnapKitComponent f50520a;

        public final /* synthetic */ Object get() {
            return (MetricQueue) C52869f.m112471a(this.f50520a.operationalMetricsQueue(), "Cannot return null from a non-@Nullable component method");
        }

        C18305b(SnapKitComponent snapKitComponent) {
            this.f50520a = snapKitComponent;
        }
    }

    public final SnapMediaFactory getMediaFactory() {
        return SnapMediaFactory_Factory.newSnapMediaFactory((C18308b) this.f50518c.get());
    }

    public final SnapCreativeKitApi getApi() {
        return SnapCreativeKitApi_Factory.newSnapCreativeKitApi((Context) C52869f.m112471a(this.f50516a.context(), "Cannot return null from a non-@Nullable component method"), (String) C52869f.m112471a(this.f50516a.clientId(), "Cannot return null from a non-@Nullable component method"), (String) C52869f.m112471a(this.f50516a.redirectUrl(), "Cannot return null from a non-@Nullable component method"), (C18308b) this.f50518c.get(), (MetricQueue) C52869f.m112471a(this.f50516a.analyticsEventQueue(), "Cannot return null from a non-@Nullable component method"), new C18307a((KitEventBaseFactory) C52869f.m112471a(this.f50516a.kitEventBaseFactory(), "Cannot return null from a non-@Nullable component method")));
    }

    private C18302a(C18304a aVar) {
        this.f50516a = aVar.f50519a;
        this.f50517b = new C18305b(aVar.f50519a);
        this.f50518c = C52866c.m112468a(new C18309c(this.f50517b));
    }
}
