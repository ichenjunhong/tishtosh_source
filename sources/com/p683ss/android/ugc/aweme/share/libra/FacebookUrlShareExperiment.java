package com.p683ss.android.ugc.aweme.share.libra;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "facebook_url_share")
/* renamed from: com.ss.android.ugc.aweme.share.libra.FacebookUrlShareExperiment */
public final class FacebookUrlShareExperiment {
    @C10179b(mo18165a = true)
    private static final boolean DISABLED = false;
    @C10179b
    private static final boolean ENABLED = true;
    public static final FacebookUrlShareExperiment INSTANCE = new FacebookUrlShareExperiment();

    private FacebookUrlShareExperiment() {
    }

    /* renamed from: a */
    public static boolean m92636a() {
        return C10181b.m20511a().mo18172a(FacebookUrlShareExperiment.class, true, "facebook_url_share", 31744, false);
    }
}
