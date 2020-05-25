package com.snapchat.kit.sdk;

import com.google.gson.C17971f;
import com.snapchat.kit.sdk.core.controller.C18250a;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.business.C18276e;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.security.C18301g;
import dagger.p2651a.C52866c;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;
import javax.p2677a.C53188a;
import okhttp3.C53682y;

/* renamed from: com.snapchat.kit.sdk.h */
public final class C18314h implements C52867d<OAuth2Manager> {

    /* renamed from: a */
    private final C18249c f50547a;

    /* renamed from: b */
    private final C53188a<C18301g> f50548b;

    /* renamed from: c */
    private final C53188a<C18250a> f50549c;

    /* renamed from: d */
    private final C53188a<C53682y> f50550d;

    /* renamed from: e */
    private final C53188a<C17971f> f50551e;

    /* renamed from: f */
    private final C53188a<MetricQueue<ServerEvent>> f50552f;

    /* renamed from: g */
    private final C53188a<C18276e> f50553g;

    /* renamed from: h */
    private final C53188a<MetricQueue<OpMetric>> f50554h;

    public final /* synthetic */ Object get() {
        C18249c cVar = this.f50547a;
        OAuth2Manager oAuth2Manager = new OAuth2Manager(cVar.f50411b, cVar.f50412c, cVar.f50413d, cVar.f50410a, (C18301g) this.f50548b.get(), (C18250a) this.f50549c.get(), (C53682y) this.f50550d.get(), (C17971f) this.f50551e.get(), C52866c.m112469b(this.f50552f), (C18276e) this.f50553g.get(), C52866c.m112469b(this.f50554h));
        return (OAuth2Manager) C52869f.m112471a(oAuth2Manager, "Cannot return null from a non-@Nullable @Provides method");
    }

    public C18314h(C18249c cVar, C53188a<C18301g> aVar, C53188a<C18250a> aVar2, C53188a<C53682y> aVar3, C53188a<C17971f> aVar4, C53188a<MetricQueue<ServerEvent>> aVar5, C53188a<C18276e> aVar6, C53188a<MetricQueue<OpMetric>> aVar7) {
        this.f50547a = cVar;
        this.f50548b = aVar;
        this.f50549c = aVar2;
        this.f50550d = aVar3;
        this.f50551e = aVar4;
        this.f50552f = aVar5;
        this.f50553g = aVar6;
        this.f50554h = aVar7;
    }
}
