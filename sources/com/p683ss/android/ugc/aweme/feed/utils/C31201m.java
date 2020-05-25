package com.p683ss.android.ugc.aweme.feed.utils;

import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.feed.utils.m */
public final class C31201m {
    /* renamed from: a */
    public static boolean m72856a() {
        User curUser = C20854a.m53167g().getCurUser();
        if (curUser == null || ((Boolean) SharePrefCache.inst().getIsShowFavouriteIcon().mo47782d()).booleanValue() || (System.currentTimeMillis() / 1000) - curUser.getRegisterTime() <= 604800) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m72857a(Aweme aweme, int i) {
        if (!aweme.isCollected() || i != 2004) {
            return false;
        }
        return true;
    }
}
