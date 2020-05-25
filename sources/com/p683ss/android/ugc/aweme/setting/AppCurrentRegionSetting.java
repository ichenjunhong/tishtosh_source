package com.p683ss.android.ugc.aweme.setting;

import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.setting.AppCurrentRegionSetting */
public final class AppCurrentRegionSetting {
    public static final AppCurrentRegionSetting INSTANCE = new AppCurrentRegionSetting();
    @C10179b
    private static final String priorityRegion = "";

    private AppCurrentRegionSetting() {
    }

    public final String getPriorityRegion() {
        return priorityRegion;
    }
}
