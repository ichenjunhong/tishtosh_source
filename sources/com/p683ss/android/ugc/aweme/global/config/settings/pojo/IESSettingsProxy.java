package com.p683ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.C10174a;
import com.bytedance.ies.C10616c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy */
public class IESSettingsProxy {
    private final C10616c hook;
    private final IESSettings rawValue;

    public IESSettings getSettings() {
        return this.rawValue;
    }

    public Boolean getAbmockKevaSwitch() {
        if (this.hook == null) {
            return this.rawValue.getAbmockKevaSwitch();
        }
        return (Boolean) getProxyValue(this.hook, "abmock_keva_switch", Boolean.class, (T) this.rawValue.getAbmockKevaSwitch());
    }

    public Boolean getAdFixFeedScrollRight() {
        if (this.hook == null) {
            return this.rawValue.getAdFixFeedScrollRight();
        }
        return (Boolean) getProxyValue(this.hook, "ad_fix_feed_scroll_right", Boolean.class, (T) this.rawValue.getAdFixFeedScrollRight());
    }

    public Integer getAdGapInteractiveDuration() {
        if (this.hook == null) {
            return this.rawValue.getAdGapInteractiveDuration();
        }
        return (Integer) getProxyValue(this.hook, "ad_gap_interactive_duration", Integer.class, (T) this.rawValue.getAdGapInteractiveDuration());
    }

    public String getAdTrackerConfig() {
        if (this.hook == null) {
            return this.rawValue.getAdTrackerConfig();
        }
        return (String) getProxyValue(this.hook, "ad_tracker_config", String.class, (T) this.rawValue.getAdTrackerConfig());
    }

    public Long getAddressbookUploadInterval() {
        if (this.hook == null) {
            return this.rawValue.getAddressbookUploadInterval();
        }
        return (Long) getProxyValue(this.hook, "addressbook_upload_interval", Long.class, (T) this.rawValue.getAddressbookUploadInterval());
    }

    public Boolean getAiMusicBackupStrategy() {
        if (this.hook == null) {
            return this.rawValue.getAiMusicBackupStrategy();
        }
        return (Boolean) getProxyValue(this.hook, "ai_music_backup_strategy", Boolean.class, (T) this.rawValue.getAiMusicBackupStrategy());
    }

    public Boolean getAllowLongVideo() {
        if (this.hook == null) {
            return this.rawValue.getAllowLongVideo();
        }
        return (Boolean) getProxyValue(this.hook, "allow_long_video", Boolean.class, (T) this.rawValue.getAllowLongVideo());
    }

    public Integer getAllowLongVideoThreshold() {
        if (this.hook == null) {
            return this.rawValue.getAllowLongVideoThreshold();
        }
        return (Integer) getProxyValue(this.hook, "allow_long_video_threshold", Integer.class, (T) this.rawValue.getAllowLongVideoThreshold());
    }

    public List<com_ss_android_ugc_aweme_settings_RnSourceUrlSetting> getAndroidSourceUrl() {
        if (this.hook == null) {
            return this.rawValue.getAndroidSourceUrl();
        }
        return getProxyValue(this.hook, "android_source_url", com_ss_android_ugc_aweme_settings_RnSourceUrlSetting.class, this.rawValue.getAndroidSourceUrl());
    }

    public Integer getAntiAddictionDayTime() {
        if (this.hook == null) {
            return this.rawValue.getAntiAddictionDayTime();
        }
        return (Integer) getProxyValue(this.hook, "anti_addiction_day_time", Integer.class, (T) this.rawValue.getAntiAddictionDayTime());
    }

    public Integer getAntiAddictionNightTime() {
        if (this.hook == null) {
            return this.rawValue.getAntiAddictionNightTime();
        }
        return (Integer) getProxyValue(this.hook, "anti_addiction_night_time", Integer.class, (T) this.rawValue.getAntiAddictionNightTime());
    }

    public String getAntiAddictionPopUpText() {
        if (this.hook == null) {
            return this.rawValue.getAntiAddictionPopUpText();
        }
        return (String) getProxyValue(this.hook, "anti_addiction_pop_up_text", String.class, (T) this.rawValue.getAntiAddictionPopUpText());
    }

    public Integer getAntiAddictionSeparation() {
        if (this.hook == null) {
            return this.rawValue.getAntiAddictionSeparation();
        }
        return (Integer) getProxyValue(this.hook, "anti_addiction_separation", Integer.class, (T) this.rawValue.getAntiAddictionSeparation());
    }

    public Integer getAntiAddictionToastTime() {
        if (this.hook == null) {
            return this.rawValue.getAntiAddictionToastTime();
        }
        return (Integer) getProxyValue(this.hook, "anti_addiction_toast_time", Integer.class, (T) this.rawValue.getAntiAddictionToastTime());
    }

    public List<String> getApiAlogWhiteList() {
        if (this.hook == null) {
            return this.rawValue.getApiAlogWhiteList();
        }
        return getProxyValue(this.hook, "api_alog_white_list", String.class, this.rawValue.getApiAlogWhiteList());
    }

    public Long getAuthorizeInfoUploadInterval() {
        if (this.hook == null) {
            return this.rawValue.getAuthorizeInfoUploadInterval();
        }
        return (Long) getProxyValue(this.hook, "authorize_info_upload_interval", Long.class, (T) this.rawValue.getAuthorizeInfoUploadInterval());
    }

    public List<String> getAutoConnectFeConfig() {
        if (this.hook == null) {
            return this.rawValue.getAutoConnectFeConfig();
        }
        return getProxyValue(this.hook, "auto_connect_fe_config", String.class, this.rawValue.getAutoConnectFeConfig());
    }

    public Long getAutoLiveStateIntervalMills() {
        if (this.hook == null) {
            return this.rawValue.getAutoLiveStateIntervalMills();
        }
        return (Long) getProxyValue(this.hook, "auto_live_state_interval_mills", Long.class, (T) this.rawValue.getAutoLiveStateIntervalMills());
    }

    public List<String> getAwemeAppinfoSafehostFields() {
        if (this.hook == null) {
            return this.rawValue.getAwemeAppinfoSafehostFields();
        }
        return getProxyValue(this.hook, "aweme_appinfo_safehost_fields", String.class, this.rawValue.getAwemeAppinfoSafehostFields());
    }

    public List<String> getAwemeDataPrefetchWhiteList() {
        if (this.hook == null) {
            return this.rawValue.getAwemeDataPrefetchWhiteList();
        }
        return getProxyValue(this.hook, "aweme_data_prefetch_white_list", String.class, this.rawValue.getAwemeDataPrefetchWhiteList());
    }

    public List<String> getAwemeHighRiskAreaCode() {
        if (this.hook == null) {
            return this.rawValue.getAwemeHighRiskAreaCode();
        }
        return getProxyValue(this.hook, "aweme_high_risk_area_code", String.class, this.rawValue.getAwemeHighRiskAreaCode());
    }

    public Boolean getAwesomeSplashForceUseH264() {
        if (this.hook == null) {
            return this.rawValue.getAwesomeSplashForceUseH264();
        }
        return (Boolean) getProxyValue(this.hook, "awesome_splash_force_use_h264", Boolean.class, (T) this.rawValue.getAwesomeSplashForceUseH264());
    }

    public Boolean getAwewebviewAppendCommonParamsEnabled() {
        if (this.hook == null) {
            return this.rawValue.getAwewebviewAppendCommonParamsEnabled();
        }
        return (Boolean) getProxyValue(this.hook, "awewebview_append_common_params_enabled", Boolean.class, (T) this.rawValue.getAwewebviewAppendCommonParamsEnabled());
    }

    public Integer getBackgroundPausePlayerSetting() {
        if (this.hook == null) {
            return this.rawValue.getBackgroundPausePlayerSetting();
        }
        return (Integer) getProxyValue(this.hook, "background_pause_player_setting", Integer.class, (T) this.rawValue.getBackgroundPausePlayerSetting());
    }

    public Boolean getBenchmarkPoorPerfDevice() {
        if (this.hook == null) {
            return this.rawValue.getBenchmarkPoorPerfDevice();
        }
        return (Boolean) getProxyValue(this.hook, "benchmark_poor_perf_device", Boolean.class, (T) this.rawValue.getBenchmarkPoorPerfDevice());
    }

    public String getBusinessEshopManager() {
        if (this.hook == null) {
            return this.rawValue.getBusinessEshopManager();
        }
        return (String) getProxyValue(this.hook, "business_eshop_manager", String.class, (T) this.rawValue.getBusinessEshopManager());
    }

    public List<String> getCacheCleanDefaultWhiteList() {
        if (this.hook == null) {
            return this.rawValue.getCacheCleanDefaultWhiteList();
        }
        return getProxyValue(this.hook, "cache_clean_default_white_list", String.class, this.rawValue.getCacheCleanDefaultWhiteList());
    }

    public Boolean getCanDumpHporf() {
        if (this.hook == null) {
            return this.rawValue.getCanDumpHporf();
        }
        return (Boolean) getProxyValue(this.hook, "can_dump_hporf", Boolean.class, (T) this.rawValue.getCanDumpHporf());
    }

    public Integer getCategoryVersion() {
        if (this.hook == null) {
            return this.rawValue.getCategoryVersion();
        }
        return (Integer) getProxyValue(this.hook, "category_version", Integer.class, (T) this.rawValue.getCategoryVersion());
    }

    public Integer getChangeCoverDialogUseStyleSetting() {
        if (this.hook == null) {
            return this.rawValue.getChangeCoverDialogUseStyleSetting();
        }
        return (Integer) getProxyValue(this.hook, "change_cover_dialog_use_style_setting", Integer.class, (T) this.rawValue.getChangeCoverDialogUseStyleSetting());
    }

    public Integer getChangeNetworkClient() {
        if (this.hook == null) {
            return this.rawValue.getChangeNetworkClient();
        }
        return (Integer) getProxyValue(this.hook, "change_network_client", Integer.class, (T) this.rawValue.getChangeNetworkClient());
    }

    public List<OriginChannelTab> getChannelTabs() {
        if (this.hook == null) {
            return this.rawValue.getChannelTabs();
        }
        return getProxyValue(this.hook, "channel_tabs", OriginChannelTab.class, this.rawValue.getChannelTabs());
    }

    public Long getChatVideoHotTime() {
        if (this.hook == null) {
            return this.rawValue.getChatVideoHotTime();
        }
        return (Long) getProxyValue(this.hook, "chat_video_hot_time", Long.class, (T) this.rawValue.getChatVideoHotTime());
    }

    public Integer getCheckLarkInhouseNet() {
        if (this.hook == null) {
            return this.rawValue.getCheckLarkInhouseNet();
        }
        return (Integer) getProxyValue(this.hook, "check_lark_inhouse_net", Integer.class, (T) this.rawValue.getCheckLarkInhouseNet());
    }

    public Integer getCheckScrollStateOnMainTopTabClick() {
        if (this.hook == null) {
            return this.rawValue.getCheckScrollStateOnMainTopTabClick();
        }
        return (Integer) getProxyValue(this.hook, "check_scroll_state_on_main_top_tab_click", Integer.class, (T) this.rawValue.getCheckScrollStateOnMainTopTabClick());
    }

    public Integer getCloseLoginAgreement() {
        if (this.hook == null) {
            return this.rawValue.getCloseLoginAgreement();
        }
        return (Integer) getProxyValue(this.hook, "close_login_agreement", Integer.class, (T) this.rawValue.getCloseLoginAgreement());
    }

    public Integer getCloseSyncToHeloEntry() {
        if (this.hook == null) {
            return this.rawValue.getCloseSyncToHeloEntry();
        }
        return (Integer) getProxyValue(this.hook, "close_sync_to_helo_entry", Integer.class, (T) this.rawValue.getCloseSyncToHeloEntry());
    }

    public Integer getCommonSearchLoadMoreRemains() {
        if (this.hook == null) {
            return this.rawValue.getCommonSearchLoadMoreRemains();
        }
        return (Integer) getProxyValue(this.hook, "common_search_load_more_remains", Integer.class, (T) this.rawValue.getCommonSearchLoadMoreRemains());
    }

    public Integer getContentLangLimit() {
        if (this.hook == null) {
            return this.rawValue.getContentLangLimit();
        }
        return (Integer) getProxyValue(this.hook, "content_lang_limit", Integer.class, (T) this.rawValue.getContentLangLimit());
    }

    public List<ContentLanguageGuideSetting> getContentLanguageGuideCodes() {
        if (this.hook == null) {
            return this.rawValue.getContentLanguageGuideCodes();
        }
        return getProxyValue(this.hook, "content_language_guide_codes", ContentLanguageGuideSetting.class, this.rawValue.getContentLanguageGuideCodes());
    }

    public String getCouponVerificationList() {
        if (this.hook == null) {
            return this.rawValue.getCouponVerificationList();
        }
        return (String) getProxyValue(this.hook, "coupon_verification_list", String.class, (T) this.rawValue.getCouponVerificationList());
    }

    public Boolean getDebugReplaceHttpToHttps() {
        if (this.hook == null) {
            return this.rawValue.getDebugReplaceHttpToHttps();
        }
        return (Boolean) getProxyValue(this.hook, "debug_replace_http_to_https", Boolean.class, (T) this.rawValue.getDebugReplaceHttpToHttps());
    }

    public Boolean getDisableOnlineSmallEmoji() {
        if (this.hook == null) {
            return this.rawValue.getDisableOnlineSmallEmoji();
        }
        return (Boolean) getProxyValue(this.hook, "disable_online_small_emoji", Boolean.class, (T) this.rawValue.getDisableOnlineSmallEmoji());
    }

    public Boolean getDisableQiVideoShare() {
        if (this.hook == null) {
            return this.rawValue.getDisableQiVideoShare();
        }
        return (Boolean) getProxyValue(this.hook, "disable_qi_video_share", Boolean.class, (T) this.rawValue.getDisableQiVideoShare());
    }

    public Boolean getDisableVastBitrate() {
        if (this.hook == null) {
            return this.rawValue.getDisableVastBitrate();
        }
        return (Boolean) getProxyValue(this.hook, "disable_vast_bitrate", Boolean.class, (T) this.rawValue.getDisableVastBitrate());
    }

    public Boolean getDisallowVastHasAuthor() {
        if (this.hook == null) {
            return this.rawValue.getDisallowVastHasAuthor();
        }
        return (Boolean) getProxyValue(this.hook, "disallow_vast_has_author", Boolean.class, (T) this.rawValue.getDisallowVastHasAuthor());
    }

    public List<com_ss_android_ugc_aweme_settings_DislikeReason> getDislikeReasons() {
        if (this.hook == null) {
            return this.rawValue.getDislikeReasons();
        }
        return getProxyValue(this.hook, "dislike_reasons", com_ss_android_ugc_aweme_settings_DislikeReason.class, this.rawValue.getDislikeReasons());
    }

    public Long getDisplayStrongTipsInterval() {
        if (this.hook == null) {
            return this.rawValue.getDisplayStrongTipsInterval();
        }
        return (Long) getProxyValue(this.hook, "display_strong_tips_interval", Long.class, (T) this.rawValue.getDisplayStrongTipsInterval());
    }

    public Long getDmtFixFullVideoBlackIssue() {
        if (this.hook == null) {
            return this.rawValue.getDmtFixFullVideoBlackIssue();
        }
        return (Long) getProxyValue(this.hook, "dmt_fix_full_video_black_issue", Long.class, (T) this.rawValue.getDmtFixFullVideoBlackIssue());
    }

    public Integer getDmtFixFullVideoBlackIssueParentCount() {
        if (this.hook == null) {
            return this.rawValue.getDmtFixFullVideoBlackIssueParentCount();
        }
        return (Integer) getProxyValue(this.hook, "dmt_fix_full_video_black_issue_parent_count", Integer.class, (T) this.rawValue.getDmtFixFullVideoBlackIssueParentCount());
    }

    public Boolean getDmtFixFullVideoBlackIssueParentReport() {
        if (this.hook == null) {
            return this.rawValue.getDmtFixFullVideoBlackIssueParentReport();
        }
        return (Boolean) getProxyValue(this.hook, "dmt_fix_full_video_black_issue_parent_report", Boolean.class, (T) this.rawValue.getDmtFixFullVideoBlackIssueParentReport());
    }

    public List<String> getDmtSourceUrlWhitelist() {
        if (this.hook == null) {
            return this.rawValue.getDmtSourceUrlWhitelist();
        }
        return getProxyValue(this.hook, "dmt_source_url_whitelist", String.class, this.rawValue.getDmtSourceUrlWhitelist());
    }

    public String getDoulabUseInformationUrl() {
        if (this.hook == null) {
            return this.rawValue.getDoulabUseInformationUrl();
        }
        return (String) getProxyValue(this.hook, "doulab_use_information_url", String.class, (T) this.rawValue.getDoulabUseInformationUrl());
    }

    public Integer getDouplusBulletEntry() {
        if (this.hook == null) {
            return this.rawValue.getDouplusBulletEntry();
        }
        return (Integer) getProxyValue(this.hook, "douplus_bullet_entry", Integer.class, (T) this.rawValue.getDouplusBulletEntry());
    }

    public Integer getDouplusEntryFeed() {
        if (this.hook == null) {
            return this.rawValue.getDouplusEntryFeed();
        }
        return (Integer) getProxyValue(this.hook, "douplus_entry_feed", Integer.class, (T) this.rawValue.getDouplusEntryFeed());
    }

    public List<DouplusTextStruct> getDouplusEntryTitle() {
        if (this.hook == null) {
            return this.rawValue.getDouplusEntryTitle();
        }
        return getProxyValue(this.hook, "douplus_entry_title", DouplusTextStruct.class, this.rawValue.getDouplusEntryTitle());
    }

    public Boolean getDraftUseMultiVideoEdit() {
        if (this.hook == null) {
            return this.rawValue.getDraftUseMultiVideoEdit();
        }
        return (Boolean) getProxyValue(this.hook, "draft_use_multi_video_edit", Boolean.class, (T) this.rawValue.getDraftUseMultiVideoEdit());
    }

    public Boolean getDynamicFeatureFakeInstall() {
        if (this.hook == null) {
            return this.rawValue.getDynamicFeatureFakeInstall();
        }
        return (Boolean) getProxyValue(this.hook, "dynamic_feature_fake_install", Boolean.class, (T) this.rawValue.getDynamicFeatureFakeInstall());
    }

    public Integer getEditEffectAutoDownloadSize() {
        if (this.hook == null) {
            return this.rawValue.getEditEffectAutoDownloadSize();
        }
        return (Integer) getProxyValue(this.hook, "edit_effect_auto_download_size", Integer.class, (T) this.rawValue.getEditEffectAutoDownloadSize());
    }

    public Boolean getEnable4kImportBenchmark() {
        if (this.hook == null) {
            return this.rawValue.getEnable4kImportBenchmark();
        }
        return (Boolean) getProxyValue(this.hook, "enable_4k_import_benchmark", Boolean.class, (T) this.rawValue.getEnable4kImportBenchmark());
    }

    public Boolean getEnableAdPlayfunMonitorLog() {
        if (this.hook == null) {
            return this.rawValue.getEnableAdPlayfunMonitorLog();
        }
        return (Boolean) getProxyValue(this.hook, "enable_ad_playfun_monitor_log", Boolean.class, (T) this.rawValue.getEnableAdPlayfunMonitorLog());
    }

    public Boolean getEnableAdRouter() {
        if (this.hook == null) {
            return this.rawValue.getEnableAdRouter();
        }
        return (Boolean) getProxyValue(this.hook, "enable_ad_router", Boolean.class, (T) this.rawValue.getEnableAdRouter());
    }

    public Boolean getEnableAnchorCache() {
        if (this.hook == null) {
            return this.rawValue.getEnableAnchorCache();
        }
        return (Boolean) getProxyValue(this.hook, "enable_anchor_cache", Boolean.class, (T) this.rawValue.getEnableAnchorCache());
    }

    public Boolean getEnableAutoLiveState() {
        if (this.hook == null) {
            return this.rawValue.getEnableAutoLiveState();
        }
        return (Boolean) getProxyValue(this.hook, "enable_auto_live_state", Boolean.class, (T) this.rawValue.getEnableAutoLiveState());
    }

    public Boolean getEnableAvStorageMonitor() {
        if (this.hook == null) {
            return this.rawValue.getEnableAvStorageMonitor();
        }
        return (Boolean) getProxyValue(this.hook, "enable_av_storage_monitor", Boolean.class, (T) this.rawValue.getEnableAvStorageMonitor());
    }

    public Boolean getEnableCameraBeautifyEffect() {
        if (this.hook == null) {
            return this.rawValue.getEnableCameraBeautifyEffect();
        }
        return (Boolean) getProxyValue(this.hook, "enable_camera_beautify_effect", Boolean.class, (T) this.rawValue.getEnableCameraBeautifyEffect());
    }

    public Boolean getEnableCommentCreateSticker() {
        if (this.hook == null) {
            return this.rawValue.getEnableCommentCreateSticker();
        }
        return (Boolean) getProxyValue(this.hook, "enable_comment_create_sticker", Boolean.class, (T) this.rawValue.getEnableCommentCreateSticker());
    }

    public Boolean getEnableCommentOffensiveFilterSwitch() {
        if (this.hook == null) {
            return this.rawValue.getEnableCommentOffensiveFilterSwitch();
        }
        return (Boolean) getProxyValue(this.hook, "enable_comment_offensive_filter_switch", Boolean.class, (T) this.rawValue.getEnableCommentOffensiveFilterSwitch());
    }

    public Boolean getEnableCommerceEggMonitorLog() {
        if (this.hook == null) {
            return this.rawValue.getEnableCommerceEggMonitorLog();
        }
        return (Boolean) getProxyValue(this.hook, "enable_commerce_egg_monitor_log", Boolean.class, (T) this.rawValue.getEnableCommerceEggMonitorLog());
    }

    public Integer getEnableCoverEffect() {
        if (this.hook == null) {
            return this.rawValue.getEnableCoverEffect();
        }
        return (Integer) getProxyValue(this.hook, "enable_cover_effect", Integer.class, (T) this.rawValue.getEnableCoverEffect());
    }

    public Boolean getEnableDisplayFavoriteMiniapp() {
        if (this.hook == null) {
            return this.rawValue.getEnableDisplayFavoriteMiniapp();
        }
        return (Boolean) getProxyValue(this.hook, "enable_display_favorite_miniapp", Boolean.class, (T) this.rawValue.getEnableDisplayFavoriteMiniapp());
    }

    public Boolean getEnableDisplayFavoriteMinigame() {
        if (this.hook == null) {
            return this.rawValue.getEnableDisplayFavoriteMinigame();
        }
        return (Boolean) getProxyValue(this.hook, "enable_display_favorite_minigame", Boolean.class, (T) this.rawValue.getEnableDisplayFavoriteMinigame());
    }

    public Boolean getEnableDouPlusFullProcess() {
        if (this.hook == null) {
            return this.rawValue.getEnableDouPlusFullProcess();
        }
        return (Boolean) getProxyValue(this.hook, "enable_dou_plus_full_process", Boolean.class, (T) this.rawValue.getEnableDouPlusFullProcess());
    }

    public Boolean getEnableEggAndPendentComponentize() {
        if (this.hook == null) {
            return this.rawValue.getEnableEggAndPendentComponentize();
        }
        return (Boolean) getProxyValue(this.hook, "enable_egg_and_pendent_componentize", Boolean.class, (T) this.rawValue.getEnableEggAndPendentComponentize());
    }

    public Integer getEnableEmailVerification() {
        if (this.hook == null) {
            return this.rawValue.getEnableEmailVerification();
        }
        return (Integer) getProxyValue(this.hook, "enable_email_verification", Integer.class, (T) this.rawValue.getEnableEmailVerification());
    }

    public Boolean getEnableEnterLiveRoomStreamOpt() {
        if (this.hook == null) {
            return this.rawValue.getEnableEnterLiveRoomStreamOpt();
        }
        return (Boolean) getProxyValue(this.hook, "enable_enter_live_room_stream_opt", Boolean.class, (T) this.rawValue.getEnableEnterLiveRoomStreamOpt());
    }

    public Boolean getEnableEnterLiveRoomStreamOptFromFollowSky() {
        if (this.hook == null) {
            return this.rawValue.getEnableEnterLiveRoomStreamOptFromFollowSky();
        }
        return (Boolean) getProxyValue(this.hook, "enable_enter_live_room_stream_opt_from_follow_sky", Boolean.class, (T) this.rawValue.getEnableEnterLiveRoomStreamOptFromFollowSky());
    }

    public Integer getEnableFeedAdBreakDurationOptimize() {
        if (this.hook == null) {
            return this.rawValue.getEnableFeedAdBreakDurationOptimize();
        }
        return (Integer) getProxyValue(this.hook, "enable_feed_ad_break_duration_optimize", Integer.class, (T) this.rawValue.getEnableFeedAdBreakDurationOptimize());
    }

    public Boolean getEnableFeedLiveRefresh() {
        if (this.hook == null) {
            return this.rawValue.getEnableFeedLiveRefresh();
        }
        return (Boolean) getProxyValue(this.hook, "enable_feed_live_refresh", Boolean.class, (T) this.rawValue.getEnableFeedLiveRefresh());
    }

    public Boolean getEnableGroupMemberByFollowers() {
        if (this.hook == null) {
            return this.rawValue.getEnableGroupMemberByFollowers();
        }
        return (Boolean) getProxyValue(this.hook, "enable_group_member_by_followers", Boolean.class, (T) this.rawValue.getEnableGroupMemberByFollowers());
    }

    public Boolean getEnableH264HwDecoder() {
        if (this.hook == null) {
            return this.rawValue.getEnableH264HwDecoder();
        }
        return (Boolean) getProxyValue(this.hook, "enable_h264_hw_decoder", Boolean.class, (T) this.rawValue.getEnableH264HwDecoder());
    }

    public Boolean getEnableHighRiskRebindAlert() {
        if (this.hook == null) {
            return this.rawValue.getEnableHighRiskRebindAlert();
        }
        return (Boolean) getProxyValue(this.hook, "enable_high_risk_rebind_alert", Boolean.class, (T) this.rawValue.getEnableHighRiskRebindAlert());
    }

    public Boolean getEnableImSdkLog() {
        if (this.hook == null) {
            return this.rawValue.getEnableImSdkLog();
        }
        return (Boolean) getProxyValue(this.hook, "enable_im_sdk_log", Boolean.class, (T) this.rawValue.getEnableImSdkLog());
    }

    public Boolean getEnableLiveDrawerDialog() {
        if (this.hook == null) {
            return this.rawValue.getEnableLiveDrawerDialog();
        }
        return (Boolean) getProxyValue(this.hook, "enable_live_drawer_dialog", Boolean.class, (T) this.rawValue.getEnableLiveDrawerDialog());
    }

    public Boolean getEnableLiveSplash() {
        if (this.hook == null) {
            return this.rawValue.getEnableLiveSplash();
        }
        return (Boolean) getProxyValue(this.hook, "enable_live_splash", Boolean.class, (T) this.rawValue.getEnableLiveSplash());
    }

    public Boolean getEnableMainThreadPublishScheduler() {
        if (this.hook == null) {
            return this.rawValue.getEnableMainThreadPublishScheduler();
        }
        return (Boolean) getProxyValue(this.hook, "enable_main_thread_publish_scheduler", Boolean.class, (T) this.rawValue.getEnableMainThreadPublishScheduler());
    }

    public Boolean getEnableMojiUpdateResources() {
        if (this.hook == null) {
            return this.rawValue.getEnableMojiUpdateResources();
        }
        return (Boolean) getProxyValue(this.hook, "enable_moji_update_resources", Boolean.class, (T) this.rawValue.getEnableMojiUpdateResources());
    }

    public Boolean getEnableMvResCheck() {
        if (this.hook == null) {
            return this.rawValue.getEnableMvResCheck();
        }
        return (Boolean) getProxyValue(this.hook, "enable_mv_res_check", Boolean.class, (T) this.rawValue.getEnableMvResCheck());
    }

    public Boolean getEnableNewPhoneBindFlow() {
        if (this.hook == null) {
            return this.rawValue.getEnableNewPhoneBindFlow();
        }
        return (Boolean) getProxyValue(this.hook, "enable_new_phone_bind_flow", Boolean.class, (T) this.rawValue.getEnableNewPhoneBindFlow());
    }

    public Boolean getEnableNewUserInfoSync() {
        if (this.hook == null) {
            return this.rawValue.getEnableNewUserInfoSync();
        }
        return (Boolean) getProxyValue(this.hook, "enable_new_user_info_sync", Boolean.class, (T) this.rawValue.getEnableNewUserInfoSync());
    }

    public Boolean getEnableNormalSplashAd() {
        if (this.hook == null) {
            return this.rawValue.getEnableNormalSplashAd();
        }
        return (Boolean) getProxyValue(this.hook, "enable_normal_splash_ad", Boolean.class, (T) this.rawValue.getEnableNormalSplashAd());
    }

    public Boolean getEnableOuterTest() {
        if (this.hook == null) {
            return this.rawValue.getEnableOuterTest();
        }
        return (Boolean) getProxyValue(this.hook, "enable_outer_test", Boolean.class, (T) this.rawValue.getEnableOuterTest());
    }

    public Boolean getEnableParamsOverrideDeeplinkhandleractivity() {
        if (this.hook == null) {
            return this.rawValue.getEnableParamsOverrideDeeplinkhandleractivity();
        }
        return (Boolean) getProxyValue(this.hook, "enable_params_override_deeplinkhandleractivity", Boolean.class, (T) this.rawValue.getEnableParamsOverrideDeeplinkhandleractivity());
    }

    public Boolean getEnablePrePublishWhenMemoryGetFailed() {
        if (this.hook == null) {
            return this.rawValue.getEnablePrePublishWhenMemoryGetFailed();
        }
        return (Boolean) getProxyValue(this.hook, "enable_pre_publish_when_memory_get_failed", Boolean.class, (T) this.rawValue.getEnablePrePublishWhenMemoryGetFailed());
    }

    public Boolean getEnablePreloadComponent() {
        if (this.hook == null) {
            return this.rawValue.getEnablePreloadComponent();
        }
        return (Boolean) getProxyValue(this.hook, "enable_preload_component", Boolean.class, (T) this.rawValue.getEnablePreloadComponent());
    }

    public Boolean getEnablePreloadOpt() {
        if (this.hook == null) {
            return this.rawValue.getEnablePreloadOpt();
        }
        return (Boolean) getProxyValue(this.hook, "enable_preload_opt", Boolean.class, (T) this.rawValue.getEnablePreloadOpt());
    }

    public Boolean getEnablePushAllianceSdk() {
        if (this.hook == null) {
            return this.rawValue.getEnablePushAllianceSdk();
        }
        return (Boolean) getProxyValue(this.hook, "enable_push_alliance_sdk", Boolean.class, (T) this.rawValue.getEnablePushAllianceSdk());
    }

    public Boolean getEnableReportSoundOutputDevice() {
        if (this.hook == null) {
            return this.rawValue.getEnableReportSoundOutputDevice();
        }
        return (Boolean) getProxyValue(this.hook, "enable_report_sound_output_device", Boolean.class, (T) this.rawValue.getEnableReportSoundOutputDevice());
    }

    public Boolean getEnableSafeViewChecker() {
        if (this.hook == null) {
            return this.rawValue.getEnableSafeViewChecker();
        }
        return (Boolean) getProxyValue(this.hook, "enable_safe_view_checker", Boolean.class, (T) this.rawValue.getEnableSafeViewChecker());
    }

    public Boolean getEnableSendV3Applog() {
        if (this.hook == null) {
            return this.rawValue.getEnableSendV3Applog();
        }
        return (Boolean) getProxyValue(this.hook, "enable_send_v3_applog", Boolean.class, (T) this.rawValue.getEnableSendV3Applog());
    }

    public Boolean getEnableSplashLaunchFix() {
        if (this.hook == null) {
            return this.rawValue.getEnableSplashLaunchFix();
        }
        return (Boolean) getProxyValue(this.hook, "enable_splash_launch_fix", Boolean.class, (T) this.rawValue.getEnableSplashLaunchFix());
    }

    public Boolean getEnableSplashValidTimeCheck() {
        if (this.hook == null) {
            return this.rawValue.getEnableSplashValidTimeCheck();
        }
        return (Boolean) getProxyValue(this.hook, "enable_splash_valid_time_check", Boolean.class, (T) this.rawValue.getEnableSplashValidTimeCheck());
    }

    public Boolean getEnableTImChatEveryone() {
        if (this.hook == null) {
            return this.rawValue.getEnableTImChatEveryone();
        }
        return (Boolean) getProxyValue(this.hook, "enable_t_im_chat_everyone", Boolean.class, (T) this.rawValue.getEnableTImChatEveryone());
    }

    public Boolean getEnableUploadHporf() {
        if (this.hook == null) {
            return this.rawValue.getEnableUploadHporf();
        }
        return (Boolean) getProxyValue(this.hook, "enable_upload_hporf", Boolean.class, (T) this.rawValue.getEnableUploadHporf());
    }

    public Boolean getEnableUseGameRotationSensor() {
        if (this.hook == null) {
            return this.rawValue.getEnableUseGameRotationSensor();
        }
        return (Boolean) getProxyValue(this.hook, "enable_use_game_rotation_sensor", Boolean.class, (T) this.rawValue.getEnableUseGameRotationSensor());
    }

    public Integer getEnableVideoReply() {
        if (this.hook == null) {
            return this.rawValue.getEnableVideoReply();
        }
        return (Integer) getProxyValue(this.hook, "enable_video_reply", Integer.class, (T) this.rawValue.getEnableVideoReply());
    }

    public Integer getEnableYoutubeAppAuth() {
        if (this.hook == null) {
            return this.rawValue.getEnableYoutubeAppAuth();
        }
        return (Integer) getProxyValue(this.hook, "enable_youtube_app_auth", Integer.class, (T) this.rawValue.getEnableYoutubeAppAuth());
    }

    public Integer getEnabledImAsupporterFuncs() {
        if (this.hook == null) {
            return this.rawValue.getEnabledImAsupporterFuncs();
        }
        return (Integer) getProxyValue(this.hook, "enabled_im_asupporter_funcs", Integer.class, (T) this.rawValue.getEnabledImAsupporterFuncs());
    }

    public Integer getEnabledImAsupporterMsgTypes() {
        if (this.hook == null) {
            return this.rawValue.getEnabledImAsupporterMsgTypes();
        }
        return (Integer) getProxyValue(this.hook, "enabled_im_asupporter_msg_types", Integer.class, (T) this.rawValue.getEnabledImAsupporterMsgTypes());
    }

    public Integer getF2NoticeType() {
        if (this.hook == null) {
            return this.rawValue.getF2NoticeType();
        }
        return (Integer) getProxyValue(this.hook, "f2_notice_type", Integer.class, (T) this.rawValue.getF2NoticeType());
    }

    public Integer getFamiliarAwemeStatsType() {
        if (this.hook == null) {
            return this.rawValue.getFamiliarAwemeStatsType();
        }
        return (Integer) getProxyValue(this.hook, "familiar_aweme_stats_type", Integer.class, (T) this.rawValue.getFamiliarAwemeStatsType());
    }

    public Boolean getFastImport1080pHigherBenchmarkEnable() {
        if (this.hook == null) {
            return this.rawValue.getFastImport1080pHigherBenchmarkEnable();
        }
        return (Boolean) getProxyValue(this.hook, "fast_import_1080p_higher_benchmark_enable", Boolean.class, (T) this.rawValue.getFastImport1080pHigherBenchmarkEnable());
    }

    public Integer getFastImport1080pHigherFpsLimited() {
        if (this.hook == null) {
            return this.rawValue.getFastImport1080pHigherFpsLimited();
        }
        return (Integer) getProxyValue(this.hook, "fast_import_1080p_higher_fps_limited", Integer.class, (T) this.rawValue.getFastImport1080pHigherFpsLimited());
    }

    public Boolean getFastImport1080pLowerBenchmarkEnable() {
        if (this.hook == null) {
            return this.rawValue.getFastImport1080pLowerBenchmarkEnable();
        }
        return (Boolean) getProxyValue(this.hook, "fast_import_1080p_lower_benchmark_enable", Boolean.class, (T) this.rawValue.getFastImport1080pLowerBenchmarkEnable());
    }

    public Boolean getFastImport720pHigherBenchmarkEnable() {
        if (this.hook == null) {
            return this.rawValue.getFastImport720pHigherBenchmarkEnable();
        }
        return (Boolean) getProxyValue(this.hook, "fast_import_720p_higher_benchmark_enable", Boolean.class, (T) this.rawValue.getFastImport720pHigherBenchmarkEnable());
    }

    public Integer getFastImport720pHigherFpsLimited() {
        if (this.hook == null) {
            return this.rawValue.getFastImport720pHigherFpsLimited();
        }
        return (Integer) getProxyValue(this.hook, "fast_import_720p_higher_fps_limited", Integer.class, (T) this.rawValue.getFastImport720pHigherFpsLimited());
    }

    public Boolean getFbDdlSwitch() {
        if (this.hook == null) {
            return this.rawValue.getFbDdlSwitch();
        }
        return (Boolean) getProxyValue(this.hook, "fb_ddl_switch", Boolean.class, (T) this.rawValue.getFbDdlSwitch());
    }

    public Integer getFeedFindBugSetting() {
        if (this.hook == null) {
            return this.rawValue.getFeedFindBugSetting();
        }
        return (Integer) getProxyValue(this.hook, "feed_find_bug_setting", Integer.class, (T) this.rawValue.getFeedFindBugSetting());
    }

    public Boolean getFeedHandleGenericMotion() {
        if (this.hook == null) {
            return this.rawValue.getFeedHandleGenericMotion();
        }
        return (Boolean) getProxyValue(this.hook, "feed_handle_generic_motion", Boolean.class, (T) this.rawValue.getFeedHandleGenericMotion());
    }

    public Integer getFeedOptimizeEnableSetting() {
        if (this.hook == null) {
            return this.rawValue.getFeedOptimizeEnableSetting();
        }
        return (Integer) getProxyValue(this.hook, "feed_optimize_enable_setting", Integer.class, (T) this.rawValue.getFeedOptimizeEnableSetting());
    }

    public Integer getFeedVideoViewResizeStrategy() {
        if (this.hook == null) {
            return this.rawValue.getFeedVideoViewResizeStrategy();
        }
        return (Integer) getProxyValue(this.hook, "feed_video_view_resize_strategy", Integer.class, (T) this.rawValue.getFeedVideoViewResizeStrategy());
    }

    public Boolean getFeedbackRecordEnable() {
        if (this.hook == null) {
            return this.rawValue.getFeedbackRecordEnable();
        }
        return (Boolean) getProxyValue(this.hook, "feedback_record_enable", Boolean.class, (T) this.rawValue.getFeedbackRecordEnable());
    }

    public List<String> getFilterColors() {
        if (this.hook == null) {
            return this.rawValue.getFilterColors();
        }
        return getProxyValue(this.hook, "filter_colors", String.class, this.rawValue.getFilterColors());
    }

    public Integer getFirstInstallTime() {
        if (this.hook == null) {
            return this.rawValue.getFirstInstallTime();
        }
        return (Integer) getProxyValue(this.hook, "first_install_time", Integer.class, (T) this.rawValue.getFirstInstallTime());
    }

    public Integer getFixDislikeEventSetting() {
        if (this.hook == null) {
            return this.rawValue.getFixDislikeEventSetting();
        }
        return (Integer) getProxyValue(this.hook, "fix_dislike_event_setting", Integer.class, (T) this.rawValue.getFixDislikeEventSetting());
    }

    public Boolean getFollowingFollowerPermissionSwitch() {
        if (this.hook == null) {
            return this.rawValue.getFollowingFollowerPermissionSwitch();
        }
        return (Boolean) getProxyValue(this.hook, "following_follower_permission_switch", Boolean.class, (T) this.rawValue.getFollowingFollowerPermissionSwitch());
    }

    public Boolean getForbidVoiceChangeOnEditPage() {
        if (this.hook == null) {
            return this.rawValue.getForbidVoiceChangeOnEditPage();
        }
        return (Boolean) getProxyValue(this.hook, "forbid_voice_change_on_edit_page", Boolean.class, (T) this.rawValue.getForbidVoiceChangeOnEditPage());
    }

    public Long getGeckoNormalRequestTime() {
        if (this.hook == null) {
            return this.rawValue.getGeckoNormalRequestTime();
        }
        return (Long) getProxyValue(this.hook, "gecko_normal_request_time", Long.class, (T) this.rawValue.getGeckoNormalRequestTime());
    }

    public Integer getGeneralSearchLoadMoreRemains() {
        if (this.hook == null) {
            return this.rawValue.getGeneralSearchLoadMoreRemains();
        }
        return (Integer) getProxyValue(this.hook, "general_search_load_more_remains", Integer.class, (T) this.rawValue.getGeneralSearchLoadMoreRemains());
    }

    public Integer getGeneralSearchRefreshCount() {
        if (this.hook == null) {
            return this.rawValue.getGeneralSearchRefreshCount();
        }
        return (Integer) getProxyValue(this.hook, "general_search_refresh_count", Integer.class, (T) this.rawValue.getGeneralSearchRefreshCount());
    }

    public Boolean getGoogleMultiLogin() {
        if (this.hook == null) {
            return this.rawValue.getGoogleMultiLogin();
        }
        return (Boolean) getProxyValue(this.hook, "google_multi_login", Boolean.class, (T) this.rawValue.getGoogleMultiLogin());
    }

    public Boolean getGroupNewMemberCanPullOldMsg() {
        if (this.hook == null) {
            return this.rawValue.getGroupNewMemberCanPullOldMsg();
        }
        return (Boolean) getProxyValue(this.hook, "group_new_member_can_pull_old_msg", Boolean.class, (T) this.rawValue.getGroupNewMemberCanPullOldMsg());
    }

    public Integer getGuideSearchItemLen() {
        if (this.hook == null) {
            return this.rawValue.getGuideSearchItemLen();
        }
        return (Integer) getProxyValue(this.hook, "guide_search_item_len", Integer.class, (T) this.rawValue.getGuideSearchItemLen());
    }

    public String getHeartbeatDefaultUrl() {
        if (this.hook == null) {
            return this.rawValue.getHeartbeatDefaultUrl();
        }
        return (String) getProxyValue(this.hook, "heartbeat_default_url", String.class, (T) this.rawValue.getHeartbeatDefaultUrl());
    }

    public Integer getHotspotGuideTime() {
        if (this.hook == null) {
            return this.rawValue.getHotspotGuideTime();
        }
        return (Integer) getProxyValue(this.hook, "hotspot_guide_time", Integer.class, (T) this.rawValue.getHotspotGuideTime());
    }

    public List<String> getHybridGetAbTest() {
        if (this.hook == null) {
            return this.rawValue.getHybridGetAbTest();
        }
        return getProxyValue(this.hook, "hybrid_get_ab_test", String.class, this.rawValue.getHybridGetAbTest());
    }

    public AssociativeEmoticonAll getImAssociativeEmoticonAll() {
        if (this.hook == null) {
            return this.rawValue.getImAssociativeEmoticonAll();
        }
        return (AssociativeEmoticonAll) getProxyValue(this.hook, "im_associative_emoticon_all", AssociativeEmoticonAll.class, (T) this.rawValue.getImAssociativeEmoticonAll());
    }

    public Boolean getImEnableChatCall() {
        if (this.hook == null) {
            return this.rawValue.getImEnableChatCall();
        }
        return (Boolean) getProxyValue(this.hook, "im_enable_chat_call", Boolean.class, (T) this.rawValue.getImEnableChatCall());
    }

    public String getImGroupPasswordRegex() {
        if (this.hook == null) {
            return this.rawValue.getImGroupPasswordRegex();
        }
        return (String) getProxyValue(this.hook, "im_group_password_regex", String.class, (T) this.rawValue.getImGroupPasswordRegex());
    }

    public List<String> getImImageDomains() {
        if (this.hook == null) {
            return this.rawValue.getImImageDomains();
        }
        return getProxyValue(this.hook, "im_image_domains", String.class, this.rawValue.getImImageDomains());
    }

    public Boolean getImMtNewInputBoardEnableGiphy() {
        if (this.hook == null) {
            return this.rawValue.getImMtNewInputBoardEnableGiphy();
        }
        return (Boolean) getProxyValue(this.hook, "im_mt_new_input_board_enable_giphy", Boolean.class, (T) this.rawValue.getImMtNewInputBoardEnableGiphy());
    }

    public Boolean getImSdkRequestHeaderDisableCache() {
        if (this.hook == null) {
            return this.rawValue.getImSdkRequestHeaderDisableCache();
        }
        return (Boolean) getProxyValue(this.hook, "im_sdk_request_header_disable_cache", Boolean.class, (T) this.rawValue.getImSdkRequestHeaderDisableCache());
    }

    public Integer getInappUpdateSwitchStrategy() {
        if (this.hook == null) {
            return this.rawValue.getInappUpdateSwitchStrategy();
        }
        return (Integer) getProxyValue(this.hook, "inapp_update_switch_strategy", Integer.class, (T) this.rawValue.getInappUpdateSwitchStrategy());
    }

    public Integer getIsAdapterVideoPlaySize() {
        if (this.hook == null) {
            return this.rawValue.getIsAdapterVideoPlaySize();
        }
        return (Integer) getProxyValue(this.hook, "is_adapter_video_play_size", Integer.class, (T) this.rawValue.getIsAdapterVideoPlaySize());
    }

    public Integer getIsAdapterVideoPlaySizeAd() {
        if (this.hook == null) {
            return this.rawValue.getIsAdapterVideoPlaySizeAd();
        }
        return (Integer) getProxyValue(this.hook, "is_adapter_video_play_size_ad", Integer.class, (T) this.rawValue.getIsAdapterVideoPlaySizeAd());
    }

    public Boolean getIsBlockErrorGoPublish() {
        if (this.hook == null) {
            return this.rawValue.getIsBlockErrorGoPublish();
        }
        return (Boolean) getProxyValue(this.hook, "is_block_error_go_publish", Boolean.class, (T) this.rawValue.getIsBlockErrorGoPublish());
    }

    public List<String> getIsCutoutAndroid() {
        if (this.hook == null) {
            return this.rawValue.getIsCutoutAndroid();
        }
        return getProxyValue(this.hook, "is_cutout_android", String.class, this.rawValue.getIsCutoutAndroid());
    }

    public Boolean getIsFamiliarFeedFilterDuplicate() {
        if (this.hook == null) {
            return this.rawValue.getIsFamiliarFeedFilterDuplicate();
        }
        return (Boolean) getProxyValue(this.hook, "is_familiar_feed_filter_duplicate", Boolean.class, (T) this.rawValue.getIsFamiliarFeedFilterDuplicate());
    }

    public Boolean getIsHotUser() {
        if (this.hook == null) {
            return this.rawValue.getIsHotUser();
        }
        return (Boolean) getProxyValue(this.hook, "is_hot_user", Boolean.class, (T) this.rawValue.getIsHotUser());
    }

    public Boolean getIsLowMemoryMachineForTools() {
        if (this.hook == null) {
            return this.rawValue.getIsLowMemoryMachineForTools();
        }
        return (Boolean) getProxyValue(this.hook, "is_low_memory_machine_for_tools", Boolean.class, (T) this.rawValue.getIsLowMemoryMachineForTools());
    }

    public Boolean getIsNearbyOldUser() {
        if (this.hook == null) {
            return this.rawValue.getIsNearbyOldUser();
        }
        return (Boolean) getProxyValue(this.hook, "is_nearby_old_user", Boolean.class, (T) this.rawValue.getIsNearbyOldUser());
    }

    public Boolean getKeepCookies() {
        if (this.hook == null) {
            return this.rawValue.getKeepCookies();
        }
        return (Boolean) getProxyValue(this.hook, "keep_cookies", Boolean.class, (T) this.rawValue.getKeepCookies());
    }

    public Boolean getKeepLobbyCookies() {
        if (this.hook == null) {
            return this.rawValue.getKeepLobbyCookies();
        }
        return (Boolean) getProxyValue(this.hook, "keep_lobby_cookies", Boolean.class, (T) this.rawValue.getKeepLobbyCookies());
    }

    public List<String> getKevaBlacklist() {
        if (this.hook == null) {
            return this.rawValue.getKevaBlacklist();
        }
        return getProxyValue(this.hook, "keva_blacklist", String.class, this.rawValue.getKevaBlacklist());
    }

    public Integer getKevaSwitch() {
        if (this.hook == null) {
            return this.rawValue.getKevaSwitch();
        }
        return (Integer) getProxyValue(this.hook, "keva_switch", Integer.class, (T) this.rawValue.getKevaSwitch());
    }

    public List<String> getLabFeatureIds() {
        if (this.hook == null) {
            return this.rawValue.getLabFeatureIds();
        }
        return getProxyValue(this.hook, "lab_feature_ids", String.class, this.rawValue.getLabFeatureIds());
    }

    public Integer getLightEnhanceThreshold() {
        if (this.hook == null) {
            return this.rawValue.getLightEnhanceThreshold();
        }
        return (Integer) getProxyValue(this.hook, "light_enhance_threshold", Integer.class, (T) this.rawValue.getLightEnhanceThreshold());
    }

    public String getLiveAudioAnimationResource() {
        if (this.hook == null) {
            return this.rawValue.getLiveAudioAnimationResource();
        }
        return (String) getProxyValue(this.hook, "live_audio_animation_resource", String.class, (T) this.rawValue.getLiveAudioAnimationResource());
    }

    public List<String> getLiveAudioBgList() {
        if (this.hook == null) {
            return this.rawValue.getLiveAudioBgList();
        }
        return getProxyValue(this.hook, "live_audio_bg_list", String.class, this.rawValue.getLiveAudioBgList());
    }

    public Integer getLiveCheckInterval() {
        if (this.hook == null) {
            return this.rawValue.getLiveCheckInterval();
        }
        return (Integer) getProxyValue(this.hook, "live_check_interval", Integer.class, (T) this.rawValue.getLiveCheckInterval());
    }

    public Integer getLiveSquareGuideShowCount() {
        if (this.hook == null) {
            return this.rawValue.getLiveSquareGuideShowCount();
        }
        return (Integer) getProxyValue(this.hook, "live_square_guide_show_count", Integer.class, (T) this.rawValue.getLiveSquareGuideShowCount());
    }

    public Boolean getMainTabFollowUseLazyViewpager() {
        if (this.hook == null) {
            return this.rawValue.getMainTabFollowUseLazyViewpager();
        }
        return (Boolean) getProxyValue(this.hook, "main_tab_follow_use_lazy_viewpager", Boolean.class, (T) this.rawValue.getMainTabFollowUseLazyViewpager());
    }

    public Boolean getMainfragmentHiddenChangedSwitch() {
        if (this.hook == null) {
            return this.rawValue.getMainfragmentHiddenChangedSwitch();
        }
        return (Boolean) getProxyValue(this.hook, "mainfragment_hidden_changed_switch", Boolean.class, (T) this.rawValue.getMainfragmentHiddenChangedSwitch());
    }

    public Integer getMaxLaunchPushGuide() {
        if (this.hook == null) {
            return this.rawValue.getMaxLaunchPushGuide();
        }
        return (Integer) getProxyValue(this.hook, "max_launch_push_guide", Integer.class, (T) this.rawValue.getMaxLaunchPushGuide());
    }

    public Integer getMaxMessageCountForRecommend() {
        if (this.hook == null) {
            return this.rawValue.getMaxMessageCountForRecommend();
        }
        return (Integer) getProxyValue(this.hook, "max_message_count_for_recommend", Integer.class, (T) this.rawValue.getMaxMessageCountForRecommend());
    }

    public Integer getMaxPublishPushGuide() {
        if (this.hook == null) {
            return this.rawValue.getMaxPublishPushGuide();
        }
        return (Integer) getProxyValue(this.hook, "max_publish_push_guide", Integer.class, (T) this.rawValue.getMaxPublishPushGuide());
    }

    public Integer getMinFollowNumForLandingFollowTab() {
        if (this.hook == null) {
            return this.rawValue.getMinFollowNumForLandingFollowTab();
        }
        return (Integer) getProxyValue(this.hook, "min_follow_num_for_landing_follow_tab", Integer.class, (T) this.rawValue.getMinFollowNumForLandingFollowTab());
    }

    public Boolean getMiniappInitEnable() {
        if (this.hook == null) {
            return this.rawValue.getMiniappInitEnable();
        }
        return (Boolean) getProxyValue(this.hook, "miniapp_init_enable", Boolean.class, (T) this.rawValue.getMiniappInitEnable());
    }

    public Boolean getMiniappPreloadEmptyProcessEnbale() {
        if (this.hook == null) {
            return this.rawValue.getMiniappPreloadEmptyProcessEnbale();
        }
        return (Boolean) getProxyValue(this.hook, "miniapp_preload_empty_process_enbale", Boolean.class, (T) this.rawValue.getMiniappPreloadEmptyProcessEnbale());
    }

    public Boolean getMiniappWonderlandEnable() {
        if (this.hook == null) {
            return this.rawValue.getMiniappWonderlandEnable();
        }
        return (Boolean) getProxyValue(this.hook, "miniapp_wonderland_enable", Boolean.class, (T) this.rawValue.getMiniappWonderlandEnable());
    }

    public Integer getMixPermission() {
        if (this.hook == null) {
            return this.rawValue.getMixPermission();
        }
        return (Integer) getProxyValue(this.hook, "mix_permission", Integer.class, (T) this.rawValue.getMixPermission());
    }

    public Boolean getMtForbidInsertPlaceholderWord() {
        if (this.hook == null) {
            return this.rawValue.getMtForbidInsertPlaceholderWord();
        }
        return (Boolean) getProxyValue(this.hook, "mt_forbid_insert_placeholder_word", Boolean.class, (T) this.rawValue.getMtForbidInsertPlaceholderWord());
    }

    public Integer getMtLocalAnalysisHprof() {
        if (this.hook == null) {
            return this.rawValue.getMtLocalAnalysisHprof();
        }
        return (Integer) getProxyValue(this.hook, "mt_local_analysis_hprof", Integer.class, (T) this.rawValue.getMtLocalAnalysisHprof());
    }

    public Integer getMtSearchHistoryFoldCount() {
        if (this.hook == null) {
            return this.rawValue.getMtSearchHistoryFoldCount();
        }
        return (Integer) getProxyValue(this.hook, "mt_search_history_fold_count", Integer.class, (T) this.rawValue.getMtSearchHistoryFoldCount());
    }

    public String getMusicDetailImageEntry() {
        if (this.hook == null) {
            return this.rawValue.getMusicDetailImageEntry();
        }
        return (String) getProxyValue(this.hook, "music_detail_image_entry", String.class, (T) this.rawValue.getMusicDetailImageEntry());
    }

    public Boolean getNeedCallUserAgreementAndUgcPopup() {
        if (this.hook == null) {
            return this.rawValue.getNeedCallUserAgreementAndUgcPopup();
        }
        return (Boolean) getProxyValue(this.hook, "need_call_user_agreement_and_ugc_popup", Boolean.class, (T) this.rawValue.getNeedCallUserAgreementAndUgcPopup());
    }

    public Boolean getNewAnchorShowBubble() {
        if (this.hook == null) {
            return this.rawValue.getNewAnchorShowBubble();
        }
        return (Boolean) getProxyValue(this.hook, "new_anchor_show_bubble", Boolean.class, (T) this.rawValue.getNewAnchorShowBubble());
    }

    public String getNewHashtagRegex() {
        if (this.hook == null) {
            return this.rawValue.getNewHashtagRegex();
        }
        return (String) getProxyValue(this.hook, "new_hashtag_regex", String.class, (T) this.rawValue.getNewHashtagRegex());
    }

    public Integer getNonFeedVideoViewResizeStrategy() {
        if (this.hook == null) {
            return this.rawValue.getNonFeedVideoViewResizeStrategy();
        }
        return (Integer) getProxyValue(this.hook, "non_feed_video_view_resize_strategy", Integer.class, (T) this.rawValue.getNonFeedVideoViewResizeStrategy());
    }

    public Integer getNoticeGuideCancelLimit() {
        if (this.hook == null) {
            return this.rawValue.getNoticeGuideCancelLimit();
        }
        return (Integer) getProxyValue(this.hook, "notice_guide_cancel_limit", Integer.class, (T) this.rawValue.getNoticeGuideCancelLimit());
    }

    public Integer getNoticeGuideShowInterval() {
        if (this.hook == null) {
            return this.rawValue.getNoticeGuideShowInterval();
        }
        return (Integer) getProxyValue(this.hook, "notice_guide_show_interval", Integer.class, (T) this.rawValue.getNoticeGuideShowInterval());
    }

    public Boolean getOftenWatchReportFastStats() {
        if (this.hook == null) {
            return this.rawValue.getOftenWatchReportFastStats();
        }
        return (Boolean) getProxyValue(this.hook, "often_watch_report_fast_stats", Boolean.class, (T) this.rawValue.getOftenWatchReportFastStats());
    }

    public List<Integer> getOneBindNetSetting() {
        if (this.hook == null) {
            return this.rawValue.getOneBindNetSetting();
        }
        return getProxyValue(this.hook, "one_bind_net_setting", Integer.class, this.rawValue.getOneBindNetSetting());
    }

    public Integer getPlayermanagerBackgroundCheck() {
        if (this.hook == null) {
            return this.rawValue.getPlayermanagerBackgroundCheck();
        }
        return (Integer) getProxyValue(this.hook, "playermanager_background_check", Integer.class, (T) this.rawValue.getPlayermanagerBackgroundCheck());
    }

    public Integer getPolarisJsbSetting() {
        if (this.hook == null) {
            return this.rawValue.getPolarisJsbSetting();
        }
        return (Integer) getProxyValue(this.hook, "polaris_jsb_setting", Integer.class, (T) this.rawValue.getPolarisJsbSetting());
    }

    public Boolean getPostDownloadSetting() {
        if (this.hook == null) {
            return this.rawValue.getPostDownloadSetting();
        }
        return (Boolean) getProxyValue(this.hook, "post_download_setting", Boolean.class, (T) this.rawValue.getPostDownloadSetting());
    }

    public Integer getPosterSrType() {
        if (this.hook == null) {
            return this.rawValue.getPosterSrType();
        }
        return (Integer) getProxyValue(this.hook, "poster_sr_type", Integer.class, (T) this.rawValue.getPosterSrType());
    }

    public Integer getPrePostCheckFreqLimit() {
        if (this.hook == null) {
            return this.rawValue.getPrePostCheckFreqLimit();
        }
        return (Integer) getProxyValue(this.hook, "pre_post_check_freq_limit", Integer.class, (T) this.rawValue.getPrePostCheckFreqLimit());
    }

    public Integer getPrePostCheckType() {
        if (this.hook == null) {
            return this.rawValue.getPrePostCheckType();
        }
        return (Integer) getProxyValue(this.hook, "pre_post_check_type", Integer.class, (T) this.rawValue.getPrePostCheckType());
    }

    public Integer getPrePublishMinApiLevel1() {
        if (this.hook == null) {
            return this.rawValue.getPrePublishMinApiLevel1();
        }
        return (Integer) getProxyValue(this.hook, "pre_publish_min_api_level_1", Integer.class, (T) this.rawValue.getPrePublishMinApiLevel1());
    }

    public Integer getPrePublishMinApiLevel2() {
        if (this.hook == null) {
            return this.rawValue.getPrePublishMinApiLevel2();
        }
        return (Integer) getProxyValue(this.hook, "pre_publish_min_api_level_2", Integer.class, (T) this.rawValue.getPrePublishMinApiLevel2());
    }

    public Integer getPrePublishMinAvailableMemoryMbLevel1() {
        if (this.hook == null) {
            return this.rawValue.getPrePublishMinAvailableMemoryMbLevel1();
        }
        return (Integer) getProxyValue(this.hook, "pre_publish_min_available_memory_mb_level_1", Integer.class, (T) this.rawValue.getPrePublishMinAvailableMemoryMbLevel1());
    }

    public Integer getPrePublishMinAvailableMemoryMbLevel2() {
        if (this.hook == null) {
            return this.rawValue.getPrePublishMinAvailableMemoryMbLevel2();
        }
        return (Integer) getProxyValue(this.hook, "pre_publish_min_available_memory_mb_level_2", Integer.class, (T) this.rawValue.getPrePublishMinAvailableMemoryMbLevel2());
    }

    public Integer getPrePublishMinJvmAvailableMemoryMbLevel1() {
        if (this.hook == null) {
            return this.rawValue.getPrePublishMinJvmAvailableMemoryMbLevel1();
        }
        return (Integer) getProxyValue(this.hook, "pre_publish_min_jvm_available_memory_mb_level_1", Integer.class, (T) this.rawValue.getPrePublishMinJvmAvailableMemoryMbLevel1());
    }

    public Integer getPrePublishMinJvmAvailableMemoryMbLevel2() {
        if (this.hook == null) {
            return this.rawValue.getPrePublishMinJvmAvailableMemoryMbLevel2();
        }
        return (Integer) getProxyValue(this.hook, "pre_publish_min_jvm_available_memory_mb_level_2", Integer.class, (T) this.rawValue.getPrePublishMinJvmAvailableMemoryMbLevel2());
    }

    public Integer getPrePublishMinTotalMemoryMbLevel1() {
        if (this.hook == null) {
            return this.rawValue.getPrePublishMinTotalMemoryMbLevel1();
        }
        return (Integer) getProxyValue(this.hook, "pre_publish_min_total_memory_mb_level_1", Integer.class, (T) this.rawValue.getPrePublishMinTotalMemoryMbLevel1());
    }

    public Integer getPrePublishMinTotalMemoryMbLevel2() {
        if (this.hook == null) {
            return this.rawValue.getPrePublishMinTotalMemoryMbLevel2();
        }
        return (Integer) getProxyValue(this.hook, "pre_publish_min_total_memory_mb_level_2", Integer.class, (T) this.rawValue.getPrePublishMinTotalMemoryMbLevel2());
    }

    public List<String> getPreloadMicroAppList() {
        if (this.hook == null) {
            return this.rawValue.getPreloadMicroAppList();
        }
        return getProxyValue(this.hook, "preload_micro_app_list", String.class, this.rawValue.getPreloadMicroAppList());
    }

    public String getPriorityRegion() {
        if (this.hook == null) {
            return this.rawValue.getPriorityRegion();
        }
        return (String) getProxyValue(this.hook, "priority_region", String.class, (T) this.rawValue.getPriorityRegion());
    }

    public Boolean getProfileFavoriteUndiggOptimizeSetting() {
        if (this.hook == null) {
            return this.rawValue.getProfileFavoriteUndiggOptimizeSetting();
        }
        return (Boolean) getProxyValue(this.hook, "profile_favorite_undigg_optimize_setting", Boolean.class, (T) this.rawValue.getProfileFavoriteUndiggOptimizeSetting());
    }

    public Boolean getPublicTestEntry() {
        if (this.hook == null) {
            return this.rawValue.getPublicTestEntry();
        }
        return (Boolean) getProxyValue(this.hook, "public_test_entry", Boolean.class, (T) this.rawValue.getPublicTestEntry());
    }

    public String getPublicTestEntrySchema() {
        if (this.hook == null) {
            return this.rawValue.getPublicTestEntrySchema();
        }
        return (String) getProxyValue(this.hook, "public_test_entry_schema", String.class, (T) this.rawValue.getPublicTestEntrySchema());
    }

    public Integer getPublishLogMaxLength() {
        if (this.hook == null) {
            return this.rawValue.getPublishLogMaxLength();
        }
        return (Integer) getProxyValue(this.hook, "publish_log_max_length", Integer.class, (T) this.rawValue.getPublishLogMaxLength());
    }

    public Integer getPushGuideInterval() {
        if (this.hook == null) {
            return this.rawValue.getPushGuideInterval();
        }
        return (Integer) getProxyValue(this.hook, "push_guide_interval", Integer.class, (T) this.rawValue.getPushGuideInterval());
    }

    public Integer getPushdelayinitSwitch() {
        if (this.hook == null) {
            return this.rawValue.getPushdelayinitSwitch();
        }
        return (Integer) getProxyValue(this.hook, "pushdelayinit_switch", Integer.class, (T) this.rawValue.getPushdelayinitSwitch());
    }

    public Integer getReadVideoLastGap() {
        if (this.hook == null) {
            return this.rawValue.getReadVideoLastGap();
        }
        return (Integer) getProxyValue(this.hook, "read_video_last_gap", Integer.class, (T) this.rawValue.getReadVideoLastGap());
    }

    public Boolean getRealTimeReportEnable() {
        if (this.hook == null) {
            return this.rawValue.getRealTimeReportEnable();
        }
        return (Boolean) getProxyValue(this.hook, "real_time_report_enable", Boolean.class, (T) this.rawValue.getRealTimeReportEnable());
    }

    public Double getRecommendFixSplashBug() {
        if (this.hook == null) {
            return this.rawValue.getRecommendFixSplashBug();
        }
        return (Double) getProxyValue(this.hook, "recommend_fix_splash_bug", Double.class, (T) this.rawValue.getRecommendFixSplashBug());
    }

    public String getRecoverAccountVerificationFormUrl() {
        if (this.hook == null) {
            return this.rawValue.getRecoverAccountVerificationFormUrl();
        }
        return (String) getProxyValue(this.hook, "recover_account_verification_form_url", String.class, (T) this.rawValue.getRecoverAccountVerificationFormUrl());
    }

    public Long getReusePhoneCheckInterval() {
        if (this.hook == null) {
            return this.rawValue.getReusePhoneCheckInterval();
        }
        return (Long) getProxyValue(this.hook, "reuse_phone_check_interval", Long.class, (T) this.rawValue.getReusePhoneCheckInterval());
    }

    public Boolean getRnForceV8Gc() {
        if (this.hook == null) {
            return this.rawValue.getRnForceV8Gc();
        }
        return (Boolean) getProxyValue(this.hook, "rn_force_v8_gc", Boolean.class, (T) this.rawValue.getRnForceV8Gc());
    }

    public Long getSafeInfoNoticeFrequency() {
        if (this.hook == null) {
            return this.rawValue.getSafeInfoNoticeFrequency();
        }
        return (Long) getProxyValue(this.hook, "safe_info_notice_frequency", Long.class, (T) this.rawValue.getSafeInfoNoticeFrequency());
    }

    public Integer getSatCameraType() {
        if (this.hook == null) {
            return this.rawValue.getSatCameraType();
        }
        return (Integer) getProxyValue(this.hook, "sat_camera_type", Integer.class, (T) this.rawValue.getSatCameraType());
    }

    public Integer getSearchHistoryCollapseNum() {
        if (this.hook == null) {
            return this.rawValue.getSearchHistoryCollapseNum();
        }
        return (Integer) getProxyValue(this.hook, "search_history_collapse_num", Integer.class, (T) this.rawValue.getSearchHistoryCollapseNum());
    }

    public Integer getSearchMiddleRecommendWordsCount() {
        if (this.hook == null) {
            return this.rawValue.getSearchMiddleRecommendWordsCount();
        }
        return (Integer) getProxyValue(this.hook, "search_middle_recommend_words_count", Integer.class, (T) this.rawValue.getSearchMiddleRecommendWordsCount());
    }

    public Integer getSearchNewGsStyle() {
        if (this.hook == null) {
            return this.rawValue.getSearchNewGsStyle();
        }
        return (Integer) getProxyValue(this.hook, "search_new_gs_style", Integer.class, (T) this.rawValue.getSearchNewGsStyle());
    }

    public Integer getSecIdSwitch() {
        if (this.hook == null) {
            return this.rawValue.getSecIdSwitch();
        }
        return (Integer) getProxyValue(this.hook, "sec_id_switch", Integer.class, (T) this.rawValue.getSecIdSwitch());
    }

    public String getSecurityCenter() {
        if (this.hook == null) {
            return this.rawValue.getSecurityCenter();
        }
        return (String) getProxyValue(this.hook, "security_center", String.class, (T) this.rawValue.getSecurityCenter());
    }

    public String getSettingForEmailPwd() {
        if (this.hook == null) {
            return this.rawValue.getSettingForEmailPwd();
        }
        return (String) getProxyValue(this.hook, "setting_for_email_pwd", String.class, (T) this.rawValue.getSettingForEmailPwd());
    }

    public Boolean getSettingsKevaSwitch() {
        if (this.hook == null) {
            return this.rawValue.getSettingsKevaSwitch();
        }
        return (Boolean) getProxyValue(this.hook, "settings_keva_switch", Boolean.class, (T) this.rawValue.getSettingsKevaSwitch());
    }

    public List<String> getShareH5UrlWhitelist() {
        if (this.hook == null) {
            return this.rawValue.getShareH5UrlWhitelist();
        }
        return getProxyValue(this.hook, "share_h5_url_whitelist", String.class, this.rawValue.getShareH5UrlWhitelist());
    }

    public Integer getShareShowUnfollowContactsCount() {
        if (this.hook == null) {
            return this.rawValue.getShareShowUnfollowContactsCount();
        }
        return (Integer) getProxyValue(this.hook, "share_show_unfollow_contacts_count", Integer.class, (T) this.rawValue.getShareShowUnfollowContactsCount());
    }

    public String getShopLinkAnchorDisclaimer() {
        if (this.hook == null) {
            return this.rawValue.getShopLinkAnchorDisclaimer();
        }
        return (String) getProxyValue(this.hook, "shop_link_anchor_disclaimer", String.class, (T) this.rawValue.getShopLinkAnchorDisclaimer());
    }

    public Integer getShowDeviceManagerEntry() {
        if (this.hook == null) {
            return this.rawValue.getShowDeviceManagerEntry();
        }
        return (Integer) getProxyValue(this.hook, "show_device_manager_entry", Integer.class, (T) this.rawValue.getShowDeviceManagerEntry());
    }

    public Boolean getShowDoulabEntrance() {
        if (this.hook == null) {
            return this.rawValue.getShowDoulabEntrance();
        }
        return (Boolean) getProxyValue(this.hook, "show_doulab_entrance", Boolean.class, (T) this.rawValue.getShowDoulabEntrance());
    }

    public Integer getShowFromDuoshanLabel() {
        if (this.hook == null) {
            return this.rawValue.getShowFromDuoshanLabel();
        }
        return (Integer) getProxyValue(this.hook, "show_from_duoshan_label", Integer.class, (T) this.rawValue.getShowFromDuoshanLabel());
    }

    public Boolean getShowQqdownloaderPrivacyDialog() {
        if (this.hook == null) {
            return this.rawValue.getShowQqdownloaderPrivacyDialog();
        }
        return (Boolean) getProxyValue(this.hook, "show_qqdownloader_privacy_dialog", Boolean.class, (T) this.rawValue.getShowQqdownloaderPrivacyDialog());
    }

    public Long getShowStorageDotSize() {
        if (this.hook == null) {
            return this.rawValue.getShowStorageDotSize();
        }
        return (Long) getProxyValue(this.hook, "show_storage_dot_size", Long.class, (T) this.rawValue.getShowStorageDotSize());
    }

    public Long getShowStorageTipSize() {
        if (this.hook == null) {
            return this.rawValue.getShowStorageTipSize();
        }
        return (Long) getProxyValue(this.hook, "show_storage_tip_size", Long.class, (T) this.rawValue.getShowStorageTipSize());
    }

    public List<WhatsAppCodeItem> getShowWhatsappByCallingCode() {
        if (this.hook == null) {
            return this.rawValue.getShowWhatsappByCallingCode();
        }
        return getProxyValue(this.hook, "show_whatsapp_by_calling_code", WhatsAppCodeItem.class, this.rawValue.getShowWhatsappByCallingCode());
    }

    public List<ShareChannelSettings> getSilentShareList() {
        if (this.hook == null) {
            return this.rawValue.getSilentShareList();
        }
        return getProxyValue(this.hook, "silent_share_list", ShareChannelSettings.class, this.rawValue.getSilentShareList());
    }

    public Boolean getSmartisanDataSharingSwitch() {
        if (this.hook == null) {
            return this.rawValue.getSmartisanDataSharingSwitch();
        }
        return (Boolean) getProxyValue(this.hook, "smartisan_data_sharing_switch", Boolean.class, (T) this.rawValue.getSmartisanDataSharingSwitch());
    }

    public String getSoundMatchFeedbackUrl() {
        if (this.hook == null) {
            return this.rawValue.getSoundMatchFeedbackUrl();
        }
        return (String) getProxyValue(this.hook, "sound_match_feedback_url", String.class, (T) this.rawValue.getSoundMatchFeedbackUrl());
    }

    public Long getSplashStockDelayMillisTime() {
        if (this.hook == null) {
            return this.rawValue.getSplashStockDelayMillisTime();
        }
        return (Long) getProxyValue(this.hook, "splash_stock_delay_millis_time", Long.class, (T) this.rawValue.getSplashStockDelayMillisTime());
    }

    public List<String> getSplashSwitchServerList() {
        if (this.hook == null) {
            return this.rawValue.getSplashSwitchServerList();
        }
        return getProxyValue(this.hook, "splash_switch_server_list", String.class, this.rawValue.getSplashSwitchServerList());
    }

    public String getStarAtlasProfileLink() {
        if (this.hook == null) {
            return this.rawValue.getStarAtlasProfileLink();
        }
        return (String) getProxyValue(this.hook, "star_atlas_profile_link", String.class, (T) this.rawValue.getStarAtlasProfileLink());
    }

    public String getStatusLottieUrl() {
        if (this.hook == null) {
            return this.rawValue.getStatusLottieUrl();
        }
        return (String) getProxyValue(this.hook, "status_lottie_url", String.class, (T) this.rawValue.getStatusLottieUrl());
    }

    public Integer getStatusPhoneType() {
        if (this.hook == null) {
            return this.rawValue.getStatusPhoneType();
        }
        return (Integer) getProxyValue(this.hook, "status_phone_type", Integer.class, (T) this.rawValue.getStatusPhoneType());
    }

    public String getStatusTabKey() {
        if (this.hook == null) {
            return this.rawValue.getStatusTabKey();
        }
        return (String) getProxyValue(this.hook, "status_tab_key", String.class, (T) this.rawValue.getStatusTabKey());
    }

    public Boolean getStickerUpdateApp() {
        if (this.hook == null) {
            return this.rawValue.getStickerUpdateApp();
        }
        return (Boolean) getProxyValue(this.hook, "sticker_update_app", Boolean.class, (T) this.rawValue.getStickerUpdateApp());
    }

    public Boolean getSupportFilterErrorFile() {
        if (this.hook == null) {
            return this.rawValue.getSupportFilterErrorFile();
        }
        return (Boolean) getProxyValue(this.hook, "support_filter_error_file", Boolean.class, (T) this.rawValue.getSupportFilterErrorFile());
    }

    public Integer getTcmCtrySettings() {
        if (this.hook == null) {
            return this.rawValue.getTcmCtrySettings();
        }
        return (Integer) getProxyValue(this.hook, "tcm_ctry_settings", Integer.class, (T) this.rawValue.getTcmCtrySettings());
    }

    public String getTcmNameCtry() {
        if (this.hook == null) {
            return this.rawValue.getTcmNameCtry();
        }
        return (String) getProxyValue(this.hook, "tcm_name_ctry", String.class, (T) this.rawValue.getTcmNameCtry());
    }

    public List<Integer> getThirdpartyLoginBindSkip() {
        if (this.hook == null) {
            return this.rawValue.getThirdpartyLoginBindSkip();
        }
        return getProxyValue(this.hook, "thirdparty_login_bind_skip", Integer.class, this.rawValue.getThirdpartyLoginBindSkip());
    }

    public String getTtRegions() {
        if (this.hook == null) {
            return this.rawValue.getTtRegions();
        }
        return (String) getProxyValue(this.hook, "tt_regions", String.class, (T) this.rawValue.getTtRegions());
    }

    public List<String> getTtnetInterceptWebviewBlackList() {
        if (this.hook == null) {
            return this.rawValue.getTtnetInterceptWebviewBlackList();
        }
        return getProxyValue(this.hook, "ttnet_intercept_webview_black_list", String.class, this.rawValue.getTtnetInterceptWebviewBlackList());
    }

    public List<String> getTtnetInterceptWebviewWhiteList() {
        if (this.hook == null) {
            return this.rawValue.getTtnetInterceptWebviewWhiteList();
        }
        return getProxyValue(this.hook, "ttnet_intercept_webview_white_list", String.class, this.rawValue.getTtnetInterceptWebviewWhiteList());
    }

    public Boolean getUgDiffDownloadReportOnlyDiff() {
        if (this.hook == null) {
            return this.rawValue.getUgDiffDownloadReportOnlyDiff();
        }
        return (Boolean) getProxyValue(this.hook, "ug_diff_download_report_only_diff", Boolean.class, (T) this.rawValue.getUgDiffDownloadReportOnlyDiff());
    }

    public Boolean getUgDiffDownloadUnreportExtra() {
        if (this.hook == null) {
            return this.rawValue.getUgDiffDownloadUnreportExtra();
        }
        return (Boolean) getProxyValue(this.hook, "ug_diff_download_unreport_extra", Boolean.class, (T) this.rawValue.getUgDiffDownloadUnreportExtra());
    }

    public String getUgSecLinkUrl() {
        if (this.hook == null) {
            return this.rawValue.getUgSecLinkUrl();
        }
        return (String) getProxyValue(this.hook, "ug_sec_link_url", String.class, (T) this.rawValue.getUgSecLinkUrl());
    }

    public Integer getUgShareWebviewSecLevel() {
        if (this.hook == null) {
            return this.rawValue.getUgShareWebviewSecLevel();
        }
        return (Integer) getProxyValue(this.hook, "ug_share_webview_sec_level", Integer.class, (T) this.rawValue.getUgShareWebviewSecLevel());
    }

    public Long getUnreadVideoSunRoof() {
        if (this.hook == null) {
            return this.rawValue.getUnreadVideoSunRoof();
        }
        return (Long) getProxyValue(this.hook, "unread_video_sun_roof", Long.class, (T) this.rawValue.getUnreadVideoSunRoof());
    }

    public List<String> getUploadVideoSizeCategory() {
        if (this.hook == null) {
            return this.rawValue.getUploadVideoSizeCategory();
        }
        return getProxyValue(this.hook, "upload_video_size_category", String.class, this.rawValue.getUploadVideoSizeCategory());
    }

    public Boolean getUseBridgeEngineV2() {
        if (this.hook == null) {
            return this.rawValue.getUseBridgeEngineV2();
        }
        return (Boolean) getProxyValue(this.hook, "use_bridge_engine_v2", Boolean.class, (T) this.rawValue.getUseBridgeEngineV2());
    }

    public Boolean getUseNewSplashView() {
        if (this.hook == null) {
            return this.rawValue.getUseNewSplashView();
        }
        return (Boolean) getProxyValue(this.hook, "use_new_splash_view", Boolean.class, (T) this.rawValue.getUseNewSplashView());
    }

    public Boolean getUseNewyearDirectUpload() {
        if (this.hook == null) {
            return this.rawValue.getUseNewyearDirectUpload();
        }
        return (Boolean) getProxyValue(this.hook, "use_newyear_direct_upload", Boolean.class, (T) this.rawValue.getUseNewyearDirectUpload());
    }

    public Integer getUseVeImage() {
        if (this.hook == null) {
            return this.rawValue.getUseVeImage();
        }
        return (Integer) getProxyValue(this.hook, "use_ve_image", Integer.class, (T) this.rawValue.getUseVeImage());
    }

    public Boolean getVeFastImportIgnoreRecode() {
        if (this.hook == null) {
            return this.rawValue.getVeFastImportIgnoreRecode();
        }
        return (Boolean) getProxyValue(this.hook, "ve_fast_import_ignore_recode", Boolean.class, (T) this.rawValue.getVeFastImportIgnoreRecode());
    }

    public Boolean getVeFastImportIgnoreRecodeForRotation() {
        if (this.hook == null) {
            return this.rawValue.getVeFastImportIgnoreRecodeForRotation();
        }
        return (Boolean) getProxyValue(this.hook, "ve_fast_import_ignore_recode_for_rotation", Boolean.class, (T) this.rawValue.getVeFastImportIgnoreRecodeForRotation());
    }

    public String getVeRuntimeConfig() {
        if (this.hook == null) {
            return this.rawValue.getVeRuntimeConfig();
        }
        return (String) getProxyValue(this.hook, "ve_runtime_config", String.class, (T) this.rawValue.getVeRuntimeConfig());
    }

    public String getVendorKeyBackUrl() {
        if (this.hook == null) {
            return this.rawValue.getVendorKeyBackUrl();
        }
        return (String) getProxyValue(this.hook, "vendor_key_back_url", String.class, (T) this.rawValue.getVendorKeyBackUrl());
    }

    public List<Float> getVideoBitrateCategory() {
        if (this.hook == null) {
            return this.rawValue.getVideoBitrateCategory();
        }
        return getProxyValue(this.hook, "video_bitrate_category", Float.class, this.rawValue.getVideoBitrateCategory());
    }

    public String getVideoDescription() {
        if (this.hook == null) {
            return this.rawValue.getVideoDescription();
        }
        return (String) getProxyValue(this.hook, "video_description", String.class, (T) this.rawValue.getVideoDescription());
    }

    public Integer getVideoPlayProgressCount() {
        if (this.hook == null) {
            return this.rawValue.getVideoPlayProgressCount();
        }
        return (Integer) getProxyValue(this.hook, "video_play_progress_count", Integer.class, (T) this.rawValue.getVideoPlayProgressCount());
    }

    public List<Integer> getVideoQualityCategory() {
        if (this.hook == null) {
            return this.rawValue.getVideoQualityCategory();
        }
        return getProxyValue(this.hook, "video_quality_category", Integer.class, this.rawValue.getVideoQualityCategory());
    }

    public List<String> getVideoSizeCategory() {
        if (this.hook == null) {
            return this.rawValue.getVideoSizeCategory();
        }
        return getProxyValue(this.hook, "video_size_category", String.class, this.rawValue.getVideoSizeCategory());
    }

    public List<String> getWebviewCachePoolSwitch() {
        if (this.hook == null) {
            return this.rawValue.getWebviewCachePoolSwitch();
        }
        return getProxyValue(this.hook, "webview_cache_pool_switch", String.class, this.rawValue.getWebviewCachePoolSwitch());
    }

    public List<String> getWebviewCacheUrls() {
        if (this.hook == null) {
            return this.rawValue.getWebviewCacheUrls();
        }
        return getProxyValue(this.hook, "webview_cache_urls", String.class, this.rawValue.getWebviewCacheUrls());
    }

    public String getWikipediaAnchorUrlPlaceholder() {
        if (this.hook == null) {
            return this.rawValue.getWikipediaAnchorUrlPlaceholder();
        }
        return (String) getProxyValue(this.hook, "wikipedia_anchor_url_placeholder", String.class, (T) this.rawValue.getWikipediaAnchorUrlPlaceholder());
    }

    public Boolean getWithDouplusEntry() {
        if (this.hook == null) {
            return this.rawValue.getWithDouplusEntry();
        }
        return (Boolean) getProxyValue(this.hook, "with_douplus_entry", Boolean.class, (T) this.rawValue.getWithDouplusEntry());
    }

    public AdFeSettings getAdFeSettings() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getAdFeSettings();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAdFeSettings();
        } catch (C10174a unused) {
        }
        AdFeSettings adFeSettings = (AdFeSettings) getProxyValue(this.hook, "ad_fe_settings", AdFeSettings.class, (T) obj);
        if (adFeSettings != null) {
            return adFeSettings;
        }
        throw new C10174a();
    }

    public AdLandingPageConfig getAdLandingPageConfig() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getAdLandingPageConfig();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAdLandingPageConfig();
        } catch (C10174a unused) {
        }
        AdLandingPageConfig adLandingPageConfig = (AdLandingPageConfig) getProxyValue(this.hook, "ad_landing_page_config", AdLandingPageConfig.class, (T) obj);
        if (adLandingPageConfig != null) {
            return adLandingPageConfig;
        }
        throw new C10174a();
    }

    public UserAntiAddiction getAddictionSettings() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getAddictionSettings();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAddictionSettings();
        } catch (C10174a unused) {
        }
        UserAntiAddiction userAntiAddiction = (UserAntiAddiction) getProxyValue(this.hook, "addiction_settings", UserAntiAddiction.class, (T) obj);
        if (userAntiAddiction != null) {
            return userAntiAddiction;
        }
        throw new C10174a();
    }

    public AgeGateSettings getAgeGateSettings() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getAgeGateSettings();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAgeGateSettings();
        } catch (C10174a unused) {
        }
        AgeGateSettings ageGateSettings = (AgeGateSettings) getProxyValue(this.hook, "age_gate_settings", AgeGateSettings.class, (T) obj);
        if (ageGateSettings != null) {
            return ageGateSettings;
        }
        throw new C10174a();
    }

    public Boolean getAntiAddictionToastEnable24hourTime() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getAntiAddictionToastEnable24hourTime();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAntiAddictionToastEnable24hourTime();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "anti_addiction_toast_enable_24hour_time", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public AppStoreMessage getAppStoreScore() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getAppStoreScore();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAppStoreScore();
        } catch (C10174a unused) {
        }
        AppStoreMessage appStoreMessage = (AppStoreMessage) getProxyValue(this.hook, "app_store_score", AppStoreMessage.class, (T) obj);
        if (appStoreMessage != null) {
            return appStoreMessage;
        }
        throw new C10174a();
    }

    public com_ss_android_ugc_aweme_notice_api_sp_AssistantUrl getAssistantSettings() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getAssistantSettings();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAssistantSettings();
        } catch (C10174a unused) {
        }
        com_ss_android_ugc_aweme_notice_api_sp_AssistantUrl com_ss_android_ugc_aweme_notice_api_sp_assistanturl = (com_ss_android_ugc_aweme_notice_api_sp_AssistantUrl) getProxyValue(this.hook, "assistant_settings", com_ss_android_ugc_aweme_notice_api_sp_AssistantUrl.class, (T) obj);
        if (com_ss_android_ugc_aweme_notice_api_sp_assistanturl != null) {
            return com_ss_android_ugc_aweme_notice_api_sp_assistanturl;
        }
        throw new C10174a();
    }

    public Boolean getAvDefaultWideMode() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getAvDefaultWideMode();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAvDefaultWideMode();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "av_default_wide_mode", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public UgAwemeActivitySetting getAwemeActivitySetting() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getAwemeActivitySetting();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAwemeActivitySetting();
        } catch (C10174a unused) {
        }
        UgAwemeActivitySetting ugAwemeActivitySetting = (UgAwemeActivitySetting) getProxyValue(this.hook, "aweme_activity_setting", UgAwemeActivitySetting.class, (T) obj);
        if (ugAwemeActivitySetting != null) {
            return ugAwemeActivitySetting;
        }
        throw new C10174a();
    }

    public C32826xa03e9512 getAwemeAdRank() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getAwemeAdRank();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAwemeAdRank();
        } catch (C10174a unused) {
        }
        C32826xa03e9512 com_ss_android_ugc_aweme_commercialize_model_awemeadranksettingsmodel = (C32826xa03e9512) getProxyValue(this.hook, "aweme_ad_rank", C32826xa03e9512.class, (T) obj);
        if (com_ss_android_ugc_aweme_commercialize_model_awemeadranksettingsmodel != null) {
            return com_ss_android_ugc_aweme_commercialize_model_awemeadranksettingsmodel;
        }
        throw new C10174a();
    }

    public Boolean getAwemeEnableChinaMobileService() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getAwemeEnableChinaMobileService();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAwemeEnableChinaMobileService();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "aweme_enable_china_mobile_service", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public Boolean getAwemeEnableChinaTelecomService() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getAwemeEnableChinaTelecomService();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAwemeEnableChinaTelecomService();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "aweme_enable_china_telecom_service", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public Boolean getAwemeEnableChinaUnionService() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getAwemeEnableChinaUnionService();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAwemeEnableChinaUnionService();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "aweme_enable_china_union_service", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public AwemeFEConfigs getAwemeFeConf() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getAwemeFeConf();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAwemeFeConf();
        } catch (C10174a unused) {
        }
        AwemeFEConfigs awemeFEConfigs = (AwemeFEConfigs) getProxyValue(this.hook, "aweme_fe_conf", AwemeFEConfigs.class, (T) obj);
        if (awemeFEConfigs != null) {
            return awemeFEConfigs;
        }
        throw new C10174a();
    }

    public AwemeFeEliteItem getAwemeFeElite() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getAwemeFeElite();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getAwemeFeElite();
        } catch (C10174a unused) {
        }
        AwemeFeEliteItem awemeFeEliteItem = (AwemeFeEliteItem) getProxyValue(this.hook, "aweme_fe_elite", AwemeFeEliteItem.class, (T) obj);
        if (awemeFeEliteItem != null) {
            return awemeFeEliteItem;
        }
        throw new C10174a();
    }

    public Integer getBeautyModel() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getBeautyModel();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getBeautyModel();
        } catch (C10174a unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "beauty_model", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new C10174a();
    }

    public BioSettings getBioSettings() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getBioSettings();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getBioSettings();
        } catch (C10174a unused) {
        }
        BioSettings bioSettings = (BioSettings) getProxyValue(this.hook, "bio_settings", BioSettings.class, (T) obj);
        if (bioSettings != null) {
            return bioSettings;
        }
        throw new C10174a();
    }

    public Integer getBitrateOfRecodeThreshold() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getBitrateOfRecodeThreshold();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getBitrateOfRecodeThreshold();
        } catch (C10174a unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "bitrate_of_recode_threshold", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new C10174a();
    }

    public Boolean getCanReact() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getCanReact();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getCanReact();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "can_react", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public Boolean getCleanShareFiles() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getCleanShareFiles();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getCleanShareFiles();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "clean_share_files", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public Integer getCloseVframeUpload() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getCloseVframeUpload();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getCloseVframeUpload();
        } catch (C10174a unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "close_vframe_upload", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new C10174a();
    }

    public String getCommentFilterTipsSupported() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getCommentFilterTipsSupported();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getCommentFilterTipsSupported();
        } catch (C10174a unused) {
        }
        String str = (String) getProxyValue(this.hook, "comment_filter_tips_supported", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new C10174a();
    }

    public CommentListAdMigration getCommentListAdMigration() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getCommentListAdMigration();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getCommentListAdMigration();
        } catch (C10174a unused) {
        }
        CommentListAdMigration commentListAdMigration = (CommentListAdMigration) getProxyValue(this.hook, "comment_list_ad_migration", CommentListAdMigration.class, (T) obj);
        if (commentListAdMigration != null) {
            return commentListAdMigration;
        }
        throw new C10174a();
    }

    public C32824x609e5b4 getCommerceAdLandpageBulletConfig() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getCommerceAdLandpageBulletConfig();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getCommerceAdLandpageBulletConfig();
        } catch (C10174a unused) {
        }
        C32824x609e5b4 com_ss_android_ugc_aweme_bullet_ab_commerceadlandpagebulletconfig = (C32824x609e5b4) getProxyValue(this.hook, "commerce_ad_landpage_bullet_config", C32824x609e5b4.class, (T) obj);
        if (com_ss_android_ugc_aweme_bullet_ab_commerceadlandpagebulletconfig != null) {
            return com_ss_android_ugc_aweme_bullet_ab_commerceadlandpagebulletconfig;
        }
        throw new C10174a();
    }

    public CommerceEggConfig getCommerceEggConfig() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getCommerceEggConfig();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getCommerceEggConfig();
        } catch (C10174a unused) {
        }
        CommerceEggConfig commerceEggConfig = (CommerceEggConfig) getProxyValue(this.hook, "commerce_egg_config", CommerceEggConfig.class, (T) obj);
        if (commerceEggConfig != null) {
            return commerceEggConfig;
        }
        throw new C10174a();
    }

    public com_ss_android_ugc_aweme_im_sdk_abtest_ImCommerceConfig getCommerceImConfig() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getCommerceImConfig();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getCommerceImConfig();
        } catch (C10174a unused) {
        }
        com_ss_android_ugc_aweme_im_sdk_abtest_ImCommerceConfig com_ss_android_ugc_aweme_im_sdk_abtest_imcommerceconfig = (com_ss_android_ugc_aweme_im_sdk_abtest_ImCommerceConfig) getProxyValue(this.hook, "commerce_im_config", com_ss_android_ugc_aweme_im_sdk_abtest_ImCommerceConfig.class, (T) obj);
        if (com_ss_android_ugc_aweme_im_sdk_abtest_imcommerceconfig != null) {
            return com_ss_android_ugc_aweme_im_sdk_abtest_imcommerceconfig;
        }
        throw new C10174a();
    }

    public ContactUploadUiLimits getContactUploadUiLimits() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getContactUploadUiLimits();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getContactUploadUiLimits();
        } catch (C10174a unused) {
        }
        ContactUploadUiLimits contactUploadUiLimits = (ContactUploadUiLimits) getProxyValue(this.hook, "contact_upload_ui_limits", ContactUploadUiLimits.class, (T) obj);
        if (contactUploadUiLimits != null) {
            return contactUploadUiLimits;
        }
        throw new C10174a();
    }

    public com_ss_android_ugc_trill_settings_ContentLangDialogContent getContentLangDialog() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getContentLangDialog();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getContentLangDialog();
        } catch (C10174a unused) {
        }
        com_ss_android_ugc_trill_settings_ContentLangDialogContent com_ss_android_ugc_trill_settings_contentlangdialogcontent = (com_ss_android_ugc_trill_settings_ContentLangDialogContent) getProxyValue(this.hook, "content_lang_dialog", com_ss_android_ugc_trill_settings_ContentLangDialogContent.class, (T) obj);
        if (com_ss_android_ugc_trill_settings_contentlangdialogcontent != null) {
            return com_ss_android_ugc_trill_settings_contentlangdialogcontent;
        }
        throw new C10174a();
    }

    public Integer getDataSaverSetting() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getDataSaverSetting();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDataSaverSetting();
        } catch (C10174a unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "data_saver_setting", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new C10174a();
    }

    public Boolean getDefaultShakeFreeMode() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getDefaultShakeFreeMode();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDefaultShakeFreeMode();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "default_shake_free_mode", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public Boolean getDisableDelayAbSdkRequest() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getDisableDelayAbSdkRequest();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDisableDelayAbSdkRequest();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "disable_delay_ab_sdk_request", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public Boolean getDisableDelayAppAlertRequest() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getDisableDelayAppAlertRequest();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDisableDelayAppAlertRequest();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "disable_delay_app_alert_request", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public Boolean getDisableDelayFetchSamecityActiveRequest() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getDisableDelayFetchSamecityActiveRequest();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDisableDelayFetchSamecityActiveRequest();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "disable_delay_fetch_samecity_active_request", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public Boolean getDisableDelayFetchShareSettingRequest() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getDisableDelayFetchShareSettingRequest();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDisableDelayFetchShareSettingRequest();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "disable_delay_fetch_share_setting_request", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public Boolean getDisableDelayFetchUserRequest() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getDisableDelayFetchUserRequest();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDisableDelayFetchUserRequest();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "disable_delay_fetch_user_request", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public Boolean getDisableDelaySecReport() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getDisableDelaySecReport();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDisableDelaySecReport();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "disable_delay_sec_report", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public Boolean getDisableDelayTokenBeatRequest() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getDisableDelayTokenBeatRequest();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDisableDelayTokenBeatRequest();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "disable_delay_token_beat_request", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public Boolean getDisableDelayWsRequest() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getDisableDelayWsRequest();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDisableDelayWsRequest();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "disable_delay_ws_request", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public Boolean getDisableDvmLinearAllocOpt() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getDisableDvmLinearAllocOpt();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDisableDvmLinearAllocOpt();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "disable_dvm_linear_alloc_opt", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public Boolean getDisableImMessageFullFeedSlide() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getDisableImMessageFullFeedSlide();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDisableImMessageFullFeedSlide();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "disable_im_message_full_feed_slide", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public Boolean getDisableOmSdk() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getDisableOmSdk();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDisableOmSdk();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "disable_om_sdk", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public Boolean getDiscardRefreshTopDsp() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getDiscardRefreshTopDsp();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDiscardRefreshTopDsp();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "discard_refresh_top_dsp", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public String getDiscoveryLocationBackgroundUrl() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getDiscoveryLocationBackgroundUrl();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDiscoveryLocationBackgroundUrl();
        } catch (C10174a unused) {
        }
        String str = (String) getProxyValue(this.hook, "discovery_location_background_url", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new C10174a();
    }

    public com_ss_android_ugc_aweme_settings_LikoAnalysisConfig getDmtLikoAnalysisConfig() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getDmtLikoAnalysisConfig();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDmtLikoAnalysisConfig();
        } catch (C10174a unused) {
        }
        com_ss_android_ugc_aweme_settings_LikoAnalysisConfig com_ss_android_ugc_aweme_settings_likoanalysisconfig = (com_ss_android_ugc_aweme_settings_LikoAnalysisConfig) getProxyValue(this.hook, "dmt_liko_analysis_config", com_ss_android_ugc_aweme_settings_LikoAnalysisConfig.class, (T) obj);
        if (com_ss_android_ugc_aweme_settings_likoanalysisconfig != null) {
            return com_ss_android_ugc_aweme_settings_likoanalysisconfig;
        }
        throw new C10174a();
    }

    public com_ss_android_ugc_aweme_donation_Donation getDonationUrls() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getDonationUrls();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDonationUrls();
        } catch (C10174a unused) {
        }
        com_ss_android_ugc_aweme_donation_Donation com_ss_android_ugc_aweme_donation_donation = (com_ss_android_ugc_aweme_donation_Donation) getProxyValue(this.hook, "donation_urls", com_ss_android_ugc_aweme_donation_Donation.class, (T) obj);
        if (com_ss_android_ugc_aweme_donation_donation != null) {
            return com_ss_android_ugc_aweme_donation_donation;
        }
        throw new C10174a();
    }

    public DouyinFeBusiness getDouyinFeBusiness() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getDouyinFeBusiness();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDouyinFeBusiness();
        } catch (C10174a unused) {
        }
        DouyinFeBusiness douyinFeBusiness = (DouyinFeBusiness) getProxyValue(this.hook, "douyin_fe_business", DouyinFeBusiness.class, (T) obj);
        if (douyinFeBusiness != null) {
            return douyinFeBusiness;
        }
        throw new C10174a();
    }

    public DouyinOrderSetting getDouyinOrder() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getDouyinOrder();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDouyinOrder();
        } catch (C10174a unused) {
        }
        DouyinOrderSetting douyinOrderSetting = (DouyinOrderSetting) getProxyValue(this.hook, "douyin_order", DouyinOrderSetting.class, (T) obj);
        if (douyinOrderSetting != null) {
            return douyinOrderSetting;
        }
        throw new C10174a();
    }

    public Integer getDownloadSettingEnable() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getDownloadSettingEnable();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDownloadSettingEnable();
        } catch (C10174a unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "download_setting_enable", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new C10174a();
    }

    public com_ss_android_ugc_aweme_discover_abtest_modules_SearchTabTitle getDynamicSearchResultTabTitle() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getDynamicSearchResultTabTitle();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getDynamicSearchResultTabTitle();
        } catch (C10174a unused) {
        }
        com_ss_android_ugc_aweme_discover_abtest_modules_SearchTabTitle com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle = (com_ss_android_ugc_aweme_discover_abtest_modules_SearchTabTitle) getProxyValue(this.hook, "dynamic_search_result_tab_title", com_ss_android_ugc_aweme_discover_abtest_modules_SearchTabTitle.class, (T) obj);
        if (com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle != null) {
            return com_ss_android_ugc_aweme_discover_abtest_modules_searchtabtitle;
        }
        throw new C10174a();
    }

    public EPlatformSettings getEPlatformSettings() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getEPlatformSettings();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEPlatformSettings();
        } catch (C10174a unused) {
        }
        EPlatformSettings ePlatformSettings = (EPlatformSettings) getProxyValue(this.hook, "e_platform_settings", EPlatformSettings.class, (T) obj);
        if (ePlatformSettings != null) {
            return ePlatformSettings;
        }
        throw new C10174a();
    }

    public String getEffectSdkConfigSettings() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getEffectSdkConfigSettings();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEffectSdkConfigSettings();
        } catch (C10174a unused) {
        }
        String str = (String) getProxyValue(this.hook, "effect_sdk_config_settings", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new C10174a();
    }

    public EmailLoginSettings getEmailLoginSettings() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getEmailLoginSettings();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEmailLoginSettings();
        } catch (C10174a unused) {
        }
        EmailLoginSettings emailLoginSettings = (EmailLoginSettings) getProxyValue(this.hook, "email_login_settings", EmailLoginSettings.class, (T) obj);
        if (emailLoginSettings != null) {
            return emailLoginSettings;
        }
        throw new C10174a();
    }

    public Integer getEnable1080pFastImport() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getEnable1080pFastImport();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnable1080pFastImport();
        } catch (C10174a unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "enable_1080p_fast_import", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new C10174a();
    }

    public Integer getEnable4kImport() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getEnable4kImport();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnable4kImport();
        } catch (C10174a unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "enable_4k_import", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new C10174a();
    }

    public Boolean getEnableAudioAutoPlay() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getEnableAudioAutoPlay();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableAudioAutoPlay();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_audio_auto_play", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public Boolean getEnableAutoRetryRecord() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getEnableAutoRetryRecord();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableAutoRetryRecord();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_auto_retry_record", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public Boolean getEnableCommerceOrder() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getEnableCommerceOrder();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableCommerceOrder();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_commerce_order", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public Boolean getEnableDelayRequest() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getEnableDelayRequest();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableDelayRequest();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_delay_request", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public Boolean getEnableDownloadTtData() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getEnableDownloadTtData();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableDownloadTtData();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_download_tt_data", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public Boolean getEnableHdH264HwDecoder() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getEnableHdH264HwDecoder();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableHdH264HwDecoder();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_hd_h264_hw_decoder", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public Boolean getEnableHqVframe() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getEnableHqVframe();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableHqVframe();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_hq_vframe", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public Boolean getEnableLargeGestureDetectModel() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getEnableLargeGestureDetectModel();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableLargeGestureDetectModel();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_large_gesture_detect_model", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public Boolean getEnableLargeMattingDetectModel() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getEnableLargeMattingDetectModel();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableLargeMattingDetectModel();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_large_matting_detect_model", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public Boolean getEnableLocalMusicEntrance() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getEnableLocalMusicEntrance();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableLocalMusicEntrance();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_local_music_entrance", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public Boolean getEnableOnPageSelectPauseCheck() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getEnableOnPageSelectPauseCheck();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableOnPageSelectPauseCheck();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_on_page_select_pause_check", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public Boolean getEnableReuseEditorForFastimport() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getEnableReuseEditorForFastimport();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableReuseEditorForFastimport();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_reuse_editor_for_fastimport", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public C32843x61052464 getEnableStackLeakChecker() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getEnableStackLeakChecker();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableStackLeakChecker();
        } catch (C10174a unused) {
        }
        C32843x61052464 com_ss_android_ugc_aweme_legoimp_task_dvmlinearallocopttask__stackleakcheckerparams = (C32843x61052464) getProxyValue(this.hook, "enable_stack_leak_checker", C32843x61052464.class, (T) obj);
        if (com_ss_android_ugc_aweme_legoimp_task_dvmlinearallocopttask__stackleakcheckerparams != null) {
            return com_ss_android_ugc_aweme_legoimp_task_dvmlinearallocopttask__stackleakcheckerparams;
        }
        throw new C10174a();
    }

    public Boolean getEnableSymphonySdk() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getEnableSymphonySdk();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableSymphonySdk();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_symphony_sdk", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public Boolean getEnableSyntheticFpsSet() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getEnableSyntheticFpsSet();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableSyntheticFpsSet();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_synthetic_fps_set", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public Boolean getEnableUploadSyncIns() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getEnableUploadSyncIns();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableUploadSyncIns();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_upload_sync_ins", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public Boolean getEnableUploadSyncInsStory() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getEnableUploadSyncInsStory();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableUploadSyncInsStory();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_upload_sync_ins_story", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public Boolean getEnableUploadSyncTwitter() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getEnableUploadSyncTwitter();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableUploadSyncTwitter();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_upload_sync_twitter", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public Integer getEnableVeSingleGl() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getEnableVeSingleGl();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableVeSingleGl();
        } catch (C10174a unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "enable_ve_single_gl", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new C10174a();
    }

    public Boolean getEnableWaterBgMask() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getEnableWaterBgMask();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getEnableWaterBgMask();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "enable_water_bg_mask", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public Integer getFaceDetectInterval() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getFaceDetectInterval();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getFaceDetectInterval();
        } catch (C10174a unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "face_detect_interval", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new C10174a();
    }

    public C32839x1b64b235 getFamiliarImGroupConfig() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getFamiliarImGroupConfig();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getFamiliarImGroupConfig();
        } catch (C10174a unused) {
        }
        C32839x1b64b235 com_ss_android_ugc_aweme_im_sdk_group_model_familiargroupenhanceconfig = (C32839x1b64b235) getProxyValue(this.hook, "familiar_im_group_config", C32839x1b64b235.class, (T) obj);
        if (com_ss_android_ugc_aweme_im_sdk_group_model_familiargroupenhanceconfig != null) {
            return com_ss_android_ugc_aweme_im_sdk_group_model_familiargroupenhanceconfig;
        }
        throw new C10174a();
    }

    public FeAnchorAdConf getFeAnchorAdConf() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getFeAnchorAdConf();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getFeAnchorAdConf();
        } catch (C10174a unused) {
        }
        FeAnchorAdConf feAnchorAdConf = (FeAnchorAdConf) getProxyValue(this.hook, "fe_anchor_ad_conf", FeAnchorAdConf.class, (T) obj);
        if (feAnchorAdConf != null) {
            return feAnchorAdConf;
        }
        throw new C10174a();
    }

    public FeConfigCollection getFeConfigCollection() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getFeConfigCollection();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getFeConfigCollection();
        } catch (C10174a unused) {
        }
        FeConfigCollection feConfigCollection = (FeConfigCollection) getProxyValue(this.hook, "fe_config_collection", FeConfigCollection.class, (T) obj);
        if (feConfigCollection != null) {
            return feConfigCollection;
        }
        throw new C10174a();
    }

    public com_ss_android_ugc_aweme_feed_helper_FeedSurveyConfig getFeedSurvey() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getFeedSurvey();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getFeedSurvey();
        } catch (C10174a unused) {
        }
        com_ss_android_ugc_aweme_feed_helper_FeedSurveyConfig com_ss_android_ugc_aweme_feed_helper_feedsurveyconfig = (com_ss_android_ugc_aweme_feed_helper_FeedSurveyConfig) getProxyValue(this.hook, "feed_survey", com_ss_android_ugc_aweme_feed_helper_FeedSurveyConfig.class, (T) obj);
        if (com_ss_android_ugc_aweme_feed_helper_feedsurveyconfig != null) {
            return com_ss_android_ugc_aweme_feed_helper_feedsurveyconfig;
        }
        throw new C10174a();
    }

    public FeedbackConf getFeedbackConf() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getFeedbackConf();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getFeedbackConf();
        } catch (C10174a unused) {
        }
        FeedbackConf feedbackConf = (FeedbackConf) getProxyValue(this.hook, "feedback_conf", FeedbackConf.class, (T) obj);
        if (feedbackConf != null) {
            return feedbackConf;
        }
        throw new C10174a();
    }

    public FlexibleUpdateStrategy getFlexibleUpdateStrategy() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getFlexibleUpdateStrategy();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getFlexibleUpdateStrategy();
        } catch (C10174a unused) {
        }
        FlexibleUpdateStrategy flexibleUpdateStrategy = (FlexibleUpdateStrategy) getProxyValue(this.hook, "flexible_update_strategy", FlexibleUpdateStrategy.class, (T) obj);
        if (flexibleUpdateStrategy != null) {
            return flexibleUpdateStrategy;
        }
        throw new C10174a();
    }

    public FlipChatSettings getFlipchatSettings() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getFlipchatSettings();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getFlipchatSettings();
        } catch (C10174a unused) {
        }
        FlipChatSettings flipChatSettings = (FlipChatSettings) getProxyValue(this.hook, "flipchat_settings", FlipChatSettings.class, (T) obj);
        if (flipChatSettings != null) {
            return flipChatSettings;
        }
        throw new C10174a();
    }

    public Integer getFollowTabLiveType() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getFollowTabLiveType();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getFollowTabLiveType();
        } catch (C10174a unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "follow_tab_live_type", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new C10174a();
    }

    public Boolean getForbidLifeStoryLocalWatermark() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getForbidLifeStoryLocalWatermark();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getForbidLifeStoryLocalWatermark();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "forbid_life_story_local_watermark", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public Boolean getForbidLocalWatermark() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getForbidLocalWatermark();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getForbidLocalWatermark();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "forbid_local_watermark", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public com_ss_android_ugc_aweme_pendant_setting_ShredConfigurationData getFragmentsConfiguration() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getFragmentsConfiguration();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getFragmentsConfiguration();
        } catch (C10174a unused) {
        }
        com_ss_android_ugc_aweme_pendant_setting_ShredConfigurationData com_ss_android_ugc_aweme_pendant_setting_shredconfigurationdata = (com_ss_android_ugc_aweme_pendant_setting_ShredConfigurationData) getProxyValue(this.hook, "fragments_configuration", com_ss_android_ugc_aweme_pendant_setting_ShredConfigurationData.class, (T) obj);
        if (com_ss_android_ugc_aweme_pendant_setting_shredconfigurationdata != null) {
            return com_ss_android_ugc_aweme_pendant_setting_shredconfigurationdata;
        }
        throw new C10174a();
    }

    public String getFreeFlowCardUrlSticker() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getFreeFlowCardUrlSticker();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getFreeFlowCardUrlSticker();
        } catch (C10174a unused) {
        }
        String str = (String) getProxyValue(this.hook, "free_flow_card_url_sticker", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new C10174a();
    }

    public C32852x5d1ca36c getGradientPunishWarning() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getGradientPunishWarning();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getGradientPunishWarning();
        } catch (C10174a unused) {
        }
        C32852x5d1ca36c com_ss_android_ugc_aweme_protection_gradientpunish_gradientpunishwarning = (C32852x5d1ca36c) getProxyValue(this.hook, "gradient_punish_warning", C32852x5d1ca36c.class, (T) obj);
        if (com_ss_android_ugc_aweme_protection_gradientpunish_gradientpunishwarning != null) {
            return com_ss_android_ugc_aweme_protection_gradientpunish_gradientpunishwarning;
        }
        throw new C10174a();
    }

    public com_ss_android_ugc_aweme_experiment_RegexpString getHandleSettings() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getHandleSettings();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getHandleSettings();
        } catch (C10174a unused) {
        }
        com_ss_android_ugc_aweme_experiment_RegexpString com_ss_android_ugc_aweme_experiment_regexpstring = (com_ss_android_ugc_aweme_experiment_RegexpString) getProxyValue(this.hook, "handle_settings", com_ss_android_ugc_aweme_experiment_RegexpString.class, (T) obj);
        if (com_ss_android_ugc_aweme_experiment_regexpstring != null) {
            return com_ss_android_ugc_aweme_experiment_regexpstring;
        }
        throw new C10174a();
    }

    public Integer getHdHwDecoderMinSideSize() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getHdHwDecoderMinSideSize();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getHdHwDecoderMinSideSize();
        } catch (C10174a unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "hd_hw_decoder_min_side_size", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new C10174a();
    }

    public HotSearchWitch getHotsearchSwitchs() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getHotsearchSwitchs();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getHotsearchSwitchs();
        } catch (C10174a unused) {
        }
        HotSearchWitch hotSearchWitch = (HotSearchWitch) getProxyValue(this.hook, "hotsearch_switchs", HotSearchWitch.class, (T) obj);
        if (hotSearchWitch != null) {
            return hotSearchWitch;
        }
        throw new C10174a();
    }

    public Long getHttpRetryInterval() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getHttpRetryInterval();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getHttpRetryInterval();
        } catch (C10174a unused) {
        }
        Long l = (Long) getProxyValue(this.hook, "http_retry_interval", Long.class, (T) obj);
        if (l != null) {
            return l;
        }
        throw new C10174a();
    }

    public Long getHttpTimeout() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getHttpTimeout();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getHttpTimeout();
        } catch (C10174a unused) {
        }
        Long l = (Long) getProxyValue(this.hook, "http_timeout", Long.class, (T) obj);
        if (l != null) {
            return l;
        }
        throw new C10174a();
    }

    public HybridMonitorConfig getHybridMonitorConfig() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getHybridMonitorConfig();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getHybridMonitorConfig();
        } catch (C10174a unused) {
        }
        HybridMonitorConfig hybridMonitorConfig = (HybridMonitorConfig) getProxyValue(this.hook, "hybrid_monitor_config", HybridMonitorConfig.class, (T) obj);
        if (hybridMonitorConfig != null) {
            return hybridMonitorConfig;
        }
        throw new C10174a();
    }

    public C32835x4e6f0043 getImContactUpdateFreq() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getImContactUpdateFreq();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getImContactUpdateFreq();
        } catch (C10174a unused) {
        }
        C32835x4e6f0043 com_ss_android_ugc_aweme_im_sdk_abtest_relationfetchfrequencyconfig = (C32835x4e6f0043) getProxyValue(this.hook, "im_contact_update_freq", C32835x4e6f0043.class, (T) obj);
        if (com_ss_android_ugc_aweme_im_sdk_abtest_relationfetchfrequencyconfig != null) {
            return com_ss_android_ugc_aweme_im_sdk_abtest_relationfetchfrequencyconfig;
        }
        throw new C10174a();
    }

    public Integer getImContactsMultiSelectLimit() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getImContactsMultiSelectLimit();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getImContactsMultiSelectLimit();
        } catch (C10174a unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "im_contacts_multi_select_limit", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new C10174a();
    }

    public ImCreateChatBubble getImCreateChatBubble() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getImCreateChatBubble();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getImCreateChatBubble();
        } catch (C10174a unused) {
        }
        ImCreateChatBubble imCreateChatBubble = (ImCreateChatBubble) getProxyValue(this.hook, "im_create_chat_bubble", ImCreateChatBubble.class, (T) obj);
        if (imCreateChatBubble != null) {
            return imCreateChatBubble;
        }
        throw new C10174a();
    }

    public C32831xe2fc6015 getImFriendRelationUpdateSettings() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getImFriendRelationUpdateSettings();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getImFriendRelationUpdateSettings();
        } catch (C10174a unused) {
        }
        C32831xe2fc6015 com_ss_android_ugc_aweme_im_sdk_abtest_familiarsrelationfetchconfig = (C32831xe2fc6015) getProxyValue(this.hook, "im_friend_relation_update_settings", C32831xe2fc6015.class, (T) obj);
        if (com_ss_android_ugc_aweme_im_sdk_abtest_familiarsrelationfetchconfig != null) {
            return com_ss_android_ugc_aweme_im_sdk_abtest_familiarsrelationfetchconfig;
        }
        throw new C10174a();
    }

    public com_ss_android_ugc_aweme_im_sdk_abtest_ImCreateChatV2Config getImGroupChatBubbleV2SettingConfig() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getImGroupChatBubbleV2SettingConfig();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getImGroupChatBubbleV2SettingConfig();
        } catch (C10174a unused) {
        }
        com_ss_android_ugc_aweme_im_sdk_abtest_ImCreateChatV2Config com_ss_android_ugc_aweme_im_sdk_abtest_imcreatechatv2config = (com_ss_android_ugc_aweme_im_sdk_abtest_ImCreateChatV2Config) getProxyValue(this.hook, "im_group_chat_bubble_v2_setting_config", com_ss_android_ugc_aweme_im_sdk_abtest_ImCreateChatV2Config.class, (T) obj);
        if (com_ss_android_ugc_aweme_im_sdk_abtest_imcreatechatv2config != null) {
            return com_ss_android_ugc_aweme_im_sdk_abtest_imcreatechatv2config;
        }
        throw new C10174a();
    }

    public String getImUrlTemplate() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getImUrlTemplate();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getImUrlTemplate();
        } catch (C10174a unused) {
        }
        String str = (String) getProxyValue(this.hook, "im_url_template", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new C10174a();
    }

    public IMUseOkHttpClientConfig getImUseOkhttpclient() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getImUseOkhttpclient();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getImUseOkhttpclient();
        } catch (C10174a unused) {
        }
        IMUseOkHttpClientConfig iMUseOkHttpClientConfig = (IMUseOkHttpClientConfig) getProxyValue(this.hook, "im_use_okhttpclient", IMUseOkHttpClientConfig.class, (T) obj);
        if (iMUseOkHttpClientConfig != null) {
            return iMUseOkHttpClientConfig;
        }
        throw new C10174a();
    }

    public IMXPlanSetting getImXDisplayStyleConfig() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getImXDisplayStyleConfig();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getImXDisplayStyleConfig();
        } catch (C10174a unused) {
        }
        IMXPlanSetting iMXPlanSetting = (IMXPlanSetting) getProxyValue(this.hook, "im_x_display_style_config", IMXPlanSetting.class, (T) obj);
        if (iMXPlanSetting != null) {
            return iMXPlanSetting;
        }
        throw new C10174a();
    }

    public com_ss_android_ugc_aweme_im_sdk_abtest_XDownloadConfig getImXDownload() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getImXDownload();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getImXDownload();
        } catch (C10174a unused) {
        }
        com_ss_android_ugc_aweme_im_sdk_abtest_XDownloadConfig com_ss_android_ugc_aweme_im_sdk_abtest_xdownloadconfig = (com_ss_android_ugc_aweme_im_sdk_abtest_XDownloadConfig) getProxyValue(this.hook, "im_x_download", com_ss_android_ugc_aweme_im_sdk_abtest_XDownloadConfig.class, (T) obj);
        if (com_ss_android_ugc_aweme_im_sdk_abtest_xdownloadconfig != null) {
            return com_ss_android_ugc_aweme_im_sdk_abtest_xdownloadconfig;
        }
        throw new C10174a();
    }

    public Integer getImXUnreadCountStrategy() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getImXUnreadCountStrategy();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getImXUnreadCountStrategy();
        } catch (C10174a unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "im_x_unread_count_strategy", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new C10174a();
    }

    public Integer getImXUseEncryptedImage() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getImXUseEncryptedImage();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getImXUseEncryptedImage();
        } catch (C10174a unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "im_x_use_encrypted_image", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new C10174a();
    }

    public String getImpressionPageSchema() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getImpressionPageSchema();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getImpressionPageSchema();
        } catch (C10174a unused) {
        }
        String str = (String) getProxyValue(this.hook, "impression_page_schema", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new C10174a();
    }

    public Integer getInCamera2BlackList() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getInCamera2BlackList();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getInCamera2BlackList();
        } catch (C10174a unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "in_camera2_black_list", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new C10174a();
    }

    public Integer getInEvening() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getInEvening();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getInEvening();
        } catch (C10174a unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "in_evening", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new C10174a();
    }

    public com_ss_android_ugc_aweme_account_login_InsRecoverSetting getInsRecoverAccountUrl() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getInsRecoverAccountUrl();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getInsRecoverAccountUrl();
        } catch (C10174a unused) {
        }
        com_ss_android_ugc_aweme_account_login_InsRecoverSetting com_ss_android_ugc_aweme_account_login_insrecoversetting = (com_ss_android_ugc_aweme_account_login_InsRecoverSetting) getProxyValue(this.hook, "ins_recover_account_url", com_ss_android_ugc_aweme_account_login_InsRecoverSetting.class, (T) obj);
        if (com_ss_android_ugc_aweme_account_login_insrecoversetting != null) {
            return com_ss_android_ugc_aweme_account_login_insrecoversetting;
        }
        throw new C10174a();
    }

    public Integer getIsEnableSplashFirstShowRetrieval() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getIsEnableSplashFirstShowRetrieval();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getIsEnableSplashFirstShowRetrieval();
        } catch (C10174a unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "is_enable_splash_first_show_retrieval", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new C10174a();
    }

    public com_ss_android_jank_JankConfig getJankMonitorConfig() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getJankMonitorConfig();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getJankMonitorConfig();
        } catch (C10174a unused) {
        }
        com_ss_android_jank_JankConfig com_ss_android_jank_jankconfig = (com_ss_android_jank_JankConfig) getProxyValue(this.hook, "jank_monitor_config", com_ss_android_jank_JankConfig.class, (T) obj);
        if (com_ss_android_jank_jankconfig != null) {
            return com_ss_android_jank_jankconfig;
        }
        throw new C10174a();
    }

    public Boolean getLifeEffectsColdReq() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getLifeEffectsColdReq();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getLifeEffectsColdReq();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "life_effects_cold_req", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public LikePraiseDialogInfo getLikePraiseDialogInfo() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getLikePraiseDialogInfo();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getLikePraiseDialogInfo();
        } catch (C10174a unused) {
        }
        LikePraiseDialogInfo likePraiseDialogInfo = (LikePraiseDialogInfo) getProxyValue(this.hook, "like_praise_dialog_info", LikePraiseDialogInfo.class, (T) obj);
        if (likePraiseDialogInfo != null) {
            return likePraiseDialogInfo;
        }
        throw new C10174a();
    }

    public LiveCnySetting getLiveCnySettings() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getLiveCnySettings();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getLiveCnySettings();
        } catch (C10174a unused) {
        }
        LiveCnySetting liveCnySetting = (LiveCnySetting) getProxyValue(this.hook, "live_cny_settings", LiveCnySetting.class, (T) obj);
        if (liveCnySetting != null) {
            return liveCnySetting;
        }
        throw new C10174a();
    }

    public LiveInnerPushConfig getLiveInnerPushConfig() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getLiveInnerPushConfig();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getLiveInnerPushConfig();
        } catch (C10174a unused) {
        }
        LiveInnerPushConfig liveInnerPushConfig = (LiveInnerPushConfig) getProxyValue(this.hook, "live_inner_push_config", LiveInnerPushConfig.class, (T) obj);
        if (liveInnerPushConfig != null) {
            return liveInnerPushConfig;
        }
        throw new C10174a();
    }

    public Integer getLocalVideoCacheMaxAge() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getLocalVideoCacheMaxAge();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getLocalVideoCacheMaxAge();
        } catch (C10174a unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "local_video_cache_max_age", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new C10174a();
    }

    public Integer getLocalVideoCacheMaxLength() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getLocalVideoCacheMaxLength();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getLocalVideoCacheMaxLength();
        } catch (C10174a unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "local_video_cache_max_length", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new C10174a();
    }

    public Boolean getLongVideoPermitted() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getLongVideoPermitted();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getLongVideoPermitted();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "long_video_permitted", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public Long getLongVideoThreshold() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getLongVideoThreshold();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getLongVideoThreshold();
        } catch (C10174a unused) {
        }
        Long l = (Long) getProxyValue(this.hook, "long_video_threshold", Long.class, (T) obj);
        if (l != null) {
            return l;
        }
        throw new C10174a();
    }

    public Integer getMiniappPreloadEnbale() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getMiniappPreloadEnbale();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getMiniappPreloadEnbale();
        } catch (C10174a unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "miniapp_preload_enbale", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new C10174a();
    }

    public String getMovieDetail() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getMovieDetail();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getMovieDetail();
        } catch (C10174a unused) {
        }
        String str = (String) getProxyValue(this.hook, "movie_detail", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new C10174a();
    }

    public MtcertSettings getMtcertSettings() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getMtcertSettings();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getMtcertSettings();
        } catch (C10174a unused) {
        }
        MtcertSettings mtcertSettings = (MtcertSettings) getProxyValue(this.hook, "mtcert_settings", MtcertSettings.class, (T) obj);
        if (mtcertSettings != null) {
            return mtcertSettings;
        }
        throw new C10174a();
    }

    public Boolean getMusicCopyrightGranted() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getMusicCopyrightGranted();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getMusicCopyrightGranted();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "music_copyright_granted", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public Integer getMusicianShowType() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getMusicianShowType();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getMusicianShowType();
        } catch (C10174a unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "musician_show_type", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new C10174a();
    }

    public com_ss_android_ugc_aweme_feed_model_nearby_NearbyDistance getNearbyDistance() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getNearbyDistance();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getNearbyDistance();
        } catch (C10174a unused) {
        }
        com_ss_android_ugc_aweme_feed_model_nearby_NearbyDistance com_ss_android_ugc_aweme_feed_model_nearby_nearbydistance = (com_ss_android_ugc_aweme_feed_model_nearby_NearbyDistance) getProxyValue(this.hook, "nearby_distance", com_ss_android_ugc_aweme_feed_model_nearby_NearbyDistance.class, (T) obj);
        if (com_ss_android_ugc_aweme_feed_model_nearby_nearbydistance != null) {
            return com_ss_android_ugc_aweme_feed_model_nearby_nearbydistance;
        }
        throw new C10174a();
    }

    public com_ss_android_ugc_network_observer_bean_DetectorParam getNetworkMonitorConfig() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getNetworkMonitorConfig();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getNetworkMonitorConfig();
        } catch (C10174a unused) {
        }
        com_ss_android_ugc_network_observer_bean_DetectorParam com_ss_android_ugc_network_observer_bean_detectorparam = (com_ss_android_ugc_network_observer_bean_DetectorParam) getProxyValue(this.hook, "network_monitor_config", com_ss_android_ugc_network_observer_bean_DetectorParam.class, (T) obj);
        if (com_ss_android_ugc_network_observer_bean_detectorparam != null) {
            return com_ss_android_ugc_network_observer_bean_detectorparam;
        }
        throw new C10174a();
    }

    public NewAnchorShowBubbleSettings getNewAnchorShowBubbleSettings() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getNewAnchorShowBubbleSettings();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getNewAnchorShowBubbleSettings();
        } catch (C10174a unused) {
        }
        NewAnchorShowBubbleSettings newAnchorShowBubbleSettings = (NewAnchorShowBubbleSettings) getProxyValue(this.hook, "new_anchor_show_bubble_settings", NewAnchorShowBubbleSettings.class, (T) obj);
        if (newAnchorShowBubbleSettings != null) {
            return newAnchorShowBubbleSettings;
        }
        throw new C10174a();
    }

    public C32848xd5542823 getNoticeCollapsibility() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getNoticeCollapsibility();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getNoticeCollapsibility();
        } catch (C10174a unused) {
        }
        C32848xd5542823 com_ss_android_ugc_aweme_notification_newstyle_noticecollapsibility = (C32848xd5542823) getProxyValue(this.hook, "notice_collapsibility", C32848xd5542823.class, (T) obj);
        if (com_ss_android_ugc_aweme_notification_newstyle_noticecollapsibility != null) {
            return com_ss_android_ugc_aweme_notification_newstyle_noticecollapsibility;
        }
        throw new C10174a();
    }

    public Integer getOpenImLink() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getOpenImLink();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getOpenImLink();
        } catch (C10174a unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "open_im_link", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new C10174a();
    }

    public String getOrginalMusicianUrl() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getOrginalMusicianUrl();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getOrginalMusicianUrl();
        } catch (C10174a unused) {
        }
        String str = (String) getProxyValue(this.hook, "orginal_musician_url", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new C10174a();
    }

    public Boolean getOriginalMusicianEntry() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getOriginalMusicianEntry();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getOriginalMusicianEntry();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "original_musician_entry", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public PoiSetting getPoiSetting() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getPoiSetting();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getPoiSetting();
        } catch (C10174a unused) {
        }
        PoiSetting poiSetting = (PoiSetting) getProxyValue(this.hook, "poi_setting", PoiSetting.class, (T) obj);
        if (poiSetting != null) {
            return poiSetting;
        }
        throw new C10174a();
    }

    public PopupBlackList getPopupBlackList() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getPopupBlackList();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getPopupBlackList();
        } catch (C10174a unused) {
        }
        PopupBlackList popupBlackList = (PopupBlackList) getProxyValue(this.hook, "popup_black_list", PopupBlackList.class, (T) obj);
        if (popupBlackList != null) {
            return popupBlackList;
        }
        throw new C10174a();
    }

    public Integer getPreUploadMemoryLimit() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getPreUploadMemoryLimit();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getPreUploadMemoryLimit();
        } catch (C10174a unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "pre_upload_memory_limit", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new C10174a();
    }

    public Boolean getPrivateAvailable() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getPrivateAvailable();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getPrivateAvailable();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "private_available", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public ProAccountEnableDetailInfo getProAccountEnableDetailInfo() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getProAccountEnableDetailInfo();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getProAccountEnableDetailInfo();
        } catch (C10174a unused) {
        }
        ProAccountEnableDetailInfo proAccountEnableDetailInfo = (ProAccountEnableDetailInfo) getProxyValue(this.hook, "pro_account_enable_detail_info", ProAccountEnableDetailInfo.class, (T) obj);
        if (proAccountEnableDetailInfo != null) {
            return proAccountEnableDetailInfo;
        }
        throw new C10174a();
    }

    public Boolean getProfilePageSkipRemove() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getProfilePageSkipRemove();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getProfilePageSkipRemove();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "profile_page_skip_remove", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public Long getProgressbarThreshold() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getProgressbarThreshold();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getProgressbarThreshold();
        } catch (C10174a unused) {
        }
        Long l = (Long) getProxyValue(this.hook, "progressbar_threshold", Long.class, (T) obj);
        if (l != null) {
            return l;
        }
        throw new C10174a();
    }

    public pushGuideInfo getPushGuideInfo() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getPushGuideInfo();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getPushGuideInfo();
        } catch (C10174a unused) {
        }
        pushGuideInfo pushguideinfo = (pushGuideInfo) getProxyValue(this.hook, "push_guide_info", pushGuideInfo.class, (T) obj);
        if (pushguideinfo != null) {
            return pushguideinfo;
        }
        throw new C10174a();
    }

    public QuickShopLoadingPage getQuickShopLoadingPage() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getQuickShopLoadingPage();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getQuickShopLoadingPage();
        } catch (C10174a unused) {
        }
        QuickShopLoadingPage quickShopLoadingPage = (QuickShopLoadingPage) getProxyValue(this.hook, "quick_shop_loading_page", QuickShopLoadingPage.class, (T) obj);
        if (quickShopLoadingPage != null) {
            return quickShopLoadingPage;
        }
        throw new C10174a();
    }

    public Integer getReactMicStatus() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getReactMicStatus();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getReactMicStatus();
        } catch (C10174a unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "react_mic_status", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new C10174a();
    }

    public Integer getRecordBitrateMode() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getRecordBitrateMode();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getRecordBitrateMode();
        } catch (C10174a unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "record_bitrate_mode", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new C10174a();
    }

    public Integer getRecordCameraCompatLevel() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getRecordCameraCompatLevel();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getRecordCameraCompatLevel();
        } catch (C10174a unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "record_camera_compat_level", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new C10174a();
    }

    public Integer getRecordCameraType() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getRecordCameraType();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getRecordCameraType();
        } catch (C10174a unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "record_camera_type", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new C10174a();
    }

    public Integer getRecordOpenHighProfile() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getRecordOpenHighProfile();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getRecordOpenHighProfile();
        } catch (C10174a unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "record_open_high_profile", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new C10174a();
    }

    public com_ss_android_ugc_aweme_legoImp_task_SafeModeSettingModel getSafeModeSettings() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getSafeModeSettings();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getSafeModeSettings();
        } catch (C10174a unused) {
        }
        com_ss_android_ugc_aweme_legoImp_task_SafeModeSettingModel com_ss_android_ugc_aweme_legoimp_task_safemodesettingmodel = (com_ss_android_ugc_aweme_legoImp_task_SafeModeSettingModel) getProxyValue(this.hook, "safe_mode_settings", com_ss_android_ugc_aweme_legoImp_task_SafeModeSettingModel.class, (T) obj);
        if (com_ss_android_ugc_aweme_legoimp_task_safemodesettingmodel != null) {
            return com_ss_android_ugc_aweme_legoimp_task_safemodesettingmodel;
        }
        throw new C10174a();
    }

    public SearchPullFeedbackStruct getSearchPullFeedback() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getSearchPullFeedback();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getSearchPullFeedback();
        } catch (C10174a unused) {
        }
        SearchPullFeedbackStruct searchPullFeedbackStruct = (SearchPullFeedbackStruct) getProxyValue(this.hook, "search_pull_feedback", SearchPullFeedbackStruct.class, (T) obj);
        if (searchPullFeedbackStruct != null) {
            return searchPullFeedbackStruct;
        }
        throw new C10174a();
    }

    public Integer getShakeFreeWhiteList() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getShakeFreeWhiteList();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getShakeFreeWhiteList();
        } catch (C10174a unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "shake_free_white_list", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new C10174a();
    }

    public Boolean getShieldMusicSdk() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getShieldMusicSdk();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getShieldMusicSdk();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "shield_music_sdk", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public String getShootTutorialLink() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getShootTutorialLink();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getShootTutorialLink();
        } catch (C10174a unused) {
        }
        String str = (String) getProxyValue(this.hook, "shoot_tutorial_link", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new C10174a();
    }

    public ShoppingConfig getShopping() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getShopping();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getShopping();
        } catch (C10174a unused) {
        }
        ShoppingConfig shoppingConfig = (ShoppingConfig) getProxyValue(this.hook, "shopping", ShoppingConfig.class, (T) obj);
        if (shoppingConfig != null) {
            return shoppingConfig;
        }
        throw new C10174a();
    }

    public Boolean getShowMusicFeedbackEntrance() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getShowMusicFeedbackEntrance();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getShowMusicFeedbackEntrance();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "show_music_feedback_entrance", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public Boolean getShowRocketShareIfInstall() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getShowRocketShareIfInstall();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getShowRocketShareIfInstall();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "show_rocket_share_if_install", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public Boolean getShutterSoundEnable() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getShutterSoundEnable();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getShutterSoundEnable();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "shutter_sound_enable", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public Boolean getSilentShareConfigurable() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getSilentShareConfigurable();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getSilentShareConfigurable();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "silent_share_configurable", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public Long getSplashPreloadDelay() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getSplashPreloadDelay();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getSplashPreloadDelay();
        } catch (C10174a unused) {
        }
        Long l = (Long) getProxyValue(this.hook, "splash_preload_delay", Long.class, (T) obj);
        if (l != null) {
            return l;
        }
        throw new C10174a();
    }

    public SpringApiLimitConfig getSpringApiLimitConfig() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getSpringApiLimitConfig();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getSpringApiLimitConfig();
        } catch (C10174a unused) {
        }
        SpringApiLimitConfig springApiLimitConfig = (SpringApiLimitConfig) getProxyValue(this.hook, "spring_api_limit_config", SpringApiLimitConfig.class, (T) obj);
        if (springApiLimitConfig != null) {
            return springApiLimitConfig;
        }
        throw new C10174a();
    }

    public Integer getStatisticsBackupPct() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getStatisticsBackupPct();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getStatisticsBackupPct();
        } catch (C10174a unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "statistics_backup_pct", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new C10174a();
    }

    public String getStickerArtistIconUrl() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getStickerArtistIconUrl();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getStickerArtistIconUrl();
        } catch (C10174a unused) {
        }
        String str = (String) getProxyValue(this.hook, "sticker_artist_icon_url", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new C10174a();
    }

    public Integer getStoryImagePlayTime() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getStoryImagePlayTime();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getStoryImagePlayTime();
        } catch (C10174a unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "story_image_play_time", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new C10174a();
    }

    public Boolean getStorySupportAnimate() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getStorySupportAnimate();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getStorySupportAnimate();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "story_support_animate", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public SuperEntranceConfig getSuperEntranceConfig() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getSuperEntranceConfig();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getSuperEntranceConfig();
        } catch (C10174a unused) {
        }
        SuperEntranceConfig superEntranceConfig = (SuperEntranceConfig) getProxyValue(this.hook, "super_entrance_config", SuperEntranceConfig.class, (T) obj);
        if (superEntranceConfig != null) {
            return superEntranceConfig;
        }
        throw new C10174a();
    }

    public com_ss_android_ugc_aweme_familiar_DuoshanSyncProp getSyncToDuoshanProp() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getSyncToDuoshanProp();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getSyncToDuoshanProp();
        } catch (C10174a unused) {
        }
        com_ss_android_ugc_aweme_familiar_DuoshanSyncProp com_ss_android_ugc_aweme_familiar_duoshansyncprop = (com_ss_android_ugc_aweme_familiar_DuoshanSyncProp) getProxyValue(this.hook, "sync_to_duoshan_prop", com_ss_android_ugc_aweme_familiar_DuoshanSyncProp.class, (T) obj);
        if (com_ss_android_ugc_aweme_familiar_duoshansyncprop != null) {
            return com_ss_android_ugc_aweme_familiar_duoshansyncprop;
        }
        throw new C10174a();
    }

    public Float getSyntheticVideoBitrate() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getSyntheticVideoBitrate();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getSyntheticVideoBitrate();
        } catch (C10174a unused) {
        }
        Float f = (Float) getProxyValue(this.hook, "synthetic_video_bitrate", Float.class, (T) obj);
        if (f != null) {
            return f;
        }
        throw new C10174a();
    }

    public Integer getSyntheticVideoGop() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getSyntheticVideoGop();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getSyntheticVideoGop();
        } catch (C10174a unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "synthetic_video_gop", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new C10174a();
    }

    public Long getSyntheticVideoMaxrate() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getSyntheticVideoMaxrate();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getSyntheticVideoMaxrate();
        } catch (C10174a unused) {
        }
        Long l = (Long) getProxyValue(this.hook, "synthetic_video_maxrate", Long.class, (T) obj);
        if (l != null) {
            return l;
        }
        throw new C10174a();
    }

    public Integer getSyntheticVideoPreset() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getSyntheticVideoPreset();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getSyntheticVideoPreset();
        } catch (C10174a unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "synthetic_video_preset", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new C10174a();
    }

    public Integer getSyntheticVideoQuality() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getSyntheticVideoQuality();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getSyntheticVideoQuality();
        } catch (C10174a unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "synthetic_video_quality", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new C10174a();
    }

    public com_ss_android_ugc_aweme_profile_settings_ThirdPartyBindingEntry getThirdPartyBinding() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getThirdPartyBinding();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getThirdPartyBinding();
        } catch (C10174a unused) {
        }
        com_ss_android_ugc_aweme_profile_settings_ThirdPartyBindingEntry com_ss_android_ugc_aweme_profile_settings_thirdpartybindingentry = (com_ss_android_ugc_aweme_profile_settings_ThirdPartyBindingEntry) getProxyValue(this.hook, "third_party_binding", com_ss_android_ugc_aweme_profile_settings_ThirdPartyBindingEntry.class, (T) obj);
        if (com_ss_android_ugc_aweme_profile_settings_thirdpartybindingentry != null) {
            return com_ss_android_ugc_aweme_profile_settings_thirdpartybindingentry;
        }
        throw new C10174a();
    }

    public Integer getThirdPartyDataRefresh() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getThirdPartyDataRefresh();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getThirdPartyDataRefresh();
        } catch (C10174a unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "third_party_data_refresh", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new C10174a();
    }

    public com_ss_android_ugc_aweme_ug_settings_UgcPermission getUgcPermissionSetting() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getUgcPermissionSetting();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getUgcPermissionSetting();
        } catch (C10174a unused) {
        }
        com_ss_android_ugc_aweme_ug_settings_UgcPermission com_ss_android_ugc_aweme_ug_settings_ugcpermission = (com_ss_android_ugc_aweme_ug_settings_UgcPermission) getProxyValue(this.hook, "ugc_permission_setting", com_ss_android_ugc_aweme_ug_settings_UgcPermission.class, (T) obj);
        if (com_ss_android_ugc_aweme_ug_settings_ugcpermission != null) {
            return com_ss_android_ugc_aweme_ug_settings_ugcpermission;
        }
        throw new C10174a();
    }

    public UlikeParams getUlikeParams() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getUlikeParams();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getUlikeParams();
        } catch (C10174a unused) {
        }
        UlikeParams ulikeParams = (UlikeParams) getProxyValue(this.hook, "ulike_params", UlikeParams.class, (T) obj);
        if (ulikeParams != null) {
            return ulikeParams;
        }
        throw new C10174a();
    }

    public Integer getUploadContactsNoticeInterval() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getUploadContactsNoticeInterval();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getUploadContactsNoticeInterval();
        } catch (C10174a unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "upload_contacts_notice_interval", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new C10174a();
    }

    public Integer getUploadContactsNoticeTimes() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getUploadContactsNoticeTimes();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getUploadContactsNoticeTimes();
        } catch (C10174a unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "upload_contacts_notice_times", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new C10174a();
    }

    public Boolean getUploadOriginAudioTrack() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getUploadOriginAudioTrack();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getUploadOriginAudioTrack();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "upload_origin_audio_track", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public Integer getUseHardcode() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getUseHardcode();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getUseHardcode();
        } catch (C10174a unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "use_hardcode", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new C10174a();
    }

    public Boolean getUseRightSwipeBack() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getUseRightSwipeBack();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getUseRightSwipeBack();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "use_right_swipe_back", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public Integer getUseSyntheticHardcode() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getUseSyntheticHardcode();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getUseSyntheticHardcode();
        } catch (C10174a unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "use_synthetic_hardcode", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new C10174a();
    }

    public Boolean getUseWatermarkHardcode() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getUseWatermarkHardcode();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getUseWatermarkHardcode();
        } catch (C10174a unused) {
        }
        Boolean bool = (Boolean) getProxyValue(this.hook, "use_watermark_hardcode", Boolean.class, (T) obj);
        if (bool != null) {
            return bool;
        }
        throw new C10174a();
    }

    public com_ss_android_ugc_aweme_im_sdk_abtest_UserActiveStatusConfig getUserActiveStatusConfig() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getUserActiveStatusConfig();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getUserActiveStatusConfig();
        } catch (C10174a unused) {
        }
        com_ss_android_ugc_aweme_im_sdk_abtest_UserActiveStatusConfig com_ss_android_ugc_aweme_im_sdk_abtest_useractivestatusconfig = (com_ss_android_ugc_aweme_im_sdk_abtest_UserActiveStatusConfig) getProxyValue(this.hook, "user_active_status_config", com_ss_android_ugc_aweme_im_sdk_abtest_UserActiveStatusConfig.class, (T) obj);
        if (com_ss_android_ugc_aweme_im_sdk_abtest_useractivestatusconfig != null) {
            return com_ss_android_ugc_aweme_im_sdk_abtest_useractivestatusconfig;
        }
        throw new C10174a();
    }

    public VCDV1ConfigStruct getVcdV1ConfigInfo() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getVcdV1ConfigInfo();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getVcdV1ConfigInfo();
        } catch (C10174a unused) {
        }
        VCDV1ConfigStruct vCDV1ConfigStruct = (VCDV1ConfigStruct) getProxyValue(this.hook, "vcd_v1_config_info", VCDV1ConfigStruct.class, (T) obj);
        if (vCDV1ConfigStruct != null) {
            return vCDV1ConfigStruct;
        }
        throw new C10174a();
    }

    public Float getVideoBitrate() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getVideoBitrate();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getVideoBitrate();
        } catch (C10174a unused) {
        }
        Float f = (Float) getProxyValue(this.hook, "video_bitrate", Float.class, (T) obj);
        if (f != null) {
            return f;
        }
        throw new C10174a();
    }

    public Integer getVideoCommit() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getVideoCommit();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getVideoCommit();
        } catch (C10174a unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "video_commit", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new C10174a();
    }

    public Integer getVideoCompose() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getVideoCompose();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getVideoCompose();
        } catch (C10174a unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "video_compose", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new C10174a();
    }

    public Long getVideoDurationLimitMs() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getVideoDurationLimitMs();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getVideoDurationLimitMs();
        } catch (C10174a unused) {
        }
        Long l = (Long) getProxyValue(this.hook, "video_duration_limit_ms", Long.class, (T) obj);
        if (l != null) {
            return l;
        }
        throw new C10174a();
    }

    public Integer getVideoQuality() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getVideoQuality();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getVideoQuality();
        } catch (C10174a unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "video_quality", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new C10174a();
    }

    public String getVideoSize() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getVideoSize();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getVideoSize();
        } catch (C10174a unused) {
        }
        String str = (String) getProxyValue(this.hook, "video_size", String.class, (T) obj);
        if (str != null) {
            return str;
        }
        throw new C10174a();
    }

    public Integer getVideoUploadNormalizationParam() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getVideoUploadNormalizationParam();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getVideoUploadNormalizationParam();
        } catch (C10174a unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "video_upload_normalization_param", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new C10174a();
    }

    public C32846x13043613 getVirusSetting() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getVirusSetting();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getVirusSetting();
        } catch (C10174a unused) {
        }
        C32846x13043613 com_ss_android_ugc_aweme_main_experiment_pneumonia_dynamictabsettingstruct = (C32846x13043613) getProxyValue(this.hook, "virus_setting", C32846x13043613.class, (T) obj);
        if (com_ss_android_ugc_aweme_main_experiment_pneumonia_dynamictabsettingstruct != null) {
            return com_ss_android_ugc_aweme_main_experiment_pneumonia_dynamictabsettingstruct;
        }
        throw new C10174a();
    }

    public VisionSearchStruct getVisionSearch() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getVisionSearch();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getVisionSearch();
        } catch (C10174a unused) {
        }
        VisionSearchStruct visionSearchStruct = (VisionSearchStruct) getProxyValue(this.hook, "vision_search", VisionSearchStruct.class, (T) obj);
        if (visionSearchStruct != null) {
            return visionSearchStruct;
        }
        throw new C10174a();
    }

    public Integer getWideCameraInfo() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getWideCameraInfo();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getWideCameraInfo();
        } catch (C10174a unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "wide_camera_info", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new C10174a();
    }

    public Integer getWsUseNewSdk() throws C10174a {
        if (this.hook == null) {
            return this.rawValue.getWsUseNewSdk();
        }
        Object obj = null;
        try {
            obj = this.rawValue.getWsUseNewSdk();
        } catch (C10174a unused) {
        }
        Integer num = (Integer) getProxyValue(this.hook, "ws_use_new_sdk", Integer.class, (T) obj);
        if (num != null) {
            return num;
        }
        throw new C10174a();
    }

    public IESSettingsProxy(IESSettings iESSettings, C10616c cVar) {
        this.rawValue = iESSettings;
        this.hook = cVar;
    }

    private static <T> T getProxyValue(C10616c cVar, String str, Class<T> cls, T t) {
        T t2;
        try {
            t2 = cVar.mo18837a(str, cls, t);
        } catch (Throwable unused) {
            t2 = t;
        }
        if (t2 != null) {
            return t2;
        }
        return t;
    }

    private static <T> List<T> getProxyValue(C10616c cVar, String str, Class<T> cls, List<T> list) {
        List<T> list2;
        try {
            list2 = cVar.mo18838a(str, cls, list);
        } catch (Throwable unused) {
            list2 = list;
        }
        if (list2 != null) {
            return list2;
        }
        return list;
    }
}
