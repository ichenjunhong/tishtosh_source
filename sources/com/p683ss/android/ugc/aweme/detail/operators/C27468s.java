package com.p683ss.android.ugc.aweme.detail.operators;

import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import com.p683ss.android.ugc.aweme.music.presenter.C37405j;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.s */
public final class C27468s extends C27403a<C37405j, C26876b<C37405j>> {
    public final int getPageType(int i) {
        return i + 4000;
    }

    public C27468s(C26875a aVar) {
        C37405j jVar;
        if (aVar instanceof C37405j) {
            jVar = (C37405j) aVar;
        } else {
            jVar = new C37405j();
        }
        this.mModel = jVar;
        this.mPresenter = new C26876b();
    }

    public final void request(int i, C30669b bVar, int i2, boolean z) {
        this.mPresenter.mo44934a_(Integer.valueOf(i), bVar.getMusicId(), Integer.valueOf(bVar.getVideoType()));
    }
}
