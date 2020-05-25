package com.p683ss.android.ugc.aweme.pendant.setting;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.pendant.setting.ShredConfiguration */
public final class ShredConfiguration {
    public static final ShredConfiguration INSTANCE = new ShredConfiguration();
    @C10179b
    private static final ShredConfigurationData SHRED_CONFIG = null;

    private ShredConfiguration() {
    }

    public final ShredConfigurationData getSHRED_CONFIG() {
        return SHRED_CONFIG;
    }

    public static final ShredConfigurationData getShredConfiguration() {
        ShredConfigurationData shredConfigurationData;
        try {
            shredConfigurationData = (ShredConfigurationData) C10193n.m20607a().mo18202a(ShredConfiguration.class, "fragments_configuration", C10181b.m20511a().mo18175c().getFragmentsConfiguration(), "com.ss.android.ugc.aweme.pendant.setting.ShredConfigurationData", ShredConfigurationData.class);
        } catch (Throwable unused) {
            shredConfigurationData = null;
        }
        if (shredConfigurationData == null) {
            return new ShredConfigurationData(false, new int[0]);
        }
        return shredConfigurationData;
    }
}
