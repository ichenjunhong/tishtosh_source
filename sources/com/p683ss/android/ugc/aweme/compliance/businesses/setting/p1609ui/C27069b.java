package com.p683ss.android.ugc.aweme.compliance.businesses.setting.p1609ui;

import com.p683ss.android.ugc.aweme.login.C27960d;

/* renamed from: com.ss.android.ugc.aweme.compliance.businesses.setting.ui.b */
final /* synthetic */ class C27069b implements Runnable {

    /* renamed from: a */
    private final ChildrenModeSettingActivity f71425a;

    C27069b(ChildrenModeSettingActivity childrenModeSettingActivity) {
        this.f71425a = childrenModeSettingActivity;
    }

    public final void run() {
        ChildrenModeSettingActivity childrenModeSettingActivity = this.f71425a;
        if (childrenModeSettingActivity.f71414a == null) {
            childrenModeSettingActivity.f71414a = new C27960d(childrenModeSettingActivity);
        }
        childrenModeSettingActivity.f71414a.show();
    }
}
