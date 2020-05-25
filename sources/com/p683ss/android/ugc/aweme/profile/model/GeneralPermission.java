package com.p683ss.android.ugc.aweme.profile.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.GeneralPermission */
public class GeneralPermission implements Serializable {
    @C17952c(mo34828a = "following_follower_list_toast")
    public int followingFollowerListToast;
    @C17952c(mo34828a = "follow_toast")
    public int mFollowToast;
    @C17952c(mo34828a = "follow_toast_type")
    public int mFollowToastType;
    @C17952c(mo34828a = "original_list")
    public int mOriginalList;
    @C17952c(mo34828a = "profile_toast")
    public String mProfileToast;
    @C17952c(mo34828a = "share_profile_toast")
    public String mShareProfileToast;
    @C17952c(mo34828a = "share_toast")
    public int mShareToast;
    @C17952c(mo34828a = "shop_toast")
    public int mShopToast;

    public int getFollowToast() {
        return this.mFollowToast;
    }

    public int getFollowToastType() {
        return this.mFollowToastType;
    }

    public int getFollowingFollowerListToast() {
        return this.followingFollowerListToast;
    }

    public int getOriginalList() {
        return this.mOriginalList;
    }

    public String getProfileToast() {
        return this.mProfileToast;
    }

    public String getShareProfileToast() {
        return this.mShareProfileToast;
    }

    public int getShareToast() {
        return this.mShareToast;
    }

    public int getShopToast() {
        return this.mShopToast;
    }
}
