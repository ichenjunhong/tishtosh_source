package com.p683ss.android.ugc.aweme.detail.operators;

import android.support.p030v4.app.Fragment;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.detail.operators.C27419al.C27421b;
import com.p683ss.android.ugc.aweme.discover.mixfeed.C28320d;
import com.p683ss.android.ugc.aweme.discover.mixfeed.C28329k;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30504w;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.z */
public final class C27475z extends C27403a<C28329k, C28320d> implements C27421b {
    public final int getPageType(int i) {
        return 9;
    }

    public final void bindPreLoadView(C30504w wVar) {
        ((C28320d) this.mPresenter).f74288a = wVar;
    }

    public final void setPreLoad(boolean z) {
        ((C28320d) this.mPresenter).f74289b = z;
    }

    public final boolean init(Fragment fragment) {
        C52711k.m112240b(fragment, "owner");
        if (this.mModel != null) {
            return true;
        }
        return false;
    }

    public C27475z(C26875a<?, ?> aVar) {
        if (!(aVar instanceof C28329k)) {
            aVar = null;
        }
        this.mModel = (C28329k) aVar;
        this.mPresenter = new C28320d();
    }

    public final void request(int i, C30669b bVar, int i2, boolean z) {
        C52711k.m112240b(bVar, "feedParam");
        ((C28320d) this.mPresenter).mo44934a_(Integer.valueOf(i));
    }
}
