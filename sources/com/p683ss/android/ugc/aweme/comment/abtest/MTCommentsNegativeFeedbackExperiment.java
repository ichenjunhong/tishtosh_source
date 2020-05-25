package com.p683ss.android.ugc.aweme.comment.abtest;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "bury_show_type")
/* renamed from: com.ss.android.ugc.aweme.comment.abtest.MTCommentsNegativeFeedbackExperiment */
public final class MTCommentsNegativeFeedbackExperiment {
    @C10179b(mo18165a = true)
    private static final int CONTROL_GROUP = 0;
    public static final MTCommentsNegativeFeedbackExperiment INSTANCE = new MTCommentsNegativeFeedbackExperiment();
    @C10179b
    private static final int TREATMENT_GROUP1 = 1;
    @C10179b
    private static final int TREATMENT_GROUP2 = 2;
    @C10179b
    private static final int TREATMENT_GROUP3 = 3;
    @C10179b
    private static final int TREATMENT_GROUP4 = 4;

    private MTCommentsNegativeFeedbackExperiment() {
    }

    /* renamed from: a */
    public static final boolean m60923a() {
        if (m60926d() != CONTROL_GROUP) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m60924b() {
        if (m60926d() == TREATMENT_GROUP1 || m60926d() == TREATMENT_GROUP4) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m60925c() {
        if (m60926d() == TREATMENT_GROUP3 || m60926d() == TREATMENT_GROUP4) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static int m60926d() {
        return C10181b.m20511a().mo18168a(MTCommentsNegativeFeedbackExperiment.class, true, "bury_show_type", 31744, 0);
    }
}
