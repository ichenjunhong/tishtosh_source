package com.p683ss.android.ugc.aweme.profile.experiment;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import p2628d.p2639f.p2641b.C52711k;

@C10178a(mo18163a = "complete_profile_name_and_avatar_strategy")
/* renamed from: com.ss.android.ugc.aweme.profile.experiment.ProfileGuideTimeInterval */
public final class ProfileGuideTimeInterval {
    @C10179b
    private static final int FOURTEEN = 14;
    public static final ProfileGuideTimeInterval INSTANCE = new ProfileGuideTimeInterval();
    public static final int MAXIMUM_TIME = 5;
    @C10179b(mo18165a = true)
    private static final int NONE = 0;
    @C10179b
    private static final int SEVEN = 7;
    @C10179b
    private static final int THREE = 3;

    private ProfileGuideTimeInterval() {
    }

    /* renamed from: b */
    public static final int m88628b() {
        return C10181b.m20511a().mo18168a(ProfileGuideTimeInterval.class, true, "complete_profile_name_and_avatar_strategy", 31744, 0);
    }

    /* renamed from: a */
    public static final boolean m88627a() {
        if (TimeLockRuler.isTeenModeON()) {
            return false;
        }
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        if (g.isLogin() && C10181b.m20511a().mo18168a(ProfileGuideTimeInterval.class, true, "complete_profile_name_and_avatar_strategy", 31744, 0) != 0) {
            return true;
        }
        return false;
    }
}
