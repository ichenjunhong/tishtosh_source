package com.p683ss.android.ugc.aweme.p1382aq;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.detail.C27338h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.follow.p1766e.C31874a;
import com.p683ss.android.ugc.aweme.p1382aq.C23231d.C23232a;
import com.p683ss.android.ugc.aweme.p1912k.C35802a;
import com.p683ss.android.ugc.aweme.push.C40906h;
import com.p683ss.android.ugc.aweme.utils.C47915gg;

/* renamed from: com.ss.android.ugc.aweme.aq.z */
public final class C23256z extends C23241k<C23256z> {

    /* renamed from: O */
    private int f62163O;

    /* renamed from: P */
    private String f62164P;

    /* renamed from: Q */
    private String f62165Q;

    /* renamed from: R */
    private String f62166R;

    /* renamed from: S */
    private String f62167S;

    /* renamed from: T */
    private String f62168T;

    /* renamed from: U */
    private String f62169U;

    /* renamed from: V */
    private String f62170V;

    /* renamed from: W */
    private String f62171W;

    /* renamed from: X */
    private String f62172X;

    /* renamed from: Y */
    private String f62173Y;

    /* renamed from: Z */
    private int f62174Z = -1;

    /* renamed from: a */
    public int f62175a = 1;

    /* renamed from: aa */
    private boolean f62176aa;

    /* renamed from: ab */
    private String f62177ab;

    /* renamed from: ac */
    private String f62178ac;

    /* renamed from: ad */
    private String f62179ad;

    /* renamed from: ae */
    private long f62180ae;

    /* renamed from: b */
    private String f62181b;

    /* renamed from: c */
    private String f62182c;

    /* renamed from: d */
    private String f62183d;

    /* renamed from: e */
    private int f62184e;

    public C23256z() {
        super("like");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo47948a() {
        String str;
        mo48074c();
        mo48072a("group_id", this.f62181b, C23232a.f62006b);
        mo48072a("author_id", this.f62182c, C23232a.f62006b);
        mo48072a("request_id", this.f62183d, C23232a.f62006b);
        mo48072a("previous_page", this.f62167S, C23232a.f62005a);
        mo48072a("duration", String.valueOf(this.f62180ae), C23232a.f62005a);
        if (C23198ae.m56860d(this.f61985g)) {
            mo48078i(this.f62183d);
        }
        TextUtils.equals(this.f61984f, "like_cancel");
        if (C40906h.m90485a().mo83391b(this.f62181b)) {
            mo48072a("previous_page", "push", C23232a.f62005a);
        }
        if (this.f62184e != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f62184e);
            mo48072a("is_long_item", sb.toString(), C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f62165Q)) {
            mo48072a(this.f62165Q, this.f62166R, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f62164P)) {
            mo48072a("playlist_type", this.f62164P, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f62168T)) {
            mo48072a("impr_type", this.f62168T, C23232a.f62005a);
        }
        if (C23198ae.m56862e(this.f61985g)) {
            if (!TextUtils.isEmpty(this.f62169U)) {
                mo48072a("enter_method", this.f62169U, C23232a.f62005a);
            }
            if (!TextUtils.isEmpty(this.f62170V)) {
                mo48072a("content_type", this.f62170V, C23232a.f62005a);
            }
            mo48072a("enter_fullscreen", String.valueOf(this.f62175a), C23232a.f62005a);
            if (!TextUtils.isEmpty(this.f62171W)) {
                mo48072a("is_reposted", "1", C23232a.f62005a);
                mo48072a("repost_from_group_id", this.f62171W, C23232a.f62005a);
                mo48072a("repost_from_user_id", this.f62172X, C23232a.f62005a);
            }
            mo48069a("notice_type", C31874a.m74294a());
            mo48069a("show_cnt", String.valueOf(C31874a.m74295b()));
            mo48069a("yellow_dot_logid", C31874a.m74296c());
        }
        if ((TextUtils.equals(this.f61985g, "homepage_fresh") || TextUtils.equals(this.f61985g, "homepage_channel")) && C35802a.m80931b()) {
            mo48069a("tab_name", C35802a.m80930a());
        }
        if (C23198ae.m56864f(this.f61985g)) {
            String str2 = "relation_type";
            if (this.f62176aa) {
                str = "follow";
            } else {
                str = "unfollow";
            }
            mo48069a(str2, str);
            mo48069a("video_type", this.f62177ab);
            mo48069a("rec_uid", this.f62178ac);
        }
        if (!TextUtils.isEmpty(this.f62169U)) {
            mo48072a("enter_method", this.f62169U, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f62173Y)) {
            mo48072a("compilation_id", this.f62173Y, C23232a.f62005a);
        }
        if (this.f62174Z != -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f62174Z);
            mo48072a("is_logged_in", sb2.toString(), C23232a.f62005a);
        }
        if (C27338h.m65876a()) {
            mo48069a("is_fullscreen", "1");
        }
        if (!TextUtils.isEmpty(this.f62002x)) {
            mo48069a("creation_id", this.f62002x);
        }
        if (!TextUtils.isEmpty(this.f62179ad)) {
            mo48069a("follow_status", this.f62179ad);
        }
    }

    /* renamed from: a */
    public final C23256z mo48182a(int i) {
        this.f62174Z = i;
        return this;
    }

    /* renamed from: b */
    public final C23256z mo48185b(int i) {
        this.f62163O = i;
        return this;
    }

    /* renamed from: c */
    public final C23256z mo48187c(int i) {
        this.f62184e = i;
        return this;
    }

    /* renamed from: d */
    public final C23256z mo48189d(String str) {
        this.f61985g = str;
        return this;
    }

    /* renamed from: e */
    public final C23256z mo48191e(String str) {
        this.f62167S = str;
        return this;
    }

    /* renamed from: f */
    public final C23256z mo48192f(String str) {
        this.f62169U = str;
        return this;
    }

    /* renamed from: g */
    public final C23256z mo48193g(String str) {
        this.f62002x = str;
        return this;
    }

    /* renamed from: a */
    public final C23256z mo48183a(long j) {
        this.f62180ae = j;
        return this;
    }

    /* renamed from: b */
    public final C23256z mo48186b(String str) {
        this.f62165Q = str;
        return this;
    }

    /* renamed from: c */
    public final C23256z mo48188c(String str) {
        this.f62166R = str;
        return this;
    }

    /* renamed from: a */
    public final C23256z mo48184a(String str) {
        this.f62164P = str;
        return this;
    }

    public C23256z(String str) {
        super(str);
    }

    /* renamed from: e */
    public final C23256z mo47954f(Aweme aweme) {
        String str;
        super.mo47954f(aweme);
        if (aweme != null) {
            this.f62181b = aweme.getAid();
            this.f62182c = m57044d(aweme);
            if (TextUtils.isEmpty(C23198ae.m56847a(aweme, this.f62163O))) {
                str = aweme.getRequestId();
            } else {
                str = C23198ae.m56847a(aweme, this.f62163O);
            }
            this.f62183d = str;
            this.f62168T = C23198ae.m56883s(aweme);
            this.f62170V = C23198ae.m56879o(aweme);
            this.f62171W = aweme.getRepostFromGroupId();
            this.f62172X = aweme.getRepostFromUserId();
            if (aweme.getMixInfo() != null) {
                this.f62173Y = aweme.getMixInfo().mixId;
            }
            this.f62176aa = C47915gg.m103646a(aweme);
            this.f62177ab = C23198ae.m56886v(aweme);
            this.f62178ac = C23198ae.m56887w(aweme);
            this.f62179ad = C23198ae.m56885u(aweme);
            this.f62040F = C23198ae.m56889y(aweme);
        }
        return this;
    }
}
