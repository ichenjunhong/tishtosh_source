package com.p683ss.android.ugc.aweme.commerce;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commerce.c */
public final class C25507c implements Serializable {
    @C17952c(mo34828a = "challenge_list")
    public List<Challenge> challengeList;
    @C17952c(mo34828a = "head_image_url")
    public UrlModel headImageUrl;
    @C17952c(mo34828a = "offline_info_list")
    public List<C25513e> offlineInfoList;
    @C17952c(mo34828a = "quick_shop_name")
    public String quickShopName;
    @C17952c(mo34828a = "quick_shop_url")
    public String quickShopUrl;
    @C17952c(mo34828a = "site_id")
    public String siteId;
    @C17952c(mo34828a = "smart_phone")
    public C25514f smartPhone;

    public final List<Challenge> getChallengeList() {
        return this.challengeList;
    }

    public final UrlModel getHeadImageUrl() {
        return this.headImageUrl;
    }

    public final List<C25513e> getOfflineInfoList() {
        return this.offlineInfoList;
    }

    public final String getQuickShopName() {
        return this.quickShopName;
    }

    public final String getQuickShopUrl() {
        return this.quickShopUrl;
    }

    public final String getSiteId() {
        return this.siteId;
    }

    public final C25514f getSmartPhone() {
        return this.smartPhone;
    }

    public final void setHeadImageUrl(UrlModel urlModel) {
        this.headImageUrl = urlModel;
    }

    public final void setOfflineInfoList(List<C25513e> list) {
        this.offlineInfoList = list;
    }

    public final void setSmartPhone(C25514f fVar) {
        this.smartPhone = fVar;
    }
}
