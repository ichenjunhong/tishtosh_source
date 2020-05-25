package com.p683ss.android.ugc.aweme.commercialize.abtest;

import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "normal_splash_ad_delay_millis")
/* renamed from: com.ss.android.ugc.aweme.commercialize.abtest.NormalSplashDelayExperiment */
public final class NormalSplashDelayExperiment {
    @C10179b(mo18165a = true)
    public static final int CONTROL_GROUP = 0;
    @C10179b
    public static final int GROUP1 = 250;
    @C10179b
    public static final int GROUP2 = 500;
    public static final NormalSplashDelayExperiment INSTANCE = new NormalSplashDelayExperiment();

    private NormalSplashDelayExperiment() {
    }
}
