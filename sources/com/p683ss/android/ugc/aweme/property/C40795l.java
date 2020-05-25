package com.p683ss.android.ugc.aweme.property;

import android.content.Context;
import android.content.SharedPreferences;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.property.C40761aa.C40762a;
import com.p683ss.android.ugc.aweme.property.C40761aa.C40763b;

/* renamed from: com.ss.android.ugc.aweme.property.l */
public final class C40795l {

    /* renamed from: a */
    private SharedPreferences f103921a;

    /* renamed from: b */
    private C40761aa f103922b = new C40761aa(this.f103921a);

    /* renamed from: com.ss.android.ugc.aweme.property.l$a */
    public enum C40796a implements C40762a {
        PrivateAvailable("private_available", C40763b.Boolean, Boolean.valueOf(true), true),
        AwemePrivate("aweme_private", C40763b.Boolean, Boolean.valueOf(false), true),
        EffectBubbleShown("effect_bubble_shown", C40763b.Boolean, Boolean.valueOf(false), true),
        POIBubbleShow("poi_bubble_show", C40763b.Boolean, Boolean.valueOf(false), false),
        DraftBubbleShown("draft_bubble_shown", C40763b.Boolean, Boolean.valueOf(false), true),
        FirstSetPrivate("first_set_private", C40763b.Boolean, Boolean.valueOf(false), true),
        RecordGuideShown("record_guide_shown", C40763b.Boolean, Boolean.valueOf(false), true),
        SwitchFilterGuideShown("switch_filter_guide_shown", C40763b.Boolean, Boolean.valueOf(false), true),
        CountDownGuideShown("countdown_guide_shown", C40763b.Boolean, Boolean.valueOf(false), true),
        LongVideoPermitted("long_video_permitted", C40763b.Boolean, Boolean.valueOf(false), true),
        LongVideoThreshold("long_video_threshold", C40763b.Long, Long.valueOf(60000), true),
        HardCode("hard_encode", C40763b.Boolean, Boolean.valueOf(false), true),
        SyntheticHardCode("use_synthetic_hardcode", C40763b.Boolean, Boolean.valueOf(false), true),
        VideoBitrate("video_bitrate", C40763b.Float, Float.valueOf(1.0f), true),
        SyntheticVideoBitrate("synthetic_video_bitrate", C40763b.Float, Float.valueOf(1.0f), true),
        RecordVideoQuality("record_video_quality", C40763b.Integer, Integer.valueOf(18), true),
        SyntheticVideoQuality("synthetic_video_quality", C40763b.Integer, Integer.valueOf(15), true),
        ForbidLocalWatermark("forbid_local_watermark", C40763b.Boolean, Boolean.valueOf(false), true),
        ForbidLifeStoryLocalWatermark("forbid_story_local_watermark", C40763b.Boolean, Boolean.valueOf(false), true),
        WatermarkHardcode("use_watermark_hardcode", C40763b.Boolean, Boolean.valueOf(false), true),
        EnablePreUpload("enable_pre_upload", C40763b.Boolean, Boolean.valueOf(false), true),
        PreUploadEncryptionMode("pre_upload_encryption_mode", C40763b.Integer, Integer.valueOf(0), true),
        EnableUploadSyncTwitter("enable_upload_sync_twitter", C40763b.Boolean, Boolean.valueOf(true), true),
        EnableUploadSyncIns("enable_upload_sync_ins", C40763b.Boolean, Boolean.valueOf(true), true),
        EnableUploadSyncInsStory("enable_upload_sync_ins_story", C40763b.Boolean, Boolean.valueOf(true), true),
        EnableUploadSyncLocal("enable_upload_sync_local", C40763b.Boolean, Boolean.valueOf(true), true),
        EnableSyntheticFpsSet("enable_synthetic_fps_set", C40763b.Boolean, Boolean.valueOf(true), true),
        RecordBitrateCategory("record_bitrate_category", C40763b.String, "", true),
        RecordQualityCategory("record_quality_category", C40763b.String, "", true),
        LastPublishFailed("last_publish_failed", C40763b.Boolean, Boolean.valueOf(false), true),
        BackCameraFilter("back_camera_filter", C40763b.Integer, Integer.valueOf(0), true),
        StorageMonitorLocalSwitch("storage_monitor_local_switch", C40763b.Boolean, Boolean.valueOf(true), true),
        FrontCameraFilter("front_camera_filter", C40763b.Integer, Integer.valueOf(0), true),
        DisableFilter("disable_filter", C40763b.Boolean, Boolean.valueOf(false), true),
        BackCameraFilterV2("back_camera_filter_v2", C40763b.Integer, Integer.valueOf(0), true),
        FrontCameraFilterV2("front_camera_filter_v2", C40763b.Integer, Integer.valueOf(0), true),
        StoryBackCameraFilter("story_back_camera_filter", C40763b.Integer, Integer.valueOf(0), true),
        StoryFrontCameraFilter("story_front_camera_filter", C40763b.Integer, Integer.valueOf(0), true),
        CameraPosition("camera_position", C40763b.Integer, Integer.valueOf(1), true),
        StoryCameraPosition("story_camera_position", C40763b.Integer, Integer.valueOf(0), true),
        VideoCompose("video_compose", C40763b.Integer, Integer.valueOf(70), true),
        VideoCommit("video_commit", C40763b.Integer, Integer.valueOf(30), true),
        HttpTimeout("http_timeout", C40763b.Long, Long.valueOf(5000), true),
        HttpRetryInterval("http_retry_interval", C40763b.Long, Long.valueOf(500), true),
        ARStickerGuideTimes("ar_sticker_guide_times", C40763b.Integer, Integer.valueOf(0), true),
        ARStickerFilterTimes("ar_sticker_filter_guide_times", C40763b.Integer, Integer.valueOf(0), true),
        UseSenseTime("use_sensetime", C40763b.Boolean, Boolean.valueOf(true), true),
        BodyDanceGuideTimes("body_dance_guide_times", C40763b.Integer, Integer.valueOf(0), true),
        BeautyModel("beauty_model", C40763b.Integer, Integer.valueOf(0), true),
        BeautificationMode("beautification_mode", C40763b.Integer, Integer.valueOf(0), true),
        ProgressBarThreshold("progressbar_threshold", C40763b.Long, Long.valueOf(30000), true),
        UseTTUploader("use_tt_uploader", C40763b.Boolean, Boolean.valueOf(true), true),
        PublishPermissionShowDot("publish_permission_show_dot", C40763b.Boolean, Boolean.valueOf(false), true),
        PublishPermissionDialogPrivate("publish_permission_dialog_private", C40763b.Boolean, Boolean.valueOf(true), true),
        PublishPermissionDialogFriend("publish_permission_dialog_friend", C40763b.Boolean, Boolean.valueOf(true), true),
        ShowFilterNewTag("show_filter_new_tag", C40763b.Boolean, Boolean.valueOf(true), true),
        SmoothSkinIndex("smooth_skin_index", C40763b.Integer, Integer.valueOf(3), true),
        ReshapeIndex("big_eyes_index", C40763b.Integer, Integer.valueOf(3), true),
        FaceDetectInterval("face_detect_interval", C40763b.Integer, Integer.valueOf(0), true),
        VideoSizeCategory("setting_video_size_category", C40763b.String, "", true),
        ImportVideoSizeCategory("setting_upload_video_size_category", C40763b.String, "", true),
        VideoSize("setting_video_size", C40763b.String, "", true),
        BubbleGuideShown("setting_bubble_guide_shown", C40763b.Boolean, Boolean.valueOf(false), true),
        EffectModelCopied("effect_model_copied", C40763b.Boolean, Boolean.valueOf(false), true),
        ReshapeModelCopied("reshape_mode_copied", C40763b.Boolean, Boolean.valueOf(false), true),
        AmericaRecordUploadGuideShow("america_record_upload_show", C40763b.Boolean, Boolean.valueOf(false), true),
        BubbleFavoriteStickerShown("setting_bubble_guide_shown", C40763b.Boolean, Boolean.valueOf(false), true),
        StickerCollectionFirst("setting_sticker_first", C40763b.Boolean, Boolean.valueOf(true), true),
        StickerCollectionFirstShown("setting_sticker_first_shown", C40763b.Boolean, Boolean.valueOf(false), true),
        SdkV4AuthKey("sdk_v4_auth_key", C40763b.String, "", true),
        StorySdkV4AuthKey("story_sdk_v4_auth_key", C40763b.String, "", true),
        SpeedPanelOpen("speed_panel_open", C40763b.Boolean, Boolean.valueOf(false), true),
        SyntheticVideoMaxRate("synthetic_video_maxrate", C40763b.Long, Long.valueOf(15000000), true),
        SyntheticVideoPreset("synthetic_video_preset", C40763b.Integer, Integer.valueOf(0), true),
        SyntheticVideoGop("synthetic_video_gop", C40763b.Integer, Integer.valueOf(35), true),
        BitrateOfRecodeThreshold("bitrate_of_recode_threshold", C40763b.Integer, Integer.valueOf(10000000), true),
        UploadOriginalAudioTrack("upload_origin_audio_track", C40763b.Boolean, Boolean.valueOf(false), true),
        CloseUploadExtractFrames("close_vframe_upload", C40763b.Integer, Integer.valueOf(0), true),
        AutoApplySticker("time_auto_apply_sticker", C40763b.Long, Long.valueOf(0), true),
        RecordBitrateMode("record_bitrate_mode", C40763b.Integer, Integer.valueOf(1), true),
        RecordHardwareProfile("record_open_high_profile", C40763b.Integer, Integer.valueOf(1), true),
        UserSmoothSkinLevel("user_smooth_skin_level", C40763b.Integer, Integer.valueOf(-1), true),
        UserShapeLevel("user_shape_level", C40763b.Integer, Integer.valueOf(-1), true),
        UserBigEyeLevel("user_big_eye_level", C40763b.Integer, Integer.valueOf(-1), true),
        UserContourLevel("user_contour_level", C40763b.Integer, Integer.valueOf(-1), true),
        UserLipLevel("user_lip_level", C40763b.Integer, Integer.valueOf(-1), true),
        UserBlushLevel("user_blush_level", C40763b.Integer, Integer.valueOf(-1), true),
        UserChangeSkinLevel("user_change_smooth_skin_level", C40763b.Boolean, Boolean.valueOf(false), true),
        UserChangeShapeLevel("user_change_shape_level", C40763b.Boolean, Boolean.valueOf(false), true),
        UserChangeBigEyeLevel("user_change_big_eye_level", C40763b.Boolean, Boolean.valueOf(false), true),
        UserChangeContourLevel("user_change_contour_level", C40763b.Boolean, Boolean.valueOf(false), true),
        UserChangeLipLevel("user_change_lip_level", C40763b.Boolean, Boolean.valueOf(false), true),
        UserChangeBlushLevel("user_change_blush_level", C40763b.Boolean, Boolean.valueOf(false), true),
        MusNeedResetShapeLevel("mus_need_reset_shape_level", C40763b.Boolean, Boolean.valueOf(true), true),
        LoadOldUserLevel("load_old_user_level", C40763b.Boolean, Boolean.valueOf(true), true),
        UserUlikeSmoothSkinLevel("user_ulike_smooth_skin_level", C40763b.Integer, Integer.valueOf(-1), true),
        UserUlikeShapeLevel("user_ulike_shape_level", C40763b.Integer, Integer.valueOf(-1), true),
        UserUlikeBigEyeLevel("user_ulike_big_eye_level", C40763b.Integer, Integer.valueOf(-1), true),
        UserUlikeLipLevel("user_ulike_lip_level", C40763b.Integer, Integer.valueOf(-1), true),
        UserUlikeBlushLevel("user_ulike_blush_level", C40763b.Integer, Integer.valueOf(-1), true),
        ContourModelCopied("contour_mode_copied", C40763b.Boolean, Boolean.valueOf(false), true),
        SHOW_MEMORY_INFO("show_memory_info", C40763b.Boolean, Boolean.valueOf(true), true),
        UlikeNewReshapeCopied("ulike_new_reshape_model_copied", C40763b.Boolean, Boolean.valueOf(false), true),
        UlikeBeautyCopied("ulike_beauty_model_copied", C40763b.Boolean, Boolean.valueOf(false), true),
        EffectShareCopied("effect_share_copied", C40763b.Boolean, Boolean.valueOf(false), true),
        EffectResourceVersion("effect_resource_version", C40763b.Integer, Integer.valueOf(0), true),
        UlikeSharpenDefaultValue("ulike_sharpen_default_value", C40763b.Float, Float.valueOf(0.05f), true),
        UlikeSmoothDefaultValue("ulike_smooth_default_value", C40763b.Float, Float.valueOf(0.6f), true),
        UlikeShapeDefaultValue("ulike_shape_default_value", C40763b.Float, Float.valueOf(0.5f), true),
        UlikeEyesDefaultValue("ulike_eyes_default_value", C40763b.Float, Float.valueOf(0.3f), true),
        UlikeLipDefaultValue("ulike_lip_default_value", C40763b.Float, Float.valueOf(0.3f), true),
        UlikeBlusherDefaultValue("ulike_blusher_default_value", C40763b.Float, Float.valueOf(0.3f), true),
        UlikeSmoothMaxValue("ulike_smooth_max_value", C40763b.Float, Float.valueOf(0.8f), true),
        UlikeShapeMaxValue("ulike_shape_max_value", C40763b.Float, Float.valueOf(0.8f), true),
        UlikeEyesMaxValue("ulike_eyes_max_value", C40763b.Float, Float.valueOf(0.5f), true),
        EnableBeautyMakeup("enable_beauty_makeup", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableBeautySharpen("enable_beauty_sharpen", C40763b.Boolean, Boolean.valueOf(false), true),
        MALE_PROB_THRESHOLD("male_prob_threshold", C40763b.Float, Float.valueOf(0.8f), true),
        DurationMode("duration_mode", C40763b.Boolean, Boolean.valueOf(true), true),
        RecordCameraType("record_camera_type", C40763b.Integer, Integer.valueOf(-1), true),
        InCamera2BlackList("in_camera2_black_list", C40763b.Integer, Integer.valueOf(0), true),
        EnablePreUploadByUser("enable_pre_upload_by_user", C40763b.Boolean, Boolean.valueOf(true), true),
        PreUploadMemoryLimit("pre_upload_memory_limit", C40763b.Integer, Integer.valueOf(1600), true),
        IsLowMemoryMachine("is_low_memory_machine", C40763b.Boolean, Boolean.valueOf(false), true),
        RecordUseSuccessCameraType("record_use_success_camera_type", C40763b.Integer, Integer.valueOf(0), true),
        RecordUseSuccessRecordProfile("record_use_success_hardware_profile", C40763b.Integer, Integer.valueOf(1), true),
        ReactionTipShow("reaction_tip_show", C40763b.Boolean, Boolean.valueOf(false), true),
        ReactionWindowChangeTipShow("reaction_window_change_tip_show", C40763b.Boolean, Boolean.valueOf(false), true),
        RecordCameraCompatLevel("record_camera_compat_level", C40763b.Integer, Integer.valueOf(1), true),
        CanReact("can_react", C40763b.Boolean, Boolean.valueOf(false), true),
        DefaultMicrophoneState("react_mic_status", C40763b.Integer, Integer.valueOf(1), true),
        InEvening("in_evening", C40763b.Integer, Integer.valueOf(0), false),
        EnableSdkLog("enable_sdk_log", C40763b.Boolean, Boolean.valueOf(false), false),
        EnableUpdateMoji("enable_moji_update_resources", C40763b.Boolean, Boolean.valueOf(true), true),
        UseLargeGestureDetectModel("enable_large_gesture_detect_model", C40763b.Boolean, Boolean.valueOf(true), true),
        UseSmallGestureDetectModel("enable_small_gesture_detect_model", C40763b.Boolean, Boolean.valueOf(true), true),
        UseLargeMattingModel("enable_large_matting_detect_model", C40763b.Boolean, Boolean.valueOf(false), true),
        ReactDuetSettingCurrent("react_duet_setting", C40763b.Integer, Integer.valueOf(2), true),
        ReactDuetSettingChanged("user_changed_setting", C40763b.Boolean, Boolean.valueOf(false), true),
        ShowLockStickerPopupImg("show_lock_sticker_popup_img", C40763b.Boolean, Boolean.valueOf(true), true),
        EnableWaterBgMask("enable_water_bg_mask", C40763b.Boolean, Boolean.valueOf(false), true),
        CombinedShootModeTipShown("show_combine_shoot_mode_tip", C40763b.Boolean, Boolean.valueOf(true), true),
        EnableCommerceUnlockStickerCollectTips("show_commerce_unlock_sticker_collect_tips", C40763b.Boolean, Boolean.valueOf(true), true),
        ShowLockNewYearStickerPopupImg("new_year_show_lock_sticker_popup_img", C40763b.Boolean, Boolean.valueOf(true), true),
        MusicCopyRightGranted("music_copyright_granted", C40763b.Boolean, Boolean.valueOf(false), true),
        StoryImagePlayTime("story_image_play_time", C40763b.Integer, Integer.valueOf(4000), true),
        ShowLastStoryFrame("show_last_story_frame", C40763b.Boolean, Boolean.valueOf(true), true),
        MaxFansCount("max_fans_count", C40763b.Integer, Integer.valueOf(0), true),
        WideCameraInfo("wide_camera_info", C40763b.Integer, Integer.valueOf(-1), true),
        DefaultWideMode("default_wide_mode", C40763b.Boolean, Boolean.valueOf(false), true),
        ShakeFreeWhiteList("shake_free_white_list", C40763b.Integer, Integer.valueOf(-1), true),
        ShakeFreeDefaultMode("default_shake_free_mode", C40763b.Boolean, Boolean.valueOf(false), true),
        ShutterSoundEnable("shutter_sound_enable", C40763b.Boolean, Boolean.valueOf(false), true),
        SpringEffectCacheController("life_effects_cold_req", C40763b.Boolean, Boolean.valueOf(true), true),
        FolderInfo("folder_info", C40763b.String, "", true),
        VideoDurationLimitMillisecond("video_duration_limit_ms", C40763b.Long, Long.valueOf(1000), true),
        RecordTutorialLink("shoot_tutorial_link", C40763b.String, "", true),
        EnableAutoRetryRecord("enable_auto_retry_record", C40763b.Boolean, Boolean.valueOf(true), true),
        IsExportHqFrame("enable_hq_vframe", C40763b.Boolean, Boolean.valueOf(false), true),
        FilterColors("filter_colors", C40763b.String, "", true),
        UlikeBeautyDownloadEnable("enable_camera_beautify_effect", C40763b.Boolean, Boolean.valueOf(false), true),
        ModelFileTestEnv("model_file_test_env", C40763b.Boolean, Boolean.valueOf(false), true),
        Enable1080pFastImport("enable_1080p_fast_import", C40763b.Integer, Integer.valueOf(0), true),
        EnableVESingleGL("enable_ve_single_gl", C40763b.Integer, Integer.valueOf(0), true),
        StickerArtistIconUrl("sticker_artist_icon_url", C40763b.String, "", true),
        VEFastImportIgnoreRecode("ve_fast_import_ignore_recode", C40763b.Boolean, Boolean.valueOf(false), true),
        VEFastImportIgnoreRecodeForRotation("ve_fast_import_ignore_recode_for_rotation", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableUseVeCover("use_ve_image", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableVeCoverEffect("enable_cover_effect", C40763b.Boolean, Boolean.valueOf(false), true),
        EffectSdkConfigSettings("effect_sdk_config_settings", C40763b.String, "", true),
        EnableUseEffect("enable_use_effect", C40763b.Boolean, Boolean.valueOf(true), true),
        PostDownloadSetting("post_download_setting", C40763b.Boolean, Boolean.valueOf(false), true),
        StatusTabKey("status_tab_key", C40763b.String, "", true),
        StatusLottieUrl("status_lottie_url", C40763b.String, "", true),
        StatusPhoneType("status_phone_type", C40763b.Integer, Integer.valueOf(2), true),
        EnableUseGameRotationSensor("enable_use_game_rotation_sensor", C40763b.Boolean, Boolean.valueOf(true), true),
        ReviewVideoFastPublish("use_newyear_direct_upload", C40763b.Boolean, Boolean.valueOf(false), false),
        VERuntimeConfig("ve_runtime_config", C40763b.String, "", true),
        SATCameraType("sat_camera_type", C40763b.Integer, Integer.valueOf(0), true),
        EffectPlatformDownloadModel("EffectPlatform_Download_Model", C40763b.Boolean, Boolean.TRUE, true),
        DraftUseMultiVideoEdit("draft_use_multi_video_edit", C40763b.Boolean, Boolean.valueOf(false), true);
        

        /* renamed from: a */
        private final String f103924a;

        /* renamed from: b */
        private final C40763b f103925b;

        /* renamed from: c */
        private final Object f103926c;

        /* renamed from: d */
        private final boolean f103927d;

        public final Object checkDefValue(C40763b bVar, Object obj) {
            return C40764ab.m90170a(this, bVar, obj);
        }

        public final Object defValue() {
            return this.f103926c;
        }

        public final String key() {
            return this.f103924a;
        }

        public final boolean supportPersist() {
            return this.f103927d;
        }

        public final C40763b type() {
            return this.f103925b;
        }

        private C40796a(String str, C40763b bVar, Object obj, boolean z) {
            Object checkDefValue = checkDefValue(bVar, obj);
            this.f103924a = str;
            this.f103925b = bVar;
            this.f103926c = checkDefValue;
            this.f103927d = z;
        }
    }

    /* renamed from: b */
    public final synchronized int mo83118b(C40796a aVar) {
        return this.f103922b.mo83068b(aVar);
    }

    /* renamed from: c */
    public final synchronized long mo83119c(C40796a aVar) {
        return this.f103922b.mo83069c(aVar);
    }

    /* renamed from: d */
    public final synchronized float mo83120d(C40796a aVar) {
        return this.f103922b.mo83070d(aVar);
    }

    /* renamed from: e */
    public final synchronized String mo83121e(C40796a aVar) {
        return this.f103922b.mo83071e(aVar);
    }

    /* renamed from: f */
    public final synchronized boolean mo83122f(C40796a aVar) {
        return this.f103922b.mo83072f(aVar);
    }

    /* renamed from: g */
    public final synchronized void mo83123g(C40796a aVar) {
        this.f103922b.mo83073g(aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        mo83123g(com.p683ss.android.ugc.aweme.property.C40795l.C40796a.SmoothSkinIndex);
        mo83123g(com.p683ss.android.ugc.aweme.property.C40795l.C40796a.ReshapeIndex);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        mo83116a(com.p683ss.android.ugc.aweme.property.C40795l.C40796a.EffectModelCopied, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        mo83116a(com.p683ss.android.ugc.aweme.property.C40795l.C40796a.EffectModelCopied, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        mo83116a(com.p683ss.android.ugc.aweme.property.C40795l.C40796a.EffectModelCopied, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        mo83116a(com.p683ss.android.ugc.aweme.property.C40795l.C40796a.EffectModelCopied, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m90226a(int r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            android.content.SharedPreferences r0 = r4.f103921a     // Catch:{ all -> 0x005d }
            java.lang.String r1 = "_version_"
            boolean r0 = r0.contains(r1)     // Catch:{ all -> 0x005d }
            if (r0 != 0) goto L_0x001b
            android.content.SharedPreferences r0 = r4.f103921a     // Catch:{ all -> 0x005d }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x005d }
            java.lang.String r1 = "_version_"
            r0.putInt(r1, r5)     // Catch:{ all -> 0x005d }
            r0.apply()     // Catch:{ all -> 0x005d }
            monitor-exit(r4)
            return
        L_0x001b:
            android.content.SharedPreferences r0 = r4.f103921a     // Catch:{ all -> 0x005d }
            java.lang.String r1 = "_version_"
            r2 = 0
            int r0 = r0.getInt(r1, r2)     // Catch:{ all -> 0x005d }
            if (r5 <= r0) goto L_0x0034
            android.content.SharedPreferences r1 = r4.f103921a     // Catch:{ all -> 0x005d }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x005d }
            java.lang.String r3 = "_version_"
            r1.putInt(r3, r5)     // Catch:{ all -> 0x005d }
            r1.apply()     // Catch:{ all -> 0x005d }
        L_0x0034:
            switch(r0) {
                case 1: goto L_0x0038;
                case 2: goto L_0x003d;
                case 3: goto L_0x0047;
                case 4: goto L_0x004c;
                case 5: goto L_0x0051;
                case 6: goto L_0x0056;
                default: goto L_0x0037;
            }     // Catch:{ all -> 0x005d }
        L_0x0037:
            goto L_0x005b
        L_0x0038:
            com.ss.android.ugc.aweme.property.l$a r5 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.EffectModelCopied     // Catch:{ all -> 0x005d }
            r4.mo83116a(r5, r2)     // Catch:{ all -> 0x005d }
        L_0x003d:
            com.ss.android.ugc.aweme.property.l$a r5 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.SmoothSkinIndex     // Catch:{ all -> 0x005d }
            r4.mo83123g(r5)     // Catch:{ all -> 0x005d }
            com.ss.android.ugc.aweme.property.l$a r5 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.ReshapeIndex     // Catch:{ all -> 0x005d }
            r4.mo83123g(r5)     // Catch:{ all -> 0x005d }
        L_0x0047:
            com.ss.android.ugc.aweme.property.l$a r5 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.EffectModelCopied     // Catch:{ all -> 0x005d }
            r4.mo83116a(r5, r2)     // Catch:{ all -> 0x005d }
        L_0x004c:
            com.ss.android.ugc.aweme.property.l$a r5 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.EffectModelCopied     // Catch:{ all -> 0x005d }
            r4.mo83116a(r5, r2)     // Catch:{ all -> 0x005d }
        L_0x0051:
            com.ss.android.ugc.aweme.property.l$a r5 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.EffectModelCopied     // Catch:{ all -> 0x005d }
            r4.mo83116a(r5, r2)     // Catch:{ all -> 0x005d }
        L_0x0056:
            com.ss.android.ugc.aweme.property.l$a r5 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.EffectModelCopied     // Catch:{ all -> 0x005d }
            r4.mo83116a(r5, r2)     // Catch:{ all -> 0x005d }
        L_0x005b:
            monitor-exit(r4)
            return
        L_0x005d:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.property.C40795l.m90226a(int):void");
    }

    /* renamed from: a */
    public final synchronized boolean mo83117a(C40796a aVar) {
        return this.f103922b.mo83067a(aVar);
    }

    /* renamed from: a */
    public final synchronized void mo83112a(C40796a aVar, float f) {
        this.f103922b.mo83062a((C40762a) aVar, f);
    }

    public C40795l(Context context, int i) {
        this.f103921a = C35807d.m80935a(context, "av_settings.xml", 0);
        m90226a(7);
    }

    /* renamed from: a */
    public final synchronized void mo83113a(C40796a aVar, int i) {
        this.f103922b.mo83063a((C40762a) aVar, i);
    }

    /* renamed from: a */
    public final synchronized void mo83114a(C40796a aVar, long j) {
        this.f103922b.mo83064a((C40762a) aVar, j);
    }

    /* renamed from: a */
    public final synchronized void mo83115a(C40796a aVar, String str) {
        this.f103922b.mo83065a((C40762a) aVar, str);
    }

    /* renamed from: a */
    public final synchronized void mo83116a(C40796a aVar, boolean z) {
        this.f103922b.mo83066a((C40762a) aVar, z);
    }
}
