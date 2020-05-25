package com.p683ss.android.ugc.aweme.comment.model;

import android.text.TextUtils;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.C23453a;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.model.Comment */
public class Comment extends C23453a implements Serializable, Cloneable {
    private static final long serialVersionUID = -8417684736500467488L;
    @C17952c(mo34828a = "alias_aweme")
    Aweme aliasAweme;
    @C17952c(mo34828a = "aweme_id")
    String awemeId;
    @C17952c(mo34828a = "cid")
    String cid;
    @C17952c(mo34828a = "create_time")
    int createTime;
    @C17952c(mo34828a = "digg_count")
    int diggCount;
    @C17952c(mo34828a = "sticker")
    C29366a emoji;
    private transient String fakeId = "";
    @C17952c(mo34828a = "forward_id")
    String forwardId;
    @C17952c(mo34828a = "is_author_digged")
    public boolean isAuthorDigged;
    boolean isTranslated;
    @C17952c(mo34828a = "label_colour")
    String labelColour;
    @C17952c(mo34828a = "label_info")
    String labelInfo;
    @C17952c(mo34828a = "label_text")
    String labelText;
    @C17952c(mo34828a = "label_text_colour")
    String labelTextColour;
    @C17952c(mo34828a = "label_type")
    int labelType;
    @C17952c(mo34828a = "label_url")
    String labelUrl;
    private int mCommentType;
    @C17952c(mo34828a = "label_list")
    List<CommentLabel> mLabelList;
    private boolean mNeedHint;
    private boolean mNeedShowPrompt;
    public String mTimeDesc;
    public String mUserNamePrefix;
    public transient int offset;
    @C17952c(mo34828a = "relation_label")
    RelationDynamicLabel relationLabel;
    @C17952c(mo34828a = "reply_comment_total")
    long replyCommentTotal;
    @C17952c(mo34828a = "reply_comment")
    List<Comment> replyComments;
    @C17952c(mo34828a = "reply_id")
    String replyId;
    @C17952c(mo34828a = "reply_to_reply_id")
    String replyToReplyId;
    @C17952c(mo34828a = "reply_to_userid")
    String replyToUserId;
    @C17952c(mo34828a = "reply_to_username")
    String replyToUserName;
    @C17952c(mo34828a = "status")
    int status = -1;
    @C17952c(mo34828a = "stick_position")
    int stickPosition;
    @C17952c(mo34828a = "text")
    String text;
    @C17952c(mo34828a = "text_extra")
    List<TextExtraStruct> textExtra;
    @C17952c(mo34828a = "user")
    User user;
    @C17952c(mo34828a = "user_buried")
    boolean userBuried;
    @C17952c(mo34828a = "user_digged")
    int userDigged;

    /* renamed from: com.ss.android.ugc.aweme.comment.model.Comment$LabelType */
    public interface LabelType {
    }

    public Aweme getAliasAweme() {
        return this.aliasAweme;
    }

    public String getAwemeId() {
        return this.awemeId;
    }

    public String getCid() {
        return this.cid;
    }

    public int getCommentType() {
        return this.mCommentType;
    }

    public int getCreateTime() {
        return this.createTime;
    }

    public int getDiggCount() {
        return this.diggCount;
    }

    public C29366a getEmoji() {
        return this.emoji;
    }

    public String getForwardId() {
        return this.forwardId;
    }

    public String getLabelColour() {
        return this.labelColour;
    }

    public String getLabelInfo() {
        return this.labelInfo;
    }

    public List<CommentLabel> getLabelList() {
        return this.mLabelList;
    }

    public String getLabelText() {
        return this.labelText;
    }

    public String getLabelTextColour() {
        return this.labelTextColour;
    }

    public int getLabelType() {
        return this.labelType;
    }

    public String getLabelUrl() {
        return this.labelUrl;
    }

    public RelationDynamicLabel getRelationLabel() {
        return this.relationLabel;
    }

    public long getReplyCommentTotal() {
        return this.replyCommentTotal;
    }

    public List<Comment> getReplyComments() {
        return this.replyComments;
    }

    public String getReplyId() {
        return this.replyId;
    }

    public String getReplyToReplyCommentId() {
        return this.replyToReplyId;
    }

    public String getReplyToUserId() {
        return this.replyToUserId;
    }

    public String getReplyToUserName() {
        return this.replyToUserName;
    }

    public int getStatus() {
        return this.status;
    }

    public int getStickPosition() {
        return this.stickPosition;
    }

    public String getText() {
        return this.text;
    }

    public List<TextExtraStruct> getTextExtra() {
        return this.textExtra;
    }

    public User getUser() {
        return this.user;
    }

    public boolean getUserBuried() {
        return this.userBuried;
    }

    public int getUserDigged() {
        return this.userDigged;
    }

    public boolean isAuthorDigged() {
        return this.isAuthorDigged;
    }

    public boolean isNeedHint() {
        return this.mNeedHint;
    }

    public boolean isNeedShowPrompt() {
        return this.mNeedShowPrompt;
    }

    public boolean isTranslated() {
        return this.isTranslated;
    }

    public boolean isUserDigged() {
        if (this.userDigged == 1) {
            return true;
        }
        return false;
    }

    public String getFakeId() {
        if (this.fakeId == null) {
            return "";
        }
        return this.fakeId;
    }

    public int hashCode() {
        if (this.cid != null) {
            return this.cid.hashCode();
        }
        return 0;
    }

    public Comment clone() {
        C252711 r1;
        Comment comment = new Comment();
        comment.cid = this.cid;
        comment.text = this.text;
        comment.awemeId = this.awemeId;
        comment.createTime = this.createTime;
        comment.diggCount = this.diggCount;
        comment.status = this.status;
        comment.user = this.user;
        comment.replyId = this.replyId;
        comment.userDigged = this.userDigged;
        comment.userBuried = this.userBuried;
        if (this.replyComments != null) {
            ArrayList arrayList = new ArrayList(this.replyComments.size());
            for (Comment clone : this.replyComments) {
                arrayList.add(clone.clone());
            }
            comment.replyComments = arrayList;
        }
        if (this.textExtra != null) {
            ArrayList arrayList2 = new ArrayList(this.textExtra.size());
            for (TextExtraStruct clone2 : this.textExtra) {
                arrayList2.add(clone2.clone());
            }
            comment.textExtra = arrayList2;
        }
        comment.labelText = this.labelText;
        comment.labelType = this.labelType;
        if (this.relationLabel == null) {
            r1 = null;
        } else {
            r1 = new RelationDynamicLabel() {
                {
                    setNickname(Comment.this.relationLabel.getNickname());
                    setLabelInfo(Comment.this.relationLabel.getLabelInfo());
                    setUserId(Comment.this.relationLabel.getUserId());
                    setCount(Comment.this.relationLabel.getCount());
                }
            };
        }
        comment.relationLabel = r1;
        comment.forwardId = this.forwardId;
        comment.replyCommentTotal = this.replyCommentTotal;
        comment.replyToReplyId = this.replyToReplyId;
        comment.replyToUserName = this.replyToUserName;
        comment.replyToUserId = this.replyToUserId;
        comment.mCommentType = this.mCommentType;
        comment.emoji = this.emoji;
        comment.stickPosition = this.stickPosition;
        comment.aliasAweme = this.aliasAweme;
        comment.mLabelList = this.mLabelList;
        return comment;
    }

    public void setAliasAweme(Aweme aweme) {
        this.aliasAweme = aweme;
    }

    public void setAuthorDigged(boolean z) {
        this.isAuthorDigged = z;
    }

    public void setAwemeId(String str) {
        this.awemeId = str;
    }

    public void setCid(String str) {
        this.cid = str;
    }

    public void setCommentType(int i) {
        this.mCommentType = i;
    }

    public void setCreateTime(int i) {
        this.createTime = i;
    }

    public void setDiggCount(int i) {
        this.diggCount = i;
    }

    public void setEmoji(C29366a aVar) {
        this.emoji = aVar;
    }

    public void setFakeId(String str) {
        this.fakeId = str;
    }

    public void setForwardId(String str) {
        this.forwardId = str;
    }

    public void setLabelColour(String str) {
        this.labelColour = str;
    }

    public void setLabelInfo(String str) {
        this.labelInfo = str;
    }

    public void setLabelList(List<CommentLabel> list) {
        this.mLabelList = list;
    }

    public void setLabelText(String str) {
        this.labelText = str;
    }

    public void setLabelTextColour(String str) {
        this.labelTextColour = str;
    }

    public void setLabelType(int i) {
        this.labelType = i;
    }

    public void setLabelUrl(String str) {
        this.labelUrl = str;
    }

    public void setNeedHint(boolean z) {
        this.mNeedHint = z;
    }

    public void setNeedShowPrompt(boolean z) {
        this.mNeedShowPrompt = z;
    }

    public void setRelationLabel(RelationDynamicLabel relationDynamicLabel) {
        this.relationLabel = relationDynamicLabel;
    }

    public void setReplyCommentTotal(long j) {
        this.replyCommentTotal = j;
    }

    public void setReplyComments(List<Comment> list) {
        this.replyComments = list;
    }

    public void setReplyId(String str) {
        this.replyId = str;
    }

    public void setReplyToReplyId(String str) {
        this.replyToReplyId = str;
    }

    public void setReplyToUserId(String str) {
        this.replyToUserId = str;
    }

    public void setReplyToUserName(String str) {
        this.replyToUserName = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setStickPosition(int i) {
        this.stickPosition = i;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setTextExtra(List<TextExtraStruct> list) {
        this.textExtra = list;
    }

    public void setTranslated(boolean z) {
        this.isTranslated = z;
    }

    public void setUser(User user2) {
        this.user = user2;
    }

    public void setUserBuried(boolean z) {
        this.userBuried = z;
    }

    public void setUserDigged(int i) {
        this.userDigged = i;
    }

    public static String getAuthorUid(Comment comment) {
        if (comment == null) {
            return "";
        }
        User user2 = comment.getUser();
        if (user2 == null) {
            return "";
        }
        return user2.getUid();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return TextUtils.equals(this.cid, ((Comment) obj).cid);
    }
}
