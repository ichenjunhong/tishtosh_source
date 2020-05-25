package com.p683ss.android.ugc.aweme.setting;

import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.setting.IsBlockErrorGoPublish */
public final class IsBlockErrorGoPublish {
    @C10179b
    private static final boolean ENABLE = true;
    public static final IsBlockErrorGoPublish INSTANCE = new IsBlockErrorGoPublish();

    private IsBlockErrorGoPublish() {
    }

    public final boolean getENABLE() {
        return ENABLE;
    }
}
