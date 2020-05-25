package com.p683ss.android.ugc.aweme.detail.operators;

import android.support.p030v4.app.Fragment;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.detail.operators.C27419al.C27421b;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30474ac;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30475ad;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30504w;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import com.p683ss.android.ugc.aweme.feed.utils.C31218z;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.t */
public final class C27469t extends C27403a<C30474ac, C30475ad> implements C27421b {
    public final void bindPreLoadView(C30504w wVar) {
    }

    public final int getPageType(int i) {
        return 7;
    }

    public final void setPreLoad(boolean z) {
    }

    public final boolean init(Fragment fragment) {
        this.mPresenter = new C30475ad(fragment);
        return true;
    }

    public C27469t(C26875a aVar) {
        C30474ac acVar;
        if (aVar instanceof C30474ac) {
            acVar = (C30474ac) aVar;
        } else {
            acVar = new C30474ac(6);
        }
        this.mModel = acVar;
    }

    public final void request(int i, C30669b bVar, int i2, boolean z) {
        ((C30475ad) this.mPresenter).mo44934a_(Integer.valueOf(i), Integer.valueOf(7), Integer.valueOf(2), Integer.valueOf(0), Integer.valueOf(C31218z.m72908a()));
    }
}
