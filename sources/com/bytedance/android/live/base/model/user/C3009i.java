package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User.C2998a;
import com.bytedance.android.live.base.model.user.p191a.C3000a;
import com.bytedance.android.live.base.model.user.p191a.C3001b;
import java.util.List;

/* renamed from: com.bytedance.android.live.base.model.user.i */
public interface C3009i {

    /* renamed from: com.bytedance.android.live.base.model.user.i$a */
    public enum C3010a {
        Login,
        Logout,
        Update
    }

    boolean childrenManagerForbidCreateLiveRoom();

    boolean childrenManagerForbidWalletFunctions();

    C3002b getAnchorInfo();

    C3000a getAnchorLevel();

    C3004d getAuthenticationInfo();

    ImageModel getAvatarLarge();

    ImageModel getAvatarMedium();

    ImageModel getAvatarThumb();

    String getAvatarUrl();

    String getBackgroundImgUrl();

    List<ImageModel> getBadgeImageList();

    long getBirthday();

    String getCity();

    long getCreateTime();

    int getExperience();

    long getFanTicketCount();

    FollowInfo getFollowInfo();

    int getGender();

    long getId();

    int getIncomeSharePercent();

    int getLevel();

    int getLinkMicStats();

    long getModifyTime();

    List<ImageModel> getNewUserBadges();

    String getNickName();

    C2998a getOwnRoom();

    long getPayScores();

    String getSecUid();

    int getSecret();

    String getShareQrcodeUri();

    long getShortId();

    String getSignature();

    int getStatus();

    String getTelephone();

    List<User> getTopFans();

    int getTopVipNo();

    C3012k getUserAttr();

    List<ImageModel> getUserBadges();

    C3001b getUserHonor();

    String getVerifiedReason();

    boolean isEnableShowCommerceSale();

    boolean isFollowing();

    boolean isVerified();

    void setFollowStatus(int i);
}
