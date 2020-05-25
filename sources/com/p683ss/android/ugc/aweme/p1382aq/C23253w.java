package com.p683ss.android.ugc.aweme.p1382aq;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.detail.C27338h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1382aq.C23231d.C23232a;
import com.p683ss.android.ugc.aweme.p1912k.C35802a;
import com.p683ss.android.ugc.aweme.push.C40906h;

/* renamed from: com.ss.android.ugc.aweme.aq.w */
public final class C23253w extends C23241k<C23253w> {

    /* renamed from: O */
    public String f62125O;

    /* renamed from: P */
    public String f62126P;

    /* renamed from: Q */
    public String f62127Q;

    /* renamed from: R */
    private String f62128R;

    /* renamed from: S */
    private String f62129S;

    /* renamed from: T */
    private String f62130T;

    /* renamed from: U */
    private String f62131U;

    /* renamed from: V */
    private String f62132V;

    /* renamed from: W */
    private String f62133W;

    /* renamed from: X */
    private String f62134X;

    /* renamed from: Y */
    private String f62135Y;

    /* renamed from: Z */
    private String f62136Z;

    /* renamed from: a */
    public String f62137a;

    /* renamed from: aa */
    private String f62138aa;

    /* renamed from: ab */
    private String f62139ab;

    /* renamed from: ac */
    private String f62140ac;

    /* renamed from: ad */
    private String f62141ad;

    /* renamed from: ae */
    private String f62142ae;

    /* renamed from: af */
    private String f62143af;

    /* renamed from: b */
    public String f62144b;

    /* renamed from: c */
    public String f62145c;

    /* renamed from: d */
    public String f62146d;

    /* renamed from: e */
    public String f62147e;

    public C23253w() {
        super("follow");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo47948a() {
        mo48074c();
        mo48072a("scene_id", this.f62128R, C23232a.f62005a);
        mo48072a("previous_page", this.f62129S, C23232a.f62005a);
        mo48072a("previous_page_position", this.f62130T, C23232a.f62005a);
        mo48072a("enter_method", this.f62136Z, C23232a.f62005a);
        mo48072a("to_user_id", this.f62131U, C23232a.f62006b);
        mo48072a("group_id", this.f62132V, C23232a.f62006b);
        mo48072a("author_id", this.f62131U, C23232a.f62006b);
        mo48072a("author_id", this.f62131U, C23232a.f62006b);
        mo48072a("follow_type", this.f62141ad, C23232a.f62005a);
        mo48072a("page_status", this.f62146d, C23232a.f62005a);
        mo48072a("request_id", this.f62133W, C23232a.f62006b);
        mo48072a("enter_type", this.f62135Y, C23232a.f62005a);
        if (!TextUtils.isEmpty(this.f62134X)) {
            mo48072a("enter_from_request", this.f62134X, C23232a.f62006b);
        }
        if (C23198ae.m56860d(this.f61985g) || "homepage_hot".equals(this.f62129S) || "potential_friends".equals(this.f62129S) || "homepage_familiar".equals(this.f62129S)) {
            mo48078i(this.f62133W);
        }
        TextUtils.equals(this.f61984f, "follow_cancel");
        if (C40906h.m90485a().mo83391b(this.f62132V)) {
            mo48072a("previous_page", "push", C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f62144b)) {
            mo48072a(this.f62144b, this.f62145c, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f62137a)) {
            mo48072a("playlist_type", this.f62137a, C23232a.f62005a);
        }
        if ((TextUtils.equals(this.f61985g, "homepage_fresh") || TextUtils.equals(this.f61985g, "homepage_channel")) && C35802a.m80931b()) {
            mo48069a("tab_name", C35802a.m80930a());
        }
        if (!TextUtils.isEmpty(this.f62147e)) {
            mo48072a("rule_id", this.f62147e, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f62138aa)) {
            mo48072a("impr_type", this.f62138aa, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f62139ab)) {
            mo48072a("compilation_id", this.f62139ab, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f62126P)) {
            mo48072a("card_type", this.f62126P, C23232a.f62005a);
        }
        if (C27338h.m65876a()) {
            mo48069a("is_fullscreen", "1");
        }
        if (C23198ae.m56864f(this.f61985g)) {
            mo48069a("video_type", this.f62140ac);
        }
        if (!TextUtils.isEmpty(this.f62127Q)) {
            mo48069a("rec_user_type", this.f62127Q);
        }
        if (!TextUtils.isEmpty(this.f62125O)) {
            mo48069a("search_keyword", this.f62125O);
        }
        if (TextUtils.equals(this.f61985g, "others_homepage") && !TextUtils.isEmpty(this.f62040F)) {
            mo48072a("rec_type", this.f62040F, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f62142ae)) {
            mo48069a("cid", this.f62142ae);
        }
        if (!TextUtils.isEmpty(this.f62143af)) {
            mo48069a("log_extra", this.f62143af);
        }
    }

    /* renamed from: a */
    public final C23253w mo48160a(String str) {
        this.f62128R = str;
        return this;
    }

    /* renamed from: b */
    public final C23253w mo48161b(String str) {
        this.f61985g = str;
        return this;
    }

    /* renamed from: c */
    public final C23253w mo48163c(String str) {
        this.f62136Z = str;
        return this;
    }

    /* renamed from: d */
    public final C23253w mo48164d(String str) {
        this.f62129S = str;
        return this;
    }

    /* renamed from: e */
    public final C23253w mo48165e(String str) {
        this.f62130T = str;
        return this;
    }

    /* renamed from: f */
    public final C23253w mo48166f(String str) {
        this.f62131U = str;
        return this;
    }

    /* renamed from: g */
    public final C23253w mo48167g(String str) {
        this.f62141ad = str;
        return this;
    }

    /* renamed from: h */
    public final C23253w mo48168h(String str) {
        this.f62132V = str;
        return this;
    }

    /* renamed from: s */
    public final C23253w mo48169s(String str) {
        this.f62133W = str;
        return this;
    }

    /* renamed from: t */
    public final C23253w mo48170t(String str) {
        this.f62004z = str;
        return this;
    }

    public C23253w(String str) {
        super(str);
    }

    /* renamed from: c */
    public final C23253w mo48162c(Aweme aweme, int i) {
        super.mo47954f(aweme);
        if (aweme != null) {
            this.f62132V = aweme.getAid();
            this.f62133W = m57042a(aweme, i);
            this.f62131U = aweme.getAuthorUid();
            this.f62138aa = C23198ae.m56883s(aweme);
            if (aweme.getMixInfo() != null) {
                this.f62139ab = aweme.getMixInfo().mixId;
            }
            this.f62140ac = C23198ae.m56886v(aweme);
            this.f62040F = C23198ae.m56889y(aweme);
        }
        return this;
    }
}
