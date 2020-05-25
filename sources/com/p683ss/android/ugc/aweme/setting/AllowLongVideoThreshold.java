package com.p683ss.android.ugc.aweme.setting;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.setting.AllowLongVideoThreshold */
public final class AllowLongVideoThreshold {
    public static final AllowLongVideoThreshold INSTANCE = new AllowLongVideoThreshold();
    @C10179b
    private static final int THRESHOLD = 0;

    private AllowLongVideoThreshold() {
    }

    public final int getTHRESHOLD() {
        return THRESHOLD;
    }

    public final long videoThreshold() {
        return (long) C10193n.m20607a().mo18200a(AllowLongVideoThreshold.class, "allow_long_video_threshold", C10181b.m20511a().mo18175c().getAllowLongVideoThreshold(), 0);
    }
}
