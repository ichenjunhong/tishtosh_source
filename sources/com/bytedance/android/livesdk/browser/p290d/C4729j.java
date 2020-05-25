package com.bytedance.android.livesdk.browser.p290d;

import com.bytedance.android.livesdkapi.depend.model.p443b.C8686a;
import org.json.JSONException;
import org.json.JSONObject;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.browser.d.j */
final /* synthetic */ class C4729j implements C1710e {

    /* renamed from: a */
    private final C4720h f12910a;

    C4729j(C4720h hVar) {
        this.f12910a = hVar;
    }

    public final void accept(Object obj) {
        C4720h hVar = this.f12910a;
        C8686a aVar = (C8686a) obj;
        if (aVar != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject.put("type", "follow");
                jSONObject2.put("user_id", String.valueOf(aVar.f23732a));
                jSONObject2.put("follow_status", aVar.mo15140a());
                jSONObject.put("args", jSONObject2);
                hVar.mo10525a("H5_userStatusChange", jSONObject);
            } catch (JSONException unused) {
            }
        }
    }
}
