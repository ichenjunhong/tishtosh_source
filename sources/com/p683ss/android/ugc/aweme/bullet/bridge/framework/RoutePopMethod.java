package com.p683ss.android.ugc.aweme.bullet.bridge.framework;

import android.content.Intent;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.bullet.p653ui.common.C10577d;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22507e;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.RoutePopMethod */
public final class RoutePopMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24206a f64227b = new C24206a(null);

    /* renamed from: c */
    private final String f64228c = "routePop";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.RoutePopMethod$a */
    public static final class C24206a {
        private C24206a() {
        }

        public /* synthetic */ C24206a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64228c;
    }

    public RoutePopMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        C10577d f = mo18744f();
        if (f != null) {
            JSONObject jSONObject2 = new JSONObject();
            C22507e.m55596a(jSONObject2, jSONObject);
            Intent intent = new Intent();
            intent.putExtra("serialized_data", jSONObject2.toString());
            f.mo18709a(50000, intent);
            f.mo18716b();
            aVar.mo49912a(new JSONObject(), 1, "pop succeed");
            return;
        }
        aVar.mo49910a(-1, "params not valid");
    }
}
