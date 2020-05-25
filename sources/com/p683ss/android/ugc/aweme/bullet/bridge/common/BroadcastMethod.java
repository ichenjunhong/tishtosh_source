package com.p683ss.android.ugc.aweme.bullet.bridge.common;

import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.BroadcastMethod */
public final class BroadcastMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24143a f64051b = new C24143a(null);

    /* renamed from: c */
    private final String f64052c = "broadcast";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.BroadcastMethod$a */
    public static final class C24143a {
        private C24143a() {
        }

        public /* synthetic */ C24143a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64052c;
    }

    public BroadcastMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        try {
            C52711k.m112240b(jSONObject, "params");
            mo49905a("notification", jSONObject);
            com.p683ss.android.ugc.aweme.p1706fe.method.BroadcastMethod.m69893a(jSONObject);
            aVar.mo49911a((Object) "");
        } catch (JSONException unused) {
            aVar.mo49910a(-1, "");
        }
    }
}
