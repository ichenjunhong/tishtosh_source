package com.p683ss.android.ugc.aweme.web.jsbridge;

import com.bytedance.ies.p675g.p676a.C10766h;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40351dt.C40353a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.ag */
final /* synthetic */ class C48334ag implements C40353a {

    /* renamed from: a */
    private final C48333af f121612a;

    /* renamed from: b */
    private final C10766h f121613b;

    C48334ag(C48333af afVar, C10766h hVar) {
        this.f121612a = afVar;
        this.f121613b = hVar;
    }

    /* renamed from: a */
    public final void mo49946a(boolean z, String str) {
        C48333af afVar = this.f121612a;
        C10766h hVar = this.f121613b;
        JSONObject jSONObject = new JSONObject();
        if (!z) {
            try {
                jSONObject.put("code", 0);
            } catch (JSONException unused) {
                return;
            }
        } else {
            jSONObject.put("code", 1);
            jSONObject.put("location", str);
        }
        afVar.f121610a.mo19455a(hVar.f28945b, jSONObject);
    }
}
