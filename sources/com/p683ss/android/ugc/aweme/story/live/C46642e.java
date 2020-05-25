package com.p683ss.android.ugc.aweme.story.live;

import com.p683ss.android.ugc.aweme.AccountService;
import com.p683ss.android.ugc.aweme.IAccountService;
import com.p683ss.android.ugc.aweme.framework.services.IUserService;
import com.p683ss.android.ugc.aweme.live.C36098k;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import p064c.p065a.p090h.C2150a;

/* renamed from: com.ss.android.ugc.aweme.story.live.e */
public final class C46642e implements C36098k {

    /* renamed from: a */
    public static C46642e f117646a = new C46642e();

    /* renamed from: b */
    static boolean f117647b = false;

    public C46642e() {
        if (C2150a.m6495b() == null) {
            C2150a.m6491a(C46643f.f117648a);
        }
        IAccountService createIAccountServicebyMonsterPlugin = AccountService.createIAccountServicebyMonsterPlugin();
        if (createIAccountServicebyMonsterPlugin != null) {
            createIAccountServicebyMonsterPlugin.addLoginOrLogoutListener(C46644g.f117649a);
        }
    }

    /* renamed from: a */
    public final boolean mo74827a() {
        IUserService baseUserService_Monster = BaseUserService.getBaseUserService_Monster();
        if (baseUserService_Monster == null || !baseUserService_Monster.isLogin() || !f117647b) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo74826a(boolean z) {
        f117647b = z;
    }

    /* renamed from: b */
    public final void mo74828b(boolean z) {
        C47718bf.m103288a(new C46638a(z));
    }
}
