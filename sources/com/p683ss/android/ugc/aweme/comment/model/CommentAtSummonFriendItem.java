package com.p683ss.android.ugc.aweme.comment.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.challenge.model.Segment;
import com.p683ss.android.ugc.aweme.friends.model.SummonFriendItem;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.model.CommentAtSummonFriendItem */
public class CommentAtSummonFriendItem {
    public String label;
    @C17952c(mo34828a = "user_info")
    public CommentAtUser mUser;
    @C17952c(mo34828a = "position")
    public List<Segment> segments;
    public int type = 1;

    public static CommentAtSummonFriendItem toCommentAtSummonFriendItem(SummonFriendItem summonFriendItem) {
        CommentAtSummonFriendItem commentAtSummonFriendItem = new CommentAtSummonFriendItem();
        commentAtSummonFriendItem.label = summonFriendItem.label;
        commentAtSummonFriendItem.segments = summonFriendItem.segments;
        commentAtSummonFriendItem.type = summonFriendItem.type;
        commentAtSummonFriendItem.mUser = CommentAtUser.Companion.toCommentAtUser(summonFriendItem.mUser);
        return commentAtSummonFriendItem;
    }
}
