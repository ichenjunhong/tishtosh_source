package com.p683ss.android.ugc.aweme.bullet.bridge.common;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.qrcode.QRCodePermissionActivity;
import org.json.JSONObject;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.OpenScanMethod */
public final class OpenScanMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24168a f64106b = new C24168a(null);

    /* renamed from: c */
    private final String f64107c = "scan";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.OpenScanMethod$a */
    public static final class C24168a {
        private C24168a() {
        }

        public /* synthetic */ C24168a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64107c;
    }

    public OpenScanMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        JSONObject jSONObject2;
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        C26890h.m65011a("qr_code_scan_enter", C23089d.m56640a().mo47829a("enter_from", "h5").f61491a);
        if (jSONObject.has("args")) {
            jSONObject2 = jSONObject.getJSONObject("args");
        } else {
            jSONObject2 = null;
        }
        int i = -1;
        if (jSONObject2 != null && jSONObject2.has("feature") && TextUtils.equals("company_coupon", jSONObject2.optString("feature"))) {
            i = 3;
        }
        QRCodePermissionActivity.m90502a(mo18743e(), false, i);
        if (jSONObject2 != null && jSONObject2.has("should_close_self") && jSONObject2.getBoolean("should_close_self") && (mo18743e() instanceof Activity)) {
            Context e = mo18743e();
            if (e != null) {
                ((Activity) e).finish();
            } else {
                throw new C52857u("null cannot be cast to non-null type android.app.Activity");
            }
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("code", 1);
        aVar.mo49913a(jSONObject3);
    }
}
