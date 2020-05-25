package com.p683ss.android.ugc.aweme.services;

import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.framework.services.IUserService;

/* renamed from: com.ss.android.ugc.aweme.services.UserService */
public class UserService extends BaseUserService {
    public static IUserService createIUserServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IUserService.class);
        if (a != null) {
            return (IUserService) a;
        }
        if (C27991b.f73474ae == null) {
            synchronized (IUserService.class) {
                if (C27991b.f73474ae == null) {
                    C27991b.f73474ae = new UserService();
                }
            }
        }
        return (UserService) C27991b.f73474ae;
    }
}
