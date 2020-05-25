package com.p683ss.android.ugc.aweme.qrcode.p2105c;

import com.p683ss.android.ugc.aweme.common.C26874f;
import com.p683ss.android.ugc.aweme.mvp.p1985a.C37717b;
import com.p683ss.android.ugc.aweme.qrcode.p2104b.C40939a;
import com.p683ss.android.ugc.aweme.qrcode.p2104b.C40940b;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.qrcode.c.e */
public final class C40973e extends C37717b<C40940b, C40968b> implements C26874f {
    /* renamed from: d */
    public final File mo83471d() {
        if (this.f96123b != null) {
            return ((C40940b) this.f96123b).mo83430b();
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo83470a() {
        if (this.f96123b != null) {
            return ((C40940b) this.f96123b).mo83429a();
        }
        return false;
    }

    /* renamed from: b */
    public final void mo44838b() {
        if (this.f96124c != null) {
            if (((C40939a) ((C40940b) this.f96123b).mData) == null) {
                ((C40968b) this.f96124c).mo83463a(new Exception());
                return;
            }
            ((C40968b) this.f96124c).mo83462a((C40939a) ((C40940b) this.f96123b).mData);
        }
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        if (this.f96124c != null) {
            ((C40968b) this.f96124c).mo83463a(exc);
        }
    }

    /* renamed from: a */
    public final void mo83469a(String str) {
        if (this.f96123b != null) {
            ((C40940b) this.f96123b).mo83428a(str);
        }
    }

    public C40973e(C40940b bVar, C40968b bVar2) {
        super(bVar, bVar2);
        bVar.addNotifyListener(this);
    }

    /* renamed from: a */
    public final void mo83468a(int i, String str) {
        ((C40940b) this.f96123b).mo83427a(i, str, null);
    }
}
