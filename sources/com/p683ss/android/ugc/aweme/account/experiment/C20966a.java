package com.p683ss.android.ugc.aweme.account.experiment;

import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.experiment.a */
public final class C20966a {

    /* renamed from: a */
    public static final C20966a f57072a = new C20966a();

    private C20966a() {
    }

    /* renamed from: a */
    public static boolean m53329a() {
        if (C10181b.m20511a().mo18172a(MultiAccountLoginExperiment.class, true, "enable_multi_account_login", 31744, true)) {
            IAccountUserService g = C20854a.m53167g();
            C52711k.m112236a((Object) g, "AccountProxyService.userService()");
            if (!g.isChildrenMode()) {
                return true;
            }
        }
        return false;
    }
}
