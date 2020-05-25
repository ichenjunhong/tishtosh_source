package com.p683ss.android.ugc.aweme.experiment;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "studio_enable_green_screen_mode")
/* renamed from: com.ss.android.ugc.aweme.experiment.GreenScreenModeExperiment */
public final class GreenScreenModeExperiment {
    @C10179b(mo18165a = true)
    public static final boolean CONTROL_GROUP = false;
    @C10179b
    public static final boolean GROUP1 = true;
    public static final GreenScreenModeExperiment INSTANCE = new GreenScreenModeExperiment();

    private GreenScreenModeExperiment() {
    }

    /* renamed from: a */
    public static final boolean m69597a() {
        return C10181b.m20511a().mo18172a(GreenScreenModeExperiment.class, true, "studio_enable_green_screen_mode", 31744, false);
    }
}
