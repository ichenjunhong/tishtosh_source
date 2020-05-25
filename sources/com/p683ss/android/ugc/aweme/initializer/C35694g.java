package com.p683ss.android.ugc.aweme.initializer;

import android.support.p030v4.p038f.C0781c;
import com.p683ss.android.ugc.aweme.base.p1412d.p1413a.C23522b;
import com.p683ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.p683ss.android.ugc.aweme.shortvideo.p2265y.C45625a;

/* renamed from: com.ss.android.ugc.aweme.initializer.g */
final /* synthetic */ class C35694g implements C23522b {

    /* renamed from: a */
    private final C0781c f91652a;

    C35694g(C0781c cVar) {
        this.f91652a = cVar;
    }

    /* renamed from: a */
    public final void mo48682a(Object obj) {
        C0781c cVar = this.f91652a;
        ChallengeDetail challengeDetail = (ChallengeDetail) obj;
        if (challengeDetail != null && challengeDetail.challenge != null) {
            new C45625a();
            cVar.accept(C45625a.m99357a(challengeDetail.challenge));
        }
    }
}
