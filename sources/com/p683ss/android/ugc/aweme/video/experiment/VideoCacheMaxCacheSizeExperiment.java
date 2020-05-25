package com.p683ss.android.ugc.aweme.video.experiment;

import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "player_cache_max_size")
/* renamed from: com.ss.android.ugc.aweme.video.experiment.VideoCacheMaxCacheSizeExperiment */
public final class VideoCacheMaxCacheSizeExperiment {
    @C10179b(mo18165a = true)
    public static final int DEFAULT_SIZE = -1;
    public static final VideoCacheMaxCacheSizeExperiment INSTANCE = new VideoCacheMaxCacheSizeExperiment();
    @C10179b
    public static int MIN_SIZE;
    public static int UNIT_CONVERSION = 1048576;

    private VideoCacheMaxCacheSizeExperiment() {
    }
}
