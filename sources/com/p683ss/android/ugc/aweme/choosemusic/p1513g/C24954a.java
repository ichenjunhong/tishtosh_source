package com.p683ss.android.ugc.aweme.choosemusic.p1513g;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.framework.services.IUserService;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.g.a */
public final class C24954a {

    /* renamed from: a */
    public static final C24954a f66056a = new C24954a();

    private C24954a() {
    }

    /* renamed from: b */
    public static final boolean m60699b() {
        if (m60698a() || m60700c()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m60698a() {
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

    /* renamed from: c */
    private static boolean m60700c() {
        AVChallenge curChallenge = AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().getCurChallenge();
        if (!TextUtils.equals(AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().getShootWay(), "challenge") || curChallenge == null || !curChallenge.isCommerce) {
            return false;
        }
        return true;
    }
}
