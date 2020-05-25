package com.p683ss.android.ugc.aweme.experiment;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "show_super_accounts_to_unlogged_users")
/* renamed from: com.ss.android.ugc.aweme.experiment.RecommendSuperAccountExperiment */
public final class RecommendSuperAccountExperiment {
    public static final RecommendSuperAccountExperiment INSTANCE = new RecommendSuperAccountExperiment();
    @C10179b
    private static final int NEW_DATA_AND_STYLE = 2;
    @C10179b
    private static final int ONLY_NEW_DATA = 1;
    @C10179b(mo18165a = true)
    private static final int ORIGIN = 0;

    private RecommendSuperAccountExperiment() {
    }

    /* renamed from: a */
    public static final boolean m69624a() {
        if (C10181b.m20511a().mo18168a(RecommendSuperAccountExperiment.class, true, "show_super_accounts_to_unlogged_users", 31744, 0) == NEW_DATA_AND_STYLE) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m69625b() {
        if (C10181b.m20511a().mo18168a(RecommendSuperAccountExperiment.class, true, "show_super_accounts_to_unlogged_users", 31744, 0) != ORIGIN) {
            return true;
        }
        return false;
    }
}
