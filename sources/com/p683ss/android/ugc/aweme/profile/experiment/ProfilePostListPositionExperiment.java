package com.p683ss.android.ugc.aweme.profile.experiment;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "profile_post_list_position")
/* renamed from: com.ss.android.ugc.aweme.profile.experiment.ProfilePostListPositionExperiment */
public final class ProfilePostListPositionExperiment {
    @C10179b(mo18165a = true)
    public static final boolean DISABLE = false;
    @C10179b
    public static final boolean ENABLE = true;
    public static final ProfilePostListPositionExperiment INSTANCE = new ProfilePostListPositionExperiment();

    private ProfilePostListPositionExperiment() {
    }

    /* renamed from: a */
    public static final boolean m88629a() {
        return C10181b.m20511a().mo18172a(ProfilePostListPositionExperiment.class, true, "profile_post_list_position", 31744, false);
    }
}
