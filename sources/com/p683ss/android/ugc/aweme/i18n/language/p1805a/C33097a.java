package com.p683ss.android.ugc.aweme.i18n.language.p1805a;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.language.C35834e;
import com.p683ss.android.ugc.aweme.login.C27966g;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.i18n.language.a.a */
public final class C33097a implements C35834e {

    /* renamed from: a */
    public String f85914a;

    /* renamed from: b */
    private String f85915b;

    /* renamed from: c */
    private String f85916c;

    /* renamed from: d */
    private Locale f85917d;

    /* renamed from: e */
    private String[] f85918e;

    /* renamed from: f */
    private C27966g[] f85919f;

    /* renamed from: g */
    private String f85920g;

    /* renamed from: h */
    private String f85921h;

    /* renamed from: a */
    public final String mo70121a() {
        return this.f85916c;
    }

    /* renamed from: b */
    public final String mo70122b() {
        return this.f85915b;
    }

    /* renamed from: f */
    public final String mo70126f() {
        return this.f85920g;
    }

    /* renamed from: g */
    public final String mo70127g() {
        return this.f85921h;
    }

    /* renamed from: c */
    public final Locale mo70123c() {
        if (this.f85917d == null) {
            this.f85917d = new Locale(this.f85915b, this.f85914a);
        }
        return this.f85917d;
    }

    /* renamed from: e */
    public final C27966g[] mo70125e() {
        if (this.f85919f == null) {
            this.f85919f = new C27966g[]{C27966g.FACEBOOK, C27966g.GOOGLE, C27966g.TWITTER, C27966g.INSTAGRAM, C27966g.LINE, C27966g.KAKAOTALK};
            if (TextUtils.equals("ru", this.f85915b)) {
                this.f85919f = new C27966g[]{C27966g.VK, C27966g.FACEBOOK, C27966g.GOOGLE, C27966g.TWITTER, C27966g.INSTAGRAM, C27966g.LINE, C27966g.KAKAOTALK};
            }
        }
        return this.f85919f;
    }

    /* renamed from: d */
    public final String[] mo70124d() {
        if (this.f85918e == null) {
            this.f85918e = new String[]{"chat_merge", "instagram", "instagram_story", "facebook", "facebook_lite", "messenger", "messenger_lite", "whatsapp", "sms", "snapchat", "email", "twitter", "line", "kakaotalk", "bbm", "zalo", "band", "naver_blog", "naver_cafe", "kakao_story", "imo", "vk", "viber", "copy", "qr_code", "more"};
        }
        return this.f85918e;
    }

    public C33097a(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, str2);
    }

    public C33097a(String str, String str2, String str3, String str4, String str5) {
        this.f85916c = str;
        this.f85915b = str2;
        this.f85914a = str3;
        this.f85920g = str4;
        this.f85921h = str5;
    }
}
