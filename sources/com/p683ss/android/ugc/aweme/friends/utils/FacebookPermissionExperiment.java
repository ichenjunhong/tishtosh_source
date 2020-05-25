package com.p683ss.android.ugc.aweme.friends.utils;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "facebook_permission_pop_up")
/* renamed from: com.ss.android.ugc.aweme.friends.utils.FacebookPermissionExperiment */
public final class FacebookPermissionExperiment {
    public static final FacebookPermissionExperiment INSTANCE = new FacebookPermissionExperiment();
    @C10179b
    private static final C32796e POP_UP = null;

    private FacebookPermissionExperiment() {
    }

    /* renamed from: a */
    public static final C32796e m75657a() {
        try {
            return (C32796e) C10181b.m20511a().mo18170a(FacebookPermissionExperiment.class, true, "facebook_permission_pop_up", 31744, C32796e.class);
        } catch (Throwable unused) {
            return null;
        }
    }
}
