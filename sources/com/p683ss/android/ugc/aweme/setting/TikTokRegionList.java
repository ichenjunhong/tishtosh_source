package com.p683ss.android.ugc.aweme.setting;

import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.setting.TikTokRegionList */
public final class TikTokRegionList {
    public static final TikTokRegionList INSTANCE = new TikTokRegionList();
    @C10179b
    private static final String ttRegions = "";

    private TikTokRegionList() {
    }

    public final String getTtRegions() {
        return ttRegions;
    }
}
