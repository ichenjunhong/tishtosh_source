package com.bytedance.ies.abmock;

import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.google.gson.C18082l;
import com.google.gson.C18085o;
import com.google.gson.C18088r;
import com.p683ss.android.ugc.aweme.feed.experiment.FeedOptimizeEnableSetting;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.ImHotSpotConfigSettings;
import com.p683ss.android.ugc.aweme.settings2.BusinessEshopManagerSettings;
import com.p683ss.android.ugc.aweme.settings2.HeartbeatDefaultUrlSettings;
import com.p683ss.android.ugc.aweme.settings2.ShowStorageDotSizeSettings;
import com.p683ss.android.ugc.aweme.settings2.ShowStorageTipSizeSettings;
import com.p683ss.android.ugc.aweme.settings2.StarAtlasProfileLinkSettings;
import com.p683ss.android.ugc.aweme.settings2.TcmNameCtrySettings;
import com.p683ss.android.ugc.aweme.settings2.WikipediaAnchorUrlPlaceholderSettings;
import com.p683ss.android.ugc.aweme.update.settings.OuterEntranceSchemaSettings;

/* renamed from: com.bytedance.ies.abmock.m */
public final class C10192m {
    /* renamed from: a */
    public static boolean m20600a(C18085o oVar) {
        m20599a(oVar, "new_anchor_show_bubble", true);
        m20599a(oVar, "benchmark_poor_perf_device", false);
        m20596a(oVar, "live_check_interval", 5);
        m20599a(oVar, "enable_safe_view_checker", false);
        m20606g(oVar, "commerce_ad_landpage_bullet_config");
        m20599a(oVar, "ad_fix_feed_scroll_right", false);
        m20599a(oVar, "enable_egg_and_pendent_componentize", false);
        m20599a(oVar, "enable_splash_valid_time_check", false);
        m20599a(oVar, "enable_commerce_egg_monitor_log", true);
        m20599a(oVar, "enable_ad_playfun_monitor_log", true);
        m20606g(oVar, "aweme_ad_rank");
        m20599a(oVar, "enable_send_v3_applog", false);
        m20605f(oVar, "hybrid_get_ab_test");
        m20606g(oVar, "donation_urls");
        m20596a(oVar, "change_cover_dialog_use_style_setting", 0);
        m20606g(oVar, "gradient_punish_warning");
        m20598a(oVar, "coupon_verification_list", "https://aweme.snssdk.com/coupon/aweme/Verification?hide_nav_bar=1");
        m20597a(oVar, "safe_info_notice_frequency", 86400);
        m20598a(oVar, "security_center", "");
        m20596a(oVar, "polaris_jsb_setting", 1);
        m20598a(oVar, "public_test_entry_schema", OuterEntranceSchemaSettings.DEFAULT);
        m20599a(oVar, "public_test_entry", false);
        m20599a(oVar, "enable_outer_test", true);
        m20606g(oVar, "content_lang_dialog");
        m20596a(oVar, "content_lang_limit", 5);
        m20596a(oVar, "notice_guide_cancel_limit", 3);
        m20596a(oVar, "notice_guide_show_interval", 7);
        m20606g(oVar, "notice_collapsibility");
        m20596a(oVar, "enable_video_reply", 0);
        m20596a(oVar, "familiar_aweme_stats_type", 0);
        m20598a(oVar, "anti_addiction_pop_up_text", "");
        m20606g(oVar, "dynamic_search_result_tab_title");
        m20596a(oVar, "general_search_load_more_remains", 0);
        m20596a(oVar, "general_search_refresh_count", 10);
        m20596a(oVar, "guide_search_item_len", 7);
        m20596a(oVar, "search_new_gs_style", 1);
        m20596a(oVar, "common_search_load_more_remains", 0);
        m20599a(oVar, "need_call_user_agreement_and_ugc_popup", false);
        m20606g(oVar, "ugc_permission_setting");
        m20597a(oVar, "addressbook_upload_interval", 86400);
        m20597a(oVar, "authorize_info_upload_interval", 86400);
        m20599a(oVar, "dynamic_feature_fake_install", false);
        m20599a(oVar, "can_dump_hporf", true);
        m20599a(oVar, "enable_preload_opt", false);
        m20599a(oVar, "enable_upload_hporf", false);
        m20599a(oVar, "miniapp_init_enable", false);
        m20606g(oVar, "dmt_liko_analysis_config");
        m20599a(oVar, "fb_ddl_switch", true);
        m20606g(oVar, "third_party_binding");
        m20599a(oVar, "profile_favorite_undigg_optimize_setting", true);
        m20606g(oVar, "enable_stack_leak_checker");
        m20596a(oVar, "change_network_client", 1);
        m20606g(oVar, "jank_monitor_config");
        m20599a(oVar, "debug_replace_http_to_https", true);
        m20606g(oVar, "safe_mode_settings");
        m20597a(oVar, "gecko_normal_request_time", 60000);
        m20599a(oVar, "awewebview_append_common_params_enabled", true);
        m20599a(oVar, "rn_force_v8_gc", true);
        m20605f(oVar, "aweme_appinfo_safehost_fields");
        m20605f(oVar, "aweme_data_prefetch_white_list");
        m20605f(oVar, "is_cutout_android");
        m20606g(oVar, "android_source_url");
        m20598a(oVar, "vendor_key_back_url", "");
        m20606g(oVar, "nearby_distance");
        m20599a(oVar, "mainfragment_hidden_changed_switch", false);
        m20597a(oVar, "unread_video_sun_roof", 300);
        m20596a(oVar, "feed_video_view_resize_strategy", 1);
        m20596a(oVar, "non_feed_video_view_resize_strategy", 1);
        m20596a(oVar, "ad_gap_interactive_duration", 0);
        String str = "recommend_fix_splash_bug";
        try {
            C18082l b = oVar.mo35022b(str);
            if (b != null) {
                C10181b.m20511a().f27515d.mo18209a(str, b.mo34906d());
            } else {
                C10181b.m20511a().f27515d.mo18209a(str, 1.5d);
            }
        } catch (Throwable th) {
            C9220a.m18311a(th);
        }
        m20599a(oVar, "enable_report_sound_output_device", false);
        m20606g(oVar, "network_monitor_config");
        m20599a(oVar, "enable_feed_live_refresh", true);
        m20596a(oVar, "enable_feed_ad_break_duration_optimize", 0);
        m20596a(oVar, "feed_optimize_enable_setting", (int) FeedOptimizeEnableSetting.VERSION_100700);
        m20606g(oVar, "feed_survey");
        m20597a(oVar, "dmt_fix_full_video_black_issue", -1);
        m20596a(oVar, "fix_dislike_event_setting", 1);
        m20596a(oVar, "dmt_fix_full_video_black_issue_parent_count", 20);
        m20599a(oVar, "dmt_fix_full_video_black_issue_parent_report", false);
        m20599a(oVar, "often_watch_report_fast_stats", true);
        m20606g(oVar, "dislike_reasons");
        m20598a(oVar, "music_detail_image_entry", "");
        m20598a(oVar, "sound_match_feedback_url", "");
        m20596a(oVar, "max_launch_push_guide", 2);
        m20596a(oVar, "push_guide_interval", 7);
        m20596a(oVar, "max_publish_push_guide", 2);
        m20606g(oVar, "handle_settings");
        m20596a(oVar, "publish_log_max_length", 500);
        m20606g(oVar, "fragments_configuration");
        m20599a(oVar, "abmock_keva_switch", false);
        m20599a(oVar, "settings_keva_switch", false);
        m20598a(oVar, "live_audio_animation_resource", "https://sf1-ttcdn-tos.pstatp.com/obj/ttfe/ttlive/webp/audio_live.webp");
        m20605f(oVar, "live_audio_bg_list");
        m20599a(oVar, "ug_diff_download_report_only_diff", false);
        m20599a(oVar, "ug_diff_download_unreport_extra", false);
        m20596a(oVar, "check_scroll_state_on_main_top_tab_click", 1);
        m20606g(oVar, "ins_recover_account_url");
        m20598a(oVar, "setting_for_email_pwd", "000000");
        m20599a(oVar, "google_multi_login", false);
        m20599a(oVar, "keep_lobby_cookies", false);
        m20599a(oVar, "enable_new_phone_bind_flow", true);
        m20598a(oVar, "recover_account_verification_form_url", "");
        m20596a(oVar, "playermanager_background_check", 0);
        m20606g(oVar, "assistant_settings");
        m20606g(oVar, "sync_to_duoshan_prop");
        m20599a(oVar, "is_familiar_feed_filter_duplicate", true);
        m20605f(oVar, "auto_connect_fe_config");
        m20599a(oVar, "enable_dou_plus_full_process", false);
        m20606g(oVar, "im_friend_relation_update_settings");
        m20599a(oVar, "im_enable_chat_call", false);
        m20606g(oVar, "commerce_im_config");
        m20606g(oVar, "im_group_chat_bubble_v2_setting_config");
        m20597a(oVar, "display_strong_tips_interval", 1800);
        m20597a(oVar, "chat_video_hot_time", (long) ImHotSpotConfigSettings.CONFIG);
        m20599a(oVar, "im_mt_new_input_board_enable_giphy", true);
        m20606g(oVar, "im_x_download");
        m20606g(oVar, "im_contact_update_freq");
        m20599a(oVar, "enable_im_sdk_log", false);
        m20599a(oVar, "im_sdk_request_header_disable_cache", false);
        m20596a(oVar, "share_show_unfollow_contacts_count", 4);
        m20606g(oVar, "user_active_status_config");
        m20606g(oVar, "familiar_im_group_config");
        m20599a(oVar, "enable_mv_res_check", false);
        m20599a(oVar, "enable_main_thread_publish_scheduler", false);
        m20599a(oVar, "enable_pre_publish_when_memory_get_failed", true);
        m20596a(oVar, "pre_post_check_freq_limit", -1);
        m20596a(oVar, "pre_post_check_type", 0);
        m20596a(oVar, "pre_publish_min_api_level_1", -1);
        m20596a(oVar, "pre_publish_min_api_level_2", -1);
        m20596a(oVar, "pre_publish_min_available_memory_mb_level_1", -1);
        m20596a(oVar, "pre_publish_min_available_memory_mb_level_2", -1);
        m20596a(oVar, "pre_publish_min_jvm_available_memory_mb_level_1", -1);
        m20596a(oVar, "pre_publish_min_jvm_available_memory_mb_level_2", -1);
        m20596a(oVar, "pre_publish_min_total_memory_mb_level_1", 1600);
        m20596a(oVar, "pre_publish_min_total_memory_mb_level_2", 1600);
        m20598a(oVar, "video_description", "");
        m20596a(oVar, "category_version", 0);
        m20599a(oVar, "enable_4k_import_benchmark", false);
        m20599a(oVar, "enable_h264_hw_decoder", false);
        m20599a(oVar, "allow_long_video", false);
        m20596a(oVar, "allow_long_video_threshold", 0);
        m20599a(oVar, "fast_import_1080p_higher_benchmark_enable", false);
        m20596a(oVar, "fast_import_1080p_higher_fps_limited", 60);
        m20599a(oVar, "fast_import_1080p_lower_benchmark_enable", false);
        m20599a(oVar, "fast_import_720p_higher_benchmark_enable", false);
        m20596a(oVar, "fast_import_720p_higher_fps_limited", 60);
        m20599a(oVar, "is_block_error_go_publish", true);
        m20606g(oVar, "virus_setting");
        m20596a(oVar, "feed_find_bug_setting", 1);
        m20598a(oVar, "new_hashtag_regex", "");
        m20598a(oVar, "priority_region", "");
        m20598a(oVar, "tt_regions", "");
        m20598a(oVar, "ad_tracker_config", "");
        m20599a(oVar, "ai_music_backup_strategy", false);
        m20596a(oVar, "anti_addiction_day_time", 0);
        m20596a(oVar, "anti_addiction_night_time", 0);
        m20596a(oVar, "anti_addiction_separation", 0);
        m20596a(oVar, "anti_addiction_toast_time", 0);
        m20597a(oVar, "auto_live_state_interval_mills", 60000);
        m20599a(oVar, "awesome_splash_force_use_h264", false);
        m20596a(oVar, "background_pause_player_setting", 0);
        m20598a(oVar, "business_eshop_manager", BusinessEshopManagerSettings.DEFAULT);
        m20596a(oVar, "check_lark_inhouse_net", 1);
        m20596a(oVar, "close_login_agreement", 0);
        m20596a(oVar, "close_sync_to_helo_entry", 1);
        m20599a(oVar, "disable_online_small_emoji", false);
        m20599a(oVar, "disable_qi_video_share", false);
        m20599a(oVar, "disable_vast_bitrate", false);
        m20599a(oVar, "disallow_vast_has_author", false);
        m20598a(oVar, "doulab_use_information_url", "");
        m20596a(oVar, "douplus_bullet_entry", 0);
        m20596a(oVar, "douplus_entry_feed", 0);
        m20599a(oVar, "draft_use_multi_video_edit", false);
        m20596a(oVar, "edit_effect_auto_download_size", 5);
        m20599a(oVar, "enable_ad_router", false);
        m20599a(oVar, "enable_anchor_cache", false);
        m20599a(oVar, "enable_auto_live_state", false);
        m20599a(oVar, "enable_av_storage_monitor", true);
        m20599a(oVar, "enable_camera_beautify_effect", false);
        m20599a(oVar, "enable_comment_create_sticker", false);
        m20599a(oVar, "enable_comment_offensive_filter_switch", false);
        m20596a(oVar, "enable_cover_effect", 0);
        m20599a(oVar, "enable_display_favorite_miniapp", true);
        m20599a(oVar, "enable_display_favorite_minigame", true);
        m20596a(oVar, "enable_email_verification", 1);
        m20599a(oVar, "enable_enter_live_room_stream_opt_from_follow_sky", false);
        m20599a(oVar, "enable_enter_live_room_stream_opt", true);
        m20599a(oVar, "enable_group_member_by_followers", false);
        m20599a(oVar, "enable_high_risk_rebind_alert", true);
        m20599a(oVar, "enable_live_drawer_dialog", true);
        m20599a(oVar, "enable_live_splash", true);
        m20599a(oVar, "enable_moji_update_resources", true);
        m20599a(oVar, "enable_new_user_info_sync", false);
        m20599a(oVar, "enable_normal_splash_ad", true);
        m20599a(oVar, "enable_params_override_deeplinkhandleractivity", false);
        m20599a(oVar, "enable_preload_component", true);
        m20599a(oVar, "enable_push_alliance_sdk", false);
        m20599a(oVar, "enable_splash_launch_fix", true);
        m20599a(oVar, "enable_t_im_chat_everyone", false);
        m20599a(oVar, "enable_use_game_rotation_sensor", true);
        m20596a(oVar, "enable_youtube_app_auth", 0);
        m20596a(oVar, "enabled_im_asupporter_funcs", 3);
        m20596a(oVar, "enabled_im_asupporter_msg_types", 5);
        m20596a(oVar, "f2_notice_type", 0);
        m20599a(oVar, "feed_handle_generic_motion", true);
        m20599a(oVar, "feedback_record_enable", true);
        m20596a(oVar, "first_install_time", -1);
        m20599a(oVar, "following_follower_permission_switch", false);
        m20599a(oVar, "forbid_voice_change_on_edit_page", true);
        m20599a(oVar, "group_new_member_can_pull_old_msg", false);
        m20598a(oVar, "heartbeat_default_url", HeartbeatDefaultUrlSettings.DEFAULT);
        m20596a(oVar, "hotspot_guide_time", 3);
        m20596a(oVar, "inapp_update_switch_strategy", 0);
        m20596a(oVar, "is_adapter_video_play_size_ad", 0);
        m20596a(oVar, "is_adapter_video_play_size", 0);
        m20599a(oVar, "is_hot_user", false);
        m20599a(oVar, "is_low_memory_machine_for_tools", false);
        m20599a(oVar, "is_nearby_old_user", false);
        m20599a(oVar, "keep_cookies", false);
        m20596a(oVar, "keva_switch", 1);
        m20596a(oVar, "light_enhance_threshold", 50);
        m20596a(oVar, "live_square_guide_show_count", 0);
        m20599a(oVar, "main_tab_follow_use_lazy_viewpager", false);
        m20596a(oVar, "max_message_count_for_recommend", 5);
        m20596a(oVar, "min_follow_num_for_landing_follow_tab", 100);
        m20599a(oVar, "miniapp_preload_empty_process_enbale", false);
        m20599a(oVar, "miniapp_wonderland_enable", false);
        m20596a(oVar, "mix_permission", 0);
        m20599a(oVar, "mt_forbid_insert_placeholder_word", false);
        m20596a(oVar, "mt_local_analysis_hprof", 0);
        m20596a(oVar, "mt_search_history_fold_count", 3);
        m20599a(oVar, "post_download_setting", false);
        m20596a(oVar, "poster_sr_type", 0);
        m20596a(oVar, "pushdelayinit_switch", 0);
        m20596a(oVar, "read_video_last_gap", 200);
        m20599a(oVar, "real_time_report_enable", true);
        m20597a(oVar, "reuse_phone_check_interval", 0);
        m20596a(oVar, "sat_camera_type", 0);
        m20596a(oVar, "search_history_collapse_num", 4);
        m20596a(oVar, "search_middle_recommend_words_count", 12);
        m20596a(oVar, "sec_id_switch", 1);
        m20598a(oVar, "shop_link_anchor_disclaimer", "");
        m20596a(oVar, "show_device_manager_entry", 0);
        m20599a(oVar, "show_doulab_entrance", true);
        m20596a(oVar, "show_from_duoshan_label", 0);
        m20599a(oVar, "show_qqdownloader_privacy_dialog", false);
        m20597a(oVar, "show_storage_dot_size", (long) ShowStorageDotSizeSettings.DEFAULT);
        m20597a(oVar, "show_storage_tip_size", (long) ShowStorageTipSizeSettings.DEFAULT);
        m20599a(oVar, "smartisan_data_sharing_switch", true);
        m20597a(oVar, "splash_stock_delay_millis_time", 2000);
        m20598a(oVar, "star_atlas_profile_link", StarAtlasProfileLinkSettings.DEFAULT);
        m20598a(oVar, "status_lottie_url", "");
        m20596a(oVar, "status_phone_type", 0);
        m20598a(oVar, "status_tab_key", "");
        m20599a(oVar, "sticker_update_app", false);
        m20599a(oVar, "support_filter_error_file", false);
        m20596a(oVar, "tcm_ctry_settings", 0);
        m20598a(oVar, "tcm_name_ctry", TcmNameCtrySettings.DEFAULT);
        m20598a(oVar, "ug_sec_link_url", "");
        m20596a(oVar, "ug_share_webview_sec_level", 0);
        m20599a(oVar, "use_bridge_engine_v2", false);
        m20599a(oVar, "use_new_splash_view", false);
        m20599a(oVar, "use_newyear_direct_upload", false);
        m20596a(oVar, "use_ve_image", 0);
        m20599a(oVar, "ve_fast_import_ignore_recode_for_rotation", false);
        m20599a(oVar, "ve_fast_import_ignore_recode", false);
        m20598a(oVar, "ve_runtime_config", "");
        m20596a(oVar, "video_play_progress_count", 0);
        m20598a(oVar, "wikipedia_anchor_url_placeholder", WikipediaAnchorUrlPlaceholderSettings.DEFAULT);
        m20599a(oVar, "with_douplus_entry", false);
        m20604e(oVar, "video_bitrate");
        m20603d(oVar, "http_retry_interval");
        m20603d(oVar, "http_timeout");
        m20595a(oVar, "video_compose");
        m20595a(oVar, "video_commit");
        m20595a(oVar, "use_hardcode");
        m20595a(oVar, "face_detect_interval");
        m20601b(oVar, "original_musician_entry");
        m20595a(oVar, "musician_show_type");
        m20602c(oVar, "orginal_musician_url");
        m20605f(oVar, "share_h5_url_whitelist");
        m20602c(oVar, "discovery_location_background_url");
        m20595a(oVar, "video_quality");
        m20595a(oVar, "synthetic_video_quality");
        m20603d(oVar, "synthetic_video_maxrate");
        m20595a(oVar, "synthetic_video_preset");
        m20595a(oVar, "synthetic_video_gop");
        m20606g(oVar, "video_bitrate_category");
        m20606g(oVar, "video_quality_category");
        m20595a(oVar, "in_evening");
        m20606g(oVar, "ad_landing_page_config");
        m20601b(oVar, "can_react");
        m20601b(oVar, "enable_local_music_entrance");
        m20595a(oVar, "story_image_play_time");
        m20601b(oVar, "shield_music_sdk");
        m20595a(oVar, "use_synthetic_hardcode");
        m20604e(oVar, "synthetic_video_bitrate");
        m20601b(oVar, "forbid_life_story_local_watermark");
        m20601b(oVar, "forbid_local_watermark");
        m20601b(oVar, "use_watermark_hardcode");
        m20601b(oVar, "enable_upload_sync_twitter");
        m20601b(oVar, "enable_upload_sync_ins");
        m20601b(oVar, "enable_upload_sync_ins_story");
        m20601b(oVar, "enable_synthetic_fps_set");
        m20601b(oVar, "upload_origin_audio_track");
        m20595a(oVar, "close_vframe_upload");
        m20601b(oVar, "private_available");
        m20595a(oVar, "beauty_model");
        m20601b(oVar, "long_video_permitted");
        m20603d(oVar, "long_video_threshold");
        m20603d(oVar, "progressbar_threshold");
        m20606g(oVar, "aweme_fe_conf");
        m20606g(oVar, "shopping");
        m20606g(oVar, "fe_config_collection");
        m20602c(oVar, "video_size");
        m20605f(oVar, "video_size_category");
        m20605f(oVar, "upload_video_size_category");
        m20606g(oVar, "hotsearch_switchs");
        m20595a(oVar, "open_im_link");
        m20602c(oVar, "im_url_template");
        m20595a(oVar, "im_contacts_multi_select_limit");
        m20595a(oVar, "record_bitrate_mode");
        m20595a(oVar, "record_open_high_profile");
        m20595a(oVar, "record_camera_type");
        m20595a(oVar, "download_setting_enable");
        m20595a(oVar, "record_camera_compat_level");
        m20595a(oVar, "react_mic_status");
        m20601b(oVar, "enable_large_matting_detect_model");
        m20601b(oVar, "enable_large_gesture_detect_model");
        m20601b(oVar, "music_copyright_granted");
        m20601b(oVar, "enable_water_bg_mask");
        m20606g(oVar, "im_x_display_style_config");
        m20595a(oVar, "im_x_unread_count_strategy");
        m20595a(oVar, "im_x_use_encrypted_image");
        m20605f(oVar, "im_image_domains");
        m20595a(oVar, "bitrate_of_recode_threshold");
        m20601b(oVar, "story_support_animate");
        m20595a(oVar, "video_upload_normalization_param");
        m20595a(oVar, "wide_camera_info");
        m20601b(oVar, "life_effects_cold_req");
        m20606g(oVar, "ulike_params");
        m20595a(oVar, "shake_free_white_list");
        m20602c(oVar, "free_flow_card_url_sticker");
        m20595a(oVar, "in_camera2_black_list");
        m20601b(oVar, "shutter_sound_enable");
        m20606g(oVar, "poi_setting");
        m20601b(oVar, "default_shake_free_mode");
        m20601b(oVar, "enable_hq_vframe");
        m20603d(oVar, "video_duration_limit_ms");
        m20602c(oVar, "shoot_tutorial_link");
        m20606g(oVar, "flipchat_settings");
        m20601b(oVar, "enable_auto_retry_record");
        m20595a(oVar, "enable_4k_import");
        m20601b(oVar, "enable_on_page_select_pause_check");
        m20601b(oVar, "disable_delay_token_beat_request");
        m20601b(oVar, "enable_delay_request");
        m20601b(oVar, "disable_delay_fetch_user_request");
        m20601b(oVar, "disable_delay_fetch_share_setting_request");
        m20601b(oVar, "disable_delay_fetch_samecity_active_request");
        m20606g(oVar, "thirdparty_login_bind_skip");
        m20606g(oVar, "e_platform_settings");
        m20601b(oVar, "enable_audio_auto_play");
        m20601b(oVar, "disable_delay_app_alert_request");
        m20601b(oVar, "av_default_wide_mode");
        m20601b(oVar, "disable_delay_sec_report");
        m20601b(oVar, "show_rocket_share_if_install");
        m20602c(oVar, "comment_filter_tips_supported");
        m20601b(oVar, "enable_download_tt_data");
        m20606g(oVar, "app_store_score");
        m20601b(oVar, "enable_hd_h264_hw_decoder");
        m20595a(oVar, "hd_hw_decoder_min_side_size");
        m20606g(oVar, "feedback_conf");
        m20601b(oVar, "use_right_swipe_back");
        m20595a(oVar, "upload_contacts_notice_times");
        m20595a(oVar, "upload_contacts_notice_interval");
        m20601b(oVar, "disable_om_sdk");
        m20601b(oVar, "profile_page_skip_remove");
        m20595a(oVar, "pre_upload_memory_limit");
        m20601b(oVar, "disable_delay_ab_sdk_request");
        m20595a(oVar, "ws_use_new_sdk");
        m20603d(oVar, "splash_preload_delay");
        m20601b(oVar, "silent_share_configurable");
        m20606g(oVar, "silent_share_list");
        m20601b(oVar, "enable_symphony_sdk");
        m20605f(oVar, "api_alog_white_list");
        m20606g(oVar, "bio_settings");
        m20601b(oVar, "enable_commerce_order");
        m20606g(oVar, "douyin_order");
        m20605f(oVar, "preload_micro_app_list");
        m20606g(oVar, "douplus_entry_title");
        m20606g(oVar, "content_language_guide_codes");
        m20595a(oVar, "follow_tab_live_type");
        m20595a(oVar, "is_enable_splash_first_show_retrieval");
        m20595a(oVar, "local_video_cache_max_age");
        m20595a(oVar, "local_video_cache_max_length");
        m20601b(oVar, "aweme_enable_china_union_service");
        m20601b(oVar, "aweme_enable_china_telecom_service");
        m20601b(oVar, "aweme_enable_china_mobile_service");
        m20606g(oVar, "one_bind_net_setting");
        m20605f(oVar, "filter_colors");
        m20601b(oVar, "disable_dvm_linear_alloc_opt");
        m20606g(oVar, "pro_account_enable_detail_info");
        m20606g(oVar, "aweme_activity_setting");
        m20595a(oVar, "enable_1080p_fast_import");
        m20601b(oVar, "discard_refresh_top_dsp");
        m20598a(oVar, "im_group_password_regex", "[\\U0001F300-\\U0001F64F|\\U0001F680-\\U0001F6FF|\\u2600-\\u2B55]{6}\n?[\\U0001F300-\\U0001F64F|\\U0001F680-\\U0001F6FF|\\u2600-\\u2B55]{6}");
        m20606g(oVar, "im_create_chat_bubble");
        m20606g(oVar, "new_anchor_show_bubble_settings");
        m20602c(oVar, "sticker_artist_icon_url");
        m20605f(oVar, "keva_blacklist");
        m20605f(oVar, "dmt_source_url_whitelist");
        m20606g(oVar, "show_whatsapp_by_calling_code");
        m20605f(oVar, "ttnet_intercept_webview_white_list");
        m20605f(oVar, "ttnet_intercept_webview_black_list");
        m20595a(oVar, "enable_ve_single_gl");
        m20606g(oVar, "im_associative_emoticon_all");
        m20601b(oVar, "show_music_feedback_entrance");
        m20595a(oVar, "miniapp_preload_enbale");
        m20601b(oVar, "enable_reuse_editor_for_fastimport");
        m20601b(oVar, "disable_delay_ws_request");
        m20605f(oVar, "lab_feature_ids");
        m20595a(oVar, "statistics_backup_pct");
        m20601b(oVar, "anti_addiction_toast_enable_24hour_time");
        m20606g(oVar, "contact_upload_ui_limits");
        m20601b(oVar, "disable_im_message_full_feed_slide");
        m20595a(oVar, "third_party_data_refresh");
        m20606g(oVar, "flexible_update_strategy");
        m20606g(oVar, "aweme_fe_elite");
        m20606g(oVar, "douyin_fe_business");
        m20605f(oVar, "aweme_high_risk_area_code");
        m20606g(oVar, "mtcert_settings");
        m20606g(oVar, "ad_fe_settings");
        m20595a(oVar, "data_saver_setting");
        m20602c(oVar, "effect_sdk_config_settings");
        m20606g(oVar, "spring_api_limit_config");
        m20606g(oVar, "addiction_settings");
        m20606g(oVar, "search_pull_feedback");
        m20606g(oVar, "hybrid_monitor_config");
        m20602c(oVar, "impression_page_schema");
        m20606g(oVar, "quick_shop_loading_page");
        m20605f(oVar, "webview_cache_urls");
        m20606g(oVar, "im_use_okhttpclient");
        m20606g(oVar, "channel_tabs");
        m20606g(oVar, "vision_search");
        m20605f(oVar, "cache_clean_default_white_list");
        m20606g(oVar, "live_inner_push_config");
        m20606g(oVar, "like_praise_dialog_info");
        m20606g(oVar, "popup_black_list");
        m20606g(oVar, "push_guide_info");
        m20605f(oVar, "splash_switch_server_list");
        m20606g(oVar, "super_entrance_config");
        m20602c(oVar, "movie_detail");
        m20606g(oVar, "email_login_settings");
        m20606g(oVar, "age_gate_settings");
        m20601b(oVar, "clean_share_files");
        m20606g(oVar, "fe_anchor_ad_conf");
        m20606g(oVar, "vcd_v1_config_info");
        m20606g(oVar, "live_cny_settings");
        m20606g(oVar, "comment_list_ad_migration");
        m20606g(oVar, "commerce_egg_config");
        m20605f(oVar, "webview_cache_pool_switch");
        try {
            C10181b.m20511a().f27515d.mo18215a("abmock_saved3", true);
        } catch (Throwable th2) {
            C9220a.m18311a(th2);
        }
        return true;
    }

    /* renamed from: f */
    private static void m20605f(C18085o oVar, String str) {
        try {
            C18082l b = oVar.mo35022b(str);
            if (b != null) {
                C10181b.m20511a().f27515d.mo18213a(str, b);
            } else {
                C10181b.m20511a().f27515d.mo18208a(str);
            }
        } catch (Throwable th) {
            C9220a.m18311a(th);
        }
    }

    /* renamed from: a */
    private static void m20595a(C18085o oVar, String str) {
        try {
            C18088r c = oVar.mo35023c(str);
            if (c != null) {
                if (c.mo35030a()) {
                    C10181b.m20511a().f27515d.mo18211a(str, c.mo34911h() ? 1 : 0);
                } else {
                    C10181b.m20511a().f27515d.mo18211a(str, c.mo34910g());
                }
                return;
            }
            C10181b.m20511a().f27515d.mo18208a(str);
        } catch (Throwable th) {
            C9220a.m18311a(th);
        }
    }

    /* renamed from: b */
    private static void m20601b(C18085o oVar, String str) {
        boolean z;
        try {
            C18088r c = oVar.mo35023c(str);
            if (c != null) {
                if (c.mo35033q()) {
                    C10196q qVar = C10181b.m20511a().f27515d;
                    if (c.mo34910g() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    qVar.mo18215a(str, z);
                } else {
                    C10181b.m20511a().f27515d.mo18215a(str, c.mo34911h());
                }
                return;
            }
            C10181b.m20511a().f27515d.mo18208a(str);
        } catch (Throwable th) {
            C9220a.m18311a(th);
        }
    }

    /* renamed from: c */
    private static void m20602c(C18085o oVar, String str) {
        try {
            C18082l b = oVar.mo35022b(str);
            if (b != null) {
                C10181b.m20511a().f27515d.mo18214a(str, b.mo34905c());
            } else {
                C10181b.m20511a().f27515d.mo18208a(str);
            }
        } catch (Throwable th) {
            C9220a.m18311a(th);
        }
    }

    /* renamed from: d */
    private static void m20603d(C18085o oVar, String str) {
        try {
            C18082l b = oVar.mo35022b(str);
            if (b != null) {
                C10181b.m20511a().f27515d.mo18212a(str, b.mo34909f());
            } else {
                C10181b.m20511a().f27515d.mo18208a(str);
            }
        } catch (Throwable th) {
            C9220a.m18311a(th);
        }
    }

    /* renamed from: e */
    private static void m20604e(C18085o oVar, String str) {
        try {
            C18082l b = oVar.mo35022b(str);
            if (b != null) {
                C10181b.m20511a().f27515d.mo18210a(str, b.mo34907e());
            } else {
                C10181b.m20511a().f27515d.mo18208a(str);
            }
        } catch (Throwable th) {
            C9220a.m18311a(th);
        }
    }

    /* renamed from: g */
    private static void m20606g(C18085o oVar, String str) {
        try {
            C18082l b = oVar.mo35022b(str);
            if (b != null) {
                C10181b.m20511a().f27515d.mo18221b(str, b.toString());
            } else {
                C10181b.m20511a().f27515d.mo18208a(str);
            }
        } catch (Throwable th) {
            C9220a.m18311a(th);
        }
    }

    /* renamed from: a */
    private static void m20596a(C18085o oVar, String str, int i) {
        try {
            C18088r c = oVar.mo35023c(str);
            if (c != null) {
                if (c.mo35030a()) {
                    C10181b.m20511a().f27515d.mo18211a(str, c.mo34911h() ? 1 : 0);
                } else {
                    C10181b.m20511a().f27515d.mo18211a(str, c.mo34910g());
                }
                return;
            }
            C10181b.m20511a().f27515d.mo18211a(str, i);
        } catch (Throwable th) {
            C9220a.m18311a(th);
        }
    }

    /* renamed from: a */
    private static void m20597a(C18085o oVar, String str, long j) {
        try {
            C18082l b = oVar.mo35022b(str);
            if (b != null) {
                C10181b.m20511a().f27515d.mo18212a(str, b.mo34909f());
            } else {
                C10181b.m20511a().f27515d.mo18212a(str, j);
            }
        } catch (Throwable th) {
            C9220a.m18311a(th);
        }
    }

    /* renamed from: a */
    private static void m20598a(C18085o oVar, String str, String str2) {
        try {
            C18082l b = oVar.mo35022b(str);
            if (b != null) {
                C10181b.m20511a().f27515d.mo18214a(str, b.mo34905c());
            } else {
                C10181b.m20511a().f27515d.mo18214a(str, str2);
            }
        } catch (Throwable th) {
            C9220a.m18311a(th);
        }
    }

    /* renamed from: a */
    private static void m20599a(C18085o oVar, String str, boolean z) {
        boolean z2;
        try {
            C18088r c = oVar.mo35023c(str);
            if (c != null) {
                if (c.mo35033q()) {
                    C10196q qVar = C10181b.m20511a().f27515d;
                    if (c.mo34910g() != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    qVar.mo18215a(str, z2);
                } else {
                    C10181b.m20511a().f27515d.mo18215a(str, c.mo34911h());
                }
                return;
            }
            C10181b.m20511a().f27515d.mo18215a(str, z);
        } catch (Throwable th) {
            C9220a.m18311a(th);
        }
    }
}
