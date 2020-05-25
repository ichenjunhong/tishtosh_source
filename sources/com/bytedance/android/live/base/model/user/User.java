package com.bytedance.android.live.base.model.user;

import android.text.TextUtils;
import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.base.model.FansClubMember;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.p191a.C3000a;
import com.bytedance.android.live.base.model.user.p191a.C3001b;
import com.bytedance.common.utility.C9414h;
import com.google.gson.C17971f;
import com.google.gson.p1076a.C17952c;
import java.util.ArrayList;
import java.util.List;

public class User implements C3009i {
    public static final int FOLLOW_EACH_OTHER = 2;
    private static final int HASH_CODE_31 = 31;
    private static final int HASH_CODE_32 = 32;
    public static final int HAS_FOLLOWED = 1;
    public static final int NOT_FOLLOWING = 0;
    public static final int REALNAME_UNVERIFIED = 0;
    public static final int REALNAME_VERIFIED = 1;
    @C17952c(mo34828a = "anchor_info")
    C3002b anchorInfo;
    @C17952c(mo34828a = "webcast_anchor_level")
    C3003c anchorLevel;
    @C17952c(mo34828a = "authentication_info")
    C3004d authenticationInfo;
    @C17952c(mo34828a = "author_stats")
    C3005e authorInfo;
    @C17952c(mo34828a = "avatar_border")
    ImageModel avatarBorder;
    @C17952c(mo34828a = "avatar_large")
    ImageModel avatarLarge;
    @C17952c(mo34828a = "avatar_medium")
    ImageModel avatarMedium;
    @C17952c(mo34828a = "avatar_thumb")
    ImageModel avatarThumb;
    @C17952c(mo34828a = "avatar_url")
    String avatarUrl;
    @C17952c(mo34828a = "bg_img_url")
    String backgroundImgUrl;
    @C17952c(mo34828a = "badge_image_list")
    List<ImageModel> badgeImageList;
    @C17952c(mo34828a = "birthday")
    long birthday;
    @C17952c(mo34828a = "border")
    C3006f border;
    @C17952c(mo34828a = "city")
    String city;
    @C17952c(mo34828a = "create_time")
    long createTime;
    @C17952c(mo34828a = "display_id")
    public String displayId;
    @C17952c(mo34828a = "with_car_management_permission")
    boolean enableCarManagementPermission;
    @C17952c(mo34828a = "with_commerce_permission")
    boolean enableShowCommerceSale;
    @C17952c(mo34828a = "encrypted_id")
    String encryptedId = "";
    @C17952c(mo34828a = "experience")
    int experience;
    @C17952c(mo34828a = "ticket_count")
    long fanTicketCount;
    @C17952c(mo34828a = "fans_club")
    FansClubMember fansClub;
    @C17952c(mo34828a = "follow_info")
    FollowInfo followInfo;
    @C17952c(mo34828a = "brotherhood_info")
    FraternityInfo fraternityInfo;
    @C17952c(mo34828a = "gender")
    int gender;
    @C17952c(mo34828a = "id")

    /* renamed from: id */
    long f8810id;
    @C17952c(mo34828a = "id_str")
    String idStr;
    @C17952c(mo34828a = "income_share_percent")
    int incomeSharePercent;
    @C17952c(mo34828a = "verified")
    boolean isVerified;
    @C17952c(mo34828a = "level")
    int level;
    @C17952c(mo34828a = "link_mic_stats")
    int linkMicStats;
    private String logPb;
    private String mAvatarLargeStr;
    private String mAvatarMediumStr;
    private String mAvatarThumbStr;
    @C17952c(mo34828a = "medal")
    ImageModel medal;
    @C17952c(mo34828a = "modify_time")
    long modifyTime;
    transient boolean neverRecharge;
    @C17952c(mo34828a = "new_real_time_icons")
    List<ImageModel> newUserBadges;
    @C17952c(mo34828a = "nickname")
    String nickName;
    @C17952c(mo34828a = "noble_info")
    NobleLevelInfo nobleLevelInfo;
    @C17952c(mo34828a = "own_room")
    C2998a ownRoom;
    @C17952c(mo34828a = "total_recharge_diamond_count")
    long payScores = -1;
    @C17952c(mo34828a = "personal_card")
    ImageModel personalCard;
    private String requestId;
    @C17952c(mo34828a = "activity_reward")
    C2999a rewardInfo;
    @C17952c(mo34828a = "room_auto_gift_thanks")
    boolean roomAutoGiftThanks;
    @C17952c(mo34828a = "sec_uid")
    String secUid;
    @C17952c(mo34828a = "secret")
    int secret;
    @C17952c(mo34828a = "share_qrcode_uri")
    String shareQrcodeUri;
    @C17952c(mo34828a = "short_id")
    long shortId;
    @C17952c(mo34828a = "signature")
    String signature;
    @C17952c(mo34828a = "special_id")
    String specialId;
    @C17952c(mo34828a = "status")
    int status;
    @C17952c(mo34828a = "telephone")
    String telephone;
    @C17952c(mo34828a = "top_fans")
    List<User> topFans;
    @C17952c(mo34828a = "top_vip_no")
    int topVipNo;
    @C17952c(mo34828a = "user_attr")
    C3012k userAttr;
    @C17952c(mo34828a = "real_time_icons")
    List<ImageModel> userBadges;
    @C17952c(mo34828a = "pay_grade")
    C3014m userHonor;
    @C17952c(mo34828a = "user_role")
    int userRole;
    @C17952c(mo34828a = "verified_content")
    String verifiedContent;
    @C17952c(mo34828a = "verified_reason")
    String verifiedReason;
    @C17952c(mo34828a = "xigua_info")
    C3015n xiguaUserParams;

    /* renamed from: com.bytedance.android.live.base.model.user.User$a */
    public static class C2998a {
        @C17952c(mo34828a = "room_ids")

        /* renamed from: a */
        public List<Long> f8811a;
    }

    public boolean childrenManagerForbidCreateLiveRoom() {
        return false;
    }

    public boolean childrenManagerForbidWalletFunctions() {
        return false;
    }

    public C3002b getAnchorInfo() {
        return this.anchorInfo;
    }

    public C3003c getAnchorLevel() {
        return this.anchorLevel;
    }

    public C3004d getAuthenticationInfo() {
        return this.authenticationInfo;
    }

    public C3005e getAuthorInfo() {
        return this.authorInfo;
    }

    public ImageModel getAvatarBorder() {
        return this.avatarBorder;
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public String getBackgroundImgUrl() {
        return this.backgroundImgUrl;
    }

    public List<ImageModel> getBadgeImageList() {
        return this.badgeImageList;
    }

    public long getBirthday() {
        return this.birthday;
    }

    public C3006f getBorder() {
        return this.border;
    }

    public String getCity() {
        return this.city;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public String getEncryptedId() {
        return this.encryptedId;
    }

    public int getExperience() {
        return this.experience;
    }

    public long getFanTicketCount() {
        return this.fanTicketCount;
    }

    public FansClubMember getFansClub() {
        return this.fansClub;
    }

    public FollowInfo getFollowInfo() {
        return this.followInfo;
    }

    public FraternityInfo getFraternityInfo() {
        return this.fraternityInfo;
    }

    public int getGender() {
        return this.gender;
    }

    public long getId() {
        return this.f8810id;
    }

    public int getIncomeSharePercent() {
        return this.incomeSharePercent;
    }

    public int getLevel() {
        return this.level;
    }

    public int getLinkMicStats() {
        return this.linkMicStats;
    }

    public String getLogPb() {
        return this.logPb;
    }

    public ImageModel getMedal() {
        return this.medal;
    }

    public long getModifyTime() {
        return this.modifyTime;
    }

    public String getNickName() {
        return this.nickName;
    }

    public NobleLevelInfo getNobleLevelInfo() {
        return this.nobleLevelInfo;
    }

    public C2998a getOwnRoom() {
        return this.ownRoom;
    }

    public long getPayScores() {
        return this.payScores;
    }

    public ImageModel getPersonalCard() {
        return this.personalCard;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public C2999a getRewardInfo() {
        return this.rewardInfo;
    }

    public boolean getRoomAutoGiftThanks() {
        return this.roomAutoGiftThanks;
    }

    public String getSecUid() {
        return this.secUid;
    }

    public int getSecret() {
        return this.secret;
    }

    public String getShareQrcodeUri() {
        return this.shareQrcodeUri;
    }

    public long getShortId() {
        return this.shortId;
    }

    public String getSignature() {
        return this.signature;
    }

    public String getSpecialId() {
        return this.specialId;
    }

    public int getStatus() {
        return this.status;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public List<User> getTopFans() {
        return this.topFans;
    }

    public int getTopVipNo() {
        return this.topVipNo;
    }

    public C3012k getUserAttr() {
        return this.userAttr;
    }

    public List<ImageModel> getUserBadges() {
        return this.userBadges;
    }

    public C3014m getUserHonor() {
        return this.userHonor;
    }

    public int getUserRole() {
        return this.userRole;
    }

    public String getVerifiedContent() {
        return this.verifiedContent;
    }

    public String getVerifiedReason() {
        return this.verifiedReason;
    }

    public C3015n getXiguaUserParams() {
        return this.xiguaUserParams;
    }

    public boolean isEnableCarManagement() {
        return this.enableCarManagementPermission;
    }

    public boolean isEnableShowCommerceSale() {
        return this.enableShowCommerceSale;
    }

    public boolean isNeverRecharge() {
        return this.neverRecharge;
    }

    public boolean isVerified() {
        return this.isVerified;
    }

    public boolean isWithCommercePermission() {
        return isEnableShowCommerceSale();
    }

    public ImageModel getAvatarLarge() {
        try {
            if (this.avatarLarge == null && !TextUtils.isEmpty(this.mAvatarLargeStr)) {
                this.avatarLarge = (ImageModel) C2942b.m8369a().mo34884a(this.mAvatarLargeStr, ImageModel.class);
            }
        } catch (Exception unused) {
        }
        return this.avatarLarge;
    }

    public ImageModel getAvatarMedium() {
        try {
            if (this.avatarMedium == null && !TextUtils.isEmpty(this.mAvatarMediumStr)) {
                this.avatarMedium = (ImageModel) C2942b.m8369a().mo34884a(this.mAvatarMediumStr, ImageModel.class);
            }
        } catch (Exception unused) {
        }
        return this.avatarMedium;
    }

    public ImageModel getAvatarThumb() {
        try {
            if (this.avatarThumb == null && !TextUtils.isEmpty(this.mAvatarThumbStr)) {
                this.avatarThumb = (ImageModel) C2942b.m8369a().mo34884a(this.mAvatarThumbStr, ImageModel.class);
            }
        } catch (Exception unused) {
        }
        return this.avatarThumb;
    }

    public String getIdStr() {
        if (TextUtils.isEmpty(this.idStr)) {
            return String.valueOf(this.f8810id);
        }
        return this.idStr;
    }

    public long getLiveRoomId() {
        if (this.ownRoom == null) {
            return 0;
        }
        C2998a aVar = this.ownRoom;
        if (C9414h.m18630a(aVar.f8811a)) {
            return 0;
        }
        return ((Long) aVar.f8811a.get(0)).longValue();
    }

    public List<ImageModel> getNewUserBadges() {
        if (this.newUserBadges == null || this.newUserBadges.isEmpty()) {
            return this.userBadges;
        }
        return this.newUserBadges;
    }

    public boolean isFollowing() {
        if (this.followInfo == null) {
            return false;
        }
        if (this.followInfo.getFollowStatus() == 2 || this.followInfo.getFollowStatus() == 1) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24 = 0;
        if (this.nickName != null) {
            i = this.nickName.hashCode();
        } else {
            i = 0;
        }
        int i25 = ((i * 31) + this.gender) * 31;
        if (this.signature != null) {
            i2 = this.signature.hashCode();
        } else {
            i2 = 0;
        }
        int i26 = (((((((i25 + i2) * 31) + this.level) * 31) + ((int) (this.f8810id ^ (this.f8810id >>> 32)))) * 31) + ((int) (this.createTime ^ (this.createTime >>> 32)))) * 31;
        if (this.city != null) {
            i3 = this.city.hashCode();
        } else {
            i3 = 0;
        }
        int i27 = (((i26 + i3) * 31) + ((int) (this.birthday ^ (this.birthday >>> 32)))) * 31;
        if (this.avatarThumb != null) {
            i4 = this.avatarThumb.hashCode();
        } else {
            i4 = 0;
        }
        int i28 = (i27 + i4) * 31;
        if (this.avatarMedium != null) {
            i5 = this.avatarMedium.hashCode();
        } else {
            i5 = 0;
        }
        int i29 = (i28 + i5) * 31;
        if (this.avatarLarge != null) {
            i6 = this.avatarLarge.hashCode();
        } else {
            i6 = 0;
        }
        int i30 = (i29 + i6) * 31;
        if (this.avatarUrl != null) {
            i7 = this.avatarUrl.hashCode();
        } else {
            i7 = 0;
        }
        int i31 = (i30 + i7) * 31;
        if (this.topFans != null) {
            i8 = this.topFans.hashCode();
        } else {
            i8 = 0;
        }
        int i32 = (i31 + i8) * 31;
        if (this.idStr != null) {
            i9 = this.idStr.hashCode();
        } else {
            i9 = 0;
        }
        int i33 = (((((((i32 + i9) * 31) + ((int) (this.shortId ^ (this.shortId >>> 32)))) * 31) + ((int) (this.fanTicketCount ^ (this.fanTicketCount >>> 32)))) * 31) + (this.isVerified ? 1 : 0)) * 31;
        if (this.verifiedReason != null) {
            i10 = this.verifiedReason.hashCode();
        } else {
            i10 = 0;
        }
        int i34 = (((i33 + i10) * 31) + this.topVipNo) * 31;
        if (this.userHonor != null) {
            i11 = this.userHonor.hashCode();
        } else {
            i11 = 0;
        }
        int i35 = (i34 + i11) * 31;
        if (this.anchorLevel != null) {
            i12 = this.anchorLevel.hashCode();
        } else {
            i12 = 0;
        }
        int i36 = (i35 + i12) * 31;
        if (this.userBadges != null) {
            i13 = this.userBadges.hashCode();
        } else {
            i13 = 0;
        }
        int i37 = (i36 + i13) * 31;
        if (this.newUserBadges != null) {
            i14 = this.newUserBadges.hashCode();
        } else {
            i14 = 0;
        }
        int i38 = (((i37 + i14) * 31) + this.linkMicStats) * 31;
        if (this.mAvatarThumbStr != null) {
            i15 = this.mAvatarThumbStr.hashCode();
        } else {
            i15 = 0;
        }
        int i39 = (i38 + i15) * 31;
        if (this.mAvatarMediumStr != null) {
            i16 = this.mAvatarMediumStr.hashCode();
        } else {
            i16 = 0;
        }
        int i40 = (i39 + i16) * 31;
        if (this.mAvatarLargeStr != null) {
            i17 = this.mAvatarLargeStr.hashCode();
        } else {
            i17 = 0;
        }
        int i41 = (((i40 + i17) * 31) + (this.enableShowCommerceSale ? 1 : 0)) * 31;
        if (this.backgroundImgUrl != null) {
            i18 = this.backgroundImgUrl.hashCode();
        } else {
            i18 = 0;
        }
        int i42 = (i41 + i18) * 31;
        if (this.telephone != null) {
            i19 = this.telephone.hashCode();
        } else {
            i19 = 0;
        }
        int i43 = (((((((((i42 + i19) * 31) + this.experience) * 31) + this.status) * 31) + ((int) (this.modifyTime ^ (this.modifyTime >>> 32)))) * 31) + this.secret) * 31;
        if (this.shareQrcodeUri != null) {
            i20 = this.shareQrcodeUri.hashCode();
        } else {
            i20 = 0;
        }
        int i44 = (((i43 + i20) * 31) + this.incomeSharePercent) * 31;
        if (this.badgeImageList != null) {
            i21 = this.badgeImageList.hashCode();
        } else {
            i21 = 0;
        }
        int i45 = (i44 + i21) * 31;
        if (this.followInfo != null) {
            i22 = this.followInfo.hashCode();
        } else {
            i22 = 0;
        }
        int i46 = (i45 + i22) * 31;
        if (this.userAttr != null) {
            i23 = this.userAttr.hashCode();
        } else {
            i23 = 0;
        }
        int i47 = (i46 + i23) * 31;
        if (this.anchorInfo != null) {
            i24 = this.anchorInfo.hashCode();
        }
        return i47 + i24;
    }

    public void setAVatarMediumStr(String str) {
        this.mAvatarMediumStr = str;
    }

    public void setAnchorInfo(C3002b bVar) {
        this.anchorInfo = bVar;
    }

    public void setAnchorLevel(C3003c cVar) {
        this.anchorLevel = cVar;
    }

    public void setAuthenticationInfo(C3004d dVar) {
        this.authenticationInfo = dVar;
    }

    public void setAuthorInfo(C3005e eVar) {
        this.authorInfo = eVar;
    }

    public void setAvatarBorder(ImageModel imageModel) {
        this.avatarBorder = imageModel;
    }

    public void setAvatarLarge(ImageModel imageModel) {
        this.avatarLarge = imageModel;
    }

    public void setAvatarLargeStr(String str) {
        this.mAvatarLargeStr = str;
    }

    public void setAvatarMedium(ImageModel imageModel) {
        this.avatarMedium = imageModel;
    }

    public void setAvatarThumb(ImageModel imageModel) {
        this.avatarThumb = imageModel;
    }

    public void setAvatarThumbStr(String str) {
        this.mAvatarThumbStr = str;
    }

    public void setAvatarUrl(String str) {
        this.avatarUrl = str;
    }

    public void setBackgroundImgUrl(String str) {
        this.backgroundImgUrl = str;
    }

    public void setBadgeImageList(List<ImageModel> list) {
        this.badgeImageList = list;
    }

    public void setBirthday(long j) {
        this.birthday = j;
    }

    public void setBorder(C3006f fVar) {
        this.border = fVar;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setEnableShowCommerceSale(boolean z) {
        this.enableShowCommerceSale = z;
    }

    public void setEncryptedId(String str) {
        this.encryptedId = str;
    }

    public void setExperience(int i) {
        this.experience = i;
    }

    public void setFanTicketCount(long j) {
        this.fanTicketCount = j;
    }

    public void setFansClub(FansClubMember fansClubMember) {
        this.fansClub = fansClubMember;
    }

    public void setFollowInfo(FollowInfo followInfo2) {
        this.followInfo = followInfo2;
    }

    public void setFraternityInfo(FraternityInfo fraternityInfo2) {
        this.fraternityInfo = fraternityInfo2;
    }

    public void setGender(int i) {
        this.gender = i;
    }

    public void setId(long j) {
        this.f8810id = j;
    }

    public void setIdStr(String str) {
        this.idStr = str;
    }

    public void setIncomeSharePercent(int i) {
        this.incomeSharePercent = i;
    }

    public void setLevel(int i) {
        this.level = i;
    }

    @C17952c(mo34828a = "link_mic_stats")
    public void setLinkMicStats(int i) {
        this.linkMicStats = i;
    }

    public void setLogPb(String str) {
        this.logPb = str;
    }

    public void setMedal(ImageModel imageModel) {
        this.medal = imageModel;
    }

    public void setModifyTime(long j) {
        this.modifyTime = j;
    }

    public void setNeverRecharge(boolean z) {
        this.neverRecharge = z;
    }

    public void setNewUserBadges(List<ImageModel> list) {
        this.newUserBadges = list;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public void setNobleLevelInfo(NobleLevelInfo nobleLevelInfo2) {
        this.nobleLevelInfo = nobleLevelInfo2;
    }

    public void setPersonalCard(ImageModel imageModel) {
        this.personalCard = imageModel;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setRoomAutoGiftThanks(boolean z) {
        this.roomAutoGiftThanks = z;
    }

    public void setSecUid(String str) {
        this.secUid = str;
    }

    public void setSecret(int i) {
        this.secret = i;
    }

    public void setShareQrcodeUri(String str) {
        this.shareQrcodeUri = str;
    }

    public void setShortId(long j) {
        this.shortId = j;
    }

    public void setSignature(String str) {
        this.signature = str;
    }

    public void setSpecialId(String str) {
        this.specialId = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setTelephone(String str) {
        this.telephone = str;
    }

    public void setTopFans(List<User> list) {
        this.topFans = list;
    }

    public void setTopVipNo(int i) {
        this.topVipNo = i;
    }

    public void setUserAttr(C3012k kVar) {
        this.userAttr = kVar;
    }

    public void setUserBadges(List<ImageModel> list) {
        this.userBadges = list;
    }

    public void setUserHonor(C3014m mVar) {
        this.userHonor = mVar;
    }

    public void setUserRole(int i) {
        this.userRole = i;
    }

    public void setVerified(boolean z) {
        this.isVerified = z;
    }

    public void setVerifiedContent(String str) {
        this.verifiedContent = str;
    }

    public void setVerifiedReason(String str) {
        this.verifiedReason = str;
    }

    public void setWithCommercePermission(boolean z) {
        setEnableShowCommerceSale(z);
    }

    public void setXiguaUserParams(C3015n nVar) {
        this.xiguaUserParams = nVar;
    }

    public void setFollowStatus(int i) {
        if (this.followInfo != null) {
            this.followInfo.setFollowStatus((long) i);
        }
    }

    public void setPayScores(long j) {
        this.payScores = j;
        if (j > 0) {
            this.neverRecharge = false;
        }
    }

    public static User from(C3009i iVar) {
        if (iVar == null) {
            return null;
        }
        if (iVar instanceof User) {
            C17971f a = C2942b.m8369a();
            return (User) a.mo34884a(a.mo34889b(iVar), User.class);
        }
        User user = new User();
        user.initWith(iVar);
        return user;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        User user = (User) obj;
        if (this.gender != user.gender || this.level != user.level || this.f8810id != user.f8810id || this.createTime != user.createTime || this.birthday != user.birthday || this.shortId != user.shortId || this.fanTicketCount != user.fanTicketCount || this.isVerified != user.isVerified || this.topVipNo != user.topVipNo || getLiveRoomId() != user.getLiveRoomId() || this.linkMicStats != user.linkMicStats || this.enableShowCommerceSale != user.enableShowCommerceSale) {
            return false;
        }
        if (this.nickName == null ? user.nickName != null : !this.nickName.equals(user.nickName)) {
            return false;
        }
        if (this.signature == null ? user.signature != null : !this.signature.equals(user.signature)) {
            return false;
        }
        if (this.city == null ? user.city != null : !this.city.equals(user.city)) {
            return false;
        }
        if (this.avatarThumb == null ? user.avatarThumb != null : !this.avatarThumb.equals(user.avatarThumb)) {
            return false;
        }
        if (this.avatarMedium == null ? user.avatarMedium != null : !this.avatarMedium.equals(user.avatarMedium)) {
            return false;
        }
        if (this.avatarLarge == null ? user.avatarLarge != null : !this.avatarLarge.equals(user.avatarLarge)) {
            return false;
        }
        if (this.avatarUrl == null ? user.avatarUrl != null : !this.avatarUrl.equals(user.avatarUrl)) {
            return false;
        }
        if (this.topFans == null ? user.topFans != null : !this.topFans.equals(user.topFans)) {
            return false;
        }
        if (this.idStr == null ? user.idStr != null : !this.idStr.equals(user.idStr)) {
            return false;
        }
        if (this.verifiedReason == null ? user.verifiedReason != null : !this.verifiedReason.equals(user.verifiedReason)) {
            return false;
        }
        if (this.userHonor == null ? user.userHonor != null : !this.userHonor.equals(user.userHonor)) {
            return false;
        }
        if (this.anchorLevel == null ? user.anchorLevel != null : !this.anchorLevel.equals(user.anchorLevel)) {
            return false;
        }
        if (this.userBadges == null ? user.userBadges != null : !this.userBadges.equals(user.userBadges)) {
            return false;
        }
        if (this.newUserBadges == null ? user.newUserBadges != null : !this.newUserBadges.equals(user.newUserBadges)) {
            return false;
        }
        if (this.mAvatarThumbStr == null ? user.mAvatarThumbStr != null : !this.mAvatarThumbStr.equals(user.mAvatarThumbStr)) {
            return false;
        }
        if (this.mAvatarMediumStr == null ? user.mAvatarMediumStr != null : !this.mAvatarMediumStr.equals(user.mAvatarMediumStr)) {
            return false;
        }
        if (this.mAvatarLargeStr == null ? user.mAvatarLargeStr != null : !this.mAvatarLargeStr.equals(user.mAvatarLargeStr)) {
            return false;
        }
        if (this.backgroundImgUrl == null ? user.backgroundImgUrl != null : !this.backgroundImgUrl.equals(user.backgroundImgUrl)) {
            return false;
        }
        if (this.telephone == null ? user.telephone != null : !this.telephone.equals(user.telephone)) {
            return false;
        }
        if (this.experience != user.experience || this.status != user.status || this.modifyTime != user.modifyTime || this.secret != user.secret) {
            return false;
        }
        if (this.shareQrcodeUri == null ? user.shareQrcodeUri != null : !this.shareQrcodeUri.equals(user.shareQrcodeUri)) {
            return false;
        }
        if (this.incomeSharePercent != user.incomeSharePercent) {
            return false;
        }
        if (this.badgeImageList == null ? user.badgeImageList != null : !this.badgeImageList.equals(user.badgeImageList)) {
            return false;
        }
        if (this.followInfo == null ? user.followInfo != null : !this.followInfo.equals(user.followInfo)) {
            return false;
        }
        if (this.userAttr == null ? user.userAttr != null : !this.userAttr.equals(user.userAttr)) {
            return false;
        }
        if (this.authenticationInfo == null ? user.authenticationInfo != null : !this.authenticationInfo.equals(user.authenticationInfo)) {
            return false;
        }
        if (this.anchorInfo != null) {
            return this.anchorInfo.equals(user.anchorInfo);
        }
        if (user.anchorInfo == null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public void initWith(C3009i iVar) {
        List<User> list;
        C3014m mVar;
        C3003c cVar;
        List<ImageModel> list2;
        List<ImageModel> list3;
        List<C3008h> list4;
        this.enableShowCommerceSale = iVar.isEnableShowCommerceSale();
        this.fanTicketCount = iVar.getFanTicketCount();
        this.shortId = iVar.getShortId();
        this.avatarUrl = iVar.getAvatarUrl();
        this.avatarThumb = iVar.getAvatarThumb();
        this.avatarMedium = iVar.getAvatarMedium();
        this.avatarLarge = iVar.getAvatarLarge();
        this.city = iVar.getCity();
        this.birthday = iVar.getBirthday();
        this.nickName = iVar.getNickName();
        this.gender = iVar.getGender();
        this.signature = iVar.getSignature();
        this.level = iVar.getLevel();
        this.f8810id = iVar.getId();
        ArrayList arrayList = null;
        if (iVar.getTopFans() != null) {
            list = new ArrayList<>(iVar.getTopFans());
        } else {
            list = null;
        }
        this.topFans = list;
        this.isVerified = iVar.isVerified();
        this.verifiedReason = iVar.getVerifiedReason();
        this.topVipNo = iVar.getTopVipNo();
        C3001b userHonor2 = iVar.getUserHonor();
        if (userHonor2 == null) {
            mVar = null;
        } else if (userHonor2 instanceof C3014m) {
            C17971f a = C2942b.m8369a();
            mVar = (C3014m) a.mo34884a(a.mo34889b(userHonor2), C3014m.class);
        } else {
            C3014m mVar2 = new C3014m();
            mVar2.f8855a = userHonor2.mo8147b();
            mVar2.f8856b = userHonor2.mo8148c();
            mVar2.f8857c = userHonor2.mo8149d();
            mVar2.f8858d = userHonor2.mo8150e();
            mVar2.f8859e = userHonor2.mo8151f();
            mVar2.f8860f = userHonor2.mo8152g();
            mVar2.f8861g = userHonor2.mo8153h();
            mVar2.f8862h = userHonor2.mo8154i();
            mVar2.f8863i = userHonor2.mo8155j();
            mVar2.f8864j = userHonor2.mo8158m();
            mVar2.f8865k = userHonor2.mo8156k();
            mVar2.f8868n = userHonor2.mo8159n();
            mVar2.f8866l = userHonor2.mo8160o();
            mVar2.f8867m = userHonor2.mo8157l();
            if (userHonor2.mo8161p() != null) {
                list4 = new ArrayList<>(userHonor2.mo8161p());
            } else {
                list4 = null;
            }
            mVar2.f8869o = list4;
            mVar2.f8870p = userHonor2.mo8162q();
            mVar2.f8871q = userHonor2.mo8163r();
            mVar2.f8872r = userHonor2.mo8164s();
            mVar2.f8873s = userHonor2.mo8165t();
            mVar2.f8874t = userHonor2.mo8166u();
            mVar = mVar2;
        }
        this.userHonor = mVar;
        C3000a anchorLevel2 = iVar.getAnchorLevel();
        if (anchorLevel2 == null) {
            cVar = null;
        } else if (anchorLevel2 instanceof C3003c) {
            cVar = (C3003c) anchorLevel2;
        } else {
            C3003c cVar2 = new C3003c();
            cVar2.f8816a = anchorLevel2.mo8134a();
            cVar2.f8817b = anchorLevel2.mo8135b();
            cVar2.f8818c = anchorLevel2.mo8136c();
            cVar2.f8819d = anchorLevel2.mo8137d();
            cVar2.f8820e = anchorLevel2.mo8138e();
            cVar2.f8821f = anchorLevel2.mo8139f();
            cVar2.f8822g = anchorLevel2.mo8140g();
            cVar2.f8823h = anchorLevel2.mo8141h();
            cVar2.f8824i = anchorLevel2.mo8142i();
            cVar2.f8825j = anchorLevel2.mo8143j();
            cVar2.f8826k = anchorLevel2.mo8144k();
            cVar2.f8827l = anchorLevel2.mo8145l();
            cVar2.f8828m = anchorLevel2.mo8146m();
            cVar = cVar2;
        }
        this.anchorLevel = cVar;
        this.createTime = iVar.getCreateTime();
        this.ownRoom = iVar.getOwnRoom();
        this.linkMicStats = iVar.getLinkMicStats();
        if (iVar.getUserBadges() != null) {
            list2 = new ArrayList<>(iVar.getUserBadges());
        } else {
            list2 = null;
        }
        this.userBadges = list2;
        if (iVar.getNewUserBadges() != null) {
            list3 = new ArrayList<>(iVar.getNewUserBadges());
        } else {
            list3 = null;
        }
        this.newUserBadges = list3;
        this.backgroundImgUrl = iVar.getBackgroundImgUrl();
        this.telephone = iVar.getTelephone();
        this.experience = iVar.getExperience();
        this.status = iVar.getStatus();
        this.modifyTime = iVar.getModifyTime();
        this.secret = iVar.getSecret();
        this.shareQrcodeUri = iVar.getShareQrcodeUri();
        this.incomeSharePercent = iVar.getIncomeSharePercent();
        if (iVar.getBadgeImageList() != null) {
            arrayList = new ArrayList(iVar.getBadgeImageList());
        }
        this.badgeImageList = arrayList;
        this.followInfo = iVar.getFollowInfo();
        this.userAttr = iVar.getUserAttr();
        this.anchorInfo = iVar.getAnchorInfo();
        this.authenticationInfo = iVar.getAuthenticationInfo();
    }
}
