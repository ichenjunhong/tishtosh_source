package com.p683ss.android.ugc.aweme.setting.p2139h;

import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.common.C26874f;
import com.p683ss.android.ugc.aweme.mvp.p1985a.C37717b;
import com.p683ss.android.ugc.aweme.setting.model.CommonResponse;
import com.p683ss.android.ugc.aweme.setting.model.RestrictAwemeModel;
import com.p683ss.android.ugc.aweme.setting.p2136e.C41597c;
import com.p683ss.android.ugc.aweme.utils.C47718bf;

/* renamed from: com.ss.android.ugc.aweme.setting.h.g */
public final class C41616g extends C37717b<RestrictAwemeModel, C41613d> implements C26874f {
    /* renamed from: b */
    public final void mo44838b() {
        if (((CommonResponse) ((RestrictAwemeModel) this.f96123b).mData).statusCode != 0 || !((CommonResponse) ((RestrictAwemeModel) this.f96123b).mData).result) {
            if (this.f96124c != null) {
                C23459a aVar = new C23459a(((CommonResponse) ((RestrictAwemeModel) this.f96123b).mData).statusCode);
                aVar.setErrorMsg(((CommonResponse) ((RestrictAwemeModel) this.f96123b).mData).statusMsg);
                ((C41613d) this.f96124c).mo85374a(aVar);
            }
            return;
        }
        if (this.f96124c != null) {
            ((C41613d) this.f96124c).mo85375h();
        }
        C47718bf.m103288a(new C41597c());
    }

    /* renamed from: a */
    public final void mo85378a(String str) {
        ((RestrictAwemeModel) this.f96123b).restricAweme(str);
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        if (this.f96124c != null) {
            ((C41613d) this.f96124c).mo85374a(exc);
        }
    }

    public C41616g(RestrictAwemeModel restrictAwemeModel, C41613d dVar) {
        super(restrictAwemeModel, dVar);
        ((RestrictAwemeModel) this.f96123b).addNotifyListener(this);
    }
}
