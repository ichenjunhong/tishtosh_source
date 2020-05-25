package com.bytedance.android.monitor.webview;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.webview.k */
public final class C8905k {
    /* renamed from: a */
    public static long m17619a(String str) {
        try {
            return Long.parseLong(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public static JSONObject m17626b(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception unused) {
            return new JSONObject();
        }
    }

    /* renamed from: a */
    public static Object m17620a(JSONArray jSONArray, int i) {
        try {
            return jSONArray.opt(i);
        } catch (Exception unused) {
            return new Object();
        }
    }

    /* renamed from: b */
    public static long m17625b(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return 0;
        }
        return jSONObject.optLong(str, 0);
    }

    /* renamed from: c */
    public static String m17627c(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return "";
        }
        return jSONObject.optString(str, "");
    }

    /* renamed from: d */
    public static JSONObject m17628d(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        return jSONObject.optJSONObject(str);
    }

    /* renamed from: e */
    public static Object m17629e(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return new Object();
        }
        return jSONObject.opt(str);
    }

    /* renamed from: a */
    public static boolean m17624a(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return false;
        }
        return jSONObject.optBoolean(str, false);
    }

    /* renamed from: a */
    public static void m17621a(JSONObject jSONObject, String str, long j) {
        try {
            jSONObject.put(str, j);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m17622a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public static void m17623a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (Exception unused) {
        }
    }
}
