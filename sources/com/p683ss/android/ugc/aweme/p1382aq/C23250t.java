package com.p683ss.android.ugc.aweme.p1382aq;

import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.detail.C27338h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1382aq.C23231d.C23232a;
import com.p683ss.android.ugc.aweme.p1912k.C35802a;
import com.p683ss.android.ugc.aweme.push.C40906h;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.aq.t */
public final class C23250t extends C23191a<C23250t> {

    /* renamed from: O */
    private String f62106O;

    /* renamed from: P */
    private String f62107P;

    /* renamed from: Q */
    private String f62108Q;

    /* renamed from: R */
    private String f62109R;

    /* renamed from: S */
    private String f62110S;

    /* renamed from: T */
    private String f62111T;

    /* renamed from: U */
    private Aweme f62112U;

    /* renamed from: V */
    private String f62113V;

    /* renamed from: W */
    private String f62114W;

    /* renamed from: X */
    private String f62115X;

    /* renamed from: Y */
    private String f62116Y;

    /* renamed from: Z */
    private String f62117Z;

    /* renamed from: aa */
    private String f62118aa;

    /* renamed from: ab */
    private boolean f62119ab;

    /* renamed from: ac */
    private String f62120ac;

    /* renamed from: ad */
    private String f62121ad;

    /* renamed from: ae */
    private String f62122ae;

    /* renamed from: e */
    private String f62123e;

    public C23250t() {
        super("enter_tag_detail");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo47948a() {
        String str;
        mo48074c();
        mo48072a("group_id", this.f62123e, C23232a.f62006b);
        mo48072a("author_id", this.f62106O, C23232a.f62006b);
        mo48072a("tag_id", this.f62107P, C23232a.f62006b);
        mo48072a("request_id", this.f62108Q, C23232a.f62005a);
        if (!C9431p.m18664a(this.f62109R)) {
            mo48072a("content_type", this.f62109R, C23232a.f62005a);
        }
        mo48070a((Map<String, String>) C23794bh.m58391e().mo65590a(this.f62112U, this.f62111T));
        if (C40906h.m90485a().mo83391b(this.f62123e)) {
            mo48072a("previous_page", "push", C23232a.f62005a);
        } else if (!TextUtils.isEmpty(this.f62122ae)) {
            mo48072a("previous_page", this.f62122ae, C23232a.f62005a);
        }
        if (C23198ae.m56860d(this.f61985g)) {
            mo48078i(this.f62108Q);
        }
        if (!TextUtils.isEmpty(this.f62114W)) {
            mo48072a(this.f62114W, this.f62115X, C23232a.f62005a);
        }
        if ((TextUtils.equals(this.f61985g, "homepage_fresh") || TextUtils.equals(this.f61985g, "homepage_channel")) && C35802a.m80931b()) {
            mo48069a("tab_name", C35802a.m80930a());
        }
        if (!TextUtils.isEmpty(this.f62113V)) {
            mo48072a("playlist_type", this.f62113V, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f62116Y)) {
            mo48072a("impr_type", this.f62116Y, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f62117Z)) {
            mo48072a("compilation_id", this.f62117Z, C23232a.f62005a);
        }
        mo48069a("impr_id", this.f62108Q);
        if (C27338h.m65876a()) {
            mo48069a("is_fullscreen", "1");
        }
        if (!TextUtils.isEmpty(this.f62118aa)) {
            mo48072a("search_keyword", this.f62118aa, C23232a.f62005a);
        }
        if (C23198ae.m56864f(this.f61985g)) {
            String str2 = "relation_type";
            if (this.f62119ab) {
                str = "follow";
            } else {
                str = "unfollow";
            }
            mo48069a(str2, str);
            mo48069a("video_type", this.f62120ac);
            mo48069a("rec_uid", this.f62121ad);
        }
        String str3 = this.f62110S;
        if (!TextUtils.isEmpty(str3)) {
            mo48069a("process_id", str3);
        }
        if (!TextUtils.isEmpty(this.f62036B)) {
            mo48069a("tab_name", this.f62036B);
        }
    }

    /* renamed from: c */
    public final C23250t mo48146c(String str) {
        this.f62113V = str;
        return this;
    }

    /* renamed from: d */
    public final C23250t mo48147d(String str) {
        this.f62114W = str;
        return this;
    }

    /* renamed from: e */
    public final C23250t mo48149e(String str) {
        this.f62115X = str;
        return this;
    }

    /* renamed from: f */
    public final C23250t mo48150f(String str) {
        this.f61985g = str;
        return this;
    }

    /* renamed from: g */
    public final C23250t mo48151g(String str) {
        this.f62123e = str;
        return this;
    }

    /* renamed from: h */
    public final C23250t mo48152h(String str) {
        this.f62111T = str;
        return this;
    }

    /* renamed from: s */
    public final C23250t mo48153s(String str) {
        this.f62106O = str;
        return this;
    }

    /* renamed from: t */
    public final C23250t mo48154t(String str) {
        this.f62107P = str;
        return this;
    }

    /* renamed from: u */
    public final C23250t mo48155u(String str) {
        this.f62110S = str;
        return this;
    }

    /* renamed from: v */
    public final C23250t mo48156v(String str) {
        if (!C9431p.m18664a(str)) {
            this.f62108Q = str;
        }
        return this;
    }

    /* renamed from: e */
    public final C23250t mo47954f(Aweme aweme) {
        String str;
        super.mo47954f(aweme);
        if (aweme != null) {
            this.f62112U = aweme;
            this.f62123e = aweme.getAid();
            if (TextUtils.isEmpty(this.f62108Q)) {
                this.f62108Q = aweme.getRequestId();
            }
            if (aweme.getAuthor() != null) {
                str = aweme.getAuthor().getUid();
            } else {
                str = "";
            }
            this.f62106O = str;
            this.f62109R = C23198ae.m56879o(aweme);
            this.f62116Y = C23198ae.m56883s(aweme);
            if (aweme.getMixInfo() != null) {
                this.f62117Z = aweme.getMixInfo().mixId;
            }
            this.f62119ab = C47915gg.m103646a(aweme);
            this.f62120ac = C23198ae.m56886v(aweme);
            this.f62121ad = C23198ae.m56887w(aweme);
        }
        return this;
    }
}
