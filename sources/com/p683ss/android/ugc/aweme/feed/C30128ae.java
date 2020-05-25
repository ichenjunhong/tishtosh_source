package com.p683ss.android.ugc.aweme.feed;

import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.ae */
public final class C30128ae {
    /* renamed from: a */
    public static void m70698a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fetch_type", str3);
        } catch (JSONException unused) {
        }
        C26890h.onEvent(MobClick.obtain().setEventName(str).setLabelName(str2).setJsonObject(jSONObject));
    }
}
