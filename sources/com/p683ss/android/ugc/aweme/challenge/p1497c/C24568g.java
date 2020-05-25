package com.p683ss.android.ugc.aweme.challenge.p1497c;

import android.text.TextUtils;
import com.google.p1057b.p1058a.C17422l;
import com.p683ss.android.ugc.aweme.challenge.model.SearchChallenge;
import com.p683ss.android.ugc.aweme.challenge.model.SearchChallengeList;

/* renamed from: com.ss.android.ugc.aweme.challenge.c.g */
final /* synthetic */ class C24568g implements C17422l {

    /* renamed from: a */
    private final C24566f f65033a;

    C24568g(C24566f fVar) {
        this.f65033a = fVar;
    }

    public final boolean apply(Object obj) {
        SearchChallenge searchChallenge = (SearchChallenge) obj;
        return TextUtils.equals(searchChallenge.challenge == null ? null : searchChallenge.challenge.getChallengeName(), ((SearchChallengeList) this.f65033a.mData).keyword);
    }
}
