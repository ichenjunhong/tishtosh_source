package com.p683ss.android.ugc.aweme.bullet.bridge.commerce;

import com.bytedance.ies.bullet.p628b.p633e.p634a.C10268e.C10269a;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.commerce.TaoCommandMethod */
public final class TaoCommandMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24140a f64044b = new C24140a(null);

    /* renamed from: c */
    private final String f64045c = "fetchTaoCommand";

    /* renamed from: d */
    private C10269a f64046d = C10269a.PROTECT;

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.commerce.TaoCommandMethod$a */
    public static final class C24140a {
        private C24140a() {
        }

        public /* synthetic */ C24140a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: b */
    public final C10269a mo18297b() {
        return this.f64046d;
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64045c;
    }

    /* renamed from: a */
    public final void mo18296a(C10269a aVar) {
        C52711k.m112240b(aVar, "<set-?>");
        this.f64046d = aVar;
    }

    public TaoCommandMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        JSONObject jSONObject2 = new JSONObject();
        new com.p683ss.android.ugc.aweme.p1706fe.method.commerce.TaoCommandMethod(null, 1, null);
        jSONObject2.put("command", com.p683ss.android.ugc.aweme.p1706fe.method.commerce.TaoCommandMethod.m70023c());
        aVar.mo49911a((Object) jSONObject2);
    }
}
