package com.bytedance.android.p140a.p141a.p150i;

import android.text.TextUtils;
import com.bytedance.android.p140a.p141a.C2786e;
import com.bytedance.android.p140a.p141a.C2789f;
import com.bytedance.android.p140a.p141a.p142a.C2771a;
import com.bytedance.android.p140a.p141a.p146e.C2787a;
import com.bytedance.android.p140a.p141a.p146e.C2788b;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.a.a.i.a */
public final class C2799a {
    /* renamed from: a */
    public static void m7954a() {
        m7957a("track_setting_invalid", (C2787a) null, (JSONObject) null);
    }

    /* renamed from: a */
    public static void m7955a(C2788b bVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("is_retry", bVar.f8372j);
        } catch (JSONException unused) {
        }
        m7958a("track_no_network", bVar, jSONObject);
    }

    /* renamed from: b */
    public static void m7960b(C2788b bVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("is_retry", bVar.f8372j);
        } catch (JSONException unused) {
        }
        m7958a("track_url_start", bVar, jSONObject);
    }

    /* renamed from: a */
    public static void m7956a(C2788b bVar, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ad_extra_data", new JSONObject().put("error_code", i)).put("local_time_ms", System.currentTimeMillis()).put("is_retry", bVar.f8372j);
        } catch (JSONException unused) {
        }
        m7958a("track_url_invalid", bVar, jSONObject);
    }

    /* renamed from: a */
    private static boolean m7959a(JSONObject jSONObject, String str, Object obj) {
        if (jSONObject.has(str)) {
            return false;
        }
        try {
            jSONObject.putOpt(str, obj);
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static void m7958a(String str, C2788b bVar, JSONObject jSONObject) {
        m7959a(jSONObject, "track_url_list", (Object) "");
        m7959a(jSONObject, "track_status", (Object) Integer.valueOf(-1));
        m7959a(jSONObject, "ts", (Object) Long.valueOf(bVar.f8371i));
        m7959a(jSONObject, "local_time_ms", (Object) String.valueOf(System.currentTimeMillis()));
        m7959a(jSONObject, "is_retry", (Object) Integer.valueOf(0));
        m7957a(str, (C2787a) bVar, jSONObject);
    }

    /* renamed from: a */
    public static void m7957a(String str, C2787a aVar, JSONObject jSONObject) {
        C2771a aVar2 = C2786e.m7920d().f8360g;
        if (aVar2 != null) {
            String str2 = "";
            long j = -1;
            String str3 = "";
            long currentTimeMillis = System.currentTimeMillis();
            if (aVar != null) {
                str2 = aVar.mo7390a();
                j = aVar.f8365c;
                str3 = aVar.f8369g;
                currentTimeMillis = aVar.f8371i;
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                m7959a(jSONObject, "ts", (Object) Long.valueOf(currentTimeMillis));
                jSONObject.put("tag", "track_ad").put("value", j).put("track_label", str2).put("log_extra", str3).put("category", "umeng").put("is_ad_event", "1").put("ad_event_type", "monitor");
                C2789f fVar = C2786e.m7920d().f8361h;
                if (fVar != null) {
                    jSONObject.put("user_agent", C2804f.m7973c(fVar.mo7392a()));
                }
                if (aVar != null) {
                    JSONObject jSONObject2 = null;
                    if (jSONObject.has("ad_extra_data")) {
                        jSONObject2 = jSONObject.optJSONObject("ad_extra_data");
                    }
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                    }
                    boolean z = false;
                    if (aVar.f8370h != null) {
                        JSONObject jSONObject3 = aVar.f8370h;
                        Iterator keys = jSONObject3.keys();
                        while (keys.hasNext()) {
                            String str4 = (String) keys.next();
                            if (!TextUtils.isEmpty(str4)) {
                                Object opt = jSONObject3.opt(str4);
                                if (opt != null && m7959a(jSONObject2, str4, opt)) {
                                    z = true;
                                }
                            }
                        }
                    }
                    if (!aVar.f8366d && aVar.f8367e > 0) {
                        jSONObject2.put("non_std_ad_id", aVar.f8367e);
                        z = true;
                    }
                    if (z) {
                        jSONObject.put("ad_extra_data", jSONObject2);
                    }
                }
            } catch (Throwable unused) {
            }
            aVar2.mo7363a(str, jSONObject);
        }
    }
}
