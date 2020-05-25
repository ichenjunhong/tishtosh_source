package com.bytedance.common.utility;

import org.json.JSONObject;

/* renamed from: com.bytedance.common.utility.g */
public final class C9413g {
    /* renamed from: a */
    public static String m18629a(JSONObject jSONObject, String str, String str2) {
        if (jSONObject == null || C9431p.m18664a(str) || !jSONObject.has(str)) {
            return str2;
        }
        return jSONObject.optString(str, str2);
    }
}
