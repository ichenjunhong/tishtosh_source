package com.p683ss.android.ugc.aweme.profile.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.TabSetting */
public class TabSetting implements Serializable {
    @C17952c(mo34828a = "aggregation_tab")
    AggregationTab aggregationTab;
    @C17952c(mo34828a = "brand_tab")
    BrandTab brandTab;
    @C17952c(mo34828a = "enterprise_tab")
    EnterpriseTab enterpriseTab;
    @C17952c(mo34828a = "hide_like_tab")
    boolean hideLikeTab;
    @C17952c(mo34828a = "private_tab")
    PrivateTab privateTab;

    public AggregationTab getAggregationTab() {
        return this.aggregationTab;
    }

    public BrandTab getBrandTab() {
        return this.brandTab;
    }

    public EnterpriseTab getEnterpriseTab() {
        return this.enterpriseTab;
    }

    public PrivateTab getPrivateTab() {
        return this.privateTab;
    }

    public boolean isHideLikeTab() {
        return this.hideLikeTab;
    }

    public void setAggregationTab(AggregationTab aggregationTab2) {
        this.aggregationTab = aggregationTab2;
    }

    public void setBrandTab(BrandTab brandTab2) {
        this.brandTab = brandTab2;
    }

    public void setEnterpriseTab(EnterpriseTab enterpriseTab2) {
        this.enterpriseTab = enterpriseTab2;
    }

    public void setHideLikeTab(boolean z) {
        this.hideLikeTab = z;
    }
}
