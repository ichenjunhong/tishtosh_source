package com.p683ss.android.ugc.aweme.bullet.bridge.commerce;

import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.commerce.JumpToTaobaoCouponMethod */
public final class JumpToTaobaoCouponMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24132a f64028b = new C24132a(null);

    /* renamed from: c */
    private final String f64029c = "jumpTaobaoForCoupon";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.commerce.JumpToTaobaoCouponMethod$a */
    public static final class C24132a {
        private C24132a() {
        }

        public /* synthetic */ C24132a(C52707g gVar) {
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
        return this.f64029c;
    }

    public JumpToTaobaoCouponMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }
}
