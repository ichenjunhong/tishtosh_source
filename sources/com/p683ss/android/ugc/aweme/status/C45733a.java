package com.p683ss.android.ugc.aweme.status;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.framework.services.IUserService;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;

/* renamed from: com.ss.android.ugc.aweme.status.a */
public final class C45733a {

    /* renamed from: a */
    public static final C45733a f115604a = new C45733a();

    private C45733a() {
    }

    /* renamed from: a */
    public static final boolean m99540a() {
        if (m99541b() || m99542c()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static final boolean m99541b() {
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
    private static final boolean m99542c() {
        AVChallenge curChallenge = AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().getCurChallenge();
        if (!TextUtils.equals(AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().getShootWay(), "challenge") || curChallenge == null || !curChallenge.isCommerce) {
            return false;
        }
        return true;
    }
}
