package com.p683ss.android.ugc.aweme.experiment;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "follow_to_follow_back_experiment")
/* renamed from: com.ss.android.ugc.aweme.experiment.FollowToFollowBackExperiment */
public final class FollowToFollowBackExperiment {
    @C10179b(mo18165a = true)
    private static final int DEFAULT = 0;
    @C10179b
    private static final int EXPERIMENT_ONE = 1;
    @C10179b
    public static final int EXPERIMENT_TWO = 2;
    public static final FollowToFollowBackExperiment INSTANCE = new FollowToFollowBackExperiment();

    private FollowToFollowBackExperiment() {
    }

    /* renamed from: a */
    public static final boolean m69596a() {
        int a = C10181b.m20511a().mo18168a(FollowToFollowBackExperiment.class, true, "follow_to_follow_back_experiment", 31744, 0);
        if (a == EXPERIMENT_ONE || a == EXPERIMENT_TWO) {
            return true;
        }
        return false;
    }
}
