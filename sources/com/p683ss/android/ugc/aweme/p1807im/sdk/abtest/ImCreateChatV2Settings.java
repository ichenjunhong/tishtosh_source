package com.p683ss.android.ugc.aweme.p1807im.sdk.abtest;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.im.sdk.abtest.ImCreateChatV2Settings */
public final class ImCreateChatV2Settings {
    public static final ImCreateChatV2Settings INSTANCE = new ImCreateChatV2Settings();
    @C10179b
    private static final ImCreateChatV2Config config = null;

    private ImCreateChatV2Settings() {
    }

    public final ImCreateChatV2Config getConfig() {
        return config;
    }

    public final ImCreateChatV2Config getImCreateChatV2Setting() {
        try {
            return (ImCreateChatV2Config) C10193n.m20607a().mo18202a(ImCreateChatV2Settings.class, "im_group_chat_bubble_v2_setting_config", C10181b.m20511a().mo18175c().getImGroupChatBubbleV2SettingConfig(), "com.ss.android.ugc.aweme.im.sdk.abtest.ImCreateChatV2Config", ImCreateChatV2Config.class);
        } catch (Throwable unused) {
            return null;
        }
    }
}
