package com.snapchat.kit.sdk.core.networking;

import com.snapchat.kit.sdk.OAuth2Manager;
import com.snapchat.kit.sdk.core.controller.C18250a;
import dagger.p2651a.C52867d;
import javax.p2677a.C53188a;

/* renamed from: com.snapchat.kit.sdk.core.networking.f */
public final class C18291f implements C52867d<C18289e> {

    /* renamed from: a */
    private final C53188a<OAuth2Manager> f50499a;

    /* renamed from: b */
    private final C53188a<C18250a> f50500b;

    /* renamed from: c */
    private final C53188a<String> f50501c;

    public final /* synthetic */ Object get() {
        return new C18289e((OAuth2Manager) this.f50499a.get(), (C18250a) this.f50500b.get(), (String) this.f50501c.get());
    }

    public C18291f(C53188a<OAuth2Manager> aVar, C53188a<C18250a> aVar2, C53188a<String> aVar3) {
        this.f50499a = aVar;
        this.f50500b = aVar2;
        this.f50501c = aVar3;
    }
}
