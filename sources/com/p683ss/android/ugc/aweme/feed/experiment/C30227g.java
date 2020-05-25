package com.p683ss.android.ugc.aweme.feed.experiment;

import com.bytedance.ies.abmock.C10181b;

/* renamed from: com.ss.android.ugc.aweme.feed.experiment.g */
public final class C30227g {
    /* renamed from: a */
    public static boolean m70973a(String str) {
        if (C10181b.m20511a().mo18168a(FeedLivePlayOptExperiment.class, true, "live_play_opt_enable", 31744, 1) != 1 || (!"homepage_hot".equalsIgnoreCase(str) && !"homepage_follow".equalsIgnoreCase(str))) {
            return false;
        }
        return true;
    }
}
