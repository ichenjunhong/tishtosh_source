package com.bytedance.android.livesdkapi.host;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.livesdkapi.depend.model.C8685b;
import com.bytedance.android.livesdkapi.depend.model.ChargeDeal.HsSkuDetail;
import com.bytedance.android.livesdkapi.host.p451a.C8790m;
import com.bytedance.android.livesdkapi.p455i.C8825n;
import java.util.List;
import java.util.Map;

public interface IHostWallet extends C8790m {
    public static final String SHOW_EXCHANGE_SCORE = "show_exchange_score";
    public static final String VIGO_FIRST_CHARGE_BOTTOM_RIGHT_ENTRANCE = "vigo_first_charge_bottom_right_entrance";
    public static final String VIGO_FIRST_CHARGE_DEAL_CLICK = "vigo_first_charge_deal_click";
    public static final String VIGO_FIRST_CHARGE_NOTICE_DIALOG_ENTRANCE = "vigo_first_charge_notice_dialog_entrance";

    /* renamed from: com.bytedance.android.livesdkapi.host.IHostWallet$a */
    public interface C8770a {
        /* renamed from: a */
        int mo15484a(Activity activity, String str);

        /* renamed from: a */
        C8774e mo15485a();
    }

    /* renamed from: com.bytedance.android.livesdkapi.host.IHostWallet$b */
    public interface C8771b {
        /* renamed from: a */
        void mo10107a(int i, String str);
    }

    /* renamed from: com.bytedance.android.livesdkapi.host.IHostWallet$c */
    public interface C8772c {
    }

    /* renamed from: com.bytedance.android.livesdkapi.host.IHostWallet$d */
    public interface C8773d {
    }

    /* renamed from: com.bytedance.android.livesdkapi.host.IHostWallet$e */
    public interface C8774e {
        /* renamed from: a */
        int mo15486a();

        /* renamed from: b */
        List<C8825n> mo15487b();
    }

    /* renamed from: com.bytedance.android.livesdkapi.host.IHostWallet$f */
    public interface C8775f {
    }

    /* renamed from: com.bytedance.android.livesdkapi.host.IHostWallet$g */
    public interface C8776g {
        /* renamed from: a */
        void mo10119a(int i, List<HsSkuDetail> list);
    }

    C8770a getBillingClient(C8775f fVar);

    String getCJAppId();

    String getCJMerchantId();

    Map<String, String> getHostWalletSetting();

    void openBillingProxyActivity(Context context, Bundle bundle);

    void payWithAli(Activity activity, C8685b bVar, C8773d dVar);

    void payWithWX(Context context, C8685b bVar, C8773d dVar);

    void verifyWithAli(Activity activity, String str, C8772c cVar);
}
