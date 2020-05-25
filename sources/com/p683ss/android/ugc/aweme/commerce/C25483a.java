package com.p683ss.android.ugc.aweme.commerce;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.commercialize.model.C26135p;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.commerce.a */
public final class C25483a implements Serializable {
    @C17952c(mo34828a = "ad_auth_status")
    public int ad_auth_status;
    @C17952c(mo34828a = "ad_source")
    public int ad_source;
    @C17952c(mo34828a = "auction_ad_invited")
    public boolean auction_ad_invited;
    @C17952c(mo34828a = "avoid_global_pendant")
    public boolean avoid_global_pendant;
    @C17952c(mo34828a = "douplus_toast")
    public C26135p douplus_toast;
    @C17952c(mo34828a = "show_share_link")
    public boolean show_share_link;

    public final int getAdSource() {
        return this.ad_source;
    }

    public final int getAuthStatus() {
        return this.ad_auth_status;
    }

    public final C26135p getDouplusToast() {
        return this.douplus_toast;
    }

    public final boolean isAuctionAdInvited() {
        return this.auction_ad_invited;
    }

    public final boolean isAvoidGlobalPendant() {
        return this.avoid_global_pendant;
    }

    public final boolean isShowShareLink() {
        return this.show_share_link;
    }
}
