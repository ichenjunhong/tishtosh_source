package com.p683ss.android.ugc.aweme.bullet.bridge.common;

import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.MiniAppPreloadMethod */
public final class MiniAppPreloadMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24163a f64092b = new C24163a(null);

    /* renamed from: c */
    private final String f64093c = "preloadMiniApp";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.MiniAppPreloadMethod$a */
    public static final class C24163a {
        private C24163a() {
        }

        public /* synthetic */ C24163a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64093c;
    }

    public MiniAppPreloadMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        if (!jSONObject.has("mini_app_url")) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            C36983a b = C36983a.m83185b();
            C52711k.m112236a((Object) b, "MiniAppServiceProxy.inst()");
            b.mo76294a().preloadMiniApp(jSONObject.optString("mini_app_url"));
        }
    }
}
