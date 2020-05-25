package com.p683ss.android.ugc.aweme.p1807im.sdk.abtest;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.im.sdk.abtest.ImDisplayStrongTipsIntervalSettings */
public final class ImDisplayStrongTipsIntervalSettings {
    public static final ImDisplayStrongTipsIntervalSettings INSTANCE = new ImDisplayStrongTipsIntervalSettings();
    @C10179b
    private static final long interval = interval;

    private ImDisplayStrongTipsIntervalSettings() {
    }

    public final long getInterval() {
        return interval;
    }

    public final long getImDisPlayStrongTipsInterval() {
        try {
            return C10193n.m20607a().mo18201a(ImDisplayStrongTipsIntervalSettings.class, "display_strong_tips_interval", C10181b.m20511a().mo18175c().getDisplayStrongTipsInterval(), (long) interval);
        } catch (Throwable unused) {
            return interval;
        }
    }
}
