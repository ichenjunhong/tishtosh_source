package com.p683ss.android.ugc.aweme.bullet.bridge.commerce;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26435bs;
import org.json.JSONObject;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.commerce.MakeCallMethod */
public final class MakeCallMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24133a f64030b = new C24133a(null);

    /* renamed from: c */
    private final String f64031c = "makeCall";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.commerce.MakeCallMethod$a */
    public static final class C24133a {
        private C24133a() {
        }

        public /* synthetic */ C24133a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64031c;
    }

    public MakeCallMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        Context e = mo18743e();
        if (e != null) {
            String optString = jSONObject.optString("phone_number");
            String optString2 = jSONObject.optString("phone_id");
            String optString3 = jSONObject.optString("encrypt_key");
            String optString4 = jSONObject.optString("log_tag");
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString3)) {
                C26435bs a = C26435bs.m63920a();
                if (e != null) {
                    a.mo54161a((Activity) e, optString, optString2, optString3, optString4);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type android.app.Activity");
            }
        }
    }
}
