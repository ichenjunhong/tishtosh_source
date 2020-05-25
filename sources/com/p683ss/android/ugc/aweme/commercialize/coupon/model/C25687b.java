package com.p683ss.android.ugc.aweme.commercialize.coupon.model;

import android.text.TextUtils;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.model.b */
public final class C25687b extends BaseResponse implements Serializable {
    @C17952c(mo34828a = "store_page_link")

    /* renamed from: A */
    private String f67926A;
    @C17952c(mo34828a = "codabar_image_url")

    /* renamed from: B */
    private String f67927B;
    @C17952c(mo34828a = "pay_type")

    /* renamed from: C */
    private int f67928C;
    @C17952c(mo34828a = "desc")

    /* renamed from: D */
    private String f67929D;
    @C17952c(mo34828a = "coupon_id")

    /* renamed from: a */
    private int f67930a;
    @C17952c(mo34828a = "merchant_name")

    /* renamed from: b */
    private String f67931b;
    @C17952c(mo34828a = "title")

    /* renamed from: c */
    private String f67932c;
    @C17952c(mo34828a = "can_rate")
    public int canRate;
    @C17952c(mo34828a = "condition")

    /* renamed from: d */
    private String f67933d;
    @C17952c(mo34828a = "valid_start")

    /* renamed from: e */
    private String f67934e;
    @C17952c(mo34828a = "valid_end")

    /* renamed from: f */
    private String f67935f;
    @C17952c(mo34828a = "code")

    /* renamed from: g */
    private String f67936g;
    @C17952c(mo34828a = "code_id")

    /* renamed from: h */
    private String f67937h;
    @C17952c(mo34828a = "hint_text")
    public String hintText;
    @C17952c(mo34828a = "logo_image_url")

    /* renamed from: i */
    private UrlModel f67938i;
    @C17952c(mo34828a = "head_image_url")

    /* renamed from: j */
    private UrlModel f67939j;
    @C17952c(mo34828a = "status")

    /* renamed from: k */
    private int f67940k;
    @C17952c(mo34828a = "notification")

    /* renamed from: l */
    private String f67941l;
    @C17952c(mo34828a = "create_time")

    /* renamed from: m */
    private String f67942m;
    @C17952c(mo34828a = "user_id")

    /* renamed from: n */
    private Long f67943n;
    @C17952c(mo34828a = "sec_uid")

    /* renamed from: o */
    private String f67944o;
    @C17952c(mo34828a = "object_type")
    public int objectType;
    @C17952c(mo34828a = "group")

    /* renamed from: p */
    private String f67945p;
    @C17952c(mo34828a = "service_tel")

    /* renamed from: q */
    private String f67946q;
    @C17952c(mo34828a = "poi_list")

    /* renamed from: r */
    private List<String> f67947r;
    @C17952c(mo34828a = "detail_url")

    /* renamed from: s */
    private String f67948s;
    @C17952c(mo34828a = "activity_id")

    /* renamed from: t */
    private int f67949t;
    @C17952c(mo34828a = "abbr_condition")

    /* renamed from: u */
    private String f67950u;
    @C17952c(mo34828a = "qrcode_url")

    /* renamed from: v */
    private UrlModel f67951v;
    @C17952c(mo34828a = "valid_date_text")
    public String validDateText;
    @C17952c(mo34828a = "valid_poi_id")
    public String validPoiId;
    @C17952c(mo34828a = "valid_poi_name")
    public String validPoiName;
    @C17952c(mo34828a = "is_default_head_image")

    /* renamed from: w */
    private boolean f67952w;
    @C17952c(mo34828a = "coupon_type")

    /* renamed from: x */
    private int f67953x;
    @C17952c(mo34828a = "coupon_source")

    /* renamed from: y */
    private int f67954y;
    @C17952c(mo34828a = "use_page_link")

    /* renamed from: z */
    private String f67955z;

    public final String getAbbrCondition() {
        return this.f67950u;
    }

    public final int getActivityId() {
        return this.f67949t;
    }

    public final String getCodabarImageUrl() {
        return this.f67927B;
    }

    public final String getCode() {
        return this.f67936g;
    }

    public final String getCodeId() {
        return this.f67937h;
    }

    public final String getCondition() {
        return this.f67933d;
    }

    public final int getCouponId() {
        return this.f67930a;
    }

    public final int getCouponSource() {
        return this.f67954y;
    }

    public final int getCouponType() {
        return this.f67953x;
    }

    public final String getCreateTime() {
        return this.f67942m;
    }

    public final String getDesc() {
        return this.f67929D;
    }

    public final String getDetailUrl() {
        return this.f67948s;
    }

    public final String getGroup() {
        return this.f67945p;
    }

    public final UrlModel getHeadImageUrl() {
        return this.f67939j;
    }

    public final UrlModel getLogoImageUrl() {
        return this.f67938i;
    }

    public final String getMerchantName() {
        return this.f67931b;
    }

    public final String getNotification() {
        return this.f67941l;
    }

    public final int getPayType() {
        return this.f67928C;
    }

    public final List<String> getPoiList() {
        return this.f67947r;
    }

    public final UrlModel getQrCodeUrl() {
        return this.f67951v;
    }

    public final String getSecUid() {
        return this.f67944o;
    }

    public final String getServiceTel() {
        return this.f67946q;
    }

    public final int getStatus() {
        return this.f67940k;
    }

    public final String getStorePageLink() {
        return this.f67926A;
    }

    public final String getTitle() {
        return this.f67932c;
    }

    public final String getUsePageLink() {
        return this.f67955z;
    }

    public final Long getUserId() {
        return this.f67943n;
    }

    public final String getValidEnd() {
        return this.f67935f;
    }

    public final String getValidStart() {
        return this.f67934e;
    }

    public final boolean isDefaultHeadImage() {
        return this.f67952w;
    }

    public final boolean canCouponRate() {
        if (this.canRate != 1 || TextUtils.isEmpty(this.validPoiId) || TextUtils.isEmpty(this.validPoiName)) {
            return false;
        }
        return true;
    }

    public final void setAbbrCondition(String str) {
        this.f67950u = str;
    }

    public final void setActivityId(int i) {
        this.f67949t = i;
    }

    public final void setCodabarImageUrl(String str) {
        this.f67927B = str;
    }

    public final void setCode(String str) {
        this.f67936g = str;
    }

    public final void setCodeId(String str) {
        this.f67937h = str;
    }

    public final void setCondition(String str) {
        this.f67933d = str;
    }

    public final void setCouponId(int i) {
        this.f67930a = i;
    }

    public final void setCouponSource(int i) {
        this.f67954y = i;
    }

    public final void setCouponType(int i) {
        this.f67953x = i;
    }

    public final void setCreateTime(String str) {
        this.f67942m = str;
    }

    public final void setDefaultHeadImage(boolean z) {
        this.f67952w = z;
    }

    public final void setDetailUrl(String str) {
        this.f67948s = str;
    }

    public final void setGroup(String str) {
        this.f67945p = str;
    }

    public final void setHeadImageUrl(UrlModel urlModel) {
        this.f67939j = urlModel;
    }

    public final void setLogoImageUrl(UrlModel urlModel) {
        this.f67938i = urlModel;
    }

    public final void setMerchantName(String str) {
        this.f67931b = str;
    }

    public final void setNotification(String str) {
        this.f67941l = str;
    }

    public final void setPoiList(List<String> list) {
        this.f67947r = list;
    }

    public final void setQrCodeUrl(UrlModel urlModel) {
        this.f67951v = urlModel;
    }

    public final void setSecUid(String str) {
        this.f67944o = str;
    }

    public final void setServiceTel(String str) {
        this.f67946q = str;
    }

    public final void setStatus(int i) {
        this.f67940k = i;
    }

    public final void setStorePageLink(String str) {
        this.f67926A = str;
    }

    public final void setTitle(String str) {
        this.f67932c = str;
    }

    public final void setUsePageLink(String str) {
        this.f67955z = str;
    }

    public final void setUserId(Long l) {
        this.f67943n = l;
    }

    public final void setValidEnd(String str) {
        this.f67935f = str;
    }

    public final void setValidStart(String str) {
        this.f67934e = str;
    }
}
