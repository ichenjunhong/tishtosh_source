package com.snapchat.kit.sdk.core.networking;

import com.google.gson.C17971f;
import dagger.p2651a.C52867d;
import javax.p2677a.C53188a;
import okhttp3.C53515c;

/* renamed from: com.snapchat.kit.sdk.core.networking.a */
public final class C18285a implements C52867d<ClientFactory> {

    /* renamed from: a */
    private final C53188a<C53515c> f50485a;

    /* renamed from: b */
    private final C53188a<C17971f> f50486b;

    /* renamed from: c */
    private final C53188a<C18289e> f50487c;

    /* renamed from: d */
    private final C53188a<C18287c> f50488d;

    public final /* synthetic */ Object get() {
        return new ClientFactory((C53515c) this.f50485a.get(), (C17971f) this.f50486b.get(), (C18289e) this.f50487c.get(), (C18287c) this.f50488d.get());
    }

    public C18285a(C53188a<C53515c> aVar, C53188a<C17971f> aVar2, C53188a<C18289e> aVar3, C53188a<C18287c> aVar4) {
        this.f50485a = aVar;
        this.f50486b = aVar2;
        this.f50487c = aVar3;
        this.f50488d = aVar4;
    }
}
