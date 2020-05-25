package com.p683ss.android.ugc.aweme.familiar.experiment;

import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "familiar_feed_strategy")
/* renamed from: com.ss.android.ugc.aweme.familiar.experiment.FamiliarFeedStrategyExperiment */
public final class FamiliarFeedStrategyExperiment {
    public static final FamiliarFeedStrategyExperiment INSTANCE = new FamiliarFeedStrategyExperiment();
    @C10179b
    public static final int TYPE_FAMILIAR_WITHOUT_NEARBY = 1;
    @C10179b
    public static final int TYPE_FAMILIAR_WITH_NEARBY = 2;
    @C10179b(mo18165a = true)
    public static final int TYPE_NO_FAMILIAR = 0;

    private FamiliarFeedStrategyExperiment() {
    }
}
