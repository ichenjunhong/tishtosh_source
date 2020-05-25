package com.p683ss.android.ugc.aweme.p1807im.sdk.abtest;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "im_active_state_enhance")
/* renamed from: com.ss.android.ugc.aweme.im.sdk.abtest.ImActiveStateEnhanceExperiment */
public final class ImActiveStateEnhanceExperiment {
    @C10179b(mo18165a = true)
    private static final boolean DISABLED = false;
    @C10179b
    private static final boolean ENABLED = true;
    public static final ImActiveStateEnhanceExperiment INSTANCE = new ImActiveStateEnhanceExperiment();

    private ImActiveStateEnhanceExperiment() {
    }

    /* renamed from: a */
    public static final boolean m76317a() {
        return C10181b.m20511a().mo18172a(ImActiveStateEnhanceExperiment.class, true, "im_active_state_enhance", 31744, false);
    }
}
