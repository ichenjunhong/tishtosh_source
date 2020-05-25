package com.p683ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.models.j */
public final class C25567j implements Serializable {
    @C17952c(mo34828a = "coupon_rule")

    /* renamed from: a */
    private List<String> f67641a;
    @C17952c(mo34828a = "origin_type")

    /* renamed from: b */
    private String f67642b;
    @C17952c(mo34828a = "origin_id")

    /* renamed from: c */
    private String f67643c;
    @C17952c(mo34828a = "im_url")

    /* renamed from: d */
    private String f67644d;
    @C17952c(mo34828a = "cart_url")

    /* renamed from: e */
    private String f67645e;
    @C17952c(mo34828a = "order_url")

    /* renamed from: f */
    private String f67646f;
    @C17952c(mo34828a = "virtual_promotion")

    /* renamed from: g */
    private C25572o f67647g;
    @C17952c(mo34828a = "pre_sale")

    /* renamed from: h */
    private PromotionPreSale f67648h;
    @C17952c(mo34828a = "appointment")

    /* renamed from: i */
    private PromotionAppointment f67649i;
    @C17952c(mo34828a = "title_prefix")

    /* renamed from: j */
    private String f67650j;
    @C17952c(mo34828a = "sku")

    /* renamed from: k */
    private String f67651k;
    @C17952c(mo34828a = "sec_kill_info")

    /* renamed from: l */
    private C25568k f67652l;
    @C17952c(mo34828a = "order_tma_url")

    /* renamed from: m */
    private String f67653m;
    @C17952c(mo34828a = "full_reduction")

    /* renamed from: n */
    private C25571n f67654n;
    @C17952c(mo34828a = "delivery_delay_text")

    /* renamed from: o */
    private String f67655o;
    @C17952c(mo34828a = "need_check")

    /* renamed from: p */
    private Boolean f67656p = Boolean.valueOf(true);
    @C17952c(mo34828a = "already_buy")

    /* renamed from: q */
    private Boolean f67657q = Boolean.valueOf(false);
    @C17952c(mo34828a = "button")

    /* renamed from: r */
    private C25561f f67658r;
    @C17952c(mo34828a = "shop_name")

    /* renamed from: s */
    private String f67659s;

    public final Boolean getAlreadyBuy() {
        return this.f67657q;
    }

    public final PromotionAppointment getAppointment() {
        return this.f67649i;
    }

    public final C25561f getButton() {
        return this.f67658r;
    }

    public final String getCartUrl() {
        return this.f67645e;
    }

    public final List<String> getCouponRule() {
        return this.f67641a;
    }

    public final String getDeliveryDelayText() {
        return this.f67655o;
    }

    public final String getImUrl() {
        return this.f67644d;
    }

    public final Boolean getNeedCheck() {
        return this.f67656p;
    }

    public final String getOrderTmaUrl() {
        return this.f67653m;
    }

    public final String getOrderUrl() {
        return this.f67646f;
    }

    public final String getOriginId() {
        return this.f67643c;
    }

    public final String getOriginType() {
        return this.f67642b;
    }

    public final PromotionPreSale getPreSale() {
        return this.f67648h;
    }

    public final C25571n getReductionInfo() {
        return this.f67654n;
    }

    public final C25568k getSecKillInfo() {
        return this.f67652l;
    }

    public final String getShopName() {
        return this.f67659s;
    }

    public final String getSkuJsonString() {
        return this.f67651k;
    }

    public final String getTitlePrefix() {
        return this.f67650j;
    }

    public final C25572o getVirtualPromotion() {
        return this.f67647g;
    }

    public final void setAlreadyBuy(Boolean bool) {
        this.f67657q = bool;
    }

    public final void setAppointment(PromotionAppointment promotionAppointment) {
        this.f67649i = promotionAppointment;
    }

    public final void setButton(C25561f fVar) {
        this.f67658r = fVar;
    }

    public final void setCartUrl(String str) {
        this.f67645e = str;
    }

    public final void setCouponRule(List<String> list) {
        this.f67641a = list;
    }

    public final void setDeliveryDelayText(String str) {
        this.f67655o = str;
    }

    public final void setImUrl(String str) {
        this.f67644d = str;
    }

    public final void setNeedCheck(Boolean bool) {
        this.f67656p = bool;
    }

    public final void setOrderTmaUrl(String str) {
        this.f67653m = str;
    }

    public final void setOrderUrl(String str) {
        this.f67646f = str;
    }

    public final void setOriginId(String str) {
        this.f67643c = str;
    }

    public final void setOriginType(String str) {
        this.f67642b = str;
    }

    public final void setPreSale(PromotionPreSale promotionPreSale) {
        this.f67648h = promotionPreSale;
    }

    public final void setReductionInfo(C25571n nVar) {
        this.f67654n = nVar;
    }

    public final void setSecKillInfo(C25568k kVar) {
        this.f67652l = kVar;
    }

    public final void setShopName(String str) {
        this.f67659s = str;
    }

    public final void setSkuJsonString(String str) {
        this.f67651k = str;
    }

    public final void setTitlePrefix(String str) {
        this.f67650j = str;
    }

    public final void setVirtualPromotion(C25572o oVar) {
        this.f67647g = oVar;
    }
}
