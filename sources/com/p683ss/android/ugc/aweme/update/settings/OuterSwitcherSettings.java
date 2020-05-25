package com.p683ss.android.ugc.aweme.update.settings;

import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.update.settings.OuterSwitcherSettings */
public final class OuterSwitcherSettings {
    @C10179b
    private static final boolean ENABLE = true;
    public static final OuterSwitcherSettings INSTANCE = new OuterSwitcherSettings();

    private OuterSwitcherSettings() {
    }

    public final boolean getENABLE() {
        return ENABLE;
    }
}
