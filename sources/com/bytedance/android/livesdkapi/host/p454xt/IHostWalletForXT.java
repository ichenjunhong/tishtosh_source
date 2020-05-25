package com.bytedance.android.livesdkapi.host.p454xt;

import android.app.Activity;
import android.content.Context;
import com.bytedance.android.live.base.C2952b;
import com.bytedance.android.livesdkapi.depend.model.C8685b;
import com.bytedance.android.livesdkapi.host.IHostWallet.C8773d;
import com.bytedance.android.livesdkapi.host.p451a.C8790m;

/* renamed from: com.bytedance.android.livesdkapi.host.xt.IHostWalletForXT */
public interface IHostWalletForXT extends C2952b, C8790m {
    String getCJAppId();

    String getCJMerchantId();

    void payWithAli(Activity activity, C8685b bVar, C8773d dVar);

    void payWithWX(Context context, C8685b bVar, C8773d dVar);
}
