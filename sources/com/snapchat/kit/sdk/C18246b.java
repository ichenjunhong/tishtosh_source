package com.snapchat.kit.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import com.google.gson.C17971f;
import com.snapchat.kit.sdk.core.controller.C18250a;
import com.snapchat.kit.sdk.core.controller.C18255b;
import com.snapchat.kit.sdk.core.controller.LoginStateController;
import com.snapchat.kit.sdk.core.metrics.C18256a;
import com.snapchat.kit.sdk.core.metrics.C18280c;
import com.snapchat.kit.sdk.core.metrics.C18281d;
import com.snapchat.kit.sdk.core.metrics.C18282e;
import com.snapchat.kit.sdk.core.metrics.C18283f;
import com.snapchat.kit.sdk.core.metrics.C18284g;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.MetricsClient;
import com.snapchat.kit.sdk.core.metrics.business.C18271a;
import com.snapchat.kit.sdk.core.metrics.business.C18273b;
import com.snapchat.kit.sdk.core.metrics.business.C18274c;
import com.snapchat.kit.sdk.core.metrics.business.C18275d;
import com.snapchat.kit.sdk.core.metrics.business.C18276e;
import com.snapchat.kit.sdk.core.metrics.business.C18277f;
import com.snapchat.kit.sdk.core.metrics.business.C18278g;
import com.snapchat.kit.sdk.core.metrics.business.C18279h;
import com.snapchat.kit.sdk.core.metrics.business.KitEventBaseFactory;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.metrics.p1090a.C18264a;
import com.snapchat.kit.sdk.core.metrics.p1090a.C18266b;
import com.snapchat.kit.sdk.core.metrics.p1091b.C18268a;
import com.snapchat.kit.sdk.core.metrics.p1091b.C18270b;
import com.snapchat.kit.sdk.core.networking.AuthTokenManager;
import com.snapchat.kit.sdk.core.networking.C18285a;
import com.snapchat.kit.sdk.core.networking.C18287c;
import com.snapchat.kit.sdk.core.networking.C18288d;
import com.snapchat.kit.sdk.core.networking.C18289e;
import com.snapchat.kit.sdk.core.networking.C18291f;
import com.snapchat.kit.sdk.core.networking.ClientFactory;
import com.snapchat.kit.sdk.core.security.C18294b;
import com.snapchat.kit.sdk.core.security.C18301g;
import com.snapchat.kit.sdk.core.security.Fingerprint;
import dagger.p2651a.C52865b;
import dagger.p2651a.C52866c;
import dagger.p2651a.C52869f;
import java.util.concurrent.ScheduledExecutorService;
import javax.p2677a.C53188a;
import okhttp3.C53515c;
import okhttp3.C53682y;

/* renamed from: com.snapchat.kit.sdk.b */
public final class C18246b implements SnapKitComponent {

    /* renamed from: a */
    private C53188a<Context> f50383a;

    /* renamed from: b */
    private C53188a<C17971f> f50384b;

    /* renamed from: c */
    private C53188a<SharedPreferences> f50385c;

    /* renamed from: d */
    private C53188a<C18301g> f50386d;

    /* renamed from: e */
    private C53188a<Handler> f50387e;

    /* renamed from: f */
    private C53188a<C18250a> f50388f;

    /* renamed from: g */
    private C53188a<C53682y> f50389g;

    /* renamed from: h */
    private C53188a<C18279h> f50390h;

    /* renamed from: i */
    private C53188a<C53515c> f50391i;

    /* renamed from: j */
    private C53188a<String> f50392j;

    /* renamed from: k */
    private C53188a<C18289e> f50393k;

    /* renamed from: l */
    private C53188a<Fingerprint> f50394l;

    /* renamed from: m */
    private C53188a<C18287c> f50395m;

    /* renamed from: n */
    private C53188a<ClientFactory> f50396n;

    /* renamed from: o */
    private C53188a<MetricsClient> f50397o;

    /* renamed from: p */
    private C53188a<C18268a> f50398p;

    /* renamed from: q */
    private C53188a<C18271a> f50399q;

    /* renamed from: r */
    private C53188a<ScheduledExecutorService> f50400r;

    /* renamed from: s */
    private C53188a<C18256a<ServerEvent>> f50401s;

    /* renamed from: t */
    private C53188a<C18274c> f50402t;

    /* renamed from: u */
    private C53188a<KitEventBaseFactory> f50403u;

    /* renamed from: v */
    private C53188a<C18276e> f50404v;

    /* renamed from: w */
    private C53188a<C18264a> f50405w;

    /* renamed from: x */
    private C53188a<MetricQueue<OpMetric>> f50406x;

    /* renamed from: y */
    private C53188a<OAuth2Manager> f50407y;

    /* renamed from: z */
    private C18249c f50408z;

    /* renamed from: com.snapchat.kit.sdk.b$a */
    public static final class C18248a {
        /* access modifiers changed from: 0000 */

        /* renamed from: a */
        public C18249c f50409a;

        private C18248a() {
        }
    }

    public final MetricQueue<ServerEvent> analyticsEventQueue() {
        return (MetricQueue) this.f50402t.get();
    }

    public final ClientFactory apiFactory() {
        return (ClientFactory) this.f50396n.get();
    }

    public final String clientId() {
        return (String) C52869f.m112471a(this.f50408z.f50411b, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final Context context() {
        return (Context) this.f50383a.get();
    }

    public final C17971f gson() {
        return (C17971f) this.f50384b.get();
    }

    public final KitEventBaseFactory kitEventBaseFactory() {
        return new KitEventBaseFactory(clientId());
    }

    public final MetricQueue<OpMetric> operationalMetricsQueue() {
        return (MetricQueue) this.f50406x.get();
    }

    public final String redirectUrl() {
        return (String) C52869f.m112471a(this.f50408z.f50412c, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final SharedPreferences sharedPreferences() {
        return (SharedPreferences) this.f50385c.get();
    }

    public final AuthTokenManager authTokenManager() {
        return (AuthTokenManager) C52869f.m112471a((OAuth2Manager) this.f50407y.get(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final LoginStateController logoutController() {
        return (LoginStateController) C52869f.m112471a((C18250a) this.f50388f.get(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void inject(SnapKitActivity snapKitActivity) {
        snapKitActivity.f50373a = (OAuth2Manager) this.f50407y.get();
    }

    private C18246b(C18248a aVar) {
        this.f50383a = C52866c.m112468a(new C18312f(aVar.f50409a));
        this.f50384b = C52866c.m112468a(new C18313g(aVar.f50409a));
        this.f50385c = C52866c.m112468a(new C18317k(aVar.f50409a));
        this.f50386d = C52866c.m112468a(new C18316j(aVar.f50409a, this.f50384b, this.f50385c));
        this.f50387e = new C18318l(aVar.f50409a);
        this.f50388f = C52866c.m112468a(new C18255b(this.f50387e));
        this.f50389g = C52866c.m112468a(new C18315i(aVar.f50409a));
        this.f50390h = new C18284g(this.f50385c);
        this.f50391i = C52866c.m112468a(new C18310d(aVar.f50409a));
        this.f50407y = new C52865b();
        this.f50392j = new C18311e(aVar.f50409a);
        this.f50393k = C52866c.m112468a(new C18291f(this.f50407y, this.f50388f, this.f50392j));
        this.f50394l = new C18294b(this.f50383a);
        this.f50395m = new C18288d(this.f50407y, this.f50388f, this.f50392j, this.f50394l);
        this.f50396n = C52866c.m112468a(new C18285a(this.f50391i, this.f50384b, this.f50393k, this.f50395m));
        this.f50397o = C52866c.m112468a(new C18281d(this.f50396n));
        this.f50398p = new C18270b(this.f50384b);
        this.f50399q = C52866c.m112468a(new C18273b(this.f50385c, this.f50390h, this.f50397o, this.f50398p));
        this.f50400r = C52866c.m112468a(C18283f.f50479a);
        this.f50401s = new C18280c(this.f50399q, this.f50400r);
        this.f50402t = C52866c.m112468a(new C18275d(this.f50390h, this.f50401s));
        this.f50403u = new C18278g(this.f50392j);
        this.f50404v = new C18277f(this.f50403u);
        this.f50405w = C52866c.m112468a(new C18266b(this.f50385c, this.f50397o, this.f50398p));
        this.f50406x = C52866c.m112468a(new C18282e(this.f50405w, this.f50400r));
        C52865b bVar = (C52865b) this.f50407y;
        C18314h hVar = new C18314h(aVar.f50409a, this.f50386d, this.f50388f, this.f50389g, this.f50384b, this.f50402t, this.f50404v, this.f50406x);
        this.f50407y = C52866c.m112468a(hVar);
        C53188a<OAuth2Manager> aVar2 = this.f50407y;
        if (aVar2 == null) {
            throw new IllegalArgumentException();
        } else if (bVar.f131112a == null) {
            bVar.f131112a = aVar2;
            this.f50408z = aVar.f50409a;
        } else {
            throw new IllegalStateException();
        }
    }
}
