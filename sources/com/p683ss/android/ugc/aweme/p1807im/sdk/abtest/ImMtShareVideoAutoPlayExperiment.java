package com.p683ss.android.ugc.aweme.p1807im.sdk.abtest;

import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "im_mt_share_video_auto_play")
/* renamed from: com.ss.android.ugc.aweme.im.sdk.abtest.ImMtShareVideoAutoPlayExperiment */
public final class ImMtShareVideoAutoPlayExperiment {
    @C10179b
    private static final int EXPERIMENT_1 = 1;
    @C10179b
    public static final int EXPERIMENT_2 = 2;
    public static final ImMtShareVideoAutoPlayExperiment INSTANCE = new ImMtShareVideoAutoPlayExperiment();
    @C10179b(mo18165a = true)
    private static final int ONLINE = 0;

    private ImMtShareVideoAutoPlayExperiment() {
    }

    /* renamed from: a */
    public static int m76318a() {
        return ONLINE;
    }

    /* renamed from: b */
    public static int m76319b() {
        return EXPERIMENT_1;
    }
}
