package com.p683ss.android.ugc.aweme.follow.experiment;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "is_smart_feed")
/* renamed from: com.ss.android.ugc.aweme.follow.experiment.SmartFeedExperiment */
public final class SmartFeedExperiment {
    @C10179b(mo18165a = true)
    private static final int DISABLE = 0;
    @C10179b
    private static final int ENABLE = 1;
    public static final SmartFeedExperiment INSTANCE = new SmartFeedExperiment();

    private SmartFeedExperiment() {
    }

    /* renamed from: a */
    public static final boolean m74297a() {
        if (C10181b.m20511a().mo18168a(SmartFeedExperiment.class, true, "is_smart_feed", 31744, 0) == ENABLE) {
            return true;
        }
        return false;
    }
}
