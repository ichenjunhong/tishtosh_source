package com.p683ss.android.ugc.aweme.bullet.bridge.commerce;

import android.text.TextUtils;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.commerce.service.C25539a;
import com.p683ss.android.ugc.aweme.utils.C47760cd;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.commerce.FetchFeedsAwemeDataMethod */
public final class FetchFeedsAwemeDataMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24129a f64022b = new C24129a(null);

    /* renamed from: c */
    private final String f64023c = "fetchFeedsAwemeData";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.commerce.FetchFeedsAwemeDataMethod$a */
    public static final class C24129a {
        private C24129a() {
        }

        public /* synthetic */ C24129a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64023c;
    }

    public FetchFeedsAwemeDataMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        try {
            String optString = jSONObject.optString("item_id");
            if (!TextUtils.isEmpty(optString)) {
                aVar.mo49911a((Object) new JSONObject().put("aweme", C47760cd.m103385a(C25539a.m62079a().getAwemeById(optString))));
            }
        } catch (Exception unused) {
        }
    }
}
