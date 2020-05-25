package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.af */
final /* synthetic */ class C41851af implements OnClickListener {

    /* renamed from: a */
    private final SettingNewVersionActivity f105996a;

    C41851af(SettingNewVersionActivity settingNewVersionActivity) {
        this.f105996a = settingNewVersionActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f105996a.onVersionClick(view);
    }
}
