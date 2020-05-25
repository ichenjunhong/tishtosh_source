package com.p683ss.android.ugc.aweme.p1807im.sdk.abtest;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.im.sdk.abtest.UserActiveStatusConfigSettings */
public final class UserActiveStatusConfigSettings {
    private static final UserActiveStatusConfig DEFAULT = new UserActiveStatusConfig(600, NormalGiftView.ALPHA_180, 300);
    public static final UserActiveStatusConfigSettings INSTANCE = new UserActiveStatusConfigSettings();
    @C10179b
    private static final UserActiveStatusConfig config = null;

    private UserActiveStatusConfigSettings() {
    }

    public final UserActiveStatusConfig getConfig() {
        return config;
    }

    public final UserActiveStatusConfig getDEFAULT() {
        return DEFAULT;
    }

    public final UserActiveStatusConfig getValue() {
        UserActiveStatusConfig userActiveStatusConfig;
        try {
            userActiveStatusConfig = (UserActiveStatusConfig) C10193n.m20607a().mo18202a(UserActiveStatusConfigSettings.class, "user_active_status_config", C10181b.m20511a().mo18175c().getUserActiveStatusConfig(), "com.ss.android.ugc.aweme.im.sdk.abtest.UserActiveStatusConfig", UserActiveStatusConfig.class);
        } catch (Throwable unused) {
            userActiveStatusConfig = null;
        }
        if (userActiveStatusConfig == null) {
            return DEFAULT;
        }
        return userActiveStatusConfig;
    }
}
