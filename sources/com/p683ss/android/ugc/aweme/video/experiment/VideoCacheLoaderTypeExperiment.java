package com.p683ss.android.ugc.aweme.video.experiment;

import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "videocache_loader_type")
/* renamed from: com.ss.android.ugc.aweme.video.experiment.VideoCacheLoaderTypeExperiment */
public final class VideoCacheLoaderTypeExperiment {
    @C10179b
    public static final int ALIBABA_PRELOAD = 5;
    @C10179b
    public static final int BYTEDANCE_PRELOAD = 2;
    @C10179b(mo18165a = true)
    public static final int HTTP_PRELOAD = 0;
    public static final VideoCacheLoaderTypeExperiment INSTANCE = new VideoCacheLoaderTypeExperiment();
    @C10179b
    public static final int KINGSOFT_PRELOAD = 3;
    @C10179b
    public static final int XY_PRELOAD = 1;
    @C10179b
    public static final int YF_PRELOAD = 4;

    private VideoCacheLoaderTypeExperiment() {
    }
}
