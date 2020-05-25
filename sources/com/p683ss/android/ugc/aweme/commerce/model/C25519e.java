package com.p683ss.android.ugc.aweme.commerce.model;

import android.text.TextUtils;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commerce.model.e */
public final class C25519e extends C25517c implements Serializable {
    @C17952c(mo34828a = "promotion_id")

    /* renamed from: a */
    private String f67481a = "";
    @C17952c(mo34828a = "product_id")

    /* renamed from: b */
    private String f67482b = "";
    @C17952c(mo34828a = "title")

    /* renamed from: c */
    private String f67483c = "";
    @C17952c(mo34828a = "elastic_title")

    /* renamed from: d */
    private String f67484d = "";
    @C17952c(mo34828a = "card_url")

    /* renamed from: e */
    private String f67485e = "";
    @C17952c(mo34828a = "price")

    /* renamed from: f */
    private int f67486f;
    @C17952c(mo34828a = "sales")

    /* renamed from: g */
    private int f67487g;
    @C17952c(mo34828a = "promotion_source")

    /* renamed from: h */
    private int f67488h;
    @C17952c(mo34828a = "elastic_images")

    /* renamed from: i */
    private List<? extends UrlModel> f67489i = C52575l.m112097a();
    @C17952c(mo34828a = "label")

    /* renamed from: j */
    private List<String> f67490j = C52575l.m112097a();
    @C17952c(mo34828a = "visitor")

    /* renamed from: k */
    private PromotionVisitor f67491k;
    @C17952c(mo34828a = "jump_to_url")

    /* renamed from: l */
    private boolean f67492l;
    @C17952c(mo34828a = "comment_area")

    /* renamed from: m */
    private String f67493m;
    @C17952c(mo34828a = "meta_param")

    /* renamed from: n */
    private String f67494n;

    public final String getCardUrl() {
        return this.f67485e;
    }

    public final String getCommentArea() {
        return this.f67493m;
    }

    public final List<UrlModel> getElasticImages() {
        return this.f67489i;
    }

    public final String getElasticTitle() {
        return this.f67484d;
    }

    public final boolean getJumpToUrl() {
        return this.f67492l;
    }

    public final List<String> getLabels() {
        return this.f67490j;
    }

    public final String getMetaParam() {
        return this.f67494n;
    }

    public final int getPrice() {
        return this.f67486f;
    }

    public final String getProductId() {
        return this.f67482b;
    }

    public final String getPromotionId() {
        return this.f67481a;
    }

    public final int getPromotionSource() {
        return this.f67488h;
    }

    public final int getSales() {
        return this.f67487g;
    }

    public final String getTitle() {
        return this.f67483c;
    }

    public final PromotionVisitor getVisitor() {
        return this.f67491k;
    }

    public final String getLongTitle() {
        if (!TextUtils.isEmpty(this.f67483c)) {
            return this.f67483c;
        }
        return this.f67484d;
    }

    public final String getShortTitle() {
        if (TextUtils.isEmpty(this.f67484d)) {
            return this.f67483c;
        }
        return this.f67484d;
    }

    public final void setCardUrl(String str) {
        this.f67485e = str;
    }

    public final void setCommentArea(String str) {
        this.f67493m = str;
    }

    public final void setElasticImages(List<? extends UrlModel> list) {
        this.f67489i = list;
    }

    public final void setElasticTitle(String str) {
        this.f67484d = str;
    }

    public final void setJumpToUrl(boolean z) {
        this.f67492l = z;
    }

    public final void setMetaParam(String str) {
        this.f67494n = str;
    }

    public final void setPrice(int i) {
        this.f67486f = i;
    }

    public final void setProductId(String str) {
        this.f67482b = str;
    }

    public final void setPromotionId(String str) {
        this.f67481a = str;
    }

    public final void setPromotionSource(int i) {
        this.f67488h = i;
    }

    public final void setSales(int i) {
        this.f67487g = i;
    }

    public final void setTitle(String str) {
        this.f67483c = str;
    }

    public final void setVisitor(PromotionVisitor promotionVisitor) {
        this.f67491k = promotionVisitor;
    }

    public final void setLabels(List<String> list) {
        C52711k.m112240b(list, "<set-?>");
        this.f67490j = list;
    }
}
