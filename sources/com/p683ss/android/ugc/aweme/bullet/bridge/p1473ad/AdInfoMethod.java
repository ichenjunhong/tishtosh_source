package com.p683ss.android.ugc.aweme.bullet.bridge.p1473ad;

import com.bytedance.ies.bullet.p628b.p633e.C10290i;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.bullet.p628b.p643i.C10423r;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24310h;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26384ak;
import com.p683ss.android.ugc.aweme.util.C47625i;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.AdInfoMethod */
public final class AdInfoMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24118a f63997b = new C24118a(null);

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.AdInfoMethod$a */
    public static final class C24118a {
        private C24118a() {
        }

        public /* synthetic */ C24118a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return "adInfo";
    }

    public AdInfoMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C10423r rVar;
        int i;
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
        C10290i g = mo49907g();
        if (g != null) {
            rVar = g.mo18348f();
        } else {
            rVar = null;
        }
        if (!(rVar instanceof C24310h)) {
            rVar = null;
        }
        C24310h hVar = (C24310h) rVar;
        if (hVar != null) {
            jSONObject2.put("cid", hVar.f64502e.mo18457b());
            jSONObject2.put("group_id", hVar.mo50126g());
            jSONObject2.put("ad_type", hVar.f64503f.mo18457b());
            jSONObject2.put("log_extra", hVar.mo50065c());
            jSONObject2.put("download_url", hVar.f64478O.mo18457b());
            jSONObject2.put("package_name", hVar.f64480Q.mo18457b());
            jSONObject2.put("app_name", hVar.f64479P.mo18457b());
            String str = "code";
            Long l = (Long) hVar.f64502e.mo18457b();
            long j = 0;
            if (l != null && l.longValue() == 0) {
                i = 0;
            } else {
                i = 1;
            }
            jSONObject2.put(str, i);
            C26384ak akVar = C26384ak.f69607d;
            Long l2 = (Long) hVar.f64502e.mo18457b();
            if (l2 != null) {
                j = l2.longValue();
            }
            akVar.mo54105a(j, hVar.mo50065c());
        } else {
            C47625i.m103103a("在非商业化场景调用adInfo是不合法的, 请私聊张翔");
        }
        aVar.mo49913a(jSONObject2);
    }
}
