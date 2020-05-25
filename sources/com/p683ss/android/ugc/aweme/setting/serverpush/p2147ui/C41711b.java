package com.p683ss.android.ugc.aweme.setting.serverpush.p2147ui;

import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2146b.C41697d;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2147ui.PushSettingManagerFragmentSecondVersion.C41707a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.b */
final /* synthetic */ class C41711b implements C1710e {

    /* renamed from: a */
    private final PushSettingManagerFragmentSecondVersion f105566a;

    C41711b(PushSettingManagerFragmentSecondVersion pushSettingManagerFragmentSecondVersion) {
        this.f105566a = pushSettingManagerFragmentSecondVersion;
    }

    public final void accept(Object obj) {
        PushSettingManagerFragmentSecondVersion pushSettingManagerFragmentSecondVersion = this.f105566a;
        CommonItemView commonItemView = (CommonItemView) obj;
        C41697d dVar = new C41697d();
        dVar.mo54800a(pushSettingManagerFragmentSecondVersion);
        C41707a aVar = (C41707a) commonItemView.getTag();
        dVar.mo44934a_(aVar.f105554a, Integer.valueOf(aVar.f105555b ? 1 : 0));
        if (pushSettingManagerFragmentSecondVersion.f105545c != null) {
            pushSettingManagerFragmentSecondVersion.f105545c.put(aVar.f105554a, aVar.f105555b ? 1 : 0);
        }
    }
}
