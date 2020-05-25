package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdkapi.p432d.C8612a;
import com.bytedance.ies.p675g.p677b.C10782e;
import com.bytedance.ies.p675g.p677b.C10783f;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ar */
public final class C4841ar extends C10782e<JSONObject, Object> {
    public final /* synthetic */ Object invoke(Object obj, C10783f fVar) throws Exception {
        JSONObject jSONObject = (JSONObject) obj;
        jSONObject.optString("eventName");
        jSONObject.optString("labelName");
        JSONObject optJSONObject = jSONObject.optJSONObject("params");
        HashMap hashMap = new HashMap();
        Iterator keys = optJSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            String optString = optJSONObject.optString(str);
            keys.remove();
            hashMap.put(str, optString);
        }
        C4116c.m10249a(C8612a.class);
        return null;
    }
}
