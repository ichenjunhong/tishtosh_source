package com.bytedance.android.livesdk.p272ad;

import com.bytedance.android.livesdkapi.C8737f.C8738a;
import com.bytedance.android.livesdkapi.C8737f.C8739b;

/* renamed from: com.bytedance.android.livesdk.ad.e */
public enum C4528e implements C8738a {
    GIFT_LIST("gift_list", C8739b.String, "", true),
    LAST_SHARE_CHANNEL("last_share_channel", C8739b.String, "", true),
    SHOW_LIVE_PORTRAIT_GUIDE("show_live_portrait_guide", C8739b.Boolean, Boolean.valueOf(false), true),
    SHOW_LIVE_LANDSCAPE_GUIDE("show_live_landscape_guide", C8739b.Boolean, Boolean.valueOf(false), true),
    FIRST_ENTER_LIVE_START("first_enter_live_start", C8739b.Boolean, Boolean.valueOf(true), true),
    CLICK_RECORD_BUTTON_IN_END_LIVE("click_record_button_in_end_live", C8739b.Boolean, Boolean.valueOf(false), true),
    HAS_SHOW_FILTER_GUIDE("has_show_filter_guide", C8739b.Boolean, Boolean.valueOf(false), true),
    FAST_GIFT_HIDE_CONFIRM_GIFT("fast_gift_hide_confirm_gift", C8739b.Long, Long.valueOf(0), true),
    DECORATION_ANCHOR_ID("room_decoration_anchor_id", C8739b.Long, Long.valueOf(0), true),
    DECORATION_TEXT_PASS_LEVEL("room_decoration_text_pass_level", C8739b.Integer, Integer.valueOf(31), true),
    DECORATION_CUSTOMIZE_TEXT("room_decoration_customize_text", C8739b.String, "", true),
    DECORATION_LIST("room_decoration_list", C8739b.String, "", true),
    SHOW_INTERACT_GUIDE("has_shown_interact_guide", C8739b.Long, Long.valueOf(0), true),
    SEND_DELAY_RED_ENVELOPE("send_delay_red_envelope", C8739b.Boolean, Boolean.valueOf(true), true),
    NEED_FAST_GIFT_HINT("need_fast_gift_hint", C8739b.Boolean, Boolean.valueOf(true), true),
    SHOW_ROOM_DECORATION_TOAST("show_room_decoration_toast", C8739b.Boolean, Boolean.valueOf(true), true),
    LOCATION_HINT_SHOWN_COUNT("location_hint_shown_count", C8739b.Integer, Integer.valueOf(0), true),
    LIVE_INTERACT_SETTING_RED_POINT("live_interact_red_point", C8739b.Boolean, Boolean.valueOf(true), true),
    LIVE_INTERACT_PK_SETTING_RED_POINT("live_interact_pk_red_point", C8739b.Boolean, Boolean.valueOf(true), true),
    LIVE_INTERACT_PK_AUTO_MATCH("live_interact_pk_auto_match", C8739b.Boolean, Boolean.valueOf(true), true),
    LIVE_INTERACT_PK_AUTO_START_MATCH("live_interact_pk_auto_start_match", C8739b.Boolean, Boolean.valueOf(false), true),
    LIVE_INTERACT_PK_THEME("live_interact_pk_theme", C8739b.String, "", true),
    LIVE_INTERACT_PK_TIME_INDEX("live_interact_pk_time_index", C8739b.Integer, Integer.valueOf(1), true),
    LIVE_LAST_SHOW_RED_POINT_TIME("live_last_show_red_point_time", C8739b.Long, Integer.valueOf(0), true),
    LIVE_INTERACT_BEAUTY_LEVEL("live_interact_beauty_level", C8739b.Integer, Integer.valueOf(2), true);
    

    /* renamed from: a */
    private final String f12457a;

    /* renamed from: b */
    private final C8739b f12458b;

    /* renamed from: c */
    private final Object f12459c;

    /* renamed from: d */
    private final boolean f12460d;

    public final Object defValue() {
        return this.f12459c;
    }

    public final String key() {
        return this.f12457a;
    }

    public final boolean supportPersist() {
        return this.f12460d;
    }

    public final C8739b type() {
        return this.f12458b;
    }

    private C4528e(String str, C8739b bVar, Object obj, boolean z) {
        this.f12457a = str;
        this.f12458b = bVar;
        this.f12459c = obj;
        this.f12460d = true;
    }
}
