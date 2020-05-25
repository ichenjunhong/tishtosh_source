package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.p173d.p176b.C2914e;
import com.bytedance.android.p173d.p176b.C2930i;
import com.bytedance.ies.p675g.p677b.C10782e;
import com.bytedance.ies.p675g.p677b.C10783f;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ao */
public final class C4837ao extends C10782e<JSONObject, Object> {

    /* renamed from: a */
    private C2914e f13051a = C2930i.m8357a("webcast_jsb_local_data");

    public final /* synthetic */ Object invoke(Object obj, C10783f fVar) throws Exception {
        JSONObject jSONObject = (JSONObject) obj;
        String optString = jSONObject.optString("key");
        String optString2 = jSONObject.optString("data");
        if (this.f13051a != null) {
            this.f13051a.mo7555a(optString, optString2);
        }
        return null;
    }
}
