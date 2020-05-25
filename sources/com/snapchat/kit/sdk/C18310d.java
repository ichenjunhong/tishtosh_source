package com.snapchat.kit.sdk;

import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;
import okhttp3.C53515c;

/* renamed from: com.snapchat.kit.sdk.d */
public final class C18310d implements C52867d<C53515c> {

    /* renamed from: a */
    private final C18249c f50543a;

    public final /* synthetic */ Object get() {
        return (C53515c) C52869f.m112471a(new C53515c(this.f50543a.f50410a.getCacheDir(), 1048576), "Cannot return null from a non-@Nullable @Provides method");
    }

    public C18310d(C18249c cVar) {
        this.f50543a = cVar;
    }
}
