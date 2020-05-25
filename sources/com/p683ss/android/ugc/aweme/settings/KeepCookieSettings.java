package com.p683ss.android.ugc.aweme.settings;

import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.settings.KeepCookieSettings */
public final class KeepCookieSettings {
    @C10179b
    private static final boolean ENABLED = false;
    public static final KeepCookieSettings INSTANCE = new KeepCookieSettings();

    private KeepCookieSettings() {
    }

    public final boolean getENABLED() {
        return ENABLED;
    }
}
