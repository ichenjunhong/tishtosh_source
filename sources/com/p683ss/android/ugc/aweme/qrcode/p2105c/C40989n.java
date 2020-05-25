package com.p683ss.android.ugc.aweme.qrcode.p2105c;

import com.p683ss.android.ugc.aweme.common.C26874f;
import com.p683ss.android.ugc.aweme.mvp.p1985a.C37717b;
import com.p683ss.android.ugc.aweme.qrcode.p2104b.C40942c;
import com.p683ss.android.ugc.aweme.qrcode.p2104b.C40943d;

/* renamed from: com.ss.android.ugc.aweme.qrcode.c.n */
public final class C40989n extends C37717b<C40943d, C40969c> implements C26874f {
    /* renamed from: b */
    public final void mo44838b() {
        if (this.f96124c != null) {
            ((C40969c) this.f96124c).mo83464a((C40942c) ((C40943d) this.f96123b).mData);
        }
    }

    /* renamed from: a */
    public final void mo83480a(String str) {
        ((C40943d) this.f96123b).mo83432a(str);
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        if (this.f96124c != null) {
            ((C40969c) this.f96124c).mo83465a(exc);
        }
    }

    public C40989n(C40943d dVar, C40969c cVar) {
        super(dVar, cVar);
        dVar.addNotifyListener(this);
    }
}
