package com.snapchat.kit.sdk.core.networking;

import com.snapchat.kit.sdk.OAuth2Manager;
import com.snapchat.kit.sdk.core.controller.C18250a;
import com.snapchat.kit.sdk.core.security.Fingerprint;
import dagger.p2651a.C52867d;
import javax.p2677a.C53188a;

/* renamed from: com.snapchat.kit.sdk.core.networking.d */
public final class C18288d implements C52867d<C18287c> {

    /* renamed from: a */
    private final C53188a<OAuth2Manager> f50491a;

    /* renamed from: b */
    private final C53188a<C18250a> f50492b;

    /* renamed from: c */
    private final C53188a<String> f50493c;

    /* renamed from: d */
    private final C53188a<Fingerprint> f50494d;

    public final /* synthetic */ Object get() {
        return new C18287c((OAuth2Manager) this.f50491a.get(), (C18250a) this.f50492b.get(), (String) this.f50493c.get(), (Fingerprint) this.f50494d.get());
    }

    public C18288d(C53188a<OAuth2Manager> aVar, C53188a<C18250a> aVar2, C53188a<String> aVar3, C53188a<Fingerprint> aVar4) {
        this.f50491a = aVar;
        this.f50492b = aVar2;
        this.f50493c = aVar3;
        this.f50494d = aVar4;
    }
}
