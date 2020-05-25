package com.p683ss.android.ugc.aweme.setting.p2148ui;

import com.p683ss.android.ugc.aweme.login.C27960d;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.ah */
final /* synthetic */ class C41853ah implements Runnable {

    /* renamed from: a */
    private final SettingNewVersionActivity f105998a;

    C41853ah(SettingNewVersionActivity settingNewVersionActivity) {
        this.f105998a = settingNewVersionActivity;
    }

    public final void run() {
        SettingNewVersionActivity settingNewVersionActivity = this.f105998a;
        if (settingNewVersionActivity.f105795ab == null) {
            settingNewVersionActivity.f105795ab = new C27960d(settingNewVersionActivity);
        }
        settingNewVersionActivity.f105795ab.show();
    }
}
