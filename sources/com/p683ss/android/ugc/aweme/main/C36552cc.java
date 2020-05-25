package com.p683ss.android.ugc.aweme.main;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.main.experiment.LandingFollowTabCategoryExperiment;
import com.p683ss.android.ugc.aweme.p1439bl.C23859b;
import com.p683ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.main.cc */
public final class C36552cc {

    /* renamed from: a */
    private static Boolean f93641a;

    /* renamed from: a */
    public static boolean m82444a() {
        int i;
        if (f93641a != null) {
            return f93641a.booleanValue();
        }
        boolean z = false;
        if (!C36553cd.m82451g()) {
            Boolean valueOf = Boolean.valueOf(false);
            f93641a = valueOf;
            return valueOf.booleanValue();
        }
        int a = C10181b.m20511a().mo18168a(LandingFollowTabCategoryExperiment.class, true, "landing_follow_tab_category", 31744, 0);
        if (a != 0) {
            if (a == 1) {
                f93641a = Boolean.valueOf(C23859b.m58575b().mo49471b(C11010c.m22280a(), "is_next_cold_start_landing_follow_in_main_tab"));
            } else if (a == 2) {
                f93641a = Boolean.valueOf(false);
                Integer minFollowNumForLandingFollowTab = C32816h.m75716b().getMinFollowNumForLandingFollowTab();
                if (minFollowNumForLandingFollowTab == null) {
                    i = 100;
                } else {
                    i = minFollowNumForLandingFollowTab.intValue();
                }
                IAccountUserService userService = C20854a.m53161a().userService();
                if (userService != null) {
                    User curUser = userService.getCurUser();
                    if (curUser != null) {
                        if (curUser.getFollowingCount() > i) {
                            z = true;
                        }
                        f93641a = Boolean.valueOf(z);
                    }
                }
            }
            StringBuilder sb = new StringBuilder("shouldLandingFollowInMainTab->type:");
            sb.append(a);
            sb.append(",go:");
            sb.append(f93641a);
            C32458a.m75141a(4, "LandingFollowInMainTab", sb.toString());
            return f93641a.booleanValue();
        }
        f93641a = Boolean.valueOf(false);
        StringBuilder sb2 = new StringBuilder("shouldLandingFollowInMainTab->type:");
        sb2.append(a);
        sb2.append(",go:");
        sb2.append(f93641a);
        C32458a.m75141a(4, "LandingFollowInMainTab", sb2.toString());
        return f93641a.booleanValue();
    }
}
