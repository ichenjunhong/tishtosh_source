package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.p1294a;

import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21829b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21838c;
import com.p683ss.android.ugc.aweme.account.util.C22275o;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.a.i */
public final class C21651i extends C21838c {

    /* renamed from: b */
    private final C21829b f58673b;

    /* renamed from: c */
    private final int f58674c;

    /* renamed from: d */
    private final String f58675d;

    /* renamed from: a */
    public final boolean mo45905a() {
        if (this.f58673b.isViewValid()) {
            this.f58673b.mo45582a(this.f58674c, C22275o.m55131a(Integer.valueOf(this.f58674c), this.f58675d));
        }
        return true;
    }

    public C21651i(C21829b bVar, int i, String str) {
        C52711k.m112240b(bVar, "baseFragment");
        C52711k.m112240b(str, "errorMessage");
        super(bVar);
        this.f58673b = bVar;
        this.f58674c = i;
        this.f58675d = str;
    }
}
