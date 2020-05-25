package com.p683ss.android.ugc.aweme.story.p2337b;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.story.b.a */
public final class C46636a {
    /* renamed from: a */
    public static JSONObject m101191a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("request_id", str);
        } catch (Exception unused) {
            jSONObject = null;
        }
        return jSONObject;
    }
}
