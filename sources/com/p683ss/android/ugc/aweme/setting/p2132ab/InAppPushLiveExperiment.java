package com.p683ss.android.ugc.aweme.setting.p2132ab;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "is_live_in_app_push_enabled")
/* renamed from: com.ss.android.ugc.aweme.setting.ab.InAppPushLiveExperiment */
public final class InAppPushLiveExperiment {
    @C10179b
    private static final boolean DISABLE = false;
    @C10179b(mo18165a = true)
    private static final boolean ENABLE = true;
    public static final InAppPushLiveExperiment INSTANCE = new InAppPushLiveExperiment();

    private InAppPushLiveExperiment() {
    }

    /* renamed from: a */
    public static boolean m91346a() {
        return C10181b.m20511a().mo18172a(InAppPushLiveExperiment.class, true, "is_live_in_app_push_enabled", 31744, true);
    }
}
