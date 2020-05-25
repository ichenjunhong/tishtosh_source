package com.p683ss.android.ugc.aweme.p1308ad.settings;

import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;
import p2628d.p2639f.p2641b.C52711k;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.ad.settings.AutoConnectFEConfig */
public final class AutoConnectFEConfig {
    public static final AutoConnectFEConfig INSTANCE = new AutoConnectFEConfig();
    @C10179b
    private static String[] autoConnectFEPath;

    private AutoConnectFEConfig() {
    }

    public static final boolean shouldAppendDeviceId(String str) {
        C52711k.m112240b(str, "url");
        return false;
    }

    public final String[] getAutoConnectFEPath() {
        return autoConnectFEPath;
    }

    public final void setAutoConnectFEPath(String[] strArr) {
        autoConnectFEPath = strArr;
    }
}
