package com.bytedance.android.livesdk.browser.p290d;

import com.bytedance.android.live.base.model.user.C3013l;
import org.json.JSONException;
import org.json.JSONObject;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.browser.d.o */
final /* synthetic */ class C4734o implements C1710e {

    /* renamed from: a */
    private final C4720h f12915a;

    C4734o(C4720h hVar) {
        this.f12915a = hVar;
    }

    public final void accept(Object obj) {
        C4720h hVar = this.f12915a;
        C3013l lVar = (C3013l) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("code", "1");
            jSONObject.put("args", jSONObject2);
            hVar.mo10525a("H5_loginStatus", jSONObject);
        } catch (JSONException unused) {
        }
    }
}
