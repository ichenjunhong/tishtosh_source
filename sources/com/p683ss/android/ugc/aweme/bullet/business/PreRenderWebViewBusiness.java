package com.p683ss.android.ugc.aweme.bullet.business;

import android.webkit.WebView;
import com.bytedance.ies.bullet.kit.web.p649b.C10492a;
import com.bytedance.ies.bullet.p653ui.common.p657d.C10578a;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.bullet.bridge.p1473ad.GetWebViewInfo.C24121a;
import com.p683ss.android.ugc.aweme.bullet.business.BulletBusinessService.Business;
import com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24310h;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.business.PreRenderWebViewBusiness */
public final class PreRenderWebViewBusiness extends Business {

    /* renamed from: a */
    public static final C24249a f64348a = new C24249a(null);

    /* renamed from: b */
    private int f64349b;

    /* renamed from: c */
    private String f64350c;

    /* renamed from: com.ss.android.ugc.aweme.bullet.business.PreRenderWebViewBusiness$a */
    public static final class C24249a {
        private C24249a() {
        }

        public /* synthetic */ C24249a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static PreRenderWebViewBusiness m59360a(C24254b bVar) {
            C10578a aVar;
            if (bVar != null) {
                aVar = bVar.mo50019b();
            } else {
                aVar = null;
            }
            if (!(aVar instanceof C24310h)) {
                aVar = null;
            }
            C24310h hVar = (C24310h) aVar;
            if (hVar == null || hVar.mo50128i() != 7) {
                return null;
            }
            return (PreRenderWebViewBusiness) bVar.mo50011a(PreRenderWebViewBusiness.class);
        }
    }

    /* renamed from: a */
    public final void mo50002a() {
        this.f64349b = 0;
        C10492a c = this.f64316k.mo50020c();
        if (c != null) {
            c.mo18618a("webViewDidHide", null);
        }
    }

    public PreRenderWebViewBusiness(C24252a aVar) {
        C52711k.m112240b(aVar, "bulletBusiness");
        super(aVar);
    }

    /* renamed from: a */
    public final void mo50003a(C24121a aVar) {
        C24112a aVar2;
        if (aVar != null) {
            aVar2 = aVar.f64004b;
        } else {
            aVar2 = null;
        }
        if (aVar2 != null) {
            int i = aVar.f64003a;
            WebView d = this.f64316k.mo50021d();
            if (d != null && i == d.hashCode()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("appearanceState", this.f64349b);
                jSONObject.put("code", 1);
                jSONObject.put("preloadType", 1);
                jSONObject.put("clickFrom", this.f64350c);
                aVar.f64004b.mo49913a(jSONObject);
            }
        }
    }

    /* renamed from: a */
    public final void mo50004a(String str) {
        this.f64349b = 2;
        C10492a c = this.f64316k.mo50020c();
        if (c != null) {
            String str2 = "webViewDidShow";
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("clickFrom", str);
            } catch (Exception unused) {
            }
            c.mo18618a(str2, jSONObject);
        }
        this.f64350c = str;
    }
}
