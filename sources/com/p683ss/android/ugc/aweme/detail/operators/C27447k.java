package com.p683ss.android.ugc.aweme.detail.operators;

import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.discover.model.DiscoveryV4DetailListModel;
import com.p683ss.android.ugc.aweme.discover.p1645g.C28119c;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.k */
public final class C27447k extends C27403a<DiscoveryV4DetailListModel, C26876b<DiscoveryV4DetailListModel>> {

    /* renamed from: a */
    public final String f72221a;

    /* renamed from: b */
    private final int f72222b = 8;

    public final int getPageType(int i) {
        return 9001;
    }

    public final boolean isLoading() {
        return super.isLoading();
    }

    public C27447k(String str, C26875a<?, ?> aVar) {
        C52711k.m112240b(str, "tabName");
        this.f72221a = str;
        if (!(aVar instanceof DiscoveryV4DetailListModel)) {
            aVar = null;
        }
        DiscoveryV4DetailListModel discoveryV4DetailListModel = (DiscoveryV4DetailListModel) aVar;
        if (discoveryV4DetailListModel == null) {
            discoveryV4DetailListModel = new DiscoveryV4DetailListModel();
        }
        this.mModel = discoveryV4DetailListModel;
        this.mPresenter = new C28119c(this.f72221a);
    }

    public final void request(int i, C30669b bVar, int i2, boolean z) {
        C52711k.m112240b(bVar, "feedParam");
        this.mPresenter.mo44934a_(Integer.valueOf(i), Integer.valueOf(bVar.getCellDetailType()), bVar.getCellId(), bVar.getTabName(), Integer.valueOf(this.f72222b), bVar.getAid());
    }
}
