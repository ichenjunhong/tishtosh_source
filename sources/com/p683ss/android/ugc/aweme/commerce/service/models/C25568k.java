package com.p683ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.models.k */
public final class C25568k implements Serializable {
    @C17952c(mo34828a = "title")

    /* renamed from: a */
    private String f67660a = "";
    @C17952c(mo34828a = "card_title")

    /* renamed from: b */
    private String f67661b = "";
    @C17952c(mo34828a = "pre_begin_time")

    /* renamed from: c */
    private long f67662c;
    @C17952c(mo34828a = "begin_time")

    /* renamed from: d */
    private long f67663d;
    @C17952c(mo34828a = "end_time")

    /* renamed from: e */
    private long f67664e;
    @C17952c(mo34828a = "current_time")

    /* renamed from: f */
    private long f67665f;
    @C17952c(mo34828a = "sku_min_price")

    /* renamed from: g */
    private int f67666g;
    @C17952c(mo34828a = "sku_max_price")

    /* renamed from: h */
    private int f67667h;
    @C17952c(mo34828a = "stock")

    /* renamed from: i */
    private int f67668i;
    @C17952c(mo34828a = "left_stock")

    /* renamed from: j */
    private int f67669j;

    public final long getBeginTime() {
        return this.f67663d;
    }

    public final String getCardTitle() {
        return this.f67661b;
    }

    public final long getCurrentTime() {
        return this.f67665f;
    }

    public final long getEndTime() {
        return this.f67664e;
    }

    public final int getLeftStock() {
        return this.f67669j;
    }

    public final long getPreBeginTime() {
        return this.f67662c;
    }

    public final int getSkuMaxPrice() {
        return this.f67667h;
    }

    public final int getSkuMinPrice() {
        return this.f67666g;
    }

    public final int getStock() {
        return this.f67668i;
    }

    public final String getTitle() {
        return this.f67660a;
    }

    public final boolean canBeShow() {
        if (this.f67665f != 0) {
            return true;
        }
        return false;
    }

    public final void setBeginTime(long j) {
        this.f67663d = j;
    }

    public final void setCardTitle(String str) {
        this.f67661b = str;
    }

    public final void setCurrentTime(long j) {
        this.f67665f = j;
    }

    public final void setEndTime(long j) {
        this.f67664e = j;
    }

    public final void setLeftStock(int i) {
        this.f67669j = i;
    }

    public final void setPreBeginTime(long j) {
        this.f67662c = j;
    }

    public final void setSkuMaxPrice(int i) {
        this.f67667h = i;
    }

    public final void setSkuMinPrice(int i) {
        this.f67666g = i;
    }

    public final void setStock(int i) {
        this.f67668i = i;
    }

    public final void setTitle(String str) {
        this.f67660a = str;
    }
}
