package com.p683ss.android.ugc.aweme.friends.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.model.FriendList */
public class FriendList<T extends User> {
    @C17952c(mo34828a = "cursor")
    public int cursor;
    @C17952c(mo34828a = "social_users", mo34829b = {"user_list"})
    public List<T> friends;
    @C17952c(mo34828a = "has_more")
    public boolean hasMore;
    @C17952c(mo34828a = "register_count")
    public int registerCount;
    @C17952c(mo34828a = "total_count")
    public int total;
    @C17952c(mo34828a = "type")
    public int type;
    @C17952c(mo34828a = "unregistered_user")
    public List<UnRegisteredUser> unregisteredUser;
}
