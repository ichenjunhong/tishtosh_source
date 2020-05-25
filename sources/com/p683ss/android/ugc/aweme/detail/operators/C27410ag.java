package com.p683ss.android.ugc.aweme.detail.operators;

import android.support.p030v4.app.Fragment;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.detail.operators.C27419al.C27421b;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30480d;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30487j;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30504w;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.ag */
public final class C27410ag extends C27403a<C30480d, C30487j> implements C27421b {
    public final int getPageType(int i) {
        return 2;
    }

    public final void bindPreLoadView(C30504w wVar) {
        ((C30487j) this.mPresenter).f79685a = wVar;
    }

    public final void setPreLoad(boolean z) {
        ((C30487j) this.mPresenter).f79686b = z;
    }

    public final boolean init(Fragment fragment) {
        this.mPresenter = new C30487j(fragment);
        return true;
    }

    public C27410ag(C26875a aVar) {
        C30480d dVar;
        if (aVar instanceof C30480d) {
            dVar = (C30480d) aVar;
        } else {
            dVar = new C30480d(6);
        }
        this.mModel = dVar;
    }

    public final void request(int i, C30669b bVar, int i2, boolean z) {
        C30487j jVar = (C30487j) this.mPresenter;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i);
        int i3 = 1;
        objArr[1] = Integer.valueOf(2);
        if (i != 4) {
            switch (i) {
                case 2:
                    i3 = 3;
                    break;
            }
        } else {
            i3 = 2;
        }
        objArr[2] = Integer.valueOf(i3);
        jVar.mo44934a_(objArr);
    }
}
