package com.p683ss.android.ugc.aweme.bullet.bridge.framework;

import android.text.TextUtils;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.google.gson.C18085o;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.common.C26883g;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.SendLogMethod */
public final class SendLogMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24211a f64241b = new C24211a(null);

    /* renamed from: c */
    private final String f64242c = "sendLog";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.SendLogMethod$a */
    public static final class C24211a {
        private C24211a() {
        }

        public /* synthetic */ C24211a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64242c;
    }

    public SendLogMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
        mo18296a(C24223a.f64268a);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        long j;
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        mo18743e();
        if (jSONObject != null) {
            String optString = jSONObject.optString("eventName");
            String optString2 = jSONObject.optString("labelName");
            String optString3 = jSONObject.optString("value");
            String optString4 = jSONObject.optString("extValue");
            JSONObject optJSONObject = jSONObject.optJSONObject("extJson");
            long j2 = 0;
            if (!TextUtils.isEmpty(optString3)) {
                j = Long.parseLong(optString3);
            } else {
                j = 0;
            }
            if (!TextUtils.isEmpty(optString4)) {
                j2 = Long.parseLong(optString4);
            }
            long j3 = j2;
            if (mo18743e() != null) {
                if (TextUtils.equals("click", optString2)) {
                    C26088l.m63304a(optString, optString3, j3, optJSONObject);
                    optJSONObject.put("has_v3", 1);
                }
                C26883g.m64993a(mo18743e(), optString, optString2, j, j3, optJSONObject);
                aVar.mo49911a((Object) new C18085o());
                return;
            }
        }
        aVar.mo49910a(0, "");
    }
}
