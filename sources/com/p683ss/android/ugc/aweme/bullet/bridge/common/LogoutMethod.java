package com.p683ss.android.ugc.aweme.bullet.bridge.common;

import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.LogoutMethod */
public final class LogoutMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24161a f64088b = new C24161a(null);

    /* renamed from: c */
    private final String f64089c = "accountLogout";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.LogoutMethod$a */
    public static final class C24161a {
        private C24161a() {
        }

        public /* synthetic */ C24161a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64089c;
    }

    public LogoutMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        C20854a.m53162b().logout("h5", "user_logout");
    }
}
