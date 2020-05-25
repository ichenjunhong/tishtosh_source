package com.p683ss.android.ugc.aweme.bullet.bridge.common;

import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.setting.C41549aq;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.GetSettingsMethod */
public final class GetSettingsMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24155a f64077b = new C24155a(null);

    /* renamed from: c */
    private final String f64078c = "getSettings";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.GetSettingsMethod$a */
    public static final class C24155a {
        private C24155a() {
        }

        public /* synthetic */ C24155a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64078c;
    }

    public GetSettingsMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        try {
            C41549aq a = C41549aq.m91378a();
            C52711k.m112236a((Object) a, "SettingManager.inst()");
            aVar.mo49911a((Object) new JSONObject(a.f105252f));
        } catch (Exception unused) {
            aVar.mo49910a(-1, "");
        }
    }
}
