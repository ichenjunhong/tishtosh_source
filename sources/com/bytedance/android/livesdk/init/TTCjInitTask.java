package com.bytedance.android.livesdk.init;

import android.content.Context;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.p179a.C2941a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.p392l.C7734a;
import com.bytedance.android.livesdkapi.host.IHostApp;
import java.util.Arrays;
import java.util.List;

@C2941a(mo7578a = 5)
public class TTCjInitTask extends C7734a {
    public static final String CJ_PAY_MUSICALLY_REGION_HOST = "tp-pay-mva.byteoversea.com";
    public static final String CJ_PAY_TIKTOK_REGION_HOST = "tp-pay-sg.byteoversea.com";

    public List<Integer> preTasks() {
        return Arrays.asList(new Integer[]{Integer.valueOf(2)});
    }

    private String getCJPayHost() {
        IHostApp iHostApp = (IHostApp) C4116c.m10249a(IHostApp.class);
        if (iHostApp == null) {
            return null;
        }
        if (iHostApp.isInMusicallyRegion()) {
            return CJ_PAY_MUSICALLY_REGION_HOST;
        }
        return CJ_PAY_TIKTOK_REGION_HOST;
    }

    public void run() {
        Context e = C3922z.m9915e();
        if (e != null) {
            IWalletService iWalletService = (IWalletService) C4116c.m10249a(IWalletService.class);
            if (iWalletService != null) {
                iWalletService.setCJStatisticCallback();
                iWalletService.setTTCJPayHost(e, getCJPayHost());
                iWalletService.startCJBackgroundTask(e);
            }
        }
    }
}
