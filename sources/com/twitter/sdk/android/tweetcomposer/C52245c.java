package com.twitter.sdk.android.tweetcomposer;

import java.util.Collections;

/* renamed from: com.twitter.sdk.android.tweetcomposer.c */
final class C52245c implements C52244b {

    /* renamed from: a */
    private final C52251i f130096a;

    /* renamed from: a */
    public final void mo108993a() {
        this.f130096a.mo108999a(C52254k.f130103a.mo108877d("").mo108878e("").mo108879f("impression").mo108874a(), Collections.EMPTY_LIST);
    }

    C52245c(C52251i iVar) {
        if (iVar != null) {
            this.f130096a = iVar;
            return;
        }
        throw new NullPointerException("scribeClient must not be null");
    }

    /* renamed from: a */
    public final void mo108994a(String str) {
        this.f130096a.mo108999a(C52254k.f130103a.mo108877d("").mo108878e(str).mo108879f("click").mo108874a(), Collections.EMPTY_LIST);
    }
}
