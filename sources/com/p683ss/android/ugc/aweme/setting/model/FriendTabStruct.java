package com.p683ss.android.ugc.aweme.setting.model;

import com.google.gson.p1076a.C17952c;

/* renamed from: com.ss.android.ugc.aweme.setting.model.FriendTabStruct */
public class FriendTabStruct {
    @C17952c(mo34828a = "default_follow_tab")
    public boolean defaultFollowTab;
    @C17952c(mo34828a = "friend_tab_desc")
    public String friendTabDesc;

    public FriendTabStruct setDefaultFollowTab(boolean z) {
        this.defaultFollowTab = z;
        return this;
    }

    public FriendTabStruct setFriendTabDesc(String str) {
        this.friendTabDesc = str;
        return this;
    }
}
