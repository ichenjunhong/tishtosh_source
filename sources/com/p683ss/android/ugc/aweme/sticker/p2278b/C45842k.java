package com.p683ss.android.ugc.aweme.sticker.p2278b;

import com.p683ss.android.ugc.aweme.common.p1592d.C26864a;
import com.p683ss.android.ugc.aweme.effect.p1676e.p1677a.C29190b;
import com.p683ss.android.ugc.aweme.effect.p1676e.p1678b.C29192b;
import com.p683ss.android.ugc.aweme.effect.p1676e.p1678b.C29195e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.b.k */
public final class C45842k implements C26864a {

    /* renamed from: a */
    private final C29192b<C45830f, Void> f115859a;

    /* renamed from: b */
    private final C29190b<C45830f, Void> f115860b;

    /* renamed from: a */
    public final void mo54823a(String str) {
        this.f115859a.mo59080a(3);
        this.f115859a.f76495d = null;
        this.f115860b.mo59067b(this.f115859a);
    }

    public C45842k(C29192b<C45830f, Void> bVar, C29190b<C45830f, Void> bVar2) {
        C52711k.m112240b(bVar, "task");
        C52711k.m112240b(bVar2, "callback");
        this.f115859a = bVar;
        this.f115860b = bVar2;
    }

    /* renamed from: a */
    public final void mo54824a(String str, Exception exc) {
        this.f115859a.mo59080a(4);
        this.f115859a.f76496e = new C29195e(Integer.valueOf(-1), exc.getMessage(), exc);
        this.f115860b.mo59072c(this.f115859a);
    }
}
