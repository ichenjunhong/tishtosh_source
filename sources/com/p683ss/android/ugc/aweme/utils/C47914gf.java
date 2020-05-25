package com.p683ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.utils.gf */
final class C47914gf {
    /* renamed from: c */
    static boolean m103641c(User user) {
        return m103640b(user);
    }

    /* renamed from: b */
    static boolean m103640b(User user) {
        if (user != null && user != null && user.getCommerceUserLevel() > 0 && !TextUtils.isEmpty(user.getEnterpriseVerifyReason())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static UrlModel m103639a(User user) {
        if (user == null) {
            return null;
        }
        UrlModel avatarVideoUri = user.getAvatarVideoUri();
        if (avatarVideoUri == null || !C23715d.m58204b(avatarVideoUri.getUrlList()) || TextUtils.isEmpty((CharSequence) avatarVideoUri.getUrlList().get(0))) {
            return null;
        }
        return avatarVideoUri;
    }
}
