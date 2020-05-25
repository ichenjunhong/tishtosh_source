package com.p683ss.android.ugc.aweme.p1308ad.settings;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.ad.settings.DouPlusFullProcessConfig */
public final class DouPlusFullProcessConfig {
    @C10179b
    private static final boolean DEFAULT = false;
    public static final DouPlusFullProcessConfig INSTANCE = new DouPlusFullProcessConfig();

    private DouPlusFullProcessConfig() {
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }

    public static final boolean isOpen() {
        try {
            return C10193n.m20607a().mo18204a(DouPlusFullProcessConfig.class, "enable_dou_plus_full_process", C10181b.m20511a().mo18175c().getEnableDouPlusFullProcess(), false);
        } catch (Throwable unused) {
            return DEFAULT;
        }
    }
}
