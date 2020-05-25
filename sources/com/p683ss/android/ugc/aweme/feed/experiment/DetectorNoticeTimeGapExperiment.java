package com.p683ss.android.ugc.aweme.feed.experiment;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "network_notice_time")
/* renamed from: com.ss.android.ugc.aweme.feed.experiment.DetectorNoticeTimeGapExperiment */
public final class DetectorNoticeTimeGapExperiment {
    @C10179b(mo18165a = true)
    private static final long DEFAULT_TIME_GAP = 15000;
    public static final DetectorNoticeTimeGapExperiment INSTANCE = new DetectorNoticeTimeGapExperiment();
    public static long timeGap;

    private DetectorNoticeTimeGapExperiment() {
    }

    static {
        long a = C10181b.m20511a().mo18169a(DetectorNoticeTimeGapExperiment.class, true, "network_notice_time", 31744, (long) DEFAULT_TIME_GAP);
        if (a <= 0) {
            a = DEFAULT_TIME_GAP;
        }
        timeGap = a;
    }
}
