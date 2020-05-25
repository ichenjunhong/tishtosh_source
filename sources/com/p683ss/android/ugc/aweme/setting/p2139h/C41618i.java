package com.p683ss.android.ugc.aweme.setting.p2139h;

import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.common.C26874f;
import com.p683ss.android.ugc.aweme.mvp.p1985a.C37717b;
import com.p683ss.android.ugc.aweme.setting.model.CommonResponse;
import com.p683ss.android.ugc.aweme.setting.model.RestrictUserModel;

/* renamed from: com.ss.android.ugc.aweme.setting.h.i */
public final class C41618i extends C37717b<RestrictUserModel, C41615f> implements C26874f {
    /* renamed from: b */
    public final void mo44838b() {
        if (((CommonResponse) ((RestrictUserModel) this.f96123b).mData).statusCode != 0 || !((CommonResponse) ((RestrictUserModel) this.f96123b).mData).result) {
            if (this.f96124c != null) {
                C23459a aVar = new C23459a(((CommonResponse) ((RestrictUserModel) this.f96123b).mData).statusCode);
                aVar.setErrorMsg(((CommonResponse) ((RestrictUserModel) this.f96123b).mData).statusMsg);
                ((C41615f) this.f96124c).mo85377a(aVar);
            }
        } else if (this.f96124c != null) {
        }
    }

    /* renamed from: a */
    public final void mo85380a(String str) {
        ((RestrictUserModel) this.f96123b).restricUser(str);
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        if (this.f96124c != null) {
            ((C41615f) this.f96124c).mo85377a(exc);
        }
    }

    public C41618i(RestrictUserModel restrictUserModel, C41615f fVar) {
        super(restrictUserModel, fVar);
        ((RestrictUserModel) this.f96123b).addNotifyListener(this);
    }
}
