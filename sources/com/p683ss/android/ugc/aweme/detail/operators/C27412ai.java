package com.p683ss.android.ugc.aweme.detail.operators;

import android.support.p030v4.app.Fragment;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.ai */
public final class C27412ai extends C27403a<C26875a, C26876b<C26875a>> {
    public final int getPageType(int i) {
        return 8000;
    }

    public final boolean init(Fragment fragment) {
        if (this.mModel != null) {
            return true;
        }
        return false;
    }

    public C27412ai(C26875a aVar) {
        this.mModel = aVar;
        this.mPresenter = new C26876b();
    }

    public final void request(int i, C30669b bVar, int i2, boolean z) {
        this.mPresenter.mo44934a_(bVar.getAid());
    }
}
