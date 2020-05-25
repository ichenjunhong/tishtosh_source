package com.p683ss.android.ugc.aweme.setting;

import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.setting.ABMockKevaSettings */
public final class ABMockKevaSettings {
    @C10179b
    private static final boolean ENABLE = false;
    public static final ABMockKevaSettings INSTANCE = new ABMockKevaSettings();

    private ABMockKevaSettings() {
    }

    public final boolean getENABLE() {
        return ENABLE;
    }
}
