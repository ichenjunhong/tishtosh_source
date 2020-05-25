package com.p683ss.android.ugc.aweme.settings;

import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.settings.EnablePrePublishWhenMemoryGetFailed */
public final class EnablePrePublishWhenMemoryGetFailed {
    @C10179b
    private static final boolean ENABLE = true;
    public static final EnablePrePublishWhenMemoryGetFailed INSTANCE = new EnablePrePublishWhenMemoryGetFailed();

    private EnablePrePublishWhenMemoryGetFailed() {
    }

    public final boolean getENABLE() {
        return ENABLE;
    }
}
