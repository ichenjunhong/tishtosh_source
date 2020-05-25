package com.bytedance.android.live.core.p224c;

import android.text.TextUtils;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.core.c.b */
public abstract class C3832b {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract JSONObject mo9196a();

    /* renamed from: a */
    private static JSONObject m9717a(Map<String, ?> map) {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Entry entry : map.entrySet()) {
            try {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m9718a(int i, StackTraceElement[] stackTraceElementArr) {
        C3831a.m9706a(i, "ttlive_exception", stackTraceElementArr);
    }

    /* renamed from: a */
    public static void m9719a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            C3831a.m9712b(str, str2);
        }
    }

    /* renamed from: b */
    public static void m9720b(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            C3831a.m9707a(str, str2);
        }
    }

    /* renamed from: c */
    public static void m9721c(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            C3831a.m9716d(str, str2);
        }
    }

    /* renamed from: d */
    public static void m9722d(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            C3831a.m9715c(str, str2);
        }
    }

    /* renamed from: b */
    public final void mo9199b(String str, Map<String, ?> map) {
        if (!TextUtils.isEmpty(str) && map != null) {
            C3831a.m9707a(str, mo9195a(str, m9717a(map), null));
        }
    }

    /* renamed from: c */
    public final void mo9201c(String str, Map<String, ?> map) {
        if (!TextUtils.isEmpty(str) && map != null) {
            C3831a.m9716d(str, mo9195a(str, m9717a(map), null));
        }
    }

    /* renamed from: b */
    public final void mo9200b(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            C3831a.m9707a(str, mo9195a(str, jSONObject, null));
        }
    }

    /* renamed from: a */
    public final void mo9197a(String str, Map<String, ?> map) {
        if (!TextUtils.isEmpty(str) && map != null) {
            mo9198a(str, m9717a(map));
        }
    }

    /* renamed from: a */
    public final void mo9198a(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            C3831a.m9712b(str, mo9195a(str, jSONObject, null));
        }
    }

    /* renamed from: a */
    public String mo9195a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        mo9196a();
        try {
            jSONObject3.put("tag", str);
            jSONObject3.put("params", mo9196a());
            jSONObject3.put("data", jSONObject.toString());
        } catch (JSONException unused) {
        }
        return jSONObject3.toString();
    }
}
