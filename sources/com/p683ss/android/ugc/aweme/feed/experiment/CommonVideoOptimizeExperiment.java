package com.p683ss.android.ugc.aweme.feed.experiment;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "common_video_optimize")
/* renamed from: com.ss.android.ugc.aweme.feed.experiment.CommonVideoOptimizeExperiment */
public final class CommonVideoOptimizeExperiment {
    @C10179b(mo18165a = true)
    private static final boolean DISABLE = false;
    @C10179b
    private static final boolean ENABLE = true;
    public static final CommonVideoOptimizeExperiment INSTANCE = new CommonVideoOptimizeExperiment();

    private CommonVideoOptimizeExperiment() {
    }

    /* renamed from: a */
    public static final boolean m70942a() {
        try {
            return C10181b.m20511a().mo18172a(CommonVideoOptimizeExperiment.class, true, "common_video_optimize", 31744, false);
        } catch (Throwable unused) {
            return DISABLE;
        }
    }
}
