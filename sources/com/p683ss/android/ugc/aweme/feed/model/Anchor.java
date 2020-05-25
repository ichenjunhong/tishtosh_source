package com.p683ss.android.ugc.aweme.feed.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.Anchor */
public final class Anchor implements Serializable {
    @C17952c(mo34828a = "anchor_id")
    public String anchorId;
    @C17952c(mo34828a = "anchor_info")
    public AnchorCommonStruct anchorInfo;
    @C17952c(mo34828a = "business_type")
    public Integer businessType = Integer.valueOf(0);
    @C17952c(mo34828a = "shop_link")
    public AnchorShopLinkStruct shopLinkStruct;
    @C17952c(mo34828a = "show_type")
    public Integer showType = Integer.valueOf(0);
    @C17952c(mo34828a = "wikipedia_info")
    public WikipediaInfo wikipediaInfo;

    public final String getAnchorId() {
        return this.anchorId;
    }

    public final AnchorCommonStruct getAnchorInfo() {
        return this.anchorInfo;
    }

    public final Integer getBusinessType() {
        return this.businessType;
    }

    public final AnchorShopLinkStruct getShopLinkStruct() {
        return this.shopLinkStruct;
    }

    public final Integer getShowType() {
        return this.showType;
    }

    public final WikipediaInfo getWikipediaInfo() {
        return this.wikipediaInfo;
    }

    public final void setAnchorId(String str) {
        this.anchorId = str;
    }

    public final void setAnchorInfo(AnchorCommonStruct anchorCommonStruct) {
        this.anchorInfo = anchorCommonStruct;
    }

    public final void setBusinessType(Integer num) {
        this.businessType = num;
    }

    public final void setShopLinkStruct(AnchorShopLinkStruct anchorShopLinkStruct) {
        this.shopLinkStruct = anchorShopLinkStruct;
    }

    public final void setShowType(Integer num) {
        this.showType = num;
    }

    public final void setWikipediaInfo(WikipediaInfo wikipediaInfo2) {
        this.wikipediaInfo = wikipediaInfo2;
    }
}
