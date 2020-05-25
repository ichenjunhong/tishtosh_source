package com.p683ss.android.jank;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.jank.SatanSampleConfig */
public final class SatanSampleConfig {
    @C10179b
    private static final JankConfig CONFIG = null;
    public static final SatanSampleConfig INSTANCE = new SatanSampleConfig();

    private SatanSampleConfig() {
    }

    public final JankConfig getCONFIG() {
        return CONFIG;
    }

    public static final JankConfig getParameters() {
        JankConfig jankConfig;
        try {
            jankConfig = (JankConfig) C10193n.m20607a().mo18202a(SatanSampleConfig.class, "jank_monitor_config", C10181b.m20511a().mo18175c().getJankMonitorConfig(), "com.ss.android.jank.JankConfig", JankConfig.class);
        } catch (Throwable unused) {
            jankConfig = null;
        }
        if (jankConfig == null) {
            return new JankConfig();
        }
        return jankConfig;
    }
}
