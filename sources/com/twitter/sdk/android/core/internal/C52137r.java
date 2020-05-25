package com.twitter.sdk.android.core.internal;

import com.twitter.sdk.android.core.C52188j;
import com.twitter.sdk.android.core.C52191m;
import com.twitter.sdk.android.core.C52231v;
import com.twitter.sdk.android.core.internal.scribe.C52143a;
import com.twitter.sdk.android.core.internal.scribe.C52154ae;
import com.twitter.sdk.android.core.internal.scribe.C52158e;
import com.twitter.sdk.android.core.internal.scribe.C52158e.C52159a;
import com.twitter.sdk.android.core.services.AccountService;
import java.io.IOException;

/* renamed from: com.twitter.sdk.android.core.internal.r */
public final class C52137r implements C52124o<C52231v> {

    /* renamed from: a */
    private final C52138a f129777a = new C52138a();

    /* renamed from: b */
    private final C52143a f129778b = C52154ae.m111531a();

    /* renamed from: com.twitter.sdk.android.core.internal.r$a */
    protected static class C52138a {
        protected C52138a() {
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo108826a(C52188j jVar) {
        AccountService a = new C52191m((C52231v) jVar).mo108921a();
        try {
            if (this.f129778b != null) {
                C52158e a2 = new C52159a().mo108873a("android").mo108875b("credentials").mo108876c("").mo108877d("").mo108878e("").mo108879f("impression").mo108874a();
                this.f129778b.mo108852a(a2);
            }
            a.verifyCredentials(Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(false)).mo110594a();
        } catch (IOException | RuntimeException unused) {
        }
    }
}
