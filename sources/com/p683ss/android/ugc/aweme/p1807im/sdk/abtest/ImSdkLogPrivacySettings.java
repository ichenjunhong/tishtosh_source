package com.p683ss.android.ugc.aweme.p1807im.sdk.abtest;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.im.sdk.abtest.ImSdkLogPrivacySettings */
public final class ImSdkLogPrivacySettings {
    @C10179b
    private static final boolean DEFAULT = false;
    public static final ImSdkLogPrivacySettings INSTANCE = new ImSdkLogPrivacySettings();

    private ImSdkLogPrivacySettings() {
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }

    public static final boolean isLogEnabled() {
        return C10193n.m20607a().mo18204a(ImSdkLogPrivacySettings.class, "enable_im_sdk_log", C10181b.m20511a().mo18175c().getEnableImSdkLog(), false);
    }
}
