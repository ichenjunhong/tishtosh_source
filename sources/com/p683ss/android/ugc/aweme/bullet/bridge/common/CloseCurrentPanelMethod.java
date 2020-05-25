package com.p683ss.android.ugc.aweme.bullet.bridge.common;

import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.bullet.p1472b.C24111b;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.CloseCurrentPanelMethod */
public final class CloseCurrentPanelMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24144a f64053b = new C24144a(null);

    /* renamed from: c */
    private final String f64054c = "closeCurrentPanel";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.CloseCurrentPanelMethod$a */
    public static final class C24144a {
        private C24144a() {
        }

        public /* synthetic */ C24144a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64054c;
    }

    public CloseCurrentPanelMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        C47718bf.m103288a(new C24111b());
        aVar.mo49911a((Object) "");
    }
}
