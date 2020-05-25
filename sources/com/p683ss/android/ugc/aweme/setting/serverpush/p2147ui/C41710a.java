package com.p683ss.android.ugc.aweme.setting.serverpush.p2147ui;

import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2146b.C41697d;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.a */
final /* synthetic */ class C41710a implements C1710e {

    /* renamed from: a */
    private final C417042 f105565a;

    C41710a(C417042 r1) {
        this.f105565a = r1;
    }

    public final void accept(Object obj) {
        C417042 r0 = this.f105565a;
        CommonItemView commonItemView = (CommonItemView) obj;
        C41697d dVar = new C41697d();
        dVar.mo54800a(PushSettingManagerFragment.this);
        dVar.mo44934a_(commonItemView.getTag(), Integer.valueOf(commonItemView.mo19040c() ? 1 : 0));
    }
}
