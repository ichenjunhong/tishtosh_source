package com.p683ss.android.ugc.aweme.bullet.bridge.commerce;

import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.commerce.service.p1537c.C25542a;
import org.greenrobot.eventbus.C53755c;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.commerce.SelectFilterMethod */
public final class SelectFilterMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24138a f64040b = new C24138a(null);

    /* renamed from: c */
    private final String f64041c = "selectFilter";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.commerce.SelectFilterMethod$a */
    public static final class C24138a {
        private C24138a() {
        }

        public /* synthetic */ C24138a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64041c;
    }

    public SelectFilterMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        C53755c.m114319a().mo112960d(new C25542a(jSONObject.optLong("stat_id")));
    }
}
