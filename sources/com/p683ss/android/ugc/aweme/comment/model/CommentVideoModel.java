package com.p683ss.android.ugc.aweme.comment.model;

import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.sticker.data.C45868a;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.comment.model.CommentVideoModel */
public final class CommentVideoModel implements C45868a, Serializable {
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 6067284783174034475L;
    private final String awemeId;
    private final int channelId;
    private final String commentId;
    private final String commentMsg;
    private int endTime;
    private final String enterMethod;
    private final String replyId;
    private final String replyToReplyId;
    private int startTime;
    private final UrlModel userAvatar;
    private final String userId;
    private final String userName;

    /* renamed from: com.ss.android.ugc.aweme.comment.model.CommentVideoModel$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }
    }

    public CommentVideoModel() {
        this(null, null, null, null, null, null, null, null, 0, null, 0, 0, 4095, null);
    }

    public static /* synthetic */ CommentVideoModel copy$default(CommentVideoModel commentVideoModel, String str, String str2, UrlModel urlModel, String str3, String str4, String str5, String str6, String str7, int i, String str8, int i2, int i3, int i4, Object obj) {
        CommentVideoModel commentVideoModel2 = commentVideoModel;
        int i5 = i4;
        return commentVideoModel.copy((i5 & 1) != 0 ? commentVideoModel2.userId : str, (i5 & 2) != 0 ? commentVideoModel2.userName : str2, (i5 & 4) != 0 ? commentVideoModel2.userAvatar : urlModel, (i5 & 8) != 0 ? commentVideoModel2.commentMsg : str3, (i5 & 16) != 0 ? commentVideoModel2.commentId : str4, (i5 & 32) != 0 ? commentVideoModel2.awemeId : str5, (i5 & 64) != 0 ? commentVideoModel2.replyId : str6, (i5 & 128) != 0 ? commentVideoModel2.replyToReplyId : str7, (i5 & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0 ? commentVideoModel2.channelId : i, (i5 & UnReadVideoExperiment.LIKE_USER_LIST) != 0 ? commentVideoModel2.enterMethod : str8, (i5 & PreloadTask.BYTE_UNIT_NUMBER) != 0 ? commentVideoModel2.startTime : i2, (i5 & 2048) != 0 ? commentVideoModel2.endTime : i3);
    }

    public final String component1() {
        return this.userId;
    }

    public final String component10() {
        return this.enterMethod;
    }

    public final int component11() {
        return this.startTime;
    }

    public final int component12() {
        return this.endTime;
    }

    public final String component2() {
        return this.userName;
    }

    public final UrlModel component3() {
        return this.userAvatar;
    }

    public final String component4() {
        return this.commentMsg;
    }

    public final String component5() {
        return this.commentId;
    }

    public final String component6() {
        return this.awemeId;
    }

    public final String component7() {
        return this.replyId;
    }

    public final String component8() {
        return this.replyToReplyId;
    }

    public final int component9() {
        return this.channelId;
    }

    public final CommentVideoModel copy(String str, String str2, UrlModel urlModel, String str3, String str4, String str5, String str6, String str7, int i, String str8, int i2, int i3) {
        CommentVideoModel commentVideoModel = new CommentVideoModel(str, str2, urlModel, str3, str4, str5, str6, str7, i, str8, i2, i3);
        return commentVideoModel;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CommentVideoModel) {
                CommentVideoModel commentVideoModel = (CommentVideoModel) obj;
                if (C52711k.m112239a((Object) this.userId, (Object) commentVideoModel.userId) && C52711k.m112239a((Object) this.userName, (Object) commentVideoModel.userName) && C52711k.m112239a((Object) this.userAvatar, (Object) commentVideoModel.userAvatar) && C52711k.m112239a((Object) this.commentMsg, (Object) commentVideoModel.commentMsg) && C52711k.m112239a((Object) this.commentId, (Object) commentVideoModel.commentId) && C52711k.m112239a((Object) this.awemeId, (Object) commentVideoModel.awemeId) && C52711k.m112239a((Object) this.replyId, (Object) commentVideoModel.replyId) && C52711k.m112239a((Object) this.replyToReplyId, (Object) commentVideoModel.replyToReplyId)) {
                    if ((this.channelId == commentVideoModel.channelId) && C52711k.m112239a((Object) this.enterMethod, (Object) commentVideoModel.enterMethod)) {
                        if (this.startTime == commentVideoModel.startTime) {
                            if (this.endTime == commentVideoModel.endTime) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final int getChannelId() {
        return this.channelId;
    }

    public final String getCommentId() {
        return this.commentId;
    }

    public final String getCommentMsg() {
        return this.commentMsg;
    }

    public final int getEndTime() {
        return this.endTime;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final String getReplyId() {
        return this.replyId;
    }

    public final String getReplyToReplyId() {
        return this.replyToReplyId;
    }

    public final int getStartTime() {
        return this.startTime;
    }

    public final UrlModel getUserAvatar() {
        return this.userAvatar;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final int hashCode() {
        String str = this.userId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.userName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        UrlModel urlModel = this.userAvatar;
        int hashCode3 = (hashCode2 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        String str3 = this.commentMsg;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.commentId;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.awemeId;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.replyId;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.replyToReplyId;
        int hashCode8 = (((hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.channelId) * 31;
        String str8 = this.enterMethod;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return ((((hashCode8 + i) * 31) + this.startTime) * 31) + this.endTime;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommentVideoModel(userId=");
        sb.append(this.userId);
        sb.append(", userName=");
        sb.append(this.userName);
        sb.append(", userAvatar=");
        sb.append(this.userAvatar);
        sb.append(", commentMsg=");
        sb.append(this.commentMsg);
        sb.append(", commentId=");
        sb.append(this.commentId);
        sb.append(", awemeId=");
        sb.append(this.awemeId);
        sb.append(", replyId=");
        sb.append(this.replyId);
        sb.append(", replyToReplyId=");
        sb.append(this.replyToReplyId);
        sb.append(", channelId=");
        sb.append(this.channelId);
        sb.append(", enterMethod=");
        sb.append(this.enterMethod);
        sb.append(", startTime=");
        sb.append(this.startTime);
        sb.append(", endTime=");
        sb.append(this.endTime);
        sb.append(")");
        return sb.toString();
    }

    public final boolean hasTimeData() {
        if (this.endTime != 0) {
            return true;
        }
        return false;
    }

    public final void setEndTime(int i) {
        this.endTime = i;
    }

    public final void setStartTime(int i) {
        this.startTime = i;
    }

    public final boolean isVisibleWhen(long j) {
        if (!hasTimeData()) {
            return true;
        }
        if (((long) this.startTime) > j || j > ((long) this.endTime)) {
            return false;
        }
        return true;
    }

    public CommentVideoModel(String str, String str2, UrlModel urlModel, String str3, String str4, String str5, String str6, String str7, int i, String str8, int i2, int i3) {
        this.userId = str;
        this.userName = str2;
        this.userAvatar = urlModel;
        this.commentMsg = str3;
        this.commentId = str4;
        this.awemeId = str5;
        this.replyId = str6;
        this.replyToReplyId = str7;
        this.channelId = i;
        this.enterMethod = str8;
        this.startTime = i2;
        this.endTime = i3;
    }

    public /* synthetic */ CommentVideoModel(String str, String str2, UrlModel urlModel, String str3, String str4, String str5, String str6, String str7, int i, String str8, int i2, int i3, int i4, C52707g gVar) {
        String str9;
        String str10;
        UrlModel urlModel2;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        int i5;
        String str16;
        int i6;
        int i7 = i4;
        if ((i7 & 1) != 0) {
            str9 = "";
        } else {
            str9 = str;
        }
        if ((i7 & 2) != 0) {
            str10 = "";
        } else {
            str10 = str2;
        }
        if ((i7 & 4) != 0) {
            urlModel2 = null;
        } else {
            urlModel2 = urlModel;
        }
        if ((i7 & 8) != 0) {
            str11 = "";
        } else {
            str11 = str3;
        }
        if ((i7 & 16) != 0) {
            str12 = "";
        } else {
            str12 = str4;
        }
        if ((i7 & 32) != 0) {
            str13 = "";
        } else {
            str13 = str5;
        }
        if ((i7 & 64) != 0) {
            str14 = "";
        } else {
            str14 = str6;
        }
        if ((i7 & 128) != 0) {
            str15 = "";
        } else {
            str15 = str7;
        }
        int i8 = 0;
        if ((i7 & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0) {
            i5 = 0;
        } else {
            i5 = i;
        }
        if ((i7 & UnReadVideoExperiment.LIKE_USER_LIST) != 0) {
            str16 = "";
        } else {
            str16 = str8;
        }
        if ((i7 & PreloadTask.BYTE_UNIT_NUMBER) != 0) {
            i6 = 0;
        } else {
            i6 = i2;
        }
        if ((i7 & 2048) == 0) {
            i8 = i3;
        }
        this(str9, str10, urlModel2, str11, str12, str13, str14, str15, i5, str16, i6, i8);
    }
}
