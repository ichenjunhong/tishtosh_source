package com.p683ss.android.ugc.aweme.account.agegate.model;

import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p683ss.android.ugc.aweme.account.login.C21355h;
import com.p683ss.android.ugc.aweme.account.util.C22260b;
import com.p683ss.android.ugc.aweme.common.C26851b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.model.f */
public final class C20892f extends C26851b<C20887a, C20893g> {

    /* renamed from: a */
    private String[] f56867a;

    /* renamed from: c */
    public final void mo44839c() {
        mo46991S_();
        aq_();
    }

    /* renamed from: R_ */
    public final void mo44834R_() {
        super.mo44834R_();
        ((C20893g) this.f70701g).mo44802a(true);
    }

    /* renamed from: b */
    public final void mo44838b() {
        int i;
        String str;
        super.mo44838b();
        if (this.f70700f == null || !((C20887a) this.f70700f).mo44827a()) {
            i = 0;
        } else {
            i = 1;
        }
        C21355h.m53980b(1, i, "");
        if (this.f70701g != null) {
            ((C20893g) this.f70701g).mo44802a(false);
            if (this.f70700f == null || !((C20887a) this.f70700f).mo44827a()) {
                C20893g gVar = (C20893g) this.f70701g;
                C20887a aVar = (C20887a) this.f70700f;
                if (aVar.mData == null || ((AgeGateResponse) aVar.mData).getStatus_msg() == null) {
                    str = "";
                } else {
                    str = ((AgeGateResponse) aVar.mData).getStatus_msg();
                }
                gVar.mo44801a(new Exception(str));
            } else {
                ((C20893g) this.f70701g).ak_();
            }
        }
    }

    /* renamed from: a */
    public final void mo44836a(C20893g gVar) {
        mo54800a(gVar);
        mo54799a(new C20887a());
        this.f56867a = C23826bi.m58460b().getResources().getStringArray(R.array.a0);
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        super.mo44840c_(exc);
        C21355h.m53980b(0, 0, exc.getMessage());
        if (this.f70701g != null) {
            ((C20893g) this.f70701g).mo44802a(false);
            ((C20893g) this.f70701g).mo44801a(exc);
        }
    }

    /* renamed from: a */
    public final void mo44837a(boolean z, boolean z2) {
        String b = ((C20887a) mo54803n()).mo44828b();
        mo44934a_(b, Boolean.valueOf(z2));
        if (!z) {
            C22260b.m55106a(b);
        }
    }

    /* renamed from: a */
    public final void mo44835a(int i, int i2, int i3) {
        ((C20887a) mo54803n()).mo44826a(i, i2, i3);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f56867a[i2 - 1]);
        sb.append(" ");
        sb.append(i3);
        sb.append(" ");
        sb.append(i);
    }
}
