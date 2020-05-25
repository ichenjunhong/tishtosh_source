package com.p683ss.android.ugc.aweme.notice.repo.list.bean;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice */
public class CommentNotice implements Serializable {
    @C17952c(mo34828a = "aweme")
    Aweme aweme;
    @C17952c(mo34828a = "comment")
    Comment comment;
    @C17952c(mo34828a = "comment_type")
    int commentType;
    @C17952c(mo34828a = "content")
    String content;
    @C17952c(mo34828a = "forward_id")
    String forwardId;
    @C17952c(mo34828a = "level1_comment")
    Comment level1Comment;
    @C17952c(mo34828a = "label_text")
    private String mLabelText;
    @C17952c(mo34828a = "label_type")
    private int mLabelType;
    @C17952c(mo34828a = "relation_label")
    RelationDynamicLabel relationLabel;
    @C17952c(mo34828a = "reply_comment")
    Comment replyComment;

    public Aweme getAweme() {
        return this.aweme;
    }

    public Comment getComment() {
        return this.comment;
    }

    public int getCommentType() {
        return this.commentType;
    }

    public String getContent() {
        return this.content;
    }

    public String getForwardId() {
        return this.forwardId;
    }

    public String getLabelText() {
        return this.mLabelText;
    }

    public int getLabelType() {
        return this.mLabelType;
    }

    public Comment getLevel1Comment() {
        return this.level1Comment;
    }

    public RelationDynamicLabel getRelationLabel() {
        return this.relationLabel;
    }

    public Comment getReplyComment() {
        return this.replyComment;
    }

    public boolean isReplyWithVideo() {
        if (this.commentType == 17 || this.commentType == 18 || this.commentType == 19) {
            return true;
        }
        return false;
    }

    public void setAweme(Aweme aweme2) {
        this.aweme = aweme2;
    }

    public void setComment(Comment comment2) {
        this.comment = comment2;
    }

    public void setCommentType(int i) {
        this.commentType = i;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setForwardId(String str) {
        this.forwardId = str;
    }

    public void setLabelText(String str) {
        this.mLabelText = str;
    }

    public void setLabelType(int i) {
        this.mLabelType = i;
    }

    public void setLevel1Comment(Comment comment2) {
        this.level1Comment = comment2;
    }

    public void setRelationLabel(RelationDynamicLabel relationDynamicLabel) {
        this.relationLabel = relationDynamicLabel;
    }

    public void setReplyComment(Comment comment2) {
        this.replyComment = comment2;
    }
}
