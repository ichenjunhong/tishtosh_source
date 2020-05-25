package com.p683ss.android.ugc.aweme.bullet.bridge.common;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10268e.C10269a;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.C23291au;
import com.p683ss.android.ugc.aweme.C23857bl;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.OpenPhoneAreaMethod */
public final class OpenPhoneAreaMethod extends BaseBridgeMethod {

    /* renamed from: b */
    private final String f64096b = "choosePhoneArea";

    /* renamed from: c */
    private C10269a f64097c = C10269a.PRIVATE;

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.OpenPhoneAreaMethod$a */
    public static final class C24165a implements C23857bl {

        /* renamed from: a */
        final /* synthetic */ C24112a f64098a;

        C24165a(C24112a aVar) {
            this.f64098a = aVar;
        }

        public final void onChanged(String str, String str2) {
            C52711k.m112240b(str, "phoneCode");
            C52711k.m112240b(str2, "shortCountryName");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("phoneCode", str);
            jSONObject.put("shortCountryName", str2);
            jSONObject.put("code", 1);
            C24112a aVar = this.f64098a;
            if (aVar != null) {
                aVar.mo49913a(jSONObject);
            }
        }
    }

    /* renamed from: b */
    public final C10269a mo18297b() {
        return this.f64097c;
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64096b;
    }

    /* renamed from: a */
    public final void mo18296a(C10269a aVar) {
        C52711k.m112240b(aVar, "<set-?>");
        this.f64097c = aVar;
    }

    public OpenPhoneAreaMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        C23857bl aVar2 = new C24165a(aVar);
        C23291au b = C20854a.m53162b();
        Context e = mo18743e();
        if (!(e instanceof Activity)) {
            e = null;
        }
        b.openCountryListActivity((Activity) e, aVar2);
    }
}
