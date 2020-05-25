package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35467d;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.CommentContent */
public class CommentContent extends BaseContent {
    @C17952c(mo34828a = "aweme_id")
    private String awemeId;
    @C17952c(mo34828a = "comment")
    private String comment;
    @C17952c(mo34828a = "comment_id")
    private String commentId;
    @C17952c(mo34828a = "cover_url")
    private UrlModel coverUrl;
    @C17952c(mo34828a = "media_type")
    private int mediaType;

    public String getAwemeId() {
        return this.awemeId;
    }

    public String getComment() {
        return this.comment;
    }

    public String getCommentId() {
        return this.commentId;
    }

    public UrlModel getCoverUrl() {
        return this.coverUrl;
    }

    public int getMediaType() {
        return this.mediaType;
    }

    public String getMsgHint() {
        return C11010c.m22280a().getResources().getString(R.string.bkx);
    }

    public void setAwemeId(String str) {
        this.awemeId = str;
    }

    public void setComment(String str) {
        this.comment = str;
    }

    public void setCommentId(String str) {
        this.commentId = str;
    }

    public void setCoverUrl(UrlModel urlModel) {
        this.coverUrl = urlModel;
    }

    public void setMediaType(int i) {
        this.mediaType = i;
    }

    public static CommentContent obtain(C35467d dVar) {
        CommentContent commentContent = new CommentContent();
        commentContent.setAwemeId(dVar.f91137c);
        commentContent.setMediaType(dVar.f91140f);
        commentContent.setComment(dVar.f91141g);
        commentContent.setCommentId(dVar.f91136b);
        commentContent.setType(200);
        commentContent.setCoverUrl(dVar.f91135a);
        return commentContent;
    }
}
