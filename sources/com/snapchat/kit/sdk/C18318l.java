package com.snapchat.kit.sdk;

import android.os.Handler;
import android.os.Looper;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

/* renamed from: com.snapchat.kit.sdk.l */
public final class C18318l implements C52867d<Handler> {

    /* renamed from: a */
    private final C18249c f50560a;

    public final /* synthetic */ Object get() {
        return (Handler) C52869f.m112471a(new Handler(Looper.getMainLooper()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public C18318l(C18249c cVar) {
        this.f50560a = cVar;
    }
}
