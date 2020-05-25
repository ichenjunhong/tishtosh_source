package com.p683ss.android.ugc.aweme.detail.operators;

import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.discover.mixfeed.C28345u;
import com.p683ss.android.ugc.aweme.discover.mixfeed.C28348v;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.ac */
public final class C27406ac extends C27427b<C28345u, C28348v> {
    public final int getPageType(int i) {
        return 9;
    }

    public C27406ac(C26875a<?, ?> aVar) {
        if (!(aVar instanceof C28345u)) {
            aVar = null;
        }
        this.mModel = (C28345u) aVar;
        this.mPresenter = new C28348v();
    }
}
