package com.p683ss.android.ugc.aweme.detail.operators;

import com.p2615tt.appbrandimpl.C51925b;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.m */
public final class C27449m extends C27403a<C51925b, C26876b<C51925b>> {

    /* renamed from: a */
    private boolean f72223a;

    public final int getPageType(int i) {
        int i2;
        if (this.f72223a) {
            i2 = 1000;
        } else {
            i2 = 2000;
        }
        return i2 + i;
    }

    public C27449m(C26875a aVar) {
        C51925b bVar;
        if (aVar instanceof C51925b) {
            bVar = (C51925b) aVar;
        } else {
            bVar = new C51925b();
        }
        this.mModel = bVar;
        this.mPresenter = new C26876b();
    }

    public final void request(int i, C30669b bVar, int i2, boolean z) {
        String microAppId = bVar.getMicroAppId();
        String hashTagName = bVar.getHashTagName();
        int cursor = bVar.getCursor();
        int count = bVar.getCount();
        this.mPresenter.mo44934a_(Integer.valueOf(4), microAppId, hashTagName, Integer.valueOf(count), Integer.valueOf(cursor));
    }
}
