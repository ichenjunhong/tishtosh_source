package com.bytedance.android.live.wallet.api;

import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.base.model.banner.C2965a;
import com.bytedance.android.live.network.response.C4172a;
import com.bytedance.android.live.network.response.C4175b;
import com.bytedance.android.live.network.response.C4176c;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.wallet.model.C4464c;
import com.bytedance.android.live.wallet.model.C4466e;
import com.bytedance.android.live.wallet.model.C4467f;
import com.bytedance.android.live.wallet.model.C4468g;
import com.bytedance.android.live.wallet.model.C4469h;
import com.bytedance.android.live.wallet.model.CheckOrderOriginalResult;
import com.bytedance.android.live.wallet.model.FirstChargeCheck;
import com.bytedance.android.livesdkapi.depend.model.C8675a;
import com.bytedance.android.livesdkapi.depend.model.C8685b;
import com.bytedance.android.livesdkapi.depend.model.p444c.C8690a;
import com.bytedance.android.livesdkapi.p455i.C8814d;
import com.bytedance.retrofit2.p831b.C12694aa;
import com.bytedance.retrofit2.p831b.C12703e;
import com.bytedance.retrofit2.p831b.C12704f;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12718t;
import com.bytedance.retrofit2.p831b.C12722x;
import com.bytedance.retrofit2.p831b.C12724z;
import java.util.HashMap;
import java.util.Map;
import p064c.p065a.C2201v;

public interface WalletApi {
    @C12718t(mo23886a = "/hotsoon/props/bundles/buy/")
    @C12705g
    C2201v<C4177d<C4466e>> buyPackage(@C12704f HashMap<String, String> hashMap);

    @C12718t(mo23886a = "/hotsoon/ward/buy/")
    @C12705g
    C2201v<C4177d<C4466e>> buyWard(@C12704f HashMap<String, String> hashMap);

    @C12706h(mo23876a = "/hotsoon/diamond/{dealId}/_buy/")
    C2201v<C4177d<C8685b>> createOrder(@C12722x(mo23891a = "dealId") long j, @C12724z(mo23894a = "way") String str, @C12724z(mo23894a = "email") String str2, @C12724z(mo23894a = "pay_currency") String str3, @C12724z(mo23894a = "pay_method") String str4);

    @C12706h(mo23876a = "/hotsoon/diamond/{dealId}/_buy/")
    C2201v<String> createOrderInfo(@C12722x(mo23891a = "dealId") String str, @C12724z(mo23894a = "way") int i, @C12724z(mo23894a = "pay_currency") String str2);

    @C12718t(mo23886a = "/webcast/wallet/recharge/")
    @C12705g
    C2201v<C4177d<Object>> createOrderInfo(@C12703e(mo23873a = "diamond_id") String str, @C12703e(mo23873a = "currency") String str2);

    @C12706h(mo23876a = "/webcast/wallet_api/diamond_buy/")
    C2201v<C4177d<C8690a>> createPreOrder(@C12724z(mo23894a = "diamond_id") long j, @C12724z(mo23894a = "way") int i, @C12724z(mo23894a = "source") int i2, @C12724z(mo23894a = "currency") String str);

    @C12706h(mo23876a = "/webcast/wallet_api/diamond_exchange/")
    C2201v<C4177d<Object>> diamondExchange(@C12724z(mo23894a = "diamond_count") long j);

    @C12706h(mo23876a = "/hotsoon/wallet/payment_channels/")
    C2201v<C4176c<C4464c>> fetchOptionList();

    @C12706h(mo23876a = "/hotsoon/wallet/pay/")
    C2201v<C4177d<Object>> flameChangeDiamond(@C12724z(mo23894a = "diamond_id") String str, @C12724z(mo23894a = "way") String str2);

    @C12706h(mo23876a = "/live/diamond/banner/")
    C2201v<C4176c<C2965a>> getDiamondBannerList();

    @C12706h(mo23876a = "/hotsoon/diamond/?type=1")
    C2201v<C8675a> getDiamondList(@C12724z(mo23894a = "entrance") int i);

    @C12706h(mo23876a = "/hotsoon/diamond/first_charge/")
    C2201v<String> getFirstCharge(@C12724z(mo23894a = "type") int i);

    @C12706h(mo23876a = "https://wallet.snssdk.com/ies/checkout/api/query_recharge_pay_status/")
    C2201v<C4175b<Object, Extra>> getOrderStatus(@C12694aa Map<String, String> map);

    @C12706h(mo23876a = "/webcast/wallet_api/profile/")
    C2201v<C4177d<Object>> getWalletBindInfo();

    @C12706h(mo23876a = "/webcast/wallet/info/")
    C2201v<C4177d<C4469h>> getWalletInfo(@C12724z(mo23894a = "sec_user_id") String str);

    @C12706h(mo23876a = "/webcast/wallet_api/my_wallet/")
    C2201v<C4175b<Object, Extra>> getWalletPageInfo();

    @C12706h(mo23876a = "/webcast/diamond/?type=1")
    C2201v<C8675a> getWebcastDiamondList(@C12724z(mo23894a = "entrance") int i);

    @C12718t(mo23886a = "/hotsoon/wallet/google_pay_verify/")
    @C12705g
    C2201v<C4177d<C8814d>> googlePayVerify(@C12704f HashMap<String, String> hashMap);

    @C12706h(mo23876a = "/webcast/diamond/first_charge/")
    C2201v<C4177d<FirstChargeCheck>> isFirstCharge();

    @C12718t(mo23886a = "/aweme/v1/wallet/googlepay/verify/")
    @C12705g
    C2201v<C4177d<Object>> mtVerify(@C12703e(mo23873a = "order_id") String str, @C12703e(mo23873a = "data") String str2);

    @C12706h(mo23876a = "/webcast/wallet_api/query_order/")
    C2201v<CheckOrderOriginalResult> queryOrder(@C12724z(mo23894a = "order_id") String str);

    @C12706h(mo23876a = "/webcast/wallet_api/i18n_cashier/")
    C2201v<C4172a<C4467f, C4468g>> vigoChargeDeals();

    @C12706h(mo23876a = "/hotsoon/wallet/vigo_recharge/")
    C2201v<C4172a<C4467f, C4468g>> vigoRecharge();
}
