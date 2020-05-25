package com.p683ss.android.ugc.aweme.p1706fe.method;

import android.app.Application;
import android.content.Context;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a;
import com.p683ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import org.json.JSONObject;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.fe.method.GetMicroAppInfoMethod */
public final class GetMicroAppInfoMethod extends BaseCommonJavaMethod {
    public GetMicroAppInfoMethod(C10757a aVar) {
        C52711k.m112240b(aVar, "bridge");
        super(aVar);
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        String str;
        try {
            C36983a b = C36983a.m83185b();
            C52711k.m112236a((Object) b, "MiniAppServiceProxy.inst()");
            IMiniAppService a = b.mo76294a();
            JSONObject jSONObject2 = new JSONObject();
            String str2 = "js_sdk_version";
            if (a != null) {
                Context a2 = C11010c.m22280a();
                if (a2 != null) {
                    str = a.getJsSdkVersion((Application) a2);
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.app.Application");
                }
            } else {
                str = null;
            }
            jSONObject2.put(str2, str);
            aVar.mo60041a(jSONObject2);
        } catch (Exception unused) {
            aVar.mo60038a(-1, "");
        }
    }
}
