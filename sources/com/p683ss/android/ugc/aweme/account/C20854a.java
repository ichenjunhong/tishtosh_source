package com.p683ss.android.ugc.aweme.account;

import com.p683ss.android.ugc.aweme.AccountService;
import com.p683ss.android.ugc.aweme.C22551ak;
import com.p683ss.android.ugc.aweme.C23189aq;
import com.p683ss.android.ugc.aweme.C23291au;
import com.p683ss.android.ugc.aweme.C23299aw;
import com.p683ss.android.ugc.aweme.C23330az;
import com.p683ss.android.ugc.aweme.C23359ba;
import com.p683ss.android.ugc.aweme.IAccountService;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.IAgeGateService;

/* renamed from: com.ss.android.ugc.aweme.account.a */
public final class C20854a {

    /* renamed from: a */
    private static volatile IAccountService f56797a;

    /* renamed from: a */
    public static IAccountService m53161a() {
        m53170j();
        return f56797a;
    }

    /* renamed from: b */
    public static C23291au m53162b() {
        m53170j();
        return f56797a.loginService();
    }

    /* renamed from: c */
    public static C23189aq m53163c() {
        m53170j();
        return f56797a.dataService();
    }

    /* renamed from: d */
    public static IAgeGateService m53164d() {
        m53170j();
        return f56797a.ageGateService();
    }

    /* renamed from: e */
    public static C22551ak m53165e() {
        m53170j();
        return f56797a.bindService();
    }

    /* renamed from: f */
    public static C23299aw m53166f() {
        m53170j();
        return f56797a.passwordService();
    }

    /* renamed from: g */
    public static IAccountUserService m53167g() {
        m53170j();
        return f56797a.userService();
    }

    /* renamed from: h */
    public static C23359ba m53168h() {
        m53170j();
        return f56797a.rnAndH5Service();
    }

    /* renamed from: i */
    public static C23330az m53169i() {
        m53170j();
        return f56797a.proAccountService();
    }

    /* renamed from: j */
    private static void m53170j() {
        if (f56797a == null) {
            f56797a = AccountService.createIAccountServicebyMonsterPlugin();
        }
    }
}
