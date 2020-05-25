package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.text.TextUtils;
import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.ies.p675g.p677b.C10782e;
import com.bytedance.ies.p675g.p677b.C10783f;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ag */
public final class C4827ag extends C10782e<JSONObject, Object> {
    public final /* synthetic */ Object invoke(Object obj, C10783f fVar) throws Exception {
        return m11369a((JSONObject) obj, fVar);
    }

    /* renamed from: a */
    private static Object m11369a(JSONObject jSONObject, C10783f fVar) throws Exception {
        String optString = jSONObject.optString("json_str");
        if (!TextUtils.isEmpty(optString)) {
            boolean a = TTLiveSDKContext.getHostService().mo10313f().mo14431a(optString);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("status", a);
                jSONObject2.put(C42311c.f106865i, optString);
            } catch (JSONException unused) {
            }
            C3837e.m9744a("ttlive_open_koi_packet", 0, jSONObject2);
        }
        return null;
    }
}
