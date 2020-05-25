package com.p683ss.android.ugc.aweme.feed.api;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import p064c.p065a.C2201v;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53084o;

/* renamed from: com.ss.android.ugc.aweme.feed.api.CancelVideoMaskApi */
public final class CancelVideoMaskApi {

    /* renamed from: a */
    public static final RealApi f78668a = ((RealApi) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(C18845b.f52040e).mo19925a().mo19930a(RealApi.class));

    /* renamed from: b */
    public static final CancelVideoMaskApi f78669b = new CancelVideoMaskApi();

    /* renamed from: com.ss.android.ugc.aweme.feed.api.CancelVideoMaskApi$RealApi */
    public interface RealApi {
        @C53084o(mo110612a = "/aweme/v1/mask/cancel/")
        @C53074e
        C2201v<BaseResponse> cancelVideoMask(@C53072c(mo110600a = "aweme_id") String str, @C53072c(mo110600a = "mask_type") Integer num, @C53072c(mo110600a = "status") Integer num2);
    }

    private CancelVideoMaskApi() {
    }
}
