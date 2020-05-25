package com.p683ss.android.ugc.aweme.detail.operators;

import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import com.p683ss.android.ugc.aweme.movie.p1968b.C37176a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.q */
public final class C27466q extends C27403a<C37176a, C26876b<C37176a>> {
    public final int getPageType(int i) {
        return i + 11000;
    }

    public C27466q(C26875a<?, ?> aVar) {
        if (!(aVar instanceof C37176a)) {
            aVar = null;
        }
        C37176a aVar2 = (C37176a) aVar;
        if (aVar2 == null) {
            aVar2 = new C37176a();
        }
        this.mModel = aVar2;
        this.mPresenter = new C26876b();
    }

    public final void request(int i, C30669b bVar, int i2, boolean z) {
        C52711k.m112240b(bVar, "feedParam");
        this.mPresenter.mo44934a_(Integer.valueOf(i), bVar.getMvId(), Integer.valueOf(bVar.getVideoType()));
    }
}
