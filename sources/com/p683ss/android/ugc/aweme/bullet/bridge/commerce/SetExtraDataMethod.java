package com.p683ss.android.ugc.aweme.bullet.bridge.commerce;

import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.commerce.service.p1537c.C25543b;
import org.greenrobot.eventbus.C53755c;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.commerce.SetExtraDataMethod */
public final class SetExtraDataMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24139a f64042b = new C24139a(null);

    /* renamed from: c */
    private final String f64043c = "setExtraData";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.commerce.SetExtraDataMethod$a */
    public static final class C24139a {
        private C24139a() {
        }

        public /* synthetic */ C24139a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64043c;
    }

    public SetExtraDataMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        C53755c.m114319a().mo112960d(new C25543b(jSONObject));
    }
}
