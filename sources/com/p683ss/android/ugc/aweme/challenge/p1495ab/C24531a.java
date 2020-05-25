package com.p683ss.android.ugc.aweme.challenge.p1495ab;

import com.p683ss.android.ugc.aweme.challenge.model.ChallengeDetailParam;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;

/* renamed from: com.ss.android.ugc.aweme.challenge.ab.a */
public final class C24531a {

    /* renamed from: a */
    public static final C24531a f64953a = new C24531a();

    private C24531a() {
    }

    /* renamed from: a */
    public static boolean m59939a(ChallengeDetailParam challengeDetailParam) {
        if (challengeDetailParam == null) {
            return false;
        }
        return challengeDetailParam.isInDialog();
    }

    /* renamed from: a */
    public final boolean mo50297a(Challenge challenge, ChallengeDetailParam challengeDetailParam) {
        return m59939a(challengeDetailParam) ? false : false;
    }
}
