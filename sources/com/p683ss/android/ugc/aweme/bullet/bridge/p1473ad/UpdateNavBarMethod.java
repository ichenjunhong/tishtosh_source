package com.p683ss.android.ugc.aweme.bullet.bridge.p1473ad;

import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.crossplatform.p1612a.C27094a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.UpdateNavBarMethod */
public final class UpdateNavBarMethod extends BaseBridgeMethod {
    /* renamed from: d */
    public final String mo18313d() {
        return "updateNavBar";
    }

    public UpdateNavBarMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        C47718bf.m103288a(new C27094a(jSONObject.optString("topbar_type", "")));
        aVar.mo49911a((Object) null);
    }
}
