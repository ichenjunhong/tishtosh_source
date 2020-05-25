package com.p683ss.android.ugc.aweme.detail.operators;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import com.p683ss.android.ugc.aweme.p1323ae.p1325b.C22469b;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.o */
public final class C27451o extends C27403a<C22469b, C26876b<C22469b>> {

    /* renamed from: a */
    private String f72224a;

    public final int getPageType(int i) {
        return 13;
    }

    public C27451o(C26875a aVar, String str) {
        C22469b bVar;
        this.f72224a = str;
        if (aVar instanceof C22469b) {
            bVar = (C22469b) aVar;
        } else {
            bVar = new C22469b();
        }
        this.mModel = bVar;
        this.mPresenter = new C26876b();
    }

    public final void request(int i, C30669b bVar, int i2, boolean z) {
        if (TextUtils.equals(this.f72224a, "from_hot_search_aweme")) {
            this.mPresenter.mo44934a_(Integer.valueOf(1));
            return;
        }
        if (TextUtils.equals(this.f72224a, "from_hot_search_positive_aweme")) {
            this.mPresenter.mo44934a_(Integer.valueOf(1), Integer.valueOf(1));
        }
    }
}
