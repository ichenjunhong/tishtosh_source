package com.bytedance.android.livesdk.browser.jsbridge.p298c;

import com.bytedance.android.live.core.p230g.C3913t;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdkapi.depend.model.p443b.C8686a;
import com.bytedance.android.livesdkapi.depend.model.p443b.C8686a.C8687a;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p676a.C10766h;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.c.l */
public final class C4792l implements C10762d {
    /* renamed from: a */
    private static int m11355a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return 0;
        }
        try {
            C8686a aVar = (C8686a) C3913t.m9890a(jSONObject.toString(), C8686a.class);
            if (aVar != null) {
                aVar.f23737f = C8687a.FromWeb;
                TTLiveSDKContext.getHostService().mo10315h().mo14525a(aVar);
            }
            return 1;
        } catch (Exception unused) {
            return 0;
        }
    }

    public final void call(C10766h hVar, JSONObject jSONObject) throws Exception {
        int i;
        if ("follow".equals(hVar.f28947d.getString("type"))) {
            i = m11355a(hVar.f28947d.getJSONObject("args"));
        } else {
            i = 0;
        }
        try {
            jSONObject.put("code", i);
        } catch (JSONException unused) {
        }
    }
}
