package com.snapchat.kit.sdk.core.metrics.business;

import android.content.SharedPreferences;
import com.snapchat.kit.sdk.core.metrics.MetricsClient;
import com.snapchat.kit.sdk.core.metrics.p1091b.C18268a;
import dagger.p2651a.C52867d;
import javax.p2677a.C53188a;

/* renamed from: com.snapchat.kit.sdk.core.metrics.business.b */
public final class C18273b implements C52867d<C18271a> {

    /* renamed from: a */
    private final C53188a<SharedPreferences> f50461a;

    /* renamed from: b */
    private final C53188a<C18279h> f50462b;

    /* renamed from: c */
    private final C53188a<MetricsClient> f50463c;

    /* renamed from: d */
    private final C53188a<C18268a> f50464d;

    public final /* synthetic */ Object get() {
        return new C18271a((SharedPreferences) this.f50461a.get(), (C18279h) this.f50462b.get(), (MetricsClient) this.f50463c.get(), (C18268a) this.f50464d.get());
    }

    public C18273b(C53188a<SharedPreferences> aVar, C53188a<C18279h> aVar2, C53188a<MetricsClient> aVar3, C53188a<C18268a> aVar4) {
        this.f50461a = aVar;
        this.f50462b = aVar2;
        this.f50463c = aVar3;
        this.f50464d = aVar4;
    }
}
