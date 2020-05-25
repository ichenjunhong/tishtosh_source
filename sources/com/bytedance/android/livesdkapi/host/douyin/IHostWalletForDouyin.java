package com.bytedance.android.livesdkapi.host.douyin;

import android.content.Context;
import com.bytedance.android.live.base.C2952b;
import com.bytedance.android.livesdkapi.depend.model.C8685b;
import com.bytedance.android.livesdkapi.host.IHostWallet.C8773d;
import com.bytedance.android.livesdkapi.host.p451a.C8790m;
import java.util.Map;

public interface IHostWalletForDouyin extends C2952b, C8790m {
    public static final String SHOW_EXCHANGE_SCORE = "show_exchange_score";
    public static final String VIGO_FIRST_CHARGE_BOTTOM_RIGHT_ENTRANCE = "vigo_first_charge_bottom_right_entrance";
    public static final String VIGO_FIRST_CHARGE_DEAL_CLICK = "vigo_first_charge_deal_click";
    public static final String VIGO_FIRST_CHARGE_NOTICE_DIALOG_ENTRANCE = "vigo_first_charge_notice_dialog_entrance";

    String getCJAppId();

    String getCJMerchantId();

    Map<String, String> getHostWalletSetting();

    void payWithWX(Context context, C8685b bVar, C8773d dVar);
}
