package com.bytedance.crash.p555n;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.n.j */
public final class C9698j {
    /* renamed from: a */
    private static boolean m19372a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m19373a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m19374a(JSONObject jSONObject, String str) {
        if (m19373a(jSONObject) || m19372a(jSONObject.optJSONArray(str))) {
            return true;
        }
        return false;
    }
}
