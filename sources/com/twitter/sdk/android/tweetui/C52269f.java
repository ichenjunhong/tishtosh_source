package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.C52068b;
import com.twitter.sdk.android.core.C52075g;
import com.twitter.sdk.android.core.C52229t;

/* renamed from: com.twitter.sdk.android.tweetui.f */
abstract class C52269f<T> extends C52068b<T> {

    /* renamed from: a */
    private final C52068b f130142a;

    /* renamed from: b */
    private final C52075g f130143b;

    /* renamed from: a */
    public final void mo23367a(C52229t tVar) {
        tVar.getMessage();
        if (this.f130142a != null) {
            this.f130142a.mo23367a(tVar);
        }
    }

    C52269f(C52068b bVar, C52075g gVar) {
        this.f130142a = bVar;
        this.f130143b = gVar;
    }
}
