package com.p683ss.android.ugc.aweme.bullet.bridge.commerce;

import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.commerce.OpenECommerceLegalModalMethod */
public final class OpenECommerceLegalModalMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24134a f64032b = new C24134a(null);

    /* renamed from: c */
    private final String f64033c = "openECommerceLegalModal";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.commerce.OpenECommerceLegalModalMethod$a */
    public static final class C24134a {
        private C24134a() {
        }

        public /* synthetic */ C24134a(C52707g gVar) {
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
        return this.f64033c;
    }

    public OpenECommerceLegalModalMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }
}
