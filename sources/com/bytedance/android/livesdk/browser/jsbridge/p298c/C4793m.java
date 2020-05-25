package com.bytedance.android.livesdk.browser.jsbridge.p298c;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.verify.model.C8389b;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p676a.C10766h;
import com.bytedance.ies.p675g.p677b.C10807s;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.c.m */
public final class C4793m implements C10762d {

    /* renamed from: a */
    private C4794a f13011a;

    /* renamed from: b */
    private C10807s f13012b;

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.c.m$a */
    public interface C4794a {
        /* renamed from: a */
        void mo10602a(C8389b bVar);
    }

    /* renamed from: a */
    public final void mo10601a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", 0);
        } catch (JSONException unused) {
        }
        this.f13012b.f29036a.mo19458b("H5_zmCertStatus", jSONObject);
    }

    public final void call(C10766h hVar, JSONObject jSONObject) throws Exception {
        JSONObject jSONObject2 = hVar.f28947d;
        if (jSONObject2 != null && !TextUtils.isEmpty(jSONObject2.getString("url"))) {
            hVar.f28951h = false;
            C8389b bVar = new C8389b();
            bVar.f22823a = jSONObject2.optString("transactionId", "");
            bVar.f22824b = jSONObject2.optString("url", "");
            bVar.f22825c = jSONObject2.optString("zhimaToken", "");
            if (this.f13011a != null) {
                this.f13011a.mo10602a(bVar);
            }
        }
    }

    public C4793m(Context context, C4794a aVar, C10807s sVar) {
        this.f13011a = aVar;
        this.f13012b = sVar;
    }
}
