package com.p683ss.android.ugc.vcd;

import com.google.gson.p1076a.C17952c;
import java.util.Arrays;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.vcd.n */
public final class C50515n {

    /* renamed from: j */
    public static final C50516a f126630j = new C50516a(null);
    @C17952c(mo34828a = "bar_icon")

    /* renamed from: a */
    public C50505e f126631a;
    @C17952c(mo34828a = "bar_title")

    /* renamed from: b */
    public String f126632b;
    @C17952c(mo34828a = "bar_text")

    /* renamed from: c */
    public String f126633c;
    @C17952c(mo34828a = "title")

    /* renamed from: d */
    public String f126634d;
    @C17952c(mo34828a = "text")

    /* renamed from: e */
    public String f126635e;
    @C17952c(mo34828a = "agreement")

    /* renamed from: f */
    public C50504d[] f126636f;
    @C17952c(mo34828a = "vcd_user_info")

    /* renamed from: g */
    public C50517o f126637g;

    /* renamed from: h */
    public String f126638h;

    /* renamed from: i */
    public String f126639i;

    /* renamed from: com.ss.android.ugc.vcd.n$a */
    public static final class C50516a {
        private C50516a() {
        }

        public /* synthetic */ C50516a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static boolean m108858a(C50515n nVar) {
            boolean z;
            boolean z2;
            if (nVar != null) {
                if (nVar.f126632b.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    if (nVar.f126633c.length() > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        return true;
                    }
                }
                return true;
            }
            return false;
        }
    }

    public C50515n() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0060, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f126639i, (java.lang.Object) r3.f126639i) != false) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0065
            boolean r0 = r3 instanceof com.p683ss.android.ugc.vcd.C50515n
            if (r0 == 0) goto L_0x0063
            com.ss.android.ugc.vcd.n r3 = (com.p683ss.android.ugc.vcd.C50515n) r3
            com.ss.android.ugc.vcd.e r0 = r2.f126631a
            com.ss.android.ugc.vcd.e r1 = r3.f126631a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = r2.f126632b
            java.lang.String r1 = r3.f126632b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = r2.f126633c
            java.lang.String r1 = r3.f126633c
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = r2.f126634d
            java.lang.String r1 = r3.f126634d
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = r2.f126635e
            java.lang.String r1 = r3.f126635e
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0063
            com.ss.android.ugc.vcd.d[] r0 = r2.f126636f
            com.ss.android.ugc.vcd.d[] r1 = r3.f126636f
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0063
            com.ss.android.ugc.vcd.o r0 = r2.f126637g
            com.ss.android.ugc.vcd.o r1 = r3.f126637g
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = r2.f126638h
            java.lang.String r1 = r3.f126638h
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = r2.f126639i
            java.lang.String r3 = r3.f126639i
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r3 = 0
            return r3
        L_0x0065:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.vcd.C50515n.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        C50505e eVar = this.f126631a;
        int i = 0;
        int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
        String str = this.f126632b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f126633c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f126634d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f126635e;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        C50504d[] dVarArr = this.f126636f;
        int hashCode6 = (hashCode5 + (dVarArr != null ? Arrays.hashCode(dVarArr) : 0)) * 31;
        C50517o oVar = this.f126637g;
        int hashCode7 = (hashCode6 + (oVar != null ? oVar.hashCode() : 0)) * 31;
        String str5 = this.f126638h;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f126639i;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode8 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VcdPopupStruct(barIcon=");
        sb.append(this.f126631a);
        sb.append(", barTitle=");
        sb.append(this.f126632b);
        sb.append(", barText=");
        sb.append(this.f126633c);
        sb.append(", dialogTitle=");
        sb.append(this.f126634d);
        sb.append(", dialogText=");
        sb.append(this.f126635e);
        sb.append(", agreementText=");
        sb.append(Arrays.toString(this.f126636f));
        sb.append(", vcdUserInfo=");
        sb.append(this.f126637g);
        sb.append(", dialogShowFrom=");
        sb.append(this.f126638h);
        sb.append(", dialogShowFromValue=");
        sb.append(this.f126639i);
        sb.append(")");
        return sb.toString();
    }

    private C50515n(C50505e eVar, String str, String str2, String str3, String str4, C50504d[] dVarArr, C50517o oVar, String str5, String str6) {
        C52711k.m112240b(str, "barTitle");
        C52711k.m112240b(str2, "barText");
        C52711k.m112240b(str3, "dialogTitle");
        C52711k.m112240b(str4, "dialogText");
        this.f126631a = eVar;
        this.f126632b = str;
        this.f126633c = str2;
        this.f126634d = str3;
        this.f126635e = str4;
        this.f126636f = dVarArr;
        this.f126637g = oVar;
        this.f126638h = str5;
        this.f126639i = str6;
    }

    private /* synthetic */ C50515n(C50505e eVar, String str, String str2, String str3, String str4, C50504d[] dVarArr, C50517o oVar, String str5, String str6, int i, C52707g gVar) {
        this(null, "", "", "", "", null, null, null, null);
    }
}
