package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model;

import android.os.Bundle;
import com.C2240a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage.C42326a;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.ShareCouponContent */
public class ShareCouponContent extends BaseContent {
    @C17952c(mo34828a = "activity_id")
    private String activityId;
    @C17952c(mo34828a = "coupon_desc")
    private String couponDesc;
    @C17952c(mo34828a = "coupon_id")
    private String couponId;
    @C17952c(mo34828a = "merchant_icon_url")
    private UrlModel merchantIconUrl;
    @C17952c(mo34828a = "poi_id")
    private String poiId;
    @C17952c(mo34828a = "poi_name")
    private String poiName;

    public String getActivityId() {
        return this.activityId;
    }

    public String getCouponDesc() {
        return this.couponDesc;
    }

    public String getCouponId() {
        return this.couponId;
    }

    public UrlModel getMerchantIconUrl() {
        return this.merchantIconUrl;
    }

    public String getPoiId() {
        return this.poiId;
    }

    public String getPoiName() {
        return this.poiName;
    }

    public String getMsgHint() {
        return C11010c.m22280a().getResources().getString(R.string.bly, new Object[]{this.poiName});
    }

    public SharePackage generateSharePackage() {
        SharePackage a = new C42326a().mo86236a("coupon").mo86241d(this.couponDesc).mo86238a();
        Bundle bundle = a.f106900i;
        bundle.putSerializable("video_cover", this.merchantIconUrl);
        bundle.putString("share_text", C2240a.m6772a(C11010c.m22280a().getResources().getString(R.string.ajx), new Object[]{this.poiName, this.couponDesc}));
        return a;
    }

    public void setActivityId(String str) {
        this.activityId = str;
    }

    public void setCouponDesc(String str) {
        this.couponDesc = str;
    }

    public void setCouponId(String str) {
        this.couponId = str;
    }

    public void setMerchantIconUrl(UrlModel urlModel) {
        this.merchantIconUrl = urlModel;
    }

    public void setPoiId(String str) {
        this.poiId = str;
    }

    public void setPoiName(String str) {
        this.poiName = str;
    }

    public static ShareCouponContent fromSharePackage(SharePackage sharePackage) {
        ShareCouponContent shareCouponContent = new ShareCouponContent();
        Serializable serializable = sharePackage.f106900i.getSerializable("video_cover");
        String string = sharePackage.f106900i.getString("poi_id");
        String string2 = sharePackage.f106900i.getString("poi_name");
        String string3 = sharePackage.f106900i.getString("activity_id");
        String string4 = sharePackage.f106900i.getString("coupon_desc");
        String string5 = sharePackage.f106900i.getString("coupon_id");
        if (serializable instanceof UrlModel) {
            shareCouponContent.merchantIconUrl = (UrlModel) serializable;
        }
        shareCouponContent.poiId = string;
        shareCouponContent.poiName = string2;
        shareCouponContent.activityId = string3;
        shareCouponContent.couponDesc = string4;
        shareCouponContent.couponId = string5;
        return shareCouponContent;
    }
}
