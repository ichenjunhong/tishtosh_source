package com.p683ss.android.ugc.aweme.p1706fe.method;

import android.app.Activity;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26435bs;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.MakeCallMethod */
public class MakeCallMethod extends BaseCommonJavaMethod {
    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        if (this.f77793e != null && this.f77793e.get() != null && jSONObject != null) {
            String optString = jSONObject.optString("phone_number");
            String optString2 = jSONObject.optString("phone_id");
            String optString3 = jSONObject.optString("encrypt_key");
            String optString4 = jSONObject.optString("log_tag");
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString3)) {
                C26435bs.m63920a().mo54161a((Activity) this.f77793e.get(), optString, optString2, optString3, optString4);
            }
        }
    }
}
