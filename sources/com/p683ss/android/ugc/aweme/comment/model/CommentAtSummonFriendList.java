package com.p683ss.android.ugc.aweme.comment.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.friends.model.SummonFriendItem;
import com.p683ss.android.ugc.aweme.friends.model.SummonFriendList;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.model.CommentAtSummonFriendList */
public class CommentAtSummonFriendList extends BaseResponse {
    @C17952c(mo34828a = "cursor")
    public long cursor;
    @C17952c(mo34828a = "has_more")
    public boolean hasMore;
    @C17952c(mo34828a = "user_list")
    public List<CommentAtSummonFriendItem> items;
    @C17952c(mo34828a = "input_keyword")
    public String keyword;
    @C17952c(mo34828a = "log_pb")
    public LogPbBean logPbBean;
    @C17952c(mo34828a = "rid")
    public String requestId;

    public CommentAtSummonFriendList() {
    }

    public static List<CommentAtSummonFriendItem> toCommonAtSummonFriendItems(List<SummonFriendItem> list) {
        ArrayList arrayList = new ArrayList();
        for (SummonFriendItem commentAtSummonFriendItem : list) {
            arrayList.add(CommentAtSummonFriendItem.toCommentAtSummonFriendItem(commentAtSummonFriendItem));
        }
        return arrayList;
    }

    public static CommentAtSummonFriendList toCommonAtSummonFriendList(SummonFriendList summonFriendList) {
        CommentAtSummonFriendList commentAtSummonFriendList = new CommentAtSummonFriendList();
        commentAtSummonFriendList.cursor = summonFriendList.cursor;
        commentAtSummonFriendList.hasMore = summonFriendList.hasMore;
        commentAtSummonFriendList.keyword = summonFriendList.keyword;
        commentAtSummonFriendList.logPbBean = summonFriendList.logPbBean;
        commentAtSummonFriendList.requestId = summonFriendList.requestId;
        commentAtSummonFriendList.items = toCommonAtSummonFriendItems(summonFriendList.items);
        return commentAtSummonFriendList;
    }

    public CommentAtSummonFriendList(List<CommentAtSummonFriendItem> list, long j, boolean z, String str) {
        this.items = list;
        this.cursor = j;
        this.hasMore = z;
        this.keyword = str;
    }
}
