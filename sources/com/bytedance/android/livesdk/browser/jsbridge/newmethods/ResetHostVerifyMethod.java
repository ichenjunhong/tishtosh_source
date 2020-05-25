package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.core.p230g.C3889d;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.ies.p675g.p677b.C10782e;
import com.bytedance.ies.p675g.p677b.C10783f;
import org.json.JSONObject;

public class ResetHostVerifyMethod extends C10782e<JSONObject, Object> {
    public Object invoke(JSONObject jSONObject, C10783f fVar) throws Exception {
        C3889d.m9831a(fVar.f28972a);
        TTLiveSDKContext.getHostService().mo10318k();
        return null;
    }
}
