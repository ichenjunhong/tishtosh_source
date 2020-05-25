package com.p683ss.android.ugc.aweme.crossplatform.business;

import android.webkit.WebView;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.crossplatform.business.BusinessService.Business;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.PlayableBusiness */
public class PlayableBusiness extends Business {

    /* renamed from: a */
    public boolean f71663a;

    /* renamed from: b */
    private C10757a f71664b;

    public PlayableBusiness(C27173c cVar) {
        super(cVar);
    }

    /* renamed from: a */
    public void mo55508a(boolean z, boolean z2) {
        if (this.f71633j.f71719b.f71770y == 1 && this.f71664b != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("endcard_mute", z);
                jSONObject.put("endcard_show", z2);
                this.f71664b.mo19458b("endcard_control_event", jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo55507a(WebView webView, String str, C10757a aVar) {
        this.f71664b = aVar;
        mo55508a(false, true);
    }
}
