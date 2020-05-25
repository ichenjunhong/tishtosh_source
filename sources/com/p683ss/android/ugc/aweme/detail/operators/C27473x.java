package com.p683ss.android.ugc.aweme.detail.operators;

import com.bytedance.p879t.p882c.C13248c;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import com.p683ss.android.ugc.aweme.profile.presenter.C39958b;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.x */
public final class C27473x extends C27403a<C39958b, C26876b<C39958b>> {

    /* renamed from: a */
    private final boolean f72252a;

    /* renamed from: b */
    private final String f72253b;

    /* renamed from: a */
    private int m66076a() {
        if (this.f72252a) {
            return 1000;
        }
        return 2000;
    }

    public final int getPageType(int i) {
        return m66076a() + i;
    }

    public C27473x(C26875a aVar, boolean z, String str) {
        C39958b bVar;
        if (aVar instanceof C39958b) {
            bVar = (C39958b) aVar;
        } else {
            bVar = new C39958b();
        }
        this.mModel = bVar;
        this.mPresenter = new C26876b();
        this.f72252a = z;
        this.f72253b = str;
    }

    public final void request(int i, C30669b bVar, int i2, boolean z) {
        if (C13248c.m26638a(bVar.getSecUid())) {
            this.mPresenter.mo44934a_(Integer.valueOf(i), Boolean.valueOf(true), this.f72253b, Integer.valueOf(bVar.getVideoType()), Integer.valueOf(m66076a()));
            return;
        }
        this.mPresenter.mo44934a_(Integer.valueOf(i), Boolean.valueOf(true), this.f72253b, Integer.valueOf(bVar.getVideoType()), Integer.valueOf(m66076a()), bVar.getSecUid());
    }
}
