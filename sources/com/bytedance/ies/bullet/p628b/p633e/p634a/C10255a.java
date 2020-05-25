package com.bytedance.ies.bullet.p628b.p633e.p634a;

import com.bytedance.ies.bullet.p628b.p633e.p634a.C10268e.C10270b;
import org.json.JSONObject;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.bullet.b.e.a.a */
public final class C10255a {

    /* renamed from: a */
    public final String f27643a;

    /* renamed from: b */
    public final JSONObject f27644b;

    /* renamed from: c */
    public final C10270b f27645c;

    /* renamed from: d */
    public final C52671b<Throwable, C52860x> f27646d;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f27646d, (java.lang.Object) r3.f27646d) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.bytedance.ies.bullet.p628b.p633e.p634a.C10255a
            if (r0 == 0) goto L_0x0031
            com.bytedance.ies.bullet.b.e.a.a r3 = (com.bytedance.ies.bullet.p628b.p633e.p634a.C10255a) r3
            java.lang.String r0 = r2.f27643a
            java.lang.String r1 = r3.f27643a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            org.json.JSONObject r0 = r2.f27644b
            org.json.JSONObject r1 = r3.f27644b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            com.bytedance.ies.bullet.b.e.a.e$b r0 = r2.f27645c
            com.bytedance.ies.bullet.b.e.a.e$b r1 = r3.f27645c
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            d.f.a.b<java.lang.Throwable, d.x> r0 = r2.f27646d
            d.f.a.b<java.lang.Throwable, d.x> r3 = r3.f27646d
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.p628b.p633e.p634a.C10255a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f27643a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        JSONObject jSONObject = this.f27644b;
        int hashCode2 = (hashCode + (jSONObject != null ? jSONObject.hashCode() : 0)) * 31;
        C10270b bVar = this.f27645c;
        int hashCode3 = (hashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        C52671b<Throwable, C52860x> bVar2 = this.f27646d;
        if (bVar2 != null) {
            i = bVar2.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BridgeHandleUnit(funcName=");
        sb.append(this.f27643a);
        sb.append(", params=");
        sb.append(this.f27644b);
        sb.append(", callback=");
        sb.append(this.f27645c);
        sb.append(", reject=");
        sb.append(this.f27646d);
        sb.append(")");
        return sb.toString();
    }

    public C10255a(String str, JSONObject jSONObject, C10270b bVar, C52671b<? super Throwable, C52860x> bVar2) {
        C52711k.m112240b(str, "funcName");
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(bVar, "callback");
        C52711k.m112240b(bVar2, "reject");
        this.f27643a = str;
        this.f27644b = jSONObject;
        this.f27645c = bVar;
        this.f27646d = bVar2;
    }
}
