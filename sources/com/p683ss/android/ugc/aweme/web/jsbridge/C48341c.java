package com.p683ss.android.ugc.aweme.web.jsbridge;

import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p676a.C10766h;
import com.p683ss.android.common.applog.NetUtil;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import java.util.HashMap;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.c */
public final class C48341c implements C10762d {
    public final void call(C10766h hVar, JSONObject jSONObject) throws Exception {
        HashMap hashMap = new HashMap();
        NetUtil.putCommonParams(hashMap, false);
        for (Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (!C9431p.m18664a(str) && !C9431p.m18664a(str2)) {
                try {
                    jSONObject.put(str, str2);
                } catch (JSONException unused) {
                }
            }
        }
        try {
            String advertisingIdOb = I18nBridgeService.getBridgeService_Monster().getAdvertisingIdOb();
            if (!TextUtils.isEmpty(advertisingIdOb)) {
                jSONObject.put("gaid", advertisingIdOb);
            }
            jSONObject.put("code", 1);
        } catch (JSONException unused2) {
        }
    }
}
