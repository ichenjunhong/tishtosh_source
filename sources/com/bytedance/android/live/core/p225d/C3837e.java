package com.bytedance.android.live.core.p225d;

import android.text.TextUtils;
import com.bytedance.android.live.base.C2950a;
import com.bytedance.android.live.base.p185b.C2953a;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.core.d.e */
public final class C3837e {
    /* renamed from: a */
    public static void m9747a(String str, String str2, JSONObject jSONObject) {
        if (m9736a() != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("service", str2);
                }
            } catch (JSONException unused) {
            }
            m9736a().mo7593a(str, jSONObject);
        }
    }

    /* renamed from: a */
    public static void m9746a(String str, long j, JSONObject jSONObject) {
        JSONObject a = m9737a(j);
        JSONObject a2 = m9739a(jSONObject);
        if (m9736a() != null) {
            m9736a().mo7594a(str, a, a2);
        }
    }

    /* renamed from: a */
    public static void m9745a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        if (m9736a() != null) {
            m9736a().mo7591a(str, i, jSONObject, m9739a(jSONObject2));
        }
    }

    /* renamed from: a */
    public static void m9748a(Throwable th, String str) {
        if (m9736a() != null) {
            m9736a().mo7595a(th, str);
        }
    }

    /* renamed from: a */
    public static C2953a m9736a() {
        return (C2953a) C2950a.m8371a(C2953a.class);
    }

    /* renamed from: a */
    private static JSONObject m9737a(long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", j);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m9738a(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Entry entry : map.entrySet()) {
            try {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m9739a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("tag", "ttlive_sdk");
            jSONObject2.put("ttlive_sdk_version", "1510");
            if (jSONObject != null) {
                jSONObject2.put("extra", jSONObject);
            }
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    /* renamed from: b */
    public static void m9749b(String str, int i, JSONObject jSONObject) {
        m9745a(str, i, (JSONObject) null, jSONObject);
    }

    /* renamed from: c */
    public static void m9750c(String str, int i, JSONObject jSONObject) {
        if (m9736a() != null) {
            m9736a().mo7590a(str, i, jSONObject);
        }
    }

    /* renamed from: a */
    public static void m9740a(String str, int i, long j) {
        m9745a(str, 0, m9737a(j), (JSONObject) null);
    }

    /* renamed from: a */
    public static void m9743a(String str, int i, Map<String, Object> map) {
        if (m9736a() != null) {
            m9744a(str, i, m9738a(map));
        }
    }

    /* renamed from: a */
    public static void m9744a(String str, int i, JSONObject jSONObject) {
        if (m9736a() != null) {
            m9736a().mo7590a(str, i, m9739a(jSONObject));
        }
    }

    /* renamed from: a */
    public static void m9742a(String str, int i, long j, JSONObject jSONObject) {
        m9745a(str, i, m9737a(j), jSONObject);
    }

    /* renamed from: a */
    public static void m9741a(String str, int i, long j, Map<String, Object> map) {
        m9745a(str, i, m9737a(j), m9738a(map));
    }
}
