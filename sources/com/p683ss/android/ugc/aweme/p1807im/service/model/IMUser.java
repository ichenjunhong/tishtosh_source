package com.p683ss.android.ugc.aweme.p1807im.service.model;

import android.text.TextUtils;
import com.google.gson.C17971f;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.framework.services.IUserService;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.BaseUserService;

/* renamed from: com.ss.android.ugc.aweme.im.service.model.IMUser */
public class IMUser extends IMContact {
    private String avatarStr;
    @C17952c(mo34828a = "avatar_thumb")
    private UrlModel avatarThumb;
    private long checkedUnreadStoryMillis;
    @C17952c(mo34828a = "commerce_user_level")
    private int commerceUserLevel;
    @C17952c(mo34828a = "contact_name")
    private String contactName;
    private String contactNameInitial;
    private String contactNamePinyin;
    @C17952c(mo34828a = "custom_verify")
    private String customVerify;
    private boolean enterprise;
    @C17952c(mo34828a = "enterprise_verify_reason")
    private String enterpriseVerifyReason;
    @C17952c(mo34828a = "follow_status")
    private int followStatus;
    @C17952c(mo34828a = "follower_status")
    int followerStatus;
    private boolean hasUnreadStory;
    private String initialLetter;
    @C17952c(mo34828a = "is_block")
    private boolean isBlock;
    private boolean isFake;
    @C17952c(mo34828a = "is_group_owner")
    private boolean isGroupOwner;
    private int isRecentContact;
    @C17952c(mo34828a = "nickname")
    private String nickName;
    private String nickNameInitial;
    private String nickNamePinyin;
    private String recType = "";
    @C17952c(mo34828a = "recommend_reason")
    private String recommendReason;
    private String remarkInitial;
    @C17952c(mo34828a = "remark_name")
    private String remarkName;
    private String remarkPinyin;
    private int searchType;
    @C17952c(mo34828a = "sec_uid")
    private String secUid;
    @C17952c(mo34828a = "can_share_message")
    private int shareStatus = 1;
    @C17952c(mo34828a = "short_id")
    private String shortId;
    @C17952c(mo34828a = "signature")
    private String signature;
    private String sortWeight;
    @C17952c(mo34828a = "third_name")
    private String thirdName;
    @C17952c(mo34828a = "uid")
    private String uid;
    @C17952c(mo34828a = "unique_id")
    private String uniqueId = "";
    @C17952c(mo34828a = "verification_type")
    private int verificationType;
    @C17952c(mo34828a = "weibo_verify")
    private String weiboVerify;
    private boolean withCommerceEntry;

    public String getAvatarStr() {
        return this.avatarStr;
    }

    public long getCheckedUnreadStoryMillis() {
        return this.checkedUnreadStoryMillis;
    }

    public int getCommerceUserLevel() {
        return this.commerceUserLevel;
    }

    public String getContactName() {
        return this.contactName;
    }

    public String getContactNameInitial() {
        return this.contactNameInitial;
    }

    public String getContactNamePinyin() {
        return this.contactNamePinyin;
    }

    public String getCustomVerify() {
        return this.customVerify;
    }

    public boolean getEnterprise() {
        return this.enterprise;
    }

    public String getEnterpriseVerifyReason() {
        return this.enterpriseVerifyReason;
    }

    public int getFollowerStatus() {
        return this.followerStatus;
    }

    public String getInitialLetter() {
        return this.initialLetter;
    }

    public int getIsRecentContact() {
        return this.isRecentContact;
    }

    public String getNickName() {
        return this.nickName;
    }

    public String getNickNameInitial() {
        return this.nickNameInitial;
    }

    public String getNickNamePinyin() {
        return this.nickNamePinyin;
    }

    public String getRecType() {
        return this.recType;
    }

    public String getRecommendReason() {
        return this.recommendReason;
    }

    public String getRemarkInitial() {
        return this.remarkInitial;
    }

    public String getRemarkName() {
        return this.remarkName;
    }

    public String getRemarkPinyin() {
        return this.remarkPinyin;
    }

    public int getSearchType() {
        return this.searchType;
    }

    public String getSecUid() {
        return this.secUid;
    }

    public int getShareStatus() {
        return this.shareStatus;
    }

    public String getShortId() {
        return this.shortId;
    }

    public String getSignature() {
        return this.signature;
    }

    public String getSortWeight() {
        return this.sortWeight;
    }

    public String getThirdName() {
        return this.thirdName;
    }

    public String getUid() {
        return this.uid;
    }

    public String getUniqueId() {
        return this.uniqueId;
    }

    public int getVerificationType() {
        return this.verificationType;
    }

    public String getWeiboVerify() {
        return this.weiboVerify;
    }

    public boolean isBlock() {
        return this.isBlock;
    }

    public boolean isEnterprise() {
        return this.enterprise;
    }

    public boolean isFake() {
        return this.isFake;
    }

    public boolean isGroupOwner() {
        return this.isGroupOwner;
    }

    public boolean isHasUnreadStory() {
        return this.hasUnreadStory;
    }

    public boolean isWithCommerceEntry() {
        return this.withCommerceEntry;
    }

    public UrlModel getDisplayAvatar() {
        return getAvatarThumb();
    }

    public String getUserName() {
        return getDisplayName();
    }

    public String getDisplayId() {
        if (TextUtils.isEmpty(this.uniqueId)) {
            return this.shortId;
        }
        return this.uniqueId;
    }

    public String getDisplayName() {
        if (TextUtils.isEmpty(this.remarkName)) {
            return this.nickName;
        }
        return this.remarkName;
    }

    public int getFollowStatus() {
        if (isSelf(this.uid)) {
            return 2;
        }
        return this.followStatus;
    }

    public UrlModel getAvatarThumb() {
        if (this.avatarThumb == null && !TextUtils.isEmpty(this.avatarStr)) {
            try {
                this.avatarThumb = (UrlModel) new C17971f().mo34884a(this.avatarStr, UrlModel.class);
            } catch (Exception unused) {
            }
        }
        return this.avatarThumb;
    }

    public int hashCode() {
        if (getUid() != null) {
            return getUid().hashCode();
        }
        return 0;
    }

    public String toUidString() {
        StringBuilder sb = new StringBuilder("IMUser{uid='");
        sb.append(this.uid);
        sb.append('\'');
        sb.append(", nickName='");
        sb.append(this.nickName);
        sb.append('\'');
        sb.append(", shareStatus=");
        sb.append(this.shareStatus);
        sb.append('}');
        return sb.toString();
    }

    public IMUser clone() {
        IMUser iMUser = new IMUser();
        iMUser.uid = this.uid;
        iMUser.secUid = this.secUid;
        iMUser.nickName = this.nickName;
        iMUser.signature = this.signature;
        iMUser.avatarThumb = this.avatarThumb;
        iMUser.followStatus = this.followStatus;
        iMUser.relationListItemType = this.relationListItemType;
        iMUser.uniqueId = this.uniqueId;
        iMUser.shortId = this.shortId;
        iMUser.weiboVerify = this.weiboVerify;
        iMUser.customVerify = this.customVerify;
        iMUser.enterpriseVerifyReason = this.enterpriseVerifyReason;
        iMUser.verificationType = this.verificationType;
        iMUser.remarkName = this.remarkName;
        iMUser.avatarStr = this.avatarStr;
        iMUser.initialLetter = this.initialLetter;
        iMUser.sortWeight = this.sortWeight;
        iMUser.remarkPinyin = this.remarkPinyin;
        iMUser.remarkInitial = this.remarkInitial;
        iMUser.nickNamePinyin = this.nickNamePinyin;
        iMUser.nickNameInitial = this.nickNameInitial;
        iMUser.isBlock = this.isBlock;
        iMUser.commerceUserLevel = this.commerceUserLevel;
        iMUser.withCommerceEntry = this.withCommerceEntry;
        iMUser.hasUnreadStory = this.hasUnreadStory;
        iMUser.checkedUnreadStoryMillis = this.checkedUnreadStoryMillis;
        iMUser.contactName = this.contactName;
        iMUser.contactNamePinyin = this.contactNamePinyin;
        iMUser.contactNameInitial = this.contactNameInitial;
        iMUser.shareStatus = this.shareStatus;
        iMUser.enterprise = this.enterprise;
        iMUser.isGroupOwner = this.isGroupOwner;
        iMUser.recommendReason = this.recommendReason;
        iMUser.followerStatus = this.followerStatus;
        iMUser.thirdName = this.thirdName;
        iMUser.recType = this.recType;
        return iMUser;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IMUser{uid='");
        sb.append(this.uid);
        sb.append('\'');
        sb.append(", secUid='");
        sb.append(this.secUid);
        sb.append('\'');
        sb.append(", nickName='");
        sb.append(this.nickName);
        sb.append('\'');
        sb.append(", signature='");
        sb.append(this.signature);
        sb.append('\'');
        sb.append(", avatarThumb=");
        sb.append(this.avatarThumb);
        sb.append(", followStatus=");
        sb.append(this.followStatus);
        sb.append(", uniqueId='");
        sb.append(this.uniqueId);
        sb.append('\'');
        sb.append(", shortId='");
        sb.append(this.shortId);
        sb.append('\'');
        sb.append(", weiboVerify='");
        sb.append(this.weiboVerify);
        sb.append('\'');
        sb.append(", customVerify='");
        sb.append(this.customVerify);
        sb.append('\'');
        sb.append(", enterpriseVerifyReason='");
        sb.append(this.enterpriseVerifyReason);
        sb.append('\'');
        sb.append(", verificationType=");
        sb.append(this.verificationType);
        sb.append(", remarkName='");
        sb.append(this.remarkName);
        sb.append('\'');
        sb.append(", commerceUserLevel=");
        sb.append(this.commerceUserLevel);
        sb.append(", contactName='");
        sb.append(this.contactName);
        sb.append('\'');
        sb.append(", withCommerceEntry=");
        sb.append(this.withCommerceEntry);
        sb.append(", hasUnreadStory=");
        sb.append(this.hasUnreadStory);
        sb.append(", checkedUnreadStoryMillis=");
        sb.append(this.checkedUnreadStoryMillis);
        sb.append(", avatarStr='");
        sb.append(this.avatarStr);
        sb.append('\'');
        sb.append(", sortWeight='");
        sb.append(this.sortWeight);
        sb.append('\'');
        sb.append(", initialLetter='");
        sb.append(this.initialLetter);
        sb.append('\'');
        sb.append(", remarkPinyin='");
        sb.append(this.remarkPinyin);
        sb.append('\'');
        sb.append(", remarkInitial='");
        sb.append(this.remarkInitial);
        sb.append('\'');
        sb.append(", nickNamePinyin='");
        sb.append(this.nickNamePinyin);
        sb.append('\'');
        sb.append(", nickNameInitial='");
        sb.append(this.nickNameInitial);
        sb.append('\'');
        sb.append(", contactNamePinyin='");
        sb.append(this.contactNamePinyin);
        sb.append('\'');
        sb.append(", contactNameInitial='");
        sb.append(this.contactNameInitial);
        sb.append('\'');
        sb.append(", shareStatus=");
        sb.append(this.shareStatus);
        sb.append(", searchType=");
        sb.append(this.searchType);
        sb.append(", isBlock=");
        sb.append(this.isBlock);
        sb.append(", isFake=");
        sb.append(this.isFake);
        sb.append(", enterprise=");
        sb.append(this.enterprise);
        sb.append(", followerStatus=");
        sb.append(this.followerStatus);
        sb.append('}');
        return sb.toString();
    }

    public void setAvatarStr(String str) {
        this.avatarStr = str;
    }

    public void setBlock(boolean z) {
        this.isBlock = z;
    }

    public void setCheckedUnreadStoryMillis(long j) {
        this.checkedUnreadStoryMillis = j;
    }

    public void setCommerceUserLevel(int i) {
        this.commerceUserLevel = i;
    }

    public void setContactName(String str) {
        this.contactName = str;
    }

    public void setContactNameInitial(String str) {
        this.contactNameInitial = str;
    }

    public void setContactNamePinyin(String str) {
        this.contactNamePinyin = str;
    }

    public void setCustomVerify(String str) {
        this.customVerify = str;
    }

    public void setEnterprise(boolean z) {
        this.enterprise = z;
    }

    public void setEnterpriseVerifyReason(String str) {
        this.enterpriseVerifyReason = str;
    }

    public void setFake(boolean z) {
        this.isFake = z;
    }

    public void setFollowStatus(int i) {
        this.followStatus = i;
    }

    public void setFollowerStatus(int i) {
        this.followerStatus = i;
    }

    public void setGroupOwner(boolean z) {
        this.isGroupOwner = z;
    }

    public void setHasUnreadStory(boolean z) {
        this.hasUnreadStory = z;
    }

    public void setInitialLetter(String str) {
        this.initialLetter = str;
    }

    public void setIsRecentContact(int i) {
        this.isRecentContact = i;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public void setNickNameInitial(String str) {
        this.nickNameInitial = str;
    }

    public void setNickNamePinyin(String str) {
        this.nickNamePinyin = str;
    }

    public void setRecType(String str) {
        this.recType = str;
    }

    public void setRecommendReason(String str) {
        this.recommendReason = str;
    }

    public void setRemarkInitial(String str) {
        this.remarkInitial = str;
    }

    public void setRemarkName(String str) {
        this.remarkName = str;
    }

    public void setRemarkPinyin(String str) {
        this.remarkPinyin = str;
    }

    public void setSearchType(int i) {
        this.searchType = i;
    }

    public void setSecUid(String str) {
        this.secUid = str;
    }

    public void setShareStatus(int i) {
        this.shareStatus = i;
    }

    public void setShortId(String str) {
        this.shortId = str;
    }

    public void setSignature(String str) {
        this.signature = str;
    }

    public void setSortWeight(String str) {
        this.sortWeight = str;
    }

    public void setThirdName(String str) {
        this.thirdName = str;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public void setUniqueId(String str) {
        this.uniqueId = str;
    }

    public void setVerificationType(int i) {
        this.verificationType = i;
    }

    public void setWeiboVerify(String str) {
        this.weiboVerify = str;
    }

    public void setWithCommerceEntry(boolean z) {
        this.withCommerceEntry = z;
    }

    public void setAvatarThumb(UrlModel urlModel) {
        this.avatarThumb = urlModel;
        try {
            this.avatarStr = new C17971f().mo34889b(urlModel);
        } catch (Exception unused) {
        }
    }

    public static boolean isInvalidUser(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            if (Long.parseLong(str) <= 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    public static boolean isSelf(String str) {
        IUserService baseUserService_Monster = BaseUserService.getBaseUserService_Monster();
        if (baseUserService_Monster != null) {
            return TextUtils.equals(baseUserService_Monster.getCurrentUserID(), str);
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMUser)) {
            return false;
        }
        IMUser iMUser = (IMUser) obj;
        if (getUid() != null) {
            return getUid().equals(iMUser.getUid());
        }
        if (iMUser.getUid() == null) {
            return true;
        }
        return false;
    }

    public static IMUser fromUser(User user) {
        boolean z;
        IMUser iMUser = new IMUser();
        iMUser.setUid(user.getUid());
        iMUser.setSecUid(user.getSecUid());
        iMUser.setNickName(user.getNickname());
        iMUser.setSignature(user.getSignature());
        iMUser.setAvatarThumb(user.getAvatarThumb());
        boolean z2 = true;
        if (user.getFollowStatus() == 1 && user.getFollowerStatus() == 1) {
            iMUser.setFollowStatus(2);
        } else {
            iMUser.setFollowStatus(user.getFollowStatus());
        }
        iMUser.setFollowerStatus(user.getFollowerStatus());
        iMUser.setUniqueId(user.getUniqueId());
        iMUser.setShortId(user.getShortId());
        iMUser.setWeiboVerify(user.getWeiboVerify());
        iMUser.setCustomVerify(user.getCustomVerify());
        iMUser.setEnterpriseVerifyReason(user.getEnterpriseVerifyReason());
        iMUser.setVerificationType(user.getVerificationType());
        iMUser.setRemarkName(user.getRemarkName());
        iMUser.setBlock(user.isBlock());
        iMUser.setContactName(user.getContactName());
        iMUser.setCommerceUserLevel(user.getCommerceUserLevel());
        iMUser.setWithCommerceEntry(user.isWithCommerceEntry());
        if (user.isHasUnreadStory() != null) {
            z = user.isHasUnreadStory().booleanValue();
        } else {
            z = false;
        }
        iMUser.setHasUnreadStory(z);
        iMUser.setCheckedUnreadStoryMillis(0);
        if (user.getCommercePermission() == null || user.getCommercePermission().enterprise != 1) {
            z2 = false;
        }
        iMUser.setEnterprise(z2);
        iMUser.setRecommendReason(user.getRecommendReason());
        iMUser.setThirdName(user.getThirdName());
        return iMUser;
    }

    public static User toUser(IMUser iMUser) {
        User user = new User();
        user.setUid(iMUser.getUid());
        user.setSecUid(iMUser.getSecUid());
        user.setNickname(iMUser.getNickName());
        user.setSignature(iMUser.getSignature());
        user.setAvatarThumb(iMUser.getAvatarThumb());
        user.setFollowStatus(iMUser.getFollowStatus());
        user.setUniqueId(iMUser.getUniqueId());
        user.setShortId(iMUser.getShortId());
        user.setWeiboVerify(iMUser.getWeiboVerify());
        user.setCustomVerify(iMUser.getCustomVerify());
        user.setEnterpriseVerifyReason(iMUser.getEnterpriseVerifyReason());
        user.setVerificationType(iMUser.getVerificationType());
        user.setRemarkName(iMUser.getRemarkName());
        user.setBlock(iMUser.isBlock());
        user.setCommerceUserLevel(iMUser.getCommerceUserLevel());
        user.setWithCommerceEntry(iMUser.isWithCommerceEntry());
        user.setHasUnreadStory(iMUser.isHasUnreadStory());
        user.setRecommendReason(iMUser.getRecommendReason());
        user.setFollowerStatus(iMUser.getFollowerStatus());
        user.setThirdName(iMUser.thirdName);
        return user;
    }

    public void copy(IMUser iMUser) {
        setUid(iMUser.getUid());
        setSecUid(iMUser.getSecUid());
        setNickName(iMUser.getNickName());
        setSignature(iMUser.getSignature());
        setAvatarThumb(iMUser.getAvatarThumb());
        setFollowStatus(iMUser.getFollowStatus());
        setUniqueId(iMUser.getUniqueId());
        setShortId(iMUser.getShortId());
        setWeiboVerify(iMUser.getWeiboVerify());
        setCustomVerify(iMUser.getCustomVerify());
        setEnterpriseVerifyReason(iMUser.getEnterpriseVerifyReason());
        setVerificationType(iMUser.getVerificationType());
        setRemarkName(iMUser.getRemarkName());
        setBlock(iMUser.isBlock());
        setCommerceUserLevel(iMUser.getCommerceUserLevel());
        setWithCommerceEntry(iMUser.isWithCommerceEntry());
        setHasUnreadStory(iMUser.isHasUnreadStory());
        setCheckedUnreadStoryMillis(0);
        setShareStatus(iMUser.getShareStatus());
        setEnterprise(iMUser.getEnterprise());
        setRecommendReason(iMUser.recommendReason);
        setFollowerStatus(iMUser.followerStatus);
        setThirdName(iMUser.thirdName);
        setRecType(iMUser.recType);
    }
}
