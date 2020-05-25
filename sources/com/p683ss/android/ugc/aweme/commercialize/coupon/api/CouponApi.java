package com.p683ss.android.ugc.aweme.commercialize.coupon.api;

import android.arch.lifecycle.C0198r;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.commercialize.coupon.model.C25688c;
import com.p683ss.android.ugc.aweme.commercialize.coupon.model.C25689d;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.concurrent.ExecutionException;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.api.CouponApi */
public final class CouponApi {

    /* renamed from: a */
    private static C0198r<Boolean> f67910a = new C0198r<>();

    /* renamed from: b */
    private static final IRetrofit f67911b = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b);

    /* renamed from: c */
    private static IRetrofitService f67912c = RetrofitService.createIRetrofitServicebyMonsterPlugin();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.api.CouponApi$RealApi */
    interface RealApi {
        @C53075f(mo110603a = "/aweme/v2/coupon/detail/")
        C17832m<C25688c> getCouponDetail(@C53089t(mo110619a = "coupon_id") int i, @C53089t(mo110619a = "code_id") String str);

        @C53075f(mo110603a = "/aweme/v2/coupon/list/")
        C17832m<C25689d> getCouponList(@C53089t(mo110619a = "page") int i, @C53089t(mo110619a = "count") int i2, @C53089t(mo110619a = "filter_status") int i3);
    }

    /* renamed from: a */
    public static C25688c m62228a(int i, String str) throws Exception {
        try {
            return (C25688c) ((RealApi) f67911b.create(RealApi.class)).getCouponDetail(i, str).get();
        } catch (ExecutionException e) {
            throw f67912c.propagateCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static C25689d m62229a(int i, int i2, int i3) throws Exception {
        try {
            return (C25689d) ((RealApi) f67911b.create(RealApi.class)).getCouponList(i, 10, i3).get();
        } catch (ExecutionException e) {
            throw f67912c.propagateCompatibleException(e);
        }
    }
}
