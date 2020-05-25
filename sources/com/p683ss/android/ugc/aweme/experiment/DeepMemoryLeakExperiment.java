package com.p683ss.android.ugc.aweme.experiment;

import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "deep_memory_leak")
/* renamed from: com.ss.android.ugc.aweme.experiment.DeepMemoryLeakExperiment */
public final class DeepMemoryLeakExperiment {
    @C10179b
    public static final int DEEP = 4;
    @C10179b(mo18165a = true)
    public static final int DEFAULT = 0;
    public static final DeepMemoryLeakExperiment INSTANCE = new DeepMemoryLeakExperiment();
    @C10179b
    public static final int LESS = 1;
    @C10179b
    public static final int NORMAL = 2;

    private DeepMemoryLeakExperiment() {
    }
}
