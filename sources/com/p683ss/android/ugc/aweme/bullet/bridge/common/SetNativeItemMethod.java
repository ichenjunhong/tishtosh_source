package com.p683ss.android.ugc.aweme.bullet.bridge.common;

import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.p1706fe.utils.C29973d;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.SetNativeItemMethod */
public final class SetNativeItemMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24172a f64115b = new C24172a(null);

    /* renamed from: c */
    private final String f64116c = "setNativeItem";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.SetNativeItemMethod$a */
    public static final class C24172a {
        private C24172a() {
        }

        public /* synthetic */ C24172a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64116c;
    }

    public SetNativeItemMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        try {
            if (C29973d.m70118a().mo60151a(jSONObject.getString("key"), (Object) jSONObject.getString("value"))) {
                aVar.mo49911a((Object) null);
            } else {
                aVar.mo49910a(-1, "");
            }
        } catch (Exception unused) {
            aVar.mo49910a(-1, "");
        }
    }
}
