package com.p683ss.android.ugc.aweme.commercialize.log;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.commercialize.log.CommerceEggMonitorLogSetting */
public final class CommerceEggMonitorLogSetting {
    @C10179b
    private static final boolean DEFAULT = true;
    public static final CommerceEggMonitorLogSetting INSTANCE = new CommerceEggMonitorLogSetting();

    private CommerceEggMonitorLogSetting() {
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }

    public static final boolean get() {
        try {
            return C10193n.m20607a().mo18204a(CommerceEggMonitorLogSetting.class, "enable_commerce_egg_monitor_log", C10181b.m20511a().mo18175c().getEnableCommerceEggMonitorLog(), true);
        } catch (Throwable unused) {
            return DEFAULT;
        }
    }
}
