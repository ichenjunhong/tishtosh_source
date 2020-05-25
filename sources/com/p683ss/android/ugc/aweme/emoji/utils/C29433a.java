package com.p683ss.android.ugc.aweme.emoji.utils;

import com.p683ss.android.ugc.aweme.AccountService;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.framework.services.IUserService;
import com.p683ss.android.ugc.aweme.services.BaseUserService;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.a */
public final class C29433a {
    /* renamed from: c */
    public static long m69408c() {
        return Long.parseLong(m69407b().toString());
    }

    /* renamed from: a */
    public static boolean m69406a() {
        IUserService baseUserService_Monster = BaseUserService.getBaseUserService_Monster();
        if (baseUserService_Monster == null || !baseUserService_Monster.isLogin()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static CharSequence m69407b() {
        IAccountUserService userService = AccountService.createIAccountServicebyMonsterPlugin().userService();
        if (userService == null) {
            return "-1";
        }
        return userService.getCurUserId();
    }
}
