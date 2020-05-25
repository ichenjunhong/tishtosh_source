package com.p683ss.android.ugc.aweme.detail.operators;

import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import com.p683ss.android.ugc.aweme.tutorial.p2374a.C47374b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.i */
public final class C27445i extends C27403a<C47374b, C26876b<C47374b>> {
    public final int getPageType(int i) {
        return i + 13000;
    }

    public C27445i(C26875a<?, ?> aVar) {
        if (!(aVar instanceof C47374b)) {
            aVar = null;
        }
        C47374b bVar = (C47374b) aVar;
        if (bVar == null) {
            bVar = new C47374b();
        }
        this.mModel = bVar;
        this.mPresenter = new C26876b();
    }

    public final void request(int i, C30669b bVar, int i2, boolean z) {
        C52711k.m112240b(bVar, "feedParam");
        this.mPresenter.mo44934a_(Integer.valueOf(i), bVar.getTutorialId(), Integer.valueOf(bVar.getVideoType()));
    }
}
