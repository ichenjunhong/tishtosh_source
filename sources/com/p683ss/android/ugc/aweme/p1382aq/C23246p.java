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

/* renamed from: com.ss.android.ugc.aweme.aq.p */
public final class C23246p extends C23191a<C23246p> {

    /* renamed from: O */
    private String f62066O;

    /* renamed from: P */
    private String f62067P;

    /* renamed from: Q */
    private String f62068Q;

    /* renamed from: R */
    private String f62069R;

    /* renamed from: S */
    private String f62070S;

    /* renamed from: T */
    private Aweme f62071T;

    /* renamed from: U */
    private String f62072U;

    /* renamed from: V */
    private String f62073V;

    /* renamed from: W */
    private String f62074W;

    /* renamed from: X */
    private String f62075X;

    /* renamed from: Y */
    private String f62076Y;

    /* renamed from: Z */
    private String f62077Z;

    /* renamed from: aa */
    private boolean f62078aa;

    /* renamed from: ab */
    private String f62079ab;

    /* renamed from: ac */
    private String f62080ac;

    /* renamed from: e */
    private String f62081e;

    public C23246p() {
        super("enter_music_detail");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo47948a() {
        String str;
        mo48074c();
        mo48072a("group_id", this.f62081e, C23232a.f62006b);
        mo48072a("music_id", this.f62067P, C23232a.f62006b);
        mo48072a("author_id", this.f62066O, C23232a.f62006b);
        mo48072a("request_id", this.f62068Q, C23232a.f62006b);
        mo48070a((Map<String, String>) C23794bh.m58391e().mo65590a(this.f62071T, this.f62070S));
        if (C40906h.m90485a().mo83391b(this.f62081e)) {
            mo48072a("previous_page", "push", C23232a.f62005a);
        } else if (!TextUtils.isEmpty(this.f62072U)) {
            mo48072a("previous_page", this.f62072U, C23232a.f62005a);
        }
        if (C23198ae.m56860d(this.f61985g)) {
            mo48078i(this.f62068Q);
        }
        if ((TextUtils.equals(this.f61985g, "homepage_fresh") || TextUtils.equals(this.f61985g, "homepage_channel")) && C35802a.m80931b()) {
            mo48069a("tab_name", C35802a.m80930a());
        }
        if (!TextUtils.isEmpty(this.f62036B)) {
            mo48069a("tab_name", this.f62036B);
        }
        if (!TextUtils.isEmpty(this.f62074W)) {
            mo48072a(this.f62074W, this.f62075X, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f62073V)) {
            mo48072a("playlist_type", this.f62073V, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f62076Y)) {
            mo48072a("impr_type", this.f62076Y, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f62077Z)) {
            mo48072a("compilation_id", this.f62077Z, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f62069R)) {
            mo48072a("process_id", this.f62069R, C23232a.f62005a);
        }
        mo48069a("impr_id", this.f62068Q);
        if (C27338h.m65876a()) {
            mo48069a("is_fullscreen", "1");
        }
        if (C23198ae.m56864f(this.f61985g)) {
            String str2 = "relation_type";
            if (this.f62078aa) {
                str = "follow";
            } else {
                str = "unfollow";
            }
            mo48069a(str2, str);
            mo48069a("video_type", this.f62079ab);
            mo48069a("rec_uid", this.f62080ac);
        }
    }

    /* renamed from: c */
    public final C23246p mo48119c(String str) {
        this.f62072U = str;
        return this;
    }

    /* renamed from: d */
    public final C23246p mo48120d(String str) {
        this.f62073V = str;
        return this;
    }

    /* renamed from: e */
    public final C23246p mo48122e(String str) {
        this.f62074W = str;
        return this;
    }

    /* renamed from: f */
    public final C23246p mo48123f(String str) {
        this.f62075X = str;
        return this;
    }

    /* renamed from: g */
    public final C23246p mo48124g(String str) {
        this.f61985g = str;
        return this;
    }

    /* renamed from: h */
    public final C23246p mo48125h(String str) {
        this.f62081e = str;
        return this;
    }

    /* renamed from: s */
    public final C23246p mo48126s(String str) {
        this.f62066O = str;
        return this;
    }

    /* renamed from: t */
    public final C23246p mo48127t(String str) {
        this.f62067P = str;
        return this;
    }

    /* renamed from: u */
    public final C23246p mo48128u(String str) {
        this.f62069R = str;
        return this;
    }

    /* renamed from: v */
    public final C23246p mo48129v(String str) {
        this.f62068Q = str;
        return this;
    }

    /* renamed from: w */
    public final C23246p mo48130w(String str) {
        this.f62077Z = str;
        return this;
    }

    /* renamed from: e */
    public final C23246p mo47954f(Aweme aweme) {
        String str;
        super.mo47954f(aweme);
        if (aweme != null) {
            this.f62071T = aweme;
            this.f62068Q = C23198ae.m56857c(aweme);
            this.f62081e = aweme.getAid();
            this.f62066O = aweme.getAuthorUid();
            if (aweme.getMusic() == null) {
                str = "";
            } else {
                str = String.valueOf(aweme.getMusic().getId());
            }
            this.f62067P = str;
            this.f62076Y = C23198ae.m56883s(aweme);
            if (aweme.getMixInfo() != null) {
                this.f62077Z = aweme.getMixInfo().mixId;
            }
            this.f62078aa = C47915gg.m103646a(aweme);
            this.f62079ab = C23198ae.m56886v(aweme);
            this.f62080ac = C23198ae.m56887w(aweme);
        }
        return this;
    }
}
