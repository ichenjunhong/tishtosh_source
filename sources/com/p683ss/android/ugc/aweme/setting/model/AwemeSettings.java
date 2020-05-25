package com.p683ss.android.ugc.aweme.setting.model;

import android.util.SparseArray;
import com.google.gson.C17971f;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.sdk.activity.p1208a.C19723a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.feed.experiment.VideoPreloadSizeExperiment;
import com.p683ss.android.ugc.aweme.p1430bd.p1431a.C23770a;
import com.p683ss.android.ugc.aweme.p1797h.p1798a.C32944d;
import com.p683ss.android.ugc.aweme.p684l.C10909a;
import com.p683ss.android.ugc.aweme.setting.p2137f.C41606b;
import com.p683ss.android.ugc.aweme.story.shootvideo.publish.p2342a.C46672a;
import com.p683ss.android.ugc.aweme.wallet.C48224b;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings */
public class AwemeSettings {
    @C17952c(mo34828a = "activity")
    public C10909a activityStruct;
    @C17952c(mo34828a = "ad_coupon_config")
    public AdCouponConfig adCouponConfig;
    @C17952c(mo34828a = "ad_display_time")
    public int adDisplayTime;
    @C17952c(mo34828a = "ad_intro_for_adversitser_flag")
    private int adIntroForAdversitser_flag;
    @C17952c(mo34828a = "ad_intro_landingpage_url")
    public String adIntroLandingpageUrl;
    @C17952c(mo34828a = "ad_landing_page_config")
    public C19723a adLandingPageConfig;
    @C17952c(mo34828a = "aweme_ad_link_priority")
    public List<String> adLinkPriority;
    @C17952c(mo34828a = "ad_web_container")
    public int adWebContainer;
    @C17952c(mo34828a = "at_friends_show_type")
    public int atFriendsShowType;
    @C17952c(mo34828a = "video_duration_limit_ms")
    public long avVideoDurationLimit = 1000;
    @C17952c(mo34828a = "avatar_decoration_enabled")
    public boolean avatarDecorationEnabled;
    @C17952c(mo34828a = "awe_network_x_token_disabled")
    public int aweNetworkXTokenDisabled;
    @C17952c(mo34828a = "aweme_switch_1")
    public int awemeSwitch1On;
    @C17952c(mo34828a = "aweme_switch_2")
    public int awemeSwitch2On;
    @C17952c(mo34828a = "awesome_splash_filter_enable")
    public boolean awesomeSplashFilterEnable;
    @C17952c(mo34828a = "beauty_model")
    public int beautyModel;
    @C17952c(mo34828a = "bind_fg_guide_texts")
    public List<String> bindFGGuideTexts;
    @C17952c(mo34828a = "bitrate_of_recode_threshold")
    public int bitrateOfRecodeThreshold = 10000000;
    @C17952c(mo34828a = "can_duet")
    public boolean canDuet;
    @C17952c(mo34828a = "im_switch")
    public int canIm = 1;
    @C17952c(mo34828a = "im_image_switch")
    public int canImSendPic;
    @C17952c(mo34828a = "can_show_insights")
    public boolean canInsights;
    @C17952c(mo34828a = "can_be_live_podcast")
    public boolean canLive;
    @C17952c(mo34828a = "can_react")
    public boolean canReact;
    @C17952c(mo34828a = "orange_cdn_config")
    public C23770a cdnDomainRefresh;
    @C17952c(mo34828a = "close_vframe_upload")
    public int closeFramesUpload;
    @C17952c(mo34828a = "comment_setting_enable")
    public int commentSettingEnable;
    @C17952c(mo34828a = "commerce_use_zhima")
    public int commerceUserZhima;
    @C17952c(mo34828a = "complete_profile_policy")
    public CompleteProfilePolicy completeProfilePolicy;
    @C17952c(mo34828a = "coupon_verification_list")
    public String couponVerificationList;
    @C17952c(mo34828a = "current_region")
    public String currentRegion;
    @C17952c(mo34828a = "default_avatar_uris")
    public List<String> defaultAvatarUrls;
    @C17952c(mo34828a = "default_cover_urls")
    public List<UrlModel> defaultCoverUrls;
    @C17952c(mo34828a = "react_mic_status")
    public int defaultMicState;
    @C17952c(mo34828a = "default_second_tab")
    public boolean defaultSecondTab;
    @C17952c(mo34828a = "default_shake_free_mode")
    public boolean defaultShakeFreeOn;
    @C17952c(mo34828a = "fp_upload_device_url")
    public String deviceInfoUrl = "";
    @C17952c(mo34828a = "device_monitor")
    public boolean deviceMonitor;
    @C17952c(mo34828a = "disable_age_gate")
    public int disableAgeGate;
    @C17952c(mo34828a = "disable_iid_in_share_url")
    public boolean disableIidInShareUrl;
    @C17952c(mo34828a = "disable_ucode_in_share_url")
    public boolean disableUCodeInShareUrl;
    @C17952c(mo34828a = "dmt_jsbridge_whitelist")
    public List<String> dmtJsBridgeWhiteList;
    @C17952c(mo34828a = "download_check_status")
    public Integer downloadCheckStatus;
    @C17952c(mo34828a = "download_forbidden_toast")
    public String downloadForbiddenToast;
    @C17952c(mo34828a = "is_download_micro_app")
    public int downloadMicroApp = 1;
    @C17952c(mo34828a = "download_sdk_config")
    public Object downloadSdkConfig;
    @C17952c(mo34828a = "enable_anti_aliasing")
    public boolean enableAntiAliasing;
    @C17952c(mo34828a = "enableBindItemCallOMSDK")
    public int enableBindItemCallOMSDK;
    @C17952c(mo34828a = "enable_email_login")
    public boolean enableEmailLogin;
    @C17952c(mo34828a = "enable_face_to_face")
    public boolean enableFace2Face;
    @C17952c(mo34828a = "enable_fancy_qrcode")
    public int enableFancyQrcode;
    @C17952c(mo34828a = "enable_force_login")
    public int enableForceLogin = 1;
    @C17952c(mo34828a = "ftc_age_enable")
    public int enableFtcAgeGate;
    @C17952c(mo34828a = "enable_hardware_encode")
    public boolean enableHardwareEncode;
    @C17952c(mo34828a = "enable_home_scan_qrcode")
    public boolean enableHomeScanQrCode;
    @C17952c(mo34828a = "enable_hot_start_gps")
    public boolean enableHotStartGps;
    @C17952c(mo34828a = "enable_huawei_super_slow")
    public int enableHuaweiSuperSlowMotion;
    @C17952c(mo34828a = "enable_ijk_player")
    public int enableIJKHardwarePlayer;
    @C17952c(mo34828a = "enable_local_music_entrance")
    public boolean enableLocalMusicEntrance;
    @C17952c(mo34828a = "enable_passport_service")
    public boolean enablePassportService = true;
    @C17952c(mo34828a = "download_setting_enable")
    public int enablePrivacyDownloadSetting;
    @C17952c(mo34828a = "enable_profile_link")
    public boolean enableProfileActivity;
    @C17952c(mo34828a = "enable_read_fancy_qrcode")
    public int enableReadFancyQrcode;
    @C17952c(mo34828a = "enable_synthetic_fps_set")
    public boolean enableSyntheticFpsSet;
    @C17952c(mo34828a = "enable_twitter_new_key_secret")
    public boolean enableTwitterNewKeySecret;
    @C17952c(mo34828a = "enable_ultra_resolution")
    public boolean enableUltraResolution;
    @C17952c(mo34828a = "enable_upload_mobile_pcid")
    public boolean enableUploadPC = true;
    @C17952c(mo34828a = "enable_upload_sync_ins")
    public boolean enableUploadSyncIns = true;
    @C17952c(mo34828a = "enable_upload_sync_ins_story")
    public boolean enableUploadSyncInsStory = true;
    @C17952c(mo34828a = "enable_upload_sync_twitter")
    public boolean enableUploadSyncTwitter = true;
    @C17952c(mo34828a = "enable_water_bg_mask")
    public boolean enableWaterBgMask;
    @C17952c(mo34828a = "face_detect_interval")
    public int faceDetectInterval;
    @C17952c(mo34828a = "fe_config_collection")
    public FeConfigCollection feConfigCollection;
    @C17952c(mo34828a = "aweme_fe_conf")
    public AwemeFEConfigs feConfigs;
    @C17952c(mo34828a = "feed_display_inner_msg_platform")
    public int feedDisplayInnerMsgPlatform;
    @C17952c(mo34828a = "feed_tab")
    public int feedTab;
    @C17952c(mo34828a = "follow_feed_as_default")
    public int followFeedAsDefault;
    @C17952c(mo34828a = "show_follow_tab_following_limit")
    public int followPopularThreshold;
    @C17952c(mo34828a = "follow_feed_guide_settings")
    public FollowTabGuideStruct followTabGuideStruct;
    @C17952c(mo34828a = "forbid_download_local")
    public int forbidDownloadLocal;
    @C17952c(mo34828a = "forbid_life_story_local_watermark")
    public boolean forbidLifeStoryLocalWatermark;
    @C17952c(mo34828a = "forbid_local_watermark")
    public boolean forbidLocalWatermark;
    @C17952c(mo34828a = "force_use_textureview")
    public List<DeviceInfo> forceUseTextureviewDevices;
    @C17952c(mo34828a = "free_flow_card")
    public FreeFlowCard freeFlowCard;
    @C17952c(mo34828a = "free_flow_card_url_sticker")
    public String freeFlowCardUrl = "";
    @C17952c(mo34828a = "friend_tab_avatar_duration")
    public int friendTabAvatarDuration;
    @C17952c(mo34828a = "friend_tab_settings")
    public FriendTabStruct friendTabSettings;
    @C17952c(mo34828a = "aweme_game_config")
    public Object gameConfig;
    @C17952c(mo34828a = "aweme_gecko_offline_host_prefix")
    public List<String> geckoOfflineHostPrefix;
    @C17952c(mo34828a = "global_tips")
    public GlobalTips globalTips;
    @C17952c(mo34828a = "hashtag_regex")
    public String hashTagRegex;
    @C17952c(mo34828a = "hateful")
    public C41606b hateFulConfig;
    @C17952c(mo34828a = "wvalantine_activity_bg_profile_url")
    public String hitRankActivityProfileBackground;
    @C17952c(mo34828a = "wvalantine_activity_bg_url")
    public String hitRankActivityStarBackgroud;
    @C17952c(mo34828a = "wvalantine_activity_status")
    public int hitRankActivityStatus;
    @C17952c(mo34828a = "guide_word_display_settings")
    public HotSearchDisplay hotSearchDisplay;
    @C17952c(mo34828a = "hotsearch_switchs")
    public HotSearchWitch hotSearchWitch;
    @C17952c(mo34828a = "search_carousel_intervals")
    public int hotSearchWordShowIntervals;
    @C17952c(mo34828a = "hotsoon_download_url")
    public String hotsoonDownloadUrl;
    @C17952c(mo34828a = "http_retry_count")
    public int httpRetryCount;
    @C17952c(mo34828a = "http_retry_interval")
    public long httpRetryInterval;
    @C17952c(mo34828a = "http_timeout")
    public long httpTimeOut;
    @C17952c(mo34828a = "https_list")
    public ArrayList<String> httpsList;
    @C17952c(mo34828a = "user_login_window")
    public ThirdLoginSetting i18nThridLoginSetting;
    @C17952c(mo34828a = "im_comment_forward_enabled")
    public boolean imCommentForwardEnabled;
    @C17952c(mo34828a = "upload_video_size_category")
    public List<String> importVideoSizeCategory;
    @C17952c(mo34828a = "in_camera2_black_list")
    public int inCamera2BlackList;
    @C17952c(mo34828a = "in_evening")
    public int inEvening;
    @C17952c(mo34828a = "in_ultra_resolution_black_list")
    public boolean inUltraResBlackList;
    @C17952c(mo34828a = "info_sticker_max_count")
    public int infoStickerMaxCount;
    @C17952c(mo34828a = "is_eea_region")
    public Boolean isEEARegion;
    @C17952c(mo34828a = "enable_hq_vframe")
    public boolean isEnableHqVFrame;
    @C17952c(mo34828a = "is_europe_country")
    public boolean isEuropeCountry;
    @C17952c(mo34828a = "is_force_https")
    public int isForceHttps = 1;
    @C17952c(mo34828a = "with_commerce_entry")
    public boolean isGoodsWhiteUser;
    @C17952c(mo34828a = "is_npth_enable")
    public boolean isNpthEnable;
    @C17952c(mo34828a = "is_ob")
    public boolean isOb;
    @C17952c(mo34828a = "private_available")
    public boolean isPrivateAvailable;
    @C17952c(mo34828a = "is_show_gif_button")
    public int isShowGifButton;
    @C17952c(mo34828a = "nearby_tab")
    public boolean isShowNearByTab;
    @C17952c(mo34828a = "is_target_binding_user")
    public boolean isTargetBindingUser;
    @C17952c(mo34828a = "refresh_available")
    public boolean isUseBackRefresh;
    @C17952c(mo34828a = "is_use_ttnet")
    public boolean isUseTTnet;
    @C17952c(mo34828a = "is_use_tongdun_sdk")
    public boolean isUseTongdunSdk;
    @C17952c(mo34828a = "js_actlog_url")
    public String jsActLogUrl;
    @C17952c(mo34828a = "lab_title")
    public String labTitle;
    @C17952c(mo34828a = "live_default_bitrate")
    public int liveDefaultBitrate;
    @C17952c(mo34828a = "live_fe_conf")
    public LiveFEConfigs liveFEConfigs;
    @C17952c(mo34828a = "live_label_display_settings")
    private LiveLabelDisplaySettings liveLabelDisplaySettings;
    @C17952c(mo34828a = "live_max_bitrate")
    public int liveMaxBitrate;
    @C17952c(mo34828a = "live_min_bitrate")
    public int liveMinBitrate;
    @C17952c(mo34828a = "live_skylight_show_animation")
    public boolean liveSkylightShowAnimation;
    @C17952c(mo34828a = "live_use_zhima")
    public int liveUserZhima;
    @C17952c(mo34828a = "long_video_permitted")
    public boolean longVideoPermitted;
    @C17952c(mo34828a = "long_video_threshold")
    public long longVideoThreshold;
    @C17952c(mo34828a = "luban_entry_url")
    public String lubanEntryUrl;
    @C17952c(mo34828a = "tt_fusion_fuel_sdk_settings")
    public JSONObject mFusionFuelSdkSettings;
    @C17952c(mo34828a = "gdpr_cookies_url")
    public String mGDPRCookiesUrl;
    @C17952c(mo34828a = "gdpr_privacy_url")
    public String mGDPRPrivacyUrl;
    @C17952c(mo34828a = "aweme_gecko_conf")
    public GeckoConfig mGeckoConfig;
    @C17952c(mo34828a = "invite_friends_strategy")
    public int mInviteFriendsStrategy;
    @C17952c(mo34828a = "live_clarity_adapt_auto")
    public int mLiveClarityAdaptAuto;
    @C17952c(mo34828a = "live_shortcut_gift_id")
    public long mLiveShortcutGiftId;
    @C17952c(mo34828a = "show_invite_friends_entry")
    public boolean mShowInviteFriends;
    @C17952c(mo34828a = "video_upload_normalization_param")
    public int maxFansCount;
    @C17952c(mo34828a = "music_billboard_rule_url")
    public String musicBillboardRuleUrl;
    @C17952c(mo34828a = "music_copyright_granted")
    public boolean musicCopyRight;
    @C17952c(mo34828a = "musician_show_type")
    public int musicianShowType;
    @C17952c(mo34828a = "need_choose_languages")
    public String[] needChooseLanguages;
    @C17952c(mo34828a = "need_pre_load")
    public int needPreLoad = 1;
    @C17952c(mo34828a = "negative_share_entry")
    public String negativeShareEntry;
    @C17952c(mo34828a = "network_lib_type")
    public int netWorkLibType;
    @C17952c(mo34828a = "new_anchor_show_bubble")
    public boolean newAnchorShowBubble;
    @C17952c(mo34828a = "not_support_dou_devices")
    public List<DeviceInfo> notSupportDouDevices;
    @C17952c(mo34828a = "notice_close_time")
    public long noticeCloseTime;
    @C17952c(mo34828a = "notice_count_latency")
    public int noticeCountLatency;
    @C17952c(mo34828a = "old_style_challenge_ids")
    public Set<String> oldStyleChallengeIds;
    @C17952c(mo34828a = "open_forward")
    public int openForward;
    @C17952c(mo34828a = "orange_activity_info_use_api")
    public boolean orangeActivityInfoUseApi;
    @C17952c(mo34828a = "orginal_musician_url")
    public String orginalMusicianUrl;
    @C17952c(mo34828a = "original_musician_share_style")
    public boolean originalMusicianShare;
    @C17952c(mo34828a = "other_profile_landing_tabs")
    public List<Integer> otherProfileLandingTabs;
    @C17952c(mo34828a = "pic_qrcode_recognition_switch")
    public int picQrcodeRecognitionSwitch = 1;
    @C17952c(mo34828a = "policy_notice_enable")
    public boolean policyNoticeEnanble;
    @C17952c(mo34828a = "popWindowEveryTime_postaweme")
    public boolean popWindowEveryTimePostAweme;
    @C17952c(mo34828a = "popWindowEveryTime_postcomment")
    public boolean popWindowEveryTimePostComment;
    @C17952c(mo34828a = "privacy_reminder")
    public String privacyReminder = "";
    @C17952c(mo34828a = "private_permission")
    public int privatePermission;
    @C17952c(mo34828a = "profile_completion_threshold")
    public float profileCompletionThreshold;
    @C17952c(mo34828a = "profile_completion")
    public ProfilePerfection profilePerfection;
    @C17952c(mo34828a = "progressbar_threshold")
    public long progressBarThreshold;
    @C17952c(mo34828a = "story_publish_sync_duoshan")
    public C46672a publishSyncDuoshanAllConfig;
    @C17952c(mo34828a = "push_pre_permission_view")
    public PushPrePermissionView pushPrePermissionView;
    @C17952c(mo34828a = "qrcode_domain_whitelist")
    public List<String> qrcodeDomainWhiteList;
    @C17952c(mo34828a = "video_bitrate_category")
    public List<Float> recordBitrateCategory;
    @C17952c(mo34828a = "record_bitrate_mode")
    public int recordBitrateMode = 1;
    @C17952c(mo34828a = "record_camera_compat_level")
    public int recordCameraCompatLevel = 1;
    @C17952c(mo34828a = "record_camera_type")
    public int recordCameraType;
    @C17952c(mo34828a = "record_open_high_profile")
    public int recordHardwareProfile = 1;
    @C17952c(mo34828a = "video_quality_category")
    public List<Integer> recordQualityCategory;
    @C17952c(mo34828a = "shoot_tutorial_link")
    public String recordTutorialLink;
    @C17952c(mo34828a = "video_quality")
    public int recordVideoQuality;
    @C17952c(mo34828a = "redpackage_on")
    public boolean redPackageOn = true;
    @C17952c(mo34828a = "referral_program_url")
    public String referralProgramUrl;
    @C17952c(mo34828a = "refresh_zhima")
    public int refreshZhima;
    @C17952c(mo34828a = "region_of_residence")
    public String regionOfResidence;
    @C17952c(mo34828a = "remove_follower_switch")
    public boolean removeFollowerSwitch;
    @C17952c(mo34828a = "request_user_info_for_start")
    public boolean requestUserInfoForStart;
    @C17952c(mo34828a = "search_tab")
    public List<String> searchTabIndex;
    @C17952c(mo34828a = "search_trend_banner_url")
    public UrlModel searchTrendBannerUrl;
    @C17952c(mo34828a = "self_profile_landing_tabs")
    public List<Integer> selfProfileLandingTabs;
    @C17952c(mo34828a = "self_see_watermark_switch")
    public boolean selfSeeWaterMarkSwitch = true;
    @C17952c(mo34828a = "settings_change_test")
    public int settingChangeTest;
    @C17952c(mo34828a = "settings_version")
    public String settingVersion;
    @C17952c(mo34828a = "shake_free_white_list")
    public int shakeFreeWhiteList;
    @C17952c(mo34828a = "share_direct_with_pic")
    public boolean sharePictureDirect;
    @C17952c(mo34828a = "share_url_whitelist")
    public WhiteList shareUrlWhiteList;
    @C17952c(mo34828a = "share_h5_url_whitelist")
    public List<String> share_h5_url_whitelist;
    @C17952c(mo34828a = "shield_music_sdk")
    public boolean shieldMusicSDK;
    @C17952c(mo34828a = "shopping")
    public ShoppingConfig shoppingConfig;
    @C17952c(mo34828a = "download_setting_desc_enable")
    public boolean showAllowDownloadTip;
    @C17952c(mo34828a = "show_creator_license_230")
    public ShowCreatorLicense showCreatorLicense;
    @C17952c(mo34828a = "enable_hashtag_profile")
    public int showHashTagBg;
    @C17952c(mo34828a = "show_interaction_stickers")
    public boolean showInteractionStickers;
    @C17952c(mo34828a = "show_large_gif")
    public boolean showLargeGif;
    @C17952c(mo34828a = "story_support_animate")
    public boolean showLastStoryFrame;
    @C17952c(mo34828a = "show_live_rewards")
    public int showLiveRewards;
    @C17952c(mo34828a = "original_musician_entry")
    public boolean showOriginalMusicianEntry;
    @C17952c(mo34828a = "show_creator_license_210")
    public int showPromoteLicense;
    @C17952c(mo34828a = "fresh_tab")
    public int showTimeLineTab;
    @C17952c(mo34828a = "shutter_sound_enable")
    public boolean shutterSoundEnable;
    @C17952c(mo34828a = "sort_speed_enable")
    public boolean sortSpeedEnable;
    @C17952c(mo34828a = "sp")

    /* renamed from: sp */
    public C41638Sp f105366sp;
    @C17952c(mo34828a = "splash_image_center")
    public boolean splashImageCenter;
    @C17952c(mo34828a = "splash_support_timeout")
    public boolean splashSupportTimeOut;
    @C17952c(mo34828a = "splash_video_center")
    public boolean splashVideoCenter;
    @C17952c(mo34828a = "life_effects_cold_req")
    public boolean springEffectCacheController = true;
    @C17952c(mo34828a = "star_atlas_setting")
    private StarAtlasSetting starAtlasSetting;
    @C17952c(mo34828a = "star_billboard_rule_url")
    public String starBillboardRuleUrl;
    @C17952c(mo34828a = "sticker_artist_entry")
    public boolean stickerArtistEntry;
    @C17952c(mo34828a = "sticker_artist_url")
    public String stickerArtistUrl;
    @C17952c(mo34828a = "story_friend_banner_switch")
    public int storyFriendBannerSwitch;
    @C17952c(mo34828a = "story_friend_banner_url")
    public String storyFriendBannerUrl;
    @C17952c(mo34828a = "story_image_play_time")
    public int storyImagePlayTime;
    @C17952c(mo34828a = "sync_to_toutiao")
    public int syncToTT;
    @C17952c(mo34828a = "sync_to_toutiao_url")
    public String syncToTTUrl;
    @C17952c(mo34828a = "synthetic_video_bitrate")
    public float syntheticVideoBitrate;
    @C17952c(mo34828a = "synthetic_video_gop")
    public int syntheticVideoGop = 35;
    @C17952c(mo34828a = "synthetic_video_maxrate")
    public long syntheticVideoMaxRate = 15000000;
    @C17952c(mo34828a = "synthetic_video_preset")
    public int syntheticVideoPreset;
    @C17952c(mo34828a = "synthetic_video_quality")
    public int syntheticVideoQuality;
    @C17952c(mo34828a = "tencent_sdk_disabled")
    public boolean tencentSdkDisabled;
    @C17952c(mo34828a = "text_sticker_max_count")
    public int textStickerMaxCount;
    @C17952c(mo34828a = "third_login_bind_settings")
    public C32944d thirdPlatformLoginSettings;
    @C17952c(mo34828a = "tt_device_info_collect_controller")
    public TTDeviceInfoCollectController ttDeviceInfoCollectController;
    @C17952c(mo34828a = "ttregion")
    public boolean ttRegion;
    @C17952c(mo34828a = "ttnet_route")
    public boolean ttRoute;
    @C17952c(mo34828a = "ttplayer_buffer_duration_switch")
    public int ttplayerBufferDuration;
    @C17952c(mo34828a = "ultra_resolution_level")
    public int ultraResolutionLevel;
    @C17952c(mo34828a = "wx_toast_config")
    public UpdateUserConfig updateUserConfig;
    @C17952c(mo34828a = "upload_origin_audio_track")
    public boolean uploadOriginAudioTrack;
    @C17952c(mo34828a = "upload_contacts_policy_caption")
    public String upload_contacts_policy_caption;
    @C17952c(mo34828a = "upload_contacts_policy_interval")
    public int upload_contacts_policy_interval;
    @C17952c(mo34828a = "upload_contacts_policy_pic")
    public String upload_contacts_policy_pic;
    @C17952c(mo34828a = "upload_contacts_policy_text")
    public String upload_contacts_policy_text;
    @C17952c(mo34828a = "upload_contacts_policy_times")
    public int upload_contacts_policy_times;
    @C17952c(mo34828a = "use_hardcode")
    public int useHardcode;
    @C17952c(mo34828a = "enable_large_gesture_detect_model")
    public boolean useLargeDetectModel = true;
    @C17952c(mo34828a = "enable_large_matting_detect_model")
    public boolean useLargeMattingModel;
    @C17952c(mo34828a = "use_live_wallpaper")
    public int useLiveWallpaper;
    @C17952c(mo34828a = "awe_security_center_v2")
    public int useNewDouyinSaftyCenter;
    @C17952c(mo34828a = "use_new_ffmpeg")
    public boolean useNewFFmpeg;
    @C17952c(mo34828a = "use_synthetic_hardcode")
    public int useSyntheticHardcode;
    @C17952c(mo34828a = "use_watermark_hardcode")
    public boolean useWatermarkHardcode;
    @C17952c(mo34828a = "cache_user_recommend")
    public UserCacheSetting userCacheSetting;
    @C17952c(mo34828a = "verify_exceed")
    public int verifyExceed;
    @C17952c(mo34828a = "user_badge_click_settings")
    public VerifyTypeSetting verifyTypeSetting;
    @C17952c(mo34828a = "video_bitrate")
    public float videoBitrate;
    @C17952c(mo34828a = "video_commit")
    public int videoCommit;
    @C17952c(mo34828a = "video_compose")
    public int videoCompose;
    @C17952c(mo34828a = "video_preload_size")
    public int videoPreloadSize = VideoPreloadSizeExperiment.DEFAULT;
    @C17952c(mo34828a = "video_size")
    public String videoSize;
    @C17952c(mo34828a = "video_size_category")
    public List<String> videoSizeCategory;
    @C17952c(mo34828a = "wallet_conf")
    public C48224b walletConfig;
    @C17952c(mo34828a = "weak_net_pre_load_switch")
    public int weakNetPreLoadSwitch = 1;
    @C17952c(mo34828a = "wide_camera_info")
    public int wideCameraInfo;
    @C17952c(mo34828a = "x2c_switch")
    public int x2cSwitch;

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$AdCouponConfig */
    public static class AdCouponConfig {
        @C17952c(mo34828a = "show")
        public int show;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$AwemeFEConfigs */
    public static class AwemeFEConfigs {
        @C17952c(mo34828a = "business_ec")
        public BusinessEC businessEC;
        @C17952c(mo34828a = "goods_report")
        public GoodsReport goodsReport;
        @C17952c(mo34828a = "link_plan")
        public LinkPlan linkPlan;
        @C17952c(mo34828a = "live")
        public ShopLiveConfig live;
        @C17952c(mo34828a = "mp_tab")
        public MpTab mpTab;
        @C17952c(mo34828a = "poi_error_report")
        public PoiConfig poiConfig;
        @C17952c(mo34828a = "seeding")
        public Seeding seeding;
        @C17952c(mo34828a = "star_atlas_order")
        public StarAtlasOrder starAtlasOrder;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$BusinessEC */
    public static class BusinessEC {
        @C17952c(mo34828a = "page_eshop_toolbox")
        public String pageEShopToolbox;
        @C17952c(mo34828a = "page_edit")
        public String pageEdit;
        @C17952c(mo34828a = "page_home")
        public String pageHome;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$CompleteProfilePolicy */
    public static class CompleteProfilePolicy {
        public int interval;
        public int times;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$DeviceInfo */
    public static class DeviceInfo {
        @C17952c(mo34828a = "brand")
        public String brand;
        @C17952c(mo34828a = "device")
        public String device;
        @C17952c(mo34828a = "model")
        public String model;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$FEConfig */
    public static class FEConfig {
        @C17952c(mo34828a = "fallback_url")
        public String fallbackUrl;
        @C17952c(mo34828a = "schema")
        public String schema;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$FeConfigCollection */
    public static class FeConfigCollection {
        @C17952c(mo34828a = "billboard_fans")
        public FEConfig billboardFans;
        @C17952c(mo34828a = "billboard_star")
        public FEConfig billboardStar;
        @C17952c(mo34828a = "brand_rank")
        public FEConfig brandRank;
        @C17952c(mo34828a = "douyincard")
        public FEConfig douyincard;
        @C17952c(mo34828a = "guardian_child")
        public FEConfig guardianChild;
        @C17952c(mo34828a = "guardian_parent")
        public FEConfig guardianParent;
        @C17952c(mo34828a = "judgment_clause")
        public FEConfig judgementClause;
        @C17952c(mo34828a = "ringtone")
        public FEConfig ringtone;
        @C17952c(mo34828a = "teen_protection")
        public FEConfig teenageProtection;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$FreeFlowCard */
    public static class FreeFlowCard {
        @C17952c(mo34828a = "toast_url_text")
        public String dialogContent = "";
        @C17952c(mo34828a = "toast_slogan")
        public String dialogSlogan;
        @C17952c(mo34828a = "toast_title")
        public String dialogTitle = "";
        @C17952c(mo34828a = "toast_type")
        public int dialogType;
        @C17952c(mo34828a = "toast_url")
        public String dialogUrl = "";
        @C17952c(mo34828a = "entry_url_text")
        public String settingsTitle = "";
        @C17952c(mo34828a = "entry_url")
        public String settingsUrl = "";

        public String toString() {
            StringBuilder sb = new StringBuilder("FreeFlowCard{dialogUrl='");
            sb.append(this.dialogUrl);
            sb.append('\'');
            sb.append(", settingsTitle='");
            sb.append(this.settingsTitle);
            sb.append('\'');
            sb.append(", settingsUrl='");
            sb.append(this.settingsUrl);
            sb.append('\'');
            sb.append(", dialogTitle='");
            sb.append(this.dialogTitle);
            sb.append('\'');
            sb.append(", dialogContent='");
            sb.append(this.dialogContent);
            sb.append('\'');
            sb.append(", dialogType=");
            sb.append(this.dialogType);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$GeckoConfig */
    public static class GeckoConfig {
        @C17952c(mo34828a = "initial_high_priority_channel")
        public List<String> initialHighPriorityChannels;
        @C17952c(mo34828a = "dyc_channel")
        public List<String> mDynamicChannels;
        @C17952c(mo34828a = "initial_channel")
        public List<String> mInitChannels;
        @C17952c(mo34828a = "rn_context_create_timeout")
        public int rnContextCreateTimeOut;
        @C17952c(mo34828a = "rn_preload_context")
        public boolean rnPreloadContextOn = true;
        @C17952c(mo34828a = "rn_use_snapshot")
        public boolean rnSnapShotOn = true;
        @C17952c(mo34828a = "use_new_package_now")
        public boolean useNewPackageNow;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$GlobalTips */
    public static class GlobalTips {
        public String at_too_more = "";
        public String draft_publish = "";
        public String net_weak = "";
        public String not_comment = "";
        public String not_has_more = "";
        public String not_share = "";
        public String search_tips = "";
        public String self_see_not_share = "";
        public String share_fail = "";

        public static SparseArray<String> buildGlobalTipsMap(GlobalTips globalTips) {
            SparseArray<String> sparseArray = new SparseArray<>();
            sparseArray.put(R.string.c56, globalTips.at_too_more);
            sparseArray.put(R.string.wa, globalTips.not_comment);
            sparseArray.put(R.string.wc, globalTips.not_share);
            sparseArray.put(R.string.d_3, globalTips.draft_publish);
            sparseArray.put(R.string.cg2, globalTips.net_weak);
            sparseArray.put(R.string.dd1, globalTips.self_see_not_share);
            return sparseArray;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$GoodsReport */
    public static class GoodsReport {
        @C17952c(mo34828a = "publish")
        public String publish;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$HonorLevel */
    public static class HonorLevel {
        @C17952c(mo34828a = "schema")
        public String schema;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$HotSearchDisplay */
    public static class HotSearchDisplay {
        @C17952c(mo34828a = "one_display_intervals")
        public long normalGuideDisplayTimeIntervals;
        @C17952c(mo34828a = "most_display_times")
        public int normalGuideDisplayTimes;
        @C17952c(mo34828a = "op_one_display_intervals")
        public long operationGuideDisplayTimeIntervals;
        @C17952c(mo34828a = "op_most_display_times")
        public int operationGuideDisplayTimes;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$HotSearchWitch */
    public static class HotSearchWitch {
        @C17952c(mo34828a = "hotsearch_aweme_billboard_switch")
        public boolean isHotSearchAwemeBillboardEnable;
        @C17952c(mo34828a = "hotsearch_billboard_switch")
        public boolean isHotSearchBillboardEnable;
        @C17952c(mo34828a = "hotsearch_music_billboard_switch")
        public boolean isHotSearchMusicBillboardEnable;
        @C17952c(mo34828a = "hotsearch_positive_energy_billboard_switch")
        public boolean isHotSearchPositiveEnergyBillboardEnable;
        @C17952c(mo34828a = "hotsearch_star_billboard_switch")
        public boolean isHotSearchStarBillboardEnable;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$LinkPlan */
    public static class LinkPlan {
        @C17952c(mo34828a = "publish")
        public String publish;
        @C17952c(mo34828a = "settings")
        public String settings;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$LiveFEConfigs */
    public static class LiveFEConfigs {
        @C17952c(mo34828a = "honor_level")
        public HonorLevel honorLevel;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$LiveLabelDisplaySettings */
    public static class LiveLabelDisplaySettings {
        @C17952c(mo34828a = "display_duration")
        public long displayDuration;
        @C17952c(mo34828a = "display_intervals")
        public long displayIntervals;
        @C17952c(mo34828a = "most_display_times")
        public int mostDisplayTimes;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$MpTab */
    public static class MpTab {
        @C17952c(mo34828a = "publish")
        public String publish;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$PoiConfig */
    public static class PoiConfig {
        @C17952c(mo34828a = "poi_detail")
        public String poiDetail;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$ProfilePerfection */
    public static class ProfilePerfection {
        public float avatar;
        public float birthday;
        public float gender;
        public float location;
        public float nickname;
        public float school;
        @C17952c(mo34828a = "short_id")
        public float shortId;
        public float signature;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$PushPrePermissionView */
    public static class PushPrePermissionView {
        @C17952c(mo34828a = "toast_text")
        public String toastText;
        @C17952c(mo34828a = "toast_title")
        public String toastTitle;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$Seeding */
    public static class Seeding {
        @C17952c(mo34828a = "shop_wish_list_url")
        public String shopWishListUrl;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$ShopLiveConfig */
    public static class ShopLiveConfig {
        @C17952c(mo34828a = "merch_picker_url")
        public String merchPickerUrl;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$ShoppingConfig */
    public static class ShoppingConfig {
        @C17952c(mo34828a = "enable")
        public boolean enable;
        @C17952c(mo34828a = "enable_float_video")
        public boolean enableFloatVideo = true;
        @C17952c(mo34828a = "enable_user")
        public boolean enableUser;
        @C17952c(mo34828a = "law_window")
        public boolean lawWindow;
        @C17952c(mo34828a = "live")
        public ShoppingLiveConfig liveConfig;
        @C17952c(mo34828a = "newbie_help")
        public ShoppingNewbieHelp newbieHelp;
        @C17952c(mo34828a = "order_share_intro_url")
        public String orderShareIntroUrl;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$ShoppingLiveConfig */
    public static class ShoppingLiveConfig {
        @C17952c(mo34828a = "compatible_with_old_version")
        public boolean commerceLiveCompatibleOld;
        @C17952c(mo34828a = "disable_taobao")
        public int disableTaobao;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$ShoppingNewbieHelp */
    public static class ShoppingNewbieHelp {
        @C17952c(mo34828a = "shop_url")
        public String shopUrl;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$ShowCreatorLicense */
    public static class ShowCreatorLicense {
        @C17952c(mo34828a = "click_type")
        public int clickType;
        @C17952c(mo34828a = "popup_content")
        public String content;
        @C17952c(mo34828a = "popup_interval")
        public int interval;
        @C17952c(mo34828a = "popup_linkText")
        public String linkText;
        @C17952c(mo34828a = "popup_msg")
        public String msg;
        @C17952c(mo34828a = "show")
        public int show;
        @C17952c(mo34828a = "popup_times_limit")
        public int timeLimit;
        @C17952c(mo34828a = "popup_title")
        public String title;
        @C17952c(mo34828a = "popup_url")
        public String url;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$StarAtlasOrder */
    public static class StarAtlasOrder {
        @C17952c(mo34828a = "publish")
        public String publish;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$StarAtlasSetting */
    public static class StarAtlasSetting {
        @C17952c(mo34828a = "star_atlas_enable")
        public boolean starAtlasEnable = true;
        @C17952c(mo34828a = "star_atlas_redirect_url")
        public String starAtlasRedirectUrl;
        @C17952c(mo34828a = "star_atlas_url")
        public String starAtlasUrl;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$UpdateUserConfig */
    public static class UpdateUserConfig {
        @C17952c(mo34828a = "wx_toast_enable")
        public boolean enableUpdateUserDialog;
        @C17952c(mo34828a = "wx_toast_frequence")
        public int updateUserFrequency;
        @C17952c(mo34828a = "wx_toast_content")
        public String updateUserPolicyContent;
        @C17952c(mo34828a = "wx_toast_position")
        public int updateUserPosition = -1;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.model.AwemeSettings$UserCacheSetting */
    public static class UserCacheSetting {
        @C17952c(mo34828a = "enable_ru_insert")
        public int enableCacheUserInsert;
        @C17952c(mo34828a = "enable_ru_cache")
        public int enableUserCache;
        @C17952c(mo34828a = "ru_cache_intervals")
        public long fetchUserCacheIntervals;
    }

    public boolean getAdIntroForAdversitserFlag() {
        if (this.adIntroForAdversitser_flag == 1) {
            return true;
        }
        return false;
    }

    public boolean getNeedPreLoad() {
        if (this.needPreLoad == 1) {
            return true;
        }
        return false;
    }

    public int getSharePictureDirect() {
        if (this.sharePictureDirect) {
            return 1;
        }
        return 0;
    }

    public boolean isChangeFollowTab() {
        if (this.feedTab == 1) {
            return true;
        }
        return false;
    }

    public boolean isShowTimeLineTab() {
        if (this.showTimeLineTab == 1) {
            return true;
        }
        return false;
    }

    public long getDisplayDuration() {
        if (this.liveLabelDisplaySettings == null) {
            return 0;
        }
        return this.liveLabelDisplaySettings.displayDuration;
    }

    public long getDisplayIntervals() {
        if (this.liveLabelDisplaySettings == null) {
            return 0;
        }
        return this.liveLabelDisplaySettings.displayIntervals;
    }

    public int getMostDisplayTimes() {
        if (this.liveLabelDisplaySettings == null) {
            return 0;
        }
        return this.liveLabelDisplaySettings.mostDisplayTimes;
    }

    public String getSearchTabIndex() {
        return new C17971f().mo34889b(this.searchTabIndex);
    }

    public String getStarAtlasRedirectUrl() {
        if (this.starAtlasSetting == null) {
            return null;
        }
        return this.starAtlasSetting.starAtlasRedirectUrl;
    }

    public String getStarAtlasUrl() {
        if (this.starAtlasSetting == null) {
            return null;
        }
        return this.starAtlasSetting.starAtlasUrl;
    }

    public boolean isStarAtlasNoticeEnable() {
        if (this.starAtlasSetting == null || this.starAtlasSetting.starAtlasEnable) {
            return true;
        }
        return false;
    }

    public AwemeSettings setDefaultSecondTab(boolean z) {
        this.defaultSecondTab = z;
        return this;
    }

    public AwemeSettings setDisableAgeGate(int i) {
        this.disableAgeGate = i;
        return this;
    }

    public AwemeSettings setEnableFtcAgeGate(int i) {
        this.enableFtcAgeGate = i;
        return this;
    }

    public AwemeSettings setFriendTabSettings(FriendTabStruct friendTabStruct) {
        this.friendTabSettings = friendTabStruct;
        return this;
    }

    public AwemeSettings setHttpsList(ArrayList<String> arrayList) {
        this.httpsList = arrayList;
        return this;
    }

    public AwemeSettings setIsForceHttps(int i) {
        this.isForceHttps = i;
        return this;
    }

    public AwemeSettings setUseTTnet(boolean z) {
        this.isUseTTnet = z;
        return this;
    }

    public AwemeSettings setUseTongdunSdk(boolean z) {
        this.isUseTongdunSdk = z;
        return this;
    }
}
