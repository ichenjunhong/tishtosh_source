package com.p683ss.android.ugc.aweme.update.settings;

import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.update.settings.OuterEntranceShowSettings */
public final class OuterEntranceShowSettings {
    public static final OuterEntranceShowSettings INSTANCE = new OuterEntranceShowSettings();
    @C10179b
    private static final boolean SHOW = false;

    private OuterEntranceShowSettings() {
    }

    public final boolean getSHOW() {
        return SHOW;
    }
}
