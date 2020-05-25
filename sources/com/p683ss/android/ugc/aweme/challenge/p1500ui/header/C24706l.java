package com.p683ss.android.ugc.aweme.challenge.p1500ui.header;

import com.p683ss.android.ugc.aweme.challenge.model.ChallengeDetailParam;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.l */
public final class C24706l {

    /* renamed from: a */
    public C24707m f65421a;

    /* renamed from: b */
    public C24679c f65422b;

    /* renamed from: c */
    public C24680d f65423c;

    /* renamed from: d */
    public String f65424d;

    /* renamed from: e */
    public String f65425e;

    /* renamed from: f */
    public final ChallengeDetailParam f65426f;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f65426f, (java.lang.Object) r3.f65426f) != false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0047
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24706l
            if (r0 == 0) goto L_0x0045
            com.ss.android.ugc.aweme.challenge.ui.header.l r3 = (com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24706l) r3
            com.ss.android.ugc.aweme.challenge.ui.header.m r0 = r2.f65421a
            com.ss.android.ugc.aweme.challenge.ui.header.m r1 = r3.f65421a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0045
            com.ss.android.ugc.aweme.challenge.ui.header.c r0 = r2.f65422b
            com.ss.android.ugc.aweme.challenge.ui.header.c r1 = r3.f65422b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0045
            com.ss.android.ugc.aweme.challenge.ui.header.d r0 = r2.f65423c
            com.ss.android.ugc.aweme.challenge.ui.header.d r1 = r3.f65423c
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.f65424d
            java.lang.String r1 = r3.f65424d
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.f65425e
            java.lang.String r1 = r3.f65425e
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0045
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r0 = r2.f65426f
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r3 = r3.f65426f
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r3 = 0
            return r3
        L_0x0047:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24706l.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        C24707m mVar = this.f65421a;
        int i = 0;
        int hashCode = (mVar != null ? mVar.hashCode() : 0) * 31;
        C24679c cVar = this.f65422b;
        int hashCode2 = (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31;
        C24680d dVar = this.f65423c;
        int hashCode3 = (hashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        String str = this.f65424d;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f65425e;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        ChallengeDetailParam challengeDetailParam = this.f65426f;
        if (challengeDetailParam != null) {
            i = challengeDetailParam.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeaderParam(headerType=");
        sb.append(this.f65421a);
        sb.append(", attrsType=");
        sb.append(this.f65422b);
        sb.append(", buttonType=");
        sb.append(this.f65423c);
        sb.append(", enterFrom=");
        sb.append(this.f65424d);
        sb.append(", processId=");
        sb.append(this.f65425e);
        sb.append(", detailParam=");
        sb.append(this.f65426f);
        sb.append(")");
        return sb.toString();
    }

    private C24706l(C24707m mVar, C24679c cVar, C24680d dVar, String str, String str2, ChallengeDetailParam challengeDetailParam) {
        C52711k.m112240b(mVar, "headerType");
        C52711k.m112240b(cVar, "attrsType");
        C52711k.m112240b(dVar, "buttonType");
        C52711k.m112240b(challengeDetailParam, "detailParam");
        this.f65421a = mVar;
        this.f65422b = cVar;
        this.f65423c = dVar;
        this.f65424d = str;
        this.f65425e = str2;
        this.f65426f = challengeDetailParam;
    }

    public /* synthetic */ C24706l(C24707m mVar, C24679c cVar, C24680d dVar, String str, String str2, ChallengeDetailParam challengeDetailParam, int i, C52707g gVar) {
        this(C24707m.TYPE_NORMAL, C24679c.TYPE_LINK, C24680d.TYPE_NORMAL, str, str2, challengeDetailParam);
    }
}
