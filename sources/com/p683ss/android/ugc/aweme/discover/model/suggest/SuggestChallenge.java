package com.p683ss.android.ugc.aweme.discover.model.suggest;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.discover.model.suggest.SuggestChallenge */
public final class SuggestChallenge {
    @C17952c(mo34828a = "challenge_info")
    public Challenge challenge;

    public SuggestChallenge() {
        this(null, 1, null);
    }

    public static /* synthetic */ SuggestChallenge copy$default(SuggestChallenge suggestChallenge, Challenge challenge2, int i, Object obj) {
        if ((i & 1) != 0) {
            challenge2 = suggestChallenge.challenge;
        }
        return suggestChallenge.copy(challenge2);
    }

    public final SuggestChallenge copy(Challenge challenge2) {
        return new SuggestChallenge(challenge2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.challenge, (java.lang.Object) ((com.p683ss.android.ugc.aweme.discover.model.suggest.SuggestChallenge) r2).challenge) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.discover.model.suggest.SuggestChallenge
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.discover.model.suggest.SuggestChallenge r2 = (com.p683ss.android.ugc.aweme.discover.model.suggest.SuggestChallenge) r2
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = r1.challenge
            com.ss.android.ugc.aweme.discover.model.Challenge r2 = r2.challenge
            boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.model.suggest.SuggestChallenge.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Challenge challenge2 = this.challenge;
        if (challenge2 != null) {
            return challenge2.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuggestChallenge(challenge=");
        sb.append(this.challenge);
        sb.append(")");
        return sb.toString();
    }

    public SuggestChallenge(Challenge challenge2) {
        this.challenge = challenge2;
    }

    public /* synthetic */ SuggestChallenge(Challenge challenge2, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            challenge2 = null;
        }
        this(challenge2);
    }
}
