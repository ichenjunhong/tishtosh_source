package com.p683ss.android.ugc.aweme.sdk.wallet.module.withdraw;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53084o;

/* renamed from: com.ss.android.ugc.aweme.sdk.wallet.module.withdraw.AliPayApi */
public interface AliPayApi {
    @C53084o(mo110612a = "wallet/alipay/bind/")
    @C53074e
    C17832m<BaseResponse> checkBindResult(@C53072c(mo110600a = "live_id") int i, @C53072c(mo110600a = "bind_type") int i2, @C53072c(mo110600a = "auth_result") String str);
}
