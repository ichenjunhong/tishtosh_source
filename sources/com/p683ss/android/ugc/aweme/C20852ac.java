package com.p683ss.android.ugc.aweme;

import com.bytedance.ies.C10174a;
import com.bytedance.ies.C10616c;
import com.bytedance.ies.abmock.C10193n;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.AdFeSettings;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.AdLandingPageConfig;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.AgeGateSettings;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.AppStoreMessage;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.AssociativeEmoticonAll;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.AwemeFEConfigs;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.AwemeFeEliteItem;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.BioSettings;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.CommentListAdMigration;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.CommerceEggConfig;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.ContactUploadUiLimits;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.ContentLanguageGuideSetting;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.DouplusTextStruct;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.DouyinFeBusiness;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.DouyinOrderSetting;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.EPlatformSettings;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.EmailLoginSettings;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.FeAnchorAdConf;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.FeConfigCollection;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.FeedbackConf;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.FlexibleUpdateStrategy;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.FlipChatSettings;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.HotSearchWitch;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.HybridMonitorConfig;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettings;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IMUseOkHttpClientConfig;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IMXPlanSetting;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.ImCreateChatBubble;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.LikePraiseDialogInfo;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.LiveCnySetting;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.LiveInnerPushConfig;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.MtcertSettings;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.NewAnchorShowBubbleSettings;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.OriginChannelTab;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.PoiSetting;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.PopupBlackList;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.ProAccountEnableDetailInfo;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.QuickShopLoadingPage;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.SearchPullFeedbackStruct;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.ShareChannelSettings;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.ShoppingConfig;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.SpringApiLimitConfig;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.SuperEntranceConfig;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.UlikeParams;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.UserAntiAddiction;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.VCDV1ConfigStruct;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.VisionSearchStruct;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.WhatsAppCodeItem;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.pushGuideInfo;
import com.p683ss.android.ugc.aweme.settings2.AdTrackerConfigSettings;
import com.p683ss.android.ugc.aweme.settings2.AiMusicBackupStrategySettings;
import com.p683ss.android.ugc.aweme.settings2.AntiAddictionDayTimeSettings;
import com.p683ss.android.ugc.aweme.settings2.AntiAddictionNightTimeSettings;
import com.p683ss.android.ugc.aweme.settings2.AntiAddictionSeparationSettings;
import com.p683ss.android.ugc.aweme.settings2.AntiAddictionToastTimeSettings;
import com.p683ss.android.ugc.aweme.settings2.AutoLiveStateIntervalMillsSettings;
import com.p683ss.android.ugc.aweme.settings2.AwesomeSplashForceUseH264Settings;
import com.p683ss.android.ugc.aweme.settings2.BackgroundPausePlayerSettingSettings;
import com.p683ss.android.ugc.aweme.settings2.BusinessEshopManagerSettings;
import com.p683ss.android.ugc.aweme.settings2.CheckLarkInhouseNetSettings;
import com.p683ss.android.ugc.aweme.settings2.CloseLoginAgreementSettings;
import com.p683ss.android.ugc.aweme.settings2.CloseSyncToHeloEntrySettings;
import com.p683ss.android.ugc.aweme.settings2.DisableOnlineSmallEmojiSettings;
import com.p683ss.android.ugc.aweme.settings2.DisableQiVideoShareSettings;
import com.p683ss.android.ugc.aweme.settings2.DisableVastBitrateSettings;
import com.p683ss.android.ugc.aweme.settings2.DisallowVastHasAuthorSettings;
import com.p683ss.android.ugc.aweme.settings2.DoulabUseInformationUrlSettings;
import com.p683ss.android.ugc.aweme.settings2.DouplusBulletEntrySettings;
import com.p683ss.android.ugc.aweme.settings2.DouplusEntryFeedSettings;
import com.p683ss.android.ugc.aweme.settings2.DraftUseMultiVideoEditSettings;
import com.p683ss.android.ugc.aweme.settings2.EditEffectAutoDownloadSizeSettings;
import com.p683ss.android.ugc.aweme.settings2.EnableAdRouterSettings;
import com.p683ss.android.ugc.aweme.settings2.EnableAnchorCacheSettings;
import com.p683ss.android.ugc.aweme.settings2.EnableAutoLiveStateSettings;
import com.p683ss.android.ugc.aweme.settings2.EnableAvStorageMonitorSettings;
import com.p683ss.android.ugc.aweme.settings2.EnableCameraBeautifyEffectSettings;
import com.p683ss.android.ugc.aweme.settings2.EnableCommentCreateStickerSettings;
import com.p683ss.android.ugc.aweme.settings2.EnableCommentOffensiveFilterSwitchSettings;
import com.p683ss.android.ugc.aweme.settings2.EnableCoverEffectSettings;
import com.p683ss.android.ugc.aweme.settings2.EnableDisplayFavoriteMiniappSettings;
import com.p683ss.android.ugc.aweme.settings2.EnableDisplayFavoriteMinigameSettings;
import com.p683ss.android.ugc.aweme.settings2.EnableEmailVerificationSettings;
import com.p683ss.android.ugc.aweme.settings2.EnableEnterLiveRoomStreamOptFromFollowSkySettings;
import com.p683ss.android.ugc.aweme.settings2.EnableEnterLiveRoomStreamOptSettings;
import com.p683ss.android.ugc.aweme.settings2.EnableGroupMemberByFollowersSettings;
import com.p683ss.android.ugc.aweme.settings2.EnableHighRiskRebindAlertSettings;
import com.p683ss.android.ugc.aweme.settings2.EnableLiveDrawerDialogSettings;
import com.p683ss.android.ugc.aweme.settings2.EnableLiveSplashSettings;
import com.p683ss.android.ugc.aweme.settings2.EnableMojiUpdateResourcesSettings;
import com.p683ss.android.ugc.aweme.settings2.EnableNewUserInfoSyncSettings;
import com.p683ss.android.ugc.aweme.settings2.EnableNormalSplashAdSettings;
import com.p683ss.android.ugc.aweme.settings2.EnableParamsOverrideDeeplinkhandleractivitySettings;
import com.p683ss.android.ugc.aweme.settings2.EnablePreloadComponentSettings;
import com.p683ss.android.ugc.aweme.settings2.EnablePushAllianceSdkSettings;
import com.p683ss.android.ugc.aweme.settings2.EnableSplashLaunchFixSettings;
import com.p683ss.android.ugc.aweme.settings2.EnableTImChatEveryoneSettings;
import com.p683ss.android.ugc.aweme.settings2.EnableUseGameRotationSensorSettings;
import com.p683ss.android.ugc.aweme.settings2.EnableYoutubeAppAuthSettings;
import com.p683ss.android.ugc.aweme.settings2.EnabledImAsupporterFuncsSettings;
import com.p683ss.android.ugc.aweme.settings2.EnabledImAsupporterMsgTypesSettings;
import com.p683ss.android.ugc.aweme.settings2.F2NoticeTypeSettings;
import com.p683ss.android.ugc.aweme.settings2.FeedHandleGenericMotionSettings;
import com.p683ss.android.ugc.aweme.settings2.FeedbackRecordEnableSettings;
import com.p683ss.android.ugc.aweme.settings2.FirstInstallTimeSettings;
import com.p683ss.android.ugc.aweme.settings2.FollowingFollowerPermissionSwitchSettings;
import com.p683ss.android.ugc.aweme.settings2.ForbidVoiceChangeOnEditPageSettings;
import com.p683ss.android.ugc.aweme.settings2.GroupNewMemberCanPullOldMsgSettings;
import com.p683ss.android.ugc.aweme.settings2.HeartbeatDefaultUrlSettings;
import com.p683ss.android.ugc.aweme.settings2.HotspotGuideTimeSettings;
import com.p683ss.android.ugc.aweme.settings2.InappUpdateSwitchStrategySettings;
import com.p683ss.android.ugc.aweme.settings2.IsAdapterVideoPlaySizeAdSettings;
import com.p683ss.android.ugc.aweme.settings2.IsAdapterVideoPlaySizeSettings;
import com.p683ss.android.ugc.aweme.settings2.IsHotUserSettings;
import com.p683ss.android.ugc.aweme.settings2.IsLowMemoryMachineForToolsSettings;
import com.p683ss.android.ugc.aweme.settings2.IsNearbyOldUserSettings;
import com.p683ss.android.ugc.aweme.settings2.KeepCookiesSettings;
import com.p683ss.android.ugc.aweme.settings2.KevaSwitchSettings;
import com.p683ss.android.ugc.aweme.settings2.LightEnhanceThresholdSettings;
import com.p683ss.android.ugc.aweme.settings2.LiveSquareGuideShowCountSettings;
import com.p683ss.android.ugc.aweme.settings2.MainTabFollowUseLazyViewpagerSettings;
import com.p683ss.android.ugc.aweme.settings2.MaxMessageCountForRecommendSettings;
import com.p683ss.android.ugc.aweme.settings2.MinFollowNumForLandingFollowTabSettings;
import com.p683ss.android.ugc.aweme.settings2.MiniappPreloadEmptyProcessEnbaleSettings;
import com.p683ss.android.ugc.aweme.settings2.MiniappWonderlandEnableSettings;
import com.p683ss.android.ugc.aweme.settings2.MixPermissionSettings;
import com.p683ss.android.ugc.aweme.settings2.MtForbidInsertPlaceholderWordSettings;
import com.p683ss.android.ugc.aweme.settings2.MtLocalAnalysisHprofSettings;
import com.p683ss.android.ugc.aweme.settings2.MtSearchHistoryFoldCountSettings;
import com.p683ss.android.ugc.aweme.settings2.PostDownloadSettingSettings;
import com.p683ss.android.ugc.aweme.settings2.PosterSrTypeSettings;
import com.p683ss.android.ugc.aweme.settings2.PushdelayinitSwitchSettings;
import com.p683ss.android.ugc.aweme.settings2.ReadVideoLastGapSettings;
import com.p683ss.android.ugc.aweme.settings2.RealTimeReportEnableSettings;
import com.p683ss.android.ugc.aweme.settings2.ReusePhoneCheckIntervalSettings;
import com.p683ss.android.ugc.aweme.settings2.SatCameraTypeSettings;
import com.p683ss.android.ugc.aweme.settings2.SearchHistoryCollapseNumSettings;
import com.p683ss.android.ugc.aweme.settings2.SearchMiddleRecommendWordsCountSettings;
import com.p683ss.android.ugc.aweme.settings2.SecIdSwitchSettings;
import com.p683ss.android.ugc.aweme.settings2.ShopLinkAnchorDisclaimerSettings;
import com.p683ss.android.ugc.aweme.settings2.ShowDeviceManagerEntrySettings;
import com.p683ss.android.ugc.aweme.settings2.ShowDoulabEntranceSettings;
import com.p683ss.android.ugc.aweme.settings2.ShowFromDuoshanLabelSettings;
import com.p683ss.android.ugc.aweme.settings2.ShowQqdownloaderPrivacyDialogSettings;
import com.p683ss.android.ugc.aweme.settings2.ShowStorageDotSizeSettings;
import com.p683ss.android.ugc.aweme.settings2.ShowStorageTipSizeSettings;
import com.p683ss.android.ugc.aweme.settings2.SmartisanDataSharingSwitchSettings;
import com.p683ss.android.ugc.aweme.settings2.SplashStockDelayMillisTimeSettings;
import com.p683ss.android.ugc.aweme.settings2.StarAtlasProfileLinkSettings;
import com.p683ss.android.ugc.aweme.settings2.StatusLottieUrlSettings;
import com.p683ss.android.ugc.aweme.settings2.StatusPhoneTypeSettings;
import com.p683ss.android.ugc.aweme.settings2.StatusTabKeySettings;
import com.p683ss.android.ugc.aweme.settings2.StickerUpdateAppSettings;
import com.p683ss.android.ugc.aweme.settings2.SupportFilterErrorFileSettings;
import com.p683ss.android.ugc.aweme.settings2.TcmCtrySettingsSettings;
import com.p683ss.android.ugc.aweme.settings2.TcmNameCtrySettings;
import com.p683ss.android.ugc.aweme.settings2.UgSecLinkUrlSettings;
import com.p683ss.android.ugc.aweme.settings2.UgShareWebviewSecLevelSettings;
import com.p683ss.android.ugc.aweme.settings2.UseBridgeEngineV2Settings;
import com.p683ss.android.ugc.aweme.settings2.UseNewSplashViewSettings;
import com.p683ss.android.ugc.aweme.settings2.UseNewyearDirectUploadSettings;
import com.p683ss.android.ugc.aweme.settings2.UseVeImageSettings;
import com.p683ss.android.ugc.aweme.settings2.VeFastImportIgnoreRecodeForRotationSettings;
import com.p683ss.android.ugc.aweme.settings2.VeFastImportIgnoreRecodeSettings;
import com.p683ss.android.ugc.aweme.settings2.VeRuntimeConfigSettings;
import com.p683ss.android.ugc.aweme.settings2.VideoPlayProgressCountSettings;
import com.p683ss.android.ugc.aweme.settings2.WikipediaAnchorUrlPlaceholderSettings;
import com.p683ss.android.ugc.aweme.settings2.WithDouplusEntrySettings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.ac */
public final class C20852ac extends IESSettingsProxy {
    public final String getImGroupPasswordRegex() {
        C10193n.m20607a();
        return C10193n.m20609c().mo18224c("im_group_password_regex", "[\\U0001F300-\\U0001F64F|\\U0001F680-\\U0001F6FF|\\u2600-\\u2B55]{6}\n?[\\U0001F300-\\U0001F64F|\\U0001F680-\\U0001F6FF|\\u2600-\\u2B55]{6}");
    }

    public final AdFeSettings getAdFeSettings() throws C10174a {
        C10193n.m20607a();
        AdFeSettings adFeSettings = (AdFeSettings) C10193n.m20609c().mo18207a("ad_fe_settings", AdFeSettings.class);
        if (adFeSettings != null) {
            return adFeSettings;
        }
        return super.getAdFeSettings();
    }

    public final AdLandingPageConfig getAdLandingPageConfig() throws C10174a {
        C10193n.m20607a();
        AdLandingPageConfig adLandingPageConfig = (AdLandingPageConfig) C10193n.m20609c().mo18207a("ad_landing_page_config", AdLandingPageConfig.class);
        if (adLandingPageConfig != null) {
            return adLandingPageConfig;
        }
        return super.getAdLandingPageConfig();
    }

    public final String getAdTrackerConfig() {
        return C10193n.m20607a().mo18203a(AdTrackerConfigSettings.class, "ad_tracker_config", super.getAdTrackerConfig(), "");
    }

    public final UserAntiAddiction getAddictionSettings() throws C10174a {
        C10193n.m20607a();
        UserAntiAddiction userAntiAddiction = (UserAntiAddiction) C10193n.m20609c().mo18207a("addiction_settings", UserAntiAddiction.class);
        if (userAntiAddiction != null) {
            return userAntiAddiction;
        }
        return super.getAddictionSettings();
    }

    public final AgeGateSettings getAgeGateSettings() throws C10174a {
        C10193n.m20607a();
        AgeGateSettings ageGateSettings = (AgeGateSettings) C10193n.m20609c().mo18207a("age_gate_settings", AgeGateSettings.class);
        if (ageGateSettings != null) {
            return ageGateSettings;
        }
        return super.getAgeGateSettings();
    }

    public final Boolean getAiMusicBackupStrategy() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(AiMusicBackupStrategySettings.class, "ai_music_backup_strategy", super.getAiMusicBackupStrategy(), false));
    }

    public final Integer getAntiAddictionDayTime() {
        return Integer.valueOf(C10193n.m20607a().mo18200a(AntiAddictionDayTimeSettings.class, "anti_addiction_day_time", super.getAntiAddictionDayTime(), 0));
    }

    public final Integer getAntiAddictionNightTime() {
        return Integer.valueOf(C10193n.m20607a().mo18200a(AntiAddictionNightTimeSettings.class, "anti_addiction_night_time", super.getAntiAddictionNightTime(), 0));
    }

    public final Integer getAntiAddictionSeparation() {
        return Integer.valueOf(C10193n.m20607a().mo18200a(AntiAddictionSeparationSettings.class, "anti_addiction_separation", super.getAntiAddictionSeparation(), 0));
    }

    public final Boolean getAntiAddictionToastEnable24hourTime() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("anti_addiction_toast_enable_24hour_time", super.getAntiAddictionToastEnable24hourTime().booleanValue()));
    }

    public final Integer getAntiAddictionToastTime() {
        return Integer.valueOf(C10193n.m20607a().mo18200a(AntiAddictionToastTimeSettings.class, "anti_addiction_toast_time", super.getAntiAddictionToastTime(), 0));
    }

    public final List<String> getApiAlogWhiteList() {
        C10193n.m20607a();
        String[] b = C10193n.m20609c().mo18223b("api_alog_white_list");
        if (b == null) {
            return super.getApiAlogWhiteList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, b);
        return arrayList;
    }

    public final AppStoreMessage getAppStoreScore() throws C10174a {
        C10193n.m20607a();
        AppStoreMessage appStoreMessage = (AppStoreMessage) C10193n.m20609c().mo18207a("app_store_score", AppStoreMessage.class);
        if (appStoreMessage != null) {
            return appStoreMessage;
        }
        return super.getAppStoreScore();
    }

    public final Long getAutoLiveStateIntervalMills() {
        return Long.valueOf(C10193n.m20607a().mo18201a(AutoLiveStateIntervalMillsSettings.class, "auto_live_state_interval_mills", super.getAutoLiveStateIntervalMills(), 60000));
    }

    public final Boolean getAvDefaultWideMode() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("av_default_wide_mode", super.getAvDefaultWideMode().booleanValue()));
    }

    public final UgAwemeActivitySetting getAwemeActivitySetting() throws C10174a {
        C10193n.m20607a();
        UgAwemeActivitySetting ugAwemeActivitySetting = (UgAwemeActivitySetting) C10193n.m20609c().mo18207a("aweme_activity_setting", UgAwemeActivitySetting.class);
        if (ugAwemeActivitySetting != null) {
            return ugAwemeActivitySetting;
        }
        return super.getAwemeActivitySetting();
    }

    public final Boolean getAwemeEnableChinaMobileService() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("aweme_enable_china_mobile_service", super.getAwemeEnableChinaMobileService().booleanValue()));
    }

    public final Boolean getAwemeEnableChinaTelecomService() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("aweme_enable_china_telecom_service", super.getAwemeEnableChinaTelecomService().booleanValue()));
    }

    public final Boolean getAwemeEnableChinaUnionService() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("aweme_enable_china_union_service", super.getAwemeEnableChinaUnionService().booleanValue()));
    }

    public final AwemeFEConfigs getAwemeFeConf() throws C10174a {
        C10193n.m20607a();
        AwemeFEConfigs awemeFEConfigs = (AwemeFEConfigs) C10193n.m20609c().mo18207a("aweme_fe_conf", AwemeFEConfigs.class);
        if (awemeFEConfigs != null) {
            return awemeFEConfigs;
        }
        return super.getAwemeFeConf();
    }

    public final AwemeFeEliteItem getAwemeFeElite() throws C10174a {
        C10193n.m20607a();
        AwemeFeEliteItem awemeFeEliteItem = (AwemeFeEliteItem) C10193n.m20609c().mo18207a("aweme_fe_elite", AwemeFeEliteItem.class);
        if (awemeFeEliteItem != null) {
            return awemeFeEliteItem;
        }
        return super.getAwemeFeElite();
    }

    public final List<String> getAwemeHighRiskAreaCode() {
        C10193n.m20607a();
        String[] b = C10193n.m20609c().mo18223b("aweme_high_risk_area_code");
        if (b == null) {
            return super.getAwemeHighRiskAreaCode();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, b);
        return arrayList;
    }

    public final Boolean getAwesomeSplashForceUseH264() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(AwesomeSplashForceUseH264Settings.class, "awesome_splash_force_use_h264", super.getAwesomeSplashForceUseH264(), false));
    }

    public final Integer getBackgroundPausePlayerSetting() {
        return Integer.valueOf(C10193n.m20607a().mo18200a(BackgroundPausePlayerSettingSettings.class, "background_pause_player_setting", super.getBackgroundPausePlayerSetting(), 0));
    }

    public final Integer getBeautyModel() throws C10174a {
        C10193n.m20607a();
        return Integer.valueOf(C10193n.m20609c().mo18219b("beauty_model", super.getBeautyModel().intValue()));
    }

    public final BioSettings getBioSettings() throws C10174a {
        C10193n.m20607a();
        BioSettings bioSettings = (BioSettings) C10193n.m20609c().mo18207a("bio_settings", BioSettings.class);
        if (bioSettings != null) {
            return bioSettings;
        }
        return super.getBioSettings();
    }

    public final Integer getBitrateOfRecodeThreshold() throws C10174a {
        C10193n.m20607a();
        return Integer.valueOf(C10193n.m20609c().mo18219b("bitrate_of_recode_threshold", super.getBitrateOfRecodeThreshold().intValue()));
    }

    public final String getBusinessEshopManager() {
        return C10193n.m20607a().mo18203a(BusinessEshopManagerSettings.class, "business_eshop_manager", super.getBusinessEshopManager(), BusinessEshopManagerSettings.DEFAULT);
    }

    public final List<String> getCacheCleanDefaultWhiteList() {
        C10193n.m20607a();
        String[] b = C10193n.m20609c().mo18223b("cache_clean_default_white_list");
        if (b == null) {
            return super.getCacheCleanDefaultWhiteList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, b);
        return arrayList;
    }

    public final Boolean getCanReact() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("can_react", super.getCanReact().booleanValue()));
    }

    public final Integer getCheckLarkInhouseNet() {
        return Integer.valueOf(C10193n.m20607a().mo18200a(CheckLarkInhouseNetSettings.class, "check_lark_inhouse_net", super.getCheckLarkInhouseNet(), 1));
    }

    public final Boolean getCleanShareFiles() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("clean_share_files", super.getCleanShareFiles().booleanValue()));
    }

    public final Integer getCloseLoginAgreement() {
        return Integer.valueOf(C10193n.m20607a().mo18200a(CloseLoginAgreementSettings.class, "close_login_agreement", super.getCloseLoginAgreement(), 0));
    }

    public final Integer getCloseSyncToHeloEntry() {
        return Integer.valueOf(C10193n.m20607a().mo18200a(CloseSyncToHeloEntrySettings.class, "close_sync_to_helo_entry", super.getCloseSyncToHeloEntry(), 1));
    }

    public final Integer getCloseVframeUpload() throws C10174a {
        C10193n.m20607a();
        return Integer.valueOf(C10193n.m20609c().mo18219b("close_vframe_upload", super.getCloseVframeUpload().intValue()));
    }

    public final String getCommentFilterTipsSupported() throws C10174a {
        C10193n.m20607a();
        return C10193n.m20609c().mo18224c("comment_filter_tips_supported", super.getCommentFilterTipsSupported());
    }

    public final CommentListAdMigration getCommentListAdMigration() throws C10174a {
        C10193n.m20607a();
        CommentListAdMigration commentListAdMigration = (CommentListAdMigration) C10193n.m20609c().mo18207a("comment_list_ad_migration", CommentListAdMigration.class);
        if (commentListAdMigration != null) {
            return commentListAdMigration;
        }
        return super.getCommentListAdMigration();
    }

    public final CommerceEggConfig getCommerceEggConfig() throws C10174a {
        C10193n.m20607a();
        CommerceEggConfig commerceEggConfig = (CommerceEggConfig) C10193n.m20609c().mo18207a("commerce_egg_config", CommerceEggConfig.class);
        if (commerceEggConfig != null) {
            return commerceEggConfig;
        }
        return super.getCommerceEggConfig();
    }

    public final ContactUploadUiLimits getContactUploadUiLimits() throws C10174a {
        C10193n.m20607a();
        ContactUploadUiLimits contactUploadUiLimits = (ContactUploadUiLimits) C10193n.m20609c().mo18207a("contact_upload_ui_limits", ContactUploadUiLimits.class);
        if (contactUploadUiLimits != null) {
            return contactUploadUiLimits;
        }
        return super.getContactUploadUiLimits();
    }

    public final Integer getDataSaverSetting() throws C10174a {
        C10193n.m20607a();
        return Integer.valueOf(C10193n.m20609c().mo18219b("data_saver_setting", super.getDataSaverSetting().intValue()));
    }

    public final Boolean getDefaultShakeFreeMode() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("default_shake_free_mode", super.getDefaultShakeFreeMode().booleanValue()));
    }

    public final Boolean getDisableDelayAbSdkRequest() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("disable_delay_ab_sdk_request", super.getDisableDelayAbSdkRequest().booleanValue()));
    }

    public final Boolean getDisableDelayAppAlertRequest() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("disable_delay_app_alert_request", super.getDisableDelayAppAlertRequest().booleanValue()));
    }

    public final Boolean getDisableDelayFetchSamecityActiveRequest() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("disable_delay_fetch_samecity_active_request", super.getDisableDelayFetchSamecityActiveRequest().booleanValue()));
    }

    public final Boolean getDisableDelayFetchShareSettingRequest() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("disable_delay_fetch_share_setting_request", super.getDisableDelayFetchShareSettingRequest().booleanValue()));
    }

    public final Boolean getDisableDelayFetchUserRequest() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("disable_delay_fetch_user_request", super.getDisableDelayFetchUserRequest().booleanValue()));
    }

    public final Boolean getDisableDelaySecReport() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("disable_delay_sec_report", super.getDisableDelaySecReport().booleanValue()));
    }

    public final Boolean getDisableDelayTokenBeatRequest() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("disable_delay_token_beat_request", super.getDisableDelayTokenBeatRequest().booleanValue()));
    }

    public final Boolean getDisableDelayWsRequest() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("disable_delay_ws_request", super.getDisableDelayWsRequest().booleanValue()));
    }

    public final Boolean getDisableDvmLinearAllocOpt() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("disable_dvm_linear_alloc_opt", super.getDisableDvmLinearAllocOpt().booleanValue()));
    }

    public final Boolean getDisableImMessageFullFeedSlide() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("disable_im_message_full_feed_slide", super.getDisableImMessageFullFeedSlide().booleanValue()));
    }

    public final Boolean getDisableOmSdk() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("disable_om_sdk", super.getDisableOmSdk().booleanValue()));
    }

    public final Boolean getDisableOnlineSmallEmoji() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(DisableOnlineSmallEmojiSettings.class, "disable_online_small_emoji", super.getDisableOnlineSmallEmoji(), false));
    }

    public final Boolean getDisableQiVideoShare() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(DisableQiVideoShareSettings.class, "disable_qi_video_share", super.getDisableQiVideoShare(), false));
    }

    public final Boolean getDisableVastBitrate() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(DisableVastBitrateSettings.class, "disable_vast_bitrate", super.getDisableVastBitrate(), false));
    }

    public final Boolean getDisallowVastHasAuthor() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(DisallowVastHasAuthorSettings.class, "disallow_vast_has_author", super.getDisallowVastHasAuthor(), false));
    }

    public final Boolean getDiscardRefreshTopDsp() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("discard_refresh_top_dsp", super.getDiscardRefreshTopDsp().booleanValue()));
    }

    public final String getDiscoveryLocationBackgroundUrl() throws C10174a {
        C10193n.m20607a();
        return C10193n.m20609c().mo18224c("discovery_location_background_url", super.getDiscoveryLocationBackgroundUrl());
    }

    public final List<String> getDmtSourceUrlWhitelist() {
        C10193n.m20607a();
        String[] b = C10193n.m20609c().mo18223b("dmt_source_url_whitelist");
        if (b == null) {
            return super.getDmtSourceUrlWhitelist();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, b);
        return arrayList;
    }

    public final String getDoulabUseInformationUrl() {
        return C10193n.m20607a().mo18203a(DoulabUseInformationUrlSettings.class, "doulab_use_information_url", super.getDoulabUseInformationUrl(), "");
    }

    public final Integer getDouplusBulletEntry() {
        return Integer.valueOf(C10193n.m20607a().mo18200a(DouplusBulletEntrySettings.class, "douplus_bullet_entry", super.getDouplusBulletEntry(), 0));
    }

    public final Integer getDouplusEntryFeed() {
        return Integer.valueOf(C10193n.m20607a().mo18200a(DouplusEntryFeedSettings.class, "douplus_entry_feed", super.getDouplusEntryFeed(), 0));
    }

    public final DouyinFeBusiness getDouyinFeBusiness() throws C10174a {
        C10193n.m20607a();
        DouyinFeBusiness douyinFeBusiness = (DouyinFeBusiness) C10193n.m20609c().mo18207a("douyin_fe_business", DouyinFeBusiness.class);
        if (douyinFeBusiness != null) {
            return douyinFeBusiness;
        }
        return super.getDouyinFeBusiness();
    }

    public final DouyinOrderSetting getDouyinOrder() throws C10174a {
        C10193n.m20607a();
        DouyinOrderSetting douyinOrderSetting = (DouyinOrderSetting) C10193n.m20609c().mo18207a("douyin_order", DouyinOrderSetting.class);
        if (douyinOrderSetting != null) {
            return douyinOrderSetting;
        }
        return super.getDouyinOrder();
    }

    public final Integer getDownloadSettingEnable() throws C10174a {
        C10193n.m20607a();
        return Integer.valueOf(C10193n.m20609c().mo18219b("download_setting_enable", super.getDownloadSettingEnable().intValue()));
    }

    public final Boolean getDraftUseMultiVideoEdit() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(DraftUseMultiVideoEditSettings.class, "draft_use_multi_video_edit", super.getDraftUseMultiVideoEdit(), false));
    }

    public final EPlatformSettings getEPlatformSettings() throws C10174a {
        C10193n.m20607a();
        EPlatformSettings ePlatformSettings = (EPlatformSettings) C10193n.m20609c().mo18207a("e_platform_settings", EPlatformSettings.class);
        if (ePlatformSettings != null) {
            return ePlatformSettings;
        }
        return super.getEPlatformSettings();
    }

    public final Integer getEditEffectAutoDownloadSize() {
        return Integer.valueOf(C10193n.m20607a().mo18200a(EditEffectAutoDownloadSizeSettings.class, "edit_effect_auto_download_size", super.getEditEffectAutoDownloadSize(), 5));
    }

    public final String getEffectSdkConfigSettings() throws C10174a {
        C10193n.m20607a();
        return C10193n.m20609c().mo18224c("effect_sdk_config_settings", super.getEffectSdkConfigSettings());
    }

    public final EmailLoginSettings getEmailLoginSettings() throws C10174a {
        C10193n.m20607a();
        EmailLoginSettings emailLoginSettings = (EmailLoginSettings) C10193n.m20609c().mo18207a("email_login_settings", EmailLoginSettings.class);
        if (emailLoginSettings != null) {
            return emailLoginSettings;
        }
        return super.getEmailLoginSettings();
    }

    public final Integer getEnable1080pFastImport() throws C10174a {
        C10193n.m20607a();
        return Integer.valueOf(C10193n.m20609c().mo18219b("enable_1080p_fast_import", super.getEnable1080pFastImport().intValue()));
    }

    public final Integer getEnable4kImport() throws C10174a {
        C10193n.m20607a();
        return Integer.valueOf(C10193n.m20609c().mo18219b("enable_4k_import", super.getEnable4kImport().intValue()));
    }

    public final Boolean getEnableAdRouter() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(EnableAdRouterSettings.class, "enable_ad_router", super.getEnableAdRouter(), false));
    }

    public final Boolean getEnableAnchorCache() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(EnableAnchorCacheSettings.class, "enable_anchor_cache", super.getEnableAnchorCache(), false));
    }

    public final Boolean getEnableAudioAutoPlay() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("enable_audio_auto_play", super.getEnableAudioAutoPlay().booleanValue()));
    }

    public final Boolean getEnableAutoLiveState() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(EnableAutoLiveStateSettings.class, "enable_auto_live_state", super.getEnableAutoLiveState(), false));
    }

    public final Boolean getEnableAutoRetryRecord() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("enable_auto_retry_record", super.getEnableAutoRetryRecord().booleanValue()));
    }

    public final Boolean getEnableAvStorageMonitor() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(EnableAvStorageMonitorSettings.class, "enable_av_storage_monitor", super.getEnableAvStorageMonitor(), true));
    }

    public final Boolean getEnableCameraBeautifyEffect() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(EnableCameraBeautifyEffectSettings.class, "enable_camera_beautify_effect", super.getEnableCameraBeautifyEffect(), false));
    }

    public final Boolean getEnableCommentCreateSticker() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(EnableCommentCreateStickerSettings.class, "enable_comment_create_sticker", super.getEnableCommentCreateSticker(), false));
    }

    public final Boolean getEnableCommentOffensiveFilterSwitch() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(EnableCommentOffensiveFilterSwitchSettings.class, "enable_comment_offensive_filter_switch", super.getEnableCommentOffensiveFilterSwitch(), false));
    }

    public final Boolean getEnableCommerceOrder() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("enable_commerce_order", super.getEnableCommerceOrder().booleanValue()));
    }

    public final Integer getEnableCoverEffect() {
        return Integer.valueOf(C10193n.m20607a().mo18200a(EnableCoverEffectSettings.class, "enable_cover_effect", super.getEnableCoverEffect(), 0));
    }

    public final Boolean getEnableDelayRequest() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("enable_delay_request", super.getEnableDelayRequest().booleanValue()));
    }

    public final Boolean getEnableDisplayFavoriteMiniapp() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(EnableDisplayFavoriteMiniappSettings.class, "enable_display_favorite_miniapp", super.getEnableDisplayFavoriteMiniapp(), true));
    }

    public final Boolean getEnableDisplayFavoriteMinigame() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(EnableDisplayFavoriteMinigameSettings.class, "enable_display_favorite_minigame", super.getEnableDisplayFavoriteMinigame(), true));
    }

    public final Boolean getEnableDownloadTtData() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("enable_download_tt_data", super.getEnableDownloadTtData().booleanValue()));
    }

    public final Integer getEnableEmailVerification() {
        return Integer.valueOf(C10193n.m20607a().mo18200a(EnableEmailVerificationSettings.class, "enable_email_verification", super.getEnableEmailVerification(), 1));
    }

    public final Boolean getEnableEnterLiveRoomStreamOpt() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(EnableEnterLiveRoomStreamOptSettings.class, "enable_enter_live_room_stream_opt", super.getEnableEnterLiveRoomStreamOpt(), true));
    }

    public final Boolean getEnableEnterLiveRoomStreamOptFromFollowSky() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(EnableEnterLiveRoomStreamOptFromFollowSkySettings.class, "enable_enter_live_room_stream_opt_from_follow_sky", super.getEnableEnterLiveRoomStreamOptFromFollowSky(), false));
    }

    public final Boolean getEnableGroupMemberByFollowers() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(EnableGroupMemberByFollowersSettings.class, "enable_group_member_by_followers", super.getEnableGroupMemberByFollowers(), false));
    }

    public final Boolean getEnableHdH264HwDecoder() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("enable_hd_h264_hw_decoder", super.getEnableHdH264HwDecoder().booleanValue()));
    }

    public final Boolean getEnableHighRiskRebindAlert() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(EnableHighRiskRebindAlertSettings.class, "enable_high_risk_rebind_alert", super.getEnableHighRiskRebindAlert(), true));
    }

    public final Boolean getEnableHqVframe() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("enable_hq_vframe", super.getEnableHqVframe().booleanValue()));
    }

    public final Boolean getEnableLargeGestureDetectModel() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("enable_large_gesture_detect_model", super.getEnableLargeGestureDetectModel().booleanValue()));
    }

    public final Boolean getEnableLargeMattingDetectModel() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("enable_large_matting_detect_model", super.getEnableLargeMattingDetectModel().booleanValue()));
    }

    public final Boolean getEnableLiveDrawerDialog() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(EnableLiveDrawerDialogSettings.class, "enable_live_drawer_dialog", super.getEnableLiveDrawerDialog(), true));
    }

    public final Boolean getEnableLiveSplash() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(EnableLiveSplashSettings.class, "enable_live_splash", super.getEnableLiveSplash(), true));
    }

    public final Boolean getEnableLocalMusicEntrance() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("enable_local_music_entrance", super.getEnableLocalMusicEntrance().booleanValue()));
    }

    public final Boolean getEnableMojiUpdateResources() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(EnableMojiUpdateResourcesSettings.class, "enable_moji_update_resources", super.getEnableMojiUpdateResources(), true));
    }

    public final Boolean getEnableNewUserInfoSync() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(EnableNewUserInfoSyncSettings.class, "enable_new_user_info_sync", super.getEnableNewUserInfoSync(), false));
    }

    public final Boolean getEnableNormalSplashAd() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(EnableNormalSplashAdSettings.class, "enable_normal_splash_ad", super.getEnableNormalSplashAd(), true));
    }

    public final Boolean getEnableOnPageSelectPauseCheck() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("enable_on_page_select_pause_check", super.getEnableOnPageSelectPauseCheck().booleanValue()));
    }

    public final Boolean getEnableParamsOverrideDeeplinkhandleractivity() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(EnableParamsOverrideDeeplinkhandleractivitySettings.class, "enable_params_override_deeplinkhandleractivity", super.getEnableParamsOverrideDeeplinkhandleractivity(), false));
    }

    public final Boolean getEnablePreloadComponent() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(EnablePreloadComponentSettings.class, "enable_preload_component", super.getEnablePreloadComponent(), true));
    }

    public final Boolean getEnablePushAllianceSdk() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(EnablePushAllianceSdkSettings.class, "enable_push_alliance_sdk", super.getEnablePushAllianceSdk(), false));
    }

    public final Boolean getEnableReuseEditorForFastimport() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("enable_reuse_editor_for_fastimport", super.getEnableReuseEditorForFastimport().booleanValue()));
    }

    public final Boolean getEnableSplashLaunchFix() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(EnableSplashLaunchFixSettings.class, "enable_splash_launch_fix", super.getEnableSplashLaunchFix(), true));
    }

    public final Boolean getEnableSymphonySdk() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("enable_symphony_sdk", super.getEnableSymphonySdk().booleanValue()));
    }

    public final Boolean getEnableSyntheticFpsSet() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("enable_synthetic_fps_set", super.getEnableSyntheticFpsSet().booleanValue()));
    }

    public final Boolean getEnableTImChatEveryone() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(EnableTImChatEveryoneSettings.class, "enable_t_im_chat_everyone", super.getEnableTImChatEveryone(), false));
    }

    public final Boolean getEnableUploadSyncIns() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("enable_upload_sync_ins", super.getEnableUploadSyncIns().booleanValue()));
    }

    public final Boolean getEnableUploadSyncInsStory() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("enable_upload_sync_ins_story", super.getEnableUploadSyncInsStory().booleanValue()));
    }

    public final Boolean getEnableUploadSyncTwitter() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("enable_upload_sync_twitter", super.getEnableUploadSyncTwitter().booleanValue()));
    }

    public final Boolean getEnableUseGameRotationSensor() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(EnableUseGameRotationSensorSettings.class, "enable_use_game_rotation_sensor", super.getEnableUseGameRotationSensor(), true));
    }

    public final Integer getEnableVeSingleGl() throws C10174a {
        C10193n.m20607a();
        return Integer.valueOf(C10193n.m20609c().mo18219b("enable_ve_single_gl", super.getEnableVeSingleGl().intValue()));
    }

    public final Boolean getEnableWaterBgMask() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("enable_water_bg_mask", super.getEnableWaterBgMask().booleanValue()));
    }

    public final Integer getEnableYoutubeAppAuth() {
        return Integer.valueOf(C10193n.m20607a().mo18200a(EnableYoutubeAppAuthSettings.class, "enable_youtube_app_auth", super.getEnableYoutubeAppAuth(), 0));
    }

    public final Integer getEnabledImAsupporterFuncs() {
        return Integer.valueOf(C10193n.m20607a().mo18200a(EnabledImAsupporterFuncsSettings.class, "enabled_im_asupporter_funcs", super.getEnabledImAsupporterFuncs(), 3));
    }

    public final Integer getEnabledImAsupporterMsgTypes() {
        return Integer.valueOf(C10193n.m20607a().mo18200a(EnabledImAsupporterMsgTypesSettings.class, "enabled_im_asupporter_msg_types", super.getEnabledImAsupporterMsgTypes(), 5));
    }

    public final Integer getF2NoticeType() {
        return Integer.valueOf(C10193n.m20607a().mo18200a(F2NoticeTypeSettings.class, "f2_notice_type", super.getF2NoticeType(), 0));
    }

    public final Integer getFaceDetectInterval() throws C10174a {
        C10193n.m20607a();
        return Integer.valueOf(C10193n.m20609c().mo18219b("face_detect_interval", super.getFaceDetectInterval().intValue()));
    }

    public final FeAnchorAdConf getFeAnchorAdConf() throws C10174a {
        C10193n.m20607a();
        FeAnchorAdConf feAnchorAdConf = (FeAnchorAdConf) C10193n.m20609c().mo18207a("fe_anchor_ad_conf", FeAnchorAdConf.class);
        if (feAnchorAdConf != null) {
            return feAnchorAdConf;
        }
        return super.getFeAnchorAdConf();
    }

    public final FeConfigCollection getFeConfigCollection() throws C10174a {
        C10193n.m20607a();
        FeConfigCollection feConfigCollection = (FeConfigCollection) C10193n.m20609c().mo18207a("fe_config_collection", FeConfigCollection.class);
        if (feConfigCollection != null) {
            return feConfigCollection;
        }
        return super.getFeConfigCollection();
    }

    public final Boolean getFeedHandleGenericMotion() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(FeedHandleGenericMotionSettings.class, "feed_handle_generic_motion", super.getFeedHandleGenericMotion(), true));
    }

    public final FeedbackConf getFeedbackConf() throws C10174a {
        C10193n.m20607a();
        FeedbackConf feedbackConf = (FeedbackConf) C10193n.m20609c().mo18207a("feedback_conf", FeedbackConf.class);
        if (feedbackConf != null) {
            return feedbackConf;
        }
        return super.getFeedbackConf();
    }

    public final Boolean getFeedbackRecordEnable() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(FeedbackRecordEnableSettings.class, "feedback_record_enable", super.getFeedbackRecordEnable(), true));
    }

    public final List<String> getFilterColors() {
        C10193n.m20607a();
        String[] b = C10193n.m20609c().mo18223b("filter_colors");
        if (b == null) {
            return super.getFilterColors();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, b);
        return arrayList;
    }

    public final Integer getFirstInstallTime() {
        return Integer.valueOf(C10193n.m20607a().mo18200a(FirstInstallTimeSettings.class, "first_install_time", super.getFirstInstallTime(), -1));
    }

    public final FlexibleUpdateStrategy getFlexibleUpdateStrategy() throws C10174a {
        C10193n.m20607a();
        FlexibleUpdateStrategy flexibleUpdateStrategy = (FlexibleUpdateStrategy) C10193n.m20609c().mo18207a("flexible_update_strategy", FlexibleUpdateStrategy.class);
        if (flexibleUpdateStrategy != null) {
            return flexibleUpdateStrategy;
        }
        return super.getFlexibleUpdateStrategy();
    }

    public final FlipChatSettings getFlipchatSettings() throws C10174a {
        C10193n.m20607a();
        FlipChatSettings flipChatSettings = (FlipChatSettings) C10193n.m20609c().mo18207a("flipchat_settings", FlipChatSettings.class);
        if (flipChatSettings != null) {
            return flipChatSettings;
        }
        return super.getFlipchatSettings();
    }

    public final Integer getFollowTabLiveType() throws C10174a {
        C10193n.m20607a();
        return Integer.valueOf(C10193n.m20609c().mo18219b("follow_tab_live_type", super.getFollowTabLiveType().intValue()));
    }

    public final Boolean getFollowingFollowerPermissionSwitch() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(FollowingFollowerPermissionSwitchSettings.class, "following_follower_permission_switch", super.getFollowingFollowerPermissionSwitch(), false));
    }

    public final Boolean getForbidLifeStoryLocalWatermark() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("forbid_life_story_local_watermark", super.getForbidLifeStoryLocalWatermark().booleanValue()));
    }

    public final Boolean getForbidLocalWatermark() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("forbid_local_watermark", super.getForbidLocalWatermark().booleanValue()));
    }

    public final Boolean getForbidVoiceChangeOnEditPage() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(ForbidVoiceChangeOnEditPageSettings.class, "forbid_voice_change_on_edit_page", super.getForbidVoiceChangeOnEditPage(), true));
    }

    public final String getFreeFlowCardUrlSticker() throws C10174a {
        C10193n.m20607a();
        return C10193n.m20609c().mo18224c("free_flow_card_url_sticker", super.getFreeFlowCardUrlSticker());
    }

    public final Boolean getGroupNewMemberCanPullOldMsg() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(GroupNewMemberCanPullOldMsgSettings.class, "group_new_member_can_pull_old_msg", super.getGroupNewMemberCanPullOldMsg(), false));
    }

    public final Integer getHdHwDecoderMinSideSize() throws C10174a {
        C10193n.m20607a();
        return Integer.valueOf(C10193n.m20609c().mo18219b("hd_hw_decoder_min_side_size", super.getHdHwDecoderMinSideSize().intValue()));
    }

    public final String getHeartbeatDefaultUrl() {
        return C10193n.m20607a().mo18203a(HeartbeatDefaultUrlSettings.class, "heartbeat_default_url", super.getHeartbeatDefaultUrl(), HeartbeatDefaultUrlSettings.DEFAULT);
    }

    public final HotSearchWitch getHotsearchSwitchs() throws C10174a {
        C10193n.m20607a();
        HotSearchWitch hotSearchWitch = (HotSearchWitch) C10193n.m20609c().mo18207a("hotsearch_switchs", HotSearchWitch.class);
        if (hotSearchWitch != null) {
            return hotSearchWitch;
        }
        return super.getHotsearchSwitchs();
    }

    public final Integer getHotspotGuideTime() {
        return Integer.valueOf(C10193n.m20607a().mo18200a(HotspotGuideTimeSettings.class, "hotspot_guide_time", super.getHotspotGuideTime(), 3));
    }

    public final Long getHttpRetryInterval() throws C10174a {
        C10193n.m20607a();
        return Long.valueOf(C10193n.m20609c().mo18220b("http_retry_interval", super.getHttpRetryInterval().longValue()));
    }

    public final Long getHttpTimeout() throws C10174a {
        C10193n.m20607a();
        return Long.valueOf(C10193n.m20609c().mo18220b("http_timeout", super.getHttpTimeout().longValue()));
    }

    public final HybridMonitorConfig getHybridMonitorConfig() throws C10174a {
        C10193n.m20607a();
        HybridMonitorConfig hybridMonitorConfig = (HybridMonitorConfig) C10193n.m20609c().mo18207a("hybrid_monitor_config", HybridMonitorConfig.class);
        if (hybridMonitorConfig != null) {
            return hybridMonitorConfig;
        }
        return super.getHybridMonitorConfig();
    }

    public final AssociativeEmoticonAll getImAssociativeEmoticonAll() {
        C10193n.m20607a();
        AssociativeEmoticonAll associativeEmoticonAll = (AssociativeEmoticonAll) C10193n.m20609c().mo18207a("im_associative_emoticon_all", AssociativeEmoticonAll.class);
        if (associativeEmoticonAll != null) {
            return associativeEmoticonAll;
        }
        return super.getImAssociativeEmoticonAll();
    }

    public final Integer getImContactsMultiSelectLimit() throws C10174a {
        C10193n.m20607a();
        return Integer.valueOf(C10193n.m20609c().mo18219b("im_contacts_multi_select_limit", super.getImContactsMultiSelectLimit().intValue()));
    }

    public final ImCreateChatBubble getImCreateChatBubble() throws C10174a {
        C10193n.m20607a();
        ImCreateChatBubble imCreateChatBubble = (ImCreateChatBubble) C10193n.m20609c().mo18207a("im_create_chat_bubble", ImCreateChatBubble.class);
        if (imCreateChatBubble != null) {
            return imCreateChatBubble;
        }
        return super.getImCreateChatBubble();
    }

    public final List<String> getImImageDomains() {
        C10193n.m20607a();
        String[] b = C10193n.m20609c().mo18223b("im_image_domains");
        if (b == null) {
            return super.getImImageDomains();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, b);
        return arrayList;
    }

    public final String getImUrlTemplate() throws C10174a {
        C10193n.m20607a();
        return C10193n.m20609c().mo18224c("im_url_template", super.getImUrlTemplate());
    }

    public final IMUseOkHttpClientConfig getImUseOkhttpclient() throws C10174a {
        C10193n.m20607a();
        IMUseOkHttpClientConfig iMUseOkHttpClientConfig = (IMUseOkHttpClientConfig) C10193n.m20609c().mo18207a("im_use_okhttpclient", IMUseOkHttpClientConfig.class);
        if (iMUseOkHttpClientConfig != null) {
            return iMUseOkHttpClientConfig;
        }
        return super.getImUseOkhttpclient();
    }

    public final IMXPlanSetting getImXDisplayStyleConfig() throws C10174a {
        C10193n.m20607a();
        IMXPlanSetting iMXPlanSetting = (IMXPlanSetting) C10193n.m20609c().mo18207a("im_x_display_style_config", IMXPlanSetting.class);
        if (iMXPlanSetting != null) {
            return iMXPlanSetting;
        }
        return super.getImXDisplayStyleConfig();
    }

    public final Integer getImXUnreadCountStrategy() throws C10174a {
        C10193n.m20607a();
        return Integer.valueOf(C10193n.m20609c().mo18219b("im_x_unread_count_strategy", super.getImXUnreadCountStrategy().intValue()));
    }

    public final Integer getImXUseEncryptedImage() throws C10174a {
        C10193n.m20607a();
        return Integer.valueOf(C10193n.m20609c().mo18219b("im_x_use_encrypted_image", super.getImXUseEncryptedImage().intValue()));
    }

    public final String getImpressionPageSchema() throws C10174a {
        C10193n.m20607a();
        return C10193n.m20609c().mo18224c("impression_page_schema", super.getImpressionPageSchema());
    }

    public final Integer getInCamera2BlackList() throws C10174a {
        C10193n.m20607a();
        return Integer.valueOf(C10193n.m20609c().mo18219b("in_camera2_black_list", super.getInCamera2BlackList().intValue()));
    }

    public final Integer getInEvening() throws C10174a {
        C10193n.m20607a();
        return Integer.valueOf(C10193n.m20609c().mo18219b("in_evening", super.getInEvening().intValue()));
    }

    public final Integer getInappUpdateSwitchStrategy() {
        return Integer.valueOf(C10193n.m20607a().mo18200a(InappUpdateSwitchStrategySettings.class, "inapp_update_switch_strategy", super.getInappUpdateSwitchStrategy(), 0));
    }

    public final Integer getIsAdapterVideoPlaySize() {
        return Integer.valueOf(C10193n.m20607a().mo18200a(IsAdapterVideoPlaySizeSettings.class, "is_adapter_video_play_size", super.getIsAdapterVideoPlaySize(), 0));
    }

    public final Integer getIsAdapterVideoPlaySizeAd() {
        return Integer.valueOf(C10193n.m20607a().mo18200a(IsAdapterVideoPlaySizeAdSettings.class, "is_adapter_video_play_size_ad", super.getIsAdapterVideoPlaySizeAd(), 0));
    }

    public final Integer getIsEnableSplashFirstShowRetrieval() throws C10174a {
        C10193n.m20607a();
        return Integer.valueOf(C10193n.m20609c().mo18219b("is_enable_splash_first_show_retrieval", super.getIsEnableSplashFirstShowRetrieval().intValue()));
    }

    public final Boolean getIsHotUser() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(IsHotUserSettings.class, "is_hot_user", super.getIsHotUser(), false));
    }

    public final Boolean getIsLowMemoryMachineForTools() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(IsLowMemoryMachineForToolsSettings.class, "is_low_memory_machine_for_tools", super.getIsLowMemoryMachineForTools(), false));
    }

    public final Boolean getIsNearbyOldUser() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(IsNearbyOldUserSettings.class, "is_nearby_old_user", super.getIsNearbyOldUser(), false));
    }

    public final Boolean getKeepCookies() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(KeepCookiesSettings.class, "keep_cookies", super.getKeepCookies(), false));
    }

    public final List<String> getKevaBlacklist() {
        C10193n.m20607a();
        String[] b = C10193n.m20609c().mo18223b("keva_blacklist");
        if (b == null) {
            return super.getKevaBlacklist();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, b);
        return arrayList;
    }

    public final Integer getKevaSwitch() {
        return Integer.valueOf(C10193n.m20607a().mo18200a(KevaSwitchSettings.class, "keva_switch", super.getKevaSwitch(), 1));
    }

    public final List<String> getLabFeatureIds() {
        C10193n.m20607a();
        String[] b = C10193n.m20609c().mo18223b("lab_feature_ids");
        if (b == null) {
            return super.getLabFeatureIds();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, b);
        return arrayList;
    }

    public final Boolean getLifeEffectsColdReq() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("life_effects_cold_req", super.getLifeEffectsColdReq().booleanValue()));
    }

    public final Integer getLightEnhanceThreshold() {
        return Integer.valueOf(C10193n.m20607a().mo18200a(LightEnhanceThresholdSettings.class, "light_enhance_threshold", super.getLightEnhanceThreshold(), 50));
    }

    public final LikePraiseDialogInfo getLikePraiseDialogInfo() throws C10174a {
        C10193n.m20607a();
        LikePraiseDialogInfo likePraiseDialogInfo = (LikePraiseDialogInfo) C10193n.m20609c().mo18207a("like_praise_dialog_info", LikePraiseDialogInfo.class);
        if (likePraiseDialogInfo != null) {
            return likePraiseDialogInfo;
        }
        return super.getLikePraiseDialogInfo();
    }

    public final LiveCnySetting getLiveCnySettings() throws C10174a {
        C10193n.m20607a();
        LiveCnySetting liveCnySetting = (LiveCnySetting) C10193n.m20609c().mo18207a("live_cny_settings", LiveCnySetting.class);
        if (liveCnySetting != null) {
            return liveCnySetting;
        }
        return super.getLiveCnySettings();
    }

    public final LiveInnerPushConfig getLiveInnerPushConfig() throws C10174a {
        C10193n.m20607a();
        LiveInnerPushConfig liveInnerPushConfig = (LiveInnerPushConfig) C10193n.m20609c().mo18207a("live_inner_push_config", LiveInnerPushConfig.class);
        if (liveInnerPushConfig != null) {
            return liveInnerPushConfig;
        }
        return super.getLiveInnerPushConfig();
    }

    public final Integer getLiveSquareGuideShowCount() {
        return Integer.valueOf(C10193n.m20607a().mo18200a(LiveSquareGuideShowCountSettings.class, "live_square_guide_show_count", super.getLiveSquareGuideShowCount(), 0));
    }

    public final Integer getLocalVideoCacheMaxAge() throws C10174a {
        C10193n.m20607a();
        return Integer.valueOf(C10193n.m20609c().mo18219b("local_video_cache_max_age", super.getLocalVideoCacheMaxAge().intValue()));
    }

    public final Integer getLocalVideoCacheMaxLength() throws C10174a {
        C10193n.m20607a();
        return Integer.valueOf(C10193n.m20609c().mo18219b("local_video_cache_max_length", super.getLocalVideoCacheMaxLength().intValue()));
    }

    public final Boolean getLongVideoPermitted() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("long_video_permitted", super.getLongVideoPermitted().booleanValue()));
    }

    public final Long getLongVideoThreshold() throws C10174a {
        C10193n.m20607a();
        return Long.valueOf(C10193n.m20609c().mo18220b("long_video_threshold", super.getLongVideoThreshold().longValue()));
    }

    public final Boolean getMainTabFollowUseLazyViewpager() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(MainTabFollowUseLazyViewpagerSettings.class, "main_tab_follow_use_lazy_viewpager", super.getMainTabFollowUseLazyViewpager(), false));
    }

    public final Integer getMaxMessageCountForRecommend() {
        return Integer.valueOf(C10193n.m20607a().mo18200a(MaxMessageCountForRecommendSettings.class, "max_message_count_for_recommend", super.getMaxMessageCountForRecommend(), 5));
    }

    public final Integer getMinFollowNumForLandingFollowTab() {
        return Integer.valueOf(C10193n.m20607a().mo18200a(MinFollowNumForLandingFollowTabSettings.class, "min_follow_num_for_landing_follow_tab", super.getMinFollowNumForLandingFollowTab(), 100));
    }

    public final Boolean getMiniappPreloadEmptyProcessEnbale() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(MiniappPreloadEmptyProcessEnbaleSettings.class, "miniapp_preload_empty_process_enbale", super.getMiniappPreloadEmptyProcessEnbale(), false));
    }

    public final Integer getMiniappPreloadEnbale() throws C10174a {
        C10193n.m20607a();
        return Integer.valueOf(C10193n.m20609c().mo18219b("miniapp_preload_enbale", super.getMiniappPreloadEnbale().intValue()));
    }

    public final Boolean getMiniappWonderlandEnable() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(MiniappWonderlandEnableSettings.class, "miniapp_wonderland_enable", super.getMiniappWonderlandEnable(), false));
    }

    public final Integer getMixPermission() {
        return Integer.valueOf(C10193n.m20607a().mo18200a(MixPermissionSettings.class, "mix_permission", super.getMixPermission(), 0));
    }

    public final String getMovieDetail() throws C10174a {
        C10193n.m20607a();
        return C10193n.m20609c().mo18224c("movie_detail", super.getMovieDetail());
    }

    public final Boolean getMtForbidInsertPlaceholderWord() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(MtForbidInsertPlaceholderWordSettings.class, "mt_forbid_insert_placeholder_word", super.getMtForbidInsertPlaceholderWord(), false));
    }

    public final Integer getMtLocalAnalysisHprof() {
        return Integer.valueOf(C10193n.m20607a().mo18200a(MtLocalAnalysisHprofSettings.class, "mt_local_analysis_hprof", super.getMtLocalAnalysisHprof(), 0));
    }

    public final Integer getMtSearchHistoryFoldCount() {
        return Integer.valueOf(C10193n.m20607a().mo18200a(MtSearchHistoryFoldCountSettings.class, "mt_search_history_fold_count", super.getMtSearchHistoryFoldCount(), 3));
    }

    public final MtcertSettings getMtcertSettings() throws C10174a {
        C10193n.m20607a();
        MtcertSettings mtcertSettings = (MtcertSettings) C10193n.m20609c().mo18207a("mtcert_settings", MtcertSettings.class);
        if (mtcertSettings != null) {
            return mtcertSettings;
        }
        return super.getMtcertSettings();
    }

    public final Boolean getMusicCopyrightGranted() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("music_copyright_granted", super.getMusicCopyrightGranted().booleanValue()));
    }

    public final Integer getMusicianShowType() throws C10174a {
        C10193n.m20607a();
        return Integer.valueOf(C10193n.m20609c().mo18219b("musician_show_type", super.getMusicianShowType().intValue()));
    }

    public final NewAnchorShowBubbleSettings getNewAnchorShowBubbleSettings() throws C10174a {
        C10193n.m20607a();
        NewAnchorShowBubbleSettings newAnchorShowBubbleSettings = (NewAnchorShowBubbleSettings) C10193n.m20609c().mo18207a("new_anchor_show_bubble_settings", NewAnchorShowBubbleSettings.class);
        if (newAnchorShowBubbleSettings != null) {
            return newAnchorShowBubbleSettings;
        }
        return super.getNewAnchorShowBubbleSettings();
    }

    public final Integer getOpenImLink() throws C10174a {
        C10193n.m20607a();
        return Integer.valueOf(C10193n.m20609c().mo18219b("open_im_link", super.getOpenImLink().intValue()));
    }

    public final String getOrginalMusicianUrl() throws C10174a {
        C10193n.m20607a();
        return C10193n.m20609c().mo18224c("orginal_musician_url", super.getOrginalMusicianUrl());
    }

    public final Boolean getOriginalMusicianEntry() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("original_musician_entry", super.getOriginalMusicianEntry().booleanValue()));
    }

    public final PoiSetting getPoiSetting() throws C10174a {
        C10193n.m20607a();
        PoiSetting poiSetting = (PoiSetting) C10193n.m20609c().mo18207a("poi_setting", PoiSetting.class);
        if (poiSetting != null) {
            return poiSetting;
        }
        return super.getPoiSetting();
    }

    public final PopupBlackList getPopupBlackList() throws C10174a {
        C10193n.m20607a();
        PopupBlackList popupBlackList = (PopupBlackList) C10193n.m20609c().mo18207a("popup_black_list", PopupBlackList.class);
        if (popupBlackList != null) {
            return popupBlackList;
        }
        return super.getPopupBlackList();
    }

    public final Boolean getPostDownloadSetting() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(PostDownloadSettingSettings.class, "post_download_setting", super.getPostDownloadSetting(), false));
    }

    public final Integer getPosterSrType() {
        return Integer.valueOf(C10193n.m20607a().mo18200a(PosterSrTypeSettings.class, "poster_sr_type", super.getPosterSrType(), 0));
    }

    public final Integer getPreUploadMemoryLimit() throws C10174a {
        C10193n.m20607a();
        return Integer.valueOf(C10193n.m20609c().mo18219b("pre_upload_memory_limit", super.getPreUploadMemoryLimit().intValue()));
    }

    public final List<String> getPreloadMicroAppList() {
        C10193n.m20607a();
        String[] b = C10193n.m20609c().mo18223b("preload_micro_app_list");
        if (b == null) {
            return super.getPreloadMicroAppList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, b);
        return arrayList;
    }

    public final Boolean getPrivateAvailable() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("private_available", super.getPrivateAvailable().booleanValue()));
    }

    public final ProAccountEnableDetailInfo getProAccountEnableDetailInfo() throws C10174a {
        C10193n.m20607a();
        ProAccountEnableDetailInfo proAccountEnableDetailInfo = (ProAccountEnableDetailInfo) C10193n.m20609c().mo18207a("pro_account_enable_detail_info", ProAccountEnableDetailInfo.class);
        if (proAccountEnableDetailInfo != null) {
            return proAccountEnableDetailInfo;
        }
        return super.getProAccountEnableDetailInfo();
    }

    public final Boolean getProfilePageSkipRemove() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("profile_page_skip_remove", super.getProfilePageSkipRemove().booleanValue()));
    }

    public final Long getProgressbarThreshold() throws C10174a {
        C10193n.m20607a();
        return Long.valueOf(C10193n.m20609c().mo18220b("progressbar_threshold", super.getProgressbarThreshold().longValue()));
    }

    public final pushGuideInfo getPushGuideInfo() throws C10174a {
        C10193n.m20607a();
        pushGuideInfo pushguideinfo = (pushGuideInfo) C10193n.m20609c().mo18207a("push_guide_info", pushGuideInfo.class);
        if (pushguideinfo != null) {
            return pushguideinfo;
        }
        return super.getPushGuideInfo();
    }

    public final Integer getPushdelayinitSwitch() {
        return Integer.valueOf(C10193n.m20607a().mo18200a(PushdelayinitSwitchSettings.class, "pushdelayinit_switch", super.getPushdelayinitSwitch(), 0));
    }

    public final QuickShopLoadingPage getQuickShopLoadingPage() throws C10174a {
        C10193n.m20607a();
        QuickShopLoadingPage quickShopLoadingPage = (QuickShopLoadingPage) C10193n.m20609c().mo18207a("quick_shop_loading_page", QuickShopLoadingPage.class);
        if (quickShopLoadingPage != null) {
            return quickShopLoadingPage;
        }
        return super.getQuickShopLoadingPage();
    }

    public final Integer getReactMicStatus() throws C10174a {
        C10193n.m20607a();
        return Integer.valueOf(C10193n.m20609c().mo18219b("react_mic_status", super.getReactMicStatus().intValue()));
    }

    public final Integer getReadVideoLastGap() {
        return Integer.valueOf(C10193n.m20607a().mo18200a(ReadVideoLastGapSettings.class, "read_video_last_gap", super.getReadVideoLastGap(), 200));
    }

    public final Boolean getRealTimeReportEnable() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(RealTimeReportEnableSettings.class, "real_time_report_enable", super.getRealTimeReportEnable(), true));
    }

    public final Integer getRecordBitrateMode() throws C10174a {
        C10193n.m20607a();
        return Integer.valueOf(C10193n.m20609c().mo18219b("record_bitrate_mode", super.getRecordBitrateMode().intValue()));
    }

    public final Integer getRecordCameraCompatLevel() throws C10174a {
        C10193n.m20607a();
        return Integer.valueOf(C10193n.m20609c().mo18219b("record_camera_compat_level", super.getRecordCameraCompatLevel().intValue()));
    }

    public final Integer getRecordCameraType() throws C10174a {
        C10193n.m20607a();
        return Integer.valueOf(C10193n.m20609c().mo18219b("record_camera_type", super.getRecordCameraType().intValue()));
    }

    public final Integer getRecordOpenHighProfile() throws C10174a {
        C10193n.m20607a();
        return Integer.valueOf(C10193n.m20609c().mo18219b("record_open_high_profile", super.getRecordOpenHighProfile().intValue()));
    }

    public final Long getReusePhoneCheckInterval() {
        return Long.valueOf(C10193n.m20607a().mo18201a(ReusePhoneCheckIntervalSettings.class, "reuse_phone_check_interval", super.getReusePhoneCheckInterval(), 0));
    }

    public final Integer getSatCameraType() {
        return Integer.valueOf(C10193n.m20607a().mo18200a(SatCameraTypeSettings.class, "sat_camera_type", super.getSatCameraType(), 0));
    }

    public final Integer getSearchHistoryCollapseNum() {
        return Integer.valueOf(C10193n.m20607a().mo18200a(SearchHistoryCollapseNumSettings.class, "search_history_collapse_num", super.getSearchHistoryCollapseNum(), 4));
    }

    public final Integer getSearchMiddleRecommendWordsCount() {
        return Integer.valueOf(C10193n.m20607a().mo18200a(SearchMiddleRecommendWordsCountSettings.class, "search_middle_recommend_words_count", super.getSearchMiddleRecommendWordsCount(), 12));
    }

    public final SearchPullFeedbackStruct getSearchPullFeedback() throws C10174a {
        C10193n.m20607a();
        SearchPullFeedbackStruct searchPullFeedbackStruct = (SearchPullFeedbackStruct) C10193n.m20609c().mo18207a("search_pull_feedback", SearchPullFeedbackStruct.class);
        if (searchPullFeedbackStruct != null) {
            return searchPullFeedbackStruct;
        }
        return super.getSearchPullFeedback();
    }

    public final Integer getSecIdSwitch() {
        return Integer.valueOf(C10193n.m20607a().mo18200a(SecIdSwitchSettings.class, "sec_id_switch", super.getSecIdSwitch(), 1));
    }

    public final Integer getShakeFreeWhiteList() throws C10174a {
        C10193n.m20607a();
        return Integer.valueOf(C10193n.m20609c().mo18219b("shake_free_white_list", super.getShakeFreeWhiteList().intValue()));
    }

    public final List<String> getShareH5UrlWhitelist() {
        C10193n.m20607a();
        String[] b = C10193n.m20609c().mo18223b("share_h5_url_whitelist");
        if (b == null) {
            return super.getShareH5UrlWhitelist();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, b);
        return arrayList;
    }

    public final Boolean getShieldMusicSdk() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("shield_music_sdk", super.getShieldMusicSdk().booleanValue()));
    }

    public final String getShootTutorialLink() throws C10174a {
        C10193n.m20607a();
        return C10193n.m20609c().mo18224c("shoot_tutorial_link", super.getShootTutorialLink());
    }

    public final String getShopLinkAnchorDisclaimer() {
        return C10193n.m20607a().mo18203a(ShopLinkAnchorDisclaimerSettings.class, "shop_link_anchor_disclaimer", super.getShopLinkAnchorDisclaimer(), "");
    }

    public final ShoppingConfig getShopping() throws C10174a {
        C10193n.m20607a();
        ShoppingConfig shoppingConfig = (ShoppingConfig) C10193n.m20609c().mo18207a("shopping", ShoppingConfig.class);
        if (shoppingConfig != null) {
            return shoppingConfig;
        }
        return super.getShopping();
    }

    public final Integer getShowDeviceManagerEntry() {
        return Integer.valueOf(C10193n.m20607a().mo18200a(ShowDeviceManagerEntrySettings.class, "show_device_manager_entry", super.getShowDeviceManagerEntry(), 0));
    }

    public final Boolean getShowDoulabEntrance() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(ShowDoulabEntranceSettings.class, "show_doulab_entrance", super.getShowDoulabEntrance(), true));
    }

    public final Integer getShowFromDuoshanLabel() {
        return Integer.valueOf(C10193n.m20607a().mo18200a(ShowFromDuoshanLabelSettings.class, "show_from_duoshan_label", super.getShowFromDuoshanLabel(), 0));
    }

    public final Boolean getShowMusicFeedbackEntrance() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("show_music_feedback_entrance", super.getShowMusicFeedbackEntrance().booleanValue()));
    }

    public final Boolean getShowQqdownloaderPrivacyDialog() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(ShowQqdownloaderPrivacyDialogSettings.class, "show_qqdownloader_privacy_dialog", super.getShowQqdownloaderPrivacyDialog(), false));
    }

    public final Boolean getShowRocketShareIfInstall() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("show_rocket_share_if_install", super.getShowRocketShareIfInstall().booleanValue()));
    }

    public final Long getShowStorageDotSize() {
        return Long.valueOf(C10193n.m20607a().mo18201a(ShowStorageDotSizeSettings.class, "show_storage_dot_size", super.getShowStorageDotSize(), (long) ShowStorageDotSizeSettings.DEFAULT));
    }

    public final Long getShowStorageTipSize() {
        return Long.valueOf(C10193n.m20607a().mo18201a(ShowStorageTipSizeSettings.class, "show_storage_tip_size", super.getShowStorageTipSize(), (long) ShowStorageTipSizeSettings.DEFAULT));
    }

    public final Boolean getShutterSoundEnable() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("shutter_sound_enable", super.getShutterSoundEnable().booleanValue()));
    }

    public final Boolean getSilentShareConfigurable() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("silent_share_configurable", super.getSilentShareConfigurable().booleanValue()));
    }

    public final Boolean getSmartisanDataSharingSwitch() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(SmartisanDataSharingSwitchSettings.class, "smartisan_data_sharing_switch", super.getSmartisanDataSharingSwitch(), true));
    }

    public final Long getSplashPreloadDelay() throws C10174a {
        C10193n.m20607a();
        return Long.valueOf(C10193n.m20609c().mo18220b("splash_preload_delay", super.getSplashPreloadDelay().longValue()));
    }

    public final Long getSplashStockDelayMillisTime() {
        return Long.valueOf(C10193n.m20607a().mo18201a(SplashStockDelayMillisTimeSettings.class, "splash_stock_delay_millis_time", super.getSplashStockDelayMillisTime(), 2000));
    }

    public final List<String> getSplashSwitchServerList() {
        C10193n.m20607a();
        String[] b = C10193n.m20609c().mo18223b("splash_switch_server_list");
        if (b == null) {
            return super.getSplashSwitchServerList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, b);
        return arrayList;
    }

    public final SpringApiLimitConfig getSpringApiLimitConfig() throws C10174a {
        C10193n.m20607a();
        SpringApiLimitConfig springApiLimitConfig = (SpringApiLimitConfig) C10193n.m20609c().mo18207a("spring_api_limit_config", SpringApiLimitConfig.class);
        if (springApiLimitConfig != null) {
            return springApiLimitConfig;
        }
        return super.getSpringApiLimitConfig();
    }

    public final String getStarAtlasProfileLink() {
        return C10193n.m20607a().mo18203a(StarAtlasProfileLinkSettings.class, "star_atlas_profile_link", super.getStarAtlasProfileLink(), StarAtlasProfileLinkSettings.DEFAULT);
    }

    public final Integer getStatisticsBackupPct() throws C10174a {
        C10193n.m20607a();
        return Integer.valueOf(C10193n.m20609c().mo18219b("statistics_backup_pct", super.getStatisticsBackupPct().intValue()));
    }

    public final String getStatusLottieUrl() {
        return C10193n.m20607a().mo18203a(StatusLottieUrlSettings.class, "status_lottie_url", super.getStatusLottieUrl(), "");
    }

    public final Integer getStatusPhoneType() {
        return Integer.valueOf(C10193n.m20607a().mo18200a(StatusPhoneTypeSettings.class, "status_phone_type", super.getStatusPhoneType(), 0));
    }

    public final String getStatusTabKey() {
        return C10193n.m20607a().mo18203a(StatusTabKeySettings.class, "status_tab_key", super.getStatusTabKey(), "");
    }

    public final String getStickerArtistIconUrl() throws C10174a {
        C10193n.m20607a();
        return C10193n.m20609c().mo18224c("sticker_artist_icon_url", super.getStickerArtistIconUrl());
    }

    public final Boolean getStickerUpdateApp() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(StickerUpdateAppSettings.class, "sticker_update_app", super.getStickerUpdateApp(), false));
    }

    public final Integer getStoryImagePlayTime() throws C10174a {
        C10193n.m20607a();
        return Integer.valueOf(C10193n.m20609c().mo18219b("story_image_play_time", super.getStoryImagePlayTime().intValue()));
    }

    public final Boolean getStorySupportAnimate() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("story_support_animate", super.getStorySupportAnimate().booleanValue()));
    }

    public final SuperEntranceConfig getSuperEntranceConfig() throws C10174a {
        C10193n.m20607a();
        SuperEntranceConfig superEntranceConfig = (SuperEntranceConfig) C10193n.m20609c().mo18207a("super_entrance_config", SuperEntranceConfig.class);
        if (superEntranceConfig != null) {
            return superEntranceConfig;
        }
        return super.getSuperEntranceConfig();
    }

    public final Boolean getSupportFilterErrorFile() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(SupportFilterErrorFileSettings.class, "support_filter_error_file", super.getSupportFilterErrorFile(), false));
    }

    public final Float getSyntheticVideoBitrate() throws C10174a {
        C10193n.m20607a();
        return Float.valueOf(C10193n.m20609c().mo18218b("synthetic_video_bitrate", super.getSyntheticVideoBitrate().floatValue()));
    }

    public final Integer getSyntheticVideoGop() throws C10174a {
        C10193n.m20607a();
        return Integer.valueOf(C10193n.m20609c().mo18219b("synthetic_video_gop", super.getSyntheticVideoGop().intValue()));
    }

    public final Long getSyntheticVideoMaxrate() throws C10174a {
        C10193n.m20607a();
        return Long.valueOf(C10193n.m20609c().mo18220b("synthetic_video_maxrate", super.getSyntheticVideoMaxrate().longValue()));
    }

    public final Integer getSyntheticVideoPreset() throws C10174a {
        C10193n.m20607a();
        return Integer.valueOf(C10193n.m20609c().mo18219b("synthetic_video_preset", super.getSyntheticVideoPreset().intValue()));
    }

    public final Integer getSyntheticVideoQuality() throws C10174a {
        C10193n.m20607a();
        return Integer.valueOf(C10193n.m20609c().mo18219b("synthetic_video_quality", super.getSyntheticVideoQuality().intValue()));
    }

    public final Integer getTcmCtrySettings() {
        return Integer.valueOf(C10193n.m20607a().mo18200a(TcmCtrySettingsSettings.class, "tcm_ctry_settings", super.getTcmCtrySettings(), 0));
    }

    public final String getTcmNameCtry() {
        return C10193n.m20607a().mo18203a(TcmNameCtrySettings.class, "tcm_name_ctry", super.getTcmNameCtry(), TcmNameCtrySettings.DEFAULT);
    }

    public final Integer getThirdPartyDataRefresh() throws C10174a {
        C10193n.m20607a();
        return Integer.valueOf(C10193n.m20609c().mo18219b("third_party_data_refresh", super.getThirdPartyDataRefresh().intValue()));
    }

    public final List<String> getTtnetInterceptWebviewBlackList() {
        C10193n.m20607a();
        String[] b = C10193n.m20609c().mo18223b("ttnet_intercept_webview_black_list");
        if (b == null) {
            return super.getTtnetInterceptWebviewBlackList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, b);
        return arrayList;
    }

    public final List<String> getTtnetInterceptWebviewWhiteList() {
        C10193n.m20607a();
        String[] b = C10193n.m20609c().mo18223b("ttnet_intercept_webview_white_list");
        if (b == null) {
            return super.getTtnetInterceptWebviewWhiteList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, b);
        return arrayList;
    }

    public final String getUgSecLinkUrl() {
        return C10193n.m20607a().mo18203a(UgSecLinkUrlSettings.class, "ug_sec_link_url", super.getUgSecLinkUrl(), "");
    }

    public final Integer getUgShareWebviewSecLevel() {
        return Integer.valueOf(C10193n.m20607a().mo18200a(UgShareWebviewSecLevelSettings.class, "ug_share_webview_sec_level", super.getUgShareWebviewSecLevel(), 0));
    }

    public final UlikeParams getUlikeParams() throws C10174a {
        C10193n.m20607a();
        UlikeParams ulikeParams = (UlikeParams) C10193n.m20609c().mo18207a("ulike_params", UlikeParams.class);
        if (ulikeParams != null) {
            return ulikeParams;
        }
        return super.getUlikeParams();
    }

    public final Integer getUploadContactsNoticeInterval() throws C10174a {
        C10193n.m20607a();
        return Integer.valueOf(C10193n.m20609c().mo18219b("upload_contacts_notice_interval", super.getUploadContactsNoticeInterval().intValue()));
    }

    public final Integer getUploadContactsNoticeTimes() throws C10174a {
        C10193n.m20607a();
        return Integer.valueOf(C10193n.m20609c().mo18219b("upload_contacts_notice_times", super.getUploadContactsNoticeTimes().intValue()));
    }

    public final Boolean getUploadOriginAudioTrack() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("upload_origin_audio_track", super.getUploadOriginAudioTrack().booleanValue()));
    }

    public final List<String> getUploadVideoSizeCategory() {
        C10193n.m20607a();
        String[] b = C10193n.m20609c().mo18223b("upload_video_size_category");
        if (b == null) {
            return super.getUploadVideoSizeCategory();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, b);
        return arrayList;
    }

    public final Boolean getUseBridgeEngineV2() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(UseBridgeEngineV2Settings.class, "use_bridge_engine_v2", super.getUseBridgeEngineV2(), false));
    }

    public final Integer getUseHardcode() throws C10174a {
        C10193n.m20607a();
        return Integer.valueOf(C10193n.m20609c().mo18219b("use_hardcode", super.getUseHardcode().intValue()));
    }

    public final Boolean getUseNewSplashView() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(UseNewSplashViewSettings.class, "use_new_splash_view", super.getUseNewSplashView(), false));
    }

    public final Boolean getUseNewyearDirectUpload() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(UseNewyearDirectUploadSettings.class, "use_newyear_direct_upload", super.getUseNewyearDirectUpload(), false));
    }

    public final Boolean getUseRightSwipeBack() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("use_right_swipe_back", super.getUseRightSwipeBack().booleanValue()));
    }

    public final Integer getUseSyntheticHardcode() throws C10174a {
        C10193n.m20607a();
        return Integer.valueOf(C10193n.m20609c().mo18219b("use_synthetic_hardcode", super.getUseSyntheticHardcode().intValue()));
    }

    public final Integer getUseVeImage() {
        return Integer.valueOf(C10193n.m20607a().mo18200a(UseVeImageSettings.class, "use_ve_image", super.getUseVeImage(), 0));
    }

    public final Boolean getUseWatermarkHardcode() throws C10174a {
        C10193n.m20607a();
        return Boolean.valueOf(C10193n.m20609c().mo18222b("use_watermark_hardcode", super.getUseWatermarkHardcode().booleanValue()));
    }

    public final VCDV1ConfigStruct getVcdV1ConfigInfo() throws C10174a {
        C10193n.m20607a();
        VCDV1ConfigStruct vCDV1ConfigStruct = (VCDV1ConfigStruct) C10193n.m20609c().mo18207a("vcd_v1_config_info", VCDV1ConfigStruct.class);
        if (vCDV1ConfigStruct != null) {
            return vCDV1ConfigStruct;
        }
        return super.getVcdV1ConfigInfo();
    }

    public final Boolean getVeFastImportIgnoreRecode() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(VeFastImportIgnoreRecodeSettings.class, "ve_fast_import_ignore_recode", super.getVeFastImportIgnoreRecode(), false));
    }

    public final Boolean getVeFastImportIgnoreRecodeForRotation() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(VeFastImportIgnoreRecodeForRotationSettings.class, "ve_fast_import_ignore_recode_for_rotation", super.getVeFastImportIgnoreRecodeForRotation(), false));
    }

    public final String getVeRuntimeConfig() {
        return C10193n.m20607a().mo18203a(VeRuntimeConfigSettings.class, "ve_runtime_config", super.getVeRuntimeConfig(), "");
    }

    public final Float getVideoBitrate() throws C10174a {
        C10193n.m20607a();
        return Float.valueOf(C10193n.m20609c().mo18218b("video_bitrate", super.getVideoBitrate().floatValue()));
    }

    public final Integer getVideoCommit() throws C10174a {
        C10193n.m20607a();
        return Integer.valueOf(C10193n.m20609c().mo18219b("video_commit", super.getVideoCommit().intValue()));
    }

    public final Integer getVideoCompose() throws C10174a {
        C10193n.m20607a();
        return Integer.valueOf(C10193n.m20609c().mo18219b("video_compose", super.getVideoCompose().intValue()));
    }

    public final Long getVideoDurationLimitMs() throws C10174a {
        C10193n.m20607a();
        return Long.valueOf(C10193n.m20609c().mo18220b("video_duration_limit_ms", super.getVideoDurationLimitMs().longValue()));
    }

    public final Integer getVideoPlayProgressCount() {
        return Integer.valueOf(C10193n.m20607a().mo18200a(VideoPlayProgressCountSettings.class, "video_play_progress_count", super.getVideoPlayProgressCount(), 0));
    }

    public final Integer getVideoQuality() throws C10174a {
        C10193n.m20607a();
        return Integer.valueOf(C10193n.m20609c().mo18219b("video_quality", super.getVideoQuality().intValue()));
    }

    public final String getVideoSize() throws C10174a {
        C10193n.m20607a();
        return C10193n.m20609c().mo18224c("video_size", super.getVideoSize());
    }

    public final List<String> getVideoSizeCategory() {
        C10193n.m20607a();
        String[] b = C10193n.m20609c().mo18223b("video_size_category");
        if (b == null) {
            return super.getVideoSizeCategory();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, b);
        return arrayList;
    }

    public final Integer getVideoUploadNormalizationParam() throws C10174a {
        C10193n.m20607a();
        return Integer.valueOf(C10193n.m20609c().mo18219b("video_upload_normalization_param", super.getVideoUploadNormalizationParam().intValue()));
    }

    public final VisionSearchStruct getVisionSearch() throws C10174a {
        C10193n.m20607a();
        VisionSearchStruct visionSearchStruct = (VisionSearchStruct) C10193n.m20609c().mo18207a("vision_search", VisionSearchStruct.class);
        if (visionSearchStruct != null) {
            return visionSearchStruct;
        }
        return super.getVisionSearch();
    }

    public final List<String> getWebviewCachePoolSwitch() {
        C10193n.m20607a();
        String[] b = C10193n.m20609c().mo18223b("webview_cache_pool_switch");
        if (b == null) {
            return super.getWebviewCachePoolSwitch();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, b);
        return arrayList;
    }

    public final List<String> getWebviewCacheUrls() {
        C10193n.m20607a();
        String[] b = C10193n.m20609c().mo18223b("webview_cache_urls");
        if (b == null) {
            return super.getWebviewCacheUrls();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, b);
        return arrayList;
    }

    public final Integer getWideCameraInfo() throws C10174a {
        C10193n.m20607a();
        return Integer.valueOf(C10193n.m20609c().mo18219b("wide_camera_info", super.getWideCameraInfo().intValue()));
    }

    public final String getWikipediaAnchorUrlPlaceholder() {
        return C10193n.m20607a().mo18203a(WikipediaAnchorUrlPlaceholderSettings.class, "wikipedia_anchor_url_placeholder", super.getWikipediaAnchorUrlPlaceholder(), WikipediaAnchorUrlPlaceholderSettings.DEFAULT);
    }

    public final Boolean getWithDouplusEntry() {
        return Boolean.valueOf(C10193n.m20607a().mo18204a(WithDouplusEntrySettings.class, "with_douplus_entry", super.getWithDouplusEntry(), false));
    }

    public final Integer getWsUseNewSdk() throws C10174a {
        C10193n.m20607a();
        return Integer.valueOf(C10193n.m20609c().mo18219b("ws_use_new_sdk", super.getWsUseNewSdk().intValue()));
    }

    public final List<OriginChannelTab> getChannelTabs() {
        C10193n.m20607a();
        OriginChannelTab[] originChannelTabArr = (OriginChannelTab[]) C10193n.m20609c().mo18207a("channel_tabs", OriginChannelTab[].class);
        if (originChannelTabArr == null) {
            return super.getChannelTabs();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, originChannelTabArr);
        return arrayList;
    }

    public final List<ContentLanguageGuideSetting> getContentLanguageGuideCodes() {
        C10193n.m20607a();
        ContentLanguageGuideSetting[] contentLanguageGuideSettingArr = (ContentLanguageGuideSetting[]) C10193n.m20609c().mo18207a("content_language_guide_codes", ContentLanguageGuideSetting[].class);
        if (contentLanguageGuideSettingArr == null) {
            return super.getContentLanguageGuideCodes();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, contentLanguageGuideSettingArr);
        return arrayList;
    }

    public final List<DouplusTextStruct> getDouplusEntryTitle() {
        C10193n.m20607a();
        DouplusTextStruct[] douplusTextStructArr = (DouplusTextStruct[]) C10193n.m20609c().mo18207a("douplus_entry_title", DouplusTextStruct[].class);
        if (douplusTextStructArr == null) {
            return super.getDouplusEntryTitle();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, douplusTextStructArr);
        return arrayList;
    }

    public final List<Integer> getOneBindNetSetting() {
        C10193n.m20607a();
        Integer[] numArr = (Integer[]) C10193n.m20609c().mo18207a("one_bind_net_setting", Integer[].class);
        if (numArr == null) {
            return super.getOneBindNetSetting();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, numArr);
        return arrayList;
    }

    public final List<WhatsAppCodeItem> getShowWhatsappByCallingCode() {
        C10193n.m20607a();
        WhatsAppCodeItem[] whatsAppCodeItemArr = (WhatsAppCodeItem[]) C10193n.m20609c().mo18207a("show_whatsapp_by_calling_code", WhatsAppCodeItem[].class);
        if (whatsAppCodeItemArr == null) {
            return super.getShowWhatsappByCallingCode();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, whatsAppCodeItemArr);
        return arrayList;
    }

    public final List<ShareChannelSettings> getSilentShareList() {
        C10193n.m20607a();
        ShareChannelSettings[] shareChannelSettingsArr = (ShareChannelSettings[]) C10193n.m20609c().mo18207a("silent_share_list", ShareChannelSettings[].class);
        if (shareChannelSettingsArr == null) {
            return super.getSilentShareList();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, shareChannelSettingsArr);
        return arrayList;
    }

    public final List<Integer> getThirdpartyLoginBindSkip() {
        C10193n.m20607a();
        Integer[] numArr = (Integer[]) C10193n.m20609c().mo18207a("thirdparty_login_bind_skip", Integer[].class);
        if (numArr == null) {
            return super.getThirdpartyLoginBindSkip();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, numArr);
        return arrayList;
    }

    public final List<Float> getVideoBitrateCategory() {
        C10193n.m20607a();
        Float[] fArr = (Float[]) C10193n.m20609c().mo18207a("video_bitrate_category", Float[].class);
        if (fArr == null) {
            return super.getVideoBitrateCategory();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        return arrayList;
    }

    public final List<Integer> getVideoQualityCategory() {
        C10193n.m20607a();
        Integer[] numArr = (Integer[]) C10193n.m20609c().mo18207a("video_quality_category", Integer[].class);
        if (numArr == null) {
            return super.getVideoQualityCategory();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, numArr);
        return arrayList;
    }

    public C20852ac(IESSettings iESSettings, C10616c cVar) {
        super(iESSettings, cVar);
    }
}
