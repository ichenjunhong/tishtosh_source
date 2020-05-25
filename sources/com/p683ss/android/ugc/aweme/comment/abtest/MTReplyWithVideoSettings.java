package com.p683ss.android.ugc.aweme.comment.abtest;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.comment.abtest.MTReplyWithVideoSettings */
public final class MTReplyWithVideoSettings {
    @C10179b
    private static final int DEFAULT = 0;
    public static final MTReplyWithVideoSettings INSTANCE = new MTReplyWithVideoSettings();

    private MTReplyWithVideoSettings() {
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }

    public static final boolean isEnable() {
        if (C10193n.m20607a().mo18200a(MTReplyWithVideoSettings.class, "enable_video_reply", C10181b.m20511a().mo18175c().getEnableVideoReply(), 0) == 1) {
            return true;
        }
        return false;
    }
}
