package com.p683ss.android.ugc.aweme.experiment;

import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.p620a.C10180c;

@C10178a(mo18163a = "follow_feed_auto_refresh_after_restart_duration")
@C10180c
/* renamed from: com.ss.android.ugc.aweme.experiment.AutoRefreshAfterRestartExperiment */
public final class AutoRefreshAfterRestartExperiment {
    @C10179b
    private static final int AUTO_REFRESH_1 = 1;
    @C10179b
    private static final int AUTO_REFRESH_120 = 120;
    @C10179b
    private static final int AUTO_REFRESH_30 = 30;
    @C10179b
    private static final int AUTO_REFRESH_5 = 5;
    @C10179b(mo18165a = true)
    private static final int DEFAULT = 0;
    public static final AutoRefreshAfterRestartExperiment INSTANCE = new AutoRefreshAfterRestartExperiment();

    private AutoRefreshAfterRestartExperiment() {
    }
}
