package com.p683ss.android.ugc.aweme.p1382aq;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.detail.C27338h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1382aq.C23231d.C23232a;
import com.p683ss.android.ugc.aweme.p1912k.C35802a;
import com.p683ss.android.ugc.aweme.push.C40906h;
import com.p683ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.aq.ag */
public final class C23200ag extends C23241k<C23200ag> {

    /* renamed from: O */
    public String f61673O;

    /* renamed from: P */
    private String f61674P;

    /* renamed from: Q */
    private String f61675Q;

    /* renamed from: R */
    private String f61676R;

    /* renamed from: S */
    private String f61677S;

    /* renamed from: T */
    private String f61678T;

    /* renamed from: U */
    private String f61679U;

    /* renamed from: V */
    private String f61680V;

    /* renamed from: W */
    private String f61681W;

    /* renamed from: X */
    private String f61682X;

    /* renamed from: Y */
    private int f61683Y;

    /* renamed from: Z */
    private boolean f61684Z;

    /* renamed from: a */
    public String f61685a;

    /* renamed from: aa */
    private Aweme f61686aa;

    /* renamed from: ab */
    private String f61687ab;

    /* renamed from: ac */
    private String f61688ac;

    /* renamed from: ad */
    private String f61689ad;

    /* renamed from: ae */
    private String f61690ae;

    /* renamed from: af */
    private String f61691af;

    /* renamed from: ag */
    private String f61692ag;

    /* renamed from: ah */
    private int f61693ah = 1;

    /* renamed from: ai */
    private String f61694ai;

    /* renamed from: aj */
    private String f61695aj;

    /* renamed from: ak */
    private String f61696ak;

    /* renamed from: al */
    private String f61697al;

    /* renamed from: am */
    private String f61698am;

    /* renamed from: b */
    public String f61699b;

    /* renamed from: c */
    public String f61700c;

    /* renamed from: d */
    public int f61701d;

    /* renamed from: e */
    public String f61702e;

    public C23200ag() {
        super("post_comment");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo47948a() {
        mo48074c();
        mo48072a("group_id", this.f61674P, C23232a.f62006b);
        mo48072a("author_id", this.f61675Q, C23232a.f62006b);
        if (!TextUtils.isEmpty(this.f61677S)) {
            mo48072a("comment_category", this.f61677S, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61676R)) {
            mo48072a("reply_to_comment_id", this.f61676R, C23232a.f62006b);
        }
        if (!TextUtils.isEmpty(this.f61679U)) {
            mo48072a(C42311c.f106865i, this.f61679U, C23232a.f62005a);
        }
        if (C23198ae.m56860d(this.f61985g)) {
            mo48078i(C23198ae.m56857c(this.f61686aa));
        }
        mo48070a((Map<String, String>) C23794bh.m58391e().mo65590a(this.f61686aa, this.f61682X));
        if (C40906h.m90485a().mo83391b(this.f61674P)) {
            mo48072a("previous_page", "push", C23232a.f62005a);
        } else {
            mo48072a("previous_page", this.f61690ae, C23232a.f62005a);
        }
        if (this.f61683Y == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f61683Y);
            mo48072a("is_long_item", sb.toString(), C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61678T)) {
            mo48072a("emoji_times", this.f61678T, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61688ac)) {
            mo48072a(this.f61688ac, this.f61689ad, C23232a.f62005a);
        }
        mo48072a("is_retry", String.valueOf(this.f61684Z ? 1 : 0), C23232a.f62005a);
        if (!TextUtils.isEmpty(this.f61687ab)) {
            mo48072a("playlist_type", this.f61687ab, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61680V)) {
            mo48072a("enter_method", this.f61680V, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61691af)) {
            mo48072a("impr_type", this.f61691af, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(BusinessComponentServiceUtils.getBusinessBridgeService().mo49723a()) && ((TextUtils.equals(this.f61985g, "homepage_fresh") || TextUtils.equals(this.f61985g, "homepage_channel")) && C35802a.m80931b())) {
            mo48069a("tab_name", BusinessComponentServiceUtils.getBusinessBridgeService().mo49723a());
        }
        if (C23198ae.m56862e(this.f61985g)) {
            if (!TextUtils.isEmpty(this.f61692ag)) {
                mo48072a("content_type", this.f61692ag, C23232a.f62005a);
            }
            mo48072a("enter_fullscreen", String.valueOf(this.f61693ah), C23232a.f62005a);
            if (!TextUtils.isEmpty(this.f61694ai)) {
                mo48072a("is_reposted", "1", C23232a.f62005a);
                mo48072a("repost_from_group_id", this.f61694ai, C23232a.f62005a);
                mo48072a("repost_from_user_id", this.f61695aj, C23232a.f62005a);
            }
        }
        if (!TextUtils.isEmpty(this.f61696ak)) {
            mo48072a("compilation_id", this.f61696ak, C23232a.f62005a);
        }
        mo48069a("request_id", C23198ae.m56857c(this.f61686aa));
        if (C27338h.m65876a()) {
            mo48069a("is_fullscreen", "1");
        }
        if (this.f62039E.booleanValue()) {
            mo48069a("is_fullscreen", "0");
        }
        if (C23198ae.m56864f(this.f61985g) || (this.f61686aa != null && this.f61686aa.isFamiliar())) {
            mo48072a("relation_type", this.f61697al, C23232a.f62005a);
            mo48072a("rec_uid", C23198ae.m56887w(this.f61686aa), C23232a.f62005a);
            mo48072a("video_type", C23198ae.m56886v(this.f61686aa), C23232a.f62005a);
        }
        mo48069a("label_type", this.f61685a);
        mo48069a("relation_label_type", this.f61699b);
        if (!TextUtils.isEmpty(this.f62002x)) {
            mo48069a("creation_id", this.f62002x);
        }
        if (!TextUtils.isEmpty(this.f61698am)) {
            mo48069a("follow_status", this.f61698am);
        }
        mo48069a("send_method", this.f61700c);
        mo48069a("is_pure_emoji", String.valueOf(this.f61701d));
        mo48069a("emoji_order", this.f61702e);
        mo48069a("reply_comment_type", this.f61673O);
    }

    /* renamed from: a */
    public final C23200ag mo47959a(int i) {
        this.f61683Y = i;
        return this;
    }

    /* renamed from: b */
    public final C23200ag mo47962b(String str) {
        this.f61690ae = str;
        return this;
    }

    /* renamed from: c */
    public final C23200ag mo47964c(String str) {
        this.f61679U = str;
        return this;
    }

    /* renamed from: d */
    public final C23200ag mo47965d(String str) {
        this.f61677S = str;
        return this;
    }

    /* renamed from: e */
    public final C23200ag mo47967e(String str) {
        this.f61678T = str;
        return this;
    }

    /* renamed from: f */
    public final C23200ag mo47968f(String str) {
        this.f61676R = str;
        return this;
    }

    /* renamed from: g */
    public final C23200ag mo47969g(String str) {
        this.f61682X = str;
        return this;
    }

    /* renamed from: h */
    public final C23200ag mo47970h(String str) {
        this.f61687ab = str;
        return this;
    }

    /* renamed from: s */
    public final C23200ag mo47971s(String str) {
        this.f61688ac = str;
        return this;
    }

    /* renamed from: t */
    public final C23200ag mo47972t(String str) {
        this.f61689ad = str;
        return this;
    }

    /* renamed from: u */
    public final C23200ag mo47973u(String str) {
        this.f61998t = str;
        return this;
    }

    /* renamed from: v */
    public final C23200ag mo47974v(String str) {
        this.f61997s = str;
        return this;
    }

    /* renamed from: w */
    public final C23200ag mo47975w(String str) {
        this.f61680V = str;
        return this;
    }

    /* renamed from: x */
    public final C23200ag mo47976x(String str) {
        this.f62002x = str;
        return this;
    }

    /* renamed from: a */
    public final C23200ag mo47960a(String str) {
        this.f61985g = str;
        return this;
    }

    /* renamed from: b */
    public final C23200ag mo47963b(boolean z) {
        this.f61693ah = z ? 1 : 0;
        return this;
    }

    /* renamed from: a */
    public final C23200ag mo47961a(boolean z) {
        this.f61684Z = z;
        return this;
    }

    /* renamed from: e */
    public final C23200ag mo47954f(Aweme aweme) {
        String str;
        super.mo47954f(aweme);
        if (aweme != null) {
            this.f61686aa = aweme;
            this.f61681W = aweme.getAid();
            this.f61674P = aweme.getAid();
            this.f61675Q = aweme.getAuthorUid();
            this.f61691af = C23198ae.m56883s(aweme);
            this.f61692ag = C23198ae.m56879o(aweme);
            this.f61694ai = aweme.getRepostFromGroupId();
            this.f61695aj = aweme.getRepostFromUserId();
            if (C47915gg.m103646a(aweme)) {
                str = "follow";
            } else {
                str = "unfollow";
            }
            this.f61697al = str;
            if (aweme.getMixInfo() != null) {
                this.f61696ak = aweme.getMixInfo().mixId;
            }
            this.f61698am = C23198ae.m56885u(aweme);
            this.f62040F = C23198ae.m56889y(aweme);
        }
        return this;
    }
}
