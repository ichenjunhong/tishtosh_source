package com.p683ss.android.sdk.activity;

import com.bytedance.common.utility.C9431p;
import com.p683ss.android.ugc.aweme.base.C23569o;
import org.json.JSONObject;

/* renamed from: com.ss.android.sdk.activity.b */
public final class C19725b {
    /* renamed from: a */
    public static void m48223a(JSONObject jSONObject, boolean z) {
        C23569o.m57776a("aweme_webview_open_error_rate", z ^ true ? 1 : 0, jSONObject);
    }

    /* renamed from: a */
    public static void m48222a(JSONObject jSONObject, String str, Object obj) {
        if (!C9431p.m18664a(str) && obj != null) {
            try {
                jSONObject.put(str, obj);
            } catch (Exception unused) {
            }
        }
    }
}
