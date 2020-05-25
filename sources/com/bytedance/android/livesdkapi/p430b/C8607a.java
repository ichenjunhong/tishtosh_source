package com.bytedance.android.livesdkapi.p430b;

import android.text.TextUtils;
import com.bytedance.android.live.p245d.C4113a;

/* renamed from: com.bytedance.android.livesdkapi.b.a */
public final class C8607a {

    /* renamed from: a */
    public static final boolean f23572a = C4113a.f11309a.booleanValue();

    /* renamed from: b */
    public static final boolean f23573b = "tiktok".equals("hotsoon");

    /* renamed from: c */
    public static final String f23574c;

    /* renamed from: d */
    public static final String f23575d;

    /* renamed from: e */
    public static final String[] f23576e = {"dm16.byteoversea.com", "dm.toutiao.com", "dm.bytedance.com", "dm.pstatp.com"};

    /* renamed from: f */
    public static final String[] f23577f = {"wo", "SAMSUNG", "google", "91dingzhi"};

    /* renamed from: g */
    public static final String f23578g;

    /* renamed from: h */
    public static final String f23579h;

    /* renamed from: i */
    public static final String f23580i;

    /* renamed from: j */
    public static final String f23581j;

    /* renamed from: k */
    public static final String f23582k;

    /* renamed from: l */
    public static final String f23583l;

    static {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        if (!f23572a) {
            str = "huoshan_android";
        } else if (TextUtils.equals("fg", "tiktok")) {
            str = "flipagram_android";
        } else if (TextUtils.equals("vigo", "tiktok")) {
            str = "hypstar_android";
        } else {
            str = "hypstar_android";
        }
        f23574c = str;
        if (!f23572a) {
            str2 = " live_stream_";
        } else if (TextUtils.equals("fg", "tiktok")) {
            str2 = " flipagram_i18n_";
        } else if (TextUtils.equals("vigo", "tiktok")) {
            str2 = " live_i18n_";
        } else {
            str2 = " ive_i18n_";
        }
        f23575d = str2;
        if (f23572a) {
            str3 = "https://www.hypstar.com/hotsoon/in_app/faq_delete/";
        } else {
            str3 = "https://www.huoshan.com/inapp/faq/";
        }
        f23578g = str3;
        if (f23572a) {
            str4 = "https://www.hypstar.com/hotsoon/in_app/faq/";
        } else {
            str4 = "https://www.huoshan.com/inapp/faq/";
        }
        f23579h = str4;
        if (TextUtils.equals("fg", "tiktok")) {
            str5 = "1570022200";
        } else if (TextUtils.equals("vigo", "tiktok")) {
            str5 = "1541836912";
        } else {
            str5 = "";
        }
        f23580i = str5;
        if (TextUtils.equals("fg", "tiktok")) {
            str6 = "472064670264-p830d2k61ivgab1ihaq1oe5u50jf54q9.apps.googleusercontent.com";
        } else if (TextUtils.equals("vigo", "tiktok")) {
            str6 = "908812512490-tqgub82rl7tuj6g8n7qvac1e21nqsiop.apps.googleusercontent.com";
        } else {
            str6 = "";
        }
        f23581j = str6;
        if (TextUtils.equals("fg", "tiktok")) {
            str7 = "WfP3mPeebrOwgRseDaoA9A";
        } else if (TextUtils.equals("vigo", "tiktok")) {
            str7 = "ZhcvKT9ZDltWNGqO7s5weH0aY";
        } else {
            str7 = "";
        }
        f23582k = str7;
        if (TextUtils.equals("fg", "tiktok")) {
            str8 = "P0LoW03UNFPR8oHUBJJPYX7nws3LEba3MbGnzhVrVZ0";
        } else if (TextUtils.equals("vigo", "tiktok")) {
            str8 = "IfpxAJzlJ9sFeX5WNWLF1otayTvSFfXFO9JXNmkfCQ7Lh2Bmkt";
        } else {
            str8 = "";
        }
        f23583l = str8;
    }
}
