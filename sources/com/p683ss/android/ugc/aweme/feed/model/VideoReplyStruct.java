package com.p683ss.android.ugc.aweme.feed.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.VideoReplyStruct */
public final class VideoReplyStruct implements Serializable {
    @C17952c(mo34828a = "alias_comment_id")
    public String aliasCommentId;
    @C17952c(mo34828a = "aweme_id")
    public String awemeId;
    @C17952c(mo34828a = "comment_id")
    public String commentId;

    public VideoReplyStruct() {
    }

    public final String getAliasCommentId() {
        return this.aliasCommentId;
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final String getCommentId() {
        return this.commentId;
    }

    public VideoReplyStruct(String str, String str2, String str3) {
        this.awemeId = str;
        this.commentId = str2;
        this.aliasCommentId = str3;
    }
}
