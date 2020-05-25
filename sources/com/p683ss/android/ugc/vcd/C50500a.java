package com.p683ss.android.ugc.vcd;

import com.p683ss.android.ugc.aweme.AccountService;
import com.p683ss.android.ugc.aweme.IAccountService;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.vcd.a */
public final class C50500a {

    /* renamed from: a */
    public static final C50500a f126595a = new C50500a();

    private C50500a() {
    }

    /* renamed from: a */
    public final IAccountUserService mo98408a() {
        IAccountService createIAccountServicebyMonsterPlugin = AccountService.createIAccountServicebyMonsterPlugin();
        C52711k.m112236a((Object) createIAccountServicebyMonsterPlugin, "ServiceManager.get().get…countService::class.java)");
        IAccountUserService userService = createIAccountServicebyMonsterPlugin.userService();
        C52711k.m112236a((Object) userService, "get().userService()");
        return userService;
    }
}
