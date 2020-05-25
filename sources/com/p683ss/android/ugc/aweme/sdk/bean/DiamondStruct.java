package com.p683ss.android.ugc.aweme.sdk.bean;

import com.google.gson.p1076a.C17952c;

/* renamed from: com.ss.android.ugc.aweme.sdk.bean.DiamondStruct */
public class DiamondStruct {
    @C17952c(mo34828a = "describe")
    public String describe;
    @C17952c(mo34828a = "diamond_count")
    public int diamondCount;
    @C17952c(mo34828a = "exchange_price")
    public int exchangePrice;
    @C17952c(mo34828a = "giving_count")
    public int givingCount;
    @C17952c(mo34828a = "iap_id")
    public String iapId;
    @C17952c(mo34828a = "id")

    /* renamed from: id */
    public int f104807id;
    @C17952c(mo34828a = "price")
    public int price;

    public String toString() {
        StringBuilder sb = new StringBuilder("DiamondStruct{id=");
        sb.append(this.f104807id);
        sb.append(", iapId='");
        sb.append(this.iapId);
        sb.append('\'');
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", exchangePrice=");
        sb.append(this.exchangePrice);
        sb.append(", diamondCount=");
        sb.append(this.diamondCount);
        sb.append(", givingCount=");
        sb.append(this.givingCount);
        sb.append(", describe='");
        sb.append(this.describe);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
