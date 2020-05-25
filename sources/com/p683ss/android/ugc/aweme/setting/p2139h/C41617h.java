package com.p683ss.android.ugc.aweme.setting.p2139h;

import com.p683ss.android.ugc.aweme.common.C26874f;
import com.p683ss.android.ugc.aweme.mvp.p1985a.C37717b;
import com.p683ss.android.ugc.aweme.setting.model.RestrictInfo;
import com.p683ss.android.ugc.aweme.setting.model.RestrictInfoModel;

/* renamed from: com.ss.android.ugc.aweme.setting.h.h */
public final class C41617h extends C37717b<RestrictInfoModel, C41614e> implements C26874f {
    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
    }

    /* renamed from: b */
    public final void mo44838b() {
        if (this.f96124c != null) {
            ((C41614e) this.f96124c).mo85376a((RestrictInfo) ((RestrictInfoModel) this.f96123b).mData);
        }
    }

    /* renamed from: a */
    public final void mo85379a(String str) {
        ((RestrictInfoModel) this.f96123b).getRestrictInfo(str);
    }

    public C41617h(RestrictInfoModel restrictInfoModel, C41614e eVar) {
        super(restrictInfoModel, eVar);
        ((RestrictInfoModel) this.f96123b).addNotifyListener(this);
    }
}
