package com.p683ss.android.ugc.aweme.sdk.wallet.jsbridge;

import android.text.TextUtils;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p676a.C10766h;
import com.p683ss.android.ugc.aweme.sdk.IWalletService;
import com.p683ss.android.ugc.aweme.sdk.IWalletService.C41320a;
import com.p683ss.android.ugc.aweme.sdk.Wallet.DEFAULT;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.sdk.wallet.jsbridge.ChargeJavaMethod */
public class ChargeJavaMethod implements C10762d {
    public C10757a jsBridge;

    public ChargeJavaMethod(C10757a aVar) {
        this.jsBridge = aVar;
    }

    public void call(C10766h hVar, JSONObject jSONObject) {
        try {
            String string = hVar.f28947d.getString("type");
            if (!TextUtils.isEmpty(string)) {
                IWalletService provideWalletService_Monster = DEFAULT.provideWalletService_Monster();
                JSONObject optJSONObject = hVar.f28947d.optJSONObject("args");
                if (optJSONObject != null) {
                    provideWalletService_Monster.pay(string, optJSONObject, new C41320a() {
                        public void onFail(Exception exc) {
                        }

                        public void onSuccess(JSONObject jSONObject) {
                            ChargeJavaMethod.this.jsBridge.mo19458b("H5_chargeStatus", jSONObject);
                        }
                    });
                }
                jSONObject.put("code", 1);
            }
        } catch (Exception unused) {
            try {
                jSONObject.put("code", 0);
            } catch (JSONException unused2) {
            }
        }
    }
}
