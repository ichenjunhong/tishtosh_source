package com.p683ss.android.ugc.aweme.detail.operators;

import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.detail.operators.C27419al.C27421b;
import com.p683ss.android.ugc.aweme.detail.p1627i.C27372f;
import com.p683ss.android.ugc.aweme.discover.mixfeed.C28335n;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30504w;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.aa */
public final class C27404aa extends C27403a<C28335n, C27372f> implements C27421b {
    public final int getPageType(int i) {
        return 9;
    }

    public final void bindPreLoadView(C30504w wVar) {
        ((C27372f) this.mPresenter).f72150a = wVar;
    }

    public final void setPreLoad(boolean z) {
        C26876b bVar = this.mPresenter;
        C52711k.m112236a((Object) bVar, "mPresenter");
        ((C27372f) bVar).f72151b = z;
    }

    public C27404aa(C26875a<?, ?> aVar) {
        C28335n nVar;
        if (aVar instanceof C28335n) {
            nVar = (C28335n) aVar;
        } else {
            nVar = new C28335n();
        }
        this.mModel = nVar;
        this.mPresenter = new C27372f();
    }

    public final void request(int i, C30669b bVar, int i2, boolean z) {
        C52711k.m112240b(bVar, "feedParam");
        if (i == 1) {
            ((C27372f) this.mPresenter).mo44934a_(Integer.valueOf(i), bVar.getSearchKeyword());
            return;
        }
        ((C27372f) this.mPresenter).mo44934a_(Integer.valueOf(i));
    }
}
