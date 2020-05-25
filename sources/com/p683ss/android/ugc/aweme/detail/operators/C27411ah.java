package com.p683ss.android.ugc.aweme.detail.operators;

import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.detail.operators.C27419al.C27421b;
import com.p683ss.android.ugc.aweme.detail.p1627i.C27374h;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30504w;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import com.p683ss.android.ugc.aweme.newfollow.p2001h.C37882b;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.ah */
public final class C27411ah extends C27403a<C37882b, C27374h> implements C27421b {
    public final int getPageType(int i) {
        return 1;
    }

    public final void bindPreLoadView(C30504w wVar) {
        ((C27374h) this.mPresenter).f72150a = wVar;
    }

    public final void setPreLoad(boolean z) {
        ((C27374h) this.mPresenter).f72151b = z;
    }

    public C27411ah(C26875a aVar) {
        C37882b bVar;
        if (aVar instanceof C37882b) {
            bVar = (C37882b) aVar;
        } else {
            bVar = new C37882b();
        }
        this.mModel = bVar;
        this.mPresenter = new C27374h();
    }

    public final void request(int i, C30669b bVar, int i2, boolean z) {
        ((C27374h) this.mPresenter).mo44934a_(Integer.valueOf(i), bVar.getUid(), bVar.getSecUid());
    }
}
