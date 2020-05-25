package com.p683ss.android.ugc.aweme.p1807im.sdk.abtest;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "im_show_recommend_interval")
/* renamed from: com.ss.android.ugc.aweme.im.sdk.abtest.IMShowRecommendIntervalExperiment */
public final class IMShowRecommendIntervalExperiment {
    @C10179b
    public static final int DAY_14 = 14;
    @C10179b
    public static final int DAY_3 = 3;
    @C10179b
    public static final int DAY_7 = 7;
    @C10179b(mo18165a = true)
    public static final int DEFAULT = 0;
    public static final IMShowRecommendIntervalExperiment INSTANCE = new IMShowRecommendIntervalExperiment();

    private IMShowRecommendIntervalExperiment() {
    }

    /* renamed from: a */
    public static int m76316a() {
        return C10181b.m20511a().mo18168a(IMShowRecommendIntervalExperiment.class, true, "im_show_recommend_interval", 31744, 0);
    }
}
