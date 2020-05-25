package com.p683ss.android.ugc.aweme.commercialize.coupon.p1552b;

import com.p683ss.android.ugc.aweme.commercialize.coupon.model.C25688c;
import com.p683ss.android.ugc.aweme.common.C26874f;
import com.p683ss.android.ugc.aweme.mvp.p1985a.C37717b;

/* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.b.b */
public final class C25677b extends C37717b<C25675a, C25681e> implements C26874f {
    /* renamed from: b */
    public final void mo44838b() {
        if (this.f96124c != null) {
            C25688c cVar = (C25688c) ((C25675a) this.f96123b).mData;
            if (cVar == null) {
                ((C25681e) this.f96124c).mo52829a(new Exception());
                return;
            }
            ((C25681e) this.f96124c).mo52828a(cVar);
        }
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        if (this.f96124c != null) {
            ((C25681e) this.f96124c).mo52829a(exc);
        }
    }

    public C25677b(C25675a aVar, C25681e eVar) {
        super(aVar, eVar);
        aVar.addNotifyListener(this);
    }

    /* renamed from: a */
    public final void mo52826a(int i, String str) {
        ((C25675a) this.f96123b).mo52824a(i, str);
    }
}
