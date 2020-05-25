package com.p683ss.android.ugc.aweme.notice.repo.list.bean;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.d */
public final class C38090d {
    @C17952c(mo34828a = "aweme")

    /* renamed from: a */
    public final Aweme f96896a;
    @C17952c(mo34828a = "from_user")

    /* renamed from: b */
    public final User f96897b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f96897b, (java.lang.Object) r3.f96897b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.notice.repo.list.bean.C38090d
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.notice.repo.list.bean.d r3 = (com.p683ss.android.ugc.aweme.notice.repo.list.bean.C38090d) r3
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r2.f96896a
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r3.f96896a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.profile.model.User r0 = r2.f96897b
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.f96897b
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.notice.repo.list.bean.C38090d.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Aweme aweme = this.f96896a;
        int i = 0;
        int hashCode = (aweme != null ? aweme.hashCode() : 0) * 31;
        User user = this.f96897b;
        if (user != null) {
            i = user.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonationNotice(aweme=");
        sb.append(this.f96896a);
        sb.append(", user=");
        sb.append(this.f96897b);
        sb.append(")");
        return sb.toString();
    }
}
