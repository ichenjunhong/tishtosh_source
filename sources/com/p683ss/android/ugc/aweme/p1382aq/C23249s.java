package com.p683ss.android.ugc.aweme.p1382aq;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.detail.C27338h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1382aq.C23231d.C23232a;
import com.p683ss.android.ugc.aweme.p1912k.C35802a;
import com.p683ss.android.ugc.aweme.push.C40906h;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.aq.s */
public final class C23249s extends C23191a<C23249s> {

    /* renamed from: O */
    public String f62087O;

    /* renamed from: P */
    public String f62088P;

    /* renamed from: Q */
    private Aweme f62089Q;

    /* renamed from: R */
    private String f62090R;

    /* renamed from: S */
    private String f62091S;

    /* renamed from: T */
    private String f62092T;

    /* renamed from: U */
    private String f62093U;

    /* renamed from: V */
    private String f62094V;

    /* renamed from: W */
    private String f62095W;

    /* renamed from: X */
    private String f62096X;

    /* renamed from: Y */
    private String f62097Y;

    /* renamed from: Z */
    private String f62098Z;

    /* renamed from: aa */
    private String f62099aa;

    /* renamed from: ab */
    private String f62100ab;

    /* renamed from: ac */
    private boolean f62101ac;

    /* renamed from: ad */
    private String f62102ad;

    /* renamed from: ae */
    private String f62103ae;

    /* renamed from: af */
    private String f62104af;

    /* renamed from: e */
    public String f62105e;

    public C23249s() {
        super("enter_personal_detail");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo47948a() {
        String str;
        mo48074c();
        mo48072a("group_id", this.f62105e, C23232a.f62006b);
        mo48072a("author_id", this.f62090R, C23232a.f62006b);
        mo48072a("to_user_id", this.f62091S, C23232a.f62006b);
        mo48072a("request_id", this.f62092T, C23232a.f62006b);
        mo48070a((Map<String, String>) C23794bh.m58391e().mo65590a(this.f62089Q, this.f62093U));
        if (C40906h.m90485a().mo83391b(this.f62105e)) {
            mo48072a("previous_page", "push", C23232a.f62005a);
        } else if (!TextUtils.isEmpty(this.f62098Z)) {
            mo48072a("previous_page", this.f62098Z, C23232a.f62005a);
        }
        "poi_page".equalsIgnoreCase(this.f61985g);
        if ((TextUtils.equals(this.f61985g, "homepage_fresh") || TextUtils.equals(this.f61985g, "homepage_channel")) && C35802a.m80931b()) {
            mo48069a("tab_name", C35802a.m80930a());
        }
        if (C23198ae.m56860d(this.f61985g)) {
            mo48078i(this.f62092T);
        }
        if (!TextUtils.isEmpty(this.f62095W)) {
            mo48072a(this.f62095W, this.f62096X, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f62094V)) {
            mo48072a("playlist_type", this.f62094V, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f62097Y)) {
            mo48072a("scene_id", this.f62097Y, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f62099aa)) {
            mo48072a("impr_type", this.f62099aa, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f62100ab)) {
            mo48072a("compilation_id", this.f62100ab, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f62087O)) {
            mo48072a("card_type", this.f62087O, C23232a.f62005a);
        }
        if (C27338h.m65876a()) {
            mo48069a("is_fullscreen", "1");
        }
        if (C23198ae.m56864f(this.f61985g)) {
            String str2 = "relation_type";
            if (this.f62101ac) {
                str = "follow";
            } else {
                str = "unfollow";
            }
            mo48069a(str2, str);
            mo48069a("video_type", this.f62102ad);
            mo48069a("rec_uid", this.f62103ae);
        }
        if (!TextUtils.isEmpty(this.f62088P)) {
            mo48072a("rec_user_type", this.f62088P, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f62104af)) {
            mo48069a("follow_status", this.f62104af);
        }
        if (!TextUtils.isEmpty(this.f62036B)) {
            mo48069a("tab_name", this.f62036B);
        }
    }

    /* renamed from: c */
    public final C23249s mo48137c(String str) {
        this.f61985g = str;
        return this;
    }

    /* renamed from: d */
    public final C23249s mo48138d(String str) {
        this.f62094V = str;
        return this;
    }

    /* renamed from: e */
    public final C23249s mo48140e(String str) {
        this.f62095W = str;
        return this;
    }

    /* renamed from: f */
    public final C23249s mo48141f(String str) {
        this.f62096X = str;
        return this;
    }

    /* renamed from: g */
    public final C23249s mo48142g(String str) {
        this.f62097Y = str;
        return this;
    }

    /* renamed from: h */
    public final C23249s mo48143h(String str) {
        this.f62098Z = str;
        return this;
    }

    /* renamed from: s */
    public final C23249s mo48144s(String str) {
        this.f62091S = str;
        return this;
    }

    /* renamed from: t */
    public final C23249s mo48145t(String str) {
        this.f62092T = str;
        return this;
    }

    /* renamed from: e */
    public final C23249s mo47954f(Aweme aweme) {
        super.mo47954f(aweme);
        if (aweme != null) {
            this.f62089Q = aweme;
            this.f62105e = aweme.getAid();
            this.f62090R = m57044d(aweme);
            this.f62092T = C23198ae.m56857c(aweme);
            this.f62091S = aweme.getAuthorUid();
            this.f62099aa = C23198ae.m56883s(aweme);
            if (aweme.getMixInfo() != null) {
                this.f62100ab = aweme.getMixInfo().mixId;
            }
            this.f62101ac = C47915gg.m103646a(aweme);
            this.f62102ad = C23198ae.m56886v(aweme);
            this.f62103ae = C23198ae.m56887w(aweme);
            this.f62104af = C23198ae.m56885u(aweme);
            this.f62040F = C23198ae.m56889y(aweme);
        }
        return this;
    }

    /* renamed from: b */
    public final C23249s mo48135b(String str, String str2) {
        this.f61987i = str;
        this.f61988j = str2;
        return this;
    }

    /* renamed from: c */
    public final C23249s mo48136c(Aweme aweme, int i) {
        super.mo47954f(aweme);
        if (aweme != null) {
            this.f62105e = aweme.getAid();
            this.f62090R = m57044d(aweme);
            this.f62092T = m57042a(aweme, i);
            this.f62091S = aweme.getAuthorUid();
            this.f62099aa = C23198ae.m56883s(aweme);
            if (aweme.getMixInfo() != null) {
                this.f62100ab = aweme.getMixInfo().mixId;
            }
            this.f62101ac = C47915gg.m103646a(aweme);
            this.f62102ad = C23198ae.m56886v(aweme);
            this.f62103ae = C23198ae.m56887w(aweme);
            this.f62104af = C23198ae.m56885u(aweme);
            this.f62040F = C23198ae.m56889y(aweme);
        }
        return this;
    }
}
