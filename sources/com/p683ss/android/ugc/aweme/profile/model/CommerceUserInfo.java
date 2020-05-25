package com.p683ss.android.ugc.aweme.profile.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.CommerceUserInfo */
public class CommerceUserInfo implements Serializable {
    @C17952c(mo34828a = "ad_influencer_type")
    public int adInfluencerType;
    @C17952c(mo34828a = "has_ads_entry")
    public boolean hasAdEntry;
    @C17952c(mo34828a = "is_ad_partner")
    public boolean isAdPartner;
    @C17952c(mo34828a = "is_auction_ad_influencer")
    public boolean isAuctionAdInfluencer;
    @C17952c(mo34828a = "link_user_info")
    public LinkUserInfoStruct linkUserInfo;
    @C17952c(mo34828a = "show_star_atlas_cooperation")
    public boolean showStarAtlasCooperation;
    @C17952c(mo34828a = "star_atlas")
    public int starAtlas;

    public int getAdInfluencerType() {
        return this.adInfluencerType;
    }

    public LinkUserInfoStruct getLinkUserInfo() {
        return this.linkUserInfo;
    }

    public int getStarAtlas() {
        return this.starAtlas;
    }

    public boolean isAdPartner() {
        return this.isAdPartner;
    }

    public boolean isAuctionAdInfluencer() {
        return this.isAuctionAdInfluencer;
    }

    public boolean isShowStarAtlasCooperation() {
        return this.showStarAtlasCooperation;
    }
}
