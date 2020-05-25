package com.p683ss.android.ugc.aweme.feed.netdetector;

import com.p683ss.android.ugc.aweme.feed.experiment.DetectorEnableExperiment;
import com.p683ss.android.ugc.aweme.feed.experiment.DetectorNoticeEnableExperiment;

/* renamed from: com.ss.android.ugc.aweme.feed.netdetector.b */
public final class C30550b {
    /* renamed from: a */
    public static final boolean m71530a(int i, int i2) {
        return (i == 1 || i == 0) && i2 != 8;
    }

    /* renamed from: a */
    public static final boolean m71529a() {
        return DetectorEnableExperiment.m70943a();
    }

    /* renamed from: b */
    public static final boolean m71531b() {
        if (!m71529a() || !DetectorNoticeEnableExperiment.m70944a()) {
            return false;
        }
        return true;
    }
}
