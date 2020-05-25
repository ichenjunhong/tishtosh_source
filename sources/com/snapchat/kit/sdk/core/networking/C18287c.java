package com.snapchat.kit.sdk.core.networking;

import com.snapchat.kit.sdk.OAuth2Manager;
import com.snapchat.kit.sdk.core.controller.C18250a;
import com.snapchat.kit.sdk.core.security.Fingerprint;
import okhttp3.C53498ab.C53499a;
import okhttp3.C53676u.C53677a;

/* renamed from: com.snapchat.kit.sdk.core.networking.c */
public final class C18287c extends C18289e {

    /* renamed from: b */
    private final Fingerprint f50490b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C53499a mo36690a(C53677a aVar) {
        C53499a a = super.mo36690a(aVar);
        String a2 = this.f50490b.mo36693a();
        if (a2 != null) {
            a.mo111263a("X-Snap-SDK-Client-Auth-Token", a2);
        }
        return a;
    }

    C18287c(OAuth2Manager oAuth2Manager, C18250a aVar, String str, Fingerprint fingerprint) {
        super(oAuth2Manager, aVar, str);
        this.f50490b = fingerprint;
    }
}
