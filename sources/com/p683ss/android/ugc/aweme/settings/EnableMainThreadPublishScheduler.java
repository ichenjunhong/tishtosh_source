package com.p683ss.android.ugc.aweme.settings;

import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.settings.EnableMainThreadPublishScheduler */
public final class EnableMainThreadPublishScheduler {
    @C10179b
    private static final boolean ENABLE = false;
    public static final EnableMainThreadPublishScheduler INSTANCE = new EnableMainThreadPublishScheduler();

    private EnableMainThreadPublishScheduler() {
    }

    public final boolean getENABLE() {
        return ENABLE;
    }
}
