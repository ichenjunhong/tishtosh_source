package com.p683ss.android.ugc.aweme.commercialize.coupon.p1552b;

import com.p683ss.android.ugc.aweme.common.C26874f;
import com.p683ss.android.ugc.aweme.mvp.p1985a.C37717b;
import com.p683ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.b.h */
public final class C25685h extends C37717b<C25683g, C25682f> implements C26874f {
    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
    }

    /* renamed from: b */
    public final void mo44838b() {
        if (this.f96124c != null) {
            User user = (User) ((C25683g) this.f96123b).mData;
            if (user == null) {
                new Exception();
                return;
            }
            ((C25682f) this.f96124c).mo52830a(user);
        }
    }

    /* renamed from: a */
    public final void mo52833a(String str) {
        ((C25683g) this.f96123b).mo52831a(str);
    }

    public C25685h(C25683g gVar, C25682f fVar) {
        super(gVar, fVar);
        gVar.addNotifyListener(this);
    }
}
