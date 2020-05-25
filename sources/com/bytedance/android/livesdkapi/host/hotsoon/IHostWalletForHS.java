package com.bytedance.android.livesdkapi.host.hotsoon;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.live.base.C2952b;
import com.bytedance.android.livesdkapi.depend.model.C8685b;
import com.bytedance.android.livesdkapi.host.IHostWallet.C8770a;
import com.bytedance.android.livesdkapi.host.IHostWallet.C8772c;
import com.bytedance.android.livesdkapi.host.IHostWallet.C8773d;
import com.bytedance.android.livesdkapi.host.IHostWallet.C8775f;
import com.bytedance.android.livesdkapi.host.p451a.C8790m;
import java.util.Map;

public interface IHostWalletForHS extends C2952b, C8790m {
    C8770a getBillingClient(C8775f fVar);

    String getCJAppId();

    String getCJMerchantId();

    Map<String, String> getHostWalletSetting();

    void openBillingProxyActivity(Context context, Bundle bundle);

    void payWithAli(Activity activity, C8685b bVar, C8773d dVar);

    void payWithWX(Context context, C8685b bVar, C8773d dVar);

    void verifyWithAli(Activity activity, String str, C8772c cVar);
}
