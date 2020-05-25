package com.p683ss.android.ugc.aweme.services;

import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.base.ImageUserService;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.ImageUserServiceImpl */
public final class ImageUserServiceImpl implements ImageUserService {
    public static ImageUserService createImageUserServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(ImageUserService.class);
        if (a != null) {
            return (ImageUserService) a;
        }
        return new ImageUserServiceImpl();
    }

    public final String getCurrentUserId() {
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        String curUserId = g.getCurUserId();
        C52711k.m112236a((Object) curUserId, "AccountProxyService.userService().curUserId");
        return curUserId;
    }
}
