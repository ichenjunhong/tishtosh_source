package com.p683ss.android.ugc.aweme.services.external.p2130ui;

import com.p683ss.android.ugc.aweme.comment.model.CommentVideoModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.services.external.ui.CommentVideoConfig */
public final class CommentVideoConfig implements Serializable {
    private CommentVideoModel commentVideoModel;

    public final CommentVideoModel getCommentVideoModel() {
        return this.commentVideoModel;
    }

    public final void setCommentVideoModel(CommentVideoModel commentVideoModel2) {
        this.commentVideoModel = commentVideoModel2;
    }
}
