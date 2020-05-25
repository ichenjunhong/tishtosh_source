package com.p683ss.android.ugc.aweme.p1706fe.method;

import com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.fe.method.MiniAppPreloadMethod */
public final class MiniAppPreloadMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C29813a f77852a = new C29813a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.MiniAppPreloadMethod$a */
    public static final class C29813a {
        private C29813a() {
        }

        public /* synthetic */ C29813a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        if (jSONObject != null) {
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
}
