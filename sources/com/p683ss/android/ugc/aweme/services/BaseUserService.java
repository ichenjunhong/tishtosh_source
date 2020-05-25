package com.p683ss.android.ugc.aweme.services;

import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.framework.services.IUserService;
import com.p683ss.android.ugc.aweme.p1632di.C27613b;
import com.p683ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.services.BaseUserService */
public class BaseUserService implements IUserService {
    public static IUserService getBaseUserService_Monster() {
        if (C27991b.f73511g == null) {
            synchronized (IUserService.class) {
                if (C27991b.f73511g == null) {
                    C27991b.f73511g = C27613b.m66292e();
                }
            }
        }
        return (IUserService) C27991b.f73511g;
    }

    public void clearUser() {
    }

    public void refreshUser() {
    }

    public boolean getAuthGoods() {
        return C20902b.m53242a().getAuthGoods();
    }

    public User getCurrentUser() {
        return C20902b.m53242a().getCurUser();
    }

    public String getCurrentUserID() {
        return C20902b.m53242a().getCurUserId();
    }

    public boolean isLogin() {
        return C20902b.m53242a().isLogin();
    }

    public void logout() {
        C20854a.m53162b().logout("expired_logout", "sdk_expired_logout");
    }

    public boolean isOldUser() {
        return ((Boolean) SharePrefCache.inst().getIsOldUser().mo47782d()).booleanValue();
    }

    public boolean isUserEmpty(User user) {
        return C20902b.m53242a().isUserEmpty(user);
    }

    public void setBroadcasterRoomId(long j) {
        C20902b.m53242a().getCurUser().setBroadcasterRoomId(j);
    }

    public void setIsOldUser(boolean z) {
        SharePrefCache.inst().getIsOldUser().mo47776a(Boolean.valueOf(z));
    }

    public void logout(String str, String str2) {
        C20854a.m53162b().logout(str, str2);
    }

    public void enterDouyinHelper(Context context, int i) {
        SmartRouter.buildRoute(context, "//notification").withParam("from_where", 4).withParam("unRead_message_count", i).open();
    }
}
