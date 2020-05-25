package com.p683ss.android.ugc.aweme.bullet.bridge.p1473ad;

import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.commercialize.p1553d.C25720j;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.MessageTipMethod */
public final class MessageTipMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24122a f64005b = new C24122a(null);

    /* renamed from: c */
    private final String f64006c = "messageTip";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.MessageTipMethod$a */
    public static final class C24122a {
        private C24122a() {
        }

        public /* synthetic */ C24122a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64006c;
    }

    public MessageTipMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        String optString = jSONObject.optString("func");
        if (jSONObject.has("msg")) {
            C10691a.m21537a(mo18743e(), jSONObject.getString("msg")).mo19066a();
            if (aVar != null) {
                aVar.mo49911a((Object) null);
            }
        } else if (aVar != null) {
            aVar.mo49910a(-1, "empty msg");
        }
        C52711k.m112236a((Object) optString, "func");
        C25720j jVar = new C25720j(optString, jSONObject, null, null, 12, null);
        C47718bf.m103288a(jVar);
    }
}
