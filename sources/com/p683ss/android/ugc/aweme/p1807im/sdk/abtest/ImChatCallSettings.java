package com.p683ss.android.ugc.aweme.p1807im.sdk.abtest;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.im.sdk.abtest.ImChatCallSettings */
public final class ImChatCallSettings {
    @C10179b
    private static final boolean DEFAULT = false;
    public static final ImChatCallSettings INSTANCE = new ImChatCallSettings();

    private ImChatCallSettings() {
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }

    public static final boolean getValue() {
        return C10193n.m20607a().mo18204a(ImChatCallSettings.class, "im_enable_chat_call", C10181b.m20511a().mo18175c().getImEnableChatCall(), false);
    }
}
