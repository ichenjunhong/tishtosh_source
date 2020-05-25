package com.p683ss.android.ugc.aweme.crossplatform.platform.p1618rn;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.rn.RnForceGcSettings */
public final class RnForceGcSettings {
    @C10179b(mo18165a = true)
    private static final boolean ENABLE = true;
    public static final RnForceGcSettings INSTANCE = new RnForceGcSettings();

    private RnForceGcSettings() {
    }

    public final boolean getENABLE() {
        return ENABLE;
    }

    public static final boolean get() {
        try {
            return C10193n.m20607a().mo18204a(RnForceGcSettings.class, "rn_force_v8_gc", C10181b.m20511a().mo18175c().getRnForceV8Gc(), true);
        } catch (Throwable unused) {
            return ENABLE;
        }
    }
}
