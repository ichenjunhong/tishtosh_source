package com.p683ss.android.ugc.aweme.friends.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.model.SummonFriendList */
public class SummonFriendList extends BaseResponse {
    @C17952c(mo34828a = "cursor")
    public long cursor;
    @C17952c(mo34828a = "has_more")
    public boolean hasMore;
    @C17952c(mo34828a = "user_list")
    public List<SummonFriendItem> items;
    @C17952c(mo34828a = "input_keyword")
    public String keyword;
    @C17952c(mo34828a = "log_pb")
    public LogPbBean logPbBean;
    @C17952c(mo34828a = "rid")
    public String requestId;

    public SummonFriendList(List<SummonFriendItem> list, long j, boolean z, String str) {
        this.items = list;
        this.cursor = j;
        this.hasMore = z;
        this.keyword = str;
    }
}
