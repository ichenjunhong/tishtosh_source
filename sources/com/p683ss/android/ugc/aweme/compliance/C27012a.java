package com.p683ss.android.ugc.aweme.compliance;

import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.compliance.a */
public final class C27012a {

    /* renamed from: a */
    public static final C27012a f71322a = new C27012a();

    private C27012a() {
    }

    /* renamed from: a */
    public static void m65226a(String str, int i) {
        C52711k.m112240b(str, "type");
        C23131p.m56692a("compliance_api_status", "", C23088c.m56631a().mo47824a("type", str).mo47822a("status", Integer.valueOf(i)).mo47825b());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        if (r3.intValue() != 1) goto L_0x0059;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m65225a(java.lang.Integer r3, android.arch.lifecycle.C0198r<java.lang.Integer> r4, android.arch.lifecycle.C0198r<java.lang.Integer> r5) {
        /*
            java.lang.String r0 = "thirdAdMode"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r0)
            java.lang.String r0 = "partnerAdMode"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
            if (r3 != 0) goto L_0x000d
            return
        L_0x000d:
            int r3 = r3.intValue()
            if (r3 != 0) goto L_0x0059
            java.lang.Object r3 = r4.getValue()
            java.lang.Integer r3 = (java.lang.Integer) r3
            r0 = 1
            if (r3 != 0) goto L_0x001d
            goto L_0x0023
        L_0x001d:
            int r3 = r3.intValue()
            if (r3 == r0) goto L_0x0032
        L_0x0023:
            java.lang.Object r3 = r5.getValue()
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 != 0) goto L_0x002c
            return
        L_0x002c:
            int r3 = r3.intValue()
            if (r3 != r0) goto L_0x0059
        L_0x0032:
            java.lang.String r3 = "unexpectable_personalize_ad_settings"
            java.lang.String r0 = ""
            com.ss.android.ugc.aweme.app.f.c r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23088c.m56631a()
            java.lang.String r2 = "pers_ad_third_party_networks_mode"
            java.lang.Object r4 = r4.getValue()
            java.lang.Integer r4 = (java.lang.Integer) r4
            com.ss.android.ugc.aweme.app.f.c r4 = r1.mo47822a(r2, r4)
            java.lang.String r1 = "pers_ad_third_party_networks_mode"
            java.lang.Object r5 = r5.getValue()
            java.lang.Integer r5 = (java.lang.Integer) r5
            com.ss.android.ugc.aweme.app.f.c r4 = r4.mo47822a(r1, r5)
            org.json.JSONObject r4 = r4.mo47825b()
            com.p683ss.android.ugc.aweme.app.C23131p.m56692a(r3, r0, r4)
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.compliance.C27012a.m65225a(java.lang.Integer, android.arch.lifecycle.r, android.arch.lifecycle.r):void");
    }
}
