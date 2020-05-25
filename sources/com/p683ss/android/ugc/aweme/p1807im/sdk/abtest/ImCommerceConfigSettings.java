package com.p683ss.android.ugc.aweme.p1807im.sdk.abtest;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.im.sdk.abtest.ImCommerceConfigSettings */
public final class ImCommerceConfigSettings {
    @C10179b
    private static final ImCommerceConfig CONFIG = null;
    public static final ImCommerceConfigSettings INSTANCE = new ImCommerceConfigSettings();

    private ImCommerceConfigSettings() {
    }

    public final ImCommerceConfig getCONFIG() {
        return CONFIG;
    }

    public final String[] getDomainList() {
        ImCommerceConfig imCommerceConfigSetting = getImCommerceConfigSetting();
        if (imCommerceConfigSetting != null) {
            return imCommerceConfigSetting.getDomainList();
        }
        return null;
    }

    private final ImCommerceConfig getImCommerceConfigSetting() {
        try {
            return (ImCommerceConfig) C10193n.m20607a().mo18202a(ImCommerceConfigSettings.class, "commerce_im_config", C10181b.m20511a().mo18175c().getCommerceImConfig(), "com.ss.android.ugc.aweme.im.sdk.abtest.ImCommerceConfig", ImCommerceConfig.class);
        } catch (Throwable unused) {
            return null;
        }
    }
}
