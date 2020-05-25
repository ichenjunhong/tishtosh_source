package com.p683ss.android.ugc.aweme.bullet.bridge.common;

import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.utils.C47899fs;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.IsAppInstalledMethod */
public final class IsAppInstalledMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24156a f64079b = new C24156a(null);

    /* renamed from: c */
    private final String f64080c = "isAppInstall";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.IsAppInstalledMethod$a */
    public static final class C24156a {
        private C24156a() {
        }

        public /* synthetic */ C24156a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64080c;
    }

    public IsAppInstalledMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        String string = jSONObject.getString("packageName");
        if (C47899fs.m103617a(C11010c.m22280a(), string)) {
            aVar.mo49911a((Object) new JSONObject());
        } else {
            aVar.mo49910a(-1, string);
        }
    }
}
