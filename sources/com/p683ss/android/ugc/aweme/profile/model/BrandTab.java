package com.p683ss.android.ugc.aweme.profile.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.BrandTab */
public class BrandTab implements Serializable {
    @C17952c(mo34828a = "industry_type")
    int industryType;
    @C17952c(mo34828a = "show_brand_tab")
    boolean showBrandTab;
    @C17952c(mo34828a = "title")
    String title;

    public int getIndustryType() {
        return this.industryType;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isShowBrandTab() {
        return this.showBrandTab;
    }

    public void setIndustryType(int i) {
        this.industryType = i;
    }

    public void setShowBrandTab(boolean z) {
        this.showBrandTab = z;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
