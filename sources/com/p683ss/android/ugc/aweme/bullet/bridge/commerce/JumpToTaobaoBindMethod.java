package com.p683ss.android.ugc.aweme.bullet.bridge.commerce;

import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.commerce.service.C25539a;
import com.p683ss.android.ugc.aweme.commerce.service.ICommerceService;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.commerce.JumpToTaobaoBindMethod */
public final class JumpToTaobaoBindMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24131a f64026b = new C24131a(null);

    /* renamed from: c */
    private final String f64027c = "jumpTaobaoForBind";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.commerce.JumpToTaobaoBindMethod$a */
    public static final class C24131a {
        private C24131a() {
        }

        public /* synthetic */ C24131a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64027c;
    }

    public JumpToTaobaoBindMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        int i = 1;
        boolean z = false;
        if (jSONObject.has("taobaoUrl")) {
            try {
                ICommerceService a = C25539a.m62079a();
                String optString = jSONObject.optString("taobaoUrl");
                C52711k.m112236a((Object) optString, "params.optString(KEY_TAOBAO_URL)");
                a.goBindTaobao(optString, C11016e.m22312g());
                z = true;
            } catch (Exception unused) {
            }
        }
        if (!z) {
            i = -1;
        }
        aVar.mo49912a(null, i, "");
    }
}
