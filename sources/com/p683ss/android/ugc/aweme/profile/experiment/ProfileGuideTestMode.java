package com.p683ss.android.ugc.aweme.profile.experiment;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "ProfileGuideTestMode")
/* renamed from: com.ss.android.ugc.aweme.profile.experiment.ProfileGuideTestMode */
public final class ProfileGuideTestMode {
    @C10179b(mo18165a = true)
    private static final boolean DISABLED = false;
    @C10179b
    private static final boolean ENABLED = true;
    public static final ProfileGuideTestMode INSTANCE = new ProfileGuideTestMode();

    private ProfileGuideTestMode() {
    }

    /* renamed from: a */
    public static final boolean m88626a() {
        return C10181b.m20511a().mo18172a(ProfileGuideTestMode.class, true, "ProfileGuideTestMode", 31744, false);
    }
}
