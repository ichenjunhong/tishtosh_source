package com.p683ss.android.ugc.aweme.p1382aq;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.detail.C27338h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import com.p683ss.android.ugc.aweme.p1382aq.C23231d.C23232a;
import com.p683ss.android.ugc.aweme.p1382aq.p1383a.C23192a;
import com.p683ss.android.ugc.aweme.p1912k.C35802a;
import com.p683ss.android.ugc.aweme.push.C40906h;
import com.p683ss.android.ugc.aweme.utils.C47915gg;

/* renamed from: com.ss.android.ugc.aweme.aq.az */
public final class C23221az extends C23241k<C23221az> {

    /* renamed from: O */
    public String f61909O;

    /* renamed from: P */
    public String f61910P;

    /* renamed from: Q */
    public String f61911Q;

    /* renamed from: R */
    public String f61912R;

    /* renamed from: S */
    public String f61913S;

    /* renamed from: T */
    public String f61914T;

    /* renamed from: U */
    public String f61915U;

    /* renamed from: V */
    public String f61916V;

    /* renamed from: W */
    public String f61917W;

    /* renamed from: X */
    public String f61918X;

    /* renamed from: Y */
    public String f61919Y;

    /* renamed from: Z */
    private String f61920Z;

    /* renamed from: a */
    public String f61921a;

    /* renamed from: aA */
    private int f61922aA;

    /* renamed from: aB */
    private int f61923aB;

    /* renamed from: aC */
    private String f61924aC;

    /* renamed from: aD */
    private int f61925aD;

    /* renamed from: aE */
    private String f61926aE;

    /* renamed from: aa */
    private String f61927aa;

    /* renamed from: ab */
    private long f61928ab;

    /* renamed from: ac */
    private String f61929ac;

    /* renamed from: ad */
    private String f61930ad = "";

    /* renamed from: ae */
    private int f61931ae = 1;

    /* renamed from: af */
    private String f61932af;

    /* renamed from: ag */
    private String f61933ag;

    /* renamed from: ah */
    private String f61934ah;

    /* renamed from: ai */
    private String f61935ai;

    /* renamed from: aj */
    private int f61936aj;

    /* renamed from: ak */
    private String f61937ak;

    /* renamed from: al */
    private String f61938al;

    /* renamed from: am */
    private boolean f61939am;

    /* renamed from: an */
    private String f61940an;

    /* renamed from: ao */
    private String f61941ao;

    /* renamed from: ap */
    private String f61942ap;

    /* renamed from: aq */
    private String f61943aq;

    /* renamed from: ar */
    private int f61944ar = -1;

    /* renamed from: as */
    private String f61945as;

    /* renamed from: at */
    private int f61946at;

    /* renamed from: au */
    private boolean f61947au;

    /* renamed from: av */
    private String f61948av;

    /* renamed from: aw */
    private String f61949aw;

    /* renamed from: ax */
    private String f61950ax;

    /* renamed from: ay */
    private String f61951ay;

    /* renamed from: az */
    private int f61952az = -1;

    /* renamed from: b */
    public String f61953b;

    /* renamed from: c */
    public String f61954c;

    /* renamed from: d */
    public String f61955d;

    /* renamed from: e */
    public double f61956e;

    /* renamed from: g */
    public final String mo48034g() {
        return this.f61920Z;
    }

    public C23221az() {
        super("play_time");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo47948a() {
        String str;
        mo48074c();
        mo48072a("group_id", this.f61920Z, C23232a.f62006b);
        mo48072a("author_id", this.f61927aa, C23232a.f62006b);
        mo48072a("duration", String.valueOf(this.f61928ab), C23232a.f62005a);
        mo48072a("player_type", this.f61932af, C23232a.f62005a);
        mo48072a("fps", this.f61933ag, C23232a.f62005a);
        mo48072a("previous_page", this.f61937ak, C23232a.f62005a);
        if (!TextUtils.isEmpty(this.f61930ad)) {
            mo48072a("is_auto_play", this.f61930ad, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61987i)) {
            mo48072a("poi_label_type", this.f61929ac, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61942ap)) {
            mo48072a("district_code", this.f61942ap, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61943aq)) {
            mo48072a("sub_class", this.f61943aq, C23232a.f62005a);
        }
        if (this.f61944ar > 0) {
            mo48072a("rank_index", String.valueOf(this.f61944ar), C23232a.f62005a);
        }
        if (C23198ae.m56860d(this.f61985g)) {
            if (!TextUtils.isEmpty(this.f61926aE)) {
                mo48069a("impr_id", this.f61926aE);
            } else {
                mo48069a("impr_id", this.f61934ah);
            }
            mo48078i(C23192a.m56826a(this.f61934ah, this.f61926aE));
        }
        if ("like".equals(this.f61935ai)) {
            mo48072a("enter_method", this.f61921a, C23232a.f62005a);
        }
        mo48072a("content_source", this.f61935ai, C23232a.f62005a);
        if (C40906h.m90485a().mo83391b(this.f61920Z)) {
            mo48072a("previous_page", "push", C23232a.f62005a);
        }
        if (this.f61936aj != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f61936aj);
            mo48072a("is_long_item", sb.toString(), C23232a.f62005a);
        }
        if ((TextUtils.equals(this.f61985g, "homepage_fresh") || TextUtils.equals(this.f61985g, "homepage_channel")) && C35802a.m80931b()) {
            mo48072a("tab_name", C35802a.m80930a(), C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61954c)) {
            mo48072a(this.f61954c, this.f61955d, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61953b)) {
            mo48072a("playlist_type", this.f61953b, C23232a.f62005a);
        }
        mo48072a("volume_value", String.valueOf(this.f61956e), C23232a.f62005a);
        if (!TextUtils.isEmpty(this.f61938al)) {
            mo48072a("impr_type", this.f61938al, C23232a.f62005a);
        }
        if (C23794bh.m58390d().mo47106c()) {
            mo48072a("is_teen_mode", "1", C23232a.f62005a);
        }
        if (C23198ae.m56862e(this.f61985g)) {
            mo48072a("is_auto_play", C23199af.m56890a(this.f61939am), C23232a.f62005a);
            mo48072a("enter_fullscreen", String.valueOf(this.f61931ae), C23232a.f62005a);
            if (!TextUtils.isEmpty(this.f61940an)) {
                mo48072a("is_reposted", "1", C23232a.f62005a);
                mo48072a("repost_from_group_id", this.f61940an, C23232a.f62005a);
                mo48072a("repost_from_user_id", this.f61941ao, C23232a.f62005a);
            }
        }
        if (C23198ae.m56864f(this.f61985g)) {
            String str2 = "relation_type";
            if (this.f61947au) {
                str = "follow";
            } else {
                str = "unfollow";
            }
            mo48069a(str2, str);
            mo48069a("video_type", this.f61948av);
            mo48069a("rec_uid", this.f61949aw);
        }
        if (!TextUtils.isEmpty(this.f61945as)) {
            mo48072a("compilation_id", this.f61945as, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61909O)) {
            mo48072a("carrier_type", this.f61909O, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61910P)) {
            mo48072a("refer_seed_id", this.f61910P, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61911Q)) {
            mo48072a("refer_seed_name", this.f61911Q, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61912R)) {
            mo48072a("from_group_id", this.f61912R, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61913S)) {
            mo48072a("data_type", this.f61913S, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61914T)) {
            mo48069a("refer_commodity_id", this.f61914T);
        }
        if (C27338h.m65876a()) {
            mo48069a("is_fullscreen", "1");
        }
        mo48072a("request_id", this.f61934ah, C23232a.f62006b);
        if (TextUtils.isEmpty(this.f61934ah) && !TextUtils.isEmpty(this.f61926aE)) {
            mo48072a("request_id", this.f61926aE, C23232a.f62006b);
        }
        if (!TextUtils.isEmpty(this.f61915U)) {
            mo48072a("search_keyword", this.f61915U, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f62042H)) {
            mo48072a("search_result_id", this.f62042H, C23232a.f62005a);
            if (TextUtils.isEmpty(this.f62044J)) {
                mo48072a("list_item_id", this.f61920Z, C23232a.f62005a);
            } else {
                mo48072a("list_item_id", this.f62044J, C23232a.f62005a);
            }
            if (!TextUtils.isEmpty(this.f61926aE)) {
                mo48069a("impr_id", this.f61926aE);
            }
        }
        if (!TextUtils.isEmpty(this.f62043I)) {
            mo48072a("list_result_type", this.f62043I, C23232a.f62005a);
        }
        if (TextUtils.equals(this.f61985g, "compilation_detail") && (TextUtils.equals(this.f61937ak, "general_search") || !TextUtils.isEmpty(this.f62042H))) {
            if (!TextUtils.isEmpty(this.f62044J)) {
                mo48072a("list_item_id", this.f62044J, C23232a.f62005a);
                mo48072a("search_third_item_id", this.f61920Z, C23232a.f62005a);
            }
            if (!TextUtils.isEmpty(this.f61926aE)) {
                mo48078i(this.f61926aE);
            }
        }
        if (!TextUtils.isEmpty(this.f62002x)) {
            mo48069a("creation_id", this.f62002x);
        }
        if (TextUtils.equals(this.f61985g, "general_search") && this.f61946at > 0) {
            float f = (((float) this.f61928ab) * 1.0f) / ((float) this.f61946at);
            String str3 = "percentage";
            if (f > 1.0f) {
                f = 1.0f;
            }
            mo48072a(str3, String.valueOf(f), C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f62036B)) {
            mo48069a("tab_name", this.f62036B);
        }
        if (!TextUtils.isEmpty(this.f61916V)) {
            mo48069a("tab_name", this.f61916V);
        }
        if (!TextUtils.isEmpty(this.f61918X)) {
            mo48069a("region", this.f61918X);
        }
        if (!TextUtils.isEmpty(this.f61950ax)) {
            mo48069a("relation_tag", this.f61950ax);
        }
        if (this.f61922aA != 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f61922aA);
            mo48072a("is_media", sb2.toString(), C23232a.f62005a);
        }
        if (this.f61923aB != 0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f61923aB);
            mo48072a("is_history", sb3.toString(), C23232a.f62005a);
        }
        if (this.f61952az != -1) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.f61952az);
            mo48072a("is_fullscreen", sb4.toString(), C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61924aC)) {
            mo48072a("eid", this.f61924aC, C23232a.f62005a);
        }
        if (this.f61925aD != 0) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(this.f61925aD);
            mo48072a("from_tag_id", sb5.toString(), C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61951ay)) {
            mo48069a("follow_status", this.f61951ay);
        }
        if ("compilation_detail".equals(this.f61985g)) {
            if ("from_mix_video".equals(this.f61917W)) {
                mo48069a("page_type", "simple");
            } else {
                mo48069a("page_type", "complete");
            }
        }
        if (this.f61926aE != null) {
            mo48069a("impr_id", this.f61926aE);
        }
        if (!TextUtils.isEmpty(this.f61919Y)) {
            Aweme awemeById = C23324d.m57378a().getAwemeById(this.f61919Y);
            mo48069a("feed_group_id", awemeById.getAid());
            mo48069a("feed_author_id", awemeById.getAuthorUid());
        }
    }

    /* renamed from: a */
    public final C23221az mo48048a(int i) {
        this.f61936aj = i;
        return this;
    }

    /* renamed from: b */
    public final C23221az mo48055b(String str) {
        this.f61937ak = str;
        return this;
    }

    /* renamed from: c */
    public final C23221az mo48056c(String str) {
        this.f61932af = str;
        return this;
    }

    /* renamed from: d */
    public final C23221az mo48057d(String str) {
        this.f61934ah = str;
        return this;
    }

    /* renamed from: e */
    public final C23221az mo48059e(String str) {
        this.f61935ai = str;
        return this;
    }

    /* renamed from: f */
    public final C23221az mo48060f(String str) {
        this.f62002x = str;
        return this;
    }

    /* renamed from: g */
    public final C23221az mo48046q(String str) {
        this.f61926aE = str;
        return this;
    }

    /* renamed from: a */
    public final C23221az mo48047a(float f) {
        try {
            this.f61933ag = String.valueOf(f);
        } catch (Exception unused) {
        }
        return this;
    }

    /* renamed from: a */
    public final C23221az mo48049a(long j) {
        this.f61928ab = j;
        return this;
    }

    /* renamed from: b */
    public final C23221az mo48054b(C30669b bVar) {
        if (bVar != null) {
            this.f61993o = bVar.getPagePoiId();
        }
        return this;
    }

    /* renamed from: a */
    public final C23221az mo48050a(C30669b bVar) {
        if (bVar != null) {
            this.f61997s = bVar.getCardType();
            this.f61998t = bVar.getObjectId();
        }
        return this;
    }

    /* renamed from: c */
    public final void mo48028c(Aweme aweme) {
        super.mo48028c(aweme);
        if (TextUtils.isEmpty(this.f62004z)) {
            this.f62004z = m57043b(aweme, 1);
        }
    }

    /* renamed from: a */
    public final C23221az mo48052a(String str) {
        this.f61985g = str;
        return this;
    }

    /* renamed from: a */
    public final C23221az mo48053a(boolean z) {
        this.f61931ae = z ? 1 : 0;
        return this;
    }

    /* renamed from: e */
    public final C23221az mo47954f(Aweme aweme) {
        int i;
        super.mo47954f(aweme);
        if (aweme != null) {
            this.f61920Z = aweme.getAid();
            this.f61927aa = m57044d(aweme);
            this.f61938al = C23198ae.m56883s(aweme);
            if (aweme.getPoiStruct() != null) {
                this.f61929ac = String.valueOf(aweme.getPoiStruct().getPoiSubTitleType());
            }
            this.f61939am = aweme.isImage();
            this.f61940an = aweme.getRepostFromGroupId();
            this.f61941ao = aweme.getRepostFromUserId();
            if (aweme.getMixInfo() != null) {
                this.f61945as = aweme.getMixInfo().mixId;
            }
            this.f61947au = C47915gg.m103646a(aweme);
            this.f61948av = C23198ae.m56886v(aweme);
            this.f61949aw = C23198ae.m56887w(aweme);
            this.f61950ax = C23198ae.m56888x(aweme);
            if (aweme.getVideo() != null) {
                i = aweme.getVideo().getDuration();
            } else {
                i = 0;
            }
            this.f61946at = i;
            this.f61951ay = C23198ae.m56885u(aweme);
            this.f62040F = C23198ae.m56889y(aweme);
            if (TextUtils.isEmpty(this.f62037C)) {
                this.f62037C = m57043b(aweme, 1);
            }
        }
        return this;
    }

    /* renamed from: a */
    public final C23221az mo48051a(C30669b bVar, int i) {
        if (bVar != null) {
            this.f61989k = bVar.getBackendType();
            this.f61986h = bVar.getCityCode();
            this.f61942ap = bVar.getDistrictCode();
            this.f61943aq = bVar.getSubClass();
            this.f61944ar = i;
        }
        return this;
    }
}
