package com.p683ss.android.ugc.aweme.commercialize.api;

import com.google.gson.p1076a.C17952c;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.base.api.C23453a;
import com.p683ss.android.ugc.aweme.base.api.C23460b;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.io.Serializable;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.commercialize.api.CouponRedeemApi */
public class CouponRedeemApi {

    /* renamed from: a */
    private static RetroApi f67862a;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.api.CouponRedeemApi$RetroApi */
    public interface RetroApi {
        @C53075f(mo110603a = "/aweme/v2/coupon/qrcode/detail/")
        C17832m<C25639b> getCouponDetail(@C53089t(mo110619a = "code_id") String str, @C53089t(mo110619a = "source") int i);

        @C53075f(mo110603a = "/aweme/v2/coupon/validate/")
        C17832m<C25640c> redeemCoupon(@C53089t(mo110619a = "code_id") String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.api.CouponRedeemApi$a */
    public static class C25638a extends C23453a implements Serializable {
        @C23460b
        @C17952c(mo34828a = "user_avatar")
        public UrlModel avatar;
        @C17952c(mo34828a = "coupon_type")
        public int couponType;
        @C23460b
        @C17952c(mo34828a = "head_image_url")
        public UrlModel headImage;
        @C23460b
        @C17952c(mo34828a = "merchant_name")
        public String merchantName;
        @C23460b
        @C17952c(mo34828a = "title")
        public String title;
        @C23460b
        @C17952c(mo34828a = "username")
        public String username;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.api.CouponRedeemApi$b */
    public static class C25639b implements Serializable {
        @C17952c(mo34828a = "coupon")
        public C25638a coupon;
        @C17952c(mo34828a = "status_code")
        public int statusCode;
        @C17952c(mo34828a = "status_msg")
        public String statusMsg;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.api.CouponRedeemApi$c */
    public static class C25640c implements Serializable {
        @C17952c(mo34828a = "status_code")
        public int statusCode;
        @C17952c(mo34828a = "status_msg")
        public String statusMsg;
    }

    /* renamed from: a */
    public static RetroApi m62163a() {
        if (f67862a == null) {
            synchronized (CouponRedeemApi.class) {
                if (f67862a == null) {
                    f67862a = (RetroApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(RetroApi.class);
                }
            }
        }
        return f67862a;
    }

    /* renamed from: a */
    public static C17832m<C25640c> m62162a(String str) {
        return m62163a().redeemCoupon(str);
    }
}
