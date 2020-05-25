package com.p683ss.android.ugc.aweme.p1706fe.method.charge;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.sdk.IWalletService.C41320a;
import com.p683ss.android.ugc.aweme.sdk.Wallet.DEFAULT;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.charge.ChargeMethod */
public class ChargeMethod extends BaseCommonJavaMethod {
    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, final C29789a aVar) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("args");
            if (optJSONObject == null) {
                aVar.mo60038a(-1, "args == null");
                return;
            }
            String string = jSONObject.getString("type");
            if (!TextUtils.isEmpty(string)) {
                DEFAULT.provideWalletService_Monster().pay(string, optJSONObject, new C41320a() {
                    public final void onSuccess(JSONObject jSONObject) {
                        aVar.mo60039a((Object) jSONObject);
                    }

                    public final void onFail(Exception exc) {
                        aVar.mo60038a(-1, exc.getMessage());
                    }
                });
            }
        } catch (Exception e) {
            aVar.mo60038a(-1, e.getMessage());
        }
    }
}
