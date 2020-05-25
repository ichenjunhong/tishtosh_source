package com.p683ss.android.ugc.aweme.account.api.p1266b;

import android.text.TextUtils;
import com.google.p1057b.p1065h.p1066a.C17824h;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.api.b.a */
public abstract class C20899a implements C17824h<String> {
    /* renamed from: a */
    public abstract void mo44855a(JSONObject jSONObject);

    /* renamed from: b */
    public abstract void mo44856b(JSONObject jSONObject);

    public /* synthetic */ void onSuccess(Object obj) {
        try {
            JSONObject jSONObject = new JSONObject((String) obj);
            if ("error".equals(jSONObject.opt("message"))) {
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                if (optJSONObject != null) {
                    if (optJSONObject.optInt("error_code") != 1006) {
                        if (!TextUtils.isEmpty(optJSONObject.optString("captcha"))) {
                            optJSONObject.optString("captcha");
                            optJSONObject.optString("description");
                            return;
                        }
                    } else {
                        return;
                    }
                }
                mo44856b(jSONObject);
                return;
            }
            mo44855a(jSONObject);
        } catch (Exception unused) {
        }
    }
}
