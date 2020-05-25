package com.p683ss.android.ugc.aweme.tools.mvtemplate.setting;

import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.setting.EnableMvResCheck */
public final class EnableMvResCheck {
    private static final boolean ALLOW = true;
    @C10179b(mo18165a = true)
    private static final boolean DISALLOW = false;
    public static final EnableMvResCheck INSTANCE = new EnableMvResCheck();

    private EnableMvResCheck() {
    }

    public static /* synthetic */ void ALLOW$annotations() {
    }

    public static /* synthetic */ void DISALLOW$annotations() {
    }

    public final boolean getALLOW() {
        return ALLOW;
    }

    public final boolean getDISALLOW() {
        return DISALLOW;
    }
}
