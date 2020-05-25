package com.bytedance.ies.bullet.p628b.p641h;

import java.util.Iterator;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.bullet.b.h.i */
public final class C10362i {

    /* renamed from: a */
    public static final C10362i f27801a = new C10362i();

    private C10362i() {
    }

    /* renamed from: a */
    public static JSONObject m20949a(JSONObject jSONObject, C10366l lVar) {
        boolean z;
        C52711k.m112240b(jSONObject, "metrics");
        C52711k.m112240b(lVar, "fetcher");
        JSONObject jSONObject2 = new JSONObject();
        Iterator keys = jSONObject.keys();
        C52711k.m112236a((Object) keys, "metrics.keys()");
        while (keys.hasNext()) {
            String str = (String) keys.next();
            Long valueOf = Long.valueOf(jSONObject.optLong(str));
            if (valueOf.longValue() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                valueOf = null;
            }
            if (valueOf != null) {
                valueOf.longValue();
                C52711k.m112236a((Object) str, "trigger");
                C10361h a = lVar.mo18440a(str, jSONObject);
                if (a != null) {
                    jSONObject2.put(a.f27799a, a.f27800b);
                }
            }
        }
        return jSONObject2;
    }

    /* renamed from: a */
    public static JSONObject m20948a(String str, JSONObject jSONObject, C10366l lVar) {
        C52711k.m112240b(str, "curTrigger");
        C52711k.m112240b(jSONObject, "metrics");
        C52711k.m112240b(lVar, "fetcher");
        C10361h a = lVar.mo18440a(str, jSONObject);
        if (a == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(a.f27799a, a.f27800b);
        return jSONObject2;
    }
}
