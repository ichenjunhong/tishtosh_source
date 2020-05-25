package com.p683ss.android.ugc.aweme.share.libra;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "non_standard_ad_publish_toast_style")
/* renamed from: com.ss.android.ugc.aweme.share.libra.NonStandardAdPostExperiment */
public final class NonStandardAdPostExperiment {
    @C10179b(mo18165a = true)
    private static final int DISABLE = 0;
    @C10179b
    private static final int ENABLE = 2;
    public static final NonStandardAdPostExperiment INSTANCE = new NonStandardAdPostExperiment();
    @C10179b
    private static final int SHOW_ONLY = 1;

    private NonStandardAdPostExperiment() {
    }

    /* renamed from: a */
    public static boolean m92639a() {
        if (C10181b.m20511a().mo18168a(NonStandardAdPostExperiment.class, true, "non_standard_ad_publish_toast_style", 31744, 0) > DISABLE) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m92640b() {
        if (C10181b.m20511a().mo18168a(NonStandardAdPostExperiment.class, true, "non_standard_ad_publish_toast_style", 31744, 0) == ENABLE) {
            return true;
        }
        return false;
    }
}
