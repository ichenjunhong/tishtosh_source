package com.p683ss.android.ugc.aweme.p1807im.sdk.group.model;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.model.FamiliarGroupEnhanceSetting */
public final class FamiliarGroupEnhanceSetting {
    public static final FamiliarGroupEnhanceSetting INSTANCE = new FamiliarGroupEnhanceSetting();
    @C10179b
    private static FamiliarGroupEnhanceConfig config;

    private FamiliarGroupEnhanceSetting() {
    }

    public final FamiliarGroupEnhanceConfig getConfig() {
        return config;
    }

    public final FamiliarGroupEnhanceConfig getFamiliarGroupEnhanceConfig() {
        try {
            return (FamiliarGroupEnhanceConfig) C10193n.m20607a().mo18202a(FamiliarGroupEnhanceSetting.class, "familiar_im_group_config", C10181b.m20511a().mo18175c().getFamiliarImGroupConfig(), "com.ss.android.ugc.aweme.im.sdk.group.model.FamiliarGroupEnhanceConfig", FamiliarGroupEnhanceConfig.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void setConfig(FamiliarGroupEnhanceConfig familiarGroupEnhanceConfig) {
        config = familiarGroupEnhanceConfig;
    }
}
