package com.bytedance.android.livesdk.p272ad;

import android.util.LongSparseArray;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.android.livesdk.ad.b */
public interface C4525b {

    /* renamed from: A */
    public static final C4526c<Boolean> f12305A = new C4526c<>("live_inroom_pk_tips", Boolean.valueOf(true));

    /* renamed from: B */
    public static final C4526c<Boolean> f12306B = new C4526c<>("live_inroom_pk_animation", Boolean.valueOf(false));

    /* renamed from: C */
    public static final C4526c<Set<Long>> f12307C = new C4526c<>("gift_panel_showed_manual", new HashSet());

    /* renamed from: D */
    public static final C4526c<Set<String>> f12308D = new C4526c<>("gift_panel_opened_guide_url", new HashSet());

    /* renamed from: E */
    public static final C4526c<Long> f12309E = new C4526c<>("new_gift_notify_has_showed_id", Long.valueOf(0));

    /* renamed from: F */
    public static final C4526c<Boolean> f12310F = new C4526c<>("showed_doodle_template_popup_tip", Boolean.valueOf(false));

    /* renamed from: G */
    public static final C4526c<Boolean> f12311G = new C4526c<>("gift_animation_enable_landscape", Boolean.valueOf(true));

    /* renamed from: H */
    public static final C4526c<Long> f12312H = new C4526c<>("live_start_live_anchor", Long.valueOf(0));

    /* renamed from: I */
    public static final C4526c<Integer> f12313I = new C4526c<>("live_preview_location_show_state", Integer.valueOf(0));

    /* renamed from: J */
    public static final C4526c<String> f12314J = new C4526c<>("live_start_live_mode", C8710m.VIDEO.name());

    /* renamed from: K */
    public static final C4526c<Map<String, String>> f12315K = new C4526c<>("live_start_live_tag", new HashMap());

    /* renamed from: L */
    public static final C4526c<Boolean> f12316L = new C4526c<>("live_beauty_feedback_clicked", Boolean.valueOf(false));

    /* renamed from: M */
    public static final C4526c<Integer> f12317M = new C4526c<>("live_filter_id", Integer.valueOf(-1));

    /* renamed from: N */
    public static final C4526c<Float> f12318N = new C4526c<>("whitening_param_v2", Float.valueOf(-1.0f));

    /* renamed from: O */
    public static final C4526c<Float> f12319O = new C4526c<>("beauty_skin_param_v2", Float.valueOf(-1.0f));

    /* renamed from: P */
    public static final C4526c<Float> f12320P = new C4526c<>("big_eyes_param", Float.valueOf(-1.0f));

    /* renamed from: Q */
    public static final C4526c<Float> f12321Q = new C4526c<>("face_lift_param", Float.valueOf(-1.0f));

    /* renamed from: R */
    public static final C4526c<Integer> f12322R = new C4526c<>("beauty_level", Integer.valueOf(3));

    /* renamed from: S */
    public static final C4526c<Set<Long>> f12323S = new C4526c<>("prop_panel_showed_red_point", new HashSet());

    /* renamed from: T */
    public static final C4526c<Set<String>> f12324T = new C4526c<>("fast_gift_hide_confirm_gift", new HashSet());

    /* renamed from: U */
    public static final C4526c<Set<String>> f12325U = new C4526c<>("mt_fast_gift_hide_confirm_gift", new HashSet());

    /* renamed from: V */
    public static final C4526c<Float> f12326V = new C4526c<>("barrage_alpha", Float.valueOf(1.0f));

    /* renamed from: W */
    public static final C4526c<Float> f12327W = new C4526c<>("barrage_size", Float.valueOf(1.0f));

    /* renamed from: X */
    public static final C4526c<Integer> f12328X = new C4526c<>("barrage_local_type", Integer.valueOf(2));

    /* renamed from: Y */
    public static final C4526c<Boolean> f12329Y = new C4526c<>("barrage_enable", Boolean.valueOf(true));

    /* renamed from: Z */
    public static final C4526c<Boolean> f12330Z = new C4526c<>("room_auto_gift_thanks", Boolean.valueOf(false));

    /* renamed from: a */
    public static final C4526c<Boolean> f12331a = new C4526c<>("jump_to_room_dialog", Boolean.valueOf(false));

    /* renamed from: aA */
    public static final C4526c<Boolean> f12332aA = new C4526c<>("recharge_dialog_balance_change_tip_shown", Boolean.valueOf(false));

    /* renamed from: aB */
    public static final C4526c<Boolean> f12333aB = new C4526c<>("recharge_dialog_big_deal_hint_shown", Boolean.valueOf(false));

    /* renamed from: aC */
    public static final C4526c<Boolean> f12334aC = new C4526c<>("live_comment_danmu_state", Boolean.valueOf(false));

    /* renamed from: aD */
    public static final C4526c<String> f12335aD = new C4526c<>("room_decoration_customize_text", "");

    /* renamed from: aE */
    public static final C4526c<Integer> f12336aE = new C4526c<>("room_decoration_text_pass_level", Integer.valueOf(31));

    /* renamed from: aF */
    public static final C4526c<Long> f12337aF = new C4526c<>("room_decoration_anchor_id", Long.valueOf(0));

    /* renamed from: aG */
    public static final C4526c<String> f12338aG = new C4526c<>("room_decoration_list", "");

    /* renamed from: aH */
    public static final C4526c<Boolean> f12339aH = new C4526c<>("show_room_decoration_toast", Boolean.valueOf(true));

    /* renamed from: aI */
    public static final C4526c<Integer> f12340aI = new C4526c<>("live_interact_pk_clean_num", Integer.valueOf(5));

    /* renamed from: aJ */
    public static final C4526c<Integer> f12341aJ = new C4526c<>("live_steal_tower", Integer.valueOf(1));

    /* renamed from: aK */
    public static final C4526c<Integer> f12342aK = new C4526c<>("live_interact_pk_refuse_count_per_day", Integer.valueOf(0));

    /* renamed from: aL */
    public static final C4526c<String> f12343aL = new C4526c<>("live_interact_pk_first_refuse_date", "");

    /* renamed from: aM */
    public static final C4526c<Boolean> f12344aM = new C4526c<>("live_pk_medal_is_in_promotion", Boolean.valueOf(false));

    /* renamed from: aN */
    public static final C4526c<Long> f12345aN = new C4526c<>("live_pk_medal_promotion_start_time", Long.valueOf(0));

    /* renamed from: aO */
    public static final C4526c<Integer> f12346aO = new C4526c<>("live_interact_pk_duration", Integer.valueOf(300));

    /* renamed from: aP */
    public static final C4526c<Integer> f12347aP = new C4526c<>("live_interact_pk_duration_index", Integer.valueOf(1));

    /* renamed from: aQ */
    public static final C4526c<Boolean> f12348aQ = new C4526c<>("live_interact_pk_setting_red_point", Boolean.valueOf(true));

    /* renamed from: aR */
    public static final C4526c<Boolean> f12349aR = new C4526c<>("live_interact_setting_red_point", Boolean.valueOf(true));

    /* renamed from: aS */
    public static final C4526c<Boolean> f12350aS = new C4526c<>("live_interact_pk_auto_match", Boolean.valueOf(false));

    /* renamed from: aT */
    public static final C4526c<Boolean> f12351aT = new C4526c<>("live_interact_pk_auto_start_match", Boolean.valueOf(false));

    /* renamed from: aU */
    public static final C4526c<String> f12352aU = new C4526c<>("live_interact_pk_theme", "");

    /* renamed from: aV */
    public static final C4526c<Boolean> f12353aV = new C4526c<>("showed_pay_channel_scroll_tip", Boolean.valueOf(false));

    /* renamed from: aW */
    public static final C4526c<Boolean> f12354aW = new C4526c<>("show_enter_other_live_room_dialog", Boolean.valueOf(true));

    /* renamed from: aX */
    public static final C4526c<Boolean> f12355aX = new C4526c<>("show_enter_other_live_room_dialog_of_hour_rank", Boolean.valueOf(true));

    /* renamed from: aY */
    public static final C4526c<Long> f12356aY = new C4526c<>("mobile_flow_show_time", Long.valueOf(0));

    /* renamed from: aZ */
    public static final C4526c<String> f12357aZ = new C4526c<>("last_first_charge_bubble_show_time", "");

    /* renamed from: aa */
    public static final C4526c<Boolean> f12358aa = new C4526c<>("game_quiz_anchor_tip_show", Boolean.valueOf(false));

    /* renamed from: ab */
    public static final C4526c<Long> f12359ab = new C4526c<>("live_guide_to_feed_show_time", Long.valueOf(0));

    /* renamed from: ac */
    public static final C4526c<String> f12360ac = new C4526c<>("gift_guide_flag", "");

    /* renamed from: ad */
    public static final C4526c<Boolean> f12361ad = new C4526c<>("live_game_quit_click", Boolean.valueOf(false));

    /* renamed from: ae */
    public static final C4526c<Boolean> f12362ae = new C4526c<>("live_share_get_diamonds_tip", Boolean.valueOf(true));

    /* renamed from: af */
    public static final C4526c<Integer> f12363af = new C4526c<>("live_game_msg_state", Integer.valueOf(0));

    /* renamed from: ag */
    public static final C4526c<Boolean> f12364ag = new C4526c<>("live_game_comment_msg_push", Boolean.valueOf(true));

    /* renamed from: ah */
    public static final C4526c<Boolean> f12365ah = new C4526c<>("live_game_gift_msg_push", Boolean.valueOf(true));

    /* renamed from: ai */
    public static final C4526c<Boolean> f12366ai = new C4526c<>("live_game_enter_msg_push", Boolean.valueOf(true));

    /* renamed from: aj */
    public static final C4526c<Boolean> f12367aj = new C4526c<>("live_anchor_show_fans_club_push", Boolean.valueOf(false));

    /* renamed from: ak */
    public static final C4526c<Boolean> f12368ak = new C4526c<>("live_anchor_show_fans_club_auto_light_4_anchor_push", Boolean.valueOf(false));

    /* renamed from: al */
    public static final C4526c<Boolean> f12369al = new C4526c<>("live_anchor_show_fans_club_auto_light_4_audience_push", Boolean.valueOf(false));

    /* renamed from: am */
    public static final C4526c<Boolean> f12370am = new C4526c<>("gesture_magic_guide_flag", Boolean.valueOf(true));

    /* renamed from: an */
    public static final C4526c<Map<String, Boolean>> f12371an = new C4526c<>("gesture_magic_guide_v2", new HashMap());

    /* renamed from: ao */
    public static final C4526c<Boolean> f12372ao = new C4526c<>("gesture_magic_switch", Boolean.valueOf(true));

    /* renamed from: ap */
    public static final C4526c<Boolean> f12373ap = new C4526c<>("gesture_magic_switch_v2", Boolean.valueOf(false));

    /* renamed from: aq */
    public static final C4526c<Map<String, String>> f12374aq = new C4526c<>("gesture_magic_old_select_composer_path_map", new HashMap());

    /* renamed from: ar */
    public static final C4526c<Map<String, List<String>>> f12375ar = new C4526c<>("gesture_magic_select_composer_path_map", new HashMap());

    /* renamed from: as */
    public static final C4526c<Map<String, Map<String, Float>>> f12376as = new C4526c<>("live_composer_save_node_tag_value", new HashMap());

    /* renamed from: at */
    public static final C4526c<Integer> f12377at = new C4526c<>("current_sticker_page_position", Integer.valueOf(0));

    /* renamed from: au */
    public static final C4526c<Boolean> f12378au = new C4526c<>("show_backpack_tips", Boolean.valueOf(true));

    /* renamed from: av */
    public static final C4526c<Map<Long, String>> f12379av = new C4526c<>("guard_info_map", new HashMap());

    /* renamed from: aw */
    public static final C4526c<Boolean> f12380aw = new C4526c<>("vigo_show_start_live_flame_tip", Boolean.valueOf(true));

    /* renamed from: ax */
    public static final C4526c<Integer> f12381ax = new C4526c<>("vigo_show_end_live_flame_tip_count", Integer.valueOf(0));

    /* renamed from: ay */
    public static final C4526c<Boolean> f12382ay = new C4526c<>("package_purchase_showed", Boolean.valueOf(false));

    /* renamed from: az */
    public static final C4526c<String> f12383az = new C4526c<>("last_pay_channel", "");

    /* renamed from: b */
    public static final C4526c<Set<String>> f12384b = new C4526c<>("gift_list_type", new HashSet());

    /* renamed from: bA */
    public static final C4526c<Map<Long, Boolean>> f12385bA = new C4526c<>("official_red_envelope_map", new HashMap());

    /* renamed from: bB */
    public static final C4526c<Map<Long, Boolean>> f12386bB = new C4526c<>("cny_red_envelope_map", new HashMap());

    /* renamed from: bC */
    public static final C4526c<Boolean> f12387bC = new C4526c<>("official_task_packet_animation", Boolean.valueOf(false));

    /* renamed from: bD */
    public static final C4526c<Boolean> f12388bD = new C4526c<>("has_show_koi_play_description", Boolean.valueOf(false));

    /* renamed from: bE */
    public static final C4526c<Set<String>> f12389bE = new C4526c<>("star_room_open_red_packet_rooms", new HashSet());

    /* renamed from: bF */
    public static final C4526c<Set<String>> f12390bF = new C4526c<>("star_room_open_red_packet_uids", new HashSet());

    /* renamed from: bG */
    public static final C4526c<Boolean> f12391bG = new C4526c<>("has_play_gift_failure_on_mediaplayer", Boolean.valueOf(false));

    /* renamed from: bH */
    public static final C4526c<Boolean> f12392bH = new C4526c<>("has_shown_portal_gift_guide", Boolean.valueOf(false));

    /* renamed from: bI */
    public static final C4526c<Map<String, Boolean>> f12393bI = new C4526c<>("douyin_fansclub_tips_anchor_map", new HashMap());

    /* renamed from: bJ */
    public static final C4526c<Map<String, Double>> f12394bJ = new C4526c<>("douyin_fansclub_tips_count_map", new HashMap());

    /* renamed from: bK */
    public static final C4526c<Boolean> f12395bK = new C4526c<>("douyin_game_tips_show", Boolean.valueOf(true));

    /* renamed from: bL */
    public static final C4526c<Boolean> f12396bL = new C4526c<>("vote_tips_show", Boolean.valueOf(true));

    /* renamed from: bM */
    public static final C4526c<Boolean> f12397bM = new C4526c<>("manage_button_tips_show", Boolean.valueOf(true));

    /* renamed from: bN */
    public static final C4526c<Boolean> f12398bN = new C4526c<>("block_word_pannel_tips_show", Boolean.valueOf(true));

    /* renamed from: bO */
    public static final C4526c<LongSparseArray<String>> f12399bO = new C4526c<>("send_gift_group_count", new LongSparseArray());

    /* renamed from: bP */
    public static final C4526c<LongSparseArray<String>> f12400bP = new C4526c<>("send_prop_group_count", new LongSparseArray());

    /* renamed from: bQ */
    public static final C4526c<Boolean> f12401bQ = new C4526c<>("official_danmu_enable", Boolean.valueOf(true));

    /* renamed from: bR */
    public static final C4526c<Boolean> f12402bR = new C4526c<>("official_gift_enable", Boolean.valueOf(true));

    /* renamed from: ba */
    public static final C4526c<String> f12403ba = new C4526c<>("last_first_charge_bubble_text", "");

    /* renamed from: bb */
    public static final C4526c<List<String>> f12404bb = new C4526c<>("last_first_charge_bubble_show_info", new ArrayList());

    /* renamed from: bc */
    public static final C4526c<Integer> f12405bc = new C4526c<>("recharge_dialog_content_height", Integer.valueOf(0));

    /* renamed from: bd */
    public static final C4526c<String> f12406bd = new C4526c<>("tool_bar_first_charge_shake_times", "");

    /* renamed from: be */
    public static final C4526c<Long> f12407be = new C4526c<>("recharge_reward_popup_in_gift_dialog_timestamp", Long.valueOf(0));

    /* renamed from: bf */
    public static final C4526c<String> f12408bf = new C4526c<>("live_last_turntable_bubble", "");

    /* renamed from: bg */
    public static final C4526c<Long> f12409bg = new C4526c<>("live_last_new_drive_count", Long.valueOf(0));

    /* renamed from: bh */
    public static final C4526c<Boolean> f12410bh = new C4526c<>("live_showd_drive_panel", Boolean.valueOf(false));

    /* renamed from: bi */
    public static final C4526c<Double> f12411bi = new C4526c<>("live_last_healthy_score", Double.valueOf(ProfileUiInitOptimizeEnterThreshold.DEFAULT));

    /* renamed from: bj */
    public static final C4526c<Long> f12412bj = new C4526c<>("live_last_punishment_time", Long.valueOf(0));

    /* renamed from: bk */
    public static final C4526c<Boolean> f12413bk = new C4526c<>("live_first_show_health_score", Boolean.valueOf(true));

    /* renamed from: bl */
    public static final C4526c<Integer> f12414bl = new C4526c<>("duty_gift_last_rules", Integer.valueOf(0));

    /* renamed from: bm */
    public static final C4526c<String> f12415bm = new C4526c<>("last_first_quit_anchor_dialog", "");

    /* renamed from: bn */
    public static final C4526c<String> f12416bn = new C4526c<>("last_first_more_anchor_guide", "");

    /* renamed from: bo */
    public static final C4526c<Integer> f12417bo = new C4526c<>("join_fans_comment_guide_times", Integer.valueOf(0));

    /* renamed from: bp */
    public static final C4526c<Long> f12418bp = new C4526c<>("latest_show_join_fans_comment_time", Long.valueOf(0));

    /* renamed from: bq */
    public static final C4526c<Boolean> f12419bq = new C4526c<>("has_show_live_long_press_clear_screen_tips", Boolean.valueOf(false));

    /* renamed from: br */
    public static final C4526c<Boolean> f12420br = new C4526c<>("has_slide_to_exit_room", Boolean.valueOf(false));

    /* renamed from: bs */
    public static final C4526c<Integer> f12421bs = new C4526c<>("starlight_anim_guide_count", Integer.valueOf(0));

    /* renamed from: bt */
    public static final C4526c<Integer> f12422bt = new C4526c<>("starlight_text_guide_count", Integer.valueOf(0));

    /* renamed from: bu */
    public static final C4526c<Integer> f12423bu = new C4526c<>("hotsoon_wallet_page_guide_shown", Integer.valueOf(0));

    /* renamed from: bv */
    public static final C4526c<String> f12424bv = new C4526c<>("live_group_toolbar_red_dot_local", "");

    /* renamed from: bw */
    public static final C4526c<Boolean> f12425bw = new C4526c<>("show_gift_toolbar_red_dot", Boolean.valueOf(false));

    /* renamed from: bx */
    public static final C4526c<Boolean> f12426bx = new C4526c<>("click_gift_toolbar_red_dot", Boolean.valueOf(false));

    /* renamed from: by */
    public static final C4526c<Boolean> f12427by = new C4526c<>("show_gift_dialog_prop_red_dot", Boolean.valueOf(false));

    /* renamed from: bz */
    public static final C4526c<Boolean> f12428bz = new C4526c<>("has_shown_send_red_packet", Boolean.valueOf(false));

    /* renamed from: c */
    public static final C4526c<Set<String>> f12429c = new C4526c<>("gift_urls", new HashSet());

    /* renamed from: d */
    public static final C4526c<String> f12430d = new C4526c<>("assets_cache_data", "");

    /* renamed from: e */
    public static final C4526c<Long> f12431e = new C4526c<>("assets_cache_last_check_time", Long.valueOf(0));

    /* renamed from: f */
    public static final C4526c<Integer> f12432f = new C4526c<>("live_broadcast_room_type", Integer.valueOf(0));

    /* renamed from: g */
    public static final C4526c<Integer> f12433g = new C4526c<>("live_camera_type", Integer.valueOf(1));

    /* renamed from: h */
    public static final C4526c<Boolean> f12434h = new C4526c<>("live_media_camera_mirror", Boolean.valueOf(false));

    /* renamed from: i */
    public static final C4526c<String> f12435i = new C4526c<>("live_resource_current_version", "");

    /* renamed from: j */
    public static final C4526c<Integer> f12436j = new C4526c<>("live_interact_pk_clean_total_count", Integer.valueOf(5));

    /* renamed from: k */
    public static final C4526c<Integer> f12437k = new C4526c<>("live_interact_pk_total_num", Integer.valueOf(5));

    /* renamed from: l */
    public static final C4526c<String> f12438l = new C4526c<>("live_interact_pk_clean_date", "");

    /* renamed from: m */
    public static final C4526c<Boolean> f12439m = new C4526c<>("live_interact_pk_clean_tip", Boolean.valueOf(true));

    /* renamed from: n */
    public static final C4526c<Boolean> f12440n = new C4526c<>("live_interact_pk_steal_tower_tip", Boolean.valueOf(true));

    /* renamed from: o */
    public static final C4526c<Integer> f12441o = new C4526c<>("live_interact_pk_tip_show_num", Integer.valueOf(0));

    /* renamed from: p */
    public static final C4526c<String> f12442p = new C4526c<>("live_interact_pk_tip_show_date", "");

    /* renamed from: q */
    public static final C4526c<Long> f12443q = new C4526c<>("live_prop_expire_tip_time", Long.valueOf(0));

    /* renamed from: r */
    public static final C4526c<Integer> f12444r = new C4526c<>("live_link_mic_stats", Integer.valueOf(1));

    /* renamed from: s */
    public static final C4526c<String> f12445s = new C4526c<>("last_share_channel", "");

    /* renamed from: t */
    public static final C4526c<Boolean> f12446t = new C4526c<>("first_enter_live_start", Boolean.valueOf(true));

    /* renamed from: u */
    public static final C4526c<Integer> f12447u = new C4526c<>("location_hint_shown_count", Integer.valueOf(0));

    /* renamed from: v */
    public static final C4526c<Long> f12448v = new C4526c<>("current_room_id", Long.valueOf(0));

    /* renamed from: w */
    public static final C4526c<Long> f12449w = new C4526c<>("current_room_start_time", Long.valueOf(0));

    /* renamed from: x */
    public static final C4526c<Long> f12450x = new C4526c<>("current_preview_start_time", Long.valueOf(0));

    /* renamed from: y */
    public static final C4526c<Long> f12451y = new C4526c<>("live_last_active_time", Long.valueOf(0));

    /* renamed from: z */
    public static final C4526c<Long> f12452z = new C4526c<>("live_stream_video_capture_last_time", Long.valueOf(0));
}
