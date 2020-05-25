package com.p683ss.android.ugc.aweme.music.p1978ui;

import com.p683ss.android.ugc.aweme.framework.services.IUserService;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.BaseUserService;

/* renamed from: com.ss.android.ugc.aweme.music.ui.f */
public final class C37609f {

    /* renamed from: a */
    public static final C37609f f95917a = new C37609f();

    private C37609f() {
    }

    /* renamed from: a */
    public static final boolean m84055a() {
        boolean z;
        IUserService baseUserService_Monster = BaseUserService.getBaseUserService_Monster();
        if (baseUserService_Monster != null) {
            User currentUser = baseUserService_Monster.getCurrentUser();
            if (currentUser != null) {
                if (currentUser.getCommerceUserLevel() > 0) {
                    return true;
                }
                CharSequence enterpriseVerifyReason = currentUser.getEnterpriseVerifyReason();
                if (enterpriseVerifyReason == null || enterpriseVerifyReason.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m84056a(Music music) {
        boolean z;
        if (m84055a()) {
            if (music == null || music.isCommercialMusic()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}
