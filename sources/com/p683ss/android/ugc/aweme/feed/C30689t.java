package com.p683ss.android.ugc.aweme.feed;

import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30480d;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.t */
public final class C30689t {

    /* renamed from: a */
    public int f80316a;

    /* renamed from: b */
    public boolean f80317b;

    /* renamed from: c */
    private C26876b<C30480d> f80318c;

    /* renamed from: a */
    public final boolean mo63269a() {
        int i = this.f80316a;
        C26875a aVar = (C26875a) this.f80318c.mo54803n();
        C52711k.m112236a((Object) aVar, "mPresenter.model");
        if (i >= ((C30480d) aVar).getItems().size() - 1 || C23794bh.m58381G().mo47243d()) {
            return false;
        }
        return true;
    }

    public C30689t(C26876b<C30480d> bVar) {
        C52711k.m112240b(bVar, "mPresenter");
        this.f80318c = bVar;
    }
}
