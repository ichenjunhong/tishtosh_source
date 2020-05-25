package com.p683ss.android.ugc.aweme.familiar.experiment;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "familiar_text_adjustment_v2")
/* renamed from: com.ss.android.ugc.aweme.familiar.experiment.FamiliarShowTextExperiment */
public final class FamiliarShowTextExperiment {
    public static final FamiliarShowTextExperiment INSTANCE = new FamiliarShowTextExperiment();
    @C10179b(mo18165a = true)
    public static final int TYPE_NONE = -1;
    @C10179b
    public static final int TYPE_USE_FAMILIAR = 0;
    @C10179b
    public static final int TYPE_USE_FELLOW = 2;
    @C10179b
    public static final int TYPE_USE_FRIEND = 1;

    private FamiliarShowTextExperiment() {
    }

    /* renamed from: a */
    public static final int m69691a() {
        return C10181b.m20511a().mo18168a(FamiliarShowTextExperiment.class, true, "familiar_text_adjustment_v2", 31744, -1);
    }
}
