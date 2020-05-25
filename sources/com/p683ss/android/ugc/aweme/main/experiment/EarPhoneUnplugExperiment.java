package com.p683ss.android.ugc.aweme.main.experiment;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "aweme_will_stop_when_headphones_pulled")
/* renamed from: com.ss.android.ugc.aweme.main.experiment.EarPhoneUnplugExperiment */
public final class EarPhoneUnplugExperiment {
    public static final EarPhoneUnplugExperiment INSTANCE = new EarPhoneUnplugExperiment();
    @C10179b
    public static final boolean NEW = true;
    @C10179b(mo18165a = true)
    public static final boolean OLD = false;

    private EarPhoneUnplugExperiment() {
    }

    /* renamed from: a */
    public static final boolean m82548a() {
        return C10181b.m20511a().mo18172a(EarPhoneUnplugExperiment.class, true, "aweme_will_stop_when_headphones_pulled", 31744, false);
    }
}
