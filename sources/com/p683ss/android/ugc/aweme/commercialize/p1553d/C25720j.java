package com.p683ss.android.ugc.aweme.commercialize.p1553d;

import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.d.j */
public final class C25720j {

    /* renamed from: e */
    public static final C25721a f68031e = new C25721a(null);

    /* renamed from: a */
    public final String f68032a;

    /* renamed from: b */
    public final JSONObject f68033b;

    /* renamed from: c */
    public final String f68034c;

    /* renamed from: d */
    public final Object f68035d;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.d.j$a */
    public static final class C25721a {
        private C25721a() {
        }

        public /* synthetic */ C25721a(C52707g gVar) {
            this();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a(r2.f68035d, r3.f68035d) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.commercialize.p1553d.C25720j
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.commercialize.d.j r3 = (com.p683ss.android.ugc.aweme.commercialize.p1553d.C25720j) r3
            java.lang.String r0 = r2.f68032a
            java.lang.String r1 = r3.f68032a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            org.json.JSONObject r0 = r2.f68033b
            org.json.JSONObject r1 = r3.f68033b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f68034c
            java.lang.String r1 = r3.f68034c
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.Object r0 = r2.f68035d
            java.lang.Object r3 = r3.f68035d
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.p1553d.C25720j.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f68032a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        JSONObject jSONObject = this.f68033b;
        int hashCode2 = (hashCode + (jSONObject != null ? jSONObject.hashCode() : 0)) * 31;
        String str2 = this.f68034c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Object obj = this.f68035d;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsBridgeEvent(funcName=");
        sb.append(this.f68032a);
        sb.append(", params=");
        sb.append(this.f68033b);
        sb.append(", callbackId=");
        sb.append(this.f68034c);
        sb.append(", jsBridge=");
        sb.append(this.f68035d);
        sb.append(")");
        return sb.toString();
    }

    public C25720j(String str, JSONObject jSONObject, String str2, Object obj) {
        C52711k.m112240b(str, "funcName");
        this.f68032a = str;
        this.f68033b = jSONObject;
        this.f68034c = str2;
        this.f68035d = obj;
    }

    public /* synthetic */ C25720j(String str, JSONObject jSONObject, String str2, Object obj, int i, C52707g gVar) {
        this(str, jSONObject, null, null);
    }
}
