package com.p683ss.android.ugc.aweme.experiment;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "should_optimize_interactive_relation_label")
/* renamed from: com.ss.android.ugc.aweme.experiment.FeedNewInteractiveLabelStyleExperiment */
public final class FeedNewInteractiveLabelStyleExperiment {
    @C10179b(mo18165a = true)
    private static final boolean DISABLED = false;
    @C10179b
    private static final boolean ENABLED = true;
    public static final FeedNewInteractiveLabelStyleExperiment INSTANCE = new FeedNewInteractiveLabelStyleExperiment();

    private FeedNewInteractiveLabelStyleExperiment() {
    }

    /* renamed from: a */
    public static final boolean m69589a() {
        return C10181b.m20511a().mo18172a(FeedNewInteractiveLabelStyleExperiment.class, true, "should_optimize_interactive_relation_label", 31744, false);
    }
}
