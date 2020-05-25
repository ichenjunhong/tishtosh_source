package com.p683ss.android.ugc.aweme.friends.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.model.RecentFriendModel */
public class RecentFriendModel extends BaseResponse {
    @C17952c(mo34828a = "cursor")
    public long cursor;
    @C17952c(mo34828a = "has_more")
    public boolean hasMore;
    @C17952c(mo34828a = "user_list")
    public List<User> users;
}
