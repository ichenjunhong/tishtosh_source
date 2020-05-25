package com.p683ss.android.ugc.aweme.sdk.wallet.module.pay;

import com.p683ss.android.ugc.aweme.sdk.IWalletService.C41320a;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.sdk.wallet.module.pay.IPay */
public interface IPay {
    void checkOrderStatus();

    void createOrder();

    boolean pay(JSONObject jSONObject, C41320a aVar) throws Exception;
}
