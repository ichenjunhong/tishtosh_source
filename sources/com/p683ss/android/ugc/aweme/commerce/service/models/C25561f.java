package com.p683ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.models.f */
public final class C25561f implements Serializable {
    @C17952c(mo34828a = "text")

    /* renamed from: a */
    private List<String> f67590a = C52575l.m112097a();
    @C17952c(mo34828a = "small_app_url")

    /* renamed from: b */
    private String f67591b;
    @C17952c(mo34828a = "h5_url")

    /* renamed from: c */
    private String f67592c;
    @C17952c(mo34828a = "order_status")

    /* renamed from: d */
    private int f67593d = C25562a.UN_BUY.getStatus();
    @C17952c(mo34828a = "sku_confirm_text")

    /* renamed from: e */
    private List<String> f67594e = C52575l.m112097a();

    /* renamed from: com.ss.android.ugc.aweme.commerce.service.models.f$a */
    public enum C25562a {
        UN_BUY(1),
        UN_PAY(2),
        CAN_EXPERIENCE(3),
        CAN_NOT_EXPERIENCE(4);
        

        /* renamed from: b */
        private final int f67596b;

        public final int getStatus() {
            return this.f67596b;
        }

        private C25562a(int i) {
            this.f67596b = i;
        }
    }

    public final String getH5Url() {
        return this.f67592c;
    }

    public final int getOrderStatus() {
        return this.f67593d;
    }

    public final List<String> getSkuConfirmText() {
        return this.f67594e;
    }

    public final String getSmallAppUrl() {
        return this.f67591b;
    }

    public final List<String> getTextList() {
        return this.f67590a;
    }

    public final void setH5Url(String str) {
        this.f67592c = str;
    }

    public final void setOrderStatus(int i) {
        this.f67593d = i;
    }

    public final void setSmallAppUrl(String str) {
        this.f67591b = str;
    }

    public final void setSkuConfirmText(List<String> list) {
        C52711k.m112240b(list, "<set-?>");
        this.f67594e = list;
    }

    public final void setTextList(List<String> list) {
        C52711k.m112240b(list, "<set-?>");
        this.f67590a = list;
    }
}
