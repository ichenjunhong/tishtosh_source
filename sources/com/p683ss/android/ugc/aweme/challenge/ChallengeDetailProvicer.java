package com.p683ss.android.ugc.aweme.challenge;

import android.view.View;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.challenge.model.ChallengeDetailParam;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.C24626a;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.C24724l;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.C24763w;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24693k;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24708n;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24717t;
import com.p683ss.android.ugc.aweme.challenge.service.C24599a;
import com.p683ss.android.ugc.aweme.challenge.service.C24600b;
import com.p683ss.android.ugc.aweme.challenge.service.IChallengeDetailProvider;

/* renamed from: com.ss.android.ugc.aweme.challenge.ChallengeDetailProvicer */
public class ChallengeDetailProvicer implements IChallengeDetailProvider {
    public C24600b createLiveChallengeDelegate() {
        return null;
    }

    public C24626a createSingleLineFragment(ChallengeDetailParam challengeDetailParam) {
        return null;
    }

    public C24708n createCommerceHeaderDelegate() {
        return new C24693k();
    }

    public C24708n createStarRankHeaderDelegate() {
        return new C24717t();
    }

    public static IChallengeDetailProvider createIChallengeDetailProviderbyMonsterPlugin() {
        Object a = C27991b.m66756a(IChallengeDetailProvider.class);
        if (a != null) {
            return (IChallengeDetailProvider) a;
        }
        if (C27991b.f73481al == null) {
            synchronized (IChallengeDetailProvider.class) {
                if (C27991b.f73481al == null) {
                    C27991b.f73481al = new ChallengeDetailProvicer();
                }
            }
        }
        return (ChallengeDetailProvicer) C27991b.f73481al;
    }

    public C24599a createCommerceDelegate(View view, C24724l lVar) {
        return new C24763w(view, lVar);
    }
}
