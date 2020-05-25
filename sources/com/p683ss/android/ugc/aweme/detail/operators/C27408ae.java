package com.p683ss.android.ugc.aweme.detail.operators;

import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.detail.operators.C27419al.C27421b;
import com.p683ss.android.ugc.aweme.detail.p1627i.C27373g;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30504w;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import com.p683ss.android.ugc.aweme.p1442bo.p1444b.C23868a;
import com.p683ss.android.ugc.aweme.p1442bo.p1444b.C23870b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.ae */
public final class C27408ae extends C27403a<C23868a, C27373g> implements C27421b {
    public final int getPageType(int i) {
        return 24;
    }

    public final void bindPreLoadView(C30504w wVar) {
        ((C27373g) this.mPresenter).f72150a = wVar;
    }

    public final void setPreLoad(boolean z) {
        C26876b bVar = this.mPresenter;
        C52711k.m112236a((Object) bVar, "mPresenter");
        ((C27373g) bVar).f72151b = z;
    }

    public C27408ae(C26875a<?, ?> aVar) {
        C23868a aVar2;
        if (aVar instanceof C23868a) {
            aVar2 = (C23868a) aVar;
        } else {
            aVar2 = new C23868a();
        }
        this.mModel = aVar2;
        this.mPresenter = new C27373g();
    }

    public final void request(int i, C30669b bVar, int i2, boolean z) {
        C52711k.m112240b(bVar, "feedParam");
        if (i == 1) {
            ((C27373g) this.mPresenter).mo44934a_(Integer.valueOf(i), new C23870b());
            return;
        }
        ((C27373g) this.mPresenter).mo44934a_(Integer.valueOf(i), new C23870b());
    }
}
