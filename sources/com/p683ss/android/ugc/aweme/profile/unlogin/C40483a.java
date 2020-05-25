package com.p683ss.android.ugc.aweme.profile.unlogin;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.unlogin.a */
public final class C40483a extends BaseResponse {
    @C17952c(mo34828a = "aweme_list")

    /* renamed from: a */
    public final List<Aweme> f103345a;

    public C40483a() {
        this(null, 1, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.f103345a, (java.lang.Object) ((com.p683ss.android.ugc.aweme.profile.unlogin.C40483a) r2).f103345a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.profile.unlogin.C40483a
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.profile.unlogin.a r2 = (com.p683ss.android.ugc.aweme.profile.unlogin.C40483a) r2
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r1.f103345a
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = r2.f103345a
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.unlogin.C40483a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        List<Aweme> list = this.f103345a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnloginAwemeList(list=");
        sb.append(this.f103345a);
        sb.append(")");
        return sb.toString();
    }

    private C40483a(List<? extends Aweme> list) {
        C52711k.m112240b(list, "list");
        this.f103345a = list;
    }

    private /* synthetic */ C40483a(List list, int i, C52707g gVar) {
        this(C52575l.m112097a());
    }
}
