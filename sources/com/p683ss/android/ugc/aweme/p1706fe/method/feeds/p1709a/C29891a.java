package com.p683ss.android.ugc.aweme.p1706fe.method.feeds.p1709a;

import android.support.p030v4.app.Fragment;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.detail.operators.C27403a;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import com.p683ss.android.ugc.aweme.p1706fe.method.feeds.C29885a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.fe.method.feeds.a.a */
public final class C29891a extends C27403a<C29885a, C26876b<C29885a>> {
    public final boolean init(Fragment fragment) {
        C52711k.m112240b(fragment, "owner");
        if (this.mModel != null) {
            return true;
        }
        return false;
    }

    public C29891a(C26875a<?, ?> aVar) {
        if (!(aVar instanceof C29885a)) {
            aVar = null;
        }
        this.mModel = (C29885a) aVar;
        this.mPresenter = new C26876b();
    }

    public final void request(int i, C30669b bVar, int i2, boolean z) {
        C52711k.m112240b(bVar, "feedParam");
        this.mPresenter.mo44934a_(Integer.valueOf(i));
    }
}
