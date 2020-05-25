package com.p683ss.android.ugc.aweme.comment.model;

import com.google.gson.p1076a.C17952c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.model.CommentItemList */
public class CommentItemList extends BaseCommentResponse {
    @C17952c(mo34828a = "comment_prompt")
    public CommentPrompt commentPrompt = new CommentPrompt();
    @C17952c(mo34828a = "cursor")
    public long cursor;
    @C17952c(mo34828a = "has_more")
    public boolean hasMore;
    @C17952c(mo34828a = "hotsoon_filtered_count")
    public int hotsoonFilteredCount;
    @C17952c(mo34828a = "hotsoon_has_more")
    public int hotsoonHasMore;
    @C17952c(mo34828a = "hotsoon_text")
    public String hotsoonText;
    @C17952c(mo34828a = "comments")
    public List<Comment> items;
    @C17952c(mo34828a = "new_insert_ids")
    public String newInsertIds;
    @C17952c(mo34828a = "reply_style")
    public int replyStyle;
    @C17952c(mo34828a = "total")
    public long total;
}
