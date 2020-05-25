package com.twitter.sdk.android.tweetui;

import android.os.Handler;
import android.support.p030v4.p038f.C0786h;
import com.twitter.sdk.android.core.C52068b;
import com.twitter.sdk.android.core.C52077i;
import com.twitter.sdk.android.core.C52189k;
import com.twitter.sdk.android.core.C52220o;
import com.twitter.sdk.android.core.C52225r;
import com.twitter.sdk.android.core.C52229t;
import com.twitter.sdk.android.core.C52231v;
import com.twitter.sdk.android.core.models.C52209m;

/* renamed from: com.twitter.sdk.android.tweetui.o */
final class C52307o {

    /* renamed from: a */
    public final C52225r f130255a;

    /* renamed from: b */
    final C0786h<Long, C52209m> f130256b;

    /* renamed from: c */
    final C0786h<Long, Object> f130257c;

    /* renamed from: d */
    private final Handler f130258d;

    /* renamed from: e */
    private final C52189k<C52231v> f130259e;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo109118a(C52068b<C52231v> bVar) {
        C52231v vVar = (C52231v) this.f130259e.mo108768a();
        if (vVar == null) {
            bVar.mo23367a((C52229t) new C52220o("User authorization required"));
        } else {
            bVar.mo23366a(new C52077i<>(vVar, null));
        }
    }

    C52307o(Handler handler, C52189k<C52231v> kVar) {
        this(handler, kVar, C52225r.m111638a());
    }

    private C52307o(Handler handler, C52189k<C52231v> kVar, C52225r rVar) {
        this.f130255a = rVar;
        this.f130258d = handler;
        this.f130259e = kVar;
        this.f130256b = new C0786h<>(20);
        this.f130257c = new C0786h<>(20);
    }
}
