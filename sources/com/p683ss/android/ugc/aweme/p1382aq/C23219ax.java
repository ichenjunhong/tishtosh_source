package com.p683ss.android.ugc.aweme.p1382aq;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.detail.C27338h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import com.p683ss.android.ugc.aweme.follow.p1766e.C31874a;
import com.p683ss.android.ugc.aweme.p1382aq.C23231d.C23232a;
import com.p683ss.android.ugc.aweme.p1382aq.p1383a.C23192a;
import com.p683ss.android.ugc.aweme.profile.unlogin.C40485c;
import com.p683ss.android.ugc.aweme.push.C40906h;
import com.p683ss.android.ugc.aweme.utils.C47915gg;

/* renamed from: com.ss.android.ugc.aweme.aq.ax */
public final class C23219ax extends C23241k<C23219ax> {

    /* renamed from: O */
    public String f61876O;

    /* renamed from: P */
    public String f61877P;

    /* renamed from: Q */
    public String f61878Q;

    /* renamed from: R */
    public String f61879R;

    /* renamed from: S */
    public String f61880S;

    /* renamed from: T */
    public String f61881T;

    /* renamed from: U */
    private String f61882U;

    /* renamed from: V */
    private String f61883V = "";

    /* renamed from: W */
    private String f61884W;

    /* renamed from: X */
    private int f61885X;

    /* renamed from: Y */
    private String f61886Y;

    /* renamed from: Z */
    private String f61887Z;

    /* renamed from: a */
    public String f61888a;

    /* renamed from: aa */
    private String f61889aa;

    /* renamed from: ab */
    private int f61890ab = 1;

    /* renamed from: ac */
    private boolean f61891ac;

    /* renamed from: ad */
    private String f61892ad;

    /* renamed from: ae */
    private String f61893ae;

    /* renamed from: af */
    private String f61894af;

    /* renamed from: ag */
    private String f61895ag;

    /* renamed from: ah */
    private int f61896ah = -1;

    /* renamed from: ai */
    private String f61897ai;

    /* renamed from: aj */
    private boolean f61898aj;

    /* renamed from: ak */
    private String f61899ak;

    /* renamed from: al */
    private String f61900al;

    /* renamed from: am */
    private String f61901am;

    /* renamed from: an */
    private String f61902an;

    /* renamed from: ao */
    private String f61903ao;

    /* renamed from: b */
    public String f61904b;

    /* renamed from: c */
    public String f61905c;

    /* renamed from: d */
    public String f61906d;

    /* renamed from: e */
    public String f61907e;

    /* renamed from: g */
    public final String mo48034g() {
        return this.f61888a;
    }

    public C23219ax() {
        super("video_play_finish");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo47948a() {
        String str;
        mo48074c();
        mo48072a("group_id", this.f61888a, C23232a.f62006b);
        mo48072a("author_id", this.f61904b, C23232a.f62006b);
        mo48072a("request_id", this.f61905c, C23232a.f62006b);
        if (TextUtils.isEmpty(this.f61905c) && !TextUtils.isEmpty(this.f61903ao)) {
            mo48072a("request_id", this.f61903ao, C23232a.f62006b);
        }
        if (!TextUtils.isEmpty(this.f61883V)) {
            mo48072a("is_auto_play", this.f61883V, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61987i)) {
            mo48072a("poi_label_type", this.f61882U, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61894af)) {
            mo48072a("district_code", this.f61894af, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61895ag)) {
            mo48072a("sub_class", this.f61895ag, C23232a.f62005a);
        }
        if (this.f61896ah > 0) {
            mo48072a("rank_index", String.valueOf(this.f61896ah), C23232a.f62005a);
        }
        if (C23198ae.m56860d(this.f61985g)) {
            mo48078i(C23192a.m56826a(this.f61905c, this.f61903ao));
            if (!TextUtils.isEmpty(this.f61903ao)) {
                mo48069a("impr_id", this.f61903ao);
            } else {
                mo48069a("impr_id", this.f61905c);
            }
        }
        if ("like".equals(this.f61884W)) {
            mo48072a("enter_method", this.f61906d, C23232a.f62005a);
        }
        mo48072a("content_source", this.f61884W, C23232a.f62005a);
        if (C40906h.m90485a().mo83391b(this.f61888a)) {
            mo48072a("previous_page", "push", C23232a.f62005a);
        } else {
            mo48072a("previous_page", this.f61886Y, C23232a.f62005a);
        }
        if (this.f61885X != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f61885X);
            mo48072a("is_long_item", sb.toString(), C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61876O)) {
            mo48072a(this.f61876O, this.f61877P, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61907e)) {
            mo48072a("playlist_type", this.f61907e, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61889aa)) {
            mo48072a("video_type", this.f61889aa, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61887Z)) {
            mo48072a("impr_type", this.f61887Z, C23232a.f62005a);
        }
        if (C23794bh.m58390d().mo47106c()) {
            mo48072a("is_teen_mode", "1", C23232a.f62005a);
        }
        if (C23198ae.m56862e(this.f61985g)) {
            mo48072a("is_auto_play", C23199af.m56890a(this.f61891ac), C23232a.f62005a);
            mo48072a("enter_fullscreen", String.valueOf(this.f61890ab), C23232a.f62005a);
            if (!TextUtils.isEmpty(this.f61892ad)) {
                mo48072a("is_reposted", "1", C23232a.f62005a);
                mo48072a("repost_from_group_id", this.f61892ad, C23232a.f62005a);
                mo48072a("repost_from_user_id", this.f61893ae, C23232a.f62005a);
            }
            mo48069a("notice_type", C31874a.m74294a());
            mo48069a("show_cnt", String.valueOf(C31874a.m74295b()));
            mo48069a("yellow_dot_logid", C31874a.m74296c());
        }
        if (C23198ae.m56864f(this.f61985g)) {
            String str2 = "relation_type";
            if (this.f61898aj) {
                str = "follow";
            } else {
                str = "unfollow";
            }
            mo48069a(str2, str);
            mo48069a("video_type", this.f61899ak);
            mo48069a("rec_uid", this.f61900al);
        }
        if (!TextUtils.isEmpty(this.f61897ai)) {
            mo48072a("compilation_id", this.f61897ai, C23232a.f62005a);
        }
        if (C27338h.m65876a()) {
            mo48069a("is_fullscreen", "1");
        }
        if (this.f62039E.booleanValue()) {
            mo48069a("is_fullscreen", "0");
        }
        String str3 = this.f61985g;
        String str4 = this.f61878Q;
        String str5 = this.f61879R;
        String str6 = this.f61880S;
        if (C23198ae.m56866g(str3)) {
            mo48069a("process_id", str4);
            mo48069a("rank_index", str5);
            mo48069a("tag_id", str6);
        }
        if (C23198ae.m56868h(this.f61985g)) {
            mo48069a("process_id", this.f61878Q);
        }
        if (!TextUtils.isEmpty(this.f61881T)) {
            mo48072a("search_keyword", this.f61881T, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f62042H)) {
            mo48072a("search_result_id", this.f62042H, C23232a.f62005a);
            if (TextUtils.isEmpty(this.f62044J)) {
                mo48072a("list_item_id", this.f61888a, C23232a.f62005a);
            } else {
                mo48072a("list_item_id", this.f62044J, C23232a.f62005a);
            }
            if (!TextUtils.isEmpty(this.f61903ao)) {
                mo48069a("impr_id", this.f61903ao);
            }
        }
        if (TextUtils.equals(this.f61985g, "compilation_detail") && (TextUtils.equals(this.f61886Y, "general_search") || !TextUtils.isEmpty(this.f62042H))) {
            if (!TextUtils.isEmpty(this.f62044J)) {
                mo48072a("list_item_id", this.f62044J, C23232a.f62005a);
                mo48072a("search_third_item_id", this.f61888a, C23232a.f62005a);
            }
            if (!TextUtils.isEmpty(this.f61903ao)) {
                mo48078i(this.f61903ao);
            }
        }
        C40485c.m89893a(this.f61985g, this.f62036B, this.f61888a, new C23220ay(this));
        if (!TextUtils.isEmpty(this.f62002x)) {
            mo48069a("creation_id", this.f62002x);
        }
        if (!TextUtils.isEmpty(this.f61901am)) {
            mo48069a("tab_name", this.f61901am);
        }
        if (!TextUtils.isEmpty(this.f61902an)) {
            mo48069a("follow_status", this.f61902an);
        }
        if (!TextUtils.isEmpty(this.f61903ao)) {
            mo48069a("impr_id", this.f61903ao);
        }
    }

    /* renamed from: a */
    public final C23219ax mo48037a(int i) {
        this.f61885X = i;
        return this;
    }

    /* renamed from: b */
    public final C23219ax mo48041b(String str) {
        this.f61886Y = str;
        return this;
    }

    /* renamed from: c */
    public final C23219ax mo48043c(String str) {
        this.f61884W = str;
        return this;
    }

    /* renamed from: d */
    public final C23219ax mo48046q(String str) {
        this.f61903ao = str;
        return this;
    }

    /* renamed from: a */
    public final C23219ax mo48039a(String str) {
        this.f61985g = str;
        return this;
    }

    /* renamed from: a */
    public final C23219ax mo48038a(C30669b bVar) {
        if (bVar != null) {
            this.f62002x = bVar.getCreationId();
        }
        return this;
    }

    /* renamed from: a */
    public final C23219ax mo48040a(boolean z) {
        this.f61890ab = 0;
        return this;
    }

    /* renamed from: c */
    public final void mo48028c(Aweme aweme) {
        super.mo48028c(aweme);
        if (TextUtils.isEmpty(this.f62004z)) {
            this.f62004z = m57043b(aweme, 1);
        }
    }

    /* renamed from: e */
    public final C23219ax mo47954f(Aweme aweme) {
        super.mo47954f(aweme);
        if (aweme != null) {
            this.f61888a = aweme.getAid();
            this.f61904b = m57044d(aweme);
            this.f61905c = C23198ae.m56857c(aweme);
            this.f61887Z = C23198ae.m56883s(aweme);
            if (aweme.getPoiStruct() != null) {
                this.f61882U = String.valueOf(aweme.getPoiStruct().getPoiSubTitleType());
            }
            this.f61891ac = aweme.isImage();
            this.f61892ad = aweme.getRepostFromGroupId();
            this.f61893ae = aweme.getRepostFromUserId();
            if (aweme.getMixInfo() != null) {
                this.f61897ai = aweme.getMixInfo().mixId;
            }
            this.f61898aj = C47915gg.m103646a(aweme);
            this.f61899ak = C23198ae.m56886v(aweme);
            this.f61900al = C23198ae.m56887w(aweme);
            this.f61902an = C23198ae.m56885u(aweme);
            this.f62040F = C23198ae.m56889y(aweme);
            if (TextUtils.isEmpty(this.f62037C)) {
                this.f62037C = m57043b(aweme, 1);
            }
        }
        return this;
    }

    /* renamed from: c */
    public final C23219ax mo48042c(Aweme aweme, int i) {
        super.mo47954f(aweme);
        if (aweme != null) {
            this.f61888a = aweme.getAid();
            this.f61904b = m57044d(aweme);
            this.f61905c = m57042a(aweme, i);
            this.f61887Z = C23198ae.m56883s(aweme);
            this.f61891ac = aweme.isImage();
            if (aweme.getPoiStruct() != null) {
                this.f61882U = String.valueOf(aweme.getPoiStruct().getPoiSubTitleType());
            }
            this.f61891ac = aweme.isImage();
            this.f61892ad = aweme.getRepostFromGroupId();
            this.f61893ae = aweme.getRepostFromUserId();
            if (aweme.getMixInfo() != null) {
                this.f61897ai = aweme.getMixInfo().mixId;
            }
            this.f61898aj = C47915gg.m103646a(aweme);
            this.f61899ak = C23198ae.m56886v(aweme);
            this.f61900al = C23198ae.m56887w(aweme);
            this.f61902an = C23198ae.m56885u(aweme);
            this.f62040F = C23198ae.m56889y(aweme);
        }
        return this;
    }
}
