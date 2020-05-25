package com.p683ss.android.ugc.aweme.commercialize.utils;

import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.notice.api.utils.NoticeChallengePropertyUtil;
import com.p683ss.android.ugc.aweme.p1632di.C27628bo;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bo */
public final class C26430bo implements NoticeChallengePropertyUtil {
    /* renamed from: a */
    public static NoticeChallengePropertyUtil m63913a() {
        if (C27991b.f73435S == null) {
            synchronized (NoticeChallengePropertyUtil.class) {
                if (C27991b.f73435S == null) {
                    C27991b.f73435S = C27628bo.m66309d();
                }
            }
        }
        return (NoticeChallengePropertyUtil) C27991b.f73435S;
    }

    public final void markCommerce(Challenge challenge) {
        C26403au.m63862a(challenge);
    }

    public final boolean isCommerce(Challenge challenge) {
        return C26403au.m63866b(challenge);
    }
}
