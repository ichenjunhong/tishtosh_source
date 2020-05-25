package com.p683ss.android.ugc.aweme.bullet.bridge.commerce;

import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.commerce.WXMiniPayMethod */
public final class WXMiniPayMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24141a f64047b = new C24141a(null);

    /* renamed from: c */
    private final String f64048c = "launchWXMiniPro";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.commerce.WXMiniPayMethod$a */
    public static final class C24141a {
        private C24141a() {
        }

        public /* synthetic */ C24141a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64048c;
    }

    public WXMiniPayMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }
}
