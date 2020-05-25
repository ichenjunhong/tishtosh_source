package com.p683ss.android.ugc.aweme.detail.operators;

import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.detail.operators.C27419al.C27421b;
import com.p683ss.android.ugc.aweme.detail.p1627i.C27371e;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30504w;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import com.p683ss.android.ugc.aweme.follow.presenter.C31877a;
import com.p683ss.android.ugc.aweme.follow.presenter.C31882e;
import com.p683ss.android.ugc.aweme.newfollow.util.C37934d;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.l */
public final class C27448l extends C27403a<C31877a, C27371e> implements C27421b {
    public final int getPageType(int i) {
        return 1;
    }

    public final void bindPreLoadView(C30504w wVar) {
        ((C27371e) this.mPresenter).f72150a = wVar;
    }

    public final void setPreLoad(boolean z) {
        ((C27371e) this.mPresenter).f72151b = z;
    }

    public C27448l(C26875a aVar) {
        C31877a aVar2;
        if (aVar instanceof C31877a) {
            aVar2 = (C31877a) aVar;
        } else {
            aVar2 = new C31877a();
        }
        this.mModel = aVar2;
        this.mPresenter = new C27371e();
    }

    public final void request(int i, C30669b bVar, int i2, boolean z) {
        if (i == 1) {
            ((C27371e) this.mPresenter).mo44934a_(Integer.valueOf(1), C31882e.m74310a(1, 0, 0, C37934d.m84797a(C22858c.f61207c).mo77398c()).mo65085a());
        } else if (i == 4) {
            ((C27371e) this.mPresenter).mo44934a_(Integer.valueOf(4), C31882e.m74310a(4, 2, 0, C37934d.m84797a(C22858c.f61207c).mo77398c()).mo65086a(C37934d.m84797a(C22858c.f61207c).mo77394a()).mo65085a());
        } else {
            ((C27371e) this.mPresenter).mo44934a_(Integer.valueOf(i), C31882e.m74310a(i, 2, 0, C37934d.m84797a(C22858c.f61207c).mo77398c()).mo65086a(C37934d.m84797a(C22858c.f61207c).mo77394a()).mo65085a());
        }
    }
}
