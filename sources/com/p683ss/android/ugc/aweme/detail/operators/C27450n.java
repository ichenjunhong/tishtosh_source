package com.p683ss.android.ugc.aweme.detail.operators;

import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.detail.p1625g.C27337a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import com.p683ss.android.ugc.aweme.history.C32956b;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.n */
public final class C27450n extends C27403a<C26875a<Aweme, C27337a>, C26876b<C26875a<Aweme, C27337a>>> {
    public final int getPageType(int i) {
        return i + 2000;
    }

    public C27450n(C26875a aVar) {
        this.mModel = aVar;
        this.mPresenter = new C32956b();
    }

    public final void request(int i, C30669b bVar, int i2, boolean z) {
        this.mPresenter.mo44934a_(Integer.valueOf(i));
    }
}
