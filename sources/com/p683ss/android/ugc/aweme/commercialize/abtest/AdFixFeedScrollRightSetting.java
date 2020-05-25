package com.p683ss.android.ugc.aweme.commercialize.abtest;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.commercialize.abtest.AdFixFeedScrollRightSetting */
public final class AdFixFeedScrollRightSetting {
    @C10179b
    private static final boolean DEFAULT = false;
    public static final AdFixFeedScrollRightSetting INSTANCE = new AdFixFeedScrollRightSetting();

    private AdFixFeedScrollRightSetting() {
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }

    public static final boolean get() {
        try {
            return C10193n.m20607a().mo18204a(AdFixFeedScrollRightSetting.class, "ad_fix_feed_scroll_right", C10181b.m20511a().mo18175c().getAdFixFeedScrollRight(), false);
        } catch (Throwable unused) {
            return DEFAULT;
        }
    }
}
