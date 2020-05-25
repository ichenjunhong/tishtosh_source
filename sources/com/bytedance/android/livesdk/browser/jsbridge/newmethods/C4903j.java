package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdkapi.depend.model.ChargeDeal;
import com.bytedance.ies.p675g.p677b.C10779d;
import com.bytedance.ies.p675g.p677b.C10783f;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.j */
public final class C4903j extends C10779d<JSONObject, Object> {

    /* renamed from: a */
    private Dialog f13187a;

    public final void onTerminate() {
        if (this.f13187a != null && this.f13187a.isShowing()) {
            this.f13187a.dismiss();
        }
    }

    public final /* synthetic */ void invoke(Object obj, C10783f fVar) throws Exception {
        JSONObject jSONObject = (JSONObject) obj;
        JSONObject optJSONObject = jSONObject.optJSONObject("args");
        if (TextUtils.equals(jSONObject.optString("type"), "recharge")) {
            String str = "";
            String str2 = "";
            ChargeDeal chargeDeal = new ChargeDeal();
            Bundle bundle = new Bundle();
            if (optJSONObject != null) {
                bundle.putString(IWalletService.KEY_BUNDLE_CHARGE_REASON, str);
                bundle.putString(IWalletService.KEY_BUNDLE_REQUEST_PAGE, str2);
                chargeDeal.f23691e = optJSONObject.optInt("diamond_count");
                chargeDeal.f23688b = optJSONObject.optInt("exchange_price");
                chargeDeal.f23689c = optJSONObject.optInt("price");
                chargeDeal.f23687a = (long) optJSONObject.optInt("id");
                chargeDeal.f23692f = optJSONObject.optInt("giving_count");
            }
            this.f13187a = ((IWalletService) C4116c.m10249a(IWalletService.class)).getPayDialog(fVar.f28972a, 0, bundle, chargeDeal);
            this.f13187a.show();
        }
        finishWithSuccess();
    }
}
