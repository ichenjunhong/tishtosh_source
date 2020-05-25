package com.p683ss.android.ugc.aweme.setting;

import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.setting.SettingsKevaSettings */
public final class SettingsKevaSettings {
    @C10179b
    private static final boolean ENABLE = false;
    public static final SettingsKevaSettings INSTANCE = new SettingsKevaSettings();

    private SettingsKevaSettings() {
    }

    public final boolean getENABLE() {
        return ENABLE;
    }
}
