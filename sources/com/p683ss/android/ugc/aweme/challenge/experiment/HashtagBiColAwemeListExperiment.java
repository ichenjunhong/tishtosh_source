package com.p683ss.android.ugc.aweme.challenge.experiment;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "hashtag_detail_double_playlist")
/* renamed from: com.ss.android.ugc.aweme.challenge.experiment.HashtagBiColAwemeListExperiment */
public final class HashtagBiColAwemeListExperiment {
    @C10179b(mo18165a = true)
    public static final int DEFAULT = 0;
    @C10179b
    public static final int GROUP1 = 1;
    @C10179b
    public static final int GROUP2 = 2;
    @C10179b
    public static final int GROUP3 = 3;
    @C10179b
    public static final int GROUP4 = 4;
    public static final HashtagBiColAwemeListExperiment INSTANCE = new HashtagBiColAwemeListExperiment();

    private HashtagBiColAwemeListExperiment() {
    }

    /* renamed from: a */
    public static final boolean m60028a() {
        if (C10181b.m20511a().mo18168a(HashtagBiColAwemeListExperiment.class, true, "hashtag_detail_double_playlist", 31744, 0) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m60029b() {
        int a = C10181b.m20511a().mo18168a(HashtagBiColAwemeListExperiment.class, true, "hashtag_detail_double_playlist", 31744, 0);
        if (a == 1 || a == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m60030c() {
        int a = C10181b.m20511a().mo18168a(HashtagBiColAwemeListExperiment.class, true, "hashtag_detail_double_playlist", 31744, 0);
        if (a == 1 || a == 2 || a == 3) {
            return true;
        }
        return false;
    }
}
