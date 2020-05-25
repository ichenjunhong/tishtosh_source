package com.p683ss.android.ugc.aweme.feed.experiment;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "enable_network_notice")
/* renamed from: com.ss.android.ugc.aweme.feed.experiment.DetectorNoticeEnableExperiment */
public final class DetectorNoticeEnableExperiment {
    @C10179b(mo18165a = true)
    private static final boolean DISABLE = false;
    @C10179b
    private static final boolean ENABLE = true;
    public static final DetectorNoticeEnableExperiment INSTANCE = new DetectorNoticeEnableExperiment();
    private static boolean enableDetector;

    private DetectorNoticeEnableExperiment() {
    }

    /* renamed from: a */
    public static boolean m70944a() {
        return enableDetector;
    }

    static {
        boolean z = true;
        if (C10181b.m20511a().mo18172a(DetectorNoticeEnableExperiment.class, true, "enable_network_notice", 31744, false) != ENABLE) {
            z = false;
        }
        enableDetector = z;
    }
}
