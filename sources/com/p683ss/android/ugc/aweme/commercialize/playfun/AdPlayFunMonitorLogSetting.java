package com.p683ss.android.ugc.aweme.commercialize.playfun;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.AdPlayFunMonitorLogSetting */
public final class AdPlayFunMonitorLogSetting {
    @C10179b
    private static final boolean DEFAULT = true;
    public static final AdPlayFunMonitorLogSetting INSTANCE = new AdPlayFunMonitorLogSetting();

    private AdPlayFunMonitorLogSetting() {
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }

    public static final boolean get() {
        try {
            return C10193n.m20607a().mo18204a(AdPlayFunMonitorLogSetting.class, "enable_ad_playfun_monitor_log", C10181b.m20511a().mo18175c().getEnableAdPlayfunMonitorLog(), true);
        } catch (Throwable unused) {
            return DEFAULT;
        }
    }
}
