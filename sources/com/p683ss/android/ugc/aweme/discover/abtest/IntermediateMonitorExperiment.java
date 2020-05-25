package com.p683ss.android.ugc.aweme.discover.abtest;

import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "intermediate_monitor")
/* renamed from: com.ss.android.ugc.aweme.discover.abtest.IntermediateMonitorExperiment */
public final class IntermediateMonitorExperiment {
    @C10179b(mo18165a = true)
    public static final int DEFAULT = 0;
    public static final IntermediateMonitorExperiment INSTANCE = new IntermediateMonitorExperiment();
    @C10179b
    public static final int MONITOR_NATIVE = 1;
    @C10179b
    public static final int MONITOR_RN = 2;

    private IntermediateMonitorExperiment() {
    }
}
