package com.p683ss.android.ugc.aweme.p1807im.sdk.abtest;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.im.sdk.abtest.ImHotSpotConfigSettings */
public final class ImHotSpotConfigSettings {
    @C10179b(mo18165a = true)
    public static final long CONFIG = 172800;
    public static final ImHotSpotConfigSettings INSTANCE = new ImHotSpotConfigSettings();

    private ImHotSpotConfigSettings() {
    }

    public final long getExpiredTime() {
        try {
            return C10193n.m20607a().mo18201a(ImHotSpotConfigSettings.class, "chat_video_hot_time", C10181b.m20511a().mo18175c().getChatVideoHotTime(), (long) CONFIG);
        } catch (Throwable unused) {
            return CONFIG;
        }
    }
}
