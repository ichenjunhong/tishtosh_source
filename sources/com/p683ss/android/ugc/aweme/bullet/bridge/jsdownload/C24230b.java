package com.p683ss.android.ugc.aweme.bullet.bridge.jsdownload;

import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.jsdownload.b */
public final class C24230b {
    /* renamed from: a */
    public static final void m59306a(JSONObject jSONObject, String str, Object obj) {
        C52711k.m112240b(jSONObject, "$this$putIfNotExist");
        C52711k.m112240b(str, "key");
        if (obj != null && !jSONObject.has(str)) {
            jSONObject.put(str, obj);
        }
    }
}
