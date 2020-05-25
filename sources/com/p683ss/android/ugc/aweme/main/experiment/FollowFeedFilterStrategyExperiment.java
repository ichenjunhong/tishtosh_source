package com.p683ss.android.ugc.aweme.main.experiment;

import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "follow_feed_filter_strategy")
/* renamed from: com.ss.android.ugc.aweme.main.experiment.FollowFeedFilterStrategyExperiment */
public final class FollowFeedFilterStrategyExperiment {
    @C10179b
    public static final int FILTER_LIVE_FORWARD = 1;
    @C10179b(mo18165a = true)
    public static final int FILTER_LIVE_FORWARD_RECOMMEND = 2;
    @C10179b
    public static final int FILTER_NONE = 0;
    public static final FollowFeedFilterStrategyExperiment INSTANCE = new FollowFeedFilterStrategyExperiment();

    private FollowFeedFilterStrategyExperiment() {
    }
}
