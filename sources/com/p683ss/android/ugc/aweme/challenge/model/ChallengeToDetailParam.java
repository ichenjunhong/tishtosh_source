package com.p683ss.android.ugc.aweme.challenge.model;

import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.challenge.model.ChallengeToDetailParam */
public final class ChallengeToDetailParam {
    public static final ChallengeToDetailParam INSTANCE = new ChallengeToDetailParam();

    private ChallengeToDetailParam() {
    }

    public final ChallengeDetailParam challengeToParam(Challenge challenge) {
        if (challenge == null) {
            new ChallengeDetailParam(null, null, null, null, false, 0, 0, null, 0, false, false, null, 4095, null);
        }
        ChallengeDetailParam challengeDetailParam = new ChallengeDetailParam(null, null, null, null, false, 0, 0, null, 0, false, false, null, 4095, null);
        if (challenge == null) {
            C52711k.m112234a();
        }
        challengeDetailParam.setCid(challenge.getCid());
        challengeDetailParam.setChallengeType(challenge.getSubType());
        return challengeDetailParam;
    }
}
