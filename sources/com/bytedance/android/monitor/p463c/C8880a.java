package com.bytedance.android.monitor.p463c;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.c.a */
public final class C8880a {
    /* renamed from: a */
    public static Object m17462a(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return new Object();
        }
        return jSONObject.opt(str);
    }

    /* renamed from: a */
    public static void m17463a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public static void m17464a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (Exception unused) {
        }
    }
}
