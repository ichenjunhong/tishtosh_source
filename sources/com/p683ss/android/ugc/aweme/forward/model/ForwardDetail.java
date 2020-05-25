package com.p683ss.android.ugc.aweme.forward.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.app.api.C22982e;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.forward.model.ForwardDetail */
public class ForwardDetail extends BaseResponse implements C22982e {
    @C17952c(mo34828a = "aweme_info")
    private Aweme aweme;
    @C17952c(mo34828a = "comment_info")
    private Comment comment;
    @C17952c(mo34828a = "label_info")
    private String labelInfo;
    String requestId;

    public Aweme getAweme() {
        return this.aweme;
    }

    public Comment getComment() {
        return this.comment;
    }

    public String getLabelInfo() {
        return this.labelInfo;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setAweme(Aweme aweme2) {
        this.aweme = aweme2;
    }

    public void setComment(Comment comment2) {
        this.comment = comment2;
    }

    public void setLabelInfo(String str) {
        this.labelInfo = str;
    }

    public void setRequestId(String str) {
        if (this.aweme != null) {
            this.aweme.setRequestId(str);
        }
        this.requestId = str;
    }
}
