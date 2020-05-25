package com.twitter.sdk.android.core;

import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Service;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.twitter.sdk.android.core.e */
public final class C52072e {

    /* renamed from: a */
    public final C52189k<C52070d> f129654a;

    /* renamed from: b */
    private final OAuth2Service f129655b;

    /* renamed from: b */
    private void m111390b() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f129655b.mo108834a(new C52068b<GuestAuthToken>() {
            /* renamed from: a */
            public final void mo23367a(C52229t tVar) {
                C52072e.this.f129654a.mo108772b(0);
                countDownLatch.countDown();
            }

            /* renamed from: a */
            public final void mo23366a(C52077i<GuestAuthToken> iVar) {
                C52072e.this.f129654a.mo108770a(new C52070d((GuestAuthToken) iVar.f129666a));
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            this.f129654a.mo108772b(0);
        }
    }

    /* renamed from: a */
    public final synchronized C52070d mo108766a() {
        boolean z;
        C52070d dVar = (C52070d) this.f129654a.mo108768a();
        if (dVar == null || dVar.f129901a == null || ((GuestAuthToken) dVar.f129901a).mo108827a()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return dVar;
        }
        m111390b();
        return (C52070d) this.f129654a.mo108768a();
    }

    /* renamed from: a */
    public final synchronized C52070d mo108767a(C52070d dVar) {
        C52070d dVar2 = (C52070d) this.f129654a.mo108768a();
        if (dVar != null && dVar.equals(dVar2)) {
            m111390b();
        }
        return (C52070d) this.f129654a.mo108768a();
    }

    public C52072e(OAuth2Service oAuth2Service, C52189k<C52070d> kVar) {
        this.f129655b = oAuth2Service;
        this.f129654a = kVar;
    }
}
