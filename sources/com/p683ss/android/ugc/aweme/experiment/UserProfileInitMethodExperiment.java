package com.p683ss.android.ugc.aweme.experiment;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.p683ss.android.ugc.aweme.p1397az.C23337c;

@C10178a(mo18163a = "user_profile_init_method")
/* renamed from: com.ss.android.ugc.aweme.experiment.UserProfileInitMethodExperiment */
public final class UserProfileInitMethodExperiment {
    @C10179b
    public static final int DEFAULT = 0;
    public static final UserProfileInitMethodExperiment INSTANCE = new UserProfileInitMethodExperiment();
    @C10179b(mo18165a = true)
    public static final int LOAD_WHEN_NEED = 2;
    @C10179b
    public static final int LOAD_WHEN_NEED_FOR_POOR = 1;

    private UserProfileInitMethodExperiment() {
    }

    /* renamed from: a */
    public static final boolean m69634a() {
        if ((m69635b() != 1 || !C23337c.m57398a()) && m69635b() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static int m69635b() {
        return C10181b.m20511a().mo18168a(UserProfileInitMethodExperiment.class, true, "user_profile_init_method", 31744, 2);
    }
}
