package com.p683ss.android.ugc.aweme.commercialize.abtest;

import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.commercialize.abtest.SplashEnableValidTimeSetting */
public final class SplashEnableValidTimeSetting {
    @C10179b(mo18165a = true)
    private static final boolean ENABLE_SPLASH_VALID_TIME_CHECK = false;
    public static final SplashEnableValidTimeSetting INSTANCE = new SplashEnableValidTimeSetting();

    private SplashEnableValidTimeSetting() {
    }

    public final boolean getENABLE_SPLASH_VALID_TIME_CHECK() {
        return ENABLE_SPLASH_VALID_TIME_CHECK;
    }
}
