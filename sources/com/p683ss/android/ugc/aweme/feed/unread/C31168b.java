package com.p683ss.android.ugc.aweme.feed.unread;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.unread.b */
public final class C31168b extends BaseResponse {
    @C17952c(mo34828a = "unread_user_list")

    /* renamed from: a */
    public final List<User> f81582a;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.f81582a, (java.lang.Object) ((com.p683ss.android.ugc.aweme.feed.unread.C31168b) r2).f81582a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.feed.unread.C31168b
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.feed.unread.b r2 = (com.p683ss.android.ugc.aweme.feed.unread.C31168b) r2
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r0 = r1.f81582a
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r2 = r2.f81582a
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.unread.C31168b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        List<User> list = this.f81582a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnReadSunRoofResponse(unReadList=");
        sb.append(this.f81582a);
        sb.append(")");
        return sb.toString();
    }
}
