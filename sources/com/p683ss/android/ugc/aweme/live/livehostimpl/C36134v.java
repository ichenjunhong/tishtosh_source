package com.p683ss.android.ugc.aweme.live.livehostimpl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.model.C8685b;
import com.bytedance.android.livesdkapi.host.IHostWallet;
import com.bytedance.android.livesdkapi.host.IHostWallet.C8770a;
import com.bytedance.android.livesdkapi.host.IHostWallet.C8772c;
import com.bytedance.android.livesdkapi.host.IHostWallet.C8773d;
import com.bytedance.android.livesdkapi.host.IHostWallet.C8775f;
import com.bytedance.p753k.C12103a;
import com.p683ss.android.ugc.aweme.live.C36093g;
import com.p683ss.android.ugc.aweme.sdk.IWalletService.C41320a;
import com.p683ss.android.ugc.aweme.sdk.Wallet.DEFAULT;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.v */
public final class C36134v implements IHostWallet {
    public final C8770a getBillingClient(C8775f fVar) {
        return null;
    }

    public final String getCJAppId() {
        return null;
    }

    public final String getCJMerchantId() {
        return null;
    }

    public final Map<String, String> getHostWalletSetting() {
        return null;
    }

    public final void payWithAli(Activity activity, C8685b bVar, C8773d dVar) {
    }

    public final void verifyWithAli(Activity activity, String str, C8772c cVar) {
    }

    public final void openBillingProxyActivity(Context context, Bundle bundle) {
        Intent a = ((C36093g) C12103a.m24530b(C36093g.class)).mo74843a(context);
        a.putExtras(bundle);
        context.startActivity(a);
    }

    public final void payWithWX(Context context, C8685b bVar, final C8773d dVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_id", bVar.f23726i);
            jSONObject.put("prepay_id", bVar.f23728k);
            jSONObject.put("timestamp", bVar.f23730m);
            jSONObject.put("nonce_str", bVar.f23729l);
            jSONObject.put("order_id", bVar.f23718a);
            jSONObject.put("partner_id", bVar.f23727j);
            jSONObject.put("sign", bVar.f23731n);
            C361351 r4 = new C41320a() {
                public final void onFail(Exception exc) {
                }

                public final void onSuccess(JSONObject jSONObject) {
                    int i;
                    JSONObject optJSONObject = jSONObject.optJSONObject("args");
                    String str = "";
                    if (optJSONObject != null) {
                        optJSONObject.optString("order_id");
                        str = optJSONObject.optString("message");
                        i = optJSONObject.optInt("code");
                    } else {
                        i = 0;
                    }
                    if (i != 1) {
                        TextUtils.equals("支付取消", str);
                    }
                }
            };
            if (!DEFAULT.provideWalletService_Monster().pay("weixin", jSONObject, r4)) {
                r4.onFail(new RuntimeException("吊起微信失败"));
            }
        } catch (Exception unused) {
        }
    }
}
