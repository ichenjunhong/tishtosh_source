package com.p683ss.android.ugc.aweme.bullet.bridge.framework;

import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.bullet.p628b.p641h.C10345a;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.ReportCustomEventMethod */
public final class ReportCustomEventMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24205a f64225b = new C24205a(null);

    /* renamed from: c */
    private final String f64226c = "reportCustomEvent";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.ReportCustomEventMethod$a */
    public static final class C24205a {
        private C24205a() {
        }

        public /* synthetic */ C24205a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64226c;
    }

    public ReportCustomEventMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        boolean z;
        boolean z2;
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        String str = "state invalid";
        C10345a aVar2 = (C10345a) this.f27647a.mo18401c(C10345a.class);
        if (aVar2 != null) {
            String optString = jSONObject.optString("service");
            CharSequence charSequence = optString;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = "service empty";
            } else {
                String optString2 = jSONObject.optString("trigger");
                CharSequence charSequence2 = optString2;
                if (charSequence2 == null || charSequence2.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    str = "trigger empty";
                } else {
                    JSONObject optJSONObject = jSONObject.optJSONObject("category");
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("metrics");
                    JSONObject optJSONObject3 = jSONObject.optJSONObject("extra");
                    if (optString == null) {
                        C52711k.m112234a();
                    }
                    if (optString2 == null) {
                        C52711k.m112234a();
                    }
                    aVar2.mo18409a(optString, optString2, optJSONObject, optJSONObject2, optJSONObject3);
                    aVar.mo49912a(new JSONObject(), 1, "report success");
                    return;
                }
            }
        }
        StringBuilder sb = new StringBuilder("report error, reason: ");
        sb.append(str);
        aVar.mo49910a(0, sb.toString());
    }
}
