package com.p683ss.android.ugc.aweme.commercialize.settings;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.commercialize.settings.EnableSendV3AppLog */
public final class EnableSendV3AppLog {
    @C10179b
    private static final boolean DEFAULT = false;
    public static final EnableSendV3AppLog INSTANCE = new EnableSendV3AppLog();

    private EnableSendV3AppLog() {
    }

    public static /* synthetic */ void enableV3$annotations() {
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }

    public static final boolean getEnableV3() {
        try {
            return C10193n.m20607a().mo18204a(EnableSendV3AppLog.class, "enable_send_v3_applog", C10181b.m20511a().mo18175c().getEnableSendV3Applog(), false);
        } catch (Throwable unused) {
            return DEFAULT;
        }
    }
}
