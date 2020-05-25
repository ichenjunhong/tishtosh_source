package com.twitter.sdk.android.core.internal.oauth;

import okhttp3.C53504ad;
import okhttp3.C53676u;
import okhttp3.C53676u.C53677a;

/* renamed from: com.twitter.sdk.android.core.internal.oauth.e */
final /* synthetic */ class C52134e implements C53676u {

    /* renamed from: a */
    private final C52133d f129775a;

    C52134e(C52133d dVar) {
        this.f129775a = dVar;
    }

    public final C53504ad intercept(C53677a aVar) {
        return aVar.mo111417a(aVar.mo111416a().mo111256a().mo111263a("User-Agent", this.f129775a.f129773d).mo111272c());
    }
}
