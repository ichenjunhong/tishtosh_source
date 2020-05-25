package com.p683ss.android.ugc.aweme.poi.model;

import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.model.ai */
public final class C39103ai implements Serializable {
    @C17952c(mo34828a = "contact_phone_no")
    public String contactNo;
    @C17952c(mo34828a = "hotel_detail_entry")
    public boolean hotelDetailEntry;
    @C17952c(mo34828a = "hotel_feature")
    public List<Object> hotelFeatures;
    @C17952c(mo34828a = "poi_customer_entry")
    public C39112ar moreStruct;
    @C17952c(mo34828a = "products")
    public List<C39102ah> products;
    @C17952c(mo34828a = "display_style")
    public int style;
    @C17952c(mo34828a = "supplier_id")
    public String supplierId;
    @C17952c(mo34828a = "sp_source")
    public String supplierSource;
    @C17952c(mo34828a = "title")
    public String title;
    @C17952c(mo34828a = "url")
    public String url;
    @C17952c(mo34828a = "url_title")
    public String urlTitle;

    public final boolean isDcd() {
        if (this.style == 1) {
            return true;
        }
        return false;
    }

    public final String getMoreTitle() {
        if (isMoreTitleEmpty()) {
            return "";
        }
        return this.moreStruct.getTitle();
    }

    public final String getMoreUrl() {
        if (isMoreUrlEmpty()) {
            return "";
        }
        return this.moreStruct.getUrl();
    }

    public final boolean isSPU() {
        if (this.style == 3) {
            return true;
        }
        return false;
    }

    public final boolean isValidStyle() {
        if (this.style == 1 || this.style == 2) {
            return true;
        }
        return false;
    }

    public final int getSize() {
        if (C9376b.m18558a((Collection<T>) this.products)) {
            return 0;
        }
        return this.products.size();
    }

    public final boolean isMoreTitleEmpty() {
        if (this.moreStruct == null || TextUtils.isEmpty(this.moreStruct.getTitle())) {
            return true;
        }
        return false;
    }

    public final boolean isMoreUrlEmpty() {
        if (this.moreStruct == null || TextUtils.isEmpty(this.moreStruct.getUrl())) {
            return true;
        }
        return false;
    }
}
