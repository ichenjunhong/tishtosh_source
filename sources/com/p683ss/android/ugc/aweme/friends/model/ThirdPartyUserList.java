package com.p683ss.android.ugc.aweme.friends.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.friends.model.ThirdPartyUserList */
public final class ThirdPartyUserList extends BaseResponse {
    @C17952c(mo34828a = "next_cursor")
    public int cursor;
    @C17952c(mo34828a = "has_more")
    public boolean hasMore;
    @C17952c(mo34828a = "log_pb")
    public final LogPbBean logPb;
    @C17952c(mo34828a = "user_list")
    public final List<User> userList;

    public ThirdPartyUserList(int i, boolean z, List<? extends User> list, LogPbBean logPbBean) {
        C52711k.m112240b(logPbBean, "logPb");
        this.cursor = i;
        this.hasMore = z;
        this.userList = list;
        this.logPb = logPbBean;
    }
}
