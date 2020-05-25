package com.p683ss.android.ugc.aweme.discover.abtest;

import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "search_dynamic_video_cover_display")
/* renamed from: com.ss.android.ugc.aweme.discover.abtest.SearchVideoCoverDisplayExperiment */
public final class SearchVideoCoverDisplayExperiment {
    @C10179b
    public static final int BOTH_SIDES_INTERLACED_PLAY = 1;
    @C10179b
    public static final int BOTH_SIDES_SEQUENTIAL_PLAY = 2;
    @C10179b(mo18165a = true)
    public static final int DEFAULT_STATIC_COVER = 0;
    public static final SearchVideoCoverDisplayExperiment INSTANCE = new SearchVideoCoverDisplayExperiment();

    private SearchVideoCoverDisplayExperiment() {
    }
}
