package com.p683ss.android.ugc.aweme.app.services;

import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.challenge.api.ChallengeApi;
import com.p683ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26403au;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.main.service.C36685g;
import com.p683ss.android.ugc.aweme.main.service.C36685g.C36686a;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.p1632di.C27613b;
import java.util.concurrent.Executor;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.app.services.j */
public final class C23162j implements C36685g {

    /* renamed from: com.ss.android.ugc.aweme.app.services.j$a */
    static class C23163a {

        /* renamed from: a */
        public static final C23162j f61578a = new C23162j();
    }

    /* renamed from: a */
    public static C23162j m56758a() {
        return C23163a.f61578a;
    }

    /* renamed from: b */
    public static C36685g m56760b() {
        if (C27991b.f73528x == null) {
            synchronized (C36685g.class) {
                if (C27991b.f73528x == null) {
                    C27991b.f73528x = C27613b.m66295h();
                }
            }
        }
        return (C36685g) C27991b.f73528x;
    }

    /* renamed from: a */
    public final Challenge mo47876a(String str, int i, boolean z) throws Exception {
        return ChallengeApi.m59966a(str, 0, false).challenge;
    }

    /* renamed from: a */
    static final /* synthetic */ ChallengeDetail m56759a(boolean z, String str, C0013i iVar) throws Exception {
        ChallengeDetail challengeDetail;
        if (iVar.mo31c() || iVar.mo33d() || iVar.mo34e() == null) {
            return null;
        }
        if (z) {
            challengeDetail = (ChallengeDetail) iVar.mo34e();
            Challenge challenge = challengeDetail.challenge;
            if (challenge != null && C26403au.m63869c(challenge)) {
                C26403au.m63862a(challenge);
                challengeDetail = (ChallengeDetail) ChallengeApi.m59964a(str, str, 0, 0).mo34e();
            }
        } else {
            challengeDetail = (ChallengeDetail) iVar.mo34e();
        }
        return challengeDetail;
    }

    /* renamed from: a */
    public final void mo47877a(String str, String str2, String str3, Music music, C36686a aVar) {
        C0013i iVar;
        boolean z;
        if (C26403au.m63867b(str2)) {
            iVar = ChallengeApi.m59964a(str2, null, 0, 0);
            z = false;
        } else {
            z = true;
            iVar = ChallengeApi.f64991b.fetchChallengeDetail(str2, null, 0, 0);
        }
        iVar.mo20a((C0011g<TResult, TContinuationResult>) new C23164k<TResult,TContinuationResult>(z, str2), (Executor) C0013i.f24a).mo20a((C0011g<TResult, TContinuationResult>) new C23172r<TResult,TContinuationResult>(str, str3, music, aVar), C0013i.f25b);
    }
}
