package com.p683ss.android.ugc.aweme.bullet.bridge.commerce;

import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.commerce.PayMethod */
public final class PayMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24137a f64038b = new C24137a(null);

    /* renamed from: c */
    private final String f64039c = "pay";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.commerce.PayMethod$a */
    public static final class C24137a {
        private C24137a() {
        }

        public /* synthetic */ C24137a(C52707g gVar) {
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
        return this.f64039c;
    }

    public PayMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }
}
