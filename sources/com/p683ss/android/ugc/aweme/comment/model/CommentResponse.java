package com.p683ss.android.ugc.aweme.comment.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.C23460b;

/* renamed from: com.ss.android.ugc.aweme.comment.model.CommentResponse */
public class CommentResponse extends BaseCommentResponse {
    @C23460b
    @C17952c(mo34828a = "comment")
    public Comment comment;
    @C17952c(mo34828a = "label_info")
    public String starFakeLabel;

    public void setStarFakeLabel(String str) {
        this.starFakeLabel = str;
        this.comment.setLabelInfo(str);
    }
}
