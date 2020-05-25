package com.p683ss.android.ugc.aweme;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.account.p1307ui.BindMobileActivity;
import com.p683ss.android.ugc.aweme.account.p1307ui.BindOrModifyPhoneActivity;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.services.SetUserNameService;
import com.p683ss.android.ugc.aweme.settings.PhoneBindFlowSettings;

/* renamed from: com.ss.android.ugc.aweme.AccountService */
public class AccountService extends C27980q {
    public void preLoadOrRequest() {
    }

    public C23762bb userNameService() {
        if (this.userNameService == null) {
            this.userNameService = new SetUserNameService();
        }
        return this.userNameService;
    }

    public static IAccountService createIAccountServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IAccountService.class);
        if (a != null) {
            return (IAccountService) a;
        }
        if (C27991b.f73493ax == null) {
            synchronized (IAccountService.class) {
                if (C27991b.f73493ax == null) {
                    C27991b.f73493ax = new AccountService();
                }
            }
        }
        return (AccountService) C27991b.f73493ax;
    }

    /* access modifiers changed from: protected */
    public void init() {
        Class cls;
        super.init();
        String str = "aweme://bind/mobile/";
        if (C10193n.m20607a().mo18204a(PhoneBindFlowSettings.class, "enable_new_phone_bind_flow", C10181b.m20511a().mo18175c().getEnableNewPhoneBindFlow(), true)) {
            cls = BindOrModifyPhoneActivity.class;
        } else {
            cls = BindMobileActivity.class;
        }
        C41302w.m91044a(str, cls);
    }
}
