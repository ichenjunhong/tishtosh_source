package com.p683ss.android.ugc.aweme.feed.experiment;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "feed_avatar_title_redesign_style")
/* renamed from: com.ss.android.ugc.aweme.feed.experiment.PlayerRedesignExperiment */
public final class PlayerRedesignExperiment {
    @C10179b
    public static final int GROUP_1 = 1;
    @C10179b
    public static final int GROUP_2 = 2;
    @C10179b
    public static final int GROUP_3 = 3;
    @C10179b
    public static final int GROUP_4 = 4;
    @C10179b
    public static final int GROUP_5 = 5;
    public static final PlayerRedesignExperiment INSTANCE = new PlayerRedesignExperiment();
    @C10179b(mo18165a = true)
    public static final int NORMAL = 0;

    private PlayerRedesignExperiment() {
    }

    /* renamed from: a */
    public static int m70953a() {
        return C10181b.m20511a().mo18168a(PlayerRedesignExperiment.class, true, "feed_avatar_title_redesign_style", 31744, 0);
    }
}
