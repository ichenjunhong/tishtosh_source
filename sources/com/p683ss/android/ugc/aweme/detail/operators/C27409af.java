package com.p683ss.android.ugc.aweme.detail.operators;

import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import com.p683ss.android.ugc.aweme.sticker.prop.p2315b.C46363b;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.af */
public final class C27409af extends C27403a<C46363b, C26876b<C46363b>> {
    public final int getPageType(int i) {
        return i + 10000;
    }

    public C27409af(C26875a aVar) {
        C46363b bVar;
        if (aVar instanceof C46363b) {
            bVar = (C46363b) aVar;
        } else {
            bVar = new C46363b();
        }
        this.mModel = bVar;
        this.mPresenter = new C26876b();
    }

    public final void request(int i, C30669b bVar, int i2, boolean z) {
        this.mPresenter.mo44934a_(Integer.valueOf(i), bVar.getStickerId(), Integer.valueOf(bVar.getVideoType()));
    }
}
