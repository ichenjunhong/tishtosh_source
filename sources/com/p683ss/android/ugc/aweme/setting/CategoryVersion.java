package com.p683ss.android.ugc.aweme.setting;

import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.setting.CategoryVersion */
public final class CategoryVersion {
    public static final CategoryVersion INSTANCE = new CategoryVersion();
    @C10179b
    private static final int VERSION = 0;

    private CategoryVersion() {
    }

    public final int getVERSION() {
        return VERSION;
    }
}
