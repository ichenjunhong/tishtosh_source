package com.p683ss.android.ugc.aweme.feed.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeControl */
public class AwemeControl implements Serializable {
    @C17952c(mo34828a = "can_comment")
    public boolean canComment = true;
    @C17952c(mo34828a = "can_forward")
    public boolean canForward = true;
    @C17952c(mo34828a = "can_share")
    public boolean canShare = true;
    @C17952c(mo34828a = "can_show_comment")
    public boolean canShowComment = true;

    public boolean canComment() {
        return this.canComment;
    }

    public boolean canForward() {
        return this.canForward;
    }

    public boolean canShare() {
        return this.canShare;
    }

    public boolean canShowComment() {
        return this.canShowComment;
    }

    public void setCanComment(boolean z) {
        this.canComment = z;
    }

    public void setCanForward(boolean z) {
        this.canForward = z;
    }

    public void setCanShare(boolean z) {
        this.canShare = z;
    }

    public void setCanShowComment(boolean z) {
        this.canShowComment = z;
    }
}
