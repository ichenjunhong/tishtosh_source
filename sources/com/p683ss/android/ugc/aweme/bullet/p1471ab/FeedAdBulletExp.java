package com.p683ss.android.ugc.aweme.bullet.p1471ab;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.bullet.ab.FeedAdBulletExp */
public final class FeedAdBulletExp {
    public static final FeedAdBulletExp INSTANCE = new FeedAdBulletExp();
    @C10179b
    private static CommerceAdLandpageBulletConfig config;

    private FeedAdBulletExp() {
    }

    public final CommerceAdLandpageBulletConfig getConfig() {
        return config;
    }

    public static final boolean cardLandPageEnable() {
        CommerceAdLandpageBulletConfig internalConfig = INSTANCE.getInternalConfig();
        if (internalConfig != null && internalConfig.getTotalEnable()) {
            return internalConfig.getAdLandpageCardEnable();
        }
        return false;
    }

    public static final boolean douPlusEnable() {
        CommerceAdLandpageBulletConfig internalConfig = INSTANCE.getInternalConfig();
        if (internalConfig != null && internalConfig.getTotalEnable()) {
            return internalConfig.getDouplusEnable();
        }
        return false;
    }

    public static final boolean fakeLandPageEnable() {
        CommerceAdLandpageBulletConfig internalConfig = INSTANCE.getInternalConfig();
        if (internalConfig != null && internalConfig.getTotalEnable()) {
            return internalConfig.getAdLandpageFakeEnable();
        }
        return false;
    }

    public static final boolean nonFullScreenLandPageEnable() {
        CommerceAdLandpageBulletConfig internalConfig = INSTANCE.getInternalConfig();
        if (internalConfig != null && internalConfig.getTotalEnable()) {
            return internalConfig.getAdLandpageNonFullScreenEnable();
        }
        return false;
    }

    public static final boolean realLandPageEnable() {
        CommerceAdLandpageBulletConfig internalConfig = INSTANCE.getInternalConfig();
        if (internalConfig != null && internalConfig.getTotalEnable()) {
            return internalConfig.getAdLandpageRealEnable();
        }
        return false;
    }

    private final CommerceAdLandpageBulletConfig getInternalConfig() {
        if (config != null) {
            return config;
        }
        try {
            config = (CommerceAdLandpageBulletConfig) C10193n.m20607a().mo18202a(FeedAdBulletExp.class, "commerce_ad_landpage_bullet_config", C10181b.m20511a().mo18175c().getCommerceAdLandpageBulletConfig(), "com.ss.android.ugc.aweme.bullet.ab.CommerceAdLandpageBulletConfig", CommerceAdLandpageBulletConfig.class);
        } catch (Throwable unused) {
        }
        return config;
    }

    public final void setConfig(CommerceAdLandpageBulletConfig commerceAdLandpageBulletConfig) {
        config = commerceAdLandpageBulletConfig;
    }
}
