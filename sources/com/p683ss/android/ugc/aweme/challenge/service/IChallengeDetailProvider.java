package com.p683ss.android.ugc.aweme.challenge.service;

import android.view.View;
import com.p683ss.android.ugc.aweme.challenge.model.ChallengeDetailParam;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.C24626a;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.C24724l;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24708n;

/* renamed from: com.ss.android.ugc.aweme.challenge.service.IChallengeDetailProvider */
public interface IChallengeDetailProvider {
    C24599a createCommerceDelegate(View view, C24724l lVar);

    C24708n createCommerceHeaderDelegate();

    C24600b createLiveChallengeDelegate();

    C24626a createSingleLineFragment(ChallengeDetailParam challengeDetailParam);

    C24708n createStarRankHeaderDelegate();
}
