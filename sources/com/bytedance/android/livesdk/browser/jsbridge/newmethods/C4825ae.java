package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.text.TextUtils;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p388k.C7713e;
import com.bytedance.ies.p675g.p677b.C10782e;
import com.bytedance.ies.p675g.p677b.C10783f;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ae */
public final class C4825ae extends C10782e<JSONObject, Object> {
    public final /* synthetic */ Object invoke(Object obj, C10783f fVar) throws Exception {
        char c;
        JSONObject jSONObject = (JSONObject) obj;
        String optString = jSONObject.optString("type");
        JSONObject optJSONObject = jSONObject.optJSONObject("args");
        if (optString.hashCode() == -806191449 && optString.equals("recharge")) {
            c = 0;
        } else {
            c = 65535;
        }
        if (c == 0 && TextUtils.equals(optJSONObject.optString("status"), "1")) {
            C4495a.m10823a().mo10301a((Object) new C7713e(1, true));
        }
        return null;
    }
}
