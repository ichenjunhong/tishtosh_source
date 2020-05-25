package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.network.api.INetworkService;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.p675g.p677b.C10782e;
import com.bytedance.ies.p675g.p677b.C10783f;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.e */
public final class C4895e extends C10782e<Object, JSONObject> {
    public final /* synthetic */ Object invoke(Object obj, C10783f fVar) throws Exception {
        JSONObject jSONObject = new JSONObject();
        Map commonParams = ((INetworkService) C4116c.m10249a(INetworkService.class)).getCommonParams();
        for (String str : commonParams.keySet()) {
            String str2 = (String) commonParams.get(str);
            if (!C9431p.m18664a(str) && !C9431p.m18664a(str2)) {
                jSONObject.put(str, str2);
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        for (Entry entry : TTLiveSDKContext.getHostService().mo10316i().mo15572b("https://api.hypstar.com").entrySet()) {
            jSONObject2.put((String) entry.getKey(), entry.getValue());
        }
        jSONObject.put("tt_token", jSONObject2);
        return jSONObject;
    }
}
