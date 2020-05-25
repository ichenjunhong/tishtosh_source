package com.p683ss.android.ugc.aweme.bullet.bridge.framework;

import com.bytedance.ies.bullet.kit.p644rn.C10470f;
import com.bytedance.ies.bullet.p628b.p633e.C10254a;
import com.bytedance.ies.bullet.p628b.p633e.C10290i;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import org.json.JSONObject;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.ComponentDidMountMethod */
public final class ComponentDidMountMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24183a f64162b = new C24183a(null);

    /* renamed from: c */
    private final String f64163c = "componentDidMount";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.ComponentDidMountMethod$a */
    public static final class C24183a {
        private C24183a() {
        }

        public /* synthetic */ C24183a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64163c;
    }

    public ComponentDidMountMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        if (mo49908h() != C10254a.WEB && (mo49907g() instanceof C10470f)) {
            C10290i g = mo49907g();
            if (g != null) {
                ((C10470f) g).mo18538j();
            } else {
                throw new C52857u("null cannot be cast to non-null type com.bytedance.ies.bullet.kit.rn.IRnKitContainerApi");
            }
        }
    }
}
