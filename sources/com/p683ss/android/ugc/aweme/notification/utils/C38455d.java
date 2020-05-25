package com.p683ss.android.ugc.aweme.notification.utils;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.BaseUserService;

/* renamed from: com.ss.android.ugc.aweme.notification.utils.d */
public final class C38455d {
    /* renamed from: a */
    public static boolean m85780a(int i) {
        return (i == 0 || i == 4) ? false : true;
    }

    /* renamed from: a */
    public static boolean m85779a() {
        User currentUser = BaseUserService.getBaseUserService_Monster().getCurrentUser();
        if (currentUser == null || currentUser.getUserMode() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m85778a(User user) {
        if (user == null) {
            return "";
        }
        if (!TextUtils.isEmpty(user.getUniqueId())) {
            return user.getUniqueId();
        }
        if (user.getShortId() == null) {
            return "";
        }
        return user.getShortId();
    }

    /* renamed from: a */
    public static boolean m85781a(User user, boolean z) {
        if (user == null || user.getFollowStatus() == 1 || user.getFollowStatus() == 2 || !user.isSecret()) {
            return false;
        }
        return true;
    }
}
