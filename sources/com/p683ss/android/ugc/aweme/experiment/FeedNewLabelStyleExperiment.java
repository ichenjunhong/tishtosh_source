package com.p683ss.android.ugc.aweme.experiment;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "should_optimize_relation_label")
/* renamed from: com.ss.android.ugc.aweme.experiment.FeedNewLabelStyleExperiment */
public final class FeedNewLabelStyleExperiment {
    @C10179b(mo18165a = true)
    private static final boolean DISABLED = false;
    @C10179b
    private static final boolean ENABLED = true;
    public static final FeedNewLabelStyleExperiment INSTANCE = new FeedNewLabelStyleExperiment();

    private FeedNewLabelStyleExperiment() {
    }

    /* renamed from: a */
    public static final boolean m69590a() {
        return C10181b.m20511a().mo18172a(FeedNewLabelStyleExperiment.class, true, "should_optimize_relation_label", 31744, false);
    }
}
