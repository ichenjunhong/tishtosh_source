package com.p683ss.android.ugc.aweme.notice.repo.list.bean;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.DiggNotice */
public class DiggNotice implements Serializable {
    @C17952c(mo34828a = "aweme")
    Aweme aweme;
    @C17952c(mo34828a = "cid")
    String cid;
    @C17952c(mo34828a = "comment")
    Comment comment;
    @C17952c(mo34828a = "content")
    String content;
    @C17952c(mo34828a = "digg_type")
    int diggType;
    @C17952c(mo34828a = "forward_id")
    String forwardId;
    @C17952c(mo34828a = "has_digg_list")
    Boolean hasDiggList;
    @C17952c(mo34828a = "label_text")
    private String mLabelText;
    @C17952c(mo34828a = "merge_count")
    int mergeCount;
    @C17952c(mo34828a = "relation_label")
    RelationDynamicLabel relationLabel;
    @C17952c(mo34828a = "from_user")
    List<User> users;

    public Aweme getAweme() {
        return this.aweme;
    }

    public String getCid() {
        return this.cid;
    }

    public Comment getComment() {
        return this.comment;
    }

    public String getContent() {
        return this.content;
    }

    public int getDiggType() {
        return this.diggType;
    }

    public String getForwardId() {
        return this.forwardId;
    }

    public Boolean getHasDiggList() {
        return this.hasDiggList;
    }

    public String getLabelText() {
        return this.mLabelText;
    }

    public int getMergeCount() {
        return this.mergeCount;
    }

    public RelationDynamicLabel getRelationLabel() {
        return this.relationLabel;
    }

    public List<User> getUsers() {
        return this.users;
    }

    public void setAweme(Aweme aweme2) {
        this.aweme = aweme2;
    }

    public void setCid(String str) {
        this.cid = str;
    }

    public void setComment(Comment comment2) {
        this.comment = comment2;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setDiggType(int i) {
        this.diggType = i;
    }

    public void setForwardId(String str) {
        this.forwardId = str;
    }

    public void setLabelText(String str) {
        this.mLabelText = str;
    }

    public void setMergeCount(int i) {
        this.mergeCount = i;
    }

    public void setRelationLabel(RelationDynamicLabel relationDynamicLabel) {
        this.relationLabel = relationDynamicLabel;
    }

    public void setUsers(List<User> list) {
        this.users = list;
    }

    public DiggNotice(DiggNotice diggNotice) {
        this.aweme = diggNotice.aweme;
        this.users = diggNotice.users;
        this.content = diggNotice.content;
        this.mergeCount = diggNotice.mergeCount;
        this.diggType = diggNotice.diggType;
        this.cid = diggNotice.cid;
        this.relationLabel = diggNotice.relationLabel;
        this.forwardId = diggNotice.forwardId;
        this.mLabelText = diggNotice.mLabelText;
    }
}
