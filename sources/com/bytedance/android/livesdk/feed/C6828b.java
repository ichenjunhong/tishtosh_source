package com.bytedance.android.livesdk.feed;

import android.text.TextUtils;

/* renamed from: com.bytedance.android.livesdk.feed.b */
public final class C6828b {

    /* renamed from: a */
    public static final boolean f18712a = C6854c.f18790a.booleanValue();

    /* renamed from: b */
    public static final boolean f18713b = "fg".equals("tiktok");

    /* renamed from: c */
    public static final boolean f18714c = "vigo".equals("tiktok");

    /* renamed from: d */
    public static final boolean f18715d = "douyin".equals("tiktok");

    /* renamed from: e */
    public static final boolean f18716e = "tiktok".equals("hotsoon");

    /* renamed from: f */
    public static final String f18717f;

    /* renamed from: g */
    public static final String f18718g;

    /* renamed from: h */
    public static final String[] f18719h = {"dm16.byteoversea.com", "dm.toutiao.com", "dm.bytedance.com", "dm.pstatp.com"};

    /* renamed from: i */
    public static final String[] f18720i = {"wo", "SAMSUNG", "google", "91dingzhi"};

    /* renamed from: j */
    public static final String f18721j;

    /* renamed from: k */
    public static final String f18722k;

    /* renamed from: l */
    public static final String f18723l;

    /* renamed from: m */
    public static final String f18724m;

    static {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (!f18712a) {
            str = "huoshan_android";
        } else if (TextUtils.equals("fg", "tiktok")) {
            str = "flipagram_android";
        } else if (TextUtils.equals("vigo", "tiktok")) {
            str = "hypstar_android";
        } else {
            str = "hypstar_android";
        }
        f18717f = str;
        if (!f18712a) {
            str2 = " live_stream_";
        } else if (TextUtils.equals("fg", "tiktok")) {
            str2 = " flipagram_i18n_";
        } else if (TextUtils.equals("vigo", "tiktok")) {
            str2 = " live_i18n_";
        } else {
            str2 = " ive_i18n_";
        }
        f18718g = str2;
        if (TextUtils.equals("fg", "tiktok")) {
            str3 = "1570022200";
        } else if (TextUtils.equals("vigo", "tiktok")) {
            str3 = "1541836912";
        } else {
            str3 = "";
        }
        f18721j = str3;
        if (TextUtils.equals("fg", "tiktok")) {
            str4 = "472064670264-p830d2k61ivgab1ihaq1oe5u50jf54q9.apps.googleusercontent.com";
        } else if (TextUtils.equals("vigo", "tiktok")) {
            str4 = "908812512490-tqgub82rl7tuj6g8n7qvac1e21nqsiop.apps.googleusercontent.com";
        } else {
            str4 = "";
        }
        f18722k = str4;
        if (TextUtils.equals("fg", "tiktok")) {
            str5 = "WfP3mPeebrOwgRseDaoA9A";
        } else if (TextUtils.equals("vigo", "tiktok")) {
            str5 = "ZhcvKT9ZDltWNGqO7s5weH0aY";
        } else {
            str5 = "";
        }
        f18723l = str5;
        if (TextUtils.equals("fg", "tiktok")) {
            str6 = "P0LoW03UNFPR8oHUBJJPYX7nws3LEba3MbGnzhVrVZ0";
        } else if (TextUtils.equals("vigo", "tiktok")) {
            str6 = "IfpxAJzlJ9sFeX5WNWLF1otayTvSFfXFO9JXNmkfCQ7Lh2Bmkt";
        } else {
            str6 = "";
        }
        f18724m = str6;
    }
}
