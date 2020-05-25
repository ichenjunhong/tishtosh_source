package com.p683ss.android.ugc.aweme.commerce.service.models;

import android.text.TextUtils;
import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.models.m */
public final class C25570m implements Serializable {
    @C17952c(mo34828a = "coupon_amount")

    /* renamed from: a */
    private String f67671a;
    @C17952c(mo34828a = "coupon_web_url")

    /* renamed from: b */
    private String f67672b;
    @C17952c(mo34828a = "coupon_open_url")

    /* renamed from: c */
    private String f67673c;

    public C25570m() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ C25570m copy$default(C25570m mVar, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mVar.f67671a;
        }
        if ((i & 2) != 0) {
            str2 = mVar.f67672b;
        }
        if ((i & 4) != 0) {
            str3 = mVar.f67673c;
        }
        return mVar.copy(str, str2, str3);
    }

    public final String component1() {
        return this.f67671a;
    }

    public final String component2() {
        return this.f67672b;
    }

    public final String component3() {
        return this.f67673c;
    }

    public final C25570m copy(String str, String str2, String str3) {
        return new C25570m(str, str2, str3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f67673c, (java.lang.Object) r3.f67673c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.commerce.service.models.C25570m
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.commerce.service.models.m r3 = (com.p683ss.android.ugc.aweme.commerce.service.models.C25570m) r3
            java.lang.String r0 = r2.f67671a
            java.lang.String r1 = r3.f67671a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f67672b
            java.lang.String r1 = r3.f67672b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f67673c
            java.lang.String r3 = r3.f67673c
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commerce.service.models.C25570m.equals(java.lang.Object):boolean");
    }

    public final String getCouponAmount() {
        return this.f67671a;
    }

    public final String getCouponOpenUrl() {
        return this.f67673c;
    }

    public final String getCouponWebUrl() {
        return this.f67672b;
    }

    public final int hashCode() {
        String str = this.f67671a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f67672b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f67673c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaobaoCouponInfo(couponAmount=");
        sb.append(this.f67671a);
        sb.append(", couponWebUrl=");
        sb.append(this.f67672b);
        sb.append(", couponOpenUrl=");
        sb.append(this.f67673c);
        sb.append(")");
        return sb.toString();
    }

    public final boolean isValid() {
        if (TextUtils.isEmpty(this.f67671a) || (TextUtils.isEmpty(this.f67672b) && TextUtils.isEmpty(this.f67673c))) {
            return false;
        }
        return true;
    }

    public final void setCouponAmount(String str) {
        this.f67671a = str;
    }

    public final void setCouponOpenUrl(String str) {
        this.f67673c = str;
    }

    public final void setCouponWebUrl(String str) {
        this.f67672b = str;
    }

    public C25570m(String str, String str2, String str3) {
        this.f67671a = str;
        this.f67672b = str2;
        this.f67673c = str3;
    }

    public /* synthetic */ C25570m(String str, String str2, String str3, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        this(str, str2, str3);
    }
}
