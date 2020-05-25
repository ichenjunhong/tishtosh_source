package com.p683ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.p1140c.C18845b;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53084o;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.CreateOrderApi */
public final class CreateOrderApi {

    /* renamed from: a */
    public static final CreateOrderApi f69462a = new CreateOrderApi();

    /* renamed from: b */
    private static final RealApi f69463b = ((RealApi) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(C18845b.f52040e).mo19925a().mo19930a(RealApi.class));

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.CreateOrderApi$RealApi */
    interface RealApi {
        @C53084o(mo110612a = "/aweme/v1/dypay/open/order/create/")
        @C53074e
        C17832m<Object> createOrder(@C53072c(mo110600a = "prepay_order_id") String str);
    }

    private CreateOrderApi() {
    }
}
