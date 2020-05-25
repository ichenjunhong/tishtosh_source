package com.p683ss.android.ugc.aweme.sdk.iap.api;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.sdk.iap.model.response.C41374a;
import com.p683ss.android.ugc.aweme.sdk.iap.model.response.DiamondOrderResponse;
import com.p683ss.android.ugc.aweme.sdk.iap.model.response.PayOrderResultResponse;
import com.p683ss.android.ugc.aweme.sdk.iap.model.response.TokenResponse;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53084o;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.sdk.iap.api.IapApi */
public interface IapApi {
    @C53075f(mo110603a = "/aweme/v1/wallet/order/result/")
    C17832m<PayOrderResultResponse> checkOrderResult(@C53089t(mo110619a = "order_id") String str);

    @C53084o(mo110612a = "/aweme/v1/wallet/diamond/buy/")
    @C53074e
    C17832m<DiamondOrderResponse> createOrder(@C53072c(mo110600a = "pay_channel") int i, @C53072c(mo110600a = "diamond_id") int i2);

    @C53084o(mo110612a = "/passport/auth/get_token/")
    C17832m<TokenResponse> getToken();

    @C53075f(mo110603a = "/aweme/v1/wallet/mywallet/")
    C17832m<C41374a> queryMyWallet(@C53089t(mo110619a = "diamond_type") int i);

    @C53084o(mo110612a = "/aweme/v1/wallet/googlepay/verify/")
    @C53074e
    C17832m<BaseResponse> verifyOrder(@C53072c(mo110600a = "order_id") String str, @C53072c(mo110600a = "data") String str2);
}
