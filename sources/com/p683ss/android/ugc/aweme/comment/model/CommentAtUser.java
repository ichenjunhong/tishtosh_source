package com.p683ss.android.ugc.aweme.comment.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.comment.model.CommentAtUser */
public final class CommentAtUser {
    public static final Companion Companion = new Companion(null);
    @C17952c(mo34828a = "avatar_thumb")
    public final UrlModel avatarThumb;
    @C17952c(mo34828a = "commerce_user_level")
    public final Integer commerceUserLevel;
    @C17952c(mo34828a = "contact_name")
    public final String contactName;
    @C17952c(mo34828a = "custom_verify")
    public final String customVerify;
    @C17952c(mo34828a = "enterprise_verify_reason")
    public final String enterpriseVerifyReason;
    @C17952c(mo34828a = "follow_status")
    public final Integer followStatus;
    @C17952c(mo34828a = "follower_status")
    public final Integer followerStatus;
    @C17952c(mo34828a = "has_unread_story")
    public final Boolean hasUnreadStory;
    @C17952c(mo34828a = "is_block")
    public final Boolean isBlock;
    @C17952c(mo34828a = "nickname")
    public final String nickname;
    @C17952c(mo34828a = "recommend_reason")
    public final String recommendReason;
    @C17952c(mo34828a = "remark_name")
    public final String remarkName;
    @C17952c(mo34828a = "sec_uid")
    public final String secUid;
    @C17952c(mo34828a = "short_id")
    public final String shortId;
    @C17952c(mo34828a = "signature")
    public final String signature;
    @C17952c(mo34828a = "uid")
    public final String uid;
    @C17952c(mo34828a = "unique_id")
    public final String uniqueId;
    @C17952c(mo34828a = "verification_type")
    public final Integer verificationType;
    @C17952c(mo34828a = "weibo_verify")
    public final String weiboVerify;
    @C17952c(mo34828a = "with_commerce_entry")
    public final Boolean withCommerceEntry;

    /* renamed from: com.ss.android.ugc.aweme.comment.model.CommentAtUser$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }

        public final CommentAtUser toCommentAtUser(User user) {
            User user2 = user;
            if (user2 == null) {
                return null;
            }
            CommentAtUser commentAtUser = new CommentAtUser(user.getUid(), user.getSecUid(), user.getNickname(), user.getSignature(), user.getAvatarThumb(), Integer.valueOf(user.getFollowStatus()), Integer.valueOf(user.getFollowerStatus()), user.getUniqueId(), user.getShortId(), user.getWeiboVerify(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getRemarkName(), Boolean.valueOf(user2.isBlock), user.getContactName(), Integer.valueOf(user.getCommerceUserLevel()), Boolean.valueOf(user.isWithCommerceEntry()), user.isHasUnreadStory(), user.getRecommendReason());
            return commentAtUser;
        }

        public final User toUser(CommentAtUser commentAtUser) {
            int i;
            int i2;
            int i3;
            boolean z;
            int i4;
            boolean z2;
            if (commentAtUser == null) {
                return null;
            }
            User user = new User();
            user.setUid(commentAtUser.uid);
            user.setSecUid(commentAtUser.secUid);
            user.setNickname(commentAtUser.nickname);
            user.setSignature(commentAtUser.signature);
            user.setAvatarThumb(commentAtUser.avatarThumb);
            Integer num = commentAtUser.followStatus;
            boolean z3 = false;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            user.setFollowStatus(i);
            Integer num2 = commentAtUser.followerStatus;
            if (num2 != null) {
                i2 = num2.intValue();
            } else {
                i2 = 0;
            }
            user.setFollowerStatus(i2);
            user.setUniqueId(commentAtUser.uniqueId);
            user.setShortId(commentAtUser.shortId);
            user.setWeiboVerify(commentAtUser.weiboVerify);
            user.setCustomVerify(commentAtUser.customVerify);
            user.setEnterpriseVerifyReason(commentAtUser.enterpriseVerifyReason);
            Integer num3 = commentAtUser.verificationType;
            if (num3 != null) {
                i3 = num3.intValue();
            } else {
                i3 = 0;
            }
            user.setVerificationType(i3);
            user.setRemarkName(commentAtUser.remarkName);
            Boolean bool = commentAtUser.isBlock;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            user.isBlock = z;
            user.setContactName(commentAtUser.contactName);
            Integer num4 = commentAtUser.commerceUserLevel;
            if (num4 != null) {
                i4 = num4.intValue();
            } else {
                i4 = 0;
            }
            user.setCommerceUserLevel(i4);
            Boolean bool2 = commentAtUser.withCommerceEntry;
            if (bool2 != null) {
                z2 = bool2.booleanValue();
            } else {
                z2 = false;
            }
            user.setWithCommerceEntry(z2);
            Boolean bool3 = commentAtUser.hasUnreadStory;
            if (bool3 != null) {
                z3 = bool3.booleanValue();
            }
            user.setHasUnreadStory(z3);
            user.setRecommendReason(commentAtUser.recommendReason);
            return user;
        }
    }

    public static /* synthetic */ CommentAtUser copy$default(CommentAtUser commentAtUser, String str, String str2, String str3, String str4, UrlModel urlModel, Integer num, Integer num2, String str5, String str6, String str7, String str8, String str9, Integer num3, String str10, Boolean bool, String str11, Integer num4, Boolean bool2, Boolean bool3, String str12, int i, Object obj) {
        Boolean bool4;
        String str13;
        String str14;
        Integer num5;
        Integer num6;
        Boolean bool5;
        Boolean bool6;
        Boolean bool7;
        CommentAtUser commentAtUser2 = commentAtUser;
        int i2 = i;
        String str15 = (i2 & 1) != 0 ? commentAtUser2.uid : str;
        String str16 = (i2 & 2) != 0 ? commentAtUser2.secUid : str2;
        String str17 = (i2 & 4) != 0 ? commentAtUser2.nickname : str3;
        String str18 = (i2 & 8) != 0 ? commentAtUser2.signature : str4;
        UrlModel urlModel2 = (i2 & 16) != 0 ? commentAtUser2.avatarThumb : urlModel;
        Integer num7 = (i2 & 32) != 0 ? commentAtUser2.followStatus : num;
        Integer num8 = (i2 & 64) != 0 ? commentAtUser2.followerStatus : num2;
        String str19 = (i2 & 128) != 0 ? commentAtUser2.uniqueId : str5;
        String str20 = (i2 & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0 ? commentAtUser2.shortId : str6;
        String str21 = (i2 & UnReadVideoExperiment.LIKE_USER_LIST) != 0 ? commentAtUser2.weiboVerify : str7;
        String str22 = (i2 & PreloadTask.BYTE_UNIT_NUMBER) != 0 ? commentAtUser2.customVerify : str8;
        String str23 = (i2 & 2048) != 0 ? commentAtUser2.enterpriseVerifyReason : str9;
        Integer num9 = (i2 & 4096) != 0 ? commentAtUser2.verificationType : num3;
        String str24 = (i2 & VideoCacheReadBuffersizeExperiment.DEFAULT) != 0 ? commentAtUser2.remarkName : str10;
        Boolean bool8 = (i2 & 16384) != 0 ? commentAtUser2.isBlock : bool;
        if ((i2 & 32768) != 0) {
            bool4 = bool8;
            str13 = commentAtUser2.contactName;
        } else {
            bool4 = bool8;
            str13 = str11;
        }
        if ((i2 & 65536) != 0) {
            str14 = str13;
            num5 = commentAtUser2.commerceUserLevel;
        } else {
            str14 = str13;
            num5 = num4;
        }
        if ((i2 & 131072) != 0) {
            num6 = num5;
            bool5 = commentAtUser2.withCommerceEntry;
        } else {
            num6 = num5;
            bool5 = bool2;
        }
        if ((i2 & 262144) != 0) {
            bool6 = bool5;
            bool7 = commentAtUser2.hasUnreadStory;
        } else {
            bool6 = bool5;
            bool7 = bool3;
        }
        return commentAtUser.copy(str15, str16, str17, str18, urlModel2, num7, num8, str19, str20, str21, str22, str23, num9, str24, bool4, str14, num6, bool6, bool7, (i2 & 524288) != 0 ? commentAtUser2.recommendReason : str12);
    }

    public final CommentAtUser copy(String str, String str2, String str3, String str4, UrlModel urlModel, Integer num, Integer num2, String str5, String str6, String str7, String str8, String str9, Integer num3, String str10, Boolean bool, String str11, Integer num4, Boolean bool2, Boolean bool3, String str12) {
        CommentAtUser commentAtUser = new CommentAtUser(str, str2, str3, str4, urlModel, num, num2, str5, str6, str7, str8, str9, num3, str10, bool, str11, num4, bool2, bool3, str12);
        return commentAtUser;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ce, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.recommendReason, (java.lang.Object) r3.recommendReason) != false) goto L_0x00d3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x00d3
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.comment.model.CommentAtUser
            if (r0 == 0) goto L_0x00d1
            com.ss.android.ugc.aweme.comment.model.CommentAtUser r3 = (com.p683ss.android.ugc.aweme.comment.model.CommentAtUser) r3
            java.lang.String r0 = r2.uid
            java.lang.String r1 = r3.uid
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00d1
            java.lang.String r0 = r2.secUid
            java.lang.String r1 = r3.secUid
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00d1
            java.lang.String r0 = r2.nickname
            java.lang.String r1 = r3.nickname
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00d1
            java.lang.String r0 = r2.signature
            java.lang.String r1 = r3.signature
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00d1
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r2.avatarThumb
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r3.avatarThumb
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00d1
            java.lang.Integer r0 = r2.followStatus
            java.lang.Integer r1 = r3.followStatus
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00d1
            java.lang.Integer r0 = r2.followerStatus
            java.lang.Integer r1 = r3.followerStatus
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00d1
            java.lang.String r0 = r2.uniqueId
            java.lang.String r1 = r3.uniqueId
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00d1
            java.lang.String r0 = r2.shortId
            java.lang.String r1 = r3.shortId
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00d1
            java.lang.String r0 = r2.weiboVerify
            java.lang.String r1 = r3.weiboVerify
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00d1
            java.lang.String r0 = r2.customVerify
            java.lang.String r1 = r3.customVerify
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00d1
            java.lang.String r0 = r2.enterpriseVerifyReason
            java.lang.String r1 = r3.enterpriseVerifyReason
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00d1
            java.lang.Integer r0 = r2.verificationType
            java.lang.Integer r1 = r3.verificationType
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00d1
            java.lang.String r0 = r2.remarkName
            java.lang.String r1 = r3.remarkName
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00d1
            java.lang.Boolean r0 = r2.isBlock
            java.lang.Boolean r1 = r3.isBlock
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00d1
            java.lang.String r0 = r2.contactName
            java.lang.String r1 = r3.contactName
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00d1
            java.lang.Integer r0 = r2.commerceUserLevel
            java.lang.Integer r1 = r3.commerceUserLevel
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00d1
            java.lang.Boolean r0 = r2.withCommerceEntry
            java.lang.Boolean r1 = r3.withCommerceEntry
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00d1
            java.lang.Boolean r0 = r2.hasUnreadStory
            java.lang.Boolean r1 = r3.hasUnreadStory
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00d1
            java.lang.String r0 = r2.recommendReason
            java.lang.String r3 = r3.recommendReason
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x00d1
            goto L_0x00d3
        L_0x00d1:
            r3 = 0
            return r3
        L_0x00d3:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.comment.model.CommentAtUser.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.uid;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.secUid;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.nickname;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.signature;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        UrlModel urlModel = this.avatarThumb;
        int hashCode5 = (hashCode4 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        Integer num = this.followStatus;
        int hashCode6 = (hashCode5 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.followerStatus;
        int hashCode7 = (hashCode6 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str5 = this.uniqueId;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.shortId;
        int hashCode9 = (hashCode8 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.weiboVerify;
        int hashCode10 = (hashCode9 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.customVerify;
        int hashCode11 = (hashCode10 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.enterpriseVerifyReason;
        int hashCode12 = (hashCode11 + (str9 != null ? str9.hashCode() : 0)) * 31;
        Integer num3 = this.verificationType;
        int hashCode13 = (hashCode12 + (num3 != null ? num3.hashCode() : 0)) * 31;
        String str10 = this.remarkName;
        int hashCode14 = (hashCode13 + (str10 != null ? str10.hashCode() : 0)) * 31;
        Boolean bool = this.isBlock;
        int hashCode15 = (hashCode14 + (bool != null ? bool.hashCode() : 0)) * 31;
        String str11 = this.contactName;
        int hashCode16 = (hashCode15 + (str11 != null ? str11.hashCode() : 0)) * 31;
        Integer num4 = this.commerceUserLevel;
        int hashCode17 = (hashCode16 + (num4 != null ? num4.hashCode() : 0)) * 31;
        Boolean bool2 = this.withCommerceEntry;
        int hashCode18 = (hashCode17 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.hasUnreadStory;
        int hashCode19 = (hashCode18 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        String str12 = this.recommendReason;
        if (str12 != null) {
            i = str12.hashCode();
        }
        return hashCode19 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommentAtUser(uid=");
        sb.append(this.uid);
        sb.append(", secUid=");
        sb.append(this.secUid);
        sb.append(", nickname=");
        sb.append(this.nickname);
        sb.append(", signature=");
        sb.append(this.signature);
        sb.append(", avatarThumb=");
        sb.append(this.avatarThumb);
        sb.append(", followStatus=");
        sb.append(this.followStatus);
        sb.append(", followerStatus=");
        sb.append(this.followerStatus);
        sb.append(", uniqueId=");
        sb.append(this.uniqueId);
        sb.append(", shortId=");
        sb.append(this.shortId);
        sb.append(", weiboVerify=");
        sb.append(this.weiboVerify);
        sb.append(", customVerify=");
        sb.append(this.customVerify);
        sb.append(", enterpriseVerifyReason=");
        sb.append(this.enterpriseVerifyReason);
        sb.append(", verificationType=");
        sb.append(this.verificationType);
        sb.append(", remarkName=");
        sb.append(this.remarkName);
        sb.append(", isBlock=");
        sb.append(this.isBlock);
        sb.append(", contactName=");
        sb.append(this.contactName);
        sb.append(", commerceUserLevel=");
        sb.append(this.commerceUserLevel);
        sb.append(", withCommerceEntry=");
        sb.append(this.withCommerceEntry);
        sb.append(", hasUnreadStory=");
        sb.append(this.hasUnreadStory);
        sb.append(", recommendReason=");
        sb.append(this.recommendReason);
        sb.append(")");
        return sb.toString();
    }

    public CommentAtUser(String str, String str2, String str3, String str4, UrlModel urlModel, Integer num, Integer num2, String str5, String str6, String str7, String str8, String str9, Integer num3, String str10, Boolean bool, String str11, Integer num4, Boolean bool2, Boolean bool3, String str12) {
        this.uid = str;
        this.secUid = str2;
        this.nickname = str3;
        this.signature = str4;
        this.avatarThumb = urlModel;
        this.followStatus = num;
        this.followerStatus = num2;
        this.uniqueId = str5;
        this.shortId = str6;
        this.weiboVerify = str7;
        this.customVerify = str8;
        this.enterpriseVerifyReason = str9;
        this.verificationType = num3;
        this.remarkName = str10;
        this.isBlock = bool;
        this.contactName = str11;
        this.commerceUserLevel = num4;
        this.withCommerceEntry = bool2;
        this.hasUnreadStory = bool3;
        this.recommendReason = str12;
    }
}
