package com.bytedance.ies.bullet.p628b.p629a;

import java.util.Iterator;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.bullet.b.a.c */
public final class C10240c {
    /* renamed from: a */
    public static final void m20716a(JSONObject jSONObject, JSONObject jSONObject2) {
        C52711k.m112240b(jSONObject, "$this$wrap");
        C52711k.m112240b(jSONObject2, "json");
        Iterator keys = jSONObject2.keys();
        C52711k.m112236a((Object) keys, "json.keys()");
        while (keys.hasNext()) {
            String str = (String) keys.next();
            jSONObject.put(str, jSONObject2.opt(str));
        }
    }
}
