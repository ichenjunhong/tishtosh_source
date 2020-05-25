package com.p683ss.android.ugc.aweme.detail.operators;

import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.detail.operators.C27419al.C27421b;
import com.p683ss.android.ugc.aweme.detail.p1627i.C27377j;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30504w;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import com.p683ss.android.ugc.aweme.poi.C39065f;
import com.p683ss.android.ugc.aweme.poi.C39065f.C39066a;
import com.p683ss.android.ugc.aweme.poi.model.C39104aj;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.w */
public final class C27472w extends C27403a<C39104aj, C27377j> implements C27421b {
    public final int getPageType(int i) {
        return 10;
    }

    public final void bindPreLoadView(C30504w wVar) {
        ((C27377j) this.mPresenter).f72150a = wVar;
    }

    public final void setPreLoad(boolean z) {
        C26876b bVar = this.mPresenter;
        C52711k.m112236a((Object) bVar, "mPresenter");
        ((C27377j) bVar).f72151b = z;
    }

    public C27472w(C26875a<?, ?> aVar) {
        C39104aj ajVar;
        if (aVar instanceof C39104aj) {
            ajVar = (C39104aj) aVar;
        } else {
            ajVar = new C39104aj();
        }
        this.mModel = ajVar;
        this.mPresenter = new C27377j();
    }

    public final void request(int i, C30669b bVar, int i2, boolean z) {
        C52711k.m112240b(bVar, "feedParam");
        C39065f a = new C39066a().mo79225a(bVar.getPoiId()).mo79231d(bVar.getRelatedId()).mo79228b(3).mo79227a();
        ((C27377j) this.mPresenter).mo44934a_(Integer.valueOf(i), a);
    }
}
