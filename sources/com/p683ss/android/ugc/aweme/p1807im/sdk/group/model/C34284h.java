package com.p683ss.android.ugc.aweme.p1807im.sdk.group.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.model.h */
public final class C34284h implements Serializable {
    @C17952c(mo34828a = "user_info")

    /* renamed from: a */
    private final User f88521a;

    public static /* synthetic */ C34284h copy$default(C34284h hVar, User user, int i, Object obj) {
        if ((i & 1) != 0) {
            user = hVar.f88521a;
        }
        return hVar.copy(user);
    }

    public final User component1() {
        return this.f88521a;
    }

    public final C34284h copy(User user) {
        return new C34284h(user);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.f88521a, (java.lang.Object) ((com.p683ss.android.ugc.aweme.p1807im.sdk.group.model.C34284h) r2).f88521a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.p1807im.sdk.group.model.C34284h
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.im.sdk.group.model.h r2 = (com.p683ss.android.ugc.aweme.p1807im.sdk.group.model.C34284h) r2
            com.ss.android.ugc.aweme.profile.model.User r0 = r1.f88521a
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.f88521a
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.group.model.C34284h.equals(java.lang.Object):boolean");
    }

    public final User getUser() {
        return this.f88521a;
    }

    public final int hashCode() {
        User user = this.f88521a;
        if (user != null) {
            return user.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchUser(user=");
        sb.append(this.f88521a);
        sb.append(")");
        return sb.toString();
    }

    public C34284h(User user) {
        this.f88521a = user;
    }
}
