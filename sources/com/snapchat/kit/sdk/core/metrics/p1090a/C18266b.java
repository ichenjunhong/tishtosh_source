package com.snapchat.kit.sdk.core.metrics.p1090a;

import android.content.SharedPreferences;
import com.snapchat.kit.sdk.core.metrics.MetricsClient;
import com.snapchat.kit.sdk.core.metrics.p1091b.C18268a;
import dagger.p2651a.C52867d;
import javax.p2677a.C53188a;

/* renamed from: com.snapchat.kit.sdk.core.metrics.a.b */
public final class C18266b implements C52867d<C18264a> {

    /* renamed from: a */
    private final C53188a<SharedPreferences> f50446a;

    /* renamed from: b */
    private final C53188a<MetricsClient> f50447b;

    /* renamed from: c */
    private final C53188a<C18268a> f50448c;

    public final /* synthetic */ Object get() {
        return new C18264a((SharedPreferences) this.f50446a.get(), (MetricsClient) this.f50447b.get(), (C18268a) this.f50448c.get());
    }

    public C18266b(C53188a<SharedPreferences> aVar, C53188a<MetricsClient> aVar2, C53188a<C18268a> aVar3) {
        this.f50446a = aVar;
        this.f50447b = aVar2;
        this.f50448c = aVar3;
    }
}
