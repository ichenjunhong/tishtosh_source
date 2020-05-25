package com.bytedance.android.livesdk.chatroom.viewmodule.toolbar;

import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.h */
public enum C6605h {
    STICKER_DONATION(R.layout.by0),
    INTERACTION(R.drawable.c4m, R.drawable.c4m),
    RED_ENVELOPE(R.drawable.c4t, R.drawable.c4t),
    PROMOTION_CARD(R.drawable.c4q, R.drawable.c4q),
    MORE(R.layout.arm),
    SHARE(R.drawable.c4y, R.drawable.c4x, R.string.f1a),
    BROADCAST_SHARE(R.drawable.c4f, R.drawable.c4x, R.string.f1a),
    MANAGE(R.drawable.c4d, R.drawable.c4c, R.string.ep9),
    MANAGE_UNFOLD(R.layout.bxz),
    SWITCH_SCREEN_ORIENTATION(R.drawable.c51, R.drawable.c50, R.string.etn),
    GIFT_ANIMATION(R.drawable.c4l, R.drawable.c4l),
    RECORD(R.drawable.c4s, R.drawable.c4s),
    DECORATION(R.drawable.c4h, R.drawable.c4h, R.string.efj),
    REVERSE_CAMERA(0, R.drawable.c4u, R.string.f0h),
    STICKER(0, R.drawable.c4z, R.string.gzr),
    BEAUTY(0, R.drawable.c52, R.string.et5),
    FILTER(0, R.drawable.c53, R.string.eb1),
    REVERSE_MIRROR(0, R.drawable.c4w, R.string.f0i),
    SWITCH_VIDEO_QUALITY(R.layout.arp),
    PUSH_URL(0, R.drawable.c4r, R.string.h10),
    FAST_GIFT(R.layout.arl),
    GIFT(R.layout.bx7),
    BROADCAST_BARRAGE(R.drawable.btt, R.drawable.btt),
    BARRAGE(R.drawable.bv8, R.drawable.bv8),
    TURNTABLE(R.layout.aro),
    AUDIO_TOGGLE(R.drawable.bv7, R.drawable.bv7, R.string.eyg),
    RADIO_COVER(R.drawable.bw0, R.drawable.bw0),
    MESSAGE_PUSH(R.drawable.bwm, R.drawable.bwm, R.string.ew0),
    GAME_QUIZ(R.drawable.c55, 0),
    AUTO_REPLY(R.drawable.c4e, R.drawable.c4e, R.string.e3b),
    PK(R.layout.arn),
    GESTURE_MAGIC(0, R.drawable.c54, R.string.ehl),
    GOODS(R.drawable.c1i, R.drawable.c1w, R.string.esl),
    RECHARGE_GUIDE(R.drawable.c0y, 0),
    CLOSE_ROOM(R.drawable.c0w, 0),
    PACKAGE_PURCHASE(R.layout.aqw),
    COMMERCE(R.layout.ari),
    XG_GOODS(R.layout.arq),
    LOTTERY(R.drawable.c0x, 0),
    EMOTION(R.drawable.c65, 0),
    DIVIDER(R.layout.aot),
    CHAT(R.drawable.c4g, 0),
    XT_LANDSCAPE_SHARE(R.drawable.c6k, R.drawable.c4x, R.string.f1a),
    SIGNAL(R.drawable.c2f, 0),
    PROMOTION_VIDEO(R.drawable.btd, R.drawable.btd, R.string.ein),
    HOUR_RANK(R.drawable.bul, 0),
    DUTY_GIFT(R.layout.ark),
    AUTO_CAR(R.layout.bvf),
    DOUYIN_CLOSE(R.layout.bxx),
    DOUYIN_GAME(R.drawable.e23, R.drawable.e2t, R.string.egy),
    VOTE(R.drawable.e2q, R.drawable.e2q, R.string.hqc),
    XIGUA_GAME_QUIZ(R.drawable.e2r, R.drawable.e2r, R.string.ht8),
    INCOME_MORE(R.layout.bxy),
    DOUYIN_OFFICIAL_IMMERSE(R.layout.aou),
    DOUYIN_OFFICIAL_QUALITY(R.layout.aov),
    DOUYIN_OFFICIAL_EFFECT(R.drawable.e1s, R.drawable.e1s),
    XT_GAMELIVE_INTERACTION(R.drawable.e2h, R.drawable.e2h, R.string.hq8),
    BROADCAST_TASK(R.drawable.dyv, R.drawable.dyv, R.string.hop);
    

    /* renamed from: a */
    private int f17956a;

    /* renamed from: b */
    private int f17957b;

    /* renamed from: c */
    private int f17958c;

    /* renamed from: d */
    private int f17959d;

    public final int getDrawableFolded() {
        return this.f17957b;
    }

    public final int getDrawableUnfolded() {
        return this.f17956a;
    }

    public final int getLayoutId() {
        return this.f17959d;
    }

    public final int getTitleId() {
        return this.f17958c;
    }

    public final String getTag() {
        return getClass().getName();
    }

    private C6605h(int i) {
        this.f17959d = R.layout.arj;
        this.f17959d = i;
    }

    private C6605h(int i, int i2) {
        this(r7, r8, i, i2, 0);
    }

    private C6605h(int i, int i2, int i3) {
        this.f17959d = R.layout.arj;
        this.f17956a = i;
        this.f17957b = i2;
        this.f17958c = i3;
    }
}
