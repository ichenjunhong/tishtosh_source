package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.app.Activity;
import android.app.Dialog;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.wallet.C4383d;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.IWalletService.C4283a;
import com.bytedance.android.livesdk.browser.jsbridge.p296a.C4766d;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdkapi.p431c.C8609a;
import com.bytedance.ies.p675g.p677b.C10782e;
import com.bytedance.ies.p675g.p677b.C10783f;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ai */
public final class C4829ai extends C10782e<JSONObject, Object> {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public Object invoke(JSONObject jSONObject, C10783f fVar) throws Exception {
        String str;
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (jSONObject2 == null) {
            return null;
        }
        if (fVar.f28972a instanceof C8609a) {
            String optString = jSONObject2.optString("diamond");
            if (!TextUtils.isEmpty(optString)) {
                Bundle bundle = new Bundle();
                bundle.putString(IWalletService.KEY_BUNDLE_REQUEST_PAGE, "h5");
                ((IWalletService) C4116c.m10249a(IWalletService.class)).getConsumeDialog((Activity) fVar.f28972a, bundle, jSONObject2, new C4283a() {
                    /* renamed from: a */
                    public final void mo10028a(Dialog dialog, C4383d dVar) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("status", "success");
                            jSONObject.put("code", "1");
                        } catch (Exception e) {
                            C3831a.m9714b("PackagePurchaseMethod", (Throwable) e);
                        }
                        C4514j.m10883j().mo10322c().mo10498a("H5_payStatus", jSONObject);
                    }
                }, optString).show();
            }
        } else {
            C4766d dVar = new C4766d(jSONObject2, jSONObject2.getString("diamond"));
            String str2 = "";
            try {
                str = Uri.parse(fVar.f28973b).getQueryParameter("event_page");
            } catch (Exception e) {
                C3831a.m9714b("PackagePurchaseMethod", (Throwable) e);
                str = str2;
            }
            dVar.f12974c = str;
            C4495a.m10823a().mo10301a((Object) dVar);
        }
        return null;
    }
}
