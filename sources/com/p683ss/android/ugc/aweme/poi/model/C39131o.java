package com.p683ss.android.ugc.aweme.poi.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.model.o */
public final class C39131o implements Serializable {
    @C17952c(mo34828a = "sec_claimer_id")

    /* renamed from: a */
    private final String f99861a;
    @C17952c(mo34828a = "claimer_name")

    /* renamed from: b */
    private final String f99862b;
    @C17952c(mo34828a = "enterprise_user")

    /* renamed from: c */
    private final Integer f99863c;
    @C17952c(mo34828a = "can_claim")

    /* renamed from: d */
    private final Boolean f99864d;

    public static /* synthetic */ C39131o copy$default(C39131o oVar, String str, String str2, Integer num, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oVar.f99861a;
        }
        if ((i & 2) != 0) {
            str2 = oVar.f99862b;
        }
        if ((i & 4) != 0) {
            num = oVar.f99863c;
        }
        if ((i & 8) != 0) {
            bool = oVar.f99864d;
        }
        return oVar.copy(str, str2, num, bool);
    }

    public final String component1() {
        return this.f99861a;
    }

    public final String component2() {
        return this.f99862b;
    }

    public final Integer component3() {
        return this.f99863c;
    }

    public final Boolean component4() {
        return this.f99864d;
    }

    public final C39131o copy(String str, String str2, Integer num, Boolean bool) {
        return new C39131o(str, str2, num, bool);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f99864d, (java.lang.Object) r3.f99864d) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.poi.model.C39131o
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.poi.model.o r3 = (com.p683ss.android.ugc.aweme.poi.model.C39131o) r3
            java.lang.String r0 = r2.f99861a
            java.lang.String r1 = r3.f99861a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f99862b
            java.lang.String r1 = r3.f99862b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.Integer r0 = r2.f99863c
            java.lang.Integer r1 = r3.f99863c
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.Boolean r0 = r2.f99864d
            java.lang.Boolean r3 = r3.f99864d
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.poi.model.C39131o.equals(java.lang.Object):boolean");
    }

    public final Boolean getCanClaim() {
        return this.f99864d;
    }

    public final String getClaimerId() {
        return this.f99861a;
    }

    public final String getClaimerName() {
        return this.f99862b;
    }

    public final int hashCode() {
        String str = this.f99861a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f99862b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.f99863c;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Boolean bool = this.f99864d;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode3 + i;
    }

    public final Integer isEnterPriseUser() {
        return this.f99863c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiClaimer(claimerId=");
        sb.append(this.f99861a);
        sb.append(", claimerName=");
        sb.append(this.f99862b);
        sb.append(", isEnterPriseUser=");
        sb.append(this.f99863c);
        sb.append(", canClaim=");
        sb.append(this.f99864d);
        sb.append(")");
        return sb.toString();
    }

    public C39131o(String str, String str2, Integer num, Boolean bool) {
        this.f99861a = str;
        this.f99862b = str2;
        this.f99863c = num;
        this.f99864d = bool;
    }
}
