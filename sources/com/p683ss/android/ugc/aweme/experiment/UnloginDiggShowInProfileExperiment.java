package com.p683ss.android.ugc.aweme.experiment;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "enable_liked_videos_unlogged_profile")
/* renamed from: com.ss.android.ugc.aweme.experiment.UnloginDiggShowInProfileExperiment */
public final class UnloginDiggShowInProfileExperiment {
    public static final UnloginDiggShowInProfileExperiment INSTANCE = new UnloginDiggShowInProfileExperiment();
    @C10179b(mo18165a = true)
    public static final int OFF = 0;
    @C10179b
    public static final int SHOW_3 = 1;
    @C10179b
    public static final int SHOW_6 = 2;

    private UnloginDiggShowInProfileExperiment() {
    }

    /* renamed from: c */
    private static int m69629c() {
        return C10181b.m20511a().mo18168a(UnloginDiggShowInProfileExperiment.class, true, "enable_liked_videos_unlogged_profile", 31744, 0);
    }

    /* renamed from: a */
    public final boolean mo59615a() {
        if (m69629c() == 0 || C10181b.m20511a().mo18168a(UnLoginDiggExperiment.class, true, "unlogin_digg_limit", 31744, 0) != -1) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final int mo59616b() {
        switch (m69629c()) {
            case 1:
                return 3;
            case 2:
                return 6;
            default:
                return 0;
        }
    }
}
