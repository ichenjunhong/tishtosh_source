package com.bytedance.android.livesdk.config;

import com.bytedance.android.live.core.setting.C4097p;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.commerce.C6711d;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.android.livesdk.p272ad.C4524a;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.ss.android.ugc.trill.R;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.android.livesdk.config.b */
public interface C6718b {

    /* renamed from: A */
    public static final C4097p<Boolean> f18304A = new C4097p<>("max_encode_bitrate", Boolean.valueOf(false));

    /* renamed from: B */
    public static final C4097p<Integer> f18305B = new C4097p<>("luckymoney_disappear_duration", Integer.valueOf(5));

    /* renamed from: C */
    public static final C4097p<Integer> f18306C = new C4097p<>("room_follow_notice_duration", Integer.valueOf(NormalGiftView.ALPHA_180));

    /* renamed from: D */
    public static final C4097p<String> f18307D = new C4097p<>("pay_grade_url", "");

    /* renamed from: E */
    public static final C4097p<Integer> f18308E = new C4097p<>("doodle_min_count", Integer.valueOf(10));

    /* renamed from: F */
    public static final C4097p<Integer> f18309F = new C4097p<>("doodle_max_count", Integer.valueOf(100));

    /* renamed from: G */
    public static final C4097p<Integer> f18310G = new C4097p<>("gift_repeat_timeout", Integer.valueOf(3));

    /* renamed from: H */
    public static final C4097p<Integer> f18311H = new C4097p<>("special_gift_repeat_timeout", Integer.valueOf(10));

    /* renamed from: I */
    public static final C4097p<Integer> f18312I = new C4097p<>("rate_on_withdraw_success", Integer.valueOf(-1));

    /* renamed from: J */
    public static final C4097p<Integer> f18313J = new C4097p<>("live_mosaic_stay_time", Integer.valueOf(600));

    /* renamed from: K */
    public static final C4097p<Integer> f18314K = new C4097p<>("enable_profile_recommend_user", Integer.valueOf(1));

    /* renamed from: L */
    public static final C4097p<Boolean> f18315L = new C4097p<>("enable_live_interact", Boolean.valueOf(true));

    /* renamed from: M */
    public static final C4097p<Integer> f18316M = new C4097p<>("deco_text_modify_frequency", Integer.valueOf(1));

    /* renamed from: N */
    public static final C4097p<Integer> f18317N = new C4097p<>("enable_zhima_verify", Integer.valueOf(0));

    /* renamed from: O */
    public static final C4097p<String> f18318O = new C4097p<>("exchange_score_title", ((IHostContext) C4116c.m10249a(IHostContext.class)).context().getString(R.string.e_y));

    /* renamed from: P */
    public static final C4097p<String> f18319P = new C4097p<>("exchange_score_subtitle", ((IHostContext) C4116c.m10249a(IHostContext.class)).context().getString(R.string.f3l));

    /* renamed from: Q */
    public static final C4097p<Boolean> f18320Q = new C4097p<>("block_weibo", Boolean.valueOf(false));

    /* renamed from: R */
    public static final C4097p<Boolean> f18321R = new C4097p<>("block_qzone", Boolean.valueOf(false));

    /* renamed from: S */
    public static final C4097p<Boolean> f18322S = new C4097p<>("block_weixin", Boolean.valueOf(false));

    /* renamed from: T */
    public static final C4097p<Boolean> f18323T = new C4097p<>("block_circle", Boolean.valueOf(false));

    /* renamed from: U */
    public static final C4097p<Boolean> f18324U = new C4097p<>("block_qq", Boolean.valueOf(false));

    /* renamed from: V */
    public static final C4097p<Integer> f18325V = new C4097p<>("live_record_min_duration", Integer.valueOf(3));

    /* renamed from: W */
    public static final C4097p<Integer> f18326W = new C4097p<>("live_record_max_duration", Integer.valueOf(60));

    /* renamed from: X */
    public static final C4097p<String> f18327X = new C4097p<>("frontier_url", ((IHostContext) C4116c.m10249a(IHostContext.class)).context().getString(R.string.f3l));

    /* renamed from: Y */
    public static final C4097p<Boolean> f18328Y = new C4097p<>("promotion_card_disabled", Boolean.valueOf(false));

    /* renamed from: Z */
    public static final C4097p<Boolean> f18329Z = new C4097p<>("disable_delay_red_envelope", Boolean.valueOf(false));

    /* renamed from: a */
    public static final C4097p<C6711d> f18330a = new C4097p<>("live_commerce_banner", C6711d.class);

    /* renamed from: aa */
    public static final C4097p<Boolean> f18331aa = new C4097p<>("show_live_in_end_page", Boolean.valueOf(false));

    /* renamed from: ab */
    public static final C4097p<Boolean> f18332ab = new C4097p<>("disable_live_follow_guide", Boolean.valueOf(false));

    /* renamed from: ac */
    public static final C4097p<C4524a> f18333ac = new C4097p<>("live_dns_info", new C4524a());

    /* renamed from: ad */
    public static final C4097p<Integer> f18334ad = new C4097p<>("live_room_luckymoney_delay_seconds", Integer.valueOf(300));

    /* renamed from: ae */
    public static final C4097p<Integer> f18335ae = new C4097p<>("pay_methods_switch", Integer.valueOf(0));

    /* renamed from: af */
    public static final C4097p<String> f18336af = new C4097p<>("pay_methods_disabled_alert", "");

    /* renamed from: ag */
    public static final C4097p<Boolean> f18337ag = new C4097p<>("key_enable_intimacy_push", Boolean.valueOf(false));

    /* renamed from: ah */
    public static final C4097p<Set<String>> f18338ah = new C4097p<>("gift_urls", new HashSet());

    /* renamed from: ai */
    public static final C4097p<Integer> f18339ai = new C4097p<>("live_camera_type", Integer.valueOf(1));

    /* renamed from: b */
    public static final C4097p<Integer> f18340b = new C4097p<>("pay_methods_switch", Integer.valueOf(0));

    /* renamed from: c */
    public static final C4097p<String> f18341c = new C4097p<>("pay_methods_disabled_alert", "");

    /* renamed from: d */
    public static final C4097p<String> f18342d = new C4097p<>("gift_list", "");

    /* renamed from: e */
    public static final C4097p<Integer> f18343e = new C4097p<>("beauty_level", Integer.valueOf(3));

    /* renamed from: f */
    public static final C4097p<Boolean> f18344f = new C4097p<>("has_show_filter_guide.9.0", Boolean.valueOf(false));

    /* renamed from: g */
    public static final C4097p<Long> f18345g = new C4097p<>("fast_gift_hide_confirm_gift", Long.valueOf(0));

    /* renamed from: h */
    public static final C4097p<Long> f18346h = new C4097p<>("room_decoration_anchor_id", Long.valueOf(0));

    /* renamed from: i */
    public static final C4097p<Integer> f18347i = new C4097p<>("room_decoration_text_pass_level", Integer.valueOf(31));

    /* renamed from: j */
    public static final C4097p<String> f18348j = new C4097p<>("room_decoration_customize_text", "");

    /* renamed from: k */
    public static final C4097p<String> f18349k = new C4097p<>("room_decoration_list", "");

    /* renamed from: l */
    public static final C4097p<Long> f18350l = new C4097p<>("has_shown_interact_guide", Long.valueOf(0));

    /* renamed from: m */
    public static final C4097p<Boolean> f18351m = new C4097p<>("send_delay_red_envelope", Boolean.valueOf(true));

    /* renamed from: n */
    public static final C4097p<Boolean> f18352n = new C4097p<>("need_fast_gift_hint", Boolean.valueOf(true));

    /* renamed from: o */
    public static final C4097p<Boolean> f18353o = new C4097p<>("show_room_decoration_toast", Boolean.valueOf(true));

    /* renamed from: p */
    public static final C4097p<Integer> f18354p = new C4097p<>("location_hint_shown_count", Integer.valueOf(0));

    /* renamed from: q */
    public static final C4097p<Boolean> f18355q = new C4097p<>("live_interact_red_point", Boolean.valueOf(true));

    /* renamed from: r */
    public static final C4097p<Boolean> f18356r = new C4097p<>("live_interact_pk_red_point", Boolean.valueOf(true));

    /* renamed from: s */
    public static final C4097p<Boolean> f18357s = new C4097p<>("live_interact_pk_auto_match", Boolean.valueOf(false));

    /* renamed from: t */
    public static final C4097p<Boolean> f18358t = new C4097p<>("live_interact_pk_auto_start_match", Boolean.valueOf(false));

    /* renamed from: u */
    public static final C4097p<String> f18359u = new C4097p<>("live_interact_pk_theme", "");

    /* renamed from: v */
    public static final C4097p<Integer> f18360v = new C4097p<>("live_interact_pk_time", Integer.valueOf(120));

    /* renamed from: w */
    public static final C4097p<Integer> f18361w = new C4097p<>("live_interact_pk_time_index", Integer.valueOf(1));

    /* renamed from: x */
    public static final C4097p<Long> f18362x = new C4097p<>("live_last_show_red_point_time", Long.valueOf(0));

    /* renamed from: y */
    public static final C4097p<Integer> f18363y = new C4097p<>("live_interact_beauty_level", Integer.valueOf(2));

    /* renamed from: z */
    public static final C4097p<Integer> f18364z = new C4097p<>("max_encode_bitrate", Integer.valueOf(0));
}
