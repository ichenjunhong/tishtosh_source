package com.p683ss.android.ugc.aweme.experiment;

import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.p620a.C10180c;

@C10178a(mo18163a = "batch_event_interval")
@C10180c
/* renamed from: com.ss.android.ugc.aweme.experiment.BatchEventIntervalExperiment */
public final class BatchEventIntervalExperiment {
    @C10179b(mo18165a = true)
    public static final long DEFAULT_INTERVAL = 60;
    public static final BatchEventIntervalExperiment INSTANCE = new BatchEventIntervalExperiment();
    @C10179b
    public static final long INTERVAL_20 = 20;

    private BatchEventIntervalExperiment() {
    }
}
