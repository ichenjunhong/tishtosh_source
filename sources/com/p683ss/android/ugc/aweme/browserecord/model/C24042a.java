package com.p683ss.android.ugc.aweme.browserecord.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.browserecord.model.a */
public final class C24042a implements Serializable {
    @C17952c(mo34828a = "user")

    /* renamed from: a */
    private User f63811a;
    @C17952c(mo34828a = "source_type")

    /* renamed from: b */
    private final Integer f63812b;
    @C17952c(mo34828a = "source_label")

    /* renamed from: c */
    private final String f63813c;

    public C24042a() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ C24042a copy$default(C24042a aVar, User user, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            user = aVar.f63811a;
        }
        if ((i & 2) != 0) {
            num = aVar.f63812b;
        }
        if ((i & 4) != 0) {
            str = aVar.f63813c;
        }
        return aVar.copy(user, num, str);
    }

    public final User component1() {
        return this.f63811a;
    }

    public final Integer component2() {
        return this.f63812b;
    }

    public final String component3() {
        return this.f63813c;
    }

    public final C24042a copy(User user, Integer num, String str) {
        return new C24042a(user, num, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f63813c, (java.lang.Object) r3.f63813c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.browserecord.model.C24042a
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.browserecord.model.a r3 = (com.p683ss.android.ugc.aweme.browserecord.model.C24042a) r3
            com.ss.android.ugc.aweme.profile.model.User r0 = r2.f63811a
            com.ss.android.ugc.aweme.profile.model.User r1 = r3.f63811a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.Integer r0 = r2.f63812b
            java.lang.Integer r1 = r3.f63812b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f63813c
            java.lang.String r3 = r3.f63813c
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.browserecord.model.C24042a.equals(java.lang.Object):boolean");
    }

    public final String getSourceLabel() {
        return this.f63813c;
    }

    public final Integer getSourceType() {
        return this.f63812b;
    }

    public final User getUser() {
        return this.f63811a;
    }

    public final int hashCode() {
        User user = this.f63811a;
        int i = 0;
        int hashCode = (user != null ? user.hashCode() : 0) * 31;
        Integer num = this.f63812b;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str = this.f63813c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrowseItem(user=");
        sb.append(this.f63811a);
        sb.append(", sourceType=");
        sb.append(this.f63812b);
        sb.append(", sourceLabel=");
        sb.append(this.f63813c);
        sb.append(")");
        return sb.toString();
    }

    public final void setUser(User user) {
        this.f63811a = user;
    }

    public C24042a(User user, Integer num, String str) {
        this.f63811a = user;
        this.f63812b = num;
        this.f63813c = str;
    }

    public /* synthetic */ C24042a(User user, Integer num, String str, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            user = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        this(user, num, str);
    }
}
