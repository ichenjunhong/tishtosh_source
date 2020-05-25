package com.p683ss.android.ugc.aweme.feed.interest;

import com.p683ss.android.ugc.aweme.AccountService;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;

/* renamed from: com.ss.android.ugc.aweme.feed.interest.b */
public final class C30410b {

    /* renamed from: a */
    public static final C30410b f79484a = new C30410b();

    private C30410b() {
    }

    /* renamed from: a */
    public static String m71333a() {
        IAccountUserService userService = AccountService.createIAccountServicebyMonsterPlugin().userService();
        if (userService != null) {
            return userService.getCurUserId();
        }
        return null;
    }

    /* renamed from: b */
    public final void mo60822b() {
        C26890h.m65011a("enable_interest_lable", new C23089d().mo47829a("enter_from", "homepage_hot").mo47829a("user_id", m71333a()).f61491a);
    }
}
