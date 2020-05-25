package com.p683ss.android.sdk.activity;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.ss.android.sdk.activity.a */
public final class C19722a {
    /* renamed from: a */
    public static JSONObject m48220a(Context context, long j, String str, String str2, String str3, String str4) {
        if (context == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("label", "browser");
            jSONObject2.put("pageUrl", str2);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject2.put("referer_url", str3);
            }
            if (!TextUtils.isEmpty(str3) && !str3.equals(str4)) {
                jSONObject2.put("init_url", str4);
            }
            jSONObject2.put("ad_id", j);
            if (!TextUtils.isEmpty(str)) {
                jSONObject2.put("log_extra", str);
            }
            if (j <= 0) {
                jSONObject2.put("in_white_list", 1);
            }
            jSONObject.put("ext_json", jSONObject2);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
