package com.p683ss.android.ugc.aweme.property;

import android.content.Context;
import android.content.SharedPreferences;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.property.C40761aa.C40762a;
import com.p683ss.android.ugc.aweme.property.C40761aa.C40763b;

/* renamed from: com.ss.android.ugc.aweme.property.h */
public final class C40789h {

    /* renamed from: a */
    public C40769ag f103907a = new C40769ag(this);

    /* renamed from: b */
    private SharedPreferences f103908b;

    /* renamed from: c */
    private C40761aa f103909c = new C40761aa(this.f103908b);

    /* renamed from: com.ss.android.ugc.aweme.property.h$a */
    public enum C40790a implements C40762a {
        PhotoEditEnabled("photo_edit_enabled", C40763b.Boolean, Boolean.valueOf(false), true),
        RecordBitrateCategoryIndex("record_bitrate_category_index", C40763b.Integer, Integer.valueOf(0), true),
        RecordQualityCategoryIndex("record_quality_category_index", C40763b.Integer, Integer.valueOf(0), true),
        PrivatePrompt("private_prompt", C40763b.Integer, Integer.valueOf(0), true),
        EnableProcessPublishFix("enable_process_publish_fix", C40763b.Boolean, Boolean.valueOf(false), true),
        EnablePreSynthetic("enable_pre_synthetic", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableAutoProcessAfterLogin("enable_auto_process_after_login", C40763b.Boolean, Boolean.valueOf(false), true),
        VideoSizeIndex("setting_video_size_index", C40763b.Integer, Integer.valueOf(0), true),
        CompileVideoSizeIndex("compile_video_size_index", C40763b.Integer, Integer.valueOf(99), true),
        ImportVideoSizeIndex("setting_upload_video_size_index", C40763b.Integer, Integer.valueOf(0), true),
        SmoothMax("smooth_max", C40763b.Float, Float.valueOf(0.8f), true),
        SmoothDefault("smooth_default", C40763b.Float, Float.valueOf(0.6f), true),
        ReshapeMax("reshape_max", C40763b.Float, Float.valueOf(0.6f), true),
        ReshapeDefault("reshape_default", C40763b.Float, Float.valueOf(0.36f), true),
        ContourMax("contour_max", C40763b.Float, Float.valueOf(0.8f), true),
        ContourDefault("contour_default", C40763b.Float, Float.valueOf(0.0f), true),
        ColorFilterPanel("color_filter_panel", C40763b.Integer, Integer.valueOf(1), true),
        EnableReuseFaceSticker("enable_reuse_face_sticker", C40763b.Boolean, Boolean.valueOf(false), true),
        PhotoMovieEnabled("enable_photomovie", (int) C40763b.Integer, (String) Integer.valueOf(0), (C40763b) C40766ad.m90178a(Integer.valueOf(0), Integer.valueOf(1)), (Object) true),
        ShowAutoImproveButtonInEditPage("show_auto_improve_button", C40763b.Integer, Integer.valueOf(0), true),
        LightEnhanceBlackList("is_weak_light_enhance_black", C40763b.Integer, Integer.valueOf(0), true),
        EnableMainPlusSpecialEntrance("enable_main_plugs_special_entrance", C40763b.Integer, Integer.valueOf(0), true),
        CanShowPublishFriendGuide("can_show_publish_friend_guide", C40763b.Boolean, Boolean.valueOf(false), true),
        EyesMax("eyes_max", C40763b.Float, Float.valueOf(0.6f), true),
        EyesDefault("eyes_default", C40763b.Float, Float.valueOf(0.6f), true),
        ShapeMax("shape_max", C40763b.Float, Float.valueOf(0.6f), true),
        ShapeDefault("shape_default", C40763b.Float, Float.valueOf(0.6f), true),
        BeautificationIconStyle("beautification_icon_style", C40763b.Integer, Integer.valueOf(0), true),
        RearCamera("rear_camera", C40763b.Boolean, Boolean.valueOf(false), true),
        RecordHardwareProfile("record_hardware_profile", C40763b.Integer, Integer.valueOf(1), true),
        FetchEffectModelType("fetch_effect_model_zip_version", C40763b.Integer, Integer.valueOf(0), true),
        PreFetchPopEffectModel("pre_fetch_effect_model", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableSaveUploadVideo("upload_save_local", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableInstagramSilentShare("isInstagramSilentShare", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableUploadFallback("enable_upload_fallback", C40763b.Boolean, Boolean.valueOf(false), true),
        UploadOptimizeForPie("upload_optimize_for_pie", C40763b.Boolean, Boolean.valueOf(true), true),
        UseContourSlider("use_contour_slider", C40763b.Boolean, Boolean.valueOf(false), true),
        AddTextInMusically("show_button_title_in_record_page", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableExposureOptimize("enable_exposure_optmize", C40763b.Boolean, Boolean.valueOf(true), true),
        RecordCameraTypeAB("camera_type_ab", C40763b.Integer, Integer.valueOf(-1), true),
        RecordCameraCompatLevelAB("record_camera_compat_level_ab", C40763b.Integer, Integer.valueOf(-1), true),
        PublishOnNewIntentCheckDelay("publish_on_new_intent_check_delay", C40763b.Integer, Integer.valueOf(0), true),
        EnableNewEffectEngineForBuiltInEffect("enable_new_effect_engine_for_built_in_effect", (int) C40763b.Boolean, (String) Boolean.valueOf(false), (C40763b) true, (Object) new C40812q()),
        UploadSpeedProbeSize("upload_speed_probe_size", C40763b.Integer, Integer.valueOf(524288), true),
        ConcurrentUploadCancelOnAuthKey("concurrent_upload_cancel_on_auth_key", C40763b.Boolean, Boolean.valueOf(true), true),
        UploadSpeedProbeMinGap("upload_speed_probe_min_gap", C40763b.Integer, Integer.valueOf(300000), true),
        UploadSpeedProbeTimeOut("upload_speed_probe_time_out", C40763b.Integer, Integer.valueOf(20000), true),
        TTUploaderTTNetProxyType("ttuploader_ttnet_proxy_type", C40763b.Integer, Integer.valueOf(-1), true),
        RecordMinDiskAmountMB("record_min_disk_amount_mb", C40763b.Integer, Integer.valueOf(20), true),
        UploadStatusReportGapS("upload_status_report_gap_s", C40763b.Integer, Integer.valueOf(-1), true),
        EnableOnlyReportKeyUploadLog("enable_only_report_key_upload_log", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableMultiPublisherScheduler("enable_multi_publisher_scheduler", C40763b.Boolean, Boolean.valueOf(false), true),
        TTNetExternNetInfo("ttnet_extern_net_info", C40763b.String, "", true),
        WatermarkResSetting("watermark_res_setting", C40763b.String, "", true),
        UploadExtraParams("upload_extra_params", C40763b.String, "", true),
        EnableVECompileCrfReencode("enable_ve_compile_crf_reencode", C40763b.Boolean, Boolean.valueOf(false), true),
        SyntheticVideoQuality("synthetic_video_quality", C40763b.Integer, Integer.valueOf(-1), true),
        SyntheticVideoMaxRate("synthetic_video_maxrate", C40763b.Long, Long.valueOf(-1), true),
        SyntheticVideoPreset("synthetic_video_preset", C40763b.Integer, Integer.valueOf(-1), true),
        SyntheticVideoGop("synthetic_video_gop", C40763b.Integer, Integer.valueOf(-1), true),
        VideoBitrate("video_bitrate", C40763b.Float, Float.valueOf(-1.0f), true),
        SyntheticVideoBitrate("synthetic_video_bitrate", C40763b.Float, Float.valueOf(-1.0f), true),
        ShareVideo2GifEditable("new_version_gif_share", C40763b.Boolean, Boolean.valueOf(true), true),
        UseEffectCam("use_effectcam_key", C40763b.Boolean, Boolean.valueOf(false), true),
        PlatformOptimizeStrategy("platform_optimize_strategy", C40763b.Integer, Integer.valueOf(0), true),
        UsePlanQi("use_plan_qi_key", C40763b.Boolean, Boolean.valueOf(false), false),
        LoadLibraryFromExternal("从/sdcard/加载so重启生效", C40763b.Boolean, Boolean.valueOf(false), true),
        GetEffectVersionFromLib("use_effect_version_in_sdk", C40763b.Boolean, Boolean.valueOf(true), true),
        RecommentMusicByAIPolicy("recomment_music_by_ai_policy", C40763b.Integer, Integer.valueOf(0), true),
        ShowVideoInfo("show_video_info", C40763b.Boolean, Boolean.valueOf(false), false),
        StickerDetailsEntranceEnable("sticker_details_entrance_enable", C40763b.Boolean, Boolean.valueOf(false), true),
        UseVECompiler("use_ve_compiler", C40763b.Integer, Integer.valueOf(0), false),
        EnableOpenGl3("use_open_gl_three", C40763b.Integer, Integer.valueOf(1), true),
        EnableEffectParallelFwk("enable_effect_parallel_fwk", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableQIEffectParallelFwk("enable_effect_parallel_fwk_qi", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableInfoSticker("enable_infosticker", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableParallelSynthesizeUpload("enable_parallel_synthesize_upload", C40763b.Boolean, Boolean.valueOf(true), true),
        EnableRetryParallelSynthesizeUpload("enable_retry_parallel_synthesize_upload", C40763b.Boolean, Boolean.valueOf(true), true),
        NeedLoginInBeforeRecord("need_login_in_before_record", C40763b.Boolean, Boolean.valueOf(true), true),
        EnableStickerCollection("show_sticker_collection", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableSoftEncodeAcc("enable_soft_encode_acc", C40763b.Boolean, Boolean.valueOf(false), true),
        ForceAddVideoHead("force_add_video_head", C40763b.Boolean, Boolean.valueOf(false), true),
        UsingMixRecordButton("use_mix_record_button", C40763b.Boolean, Boolean.valueOf(true), true),
        NeedRecode("need_recode", C40763b.Boolean, Boolean.valueOf(false), true),
        StoryPreviewUsingSurfaceView("is_surface_view_story_preview", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableFeedbackLog("enable_feedback_log", C40763b.Boolean, Boolean.valueOf(false), true),
        VeEditorANRDestroy("veeditor_anr_destroy", C40763b.Boolean, Boolean.valueOf(false), true),
        VECutVideoEnable("enable_ve_cut_video", C40763b.Boolean, Boolean.valueOf(true), true),
        VideoSynthesisOpt("video_synthesis_opt", C40763b.Boolean, Boolean.valueOf(false), true),
        EffectExclusionPattern("effect_exclusion_pattern", C40763b.String, "", true),
        UseNewEffectExecutorType("effect_download_executor_type", C40763b.Boolean, Boolean.valueOf(true), true),
        VESynthesisSettings("ve_synthesis_settings", C40763b.String, "", true),
        EnablePublishDetailALog("enable_publish_detail_alog", C40763b.Boolean, Boolean.valueOf(false), true),
        VESynthesisSettingsByUploadSpeed("ve_synthesis_settings_by_upload_speed", C40763b.String, "", true),
        TTUploaderResponseTimeOut("tt_uploader_response_time_out", C40763b.Integer, Integer.valueOf(0), true),
        TTUploaderHttpDNSConfig("tt_uploader_http_dns_config", C40763b.String, "", true),
        CompileProbeConfig("compile_probe_config", C40763b.String, "", true),
        VECameraPreviewSize("ve_camera_preview_size", C40763b.String, "", true),
        EnableRecordTutorial("shoot_tutorial_switch", C40763b.Boolean, Boolean.valueOf(false), true),
        LongVideoDefaultUseLong("default_enable_long_video", C40763b.Boolean, Boolean.valueOf(true), false),
        LongDurationRecordAsTab("is_long_duration_record_as_tab", C40763b.Boolean, Boolean.valueOf(false), true),
        UseNewPublishShareDescription("is_publish_share_description", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableSearchGIF("enable_search_gif", C40763b.Boolean, Boolean.valueOf(false), true),
        VEExtractFramesAfterRender("ve_extract_frames_after_render", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableVEFastImport("enable_ve_fast_import", C40763b.Boolean, Boolean.valueOf(true), true),
        FastImportFpsLimit("fast_import_fps_limit", C40763b.Integer, Integer.valueOf(40), true),
        FastImportResolutionLimit("fast_import_resolution_limit", C40763b.String, "720*1280", true),
        FastImportGopLimit("fast_import_gop_limit", C40763b.Integer, Integer.valueOf(3000), true),
        EnableSlimVECutProcessor("enable_slim_ve_cut_processor", C40763b.Boolean, Boolean.valueOf(true), true),
        CameraOptionFlagsOpt("camera_option_flags_opt", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableVENewFrameworkVersion("enable_ve_new_framework_version", C40763b.Boolean, Boolean.valueOf(false), true),
        DefaultPublishPrivacyType("default_publish_privacy_type", C40763b.Integer, Integer.valueOf(0), true),
        MvThemeRecordMode("mv_theme_mode_switch", C40763b.Boolean, Boolean.valueOf(false), true),
        OpenCameraFrameOptimizeSDK("open_camera_frame_optimize_sdk", C40763b.Boolean, Boolean.valueOf(false), true),
        OpenTakenInSameOptimize("open_taken_in_same_optimize", C40763b.Integer, Integer.valueOf(0), true),
        OpenRecordToEditFrameOptimize("open_record_to_edit_frame_optimize", C40763b.Boolean, Boolean.valueOf(false), true),
        OpenAbLoadSo("open_ab_load_so", C40763b.Boolean, Boolean.valueOf(false), true),
        OpenRecordToViewOptimize("open_record_to_view_optimize", C40763b.Boolean, Boolean.valueOf(false), true),
        OpenCameraFrameOptimizePreLoadSo("open_camera_frame_optimize_pre_load_so", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableTextStickerInMain("enable_text_sticker_in_main", C40763b.Boolean, Boolean.valueOf(true), true),
        StudioEffectNewTabUi("studio_effect_new_tab_ui", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableVoiceConversion("studio_enable_editpage_voicechanger", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableRecordConversion("studio_enable_video_edit_dub", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableSingleSegmentConcatUseCopy("enable_single_segment_concat_use_copy", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableVideoEditActivityUploadSpeedProbe("enable_video_edit_activity_upload_speed_probe", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableMVThemePreUpload("enable_mv_theme_pre_upload", C40763b.Boolean, Boolean.valueOf(false), true),
        EnablePublisherOpt("enable_publisher_opt", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableEffectNewEngine("enable_effect_new_engine", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableEffectNewEngineEdit("enable_effect_new_engine_edit", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableTT265Decoder("enable_tt_265_decoder", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableOptimizePublishContainerActivityNotInStack("enable_optimize_publish_container_activity_not_in_stack", C40763b.Boolean, Boolean.valueOf(true), true),
        EnableEnhanceVolume("enable_enhance_volume", C40763b.Boolean, Boolean.valueOf(false), true),
        EditPageMusicPanelOptimization("edit_page_music_panel_optimization", C40763b.Integer, Integer.valueOf(0), true),
        EnableVECacheGLContext("enable_ve_cache_gl_context", C40763b.Integer, Integer.valueOf(0), true),
        DuetFixNewPlan("enable_duet_fix_new_plan", C40763b.Boolean, Boolean.valueOf(true), true),
        UlikeBeautyAbGroup("studio_recorder_beautify_effects_group", C40763b.Integer, Integer.valueOf(0), true),
        EnableSilentShareOptimize("enable_silent_share_optimize", C40763b.Boolean, Boolean.valueOf(true), true),
        RemoveStoryStrategy("remove_story_strategy", C40763b.Integer, Integer.valueOf(0), true),
        EnableEditPageMemoryOpt("enable_edit_page_memory_opt", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableStoryCameraOpt("enable_story_camera_opt", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableEditPageMVMemoryOpt("enable_edit_page_mv_memory_opt", C40763b.Boolean, Boolean.valueOf(false), true),
        EnablePublishThreadOpt("enable_publish_thread_opt", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableVboostOpt("enable_vboost_opt", C40763b.Boolean, Boolean.valueOf(false), true),
        RememberLastRecordDuration("remember_last_record_duration", C40763b.Boolean, Boolean.valueOf(false), true),
        EditPagePrompt("edit_page_prompt", C40763b.Boolean, Boolean.valueOf(true), true),
        PubRecHashTag("pub_rec_hashtag", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableMBlackPanel("enable_m_black_panel", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableMusicStickPoint("enable_music_stick_point", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableSmartMusicStickPoint("enable_music_smart_stick_point", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableSmartStickPointFeedback("enable_smart_stick_point_feedback", C40763b.Boolean, Boolean.valueOf(false), true),
        ShowMusicStickPointBubble("show_music_stick_point_bubble", C40763b.Boolean, Boolean.valueOf(false), true),
        StickPointMusicCutLength("music_smart_stick_point_max_music_duration", C40763b.Integer, Integer.valueOf(20), true),
        StickPointDefaltMode("music_stickpoint_defalt_mode", C40763b.Integer, Integer.valueOf(1), true),
        OpenSDKQAdaption("open_sdk_Q_adaption", C40763b.Boolean, Boolean.valueOf(true), true),
        SDKQAdaptionConfig("sdk_Q_adaption", C40763b.Boolean, Boolean.valueOf(false), true),
        StudioBeautyEffectComposer("studio_beauty_effect_composer", C40763b.Boolean, Boolean.valueOf(false), true),
        ComposerPanelHasTitle("composer_panel_has_title", C40763b.Boolean, Boolean.valueOf(true), true),
        StudioMBeautyPanel("studio_m_beauty_panel", C40763b.Boolean, Boolean.valueOf(false), true),
        StudioBeautyEffectComposerGroup("studio_beauty_effect_composer_group", C40763b.Integer, Integer.valueOf(0), true),
        EnableEffectDiskCache("use_effect_lru_cache", C40763b.Boolean, Boolean.valueOf(true), true),
        EnableAsyncInitVesdk("async_init_vesdk", C40763b.Boolean, Boolean.valueOf(true), true),
        EnableRushLooper("catch_crash_activity", C40763b.Boolean, Boolean.valueOf(true), true),
        EnableUploadMetadata("upload_metadata", C40763b.Boolean, Boolean.valueOf(false), true),
        VEUseNewEffectAlgorithmApi("ve_use_new_effect_algorithm", C40763b.Boolean, Boolean.valueOf(false), true),
        UseNewMvStruct("studio_recorder_mv_thumbnail_style", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableVEUploadApplog("enable_ve_upload_applog", C40763b.Boolean, Boolean.valueOf(true), true),
        MvPlan("aweme_record_mv_page_style", C40763b.Integer, Integer.valueOf(0), true),
        EnableStickerFunctionalities("enable_sticker_functionalities", C40763b.Boolean, Boolean.valueOf(false), true),
        RearMusicAutoLoop("rear_music_auto_loop", C40763b.Boolean, Boolean.valueOf(false), true),
        IsForcedToDefaultFullScreenPlan("is_forced_to_default_full_screen_plan", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableVideoImageMixed("enable_video_image_mixed", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableMultiFastImport("enable_multi_fast_import", C40763b.Boolean, Boolean.valueOf(false), true),
        VEEditorCompileForDuetReact("using_veeditor_for_duet_react", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableUploadVideoSlideAutoJust("upload_video_slider_auto_adjust", C40763b.Boolean, Boolean.valueOf(false), true),
        RecordOutputCategory("record_output_category", C40763b.Integer, Integer.valueOf(1), true),
        EnableThreeBuffer("enable_three_buffer", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableImportAvSync("enable_import_avsync", C40763b.Integer, Integer.valueOf(0), true),
        EnableOpenGLResourceReuse("enable_open_gl_resource_reuse", C40763b.Integer, Integer.valueOf(0), true),
        EnableSubtitleRecognition("enable_subtitle_recognition", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableSubtitleRecognitionAI("enable_subtitle_recognition_ai", C40763b.Boolean, Boolean.valueOf(false), true),
        EnablePublishPrivacySetting("enable_publish_privacy_setting", C40763b.Integer, Integer.valueOf(0), true),
        EnableSearchEffect("enable_search_effect", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableSdkInputCrossPlatForm("enable_sdk_input_cross_platform", C40763b.Integer, Integer.valueOf(0), true),
        MVPBeautyNewIcon("mvp_beauty_new_icon", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableFilterIntensityJust("studio_enable_filter_effect_slider", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableRecordStatusMode("enable_record_status_mode", C40763b.Boolean, Boolean.valueOf(true), true),
        EnableRecordStatusRandomAll("enable_record_status_random_all", C40763b.Boolean, Boolean.valueOf(true), true),
        EnableStatusBgRandomOrder("enable_status_bg_random_order", C40763b.Boolean, Boolean.valueOf(true), true),
        StudioStickerPinEnable("studio_sticker_pin_enable", C40763b.Boolean, Boolean.valueOf(false), true),
        EditorSceneLazyInit("scene_lazy_init", C40763b.Boolean, Boolean.valueOf(true), true),
        RemoveIESMediaPlayer("remove_ies_media_player", C40763b.Boolean, Boolean.valueOf(false), true),
        RenderUseVideoSizeIndex("render_use_videosize_index", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableMultiVideoEdit("studio_editor_allow_deleting_clip", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableUseNewEffectIconUI("effect_portal_optimization", C40763b.Boolean, Boolean.valueOf(false), true),
        EnablePostponeRecordTask("enable_postpone_record_task", C40763b.Boolean, Boolean.valueOf(false), true),
        DisableUploadALog("disable_upload_alog", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableGLBase("enable_vesdk_glbase", C40763b.Integer, Integer.valueOf(0), true),
        EnableASVESandBox("enable_sand_box", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableSATCamera("enable_sat_camera", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableEffectAsyncAPI("enable_effect_async_api", C40763b.Boolean, Boolean.valueOf(false), true),
        StudioEnableRecorderTutorial("studio_enable_recorder_tutorial", C40763b.Boolean, Boolean.valueOf(false), true),
        OptimizeEffectRenderFirstFrame("opti_effect_render_first_frame", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableCategorizedInfoStickers("studio_enable_categorized_info_stickers", C40763b.Boolean, Boolean.valueOf(false), true),
        PublishProgressOptimize("publish_progress_optimize", C40763b.Boolean, Boolean.valueOf(false), true),
        VboostCompile("vboost_compile", C40763b.Boolean, Boolean.valueOf(false), true),
        EffectSDKInfoStickerUseAmazing("effect_sdk_info_sticker_use_amazing", C40763b.Integer, Integer.valueOf(0), true),
        EnableAllTabWhenUpload("enable_all_tab_when_upload", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableStickPointWhenSelectMultiPhotos("enable_stick_point_when_select_multi_photos", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableLivePublishBackToCut("enable_live_publish_back_to_cut", C40763b.Boolean, Boolean.valueOf(true), true),
        MonitorPublishFailed("monitor_publish_failed", C40763b.Boolean, Boolean.valueOf(false), false),
        EnableAlbumTimelineAndFullScreenPreview("enable_album_timeline_and_full_screen_preview", C40763b.Integer, Integer.valueOf(0), true),
        EnableEditFpsLimited("edit_fps_limited", C40763b.Integer, Integer.valueOf(-1), true),
        EnableStickPointCutFavoriteMusicTab("studio_ai_video_music_bookmark_tab", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableStickTopMusicAfterClickMusicSyncAnchor("stick_top_music_after_click_music_sync_anchor", C40763b.Boolean, Boolean.valueOf(false), true),
        StudioBeautyButtonTitleStrategy("studio_beauty_button_title_strategy", C40763b.Integer, Integer.valueOf(0), true),
        StudioDuetChangeLayout("studio_duet_change_layout", C40763b.Boolean, Boolean.valueOf(false), true),
        StudioEnableStitch("studio_enable_stitch", C40763b.Boolean, Boolean.valueOf(false), true),
        VideoStickerPassThroughLive("video_sticker_pass_through_live", C40763b.Boolean, Boolean.valueOf(false), true),
        RecordLayoutColorScheme("record_layout_color_scheme", C40763b.Integer, Integer.valueOf(0), true),
        EnableEchoCancellation("enable_echo_cancellation", C40763b.Boolean, Boolean.valueOf(false), true),
        ChangeRecordBottomTabOrder("change_record_bottom_tab_order", C40763b.Boolean, Boolean.valueOf(false), true),
        EnableDonationSticker("studio_edit_sticker_donation", C40763b.Boolean, Boolean.valueOf(false), true),
        Enable_EffectPlatform_Refactor("enable_effectplatform_refactor", C40763b.Boolean, Boolean.valueOf(false), true);
        

        /* renamed from: a */
        private final String f103911a;

        /* renamed from: b */
        private final C40763b f103912b;

        /* renamed from: c */
        private final Object f103913c;

        /* renamed from: d */
        private final C40766ad<?> f103914d;

        /* renamed from: e */
        private final boolean f103915e;

        /* renamed from: f */
        private final C40791a f103916f;

        /* renamed from: com.ss.android.ugc.aweme.property.h$a$a */
        interface C40791a {
            /* renamed from: a */
            void mo83111a(Object obj);
        }

        public final Object checkDefValue(C40763b bVar, Object obj) {
            return C40764ab.m90170a(this, bVar, obj);
        }

        public final Object defValue() {
            return this.f103913c;
        }

        public final C40791a getUpdateCallback() {
            return this.f103916f;
        }

        public final String key() {
            return this.f103911a;
        }

        public final boolean supportPersist() {
            return this.f103915e;
        }

        public final C40763b type() {
            return this.f103912b;
        }

        public final <T extends Comparable<T>> C40766ad<T> valueRange() {
            return this.f103914d;
        }

        private C40790a(String str, C40763b bVar, Object obj, boolean z) {
            this(r10, r11, str, bVar, obj, null, z, null);
        }

        private C40790a(String str, C40763b bVar, Object obj, C40766ad<?> adVar, boolean z) {
            this(r10, 18, str, bVar, obj, adVar, true, null);
        }

        private C40790a(String str, C40763b bVar, Object obj, boolean z, C40791a aVar) {
            this(r10, 42, str, bVar, obj, null, true, aVar);
        }

        private C40790a(String str, C40763b bVar, Object obj, C40766ad<?> adVar, boolean z, C40791a aVar) {
            Object checkDefValue = checkDefValue(bVar, obj);
            this.f103911a = str;
            this.f103912b = bVar;
            this.f103913c = checkDefValue;
            this.f103914d = adVar;
            this.f103915e = z;
            this.f103916f = aVar;
        }
    }

    /* renamed from: b */
    public final synchronized int mo83104b(C40762a aVar) {
        return this.f103909c.mo83068b(aVar);
    }

    /* renamed from: c */
    public final synchronized long mo83105c(C40762a aVar) {
        return this.f103909c.mo83069c(aVar);
    }

    /* renamed from: d */
    public final synchronized float mo83106d(C40762a aVar) {
        return this.f103909c.mo83070d(aVar);
    }

    /* renamed from: e */
    public final synchronized String mo83107e(C40762a aVar) {
        return this.f103909c.mo83071e(aVar);
    }

    public C40789h(Context context) {
        this.f103908b = C35807d.m80935a(context, "av_ab.xml", 0);
    }

    /* renamed from: a */
    public final synchronized boolean mo83103a(C40762a aVar) {
        return this.f103909c.mo83067a(aVar);
    }

    /* renamed from: a */
    public final synchronized void mo83098a(C40762a aVar, float f) {
        this.f103909c.mo83062a(aVar, f);
    }

    /* renamed from: a */
    public final synchronized void mo83099a(C40762a aVar, int i) {
        this.f103909c.mo83063a(aVar, i);
    }

    /* renamed from: a */
    public final synchronized void mo83100a(C40762a aVar, long j) {
        this.f103909c.mo83064a(aVar, j);
    }

    /* renamed from: a */
    public final synchronized void mo83101a(C40762a aVar, String str) {
        this.f103909c.mo83065a(aVar, str);
    }

    /* renamed from: a */
    public final synchronized void mo83102a(C40762a aVar, boolean z) {
        this.f103909c.mo83066a(aVar, z);
    }
}
