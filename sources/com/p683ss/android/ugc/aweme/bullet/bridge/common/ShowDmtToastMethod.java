package com.p683ss.android.ugc.aweme.bullet.bridge.common;

import android.content.Context;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.ShowDmtToastMethod */
public final class ShowDmtToastMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24173a f64117b = new C24173a(null);

    /* renamed from: c */
    private final String f64118c = "showDmtToast";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.ShowDmtToastMethod$a */
    public static final class C24173a {
        private C24173a() {
        }

        public /* synthetic */ C24173a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64118c;
    }

    public ShowDmtToastMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        Context e = mo18743e();
        if (!jSONObject.has("msg")) {
            aVar.mo49910a(0, "no params found");
            return;
        }
        String optString = jSONObject.optString("msg");
        C52711k.m112236a((Object) optString, "params.optString(\"msg\")");
        if (e != null) {
            C10691a.m21537a(e, optString).mo19066a();
        }
    }
}
