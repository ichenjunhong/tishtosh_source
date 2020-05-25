package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.ies.p675g.p677b.C10782e;
import com.bytedance.ies.p675g.p677b.C10783f;
import com.google.gson.p1076a.C17952c;

public class SendRedEnvelopSuccessMethod extends C10782e<Params, Object> {
    private static final String TAG = "SendRedEnvelopSuccessMe";

    static final class Params {
        @C17952c(mo34828a = "delay_time")
        String delayTime;
        @C17952c(mo34828a = "envelope_diamond")
        String envelopeDiamond;
        @C17952c(mo34828a = "envelope_id")
        String envelopeId;
        @C17952c(mo34828a = "envelope_type")
        String envelopeType;
        @C17952c(mo34828a = "left_diamond")
        String leftDiamond;

        Params() {
        }
    }

    public Object invoke(Params params, C10783f fVar) throws Exception {
        try {
            ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10091a((long) Integer.parseInt(params.leftDiamond));
        } catch (Exception e) {
            C3831a.m9714b(TAG, (Throwable) e);
        }
        TTLiveSDKContext.getHostService().mo10315h().mo14527a(true);
        return null;
    }
}
