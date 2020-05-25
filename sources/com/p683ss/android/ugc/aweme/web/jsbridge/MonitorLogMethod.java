package com.p683ss.android.ugc.aweme.web.jsbridge;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.MonitorLogMethod */
public class MonitorLogMethod extends BaseCommonJavaMethod {
    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) throws JSONException {
        if (jSONObject == null || jSONObject.length() == 0) {
            aVar.mo60038a(0, "params is empty");
            return;
        }
        String optString = jSONObject.optString("log_type");
        if (TextUtils.isEmpty(optString)) {
            aVar.mo60038a(0, "log_type is empty");
            return;
        }
        String optString2 = jSONObject.optString("service");
        if (!TextUtils.equals(optString, "service_monitor") || !TextUtils.isEmpty(optString2)) {
            JSONObject jSONObject2 = new JSONObject();
            m104616a(jSONObject, jSONObject2, "status");
            m104616a(jSONObject, jSONObject2, "value");
            C23131p.m56692a(optString, optString2, jSONObject2);
            aVar.mo60039a((Object) null);
            return;
        }
        StringBuilder sb = new StringBuilder("service is required while log_type=");
        sb.append(optString);
        aVar.mo60038a(0, sb.toString());
    }

    /* renamed from: a */
    private static void m104616a(JSONObject jSONObject, JSONObject jSONObject2, String str) throws JSONException {
        Object opt = jSONObject.opt(str);
        if (opt != null) {
            jSONObject2.put(str, opt);
        }
    }
}
