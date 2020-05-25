package com.bytedance.android.live.wallet.p262e;

import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.network.C4157e;
import com.bytedance.android.live.wallet.api.C4296b;
import com.bytedance.android.live.wallet.api.WalletApi;
import com.bytedance.android.livesdkapi.depend.model.C8685b;
import com.bytedance.android.livesdkapi.host.C8807k;
import org.json.JSONObject;
import p064c.p065a.C1673aa;
import p064c.p065a.C2201v;
import p064c.p065a.p071d.C1711f;

/* renamed from: com.bytedance.android.live.wallet.e.b */
public final class C4407b implements C4296b {
    /* renamed from: a */
    public final C2201v<C8685b> mo10070a(long j, final C8807k kVar, String str) {
        int i = 1;
        switch (kVar) {
            case ALIPAY:
                i = 0;
                break;
            case GOOGLE:
                i = 10;
                break;
            case TEST:
                i = -1;
                break;
        }
        return ((WalletApi) C4157e.m10322a().mo9550a(WalletApi.class)).createOrderInfo(String.valueOf(j), i, str).mo6541d((C1711f<? super T, ? extends R>) new C1711f<String, C8685b>() {
            public final /* synthetic */ Object apply(Object obj) throws Exception {
                JSONObject jSONObject = new JSONObject((String) obj).getJSONObject("data");
                C8685b bVar = new C8685b();
                bVar.f23725h = jSONObject.optString("order_info", "");
                bVar.f23726i = jSONObject.optString("app_id", "");
                bVar.f23729l = jSONObject.optString("nonce_str", "");
                bVar.f23727j = jSONObject.optString("partner_id", "");
                bVar.f23728k = jSONObject.optString("prepay_id", "");
                bVar.f23731n = jSONObject.optString("sign", "");
                bVar.f23730m = jSONObject.optString("timestamp", "");
                bVar.f23718a = jSONObject.optString("order_id", "");
                bVar.f23723f = jSONObject.optBoolean("result", false);
                bVar.f23720c = kVar;
                return bVar;
            }
        }).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a());
    }
}
