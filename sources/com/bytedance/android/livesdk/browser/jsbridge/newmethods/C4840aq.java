package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.ies.p675g.p677b.C10782e;
import com.bytedance.ies.p675g.p677b.C10783f;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.aq */
public final class C4840aq extends C10782e<JSONObject, Object> {
    public final /* synthetic */ Object invoke(Object obj, C10783f fVar) throws Exception {
        JSONObject jSONObject = (JSONObject) obj;
        String optString = jSONObject.optString("eventName");
        JSONObject optJSONObject = jSONObject.optJSONObject("params");
        Iterator keys = optJSONObject.keys();
        HashMap hashMap = new HashMap();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            String optString2 = optJSONObject.optString(str);
            keys.remove();
            hashMap.put(str, optString2);
        }
        hashMap.put("sdk_version", "1510");
        hashMap.put("_param_live_platform", CustomActionPushReceiver.f104061f);
        TTLiveSDKContext.getHostService().mo10311d().mo15567a(optString, hashMap);
        return null;
    }
}
