package com.p683ss.android.ugc.aweme.comment.p1522g;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.comment.list.C25256e;
import com.p683ss.android.ugc.aweme.comment.list.C25257f;
import com.p683ss.android.ugc.aweme.common.C26851b;

/* renamed from: com.ss.android.ugc.aweme.comment.g.g */
public final class C25181g extends C26851b<C25179f, C25257f> implements C25256e {
    /* renamed from: c */
    public final void mo51432c() {
        aq_();
        mo46991S_();
    }

    /* renamed from: b */
    public final void mo44838b() {
        if (!(this.f70701g == null || this.f70700f == null)) {
            if (TextUtils.isEmpty(((C25179f) this.f70700f).f66733e)) {
                ((C25257f) this.f70701g).mo51539a(((C25179f) this.f70700f).f66730b);
                return;
            }
            ((C25257f) this.f70701g).mo51539a(((C25179f) this.f70700f).f66730b, ((C25179f) this.f70700f).f66732d, ((C25179f) this.f70700f).f66733e, ((C25179f) this.f70700f).f66734f);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo51430a(C25257f fVar) {
        super.mo54800a(fVar);
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        String str;
        if (this.f70701g != null) {
            C25257f fVar = (C25257f) this.f70701g;
            if (this.f70700f != null) {
                str = ((C25179f) this.f70700f).f66730b;
            } else {
                str = "";
            }
            fVar.mo51538a(str, exc);
        }
    }

    /* renamed from: a */
    public final void mo51431a(String str, String str2, String str3, String str4) {
        mo44934a_(str, str2, str3, str4);
    }
}
