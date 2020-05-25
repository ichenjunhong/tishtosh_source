package com.p683ss.android.ugc.aweme.feed.experiment;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "feed_player_clean_optimize")
/* renamed from: com.ss.android.ugc.aweme.feed.experiment.FeedPlayerCleanOptimize */
public final class FeedPlayerCleanOptimize {
    @C10179b(mo18165a = true)
    public static final int DEFAULT = 0;
    public static final FeedPlayerCleanOptimize INSTANCE = new FeedPlayerCleanOptimize();
    @C10179b
    public static final int PLAN_1 = 1;
    @C10179b
    public static final int PLAN_2 = 2;

    private FeedPlayerCleanOptimize() {
    }

    /* renamed from: a */
    public static final boolean m70946a() {
        if (m70947b() == 1 || m70947b() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final int m70947b() {
        return C10181b.m20511a().mo18168a(FeedPlayerCleanOptimize.class, true, "feed_player_clean_optimize", 31744, 0);
    }
}
