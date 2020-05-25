package com.bytedance.ies.ugc.statisticlogger;

import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.ugc.statisticlogger.c */
public final class C11053c {

    /* renamed from: a */
    public final C11062d f29679a;

    /* renamed from: b */
    public final long f29680b;

    /* renamed from: c */
    public final String f29681c;

    /* renamed from: d */
    public final JSONObject f29682d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C11053c) {
                C11053c cVar = (C11053c) obj;
                if (C52711k.m112239a((Object) this.f29679a, (Object) cVar.f29679a)) {
                    if (!(this.f29680b == cVar.f29680b) || !C52711k.m112239a((Object) this.f29681c, (Object) cVar.f29681c) || !C52711k.m112239a((Object) this.f29682d, (Object) cVar.f29682d)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C11062d dVar = this.f29679a;
        int i = 0;
        int hashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
        long j = this.f29680b;
        int i2 = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        String str = this.f29681c;
        int hashCode2 = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        JSONObject jSONObject = this.f29682d;
        if (jSONObject != null) {
            i = jSONObject.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionChangeEvent(type=");
        sb.append(this.f29679a);
        sb.append(", sessionId=");
        sb.append(this.f29680b);
        sb.append(", session=");
        sb.append(this.f29681c);
        sb.append(", app_log=");
        sb.append(this.f29682d);
        sb.append(")");
        return sb.toString();
    }

    public C11053c(C11062d dVar, long j, String str, JSONObject jSONObject) {
        C52711k.m112240b(dVar, "type");
        this.f29679a = dVar;
        this.f29680b = j;
        this.f29681c = str;
        this.f29682d = jSONObject;
    }

    public /* synthetic */ C11053c(C11062d dVar, long j, String str, JSONObject jSONObject, int i, C52707g gVar) {
        this(dVar, j, "", null);
    }
}
