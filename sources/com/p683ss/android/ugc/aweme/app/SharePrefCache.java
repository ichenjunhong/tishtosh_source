package com.p683ss.android.ugc.aweme.app;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.AccountService;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.language.C35853o;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.app.SharePrefCache */
public class SharePrefCache {
    private static final int CAN_IM_ON = 1;
    private static final String ESTR = "a3668f0afac72ca3f6c1697d29e0e1bb1fef4ab0285319b95ac39fa42c38d05f";
    public static final int EVERYONE_SETTING_VALUE = 0;
    public static final String TAG = "SharePrefCache";
    private C23051bf<String> accessToken;
    private C23051bf<Integer> adDisplayTimemit;
    private C23051bf<String> adIntroUrl;
    private C23051bf<String> adLandingPageConfig;
    private C23051bf<String> adSouthNorthFirstSupportTeam;
    private C23051bf<Long> adSouthNorthFirstSupportTime;
    private C23051bf<Integer> appStoreScoreSection;
    private C23051bf<Integer> appStoreScoreSwitch;
    private C23051bf<Integer> appStoreScoreThreshold;
    private C23051bf<Integer> arStickerFliterTimes;
    private C23051bf<Integer> atFriendsShowType;
    private C23051bf<Boolean> autoSaveVideo;
    private C23051bf<Boolean> autoSendTwitter;
    private C23051bf<Integer> beautyModel;
    private C23051bf<String> billboardFansScheme;
    private C23051bf<String> billboardStarScheme;
    private C23051bf<Integer> bodyDanceGuideTimes;
    private C23051bf<String> brandScheme;
    private List<C23051bf> cacheItems;
    private C23051bf<Boolean> canCreateInsights;
    private C23051bf<Integer> canIm;
    private C23051bf<Integer> canImSendPic;
    private C23051bf<Boolean> canLive;
    private C23051bf<Boolean> clickGuideShown;
    private boolean collectAllItems;
    private C23051bf<Boolean> commerceLiveCompatibleOld;
    private C23051bf<Integer> completeProfilePolicyInterval;
    private C23051bf<Integer> completeProfilePolicyTimes;
    private C23051bf<Boolean> confirmUploadContacts;
    private C23051bf<Long> contactsUploadedLastTime;
    private C23051bf<Boolean> debugWebBar;
    private C23051bf<Set<String>> defaultAvatarUrl;
    private C23051bf<Set<String>> defaultProfileCoverUrl;
    private C23051bf<String> deviceInfoUrl;
    private C23051bf<Boolean> deviceMonitor;
    private C23051bf<String> dialogContent;
    private C23051bf<String> dialogSlogan;
    private C23051bf<String> dialogTitle;
    private C23051bf<Integer> dialogType;
    private C23051bf<String> dialogUrl;
    private C23051bf<Integer> disableTaobao;
    private C23051bf<String> douyinCardScheme;
    private C23051bf<String> downloadForbiddenToast;
    private C23051bf<Integer> downloadMicroApp;
    private C23051bf<String> downloadSdkConfig;
    private C23051bf<Boolean> downloadStatusWhenPublish;
    private C23051bf<Boolean> enableAntiAliasing;
    private C23051bf<Integer> enableBindItemCallOMSDK;
    private C23051bf<Boolean> enableCacheUserInsert;
    private C23051bf<Boolean> enableCacheUserList;
    private C23051bf<Boolean> enableFace2Face;
    private C23051bf<Boolean> enableLawWindow;
    private C23051bf<Boolean> enableMessagePb2Json;
    private C23051bf<Boolean> enableProfileActivityLink;
    private C23051bf<Boolean> enableShoppingUser;
    private C23051bf<Boolean> enableUltraResolution;
    private C23051bf<Boolean> enableUploadPC;
    private C23051bf<String> estr;
    private C23051bf<String> facebookAccessToken;
    private C23051bf<Long> festivalShareDonationTime;
    private C23051bf<Long> fetchUserCacheIntervals;
    private C23051bf<Integer> flashStatus;
    private C23051bf<Integer> followFeedAsDefault;
    private C23051bf<Boolean> followGuideShown;
    private C23051bf<Long> followNoticeCloseTime;
    private C23051bf<Integer> followUserThreshold;
    private C23051bf<Integer> friendTabAvatarDuation;
    private C23051bf<String> gameConfig;
    private C23051bf<Boolean> geckoLocalTestUseOnline;
    private C23051bf<String> googleServerAuthCode;
    private C23051bf<String> guardianChild;
    private C23051bf<String> guardianParent;
    private C23051bf<Integer> hardEncode;
    private C23051bf<Boolean> hasAlreadyShowBubble;
    private C23051bf<Boolean> hasEnterBindPhone;
    private C23051bf<Boolean> hasLongPressDislike;
    private C23051bf<Boolean> hasShowFilterGuide;
    private C23051bf<Boolean> hasShowRemarkNamePopup;
    private C23051bf<String> hitRankActivityProfileBackgroud;
    private C23051bf<String> hitRankActivityStarBackground;
    private C23051bf<Integer> hitRankActivityStatus;
    private C23051bf<Integer> hotSearchWordsShowInterval;
    private C23051bf<String> hotsoonDownloadUrl;
    private C23051bf<Integer> httpRetryCount;
    private C23051bf<Long> httpRetryInterval;
    private C23051bf<Long> httpTimeOut;
    private C23051bf<Boolean> iesOffline;
    private C23051bf<Boolean> imCommentForwardEnabled;
    private C23051bf<String> imCurrentLocaleLanguage;
    private C23051bf<String> imUrlTemplate;
    private C23051bf<Boolean> inUltraResBlackList;
    private C23051bf<Long> invitedAllTimeStamp;
    private C23051bf<String> invitedContacts;
    private C23051bf<Boolean> isAwemePrivate;
    private C23051bf<Boolean> isBubbleShown;
    private C23051bf<Boolean> isClickMoreRedPoint;
    private C23051bf<Boolean> isContactDialogShown;
    private C23051bf<Boolean> isContactsUploaded;
    private C23051bf<Boolean> isEnableLocalMusicEntrance;
    private C23051bf<Boolean> isEnableUpdateUserDialog;
    private C23051bf<Boolean> isEuropeCountry;
    private C23051bf<Boolean> isFirstFavouriteSuccess;
    private C23051bf<Boolean> isFirstLaunch;
    private C23051bf<Boolean> isFirstPublishAweme;
    private C23051bf<Boolean> isFirstPublishComment;
    private C23051bf<Boolean> isFirstPublishSync;
    private C23051bf<Boolean> isFirstReportVideo;
    private C23051bf<Boolean> isFirstSetPrivate;
    private C23051bf<Boolean> isFirstShowFavouriteAnimation;
    private C23051bf<Boolean> isFirstShowInsightsAnimation;
    private C23051bf<Integer> isForceHttps;
    private C23051bf<Boolean> isGrantedLocationPermission;
    private C23051bf<Boolean> isHotSearchAwemeBillboardEnable;
    private C23051bf<Boolean> isHotSearchBillboardEnable;
    private C23051bf<Boolean> isHotSearchMusicalBillboardEnable;
    private C23051bf<Boolean> isHotSearchPositiveEnergyBillboardEnable;
    private C23051bf<Boolean> isLike2DynamicBubbleHasShowed;
    private C23051bf<Integer> isNewInstall;
    private C23051bf<Boolean> isNpthEnable;
    private C23051bf<Boolean> isOb;
    private C23051bf<Boolean> isOldUser;
    private C23051bf<Boolean> isPoiBubbleShown;
    private C23051bf<Boolean> isPrivateAvailable;
    private C23051bf<Boolean> isProfileBubbleShown;
    private C23051bf<Boolean> isProfileNavbarBubbleShown;
    private C23051bf<Boolean> isPublishSyncToHuoshan;
    private C23051bf<Boolean> isPublishSyncToToutiao;
    private C23051bf<Integer> isPublishSyncToToutiaoNew;
    private C23051bf<Boolean> isShowAllowDownloadTipSetting;
    private C23051bf<Boolean> isShowFavouriteIcon;
    private C23051bf<Boolean> isShowFavouritePopup;
    private C23051bf<Boolean> isShowHotSearchVideoTip;
    private C23051bf<Boolean> isShowNearBy;
    private C23051bf<Boolean> isShowRankingIndicator;
    private C23051bf<Boolean> isShowSyncToToutiaoDialog;
    private C23051bf<Boolean> isShowUserFeedBackPoint;
    private C23051bf<Boolean> isSyncToHuoshan;
    private C23051bf<Boolean> isTargetBindingUser;
    private C23051bf<Boolean> isUseBackRefresh;
    private C23051bf<Boolean> isUseTTnet;
    private C23051bf<Boolean> isUseTongdunSdk;
    private C23051bf<Boolean> ischangeFollowTab;
    private C23051bf<String> jsActlogUrl;
    private C23051bf<String> judgementClauseScheme;
    private C23051bf<Long> lastCloseFeedUpdateUserDialog;
    private C23051bf<Long> lastCloseUpdateUserDialog;
    private C23051bf<Long> lastEnterProfileTime;
    private C23051bf<Long> lastFeedCount;
    private C23051bf<Long> lastFeedTime;
    private C23051bf<Long> lastFetchUserCacheIntervals;
    private C23051bf<Long> lastFilterTime;
    private C23051bf<Long> lastGetRelieveAwemeTime;
    private C23051bf<Long> lastHintToastTime;
    private C23051bf<Long> lastLockedTime;
    private C23051bf<Boolean> lastPublishFailed;
    private C23051bf<Long> lastShowBindHintTime;
    private C23051bf<Long> lastShowProfileBindHintTime;
    private C23051bf<Long> lastUnlockTime;
    private C23051bf<String> lastUploadPassCode;
    private C23051bf<Integer> lastUsableNetworkSpeed;
    private C23051bf<Boolean> liveAgreement;
    private C23051bf<Boolean> liveAnswer;
    private C23051bf<Boolean> liveContactsVerify;
    private C23051bf<Integer> liveCoverAuditFailedTimes;
    private C23051bf<Integer> liveCoverBubble;
    private C23051bf<Integer> liveCoverWarnChangeTimes;
    private C23051bf<Integer> liveDefaultBitrate;
    private C23051bf<Integer> liveMaxBitrate;
    private C23051bf<Integer> liveMinBitrate;
    private C23051bf<Boolean> liveSkylightHasShowAnimation;
    private C23051bf<Boolean> liveSkylightShowAnimation;
    private C23051bf<Boolean> longVideoPermitted;
    private C23051bf<Long> longVideoThreshold;
    private C23051bf<Set<String>> mGeckoChannels;
    private C23051bf<Set<String>> mGeckoInitialHighPriorityChannels;
    private C23051bf<Integer> mRnContextCreateTimeout;
    private C23051bf<Boolean> mRnPreloadContextOn;
    private C23051bf<Boolean> mRnSnapshotOn;
    private SharedPreferences mSharedPreferences;
    private C23051bf<Boolean> mUseNewPackageNow;
    private C23051bf<String> merchPickerUrl;
    private C23051bf<String> miniAppLabTitle;
    private C23051bf<Boolean> mockLiveMoney;
    private C23051bf<Boolean> mockLiveResolution;
    private C23051bf<Boolean> mockLiveSend;
    private C23051bf<String> mpTab;
    private C23051bf<Integer> multiSelectLimit;
    private C23051bf<String> musicBillboardRuleUrl;
    private C23051bf<String> musicRingtoneScheme;
    private C23051bf<Integer> musicianShowType;
    private C23051bf<String> needChooseLanguages;
    private C23051bf<Integer> networkLibType;
    private C23051bf<Boolean> newAnchorShowBubble;
    private C23051bf<String> newbieHelpShopUrl;
    private C23051bf<Long> normalGuideDisplayTimeIntervals;
    private C23051bf<Integer> normalGuideDisplayTimes;
    private C23051bf<Integer> noticeCountLatency;
    private C23051bf<String> openAppBackLogParams;
    private C23051bf<Integer> openImLink;
    private C23051bf<Long> operationGuideDisplayTimeIntervals;
    private C23051bf<Integer> operationGuideDisplayTimes;
    private C23051bf<String> orderShareIntroUrl;
    private C23051bf<String> orginalMusicianUrl;
    private C23051bf<Boolean> originalMusiciaShareStyle;
    private C23051bf<Boolean> originalMusicianEntry;
    private C23051bf<String> poiErrorReport;
    private C23051bf<String> poiMerchantUrl;
    private C23051bf<String> previewGoodReport;
    private C23051bf<Integer> privacyAccountFollowCount;
    private C23051bf<Integer> privacyDownloadSetting;
    private C23051bf<String> privacyReminderH5Url;
    private C23051bf<Float> profileCompletionThreshold;
    private C23051bf<Float> profilePerfectionAvatar;
    private C23051bf<Float> profilePerfectionBirthday;
    private C23051bf<Float> profilePerfectionGender;
    private C23051bf<Float> profilePerfectionLocation;
    private C23051bf<Float> profilePerfectionNickname;
    private C23051bf<Float> profilePerfectionSchool;
    private C23051bf<Float> profilePerfectionShortId;
    private C23051bf<Float> profilePerfectionSignature;
    private C23051bf<Long> progressbarThreshold;
    private C23051bf<Integer> promoteDialogPopupClickType;
    private C23051bf<String> promoteDialogPopupPopupContent;
    private C23051bf<Integer> promoteDialogPopupPopupInterval;
    private C23051bf<String> promoteDialogPopupPopupLinkText;
    private C23051bf<String> promoteDialogPopupPopupMsg;
    private C23051bf<String> promoteDialogPopupPopupTitle;
    private C23051bf<String> promoteDialogPopupPopupUrl;
    private C23051bf<Integer> promoteDialogPopupTimesLimit;
    private C23051bf<Boolean> promoteDialogShouldShow;
    private C23051bf<String> reactAddShopUrl;
    private C23051bf<String> reactEShopToolboxUrl;
    private List<String> recentList;
    private C23051bf<String> referralEntrance;
    private C23051bf<Integer> refreshZhima;
    private C23051bf<Boolean> removeFollowerSwitch;
    private C23051bf<String> requestNotificationText;
    private C23051bf<String> requestNotificationTitle;
    private C23051bf<Boolean> rnFallback;
    private C23051bf<String> sameCityActiveId;
    private C23051bf<Integer> scrollToProfileGuideState;
    private C23051bf<String> searchTabIndex;
    private C23051bf<String> searchTrendBannerUrl;
    private C23051bf<String> shareCookieCacheItem;
    private C23051bf<Boolean> shiledMusicSDK;
    private C23051bf<String> shopWishListUrl;
    private C23051bf<Boolean> shouldShowFavouriteTip;
    private C23051bf<Boolean> shouldShowPrivateAccountTipInProfile;
    private C23051bf<Boolean> showAdIntroFlag;
    private C23051bf<Boolean> showAddBusinessGoodsDot;
    private C23051bf<Integer> showBindHintCount;
    private C23051bf<Boolean> showCouponItem;
    private C23051bf<Integer> showCreatorRewards;
    private C23051bf<Boolean> showFansCard;
    private C23051bf<Integer> showHashTagBg;
    private C23051bf<Boolean> showInteractionStickers;
    private C23051bf<Boolean> showInvitedContactsFriends;
    private C23051bf<Integer> showJumpEffectAfterFollowCount;
    private C23051bf<Integer> showLiveRewards;
    private C23051bf<Integer> showLoginDialogState;
    private C23051bf<Boolean> showMiniAppFreshGuideBubble;
    private C23051bf<Boolean> showMiniAppFreshGuideDialog;
    private C23051bf<Boolean> showMiniAppFreshGuideNotify;
    private C23051bf<Boolean> showPlayerInfoUI;
    private C23051bf<Integer> showProfileBindHintCount;
    private C23051bf<Integer> showPromoteLicense;
    private C23051bf<Boolean> showTimeLineTab;
    private C23051bf<Boolean> showVideoBitrateInfo;
    private C23051bf<String> starAtlasOrderWebUrl;
    private C23051bf<String> starBillboardRuleUrl;
    private C23051bf<Boolean> stickerArtEntry;
    private C23051bf<String> stickerArtlistUrl;
    private C23051bf<String> storyFontType;
    private C23051bf<Integer> storyInfoStickerMaxCount;
    private C23051bf<Boolean> storyPublishFriendsDuoshanBanner;
    private C23051bf<Boolean> storyPublishSaveLocal;
    private C23051bf<Boolean> storyQuickPanelShowInActivity;
    private C23051bf<Boolean> storyRecordGuideShow;
    private C23051bf<String> storyRegisterPublishSyncHintContent;
    private C23051bf<String> storyRegisterPublishSyncHintH5Str;
    private C23051bf<String> storyRegisterPublishSyncHintH5Url;
    private C23051bf<String> storyRegisterPublishSyncHintTitle;
    private C23051bf<Boolean> storySettingDoudouPhoto;
    private C23051bf<Boolean> storySettingManualOpenDoudou;
    private C23051bf<Integer> storySettingReplyPermission;
    private C23051bf<Boolean> storySettingSyncDuoshan;
    private C23051bf<Integer> storySettingSyncToast;
    private C23051bf<Integer> storySettingViewPermission;
    private C23051bf<String> storyShakeLastTime;
    private C23051bf<Boolean> storyShakeSurpriseHintShow;
    private C23051bf<Long> storyStickerQuickPanelCloseTime;
    private C23051bf<Integer> storyTextStickerMaxCount;
    private C23051bf<String> storyUnRegisterPublishSyncHintContent;
    private C23051bf<String> storyUnRegisterPublishSyncHintH5Str;
    private C23051bf<String> storyUnRegisterPublishSyncHintH5Url;
    private C23051bf<String> storyUnRegisterPublishSyncHintTitle;
    private C23051bf<Integer> swipeDataCount;
    private C23051bf<Integer> syncTT;
    private C23051bf<Boolean> syncTTFirstPublish;
    private C23051bf<String> syncToTTUrl;
    private C23051bf<Float> syntheticVideoBitrate;
    private C23051bf<Integer> tapDataCount;
    private C23051bf<String> teenagerProtectionScheme;
    private C23051bf<Long> todayVideoPlayTime;
    private C23051bf<Boolean> ttRegion;
    private C23051bf<Boolean> ttRoute;
    private C23051bf<String> twitterAccessToken;
    private C23051bf<String> twitterSecret;
    private C23051bf<Integer> ultraResolutionLevel;
    private C23051bf<Integer> upGuideNum;
    private C23051bf<Integer> updateUserFrequency;
    private C23051bf<Integer> updateUserPosition;
    private C23051bf<String> updateUserTimeInfo;
    private C23051bf<String> updateUserTipContent;
    private C23051bf<Long> uploadContactsNoticeLastShowTime;
    private C23051bf<Integer> uploadContactsNoticeShowCount;
    private C23051bf<String> uploadContactsPolicyCaption;
    private C23051bf<Integer> uploadContactsPolicyInterval;
    private C23051bf<String> uploadContactsPolicyPic;
    private C23051bf<String> uploadContactsPolicyText;
    private C23051bf<Integer> uploadContactsPolicyTimes;
    private C23051bf<Boolean> useCronet;
    private C23051bf<Boolean> useDefaultHost;
    private C23051bf<Boolean> useHttps;
    private C23051bf<Integer> useLiveWallpaper;
    private C23051bf<Integer> useNewDouyinSaftyCenter;
    private C23051bf<Boolean> useNewFFmpeg;
    private C23051bf<Integer> useSyntheticHardcode;
    private C23051bf<String> userAddLanguages;
    private C23051bf<String> userCurrentRegion;
    private C23051bf<Boolean> userHasPassword;
    private C23051bf<String> userResidence;
    private C23051bf<Integer> verifyExceed;
    private C23051bf<Float> videoBitrate;
    private C23051bf<Integer> videoCommit;
    private C23051bf<Integer> videoCompose;
    private C23051bf<Boolean> videoPreload;
    private C23051bf<Integer> weakNetPreLoadSwitch;
    private C23051bf<Integer> x2cSwitch;

    /* renamed from: com.ss.android.ugc.aweme.app.SharePrefCache$a */
    static class C22834a {

        /* renamed from: a */
        public static SharePrefCache f61195a = new SharePrefCache();
    }

    public static SharePrefCache inst() {
        return C22834a.f61195a;
    }

    public SharedPreferences getSharePref() {
        return this.mSharedPreferences;
    }

    public boolean isOpenForward() {
        return false;
    }

    public int getArStickerFilterGuideTimes() {
        return ((Integer) getArStickerFliterTimesItem().mo47782d()).intValue();
    }

    public int getBeautyModel() {
        return ((Integer) getBeautyModelItem().mo47782d()).intValue();
    }

    public boolean getImCommentForwardEnabled() {
        return ((Boolean) getImCommentForwardEnabledItem().mo47782d()).booleanValue();
    }

    public String getImUrlTemplate() {
        return (String) getImUrlTemplateItem().mo47782d();
    }

    public boolean getIsFirstPublishAweme() {
        return ((Boolean) getFirstPublishAwemeItem().mo47782d()).booleanValue();
    }

    public boolean getIsFirstPublishComment() {
        return ((Boolean) getFirstPublishCommentItem().mo47782d()).booleanValue();
    }

    public long getLastInviteAllTimeStamp() {
        return ((Long) getLastInviteAllTimeStampItem().mo47782d()).longValue();
    }

    public int getMultiSelectLimit() {
        return ((Integer) getMultiSelectLimitItem().mo47782d()).intValue();
    }

    public int getNetworkLibType() {
        return ((Integer) getNetworkLibTypeItem().mo47782d()).intValue();
    }

    public int getOpenImLink() {
        return ((Integer) getOpenImLinkItem().mo47782d()).intValue();
    }

    public boolean isUseTTnet() {
        return ((Boolean) getIsUseTTnet().mo47782d()).booleanValue();
    }

    private C23051bf<Integer> getArStickerFliterTimesItem() {
        if (this.arStickerFliterTimes == null) {
            this.arStickerFliterTimes = new C23051bf<>("ar_sticker_filter_guide_times", Integer.valueOf(0));
            this.cacheItems.add(this.arStickerFliterTimes);
        }
        return this.arStickerFliterTimes;
    }

    private C23051bf<Boolean> getCanLive() {
        if (this.canLive == null) {
            this.canLive = new C23051bf<>("live_can_live", Boolean.valueOf(false));
            this.cacheItems.add(this.canLive);
        }
        return this.canLive;
    }

    private C23051bf<Boolean> getClickMoreRedPoint() {
        if (this.isClickMoreRedPoint == null) {
            this.isClickMoreRedPoint = new C23051bf<>("is_click_more_red_point", Boolean.valueOf(false));
            this.cacheItems.add(this.isClickMoreRedPoint);
        }
        return this.isClickMoreRedPoint;
    }

    private C23051bf<Boolean> getFirstPublishAwemeItem() {
        if (this.isFirstPublishAweme == null) {
            this.isFirstPublishAweme = new C23051bf<>("first_publish_aweme", Boolean.valueOf(true));
            this.cacheItems.add(this.isFirstPublishAweme);
        }
        return this.isFirstPublishAweme;
    }

    private C23051bf<Boolean> getFirstPublishCommentItem() {
        if (this.isFirstPublishComment == null) {
            this.isFirstPublishComment = new C23051bf<>("first_publish_comment", Boolean.valueOf(true));
            this.cacheItems.add(this.isFirstPublishComment);
        }
        return this.isFirstPublishComment;
    }

    private C23051bf<Boolean> getHasShowFilterGuideItem() {
        if (this.hasShowFilterGuide == null) {
            this.hasShowFilterGuide = new C23051bf<>("live_show_filter_guide", Boolean.valueOf(false));
            this.cacheItems.add(this.hasShowFilterGuide);
        }
        return this.hasShowFilterGuide;
    }

    private C23051bf<Integer> getShowCreatorRewards() {
        if (this.showCreatorRewards == null) {
            this.showCreatorRewards = new C23051bf<>("show_creator_rewards", Integer.valueOf(0));
            this.cacheItems.add(this.showCreatorRewards);
        }
        return this.showCreatorRewards;
    }

    private C23051bf<Integer> getShowLiveRewards() {
        if (this.showLiveRewards == null) {
            this.showLiveRewards = new C23051bf<>("show_live_rewards", Integer.valueOf(0));
            this.cacheItems.add(this.showLiveRewards);
        }
        return this.showLiveRewards;
    }

    public void clearCache() {
        collectAllItemsIfNeed();
        for (C23051bf b : this.cacheItems) {
            b.mo47778b();
        }
    }

    public C23051bf<String> getAccessToken() {
        if (this.accessToken == null) {
            this.accessToken = new C23051bf<>("access_token", "");
            this.cacheItems.add(this.accessToken);
        }
        return this.accessToken;
    }

    public C23051bf<Integer> getAdDisplayTimemit() {
        if (this.adDisplayTimemit == null) {
            this.adDisplayTimemit = new C23051bf<>("ad_display_time", Integer.valueOf(3));
            this.cacheItems.add(this.adDisplayTimemit);
        }
        return this.adDisplayTimemit;
    }

    public C23051bf<String> getAdIntroUrlItem() {
        if (this.adIntroUrl == null) {
            this.adIntroUrl = new C23051bf<>("ad_intro_url", "");
            this.cacheItems.add(this.adIntroUrl);
        }
        return this.adIntroUrl;
    }

    public C23051bf<String> getAdLandingPageConfig() {
        if (this.adLandingPageConfig == null) {
            this.adLandingPageConfig = new C23051bf<>("ad_landing_page_config", "");
            this.cacheItems.add(this.adLandingPageConfig);
        }
        return this.adLandingPageConfig;
    }

    public C23051bf<String> getAdSouthNorthFirstSupportTeam() {
        if (this.adSouthNorthFirstSupportTeam == null) {
            this.adSouthNorthFirstSupportTeam = new C23051bf<>("ad_south_north_support_team", "");
        }
        return this.adSouthNorthFirstSupportTeam;
    }

    public C23051bf<Long> getAdSouthNorthFirstSupportTime() {
        if (this.adSouthNorthFirstSupportTime == null) {
            this.adSouthNorthFirstSupportTime = new C23051bf<>("ad_south_north_support_time", Long.valueOf(0));
        }
        return this.adSouthNorthFirstSupportTime;
    }

    public C23051bf<String> getAppEnterForegroundTime() {
        if (this.updateUserTimeInfo == null) {
            this.updateUserTimeInfo = new C23051bf<>("update_user_time_info", "");
            this.cacheItems.add(this.updateUserTimeInfo);
        }
        return this.updateUserTimeInfo;
    }

    public C23051bf<Integer> getAppStoreScoreSection() {
        if (this.appStoreScoreSection == null) {
            this.appStoreScoreSection = new C23051bf<>("APP_STORE_SCORE_SECTION", Integer.valueOf(7));
            this.cacheItems.add(this.appStoreScoreSection);
        }
        return this.appStoreScoreSection;
    }

    public C23051bf<Integer> getAppStoreScoreSwitch() {
        if (this.appStoreScoreSwitch == null) {
            this.appStoreScoreSwitch = new C23051bf<>("APP_STORE_SCORE_SWITCH", Integer.valueOf(1));
            this.cacheItems.add(this.appStoreScoreSwitch);
        }
        return this.appStoreScoreSwitch;
    }

    public C23051bf<Integer> getAppStoreScoreThreshold() {
        if (this.appStoreScoreThreshold == null) {
            this.appStoreScoreThreshold = new C23051bf<>("APP_STORE_SCORE_THRESHOLD", Integer.valueOf(3));
            this.cacheItems.add(this.appStoreScoreThreshold);
        }
        return this.appStoreScoreThreshold;
    }

    public C23051bf<Integer> getAtFriendsShowType() {
        if (this.atFriendsShowType == null) {
            this.atFriendsShowType = new C23051bf<>("at_friends_show_type", Integer.valueOf(0));
            this.cacheItems.add(this.atFriendsShowType);
        }
        return this.atFriendsShowType;
    }

    public C23051bf<Boolean> getAutoSaveVideo() {
        if (this.autoSaveVideo == null) {
            this.autoSaveVideo = new C23051bf<>("auto_save_video", Boolean.valueOf(true));
            this.cacheItems.add(this.autoSaveVideo);
        }
        return this.autoSaveVideo;
    }

    public C23051bf<Boolean> getAutoSendTwitter() {
        if (this.autoSendTwitter == null) {
            this.autoSendTwitter = new C23051bf<>("auto_send_twitter", Boolean.valueOf(false));
            this.cacheItems.add(this.autoSendTwitter);
        }
        return this.autoSendTwitter;
    }

    public C23051bf<Integer> getBeautyModelItem() {
        if (this.beautyModel == null) {
            this.beautyModel = new C23051bf<>("beauty_model", Integer.valueOf(0));
            this.cacheItems.add(this.beautyModel);
        }
        return this.beautyModel;
    }

    public C23051bf<String> getBillboardFansScheme() {
        if (this.billboardFansScheme == null) {
            this.billboardFansScheme = new C23051bf<>("billboard_fans_scheme", "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Fbillboard_fans%3Fhide_nav_bar%3D1&hide_nav_bar=1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Dfe_app_rn_patch%26bundle_name%3Dfe_app_rn%26module_name%3Dpage_billboard_fans%26hide_nav_bar%3D1%26bg_theme%3D%2523161823%26loading_bgcolor%3D%2523161823");
            this.cacheItems.add(this.billboardFansScheme);
        }
        return this.billboardFansScheme;
    }

    public C23051bf<String> getBillboardStarScheme() {
        if (this.billboardStarScheme == null) {
            this.billboardStarScheme = new C23051bf<>("billboard_star_scheme", "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Fbillboard_star%3Fhide_nav_bar%3D1&hide_nav_bar=1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Dfe_app_rn_patch%26bundle_name%3Dfe_app_rn%26module_name%3Dpage_billboard_star%26hide_nav_bar%3D1");
            this.cacheItems.add(this.billboardStarScheme);
        }
        return this.billboardStarScheme;
    }

    public C23051bf<Integer> getBodyDanceGuideTimes() {
        if (this.bodyDanceGuideTimes == null) {
            this.bodyDanceGuideTimes = new C23051bf<>("body_dance_guide_times", Integer.valueOf(0));
            this.cacheItems.add(this.bodyDanceGuideTimes);
        }
        return this.bodyDanceGuideTimes;
    }

    public C23051bf<String> getBrandScheme() {
        if (this.brandScheme == null) {
            this.brandScheme = new C23051bf<>("brand_scheme", "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Fbrand_rank%3Fhide_nav_bar%3D1&hide_nav_bar=1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Furl%3Dhttps%253A%252F%252Faweme.snssdk.com%252Ffalcon%252Frn%252Fbrand_rank%26channel_name%3Dfe_app_rn_patch%26bundle_name%3Dfe_app_rn%26module_name%3Dpage_brand_rank%26hide_nav_bar%3D1");
            this.cacheItems.add(this.brandScheme);
        }
        return this.brandScheme;
    }

    public C23051bf<Boolean> getCanCreateInsights() {
        if (this.canCreateInsights == null) {
            this.canCreateInsights = new C23051bf<>("can_create_insights", Boolean.valueOf(false));
            this.cacheItems.add(this.canCreateInsights);
        }
        return this.canCreateInsights;
    }

    public C23051bf<Integer> getCanIm() {
        if (this.canIm == null) {
            this.canIm = new C23051bf<>("im_can_im", Integer.valueOf(1));
            this.cacheItems.add(this.canIm);
        }
        return this.canIm;
    }

    public C23051bf<Integer> getCanImSendPic() {
        if (this.canImSendPic == null) {
            this.canImSendPic = new C23051bf<>("im_can_send_pic", Integer.valueOf(0));
            this.cacheItems.add(this.canImSendPic);
        }
        return this.canImSendPic;
    }

    public C23051bf<Boolean> getClickGuideShown() {
        if (this.clickGuideShown == null) {
            this.clickGuideShown = new C23051bf<>("click_guide_shown", Boolean.valueOf(false));
            this.cacheItems.add(this.clickGuideShown);
        }
        return this.clickGuideShown;
    }

    public C23051bf<Boolean> getCommerceLiveCompatibleOld() {
        if (this.commerceLiveCompatibleOld == null) {
            this.commerceLiveCompatibleOld = new C23051bf<>("capatible_with_old_version", Boolean.valueOf(false));
            this.cacheItems.add(this.commerceLiveCompatibleOld);
        }
        return this.commerceLiveCompatibleOld;
    }

    public C23051bf<Integer> getCompleteProfilePolicyInterval() {
        if (this.completeProfilePolicyInterval == null) {
            this.completeProfilePolicyInterval = new C23051bf<>("completeprofilepolicy_interval", Integer.valueOf(0));
            this.cacheItems.add(this.completeProfilePolicyInterval);
        }
        return this.completeProfilePolicyInterval;
    }

    public C23051bf<Integer> getCompleteProfilePolicyTimes() {
        if (this.completeProfilePolicyTimes == null) {
            this.completeProfilePolicyTimes = new C23051bf<>("completeprofilepolicy_times", Integer.valueOf(0));
            this.cacheItems.add(this.completeProfilePolicyTimes);
        }
        return this.completeProfilePolicyTimes;
    }

    public C23051bf<Boolean> getConfirmUploadContacts() {
        if (this.confirmUploadContacts == null) {
            this.confirmUploadContacts = new C23051bf<>("confirm_upload_contacts", Boolean.valueOf(false));
            this.cacheItems.add(this.confirmUploadContacts);
        }
        return this.confirmUploadContacts;
    }

    public C23051bf<Long> getContactsUploadedLastTime() {
        if (this.contactsUploadedLastTime == null) {
            this.contactsUploadedLastTime = new C23051bf<>("contacts_uploaded_last_time", Long.valueOf(0));
            this.cacheItems.add(this.contactsUploadedLastTime);
        }
        return this.contactsUploadedLastTime;
    }

    public C23051bf<String> getCurrentLocaleLanguage() {
        if (this.imCurrentLocaleLanguage == null) {
            this.imCurrentLocaleLanguage = new C23051bf<>("im_current_locale", Locale.CHINESE.getLanguage());
            this.cacheItems.add(this.imCurrentLocaleLanguage);
        }
        return this.imCurrentLocaleLanguage;
    }

    public C23051bf<Boolean> getDebugWebBar() {
        if (this.debugWebBar == null) {
            this.debugWebBar = new C23051bf<>("debug_web_bar", Boolean.valueOf(true));
            this.cacheItems.add(this.debugWebBar);
        }
        return this.debugWebBar;
    }

    public C23051bf<Set<String>> getDefaultAvatarUrl() {
        if (this.defaultAvatarUrl == null) {
            this.defaultAvatarUrl = new C23051bf<>("default_avatarurl", new HashSet());
            this.cacheItems.add(this.defaultAvatarUrl);
        }
        return this.defaultAvatarUrl;
    }

    public C23051bf<String> getDeviceInfoUrl() {
        if (this.deviceInfoUrl == null) {
            this.deviceInfoUrl = new C23051bf<>("fp_upload_device_url", "");
            this.cacheItems.add(this.deviceInfoUrl);
        }
        return this.deviceInfoUrl;
    }

    public C23051bf<Boolean> getDeviceMonitor() {
        if (this.deviceMonitor == null) {
            this.deviceMonitor = new C23051bf<>("device_monitor", Boolean.valueOf(true));
            this.cacheItems.add(this.deviceMonitor);
        }
        return this.deviceMonitor;
    }

    public C23051bf<String> getDialogContent() {
        if (this.dialogContent == null) {
            this.dialogContent = new C23051bf<>("dialog_content", "");
            this.cacheItems.add(this.dialogContent);
        }
        return this.dialogContent;
    }

    public C23051bf<String> getDialogSlogan() {
        if (this.dialogSlogan == null) {
            this.dialogSlogan = new C23051bf<>("dialog_slogan", "");
            this.cacheItems.add(this.dialogSlogan);
        }
        return this.dialogSlogan;
    }

    public C23051bf<String> getDialogTitle() {
        if (this.dialogTitle == null) {
            this.dialogTitle = new C23051bf<>("dialog_title", "");
            this.cacheItems.add(this.dialogTitle);
        }
        return this.dialogTitle;
    }

    public C23051bf<Integer> getDialogType() {
        if (this.dialogType == null) {
            this.dialogType = new C23051bf<>("dialog_type", Integer.valueOf(0));
            this.cacheItems.add(this.dialogType);
        }
        return this.dialogType;
    }

    public C23051bf<String> getDialogUrl() {
        if (this.dialogUrl == null) {
            this.dialogUrl = new C23051bf<>("dialog_url", "");
            this.cacheItems.add(this.dialogUrl);
        }
        return this.dialogUrl;
    }

    public C23051bf<Integer> getDisableTaobao() {
        if (this.disableTaobao == null) {
            this.disableTaobao = new C23051bf<>("disable_taobao", Integer.valueOf(0));
            this.cacheItems.add(this.disableTaobao);
        }
        return this.disableTaobao;
    }

    public C23051bf<String> getDouyinCardScheme() {
        if (this.douyinCardScheme == null) {
            this.douyinCardScheme = new C23051bf<>("douyin_card_scheme", "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Fdouyin_card%3Fhide_nav_bar%3D1%26media_source%3Ddouyin&hide_nav_bar=1&media_source=douyin&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Dfe_app_rn_patch%26bundle_name%3Dfe_app_rn%26module_name%3Dpage_douyin_card%26hide_nav_bar%3D1%26media_source%3Ddouyin");
            this.cacheItems.add(this.douyinCardScheme);
        }
        return this.douyinCardScheme;
    }

    public C23051bf<String> getDownloadForbiddenToast() {
        if (this.downloadForbiddenToast == null) {
            this.downloadForbiddenToast = new C23051bf<>("download_forbidden_toast", "");
            this.cacheItems.add(this.downloadForbiddenToast);
        }
        return this.downloadForbiddenToast;
    }

    public C23051bf<Integer> getDownloadMicroApp() {
        if (this.downloadMicroApp == null) {
            this.downloadMicroApp = new C23051bf<>("download_micro_app", Integer.valueOf(1));
            this.cacheItems.add(this.downloadMicroApp);
        }
        return this.downloadMicroApp;
    }

    public C23051bf<String> getDownloadSdkConfig() {
        if (this.downloadSdkConfig == null) {
            this.downloadSdkConfig = new C23051bf<>("download_sdk_config", "");
            this.cacheItems.add(this.downloadSdkConfig);
        }
        return this.downloadSdkConfig;
    }

    public C23051bf<Boolean> getDownloadStatusWhenPublish() {
        if (this.downloadStatusWhenPublish == null) {
            this.downloadStatusWhenPublish = new C23051bf<>("download_status_when_publish", Boolean.valueOf(true));
        }
        return this.downloadStatusWhenPublish;
    }

    public C23051bf<Boolean> getEableUltraResolution() {
        if (this.enableUltraResolution == null) {
            this.enableUltraResolution = new C23051bf<>("enable_ultra_resolution", Boolean.valueOf(false));
            this.cacheItems.add(this.enableUltraResolution);
        }
        return this.enableUltraResolution;
    }

    public C23051bf<Boolean> getEnableAntiAliasing() {
        if (this.enableAntiAliasing == null) {
            this.enableAntiAliasing = new C23051bf<>("enable_anti_aliasing", Boolean.valueOf(false));
            this.cacheItems.add(this.enableAntiAliasing);
        }
        return this.enableAntiAliasing;
    }

    public C23051bf<Integer> getEnableBindItemCallOMSDK() {
        if (this.enableBindItemCallOMSDK == null) {
            this.enableBindItemCallOMSDK = new C23051bf<>("enableBindItemCallOMSDK", Integer.valueOf(0));
            this.cacheItems.add(this.enableBindItemCallOMSDK);
        }
        return this.enableBindItemCallOMSDK;
    }

    public C23051bf<Boolean> getEnableFace2Face() {
        if (this.enableFace2Face == null) {
            this.enableFace2Face = new C23051bf<>("enable_face_to_face", Boolean.valueOf(true));
            this.cacheItems.add(this.enableFace2Face);
        }
        return this.enableFace2Face;
    }

    public C23051bf<Boolean> getEnableProfileActivityLink() {
        if (this.enableProfileActivityLink == null) {
            this.enableProfileActivityLink = new C23051bf<>("enable_profile_link", Boolean.valueOf(false));
            this.cacheItems.add(this.enableProfileActivityLink);
        }
        return this.enableProfileActivityLink;
    }

    public C23051bf<Boolean> getEnableUploadPC() {
        if (this.enableUploadPC == null) {
            this.enableUploadPC = new C23051bf<>("enableuploadpc", Boolean.valueOf(true));
            this.cacheItems.add(this.enableUploadPC);
        }
        return this.enableUploadPC;
    }

    public C23051bf<String> getEstr() {
        if (this.estr == null) {
            this.estr = new C23051bf<>("estr", "a3668f0afac72ca3f6c1697d29e0e1bb1fef4ab0285319b95ac39fa42c38d05f");
            this.cacheItems.add(this.estr);
        }
        return this.estr;
    }

    public C23051bf<String> getFacebookAccessToken() {
        if (this.facebookAccessToken == null) {
            this.facebookAccessToken = new C23051bf<>("facebook_access_token", "");
            this.cacheItems.add(this.facebookAccessToken);
        }
        return this.facebookAccessToken;
    }

    public C23051bf<Long> getFestivalShareDonationTime() {
        if (this.festivalShareDonationTime == null) {
            this.festivalShareDonationTime = new C23051bf<>("festival_share_donation_time", Long.valueOf(0));
            this.cacheItems.add(this.festivalShareDonationTime);
        }
        return this.festivalShareDonationTime;
    }

    public C23051bf<Long> getFetchUserCacheIntervals() {
        if (this.fetchUserCacheIntervals == null) {
            this.fetchUserCacheIntervals = new C23051bf<>("fetch_user_cache_intervals", Long.valueOf(0));
            this.cacheItems.add(this.fetchUserCacheIntervals);
        }
        return this.fetchUserCacheIntervals;
    }

    public C23051bf<Integer> getFlashStatus() {
        if (this.flashStatus == null) {
            this.flashStatus = new C23051bf<>("flash_status", Integer.valueOf(0));
            this.cacheItems.add(this.flashStatus);
        }
        return this.flashStatus;
    }

    public C23051bf<Integer> getFollowFeedAsDefault() {
        if (this.followFeedAsDefault == null) {
            this.followFeedAsDefault = new C23051bf<>("follow_feed_as_default", Integer.valueOf(0));
            this.cacheItems.add(this.followFeedAsDefault);
        }
        return this.followFeedAsDefault;
    }

    public C23051bf<Boolean> getFollowGuideShown() {
        if (this.followGuideShown == null) {
            this.followGuideShown = new C23051bf<>("follow_guide_shown", Boolean.valueOf(false));
            this.cacheItems.add(this.followGuideShown);
        }
        return this.followGuideShown;
    }

    public C23051bf<Long> getFollowNoticeCloseTime() {
        if (this.followNoticeCloseTime == null) {
            this.followNoticeCloseTime = new C23051bf<>("follow_notice_close_time", Long.valueOf(0));
            this.cacheItems.add(this.followNoticeCloseTime);
        }
        return this.followNoticeCloseTime;
    }

    public C23051bf<Integer> getFollowUserThreshold() {
        if (this.followUserThreshold == null) {
            this.followUserThreshold = new C23051bf<>("show_follow_tab_following_limit", Integer.valueOf(1));
            this.cacheItems.add(this.followUserThreshold);
        }
        return this.followUserThreshold;
    }

    public C23051bf<Integer> getFriendTabAvatarDuation() {
        if (this.friendTabAvatarDuation == null) {
            this.friendTabAvatarDuation = new C23051bf<>("friend_tab_avatar_duration", Integer.valueOf(0));
            this.cacheItems.add(this.friendTabAvatarDuation);
        }
        return this.friendTabAvatarDuation;
    }

    public C23051bf<String> getGameConfig() {
        if (this.gameConfig == null) {
            this.gameConfig = new C23051bf<>("aweme_game_config", "");
            this.cacheItems.add(this.gameConfig);
        }
        return this.gameConfig;
    }

    public C23051bf<Set<String>> getGeckoChannels() {
        if (this.mGeckoChannels == null) {
            this.mGeckoChannels = new C23051bf<>("gecko_init_channels", new HashSet());
            this.cacheItems.add(this.mGeckoChannels);
        }
        return this.mGeckoChannels;
    }

    public C23051bf<Set<String>> getGeckoInitialHighPriorityChannels() {
        if (this.mGeckoInitialHighPriorityChannels == null) {
            this.mGeckoInitialHighPriorityChannels = new C23051bf<>("initial_high_priority_channel", new HashSet());
            this.cacheItems.add(this.mGeckoInitialHighPriorityChannels);
        }
        return this.mGeckoInitialHighPriorityChannels;
    }

    public C23051bf<Boolean> getGeckoLocalTestUseOnline() {
        if (this.geckoLocalTestUseOnline == null) {
            this.geckoLocalTestUseOnline = new C23051bf<>("gecko_local_test_use_online", Boolean.valueOf(false));
            this.cacheItems.add(this.geckoLocalTestUseOnline);
        }
        return this.geckoLocalTestUseOnline;
    }

    public C23051bf<String> getGoogleServerAuthCode() {
        if (this.googleServerAuthCode == null) {
            this.googleServerAuthCode = new C23051bf<>("google_server_auth_code", "");
            this.cacheItems.add(this.googleServerAuthCode);
        }
        return this.googleServerAuthCode;
    }

    public C23051bf<String> getGuardianChildScheme() {
        if (this.guardianChild == null) {
            this.guardianChild = new C23051bf<>("guardian_child", C23033au.m56551b());
            this.cacheItems.add(this.guardianChild);
        }
        return this.guardianChild;
    }

    public C23051bf<String> getGuardianParentScheme() {
        if (this.guardianParent == null) {
            this.guardianParent = new C23051bf<>("guardian_parent", C23033au.m56550a());
            this.cacheItems.add(this.guardianParent);
        }
        return this.guardianParent;
    }

    public C23051bf<Integer> getHardEncode() {
        if (this.hardEncode == null) {
            this.hardEncode = new C23051bf<>("hard_encode", Integer.valueOf(0));
            this.cacheItems.add(this.hardEncode);
        }
        return this.hardEncode;
    }

    public C23051bf<Boolean> getHasAlreadyShowBubble() {
        if (this.hasAlreadyShowBubble == null) {
            this.hasAlreadyShowBubble = new C23051bf<>("has_already_show_bubble", Boolean.valueOf(false));
            this.cacheItems.add(this.hasAlreadyShowBubble);
        }
        return this.hasAlreadyShowBubble;
    }

    public C23051bf<Boolean> getHasEnterBindPhone() {
        if (this.hasEnterBindPhone == null) {
            this.hasEnterBindPhone = new C23051bf<>("has_enter_bind_phone", Boolean.valueOf(false));
            this.cacheItems.add(this.hasEnterBindPhone);
        }
        return this.hasEnterBindPhone;
    }

    public C23051bf<Boolean> getHasLongPressDislike() {
        if (this.hasLongPressDislike == null) {
            this.hasLongPressDislike = new C23051bf<>("has_long_pressed_dislike", Boolean.valueOf(false));
            this.cacheItems.add(this.hasLongPressDislike);
        }
        return this.hasLongPressDislike;
    }

    public C23051bf<Boolean> getHasShowRemarkNamePopup() {
        if (this.hasShowRemarkNamePopup == null) {
            this.hasShowRemarkNamePopup = new C23051bf<>("is_show_remarkname_popup", Boolean.valueOf(false));
            this.cacheItems.add(this.hasShowRemarkNamePopup);
        }
        return this.hasShowRemarkNamePopup;
    }

    public C23051bf<String> getHitRankActivityProfileBackground() {
        if (this.hitRankActivityProfileBackgroud == null) {
            this.hitRankActivityProfileBackgroud = new C23051bf<>("HIT_RANK_ACTIVITY_PROFILE_BACKGROUND", "");
            this.cacheItems.add(this.hitRankActivityProfileBackgroud);
        }
        return this.hitRankActivityProfileBackgroud;
    }

    public C23051bf<String> getHitRankActivityStarBackground() {
        if (this.hitRankActivityStarBackground == null) {
            this.hitRankActivityStarBackground = new C23051bf<>("hit_rank_activity_star_background", "");
            this.cacheItems.add(this.hitRankActivityStarBackground);
        }
        return this.hitRankActivityStarBackground;
    }

    public C23051bf<Integer> getHitRankActivityStatus() {
        if (this.hitRankActivityStatus == null) {
            this.hitRankActivityStatus = new C23051bf<>("hit_rank_activity_status", Integer.valueOf(0));
            this.cacheItems.add(this.hitRankActivityStatus);
        }
        return this.hitRankActivityStatus;
    }

    public C23051bf<Integer> getHotSearchWordsShowInterval() {
        if (this.hotSearchWordsShowInterval == null) {
            this.hotSearchWordsShowInterval = new C23051bf<>("hot_search_words_show_interval", Integer.valueOf(2));
            this.cacheItems.add(this.hotSearchWordsShowInterval);
        }
        return this.hotSearchWordsShowInterval;
    }

    public C23051bf<String> getHotsoonDownloadUrl() {
        if (this.hotsoonDownloadUrl == null) {
            this.hotsoonDownloadUrl = new C23051bf<>("hotsoon_download_url", "");
            this.cacheItems.add(this.hotsoonDownloadUrl);
        }
        return this.hotsoonDownloadUrl;
    }

    public C23051bf<Integer> getHttpRetryCount() {
        if (this.httpRetryCount == null) {
            this.httpRetryCount = new C23051bf<>("http_retry_count", Integer.valueOf(3));
            this.cacheItems.add(this.httpRetryCount);
        }
        return this.httpRetryCount;
    }

    public C23051bf<Long> getHttpRetryInterval() {
        if (this.httpRetryInterval == null) {
            this.httpRetryInterval = new C23051bf<>("http_retry_interval", Long.valueOf(500));
            this.cacheItems.add(this.httpRetryInterval);
        }
        return this.httpRetryInterval;
    }

    public C23051bf<Long> getHttpTimeOut() {
        if (this.httpTimeOut == null) {
            this.httpTimeOut = new C23051bf<>("http_timeout", Long.valueOf(5000));
            this.cacheItems.add(this.httpTimeOut);
        }
        return this.httpTimeOut;
    }

    public C23051bf<Boolean> getIesOffline() {
        if (this.iesOffline == null) {
            this.iesOffline = new C23051bf<>("iesoffline", Boolean.valueOf(true));
            this.cacheItems.add(this.iesOffline);
        }
        return this.iesOffline;
    }

    public C23051bf<Boolean> getImCommentForwardEnabledItem() {
        if (this.imCommentForwardEnabled == null) {
            this.imCommentForwardEnabled = new C23051bf<>("im_comment_forward_enabled", Boolean.valueOf(true));
            this.cacheItems.add(this.imCommentForwardEnabled);
        }
        return this.imCommentForwardEnabled;
    }

    public C23051bf<String> getImUrlTemplateItem() {
        if (this.imUrlTemplate == null) {
            this.imUrlTemplate = new C23051bf<>("im_url_template", "");
            this.cacheItems.add(this.imUrlTemplate);
        }
        return this.imUrlTemplate;
    }

    public C23051bf<String> getInvitedContacts() {
        if (this.invitedContacts == null) {
            this.invitedContacts = new C23051bf<>("invite_friends", "");
            this.cacheItems.add(this.invitedContacts);
        }
        return this.invitedContacts;
    }

    public C23051bf<Boolean> getIsAwemePrivate() {
        if (this.isAwemePrivate == null) {
            this.isAwemePrivate = new C23051bf<>("is_aweme_private", Boolean.valueOf(false));
            this.cacheItems.add(this.isAwemePrivate);
        }
        return this.isAwemePrivate;
    }

    public C23051bf<Boolean> getIsBubbleShown() {
        if (this.isBubbleShown == null) {
            this.isBubbleShown = new C23051bf<>("bubble_shown", Boolean.valueOf(false));
            this.cacheItems.add(this.isBubbleShown);
        }
        return this.isBubbleShown;
    }

    public C23051bf<Boolean> getIsChangeFollowTab() {
        if (this.ischangeFollowTab == null) {
            this.ischangeFollowTab = new C23051bf<>("is_change_follow_tab", Boolean.valueOf(false));
            this.cacheItems.add(this.ischangeFollowTab);
        }
        return this.ischangeFollowTab;
    }

    public C23051bf<Boolean> getIsContactsUploaded() {
        if (this.isContactsUploaded == null) {
            this.isContactsUploaded = new C23051bf<>("contacts_uploaded", Boolean.valueOf(false));
            this.cacheItems.add(this.isContactsUploaded);
        }
        return this.isContactsUploaded;
    }

    public C23051bf<Boolean> getIsEnableCacheUserInsert() {
        if (this.enableCacheUserInsert == null) {
            this.enableCacheUserInsert = new C23051bf<>("enable_cache_user_insert", Boolean.valueOf(false));
            this.cacheItems.add(this.enableCacheUserInsert);
        }
        return this.enableCacheUserInsert;
    }

    public C23051bf<Boolean> getIsEnableCacheUserList() {
        if (this.enableCacheUserList == null) {
            this.enableCacheUserList = new C23051bf<>("enable_cache_user_list", Boolean.valueOf(false));
            this.cacheItems.add(this.enableCacheUserList);
        }
        return this.enableCacheUserList;
    }

    public C23051bf<Boolean> getIsEnableLocalMusicEntrance() {
        if (this.isEnableLocalMusicEntrance == null) {
            this.isEnableLocalMusicEntrance = new C23051bf<>("is_enable_local_music_entrance", Boolean.valueOf(false));
            this.cacheItems.add(this.isEnableLocalMusicEntrance);
        }
        return this.isEnableLocalMusicEntrance;
    }

    public C23051bf<Boolean> getIsEnableUpdateUserDialog() {
        if (this.isEnableUpdateUserDialog == null) {
            this.isEnableUpdateUserDialog = new C23051bf<>("is_enable_update_user", Boolean.valueOf(false));
            this.cacheItems.add(this.isEnableUpdateUserDialog);
        }
        return this.isEnableUpdateUserDialog;
    }

    public C23051bf<Boolean> getIsFirstFavouriteSuccess() {
        if (this.isFirstFavouriteSuccess == null) {
            this.isFirstFavouriteSuccess = new C23051bf<>("first_favourite_success", Boolean.valueOf(false));
            this.cacheItems.add(this.isFirstFavouriteSuccess);
        }
        return this.isFirstFavouriteSuccess;
    }

    public C23051bf<Boolean> getIsFirstLaunch() {
        if (this.isFirstLaunch == null) {
            this.isFirstLaunch = new C23051bf<>("is_first_lauch", Boolean.valueOf(true));
            this.cacheItems.add(this.isFirstLaunch);
        }
        return this.isFirstLaunch;
    }

    public C23051bf<Boolean> getIsFirstReportVideo() {
        if (this.isFirstReportVideo == null) {
            this.isFirstReportVideo = new C23051bf<>("is_first_report_video", Boolean.valueOf(true));
            this.cacheItems.add(this.isFirstReportVideo);
        }
        return this.isFirstReportVideo;
    }

    public C23051bf<Boolean> getIsFirstSetPrivate() {
        if (this.isFirstSetPrivate == null) {
            this.isFirstSetPrivate = new C23051bf<>("first_set_aweme_private", Boolean.valueOf(true));
            this.cacheItems.add(this.isFirstSetPrivate);
        }
        return this.isFirstSetPrivate;
    }

    public C23051bf<Boolean> getIsFirstShowFavouriteAnimation() {
        if (this.isFirstShowFavouriteAnimation == null) {
            this.isFirstShowFavouriteAnimation = new C23051bf<>("first_show_favourite_animation", Boolean.valueOf(false));
            this.cacheItems.add(this.isFirstShowFavouriteAnimation);
        }
        return this.isFirstShowFavouriteAnimation;
    }

    public C23051bf<Integer> getIsForceHttps() {
        if (this.isForceHttps == null) {
            this.isForceHttps = new C23051bf<>("isforcehttps", Integer.valueOf(0));
            this.cacheItems.add(this.isForceHttps);
        }
        return this.isForceHttps;
    }

    public C23051bf<Boolean> getIsGrantedLocationPermission() {
        if (this.isGrantedLocationPermission == null) {
            this.isGrantedLocationPermission = new C23051bf<>("location_granted", Boolean.valueOf(false));
            this.cacheItems.add(this.isGrantedLocationPermission);
        }
        return this.isGrantedLocationPermission;
    }

    public C23051bf<Boolean> getIsHotSearchAwemeBillboardEnable() {
        if (this.isHotSearchAwemeBillboardEnable == null) {
            this.isHotSearchAwemeBillboardEnable = new C23051bf<>("is_hot_search_aweme_billboard_enable", Boolean.valueOf(false));
            this.cacheItems.add(this.isHotSearchAwemeBillboardEnable);
        }
        return this.isHotSearchAwemeBillboardEnable;
    }

    public C23051bf<Boolean> getIsHotSearchBillboardEnable() {
        if (this.isHotSearchBillboardEnable == null) {
            this.isHotSearchBillboardEnable = new C23051bf<>("is_hot_search_billboard_enable", Boolean.valueOf(false));
            this.cacheItems.add(this.isHotSearchBillboardEnable);
        }
        return this.isHotSearchBillboardEnable;
    }

    public C23051bf<Boolean> getIsHotSearchMusicalBillboardEnable() {
        if (this.isHotSearchMusicalBillboardEnable == null) {
            this.isHotSearchMusicalBillboardEnable = new C23051bf<>("is_hot_search_music_billboard_enable", Boolean.valueOf(false));
            this.cacheItems.add(this.isHotSearchMusicalBillboardEnable);
        }
        return this.isHotSearchMusicalBillboardEnable;
    }

    public C23051bf<Boolean> getIsHotSearchPositiveEnergyBillboardEnable() {
        if (this.isHotSearchPositiveEnergyBillboardEnable == null) {
            this.isHotSearchPositiveEnergyBillboardEnable = new C23051bf<>("is_hot_search_positive_energy_billboard_enable", Boolean.valueOf(false));
            this.cacheItems.add(this.isHotSearchPositiveEnergyBillboardEnable);
        }
        return this.isHotSearchPositiveEnergyBillboardEnable;
    }

    public C23051bf<Boolean> getIsLike2DynamicBubbleHasShowed() {
        if (this.isLike2DynamicBubbleHasShowed == null) {
            this.isLike2DynamicBubbleHasShowed = new C23051bf<>("profile_like2dynamic_bubble_has_showed", Boolean.valueOf(false));
            this.cacheItems.add(this.isLike2DynamicBubbleHasShowed);
        }
        return this.isLike2DynamicBubbleHasShowed;
    }

    public C23051bf<Integer> getIsNewInstall() {
        if (this.isNewInstall == null) {
            this.isNewInstall = new C23051bf<>("is_new_install", Integer.valueOf(-1));
            this.cacheItems.add(this.isNewInstall);
        }
        return this.isNewInstall;
    }

    public C23051bf<Boolean> getIsOldUser() {
        if (this.isOldUser == null) {
            this.isOldUser = new C23051bf<>("old_user", Boolean.valueOf(false));
            this.cacheItems.add(this.isOldUser);
        }
        return this.isOldUser;
    }

    public C23051bf<Boolean> getIsPoiBubbleShown() {
        if (this.isPoiBubbleShown == null) {
            this.isPoiBubbleShown = new C23051bf<>("poi_bubble_shown", Boolean.valueOf(true));
            this.cacheItems.add(this.isPoiBubbleShown);
        }
        return this.isPoiBubbleShown;
    }

    public C23051bf<Boolean> getIsPrivateAvailable() {
        if (this.isPrivateAvailable == null) {
            this.isPrivateAvailable = new C23051bf<>("private_aweme_available", Boolean.valueOf(true));
            this.cacheItems.add(this.isPrivateAvailable);
        }
        return this.isPrivateAvailable;
    }

    public C23051bf<Boolean> getIsProfileBubbleShown() {
        if (this.isProfileBubbleShown == null) {
            this.isProfileBubbleShown = new C23051bf<>("profile_bubble_shown", Boolean.valueOf(true));
            this.cacheItems.add(this.isProfileBubbleShown);
        }
        return this.isProfileBubbleShown;
    }

    public C23051bf<Boolean> getIsProfileNavBarBubbleShown() {
        if (this.isProfileNavbarBubbleShown == null) {
            this.isProfileNavbarBubbleShown = new C23051bf<>("profile_bubble_navbar_shown", Boolean.valueOf(false));
            this.cacheItems.add(this.isProfileNavbarBubbleShown);
        }
        return this.isProfileNavbarBubbleShown;
    }

    public C23051bf<Boolean> getIsShowAllowDownloadTipSetting() {
        if (this.isShowAllowDownloadTipSetting == null) {
            this.isShowAllowDownloadTipSetting = new C23051bf<>("isShowAllowDownloadTip", Boolean.valueOf(false));
            this.cacheItems.add(this.isShowAllowDownloadTipSetting);
        }
        return this.isShowAllowDownloadTipSetting;
    }

    public C23051bf<Boolean> getIsShowFavouriteIcon() {
        if (this.isShowFavouriteIcon == null) {
            this.isShowFavouriteIcon = new C23051bf<>("show_favourite_icon", Boolean.valueOf(false));
            this.cacheItems.add(this.isShowFavouriteIcon);
        }
        return this.isShowFavouriteIcon;
    }

    public C23051bf<Boolean> getIsShowFavouritePopup() {
        if (this.isShowFavouritePopup == null) {
            this.isShowFavouritePopup = new C23051bf<>("is_show_favourite_popup", Boolean.valueOf(true));
            this.cacheItems.add(this.isShowFavouritePopup);
        }
        return this.isShowFavouritePopup;
    }

    public C23051bf<Boolean> getIsShowHotSearchVideoTip() {
        if (this.isShowHotSearchVideoTip == null) {
            this.isShowHotSearchVideoTip = new C23051bf<>("is_show_hot_search_video_tip", Boolean.valueOf(true));
            this.cacheItems.add(this.isShowHotSearchVideoTip);
        }
        return this.isShowHotSearchVideoTip;
    }

    public C23051bf<Boolean> getIsShowNearBy() {
        if (this.isShowNearBy == null) {
            this.isShowNearBy = new C23051bf<>("is_show_near_by", Boolean.valueOf(false));
            this.cacheItems.add(this.isShowNearBy);
        }
        return this.isShowNearBy;
    }

    public C23051bf<Boolean> getIsShowRankingIndicator() {
        if (this.isShowRankingIndicator == null) {
            this.isShowRankingIndicator = new C23051bf<>("is_show_ranking_indicator", Boolean.valueOf(true));
            this.cacheItems.add(this.isShowRankingIndicator);
        }
        return this.isShowRankingIndicator;
    }

    public C23051bf<Boolean> getIsShowUserFeedBackPoint() {
        if (this.isShowUserFeedBackPoint == null) {
            this.isShowUserFeedBackPoint = new C23051bf<>("si_show_user_feed_back_point", Boolean.valueOf(false));
            this.cacheItems.add(this.isShowUserFeedBackPoint);
        }
        return this.isShowUserFeedBackPoint;
    }

    public C23051bf<Boolean> getIsTargetBindingUser() {
        if (this.isTargetBindingUser == null) {
            this.isTargetBindingUser = new C23051bf<>("is_target_binding_user", Boolean.valueOf(false));
            this.cacheItems.add(this.isTargetBindingUser);
        }
        return this.isTargetBindingUser;
    }

    public C23051bf<Boolean> getIsUseBackRefresh() {
        if (this.isUseBackRefresh == null) {
            this.isUseBackRefresh = new C23051bf<>("is_use_back_refresh", Boolean.valueOf(true));
            this.cacheItems.add(this.isUseBackRefresh);
        }
        return this.isUseBackRefresh;
    }

    public C23051bf<Boolean> getIsUseTTnet() {
        if (this.isUseTTnet == null) {
            this.isUseTTnet = new C23051bf<>("is_use_ttnet", Boolean.valueOf(false));
            this.cacheItems.add(this.isUseTTnet);
        }
        return this.isUseTTnet;
    }

    public C23051bf<Boolean> getIsUseTongdunSdk() {
        if (this.isUseTongdunSdk == null) {
            this.isUseTongdunSdk = new C23051bf<>("is_use_tongdun_sdk", Boolean.valueOf(true));
            this.cacheItems.add(this.isUseTongdunSdk);
        }
        return this.isUseTongdunSdk;
    }

    public C23051bf<String> getJsActlogUrl() {
        if (this.jsActlogUrl == null) {
            this.jsActlogUrl = new C23051bf<>("js_actlog_url", "");
            this.cacheItems.add(this.jsActlogUrl);
        }
        return this.jsActlogUrl;
    }

    public C23051bf<String> getJudgementClauseScheme() {
        if (this.judgementClauseScheme == null) {
            this.judgementClauseScheme = new C23051bf<>("judgement_clause_scheme", "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Fjudgment_clause%2F%3Fhide_nav_bar%3D1&hide_nav_bar=1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Dfe_app_rn_patch%26bundle_name%3Dfe_app_rn%26module_name%3Dpage_judgment_clause%26bg_theme%3D%2523161823%26loading_bgcolor%3D%2523161823%26hide_nav_bar%3D1");
            this.cacheItems.add(this.judgementClauseScheme);
        }
        return this.judgementClauseScheme;
    }

    public C23051bf<Long> getLastCloseFeedUpdateDialogTime() {
        if (this.lastCloseFeedUpdateUserDialog == null) {
            this.lastCloseFeedUpdateUserDialog = new C23051bf<>("last_close_feed_update_user_dialog", Long.valueOf(0));
            this.cacheItems.add(this.lastCloseFeedUpdateUserDialog);
        }
        return this.lastCloseFeedUpdateUserDialog;
    }

    public C23051bf<Long> getLastCloseUpdateDialogTime() {
        if (this.lastCloseUpdateUserDialog == null) {
            this.lastCloseUpdateUserDialog = new C23051bf<>("last_close_update_user_dialog", Long.valueOf(0));
            this.cacheItems.add(this.lastCloseUpdateUserDialog);
        }
        return this.lastCloseUpdateUserDialog;
    }

    public C23051bf<Long> getLastEnterProfileTime() {
        if (this.lastEnterProfileTime == null) {
            this.lastEnterProfileTime = new C23051bf<>("last_enter_profile_time", Long.valueOf(0));
            this.cacheItems.add(this.lastEnterProfileTime);
        }
        return this.lastEnterProfileTime;
    }

    public C23051bf<Long> getLastFeedCount() {
        if (this.lastFeedCount == null) {
            this.lastFeedCount = new C23051bf<>("last_feed_count", Long.valueOf(0));
            this.cacheItems.add(this.lastFeedCount);
        }
        return this.lastFeedCount;
    }

    public C23051bf<Long> getLastFeedTime() {
        if (this.lastFeedTime == null) {
            this.lastFeedTime = new C23051bf<>("last_feed_time", Long.valueOf(0));
            this.cacheItems.add(this.lastFeedTime);
        }
        return this.lastFeedTime;
    }

    public C23051bf<Long> getLastFetchUserCacheIntervals() {
        if (this.lastFetchUserCacheIntervals == null) {
            this.lastFetchUserCacheIntervals = new C23051bf<>("last_fetch_user_cache_intervals", Long.valueOf(0));
            this.cacheItems.add(this.lastFetchUserCacheIntervals);
        }
        return this.lastFetchUserCacheIntervals;
    }

    public C23051bf<Long> getLastFilterTime() {
        if (this.lastFilterTime == null) {
            this.lastFilterTime = new C23051bf<>("last_filter_time", Long.valueOf(0));
            this.cacheItems.add(this.lastFilterTime);
        }
        return this.lastFilterTime;
    }

    public C23051bf<Long> getLastGetRelieveAwemeTime() {
        if (this.lastGetRelieveAwemeTime == null) {
            this.lastGetRelieveAwemeTime = new C23051bf<>("has_relieve_aweme", Long.valueOf(0));
            this.cacheItems.add(this.lastGetRelieveAwemeTime);
        }
        return this.lastGetRelieveAwemeTime;
    }

    public C23051bf<Long> getLastHintToastTime() {
        if (this.lastHintToastTime == null) {
            this.lastHintToastTime = new C23051bf<>("last_hint_toast_time", Long.valueOf(0));
            this.cacheItems.add(this.lastHintToastTime);
        }
        return this.lastHintToastTime;
    }

    public C23051bf<Long> getLastInviteAllTimeStampItem() {
        if (this.invitedAllTimeStamp == null) {
            this.invitedAllTimeStamp = new C23051bf<>("contact_invite_all_time_stamp", Long.valueOf(0));
            this.cacheItems.add(this.invitedAllTimeStamp);
        }
        return this.invitedAllTimeStamp;
    }

    public C23051bf<Long> getLastLockedTime() {
        if (this.lastLockedTime == null) {
            this.lastLockedTime = new C23051bf<>("last_append_video_time", Long.valueOf(0));
            this.cacheItems.add(this.lastLockedTime);
        }
        return this.lastLockedTime;
    }

    public C23051bf<Boolean> getLastPublishFailed() {
        if (this.lastPublishFailed == null) {
            this.lastPublishFailed = new C23051bf<>("last_publish_failed", Boolean.valueOf(false));
            this.cacheItems.add(this.lastPublishFailed);
        }
        return this.lastPublishFailed;
    }

    public C23051bf<Long> getLastShowBindHintTime() {
        if (this.lastShowBindHintTime == null) {
            this.lastShowBindHintTime = new C23051bf<>("lastShowBindHintTime", Long.valueOf(0));
            this.cacheItems.add(this.lastShowBindHintTime);
        }
        return this.lastShowBindHintTime;
    }

    public C23051bf<Long> getLastShowProfileBindHintTime() {
        if (this.lastShowProfileBindHintTime == null) {
            this.lastShowProfileBindHintTime = new C23051bf<>("lastShowProfileBindHintTime", Long.valueOf(0));
            this.cacheItems.add(this.lastShowProfileBindHintTime);
        }
        return this.lastShowProfileBindHintTime;
    }

    public C23051bf<Long> getLastUnlockTime() {
        if (this.lastUnlockTime == null) {
            this.lastUnlockTime = new C23051bf<>("last_unlock_time", Long.valueOf(0));
            this.cacheItems.add(this.lastUnlockTime);
        }
        return this.lastUnlockTime;
    }

    public C23051bf<String> getLastUploadPassCode() {
        if (this.lastUploadPassCode == null) {
            this.lastUploadPassCode = new C23051bf<>("hasuploadpasscode", "");
            this.cacheItems.add(this.lastUploadPassCode);
        }
        return this.lastUploadPassCode;
    }

    public C23051bf<Integer> getLastUsableNetworkSpeed() {
        if (this.lastUsableNetworkSpeed == null) {
            this.lastUsableNetworkSpeed = new C23051bf<>("last_usable_network_speed", Integer.valueOf(-1));
        }
        return this.lastUsableNetworkSpeed;
    }

    public C23051bf<Integer> getLiveCoverAuditFailedTimes() {
        if (this.liveCoverAuditFailedTimes == null) {
            this.liveCoverAuditFailedTimes = new C23051bf<>("live_cover_audit_failed_times", Integer.valueOf(1));
            this.cacheItems.add(this.liveCoverAuditFailedTimes);
        }
        return this.liveCoverAuditFailedTimes;
    }

    public C23051bf<Integer> getLiveCoverBubble() {
        if (this.liveCoverBubble == null) {
            this.liveCoverBubble = new C23051bf<>("live_cover_bubble", Integer.valueOf(1));
            this.cacheItems.add(this.liveCoverBubble);
        }
        return this.liveCoverBubble;
    }

    public C23051bf<Integer> getLiveCoverWarnChangeTimes() {
        if (this.liveCoverWarnChangeTimes == null) {
            this.liveCoverWarnChangeTimes = new C23051bf<>("live_cover_warn_change_times", Integer.valueOf(1));
            this.cacheItems.add(this.liveCoverWarnChangeTimes);
        }
        return this.liveCoverWarnChangeTimes;
    }

    public C23051bf<Integer> getLiveDefaultBitrate() {
        if (this.liveDefaultBitrate == null) {
            this.liveDefaultBitrate = new C23051bf<>("live_default_bitrate", Integer.valueOf(0));
            this.cacheItems.add(this.liveDefaultBitrate);
        }
        return this.liveDefaultBitrate;
    }

    public C23051bf<Integer> getLiveMaxBitrate() {
        if (this.liveMaxBitrate == null) {
            this.liveMaxBitrate = new C23051bf<>("live_max_bitrate", Integer.valueOf(0));
            this.cacheItems.add(this.liveMaxBitrate);
        }
        return this.liveMaxBitrate;
    }

    public C23051bf<Integer> getLiveMinBitrate() {
        if (this.liveMinBitrate == null) {
            this.liveMinBitrate = new C23051bf<>("live_min_bitrate", Integer.valueOf(0));
            this.cacheItems.add(this.liveMinBitrate);
        }
        return this.liveMinBitrate;
    }

    public C23051bf<Boolean> getLiveSkylightShowAnimation() {
        if (this.liveSkylightShowAnimation == null) {
            this.liveSkylightShowAnimation = new C23051bf<>("live_skylight_show_animation", Boolean.valueOf(false));
            this.cacheItems.add(this.liveSkylightShowAnimation);
        }
        return this.liveSkylightShowAnimation;
    }

    public C23051bf<Boolean> getLongVideoPermitted() {
        if (this.longVideoPermitted == null) {
            this.longVideoPermitted = new C23051bf<>("long_video_permitted", Boolean.valueOf(false));
            this.cacheItems.add(this.longVideoPermitted);
        }
        return this.longVideoPermitted;
    }

    public C23051bf<Long> getLongVideoThreshold() {
        if (this.longVideoThreshold == null) {
            this.longVideoThreshold = new C23051bf<>("long_video_threshold", Long.valueOf(60000));
            this.cacheItems.add(this.longVideoThreshold);
        }
        return this.longVideoThreshold;
    }

    public C23051bf<String> getMerchPickerUrl() {
        if (this.merchPickerUrl == null) {
            this.merchPickerUrl = new C23051bf<>("merch_share_url", "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Flive_merch%3Fhide_status_bar%3D1%26hide_nav_bar%3D1%26loading_bgcolor%3DFFFFFF%26bg_theme%3DFFFFFF%26disable_pop_gesture%3D1%26disablePopGesture%3D1%26popup_mode%3D1&hide_status_bar=1&hide_nav_bar=1&loading_bgcolor=FFFFFF&bg_theme=FFFFFF&disable_pop_gesture=1&disablePopGesture=1&popup_mode=1");
            this.cacheItems.add(this.merchPickerUrl);
        }
        return this.merchPickerUrl;
    }

    public C23051bf<String> getMiniAppLabelTitle() {
        if (this.miniAppLabTitle == null) {
            this.miniAppLabTitle = new C23051bf<>("lab_title", "");
            this.cacheItems.add(this.miniAppLabTitle);
        }
        return this.miniAppLabTitle;
    }

    public C23051bf<String> getMpTab() {
        if (this.mpTab == null) {
            this.mpTab = new C23051bf<>("mp_tab", "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Fmp_tab%3Fhide_nav_bar%3D1%26enter_from%3DrnToWeb");
            this.cacheItems.add(this.mpTab);
        }
        return this.mpTab;
    }

    public C23051bf<Integer> getMultiSelectLimitItem() {
        if (this.multiSelectLimit == null) {
            this.multiSelectLimit = new C23051bf<>("multi_select_limit", Integer.valueOf(10));
            this.cacheItems.add(this.multiSelectLimit);
        }
        return this.multiSelectLimit;
    }

    public C23051bf<String> getMusicBillboardRuleUrl() {
        if (this.musicBillboardRuleUrl == null) {
            this.musicBillboardRuleUrl = new C23051bf<>("music_billboard_rule_url", "");
            this.cacheItems.add(this.musicBillboardRuleUrl);
        }
        return this.musicBillboardRuleUrl;
    }

    public C23051bf<String> getMusicRingtoneScheme() {
        if (this.musicRingtoneScheme == null) {
            this.musicRingtoneScheme = new C23051bf<>("music_ringtone_scheme", "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Fringtone%3Fhide_nav_bar%3D1&hide_nav_bar=1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Dfe_app_rn_patch%26bundle_name%3Dfe_app_rn%26module_name%3Dpage_ringtone%26bg_theme%3D%2523161823%26hide_nav_bar%3D1");
            this.cacheItems.add(this.musicRingtoneScheme);
        }
        return this.musicRingtoneScheme;
    }

    public C23051bf<Integer> getMusicianShowType() {
        if (this.musicianShowType == null) {
            this.musicianShowType = new C23051bf<>("musician_show_type", Integer.valueOf(0));
            this.cacheItems.add(this.musicianShowType);
        }
        return this.musicianShowType;
    }

    public C23051bf<String> getNeedChooseLanguages() {
        if (this.needChooseLanguages == null) {
            this.needChooseLanguages = new C23051bf<>("need_choose_languages", "");
            this.cacheItems.add(this.needChooseLanguages);
        }
        return this.needChooseLanguages;
    }

    public C23051bf<Integer> getNetworkLibTypeItem() {
        if (this.networkLibType == null) {
            this.networkLibType = new C23051bf<>("network_lib_type", Integer.valueOf(1));
            this.cacheItems.add(this.networkLibType);
        }
        return this.networkLibType;
    }

    public C23051bf<Boolean> getNewAnchorShowBubble() {
        if (this.newAnchorShowBubble == null) {
            this.newAnchorShowBubble = new C23051bf<>("new_anchor_show_bubble", Boolean.valueOf(false));
            this.cacheItems.add(this.newAnchorShowBubble);
        }
        return this.newAnchorShowBubble;
    }

    public synchronized C23051bf<String> getNewbieHelpShopUrl() {
        if (this.newbieHelpShopUrl == null) {
            this.newbieHelpShopUrl = new C23051bf<>("newbie_help_shop_url", "");
            this.cacheItems.add(this.newbieHelpShopUrl);
        }
        return this.newbieHelpShopUrl;
    }

    public C23051bf<Long> getNormalGuideDisplayTimeIntervals() {
        if (this.normalGuideDisplayTimeIntervals == null) {
            this.normalGuideDisplayTimeIntervals = new C23051bf<>("normal_guide_display_time_intervals", Long.valueOf(0));
            this.cacheItems.add(this.normalGuideDisplayTimeIntervals);
        }
        return this.normalGuideDisplayTimeIntervals;
    }

    public C23051bf<Integer> getNormalGuideDisplayTimes() {
        if (this.normalGuideDisplayTimes == null) {
            this.normalGuideDisplayTimes = new C23051bf<>("normal_guide_display_times", Integer.valueOf(0));
            this.cacheItems.add(this.normalGuideDisplayTimes);
        }
        return this.normalGuideDisplayTimes;
    }

    public C23051bf<Integer> getNoticeCountLatency() {
        if (this.noticeCountLatency == null) {
            this.noticeCountLatency = new C23051bf<>("notice_count_latency", Integer.valueOf(0));
            this.cacheItems.add(this.noticeCountLatency);
        }
        return this.noticeCountLatency;
    }

    public C23051bf<String> getOpenAppBackLogParams() {
        if (this.openAppBackLogParams == null) {
            this.openAppBackLogParams = new C23051bf<>("open_app_back_log_params", "");
        }
        return this.openAppBackLogParams;
    }

    public C23051bf<Integer> getOpenImLinkItem() {
        if (this.openImLink == null) {
            this.openImLink = new C23051bf<>("open_im_link", Integer.valueOf(0));
            this.cacheItems.add(this.openImLink);
        }
        return this.openImLink;
    }

    public C23051bf<Long> getOperationGuideDisplayTimeIntervals() {
        if (this.operationGuideDisplayTimeIntervals == null) {
            this.operationGuideDisplayTimeIntervals = new C23051bf<>("operation_guide_display_time_intervals", Long.valueOf(0));
            this.cacheItems.add(this.operationGuideDisplayTimeIntervals);
        }
        return this.operationGuideDisplayTimeIntervals;
    }

    public C23051bf<Integer> getOperationGuideDisplayTimes() {
        if (this.operationGuideDisplayTimes == null) {
            this.operationGuideDisplayTimes = new C23051bf<>("operation_guide_display_times", Integer.valueOf(0));
            this.cacheItems.add(this.operationGuideDisplayTimes);
        }
        return this.operationGuideDisplayTimes;
    }

    public C23051bf<String> getOrderShareIntroUrl() {
        if (this.orderShareIntroUrl == null) {
            this.orderShareIntroUrl = new C23051bf<>("order_share_intro_url", "");
            this.cacheItems.add(this.orderShareIntroUrl);
        }
        return this.orderShareIntroUrl;
    }

    public C23051bf<String> getOrginalMusicianUrl() {
        if (this.orginalMusicianUrl == null) {
            this.orginalMusicianUrl = new C23051bf<>("orginal_musician_url", "");
            this.cacheItems.add(this.orginalMusicianUrl);
        }
        return this.orginalMusicianUrl;
    }

    public C23051bf<Boolean> getOriginalMusiciaShareStyle() {
        if (this.originalMusiciaShareStyle == null) {
            this.originalMusiciaShareStyle = new C23051bf<>("original_musician_share_style", Boolean.valueOf(false));
            this.cacheItems.add(this.originalMusiciaShareStyle);
        }
        return this.originalMusiciaShareStyle;
    }

    public C23051bf<Boolean> getOriginalMusicianEntry() {
        if (this.originalMusicianEntry == null) {
            this.originalMusicianEntry = new C23051bf<>("original_musician_entry", Boolean.valueOf(false));
            this.cacheItems.add(this.originalMusicianEntry);
        }
        return this.originalMusicianEntry;
    }

    public C23051bf<String> getPoiErrorReport() {
        if (this.poiErrorReport == null) {
            this.poiErrorReport = new C23051bf<>("poi_error_report", "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Fpoi_error_report%2F%3Fhide_nav_bar%3D1%26loading_bgcolor%3D%2523161823&hide_nav_bar=1&loading_bgcolor=%23161823&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Drn_patch%26bundle_name%3Dbusiness%26module_name%3Dpage_error_report%26force_h5%3D0%26bg_theme%3D%2523161823%26hide_nav_bar%3D1%26enter_from%3Dpoi_page");
            this.cacheItems.add(this.poiErrorReport);
        }
        return this.poiErrorReport;
    }

    public C23051bf<String> getPreviewGoodReport() {
        if (this.previewGoodReport == null) {
            this.previewGoodReport = new C23051bf<>("preview_good_report", "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Fgoods_report%3Fhide_status_bar%3D0%26hide_nav_bar%3D1%26loading_bgcolor%3D%2523161823&hide_status_bar=0&hide_nav_bar=1&loading_bgcolor=%23161823");
            this.cacheItems.add(this.previewGoodReport);
        }
        return this.previewGoodReport;
    }

    public C23051bf<Integer> getPrivacyAccountFollowCount() {
        if (this.privacyAccountFollowCount == null) {
            this.privacyAccountFollowCount = new C23051bf<>("privacy_account_follow_count", Integer.valueOf(0));
        }
        return this.privacyAccountFollowCount;
    }

    public C23051bf<Integer> getPrivacyDownloadSetting() {
        if (this.privacyDownloadSetting == null) {
            this.privacyDownloadSetting = new C23051bf<>("enablePrivacyDownload", Integer.valueOf(0));
            this.cacheItems.add(this.privacyDownloadSetting);
        }
        return this.privacyDownloadSetting;
    }

    public C23051bf<String> getPrivacyReminderH5Url() {
        if (this.privacyReminderH5Url == null) {
            this.privacyReminderH5Url = new C23051bf<>("privacy_reminder", "");
            this.cacheItems.add(this.privacyReminderH5Url);
        }
        return this.privacyReminderH5Url;
    }

    public C23051bf<Float> getProfileCompletionThreshold() {
        if (this.profileCompletionThreshold == null) {
            this.profileCompletionThreshold = new C23051bf<>("profilecompletion_threshold", Float.valueOf(0.0f));
            this.cacheItems.add(this.profileCompletionThreshold);
        }
        return this.profileCompletionThreshold;
    }

    public C23051bf<Float> getProfilePerfectionAvatar() {
        if (this.profilePerfectionAvatar == null) {
            this.profilePerfectionAvatar = new C23051bf<>("profileperfection_avatar", Float.valueOf(0.0f));
            this.cacheItems.add(this.profilePerfectionAvatar);
        }
        return this.profilePerfectionAvatar;
    }

    public C23051bf<Float> getProfilePerfectionBirthday() {
        if (this.profilePerfectionBirthday == null) {
            this.profilePerfectionBirthday = new C23051bf<>("profileperfection_birthday", Float.valueOf(0.0f));
            this.cacheItems.add(this.profilePerfectionBirthday);
        }
        return this.profilePerfectionBirthday;
    }

    public C23051bf<Float> getProfilePerfectionGender() {
        if (this.profilePerfectionGender == null) {
            this.profilePerfectionGender = new C23051bf<>("profileperfection_gender", Float.valueOf(0.0f));
            this.cacheItems.add(this.profilePerfectionGender);
        }
        return this.profilePerfectionGender;
    }

    public C23051bf<Float> getProfilePerfectionLocation() {
        if (this.profilePerfectionLocation == null) {
            this.profilePerfectionLocation = new C23051bf<>("profileperfection_location", Float.valueOf(0.0f));
            this.cacheItems.add(this.profilePerfectionLocation);
        }
        return this.profilePerfectionLocation;
    }

    public C23051bf<Float> getProfilePerfectionNickname() {
        if (this.profilePerfectionNickname == null) {
            this.profilePerfectionNickname = new C23051bf<>("profileperfection_nickname", Float.valueOf(0.0f));
            this.cacheItems.add(this.profilePerfectionNickname);
        }
        return this.profilePerfectionNickname;
    }

    public C23051bf<Float> getProfilePerfectionSchool() {
        if (this.profilePerfectionSchool == null) {
            this.profilePerfectionSchool = new C23051bf<>("profileperfection_school", Float.valueOf(0.0f));
            this.cacheItems.add(this.profilePerfectionSchool);
        }
        return this.profilePerfectionSchool;
    }

    public C23051bf<Float> getProfilePerfectionShortId() {
        if (this.profilePerfectionShortId == null) {
            this.profilePerfectionShortId = new C23051bf<>("profileperfection_shortid", Float.valueOf(0.0f));
            this.cacheItems.add(this.profilePerfectionShortId);
        }
        return this.profilePerfectionShortId;
    }

    public C23051bf<Float> getProfilePerfectionSignature() {
        if (this.profilePerfectionSignature == null) {
            this.profilePerfectionSignature = new C23051bf<>("profileperfection_signature", Float.valueOf(0.0f));
            this.cacheItems.add(this.profilePerfectionSignature);
        }
        return this.profilePerfectionSignature;
    }

    public C23051bf<Long> getProgressbarThreshold() {
        if (this.progressbarThreshold == null) {
            this.progressbarThreshold = new C23051bf<>("progressbar_threshold", Long.valueOf(30000));
            this.cacheItems.add(this.progressbarThreshold);
        }
        return this.progressbarThreshold;
    }

    public C23051bf<Integer> getPromoteDialogPopupClickType() {
        if (this.promoteDialogPopupClickType == null) {
            this.promoteDialogPopupClickType = new C23051bf<>("promote_dialog_popup_click_type", Integer.valueOf(0));
            this.cacheItems.add(this.promoteDialogPopupClickType);
        }
        return this.promoteDialogPopupClickType;
    }

    public C23051bf<String> getPromoteDialogPopupPopupContent() {
        if (this.promoteDialogPopupPopupContent == null) {
            this.promoteDialogPopupPopupContent = new C23051bf<>("promote_dialog_popup_content", "");
            this.cacheItems.add(this.promoteDialogPopupPopupContent);
        }
        return this.promoteDialogPopupPopupContent;
    }

    public C23051bf<Integer> getPromoteDialogPopupPopupInterval() {
        if (this.promoteDialogPopupPopupInterval == null) {
            this.promoteDialogPopupPopupInterval = new C23051bf<>("promote_dialog_popup_interval", Integer.valueOf(7));
            this.cacheItems.add(this.promoteDialogPopupPopupInterval);
        }
        return this.promoteDialogPopupPopupInterval;
    }

    public C23051bf<String> getPromoteDialogPopupPopupLinkText() {
        if (this.promoteDialogPopupPopupLinkText == null) {
            this.promoteDialogPopupPopupLinkText = new C23051bf<>("promote_dialog_popup_linkText", "");
            this.cacheItems.add(this.promoteDialogPopupPopupLinkText);
        }
        return this.promoteDialogPopupPopupLinkText;
    }

    public C23051bf<String> getPromoteDialogPopupPopupMsg() {
        if (this.promoteDialogPopupPopupMsg == null) {
            this.promoteDialogPopupPopupMsg = new C23051bf<>("promote_dialog_popup_msg", "");
            this.cacheItems.add(this.promoteDialogPopupPopupMsg);
        }
        return this.promoteDialogPopupPopupMsg;
    }

    public C23051bf<String> getPromoteDialogPopupPopupTitle() {
        if (this.promoteDialogPopupPopupTitle == null) {
            this.promoteDialogPopupPopupTitle = new C23051bf<>("promote_dialog_popup_title", "");
            this.cacheItems.add(this.promoteDialogPopupPopupTitle);
        }
        return this.promoteDialogPopupPopupTitle;
    }

    public C23051bf<String> getPromoteDialogPopupPopupUrl() {
        if (this.promoteDialogPopupPopupUrl == null) {
            this.promoteDialogPopupPopupUrl = new C23051bf<>("promote_dialog_popup_url", "");
            this.cacheItems.add(this.promoteDialogPopupPopupUrl);
        }
        return this.promoteDialogPopupPopupUrl;
    }

    public C23051bf<Integer> getPromoteDialogPopupTimesLimit() {
        if (this.promoteDialogPopupTimesLimit == null) {
            this.promoteDialogPopupTimesLimit = new C23051bf<>("promote_dialog_popup_times_limit", Integer.valueOf(3));
            this.cacheItems.add(this.promoteDialogPopupTimesLimit);
        }
        return this.promoteDialogPopupTimesLimit;
    }

    public C23051bf<Boolean> getPromoteDialogShouldShow() {
        if (this.promoteDialogShouldShow == null) {
            this.promoteDialogShouldShow = new C23051bf<>("promote_dialog_show", Boolean.valueOf(false));
            this.cacheItems.add(this.promoteDialogShouldShow);
        }
        return this.promoteDialogShouldShow;
    }

    public C23051bf<String> getReactAddShopUrl() {
        if (this.reactAddShopUrl == null) {
            this.reactAddShopUrl = new C23051bf<>("react_edit_draft_url", "https://aweme.snssdk.com/falcon/rn/business?hide_status_bar=0&hide_nav_bar=1&status_bar_color=ffffff&status_font_dark=1&loading_bgcolor=ffffff&initPage=home&hide_status_bar=0&hide_nav_bar=1&status_bar_color=ffffff&status_font_dark=1&loading_bgcolor=ffffff&initPage=home");
            this.cacheItems.add(this.reactAddShopUrl);
        }
        return this.reactAddShopUrl;
    }

    public C23051bf<String> getReactEShopToolboxUrl() {
        if (this.reactEShopToolboxUrl == null) {
            this.reactEShopToolboxUrl = new C23051bf<>("react_e_shop_tool_box_url", "https://aweme.snssdk.com/falcon/rn/eshop_toolbox?hide_status_bar=0&hide_nav_bar=1&status_bar_color=ffffff&status_font_dark=1&loading_bgcolor=ffffff&hide_status_bar=0&hide_nav_bar=1&status_bar_color=ffffff");
            this.cacheItems.add(this.reactEShopToolboxUrl);
        }
        return this.reactEShopToolboxUrl;
    }

    public C23051bf<String> getReferralEntrance() {
        if (this.referralEntrance == null) {
            this.referralEntrance = new C23051bf<>("invite_friends", "");
        }
        return this.referralEntrance;
    }

    public C23051bf<Integer> getRefreshZhima() {
        if (this.refreshZhima == null) {
            this.refreshZhima = new C23051bf<>("refresh_zhima", Integer.valueOf(0));
            this.cacheItems.add(this.refreshZhima);
        }
        return this.refreshZhima;
    }

    public C23051bf<Boolean> getRemoveFollowerSwitch() {
        if (this.removeFollowerSwitch == null) {
            this.removeFollowerSwitch = new C23051bf<>("remove_follower_switch", Boolean.valueOf(false));
        }
        return this.removeFollowerSwitch;
    }

    public C23051bf<String> getRequestNotificationText() {
        if (this.requestNotificationText == null) {
            this.requestNotificationText = new C23051bf<>("request_notification_text", "");
            this.cacheItems.add(this.requestNotificationText);
        }
        return this.requestNotificationText;
    }

    public C23051bf<String> getRequestNotificationTitle() {
        if (this.requestNotificationTitle == null) {
            this.requestNotificationTitle = new C23051bf<>("request_notification_title", "");
            this.cacheItems.add(this.requestNotificationTitle);
        }
        return this.requestNotificationTitle;
    }

    public C23051bf<Integer> getRnContextCreateTimeout() {
        if (this.mRnContextCreateTimeout == null) {
            this.mRnContextCreateTimeout = new C23051bf<>("rn_context_create_timeout", Integer.valueOf(3000));
            this.cacheItems.add(this.mRnContextCreateTimeout);
        }
        return this.mRnContextCreateTimeout;
    }

    public C23051bf<Boolean> getRnFallback() {
        if (this.rnFallback == null) {
            this.rnFallback = new C23051bf<>("rn_fallback", Boolean.valueOf(false));
            this.cacheItems.add(this.rnFallback);
        }
        return this.rnFallback;
    }

    public C23051bf<Boolean> getRnPreloadContextOn() {
        if (this.mRnPreloadContextOn == null) {
            this.mRnPreloadContextOn = new C23051bf<>("rn_preload_context_on", Boolean.valueOf(true));
            this.cacheItems.add(this.mRnPreloadContextOn);
        }
        return this.mRnPreloadContextOn;
    }

    public C23051bf<Boolean> getRnSnapshotOn() {
        if (this.mRnSnapshotOn == null) {
            this.mRnSnapshotOn = new C23051bf<>("rn_snap_shot_on", Boolean.valueOf(true));
            this.cacheItems.add(this.mRnSnapshotOn);
        }
        return this.mRnSnapshotOn;
    }

    public C23051bf<String> getSameCityActiveId() {
        if (this.sameCityActiveId == null) {
            this.sameCityActiveId = new C23051bf<>("same_city_active_id", "");
            this.cacheItems.add(this.sameCityActiveId);
        }
        return this.sameCityActiveId;
    }

    public C23051bf<Integer> getScrollToProfileGuideState() {
        if (this.scrollToProfileGuideState == null) {
            this.scrollToProfileGuideState = new C23051bf<>("scroll_to_profile_guide_state", Integer.valueOf(0));
            this.cacheItems.add(this.scrollToProfileGuideState);
        }
        return this.scrollToProfileGuideState;
    }

    public C23051bf<String> getSearchTabIndex() {
        if (this.searchTabIndex == null) {
            this.searchTabIndex = new C23051bf<>("search_tab_index", "");
            this.cacheItems.add(this.searchTabIndex);
        }
        return this.searchTabIndex;
    }

    public C23051bf<String> getSearchTrendBannerUrl() {
        if (this.searchTrendBannerUrl == null) {
            this.searchTrendBannerUrl = new C23051bf<>("search_trend_banner_url", "");
            this.cacheItems.add(this.searchTrendBannerUrl);
        }
        return this.searchTrendBannerUrl;
    }

    public C23051bf<String> getShareCookieCacheItem() {
        if (this.shareCookieCacheItem == null) {
            this.shareCookieCacheItem = new C23051bf<>("share_cookie_domain", "");
            this.cacheItems.add(this.shareCookieCacheItem);
        }
        return this.shareCookieCacheItem;
    }

    public C23051bf<Boolean> getShiledMusicSDK() {
        if (this.shiledMusicSDK == null) {
            this.shiledMusicSDK = new C23051bf<>("shield_music_sdk", Boolean.valueOf(false));
            this.cacheItems.add(this.shiledMusicSDK);
        }
        return this.shiledMusicSDK;
    }

    public C23051bf<String> getShopWishListUrl() {
        if (this.shopWishListUrl == null) {
            this.shopWishListUrl = new C23051bf<>("shop_wish_list_url", "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Fshop_wish_list%3Fhide_nav_bar%3D1%26loading_bgcolor%3D%2523FFFFFF%26bg_theme%3D%2523FFFFFF%26disable_pop_gesture%3D1&hide_nav_bar=1&loading_bgcolor=%23FFFFFF&bg_theme=%23FFFFFF&disable_pop_gesture=1");
            this.cacheItems.add(this.shopWishListUrl);
        }
        return this.shopWishListUrl;
    }

    public C23051bf<Boolean> getShouldShowFavouriteTip() {
        if (this.shouldShowFavouriteTip == null) {
            this.shouldShowFavouriteTip = new C23051bf<>("should_show_favourite_tip", Boolean.valueOf(true));
            this.cacheItems.add(this.shouldShowFavouriteTip);
        }
        return this.shouldShowFavouriteTip;
    }

    public C23051bf<Boolean> getShouldShowPrivateAccountTipInProfile() {
        if (this.shouldShowPrivateAccountTipInProfile == null) {
            this.shouldShowPrivateAccountTipInProfile = new C23051bf<>("show_private_account_tip_in_profile", Boolean.valueOf(false));
            this.cacheItems.add(this.shouldShowPrivateAccountTipInProfile);
        }
        return this.shouldShowPrivateAccountTipInProfile;
    }

    public C23051bf<Boolean> getShowAdIntroItem() {
        if (this.showAdIntroFlag == null) {
            this.showAdIntroFlag = new C23051bf<>("is_show_ad_intro", Boolean.valueOf(false));
            this.cacheItems.add(this.showAdIntroFlag);
        }
        return this.showAdIntroFlag;
    }

    public C23051bf<Boolean> getShowAddBusinessGoodsDot() {
        if (this.showAddBusinessGoodsDot == null) {
            this.showAddBusinessGoodsDot = new C23051bf<>("show_add_business_dot", Boolean.valueOf(true));
            this.cacheItems.add(this.showAddBusinessGoodsDot);
        }
        return this.showAddBusinessGoodsDot;
    }

    public C23051bf<Integer> getShowBindHintCount() {
        if (this.showBindHintCount == null) {
            this.showBindHintCount = new C23051bf<>("showBindHintCount", Integer.valueOf(0));
            this.cacheItems.add(this.showBindHintCount);
        }
        return this.showBindHintCount;
    }

    public C23051bf<Boolean> getShowCouponItem() {
        if (this.showCouponItem == null) {
            this.showCouponItem = new C23051bf<>("is_show_coupon_item", Boolean.valueOf(true));
            this.cacheItems.add(this.showCouponItem);
        }
        return this.showCouponItem;
    }

    public C23051bf<Boolean> getShowFansCard() {
        if (this.showFansCard == null) {
            this.showFansCard = new C23051bf<>("show_fans_card", Boolean.valueOf(true));
            this.cacheItems.add(this.showFansCard);
        }
        return this.showFansCard;
    }

    public C23051bf<Integer> getShowHashTagBg() {
        if (this.showHashTagBg == null) {
            this.showHashTagBg = new C23051bf<>("enable_hashtag_background", Integer.valueOf(0));
            this.cacheItems.add(this.showHashTagBg);
        }
        return this.showHashTagBg;
    }

    public C23051bf<Boolean> getShowInteractionStickers() {
        if (this.showInteractionStickers == null) {
            this.showInteractionStickers = new C23051bf<>("show_interaction_stickers", Boolean.valueOf(false));
        }
        return this.showInteractionStickers;
    }

    public C23051bf<Integer> getShowJumpEffectAfterFollowCount() {
        if (this.showJumpEffectAfterFollowCount == null) {
            this.showJumpEffectAfterFollowCount = new C23051bf<>("jump_effect_after_follow", Integer.valueOf(0));
            this.cacheItems.add(this.showJumpEffectAfterFollowCount);
        }
        return this.showJumpEffectAfterFollowCount;
    }

    public C23051bf<Integer> getShowLoginDialogState() {
        if (this.showLoginDialogState == null) {
            this.showLoginDialogState = new C23051bf<>("shown_login_dialog_state", Integer.valueOf(2));
            this.cacheItems.add(this.showLoginDialogState);
        }
        return this.showLoginDialogState;
    }

    public C23051bf<Boolean> getShowMiniAppFreshGuideBubble() {
        if (this.showMiniAppFreshGuideBubble == null) {
            this.showMiniAppFreshGuideBubble = new C23051bf<>("show_mini_app_fresh_guide_bubble", Boolean.valueOf(false));
            this.cacheItems.add(this.showMiniAppFreshGuideBubble);
        }
        return this.showMiniAppFreshGuideBubble;
    }

    public C23051bf<Boolean> getShowMiniAppFreshGuideDialog() {
        if (this.showMiniAppFreshGuideDialog == null) {
            this.showMiniAppFreshGuideDialog = new C23051bf<>("show_mini_app_fresh_guide_dialog", Boolean.valueOf(false));
            this.cacheItems.add(this.showMiniAppFreshGuideDialog);
        }
        return this.showMiniAppFreshGuideDialog;
    }

    public C23051bf<Boolean> getShowMiniAppFreshGuideNotify() {
        if (this.showMiniAppFreshGuideNotify == null) {
            this.showMiniAppFreshGuideNotify = new C23051bf<>("show_mini_app_fresh_guide_notify", Boolean.valueOf(false));
            this.cacheItems.add(this.showMiniAppFreshGuideNotify);
        }
        return this.showMiniAppFreshGuideNotify;
    }

    public C23051bf<Boolean> getShowPlayerInfoUI() {
        if (this.showPlayerInfoUI == null) {
            this.showPlayerInfoUI = new C23051bf<>("show_player_info_ui", Boolean.valueOf(false));
            this.cacheItems.add(this.showPlayerInfoUI);
        }
        return this.showPlayerInfoUI;
    }

    public C23051bf<Integer> getShowProfileBindHintCount() {
        if (this.showProfileBindHintCount == null) {
            this.showProfileBindHintCount = new C23051bf<>("showProfileBindHintCount", Integer.valueOf(0));
            this.cacheItems.add(this.showProfileBindHintCount);
        }
        return this.showProfileBindHintCount;
    }

    public C23051bf<Integer> getShowPromoteLicense() {
        if (this.showPromoteLicense == null) {
            this.showPromoteLicense = new C23051bf<>("show_creator_license_210", Integer.valueOf(0));
            this.cacheItems.add(this.showPromoteLicense);
        }
        return this.showPromoteLicense;
    }

    public C23051bf<Boolean> getShowTimeLineTab() {
        if (this.showTimeLineTab == null) {
            this.showTimeLineTab = new C23051bf<>("show_timeline_tab", Boolean.valueOf(false));
            this.cacheItems.add(this.showTimeLineTab);
        }
        return this.showTimeLineTab;
    }

    public C23051bf<Boolean> getShowVideoBitrateInfo() {
        if (this.showVideoBitrateInfo == null) {
            this.showVideoBitrateInfo = new C23051bf<>("showVideoBitrateInfo", Boolean.valueOf(false));
            this.cacheItems.add(this.showVideoBitrateInfo);
        }
        return this.showVideoBitrateInfo;
    }

    public C23051bf<String> getStarAtlasOrderWebUrl() {
        if (this.starAtlasOrderWebUrl == null) {
            this.starAtlasOrderWebUrl = new C23051bf<>("star_atlas_order", "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Fstar_order%3Fhide_nav_bar%3D1&hide_nav_bar=1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel%3Dfe_douyin_ad_star_order%26bundle%3Dindex.js%26module_name%3Dpage_star_order%26hide_nav_bar%3D1%26");
            this.cacheItems.add(this.starAtlasOrderWebUrl);
        }
        return this.starAtlasOrderWebUrl;
    }

    public C23051bf<String> getStarBillboardRuleUrl() {
        if (this.starBillboardRuleUrl == null) {
            this.starBillboardRuleUrl = new C23051bf<>("star_billboard_rule_url", "");
            this.cacheItems.add(this.starBillboardRuleUrl);
        }
        return this.starBillboardRuleUrl;
    }

    public C23051bf<Boolean> getStickerArtEntry() {
        if (this.stickerArtEntry == null) {
            this.stickerArtEntry = new C23051bf<>("sticker_artist_entry", Boolean.valueOf(false));
            this.cacheItems.add(this.stickerArtEntry);
        }
        return this.stickerArtEntry;
    }

    public C23051bf<String> getStickerArtlistUrl() {
        if (this.stickerArtlistUrl == null) {
            this.stickerArtlistUrl = new C23051bf<>("sticker_artlist_url", "");
            this.cacheItems.add(this.stickerArtlistUrl);
        }
        return this.stickerArtlistUrl;
    }

    public C23051bf<String> getStoryFontType() {
        if (this.storyFontType == null) {
            this.storyFontType = new C23051bf<>("story_font_type", "");
        }
        return this.storyFontType;
    }

    public C23051bf<Integer> getStoryInfoStickerMaxCount() {
        if (this.storyInfoStickerMaxCount == null) {
            this.storyInfoStickerMaxCount = new C23051bf<>("story_info_sticker_max_count", Integer.valueOf(30));
            this.cacheItems.add(this.storyInfoStickerMaxCount);
        }
        return this.storyInfoStickerMaxCount;
    }

    public C23051bf<Boolean> getStoryPublishFriendsBanner() {
        if (this.storyPublishFriendsDuoshanBanner == null) {
            this.storyPublishFriendsDuoshanBanner = new C23051bf<>("story_publish_friend_banner", Boolean.valueOf(false));
        }
        return this.storyPublishFriendsDuoshanBanner;
    }

    public C23051bf<Boolean> getStoryPublishSaveLocal() {
        if (this.storyPublishSaveLocal == null) {
            this.storyPublishSaveLocal = new C23051bf<>("story_publish_save_local", Boolean.valueOf(true));
            this.cacheItems.add(this.storyPublishSaveLocal);
        }
        return this.storyPublishSaveLocal;
    }

    public C23051bf<Boolean> getStoryQuickPanelShowInActivity() {
        if (this.storyQuickPanelShowInActivity == null) {
            this.storyQuickPanelShowInActivity = new C23051bf<>("story_festival_sticker_quick_panel_activity_show", Boolean.valueOf(false));
        }
        return this.storyQuickPanelShowInActivity;
    }

    public C23051bf<Boolean> getStoryRecordGuideShow() {
        if (this.storyRecordGuideShow == null) {
            this.storyRecordGuideShow = new C23051bf<>("story_record_guide_show", Boolean.valueOf(false));
        }
        return this.storyRecordGuideShow;
    }

    public C23051bf<String> getStoryRegisterPublishSyncHintContent() {
        if (this.storyRegisterPublishSyncHintContent == null) {
            this.storyRegisterPublishSyncHintContent = new C23051bf<>("story_publish_register_sync_hint_content", "");
            this.cacheItems.add(this.storyRegisterPublishSyncHintContent);
        }
        return this.storyRegisterPublishSyncHintContent;
    }

    public C23051bf<String> getStoryRegisterPublishSyncHintH5Str() {
        if (this.storyRegisterPublishSyncHintH5Str == null) {
            this.storyRegisterPublishSyncHintH5Str = new C23051bf<>("story_publish_register_sync_hint_h5", "");
            this.cacheItems.add(this.storyRegisterPublishSyncHintH5Str);
        }
        return this.storyRegisterPublishSyncHintH5Str;
    }

    public C23051bf<String> getStoryRegisterPublishSyncHintH5Url() {
        if (this.storyRegisterPublishSyncHintH5Url == null) {
            this.storyRegisterPublishSyncHintH5Url = new C23051bf<>("story_publish_register_sync_hint_h5_url", "");
            this.cacheItems.add(this.storyRegisterPublishSyncHintH5Url);
        }
        return this.storyRegisterPublishSyncHintH5Url;
    }

    public C23051bf<String> getStoryRegisterPublishSyncHintTitle() {
        if (this.storyRegisterPublishSyncHintTitle == null) {
            this.storyRegisterPublishSyncHintTitle = new C23051bf<>("story_publish_register_sync_hint_title", "");
            this.cacheItems.add(this.storyRegisterPublishSyncHintTitle);
        }
        return this.storyRegisterPublishSyncHintTitle;
    }

    public C23051bf<Boolean> getStorySettingDoudouPhoto() {
        if (this.storySettingDoudouPhoto == null) {
            this.storySettingDoudouPhoto = new C23051bf<>("story_setting_duodou_photo", Boolean.valueOf(true));
        }
        return this.storySettingDoudouPhoto;
    }

    public C23051bf<Boolean> getStorySettingManualOpenDoudou() {
        if (this.storySettingManualOpenDoudou == null) {
            this.storySettingManualOpenDoudou = new C23051bf<>("story_setting_manual_open_doudou", Boolean.valueOf(false));
            this.cacheItems.add(this.storySettingManualOpenDoudou);
        }
        return this.storySettingManualOpenDoudou;
    }

    public C23051bf<Integer> getStorySettingReplyPermission() {
        if (this.storySettingReplyPermission == null) {
            this.storySettingReplyPermission = new C23051bf<>("story_setting_reply_permission", Integer.valueOf(0));
        }
        return this.storySettingReplyPermission;
    }

    public C23051bf<Boolean> getStorySettingSyncDuoshan() {
        if (this.storySettingSyncDuoshan == null) {
            this.storySettingSyncDuoshan = new C23051bf<>("story_setting_sync_duoshan", Boolean.valueOf(false));
        }
        return this.storySettingSyncDuoshan;
    }

    public C23051bf<Integer> getStorySettingSyncToast() {
        if (this.storySettingSyncToast == null) {
            this.storySettingSyncToast = new C23051bf<>("story_setting_sync_toast", Integer.valueOf(0));
            this.cacheItems.add(this.storySettingSyncToast);
        }
        return this.storySettingSyncToast;
    }

    public C23051bf<Integer> getStorySettingViewPermission() {
        if (this.storySettingViewPermission == null) {
            this.storySettingViewPermission = new C23051bf<>("story_setting_view_permission", Integer.valueOf(0));
        }
        return this.storySettingViewPermission;
    }

    public C23051bf<String> getStoryShakeLastTime() {
        if (this.storyShakeLastTime == null) {
            this.storyShakeLastTime = new C23051bf<>("story_festival_last_shake_card_time", "");
        }
        return this.storyShakeLastTime;
    }

    public C23051bf<Boolean> getStoryShakeSurpriseHintShow() {
        if (this.storyShakeSurpriseHintShow == null) {
            this.storyShakeSurpriseHintShow = new C23051bf<>("story_shake_video_surprise_hint", Boolean.valueOf(false));
        }
        return this.storyShakeSurpriseHintShow;
    }

    public C23051bf<Long> getStoryStickerQuickPanelCloseTime() {
        if (this.storyStickerQuickPanelCloseTime == null) {
            this.storyStickerQuickPanelCloseTime = new C23051bf<>("story_festival_sticker_quick_panel_close_time", Long.valueOf(0));
        }
        return this.storyStickerQuickPanelCloseTime;
    }

    public C23051bf<Integer> getStoryTextStickerMaxCount() {
        if (this.storyTextStickerMaxCount == null) {
            this.storyTextStickerMaxCount = new C23051bf<>("story_text_sticker_max_count", Integer.valueOf(30));
            this.cacheItems.add(this.storyTextStickerMaxCount);
        }
        return this.storyTextStickerMaxCount;
    }

    public C23051bf<String> getStoryUnRegisterPublishSyncHintContent() {
        if (this.storyUnRegisterPublishSyncHintContent == null) {
            this.storyUnRegisterPublishSyncHintContent = new C23051bf<>("story_publish_unregister_sync_hint_content", "");
            this.cacheItems.add(this.storyUnRegisterPublishSyncHintContent);
        }
        return this.storyUnRegisterPublishSyncHintContent;
    }

    public C23051bf<String> getStoryUnRegisterPublishSyncHintH5Str() {
        if (this.storyUnRegisterPublishSyncHintH5Str == null) {
            this.storyUnRegisterPublishSyncHintH5Str = new C23051bf<>("story_publish_unregister_sync_hint_h5", "");
            this.cacheItems.add(this.storyUnRegisterPublishSyncHintH5Str);
        }
        return this.storyUnRegisterPublishSyncHintH5Str;
    }

    public C23051bf<String> getStoryUnRegisterPublishSyncHintH5Url() {
        if (this.storyUnRegisterPublishSyncHintH5Url == null) {
            this.storyUnRegisterPublishSyncHintH5Url = new C23051bf<>("story_publish_unregister_sync_hint_h5_url", "");
            this.cacheItems.add(this.storyUnRegisterPublishSyncHintH5Url);
        }
        return this.storyUnRegisterPublishSyncHintH5Url;
    }

    public C23051bf<String> getStoryUnRegisterPublishSyncHintTitle() {
        if (this.storyUnRegisterPublishSyncHintTitle == null) {
            this.storyUnRegisterPublishSyncHintTitle = new C23051bf<>("story_publish_unregister_sync_hint_title", "");
            this.cacheItems.add(this.storyUnRegisterPublishSyncHintTitle);
        }
        return this.storyUnRegisterPublishSyncHintTitle;
    }

    public C23051bf<Integer> getSwipeDataCount() {
        if (this.swipeDataCount == null) {
            this.swipeDataCount = new C23051bf<>("swipe_data_count", Integer.valueOf(0));
            this.cacheItems.add(this.swipeDataCount);
        }
        return this.swipeDataCount;
    }

    public C23051bf<Integer> getSyncTT() {
        if (this.syncTT == null) {
            this.syncTT = new C23051bf<>("sync_to_toutiao", Integer.valueOf(1));
            this.cacheItems.add(this.syncTT);
        }
        return this.syncTT;
    }

    public C23051bf<Boolean> getSyncTTFirstPublish() {
        if (this.syncTTFirstPublish == null) {
            this.syncTTFirstPublish = new C23051bf<>("sync_to_toutiao_first_publish", Boolean.valueOf(true));
            this.cacheItems.add(this.syncTTFirstPublish);
        }
        return this.syncTTFirstPublish;
    }

    public C23051bf<String> getSyncToTTUrl() {
        if (this.syncToTTUrl == null) {
            this.syncToTTUrl = new C23051bf<>("sync_to_toutiao_url", "");
            this.cacheItems.add(this.syncToTTUrl);
        }
        return this.syncToTTUrl;
    }

    public C23051bf<Float> getSyntheticVideoBitrate() {
        if (this.syntheticVideoBitrate == null) {
            this.syntheticVideoBitrate = new C23051bf<>("synthetic_video_bitrate", Float.valueOf(1.0f));
            this.cacheItems.add(this.syntheticVideoBitrate);
        }
        return this.syntheticVideoBitrate;
    }

    public C23051bf<Boolean> getTTRegion() {
        if (this.ttRegion == null) {
            C35853o.m80992a();
            this.ttRegion = new C23051bf<>("ttregion", Boolean.valueOf(false));
            this.cacheItems.add(this.ttRegion);
        }
        return this.ttRegion;
    }

    public C23051bf<Boolean> getTTRoute() {
        if (this.ttRoute == null) {
            this.ttRoute = new C23051bf<>("ttroute", Boolean.valueOf(false));
            this.cacheItems.add(this.ttRoute);
        }
        return this.ttRoute;
    }

    public C23051bf<Integer> getTapDataCount() {
        if (this.tapDataCount == null) {
            this.tapDataCount = new C23051bf<>("tap_data_count", Integer.valueOf(0));
            this.cacheItems.add(this.tapDataCount);
        }
        return this.tapDataCount;
    }

    public C23051bf<String> getTeenagerProtectionScheme() {
        if (this.teenagerProtectionScheme == null) {
            this.teenagerProtectionScheme = new C23051bf<>("TEENAGER_PROTECTION_SCHEME", "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Fteen_protection_appeal%2F%3Fhide_nav_bar%3D1&hide_nav_bar=1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Dfe_app_rn_patch%26bundle_name%3Dfe_app_rn%26module_name%3Dpage_teen_protection_appeal%26bg_theme%3D%2523161823%26loading_bgcolor%3D%2523161823%26hide_nav_bar%3D1");
            this.cacheItems.add(this.teenagerProtectionScheme);
        }
        return this.teenagerProtectionScheme;
    }

    public C23051bf<Long> getTodayVideoPlayTime() {
        if (this.todayVideoPlayTime == null) {
            this.todayVideoPlayTime = new C23051bf<>("today_video_play_time", Long.valueOf(0));
            this.cacheItems.add(this.todayVideoPlayTime);
        }
        return this.todayVideoPlayTime;
    }

    public C23051bf<String> getTwitterAccessToken() {
        if (this.twitterAccessToken == null) {
            this.twitterAccessToken = new C23051bf<>("twitter_access_token", "");
            this.cacheItems.add(this.twitterAccessToken);
        }
        return this.twitterAccessToken;
    }

    public C23051bf<String> getTwitterSecret() {
        if (this.twitterSecret == null) {
            this.twitterSecret = new C23051bf<>("twitter_secret", "");
            this.cacheItems.add(this.twitterSecret);
        }
        return this.twitterSecret;
    }

    public C23051bf<Integer> getUltraResolutionLevel() {
        if (this.ultraResolutionLevel == null) {
            this.ultraResolutionLevel = new C23051bf<>("ultra_resolution_level", Integer.valueOf(0));
            this.cacheItems.add(this.ultraResolutionLevel);
        }
        return this.ultraResolutionLevel;
    }

    public C23051bf<Integer> getUpGuideNum() {
        if (this.upGuideNum == null) {
            this.upGuideNum = new C23051bf<>("up_guide_num", Integer.valueOf(-1));
            this.cacheItems.add(this.upGuideNum);
        }
        return this.upGuideNum;
    }

    public C23051bf<Integer> getUpdateUserFrequency() {
        if (this.updateUserFrequency == null) {
            this.updateUserFrequency = new C23051bf<>("update_user_frequency", Integer.valueOf(0));
            this.cacheItems.add(this.updateUserFrequency);
        }
        return this.updateUserFrequency;
    }

    public C23051bf<Integer> getUpdateUserPosition() {
        if (this.updateUserPosition == null) {
            this.updateUserPosition = new C23051bf<>("update_user_position", Integer.valueOf(-1));
            this.cacheItems.add(this.updateUserPosition);
        }
        return this.updateUserPosition;
    }

    public C23051bf<String> getUpdateUserTipContent() {
        if (this.updateUserTipContent == null) {
            this.updateUserTipContent = new C23051bf<>("update_user_tip_content", "");
            this.cacheItems.add(this.updateUserTipContent);
        }
        return this.updateUserTipContent;
    }

    public C23051bf<Long> getUploadContactsNoticeLastShowTime() {
        if (this.uploadContactsNoticeLastShowTime == null) {
            this.uploadContactsNoticeLastShowTime = new C23051bf<>("upload_contacts_notice_last_show_time", Long.valueOf(0));
            this.cacheItems.add(this.uploadContactsNoticeLastShowTime);
        }
        return this.uploadContactsNoticeLastShowTime;
    }

    public C23051bf<Integer> getUploadContactsNoticeShowCount() {
        if (this.uploadContactsNoticeShowCount == null) {
            this.uploadContactsNoticeShowCount = new C23051bf<>("upload_contacts_notice_show_count", Integer.valueOf(0));
            this.cacheItems.add(this.uploadContactsNoticeShowCount);
        }
        return this.uploadContactsNoticeShowCount;
    }

    public C23051bf<String> getUploadContactsPolicyCaption() {
        if (this.uploadContactsPolicyCaption == null) {
            this.uploadContactsPolicyCaption = new C23051bf<>("upload_contacts_policy_caption", "");
            this.cacheItems.add(this.uploadContactsPolicyCaption);
        }
        return this.uploadContactsPolicyCaption;
    }

    public C23051bf<Integer> getUploadContactsPolicyInterval() {
        if (this.uploadContactsPolicyInterval == null) {
            this.uploadContactsPolicyInterval = new C23051bf<>("upload_contacts_policy_interval", Integer.valueOf(1));
            this.cacheItems.add(this.uploadContactsPolicyInterval);
        }
        return this.uploadContactsPolicyInterval;
    }

    public C23051bf<String> getUploadContactsPolicyPic() {
        if (this.uploadContactsPolicyPic == null) {
            this.uploadContactsPolicyPic = new C23051bf<>("upload_contacts_policy_pic", "");
            this.cacheItems.add(this.uploadContactsPolicyPic);
        }
        return this.uploadContactsPolicyPic;
    }

    public C23051bf<String> getUploadContactsPolicyText() {
        if (this.uploadContactsPolicyText == null) {
            this.uploadContactsPolicyText = new C23051bf<>("upload_contacts_policy_text", "");
            this.cacheItems.add(this.uploadContactsPolicyText);
        }
        return this.uploadContactsPolicyText;
    }

    public C23051bf<Integer> getUploadContactsPolicyTimes() {
        if (this.uploadContactsPolicyTimes == null) {
            this.uploadContactsPolicyTimes = new C23051bf<>("upload_contacts_policy_times", Integer.valueOf(0));
            this.cacheItems.add(this.uploadContactsPolicyTimes);
        }
        return this.uploadContactsPolicyTimes;
    }

    public C23051bf<Boolean> getUseCronet() {
        if (this.useCronet == null) {
            this.useCronet = new C23051bf<>("use_cronet", Boolean.valueOf(true));
            this.cacheItems.add(this.useCronet);
        }
        return this.useCronet;
    }

    public C23051bf<Boolean> getUseDefaultHost() {
        if (this.useDefaultHost == null) {
            this.useDefaultHost = new C23051bf<>("use_default_host", Boolean.valueOf(false));
            this.cacheItems.add(this.useDefaultHost);
        }
        return this.useDefaultHost;
    }

    public C23051bf<Boolean> getUseHttps() {
        if (this.useHttps == null) {
            this.useHttps = new C23051bf<>("use_https", Boolean.valueOf(true));
            this.cacheItems.add(this.useHttps);
        }
        return this.useHttps;
    }

    public C23051bf<Integer> getUseLiveWallpaper() {
        if (this.useLiveWallpaper == null) {
            this.useLiveWallpaper = new C23051bf<>("use_live_wallpaper", Integer.valueOf(0));
            this.cacheItems.add(this.useLiveWallpaper);
        }
        return this.useLiveWallpaper;
    }

    public C23051bf<Integer> getUseNewDouyinSaftyCenter() {
        if (this.useNewDouyinSaftyCenter == null) {
            this.useNewDouyinSaftyCenter = new C23051bf<>("use_new_douyin_safety_center", Integer.valueOf(0));
            this.cacheItems.add(this.useNewDouyinSaftyCenter);
        }
        return this.useNewDouyinSaftyCenter;
    }

    public C23051bf<Boolean> getUseNewFFmpeg() {
        if (this.useNewFFmpeg == null) {
            this.useNewFFmpeg = new C23051bf<>("use_new_ffmpeg", Boolean.valueOf(false));
            this.cacheItems.add(this.useNewFFmpeg);
        }
        return this.useNewFFmpeg;
    }

    public C23051bf<Boolean> getUseNewPackageNow() {
        if (this.mUseNewPackageNow == null) {
            this.mUseNewPackageNow = new C23051bf<>("use_new_package_now", Boolean.valueOf(false));
            this.cacheItems.add(this.mUseNewPackageNow);
        }
        return this.mUseNewPackageNow;
    }

    public C23051bf<Integer> getUseSyntheticHardcode() {
        if (this.useSyntheticHardcode == null) {
            this.useSyntheticHardcode = new C23051bf<>("use_synthetic_hardcode", Integer.valueOf(0));
            this.cacheItems.add(this.useSyntheticHardcode);
        }
        return this.useSyntheticHardcode;
    }

    public C23051bf<String> getUserAddLanguages() {
        if (this.userAddLanguages == null) {
            this.userAddLanguages = new C23051bf<>("user_add_languages", "");
            this.cacheItems.add(this.userAddLanguages);
        }
        return this.userAddLanguages;
    }

    public C23051bf<String> getUserCurrentRegion() {
        if (this.userCurrentRegion == null) {
            this.userCurrentRegion = new C23051bf<>("user_current_region", "");
            this.cacheItems.add(this.userCurrentRegion);
        }
        return this.userCurrentRegion;
    }

    public C23051bf<Boolean> getUserHasPassword() {
        if (this.userHasPassword == null) {
            this.userHasPassword = new C23051bf<>("user_has_password", Boolean.valueOf(false));
            this.cacheItems.add(this.userHasPassword);
        }
        return this.userHasPassword;
    }

    public C23051bf<String> getUserResidence() {
        if (this.userResidence == null) {
            this.userResidence = new C23051bf<>("user_residence", "");
            this.cacheItems.add(this.userResidence);
        }
        return this.userResidence;
    }

    public C23051bf<Integer> getVerifyExceed() {
        if (this.verifyExceed == null) {
            this.verifyExceed = new C23051bf<>("verify_exceed", Integer.valueOf(5));
            this.cacheItems.add(this.verifyExceed);
        }
        return this.verifyExceed;
    }

    public C23051bf<Float> getVideoBitrate() {
        if (this.videoBitrate == null) {
            this.videoBitrate = new C23051bf<>("video_bitrate", Float.valueOf(1.0f));
            this.cacheItems.add(this.videoBitrate);
        }
        return this.videoBitrate;
    }

    public C23051bf<Integer> getVideoCommit() {
        if (this.videoCommit == null) {
            this.videoCommit = new C23051bf<>("video_commit", Integer.valueOf(30));
            this.cacheItems.add(this.videoCommit);
        }
        return this.videoCommit;
    }

    public C23051bf<Integer> getVideoCompose() {
        if (this.videoCompose == null) {
            this.videoCompose = new C23051bf<>("video_compose", Integer.valueOf(70));
            this.cacheItems.add(this.videoCompose);
        }
        return this.videoCompose;
    }

    public C23051bf<Boolean> getVideoPreload() {
        if (this.videoPreload == null) {
            this.videoPreload = new C23051bf<>("video_preload", Boolean.valueOf(true));
            this.cacheItems.add(this.videoPreload);
        }
        return this.videoPreload;
    }

    public C23051bf<Integer> getWeakNetPreLoadSwitch() {
        if (this.weakNetPreLoadSwitch == null) {
            this.weakNetPreLoadSwitch = new C23051bf<>("weak_net_pre_load_switch", Integer.valueOf(1));
            this.cacheItems.add(this.weakNetPreLoadSwitch);
        }
        return this.weakNetPreLoadSwitch;
    }

    public C23051bf<Integer> getX2cSwitch() {
        if (this.x2cSwitch == null) {
            this.x2cSwitch = new C23051bf<>("x2c_switch", Integer.valueOf(2));
            this.cacheItems.add(this.x2cSwitch);
        }
        return this.x2cSwitch;
    }

    public C23051bf<Boolean> isEnableMessagePb2Json() {
        if (this.enableMessagePb2Json == null) {
            this.enableMessagePb2Json = new C23051bf<>("live_enanble_message_pb2json", Boolean.valueOf(false));
            this.cacheItems.add(this.enableMessagePb2Json);
        }
        return this.enableMessagePb2Json;
    }

    public C23051bf<Boolean> isFirstPublishSync() {
        if (this.isFirstPublishSync == null) {
            this.isFirstPublishSync = new C23051bf<>("is_first_publish", Boolean.valueOf(true));
            this.cacheItems.add(this.isFirstPublishSync);
        }
        return this.isFirstPublishSync;
    }

    public boolean isFollowFeedAsDefault() {
        if (getFollowFeedAsDefault() == null || ((Integer) getFollowFeedAsDefault().mo47782d()).intValue() != 1) {
            return false;
        }
        return true;
    }

    public C23051bf<Boolean> isInUltraResBlackList() {
        if (this.inUltraResBlackList == null) {
            this.inUltraResBlackList = new C23051bf<>("in_ultra_resolution_black_list", Boolean.valueOf(false));
            this.cacheItems.add(this.inUltraResBlackList);
        }
        return this.inUltraResBlackList;
    }

    public C23051bf<Boolean> isNpthEnable() {
        if (this.isNpthEnable == null) {
            this.isNpthEnable = new C23051bf<>("is_npth_enable", Boolean.valueOf(false));
            this.cacheItems.add(this.isNpthEnable);
        }
        return this.isNpthEnable;
    }

    public C23051bf<Boolean> isOb() {
        if (this.isOb == null) {
            this.isOb = new C23051bf<>("is_ob", Boolean.valueOf(false));
            this.cacheItems.add(this.isOb);
        }
        return this.isOb;
    }

    public C23051bf<Boolean> isPublishSyncToHuoshan() {
        if (this.isPublishSyncToHuoshan == null) {
            this.isPublishSyncToHuoshan = new C23051bf<>("is_publish_sync_huoshan", Boolean.valueOf(true));
            this.cacheItems.add(this.isPublishSyncToHuoshan);
        }
        return this.isPublishSyncToHuoshan;
    }

    public C23051bf<Boolean> isPublishSyncToToutiao() {
        if (this.isPublishSyncToToutiao == null) {
            this.isPublishSyncToToutiao = new C23051bf<>("is_publish_sync_toutiao_new", Boolean.valueOf(true));
            this.cacheItems.add(this.isPublishSyncToToutiao);
        }
        return this.isPublishSyncToToutiao;
    }

    public C23051bf<Integer> isPublishSyncToToutiaoNew() {
        if (this.isPublishSyncToToutiaoNew == null) {
            this.isPublishSyncToToutiaoNew = new C23051bf<>("is_publish_sync_toutiao_new_new", Integer.valueOf(0));
            this.cacheItems.add(this.isPublishSyncToToutiaoNew);
        }
        return this.isPublishSyncToToutiaoNew;
    }

    public C23051bf<Boolean> isShowInviteContactsFriends() {
        if (this.showInvitedContactsFriends == null) {
            this.showInvitedContactsFriends = new C23051bf<>("invite_friends_settings", Boolean.valueOf(false));
            this.cacheItems.add(this.showInvitedContactsFriends);
        }
        return this.showInvitedContactsFriends;
    }

    public C23051bf<Boolean> isShowSyncToToutiaoDialog() {
        if (this.isShowSyncToToutiaoDialog == null) {
            this.isShowSyncToToutiaoDialog = new C23051bf<>("is_show_sync_toutiao_dialog", Boolean.valueOf(false));
            this.cacheItems.add(this.isShowSyncToToutiaoDialog);
        }
        return this.isShowSyncToToutiaoDialog;
    }

    public C23051bf<Boolean> isSyncToHuoshan() {
        if (this.isSyncToHuoshan == null) {
            this.isSyncToHuoshan = new C23051bf<>("is_sync_to_huoshan", Boolean.valueOf(false));
            this.cacheItems.add(this.isSyncToHuoshan);
        }
        return this.isSyncToHuoshan;
    }

    public C23051bf<Boolean> liveAgreement() {
        if (this.liveAgreement == null) {
            this.liveAgreement = new C23051bf<>("live_agreement", Boolean.valueOf(false));
            this.cacheItems.add(this.liveAgreement);
        }
        return this.liveAgreement;
    }

    public C23051bf<Boolean> liveAnswer() {
        if (this.liveAnswer == null) {
            this.liveAnswer = new C23051bf<>("live_answer", Boolean.valueOf(false));
            this.cacheItems.add(this.liveAnswer);
        }
        return this.liveAnswer;
    }

    public C23051bf<Boolean> liveContactsVerify() {
        if (this.liveContactsVerify == null) {
            this.liveContactsVerify = new C23051bf<>("live_contacts_verify", Boolean.valueOf(false));
            this.cacheItems.add(this.liveContactsVerify);
        }
        return this.liveContactsVerify;
    }

    public C23051bf<Boolean> mockLiveMoney() {
        if (this.mockLiveMoney == null) {
            this.mockLiveMoney = new C23051bf<>("mock_live_money", Boolean.valueOf(false));
            this.cacheItems.add(this.mockLiveMoney);
        }
        return this.mockLiveMoney;
    }

    public C23051bf<Boolean> mockLiveResolution() {
        if (this.mockLiveResolution == null) {
            this.mockLiveResolution = new C23051bf<>("mock_live_resolution", Boolean.valueOf(false));
            this.cacheItems.add(this.mockLiveResolution);
        }
        return this.mockLiveResolution;
    }

    public C23051bf<Boolean> mockLiveSend() {
        if (this.mockLiveSend == null) {
            this.mockLiveSend = new C23051bf<>("mock_live_send", Boolean.valueOf(false));
            this.cacheItems.add(this.mockLiveSend);
        }
        return this.mockLiveSend;
    }

    private SharePrefCache() {
        this.recentList = Arrays.asList(new String[]{"IN", "NP", "PK", "LK"});
        this.cacheItems = Collections.synchronizedList(new ArrayList());
        this.mSharedPreferences = C35807d.m80935a(C11010c.m22280a(), "aweme-app", 0);
    }

    private void collectAllItemsIfNeed() {
        Method[] declaredMethods;
        if (!this.collectAllItems) {
            this.collectAllItems = true;
            for (Method method : SharePrefCache.class.getDeclaredMethods()) {
                if (method.getReturnType() == C23051bf.class) {
                    try {
                        method.invoke(this, new Object[0]);
                    } catch (IllegalAccessException | InvocationTargetException unused) {
                    }
                }
            }
        }
    }

    public synchronized C23051bf<Boolean> getEnableLawWindow() {
        if (this.enableLawWindow == null) {
            this.enableLawWindow = new C23051bf<>("enable_law_window", Boolean.valueOf(false));
            this.cacheItems.add(this.enableLawWindow);
        }
        return this.enableLawWindow;
    }

    public synchronized C23051bf<Boolean> getEnableShoppingUser() {
        if (this.enableShoppingUser == null) {
            this.enableShoppingUser = new C23051bf<>("enable_shopping_user", Boolean.valueOf(false));
            this.cacheItems.add(this.enableShoppingUser);
        }
        return this.enableShoppingUser;
    }

    public C23051bf<Boolean> getIsContactDialogShown() {
        if (this.isContactDialogShown == null) {
            this.isContactDialogShown = new C23051bf<>("contact_dialog_shown", Boolean.valueOf(getSharePref().getBoolean("contact_dialog_shown", false)));
            this.cacheItems.add(this.isContactDialogShown);
        }
        return this.isContactDialogShown;
    }

    public C23051bf<Boolean> getIsFirstShowInsightsAnimation() {
        if (this.isFirstShowInsightsAnimation == null) {
            StringBuilder sb = new StringBuilder("first_show_insights_animation_");
            sb.append(AccountService.createIAccountServicebyMonsterPlugin().userService().getCurUserId());
            this.isFirstShowInsightsAnimation = new C23051bf<>(sb.toString(), Boolean.valueOf(false));
            this.cacheItems.add(this.isFirstShowInsightsAnimation);
        }
        return this.isFirstShowInsightsAnimation;
    }

    public Boolean getLiveSkylightHasShowAnimation() {
        if (this.liveSkylightHasShowAnimation == null) {
            this.liveSkylightHasShowAnimation = new C23051bf<>("live_skylight_has_show_animation", Boolean.valueOf(false));
            this.cacheItems.add(this.liveSkylightHasShowAnimation);
        }
        Boolean bool = (Boolean) this.liveSkylightHasShowAnimation.mo47782d();
        if (!bool.booleanValue()) {
            this.liveSkylightHasShowAnimation.mo47776a(Boolean.valueOf(true));
        }
        return bool;
    }

    public C23051bf<Boolean> getIsEuropeCountry() {
        if (this.isEuropeCountry == null) {
            if (!TextUtils.isEmpty(C35853o.m80994b())) {
                this.isEuropeCountry = new C23051bf<>("is_europe_country", Boolean.valueOf(C35853o.m80993a(C35853o.m80994b())));
            } else if (!TextUtils.isEmpty(C35853o.m80992a())) {
                this.isEuropeCountry = new C23051bf<>("is_europe_country", Boolean.valueOf(C35853o.m80993a(C35853o.m80992a())));
            } else {
                this.isEuropeCountry = new C23051bf<>("is_europe_country", Boolean.valueOf(false));
            }
            this.cacheItems.add(this.isEuropeCountry);
        }
        return this.isEuropeCountry;
    }

    public void setCurrentLocaleLanguage(String str) {
        getCurrentLocaleLanguage().mo47776a(str);
    }

    public void setImUrlTemplate(String str) {
        getImUrlTemplateItem().mo47776a(str);
    }

    public void setInvitedContacts(String str) {
        getInvitedContacts().mo47776a(str);
    }

    public void setSameCityActiveId(String str) {
        getSameCityActiveId().mo47776a(str);
    }

    public void setShowInvitedContactsFriends(Boolean bool) {
        isShowInviteContactsFriends().mo47776a(bool);
    }

    public void setUseTTnet(Boolean bool) {
        getIsUseTTnet().mo47776a(bool);
    }

    public void setBeautyModel(int i) {
        getBeautyModelItem().mo47776a(Integer.valueOf(i));
    }

    public void setImCommentForwardEnabled(boolean z) {
        getImCommentForwardEnabledItem().mo47776a(Boolean.valueOf(z));
    }

    public void setIsFirstPublishAweme(boolean z) {
        getFirstPublishAwemeItem().mo47776a(Boolean.valueOf(z));
    }

    public void setIsFirstPublishComment(boolean z) {
        getFirstPublishCommentItem().mo47776a(Boolean.valueOf(z));
    }

    public void setLastInviteAllTimeStamp(long j) {
        getLastInviteAllTimeStampItem().mo47776a(Long.valueOf(j));
    }

    public void setMultiSelectLimit(int i) {
        getMultiSelectLimitItem().mo47776a(Integer.valueOf(i));
    }

    public void setNetworkLibType(int i) {
        getNetworkLibTypeItem().mo47776a(Integer.valueOf(i));
    }

    public void setOpenImLink(int i) {
        getOpenImLinkItem().mo47776a(Integer.valueOf(i));
    }

    public void setShowAddBusinessGoodsDot(boolean z) {
        getShowAddBusinessGoodsDot().mo47776a(Boolean.valueOf(z));
    }
}
