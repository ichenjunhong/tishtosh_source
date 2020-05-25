package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.livesdkapi.C8830k;
import com.bytedance.ies.p675g.p677b.C10782e;
import com.bytedance.ies.p675g.p677b.C10783f;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.y */
public final class C4944y extends C10782e<Object, JSONObject> {
    public final /* synthetic */ Object invoke(Object obj, C10783f fVar) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_teen_mode", C8830k.m17331e().mo13039a().isNeedProtectUnderage());
        return jSONObject;
    }
}
