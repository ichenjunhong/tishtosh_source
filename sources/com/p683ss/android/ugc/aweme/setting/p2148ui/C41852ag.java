package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.ag */
final /* synthetic */ class C41852ag implements OnClickListener {

    /* renamed from: a */
    private final SettingNewVersionActivity f105997a;

    C41852ag(SettingNewVersionActivity settingNewVersionActivity) {
        this.f105997a = settingNewVersionActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f105997a.onUserInfoClick(view);
    }
}
