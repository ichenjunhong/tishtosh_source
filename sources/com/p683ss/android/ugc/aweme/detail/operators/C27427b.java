package com.p683ss.android.ugc.aweme.detail.operators;

import android.support.p030v4.app.Fragment;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.detail.operators.C27419al.C27421b;
import com.p683ss.android.ugc.aweme.detail.p1627i.C27369c;
import com.p683ss.android.ugc.aweme.detail.p1627i.C27370d;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30504w;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.b */
public class C27427b<MODEL extends C27369c<?, ?>, PRESENTER extends C27370d<MODEL, Aweme>> extends C27403a<MODEL, PRESENTER> implements C27421b {
    public void bindPreLoadView(C30504w wVar) {
        ((C27370d) this.mPresenter).f72150a = wVar;
    }

    public boolean init(Fragment fragment) {
        C52711k.m112240b(fragment, "owner");
        if (this.mModel != null) {
            return true;
        }
        return false;
    }

    public void setPreLoad(boolean z) {
        C26876b bVar = this.mPresenter;
        C52711k.m112236a((Object) bVar, "mPresenter");
        ((C27370d) bVar).f72151b = z;
    }

    public void request(int i, C30669b bVar, int i2, boolean z) {
        C52711k.m112240b(bVar, "feedParam");
        ((C27370d) this.mPresenter).mo44934a_(Integer.valueOf(i));
    }
}
