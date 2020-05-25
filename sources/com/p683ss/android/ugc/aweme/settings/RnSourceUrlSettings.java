package com.p683ss.android.ugc.aweme.settings;

import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.settings.RnSourceUrlSettings */
public final class RnSourceUrlSettings {
    public static final RnSourceUrlSettings INSTANCE = new RnSourceUrlSettings();
    @C10179b
    private static final RnSourceUrlSetting[] androidSourceUrl = null;

    private RnSourceUrlSettings() {
    }

    public final RnSourceUrlSetting[] getAndroidSourceUrl() {
        return androidSourceUrl;
    }
}
