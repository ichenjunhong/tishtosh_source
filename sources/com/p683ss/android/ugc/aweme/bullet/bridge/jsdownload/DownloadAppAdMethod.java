package com.p683ss.android.ugc.aweme.bullet.bridge.jsdownload;

import com.bytedance.ies.bullet.p628b.p633e.C10290i;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10268e.C10269a;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.app.download.p1374a.C23077b;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24302c;
import com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24303d;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.jsdownload.DownloadAppAdMethod */
public final class DownloadAppAdMethod extends BaseBridgeMethod {

    /* renamed from: b */
    private final String f64273b = "download_app_ad";

    /* renamed from: c */
    private C10269a f64274c = C10269a.PRIVATE;

    /* renamed from: b */
    public final C10269a mo18297b() {
        return this.f64274c;
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64273b;
    }

    /* renamed from: a */
    public final void mo18296a(C10269a aVar) {
        C52711k.m112240b(aVar, "<set-?>");
        this.f64274c = aVar;
    }

    public DownloadAppAdMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C24302c cVar;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (optJSONObject != null) {
            boolean z = false;
            if (optJSONObject.optInt("is_landing_page_ad", 0) == 1) {
                z = true;
            }
            if (z) {
                C10290i g = mo49907g();
                String str = null;
                if (g != null) {
                    cVar = (C24302c) g.mo18341a(C24302c.class);
                } else {
                    cVar = null;
                }
                C24303d.f64458a.mo50053a(this.f27647a, mo49907g(), cVar);
                String str2 = "id";
                if (cVar != null) {
                    obj = cVar.mo50047b();
                } else {
                    obj = null;
                }
                C24230b.m59306a(optJSONObject, str2, obj);
                String str3 = "group_id";
                if (cVar != null) {
                    obj2 = cVar.mo50048c();
                } else {
                    obj2 = null;
                }
                C24230b.m59306a(optJSONObject, str3, obj2);
                String str4 = "log_extra";
                if (cVar != null) {
                    obj3 = cVar.mo50049d();
                } else {
                    obj3 = null;
                }
                C24230b.m59306a(optJSONObject, str4, obj3);
                String str5 = LeakCanaryFileProvider.f132049i;
                if (cVar != null) {
                    obj4 = cVar.mo50050e();
                } else {
                    obj4 = null;
                }
                C24230b.m59306a(optJSONObject, str5, obj4);
                String str6 = "quick_app_url";
                if (cVar != null) {
                    str = cVar.mo50051f();
                }
                C24230b.m59306a(optJSONObject, str6, str);
            }
        }
        if (((C23077b) this.f27647a.mo18401c(C23077b.class)) != null) {
            C23077b.m56617b(mo18743e(), jSONObject);
            aVar.mo49911a((Object) new JSONObject());
            return;
        }
        aVar.mo49910a(-1, "jsdownload manager missing");
    }
}
