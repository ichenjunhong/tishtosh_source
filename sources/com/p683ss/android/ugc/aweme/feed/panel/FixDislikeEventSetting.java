package com.p683ss.android.ugc.aweme.feed.panel;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.feed.panel.FixDislikeEventSetting */
public final class FixDislikeEventSetting {
    @C10179b(mo18165a = true)
    private static final int FIX = 1;
    public static final FixDislikeEventSetting INSTANCE = new FixDislikeEventSetting();

    private FixDislikeEventSetting() {
    }

    public static final boolean isOpen() {
        if (C10193n.m20607a().mo18200a(FixDislikeEventSetting.class, "fix_dislike_event_setting", C10181b.m20511a().mo18175c().getFixDislikeEventSetting(), 1) == 1) {
            return true;
        }
        return false;
    }
}
