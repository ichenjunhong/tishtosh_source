package com.p683ss.android.ugc.aweme.detail.operators;

import android.support.p030v4.app.Fragment;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import com.p683ss.android.ugc.aweme.follow.recommend.follow.viewModel.C31971a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.y */
public final class C27474y extends C27403a<C31971a, C26876b<C31971a>> {
    public final int getPageType(int i) {
        return super.getPageType(i);
    }

    public final boolean init(Fragment fragment) {
        C52711k.m112240b(fragment, "owner");
        if (this.mModel != null) {
            return true;
        }
        return false;
    }

    public C27474y(C26875a<?, ?> aVar) {
        this.mModel = (C31971a) aVar;
        this.mPresenter = new C26876b();
    }

    public final void request(int i, C30669b bVar, int i2, boolean z) {
        C52711k.m112240b(bVar, "feedParam");
        this.mPresenter.mo44934a_(Integer.valueOf(i));
    }
}
