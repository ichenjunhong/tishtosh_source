package com.p683ss.android.ugc.aweme.p1382aq;

import android.provider.Settings.System;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.detail.C27338h;
import com.p683ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import com.p683ss.android.ugc.aweme.follow.p1766e.C31874a;
import com.p683ss.android.ugc.aweme.p1382aq.C23231d.C23232a;
import com.p683ss.android.ugc.aweme.p1382aq.p1383a.C23192a;
import com.p683ss.android.ugc.aweme.poi.PoiServiceImpl;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p683ss.android.ugc.aweme.profile.unlogin.C40485c;
import com.p683ss.android.ugc.aweme.push.C40906h;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.aq.av */
public final class C23217av extends C23241k<C23217av> {

    /* renamed from: O */
    protected String f61818O;

    /* renamed from: P */
    public String f61819P;

    /* renamed from: Q */
    public String f61820Q;

    /* renamed from: R */
    public int f61821R;

    /* renamed from: S */
    public String f61822S;

    /* renamed from: T */
    public String f61823T;

    /* renamed from: U */
    public String f61824U;

    /* renamed from: V */
    public String f61825V;

    /* renamed from: W */
    public String f61826W;

    /* renamed from: X */
    public String f61827X;

    /* renamed from: Y */
    public String f61828Y;

    /* renamed from: Z */
    public String f61829Z;

    /* renamed from: a */
    public Integer f61830a;

    /* renamed from: aA */
    private String f61831aA;

    /* renamed from: aB */
    private int f61832aB = -1;

    /* renamed from: aC */
    private String f61833aC;

    /* renamed from: aD */
    private boolean f61834aD;

    /* renamed from: aE */
    private String f61835aE;

    /* renamed from: aF */
    private String f61836aF;

    /* renamed from: aG */
    private String f61837aG;

    /* renamed from: aH */
    private int f61838aH;

    /* renamed from: aI */
    private int f61839aI;

    /* renamed from: aJ */
    private String f61840aJ;

    /* renamed from: aK */
    private int f61841aK;

    /* renamed from: aL */
    private String f61842aL;

    /* renamed from: aM */
    private int f61843aM;

    /* renamed from: aN */
    private List<AnchorCommonStruct> f61844aN;

    /* renamed from: aa */
    public String f61845aa;

    /* renamed from: ab */
    public String f61846ab;

    /* renamed from: ac */
    public String f61847ac;

    /* renamed from: ad */
    public String f61848ad;

    /* renamed from: ae */
    public String f61849ae;

    /* renamed from: af */
    private String f61850af;

    /* renamed from: ag */
    private String f61851ag;

    /* renamed from: ah */
    private String f61852ah;

    /* renamed from: ai */
    private String f61853ai;

    /* renamed from: aj */
    private String f61854aj;

    /* renamed from: ak */
    private String f61855ak = "0";

    /* renamed from: al */
    private String f61856al = "";

    /* renamed from: am */
    private String f61857am;

    /* renamed from: an */
    private String f61858an;

    /* renamed from: ao */
    private String f61859ao;

    /* renamed from: ap */
    private String f61860ap;

    /* renamed from: aq */
    private String f61861aq;

    /* renamed from: ar */
    private int f61862ar;

    /* renamed from: as */
    private String f61863as;

    /* renamed from: at */
    private String f61864at;

    /* renamed from: au */
    private String f61865au;

    /* renamed from: av */
    private int f61866av;

    /* renamed from: aw */
    private boolean f61867aw;

    /* renamed from: ax */
    private String f61868ax;

    /* renamed from: ay */
    private String f61869ay;

    /* renamed from: az */
    private String f61870az;

    /* renamed from: b */
    public String f61871b;

    /* renamed from: c */
    public String f61872c;

    /* renamed from: d */
    public int f61873d = 1;

    /* renamed from: e */
    public String f61874e;

    /* renamed from: g */
    public final String mo48034g() {
        return this.f61850af;
    }

    public C23217av() {
        super("video_play");
    }

    /* renamed from: h */
    private void m56973h() {
        try {
            if (System.getInt(C11010c.m22280a().getContentResolver(), "accelerometer_rotation") == 0) {
                this.f61866av = 0;
            } else {
                this.f61866av = 1;
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo47948a() {
        String str;
        mo48074c();
        mo48072a("group_id", this.f61850af, C23232a.f62006b);
        mo48072a("author_id", this.f61851ag, C23232a.f62006b);
        mo48072a("player_type", this.f61852ah, C23232a.f62005a);
        mo48072a("request_id", this.f62047M, C23232a.f62006b);
        if (TextUtils.isEmpty(this.f62047M) && !TextUtils.isEmpty(this.f62046L)) {
            mo48072a("request_id", this.f62046L, C23232a.f62006b);
        }
        if (!TextUtils.isEmpty(this.f62037C)) {
            mo48072a("order", this.f62037C, C23232a.f62005a);
        }
        mo48072a("feed_count", this.f61857am, C23232a.f62005a);
        mo48072a("previous_page", this.f61858an, C23232a.f62005a);
        mo48072a("is_photo", this.f61855ak, C23232a.f62005a);
        if (this.f61830a != null) {
            mo48072a(C22858c.f61208d, String.valueOf(this.f61830a), C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61856al)) {
            mo48072a("is_auto_play", this.f61856al, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61871b)) {
            mo48072a("share_mode", "token", C23232a.f62005a);
            mo48072a("uid", this.f61871b, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61987i)) {
            mo48072a("poi_label_type", this.f61853ai, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61854aj)) {
            mo48072a("distance_km", this.f61854aj, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61870az)) {
            mo48072a("district_code", this.f61870az, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61831aA)) {
            mo48072a("sub_class", this.f61831aA, C23232a.f62005a);
        }
        if (this.f61832aB > 0) {
            mo48072a("rank_index", String.valueOf(this.f61832aB), C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61872c)) {
            mo48072a("enter_from_request", this.f61872c, C23232a.f62006b);
        }
        if (!TextUtils.isEmpty(this.f61859ao)) {
            mo48072a("search_keyword", this.f61859ao, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f62042H)) {
            mo48072a("search_result_id", this.f62042H, C23232a.f62005a);
            if (TextUtils.isEmpty(this.f62044J)) {
                mo48072a("list_item_id", this.f61850af, C23232a.f62005a);
            } else {
                mo48072a("list_item_id", this.f62044J, C23232a.f62005a);
            }
        }
        if (!TextUtils.isEmpty(this.f62043I)) {
            mo48072a("list_result_type", this.f62043I, C23232a.f62005a);
        }
        if (C23198ae.m56860d(this.f61985g)) {
            mo48078i(this.f62047M);
            if (!TextUtils.isEmpty(this.f62046L)) {
                mo48078i(C23192a.m56826a(this.f62047M, this.f62046L));
            } else {
                mo48069a("impr_id", this.f62047M);
            }
        }
        if (TextUtils.equals(this.f61985g, "compilation_detail") && (TextUtils.equals(this.f61858an, "general_search") || !TextUtils.isEmpty(this.f62042H))) {
            if (!TextUtils.isEmpty(this.f62044J)) {
                mo48072a("list_item_id", this.f62044J, C23232a.f62005a);
                mo48072a("search_third_item_id", this.f61850af, C23232a.f62005a);
            }
            if (!TextUtils.isEmpty(this.f62046L)) {
                mo48078i(this.f62046L);
            }
        }
        if (!TextUtils.isEmpty(this.f61818O)) {
            mo48069a("video_type", this.f61818O);
        }
        if (this.f61844aN != null && this.f61844aN.size() > 0 && this.f61985g.equalsIgnoreCase("anchor_detail")) {
            mo48069a("anchor_type", "movie");
            mo48069a("anchor_entry", ((AnchorCommonStruct) this.f61844aN.get(0)).getKeyword());
        }
        if (!TextUtils.isEmpty(this.f61874e)) {
            mo48072a("account_type", this.f61874e, C23232a.f62005a);
        }
        mo48072a("is_h265", String.valueOf(this.f61821R), C23232a.f62005a);
        if ("like".equals(this.f61861aq) || "homepage_fresh".equalsIgnoreCase(this.f61985g) || "poi_page".equalsIgnoreCase(this.f61985g) || "poi_map".equalsIgnoreCase(this.f61985g) || "homepage_channel".equals(this.f61985g) || TextUtils.equals("homepage_fresh_topic", this.f61985g) || "homepage_fresh_search".equalsIgnoreCase(this.f61985g) || "ec_impressed_page".equalsIgnoreCase(this.f61985g)) {
            if ("poi_page".equalsIgnoreCase(this.f61985g) && TextUtils.isEmpty(this.f61860ap)) {
                this.f61860ap = "auto";
            }
            mo48072a("enter_method", this.f61860ap, C23232a.f62005a);
        }
        mo48072a("content_source", this.f61861aq, C23232a.f62005a);
        if (C40906h.m90485a().mo83391b(this.f61850af)) {
            mo48072a("previous_page", "push", C23232a.f62005a);
        }
        if (this.f61862ar != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f61862ar);
            mo48072a("is_long_item", sb.toString(), C23232a.f62005a);
        }
        mo48072a("enter_play_method", "manul_play", C23232a.f62005a);
        if (!TextUtils.isEmpty(this.f61823T)) {
            mo48072a(this.f61823T, this.f61824U, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61822S)) {
            mo48072a("playlist_type", this.f61822S, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61865au)) {
            mo48072a("rule_id", this.f61865au, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61863as)) {
            mo48072a("impr_type", this.f61863as, C23232a.f62005a);
        }
        mo48072a("is_auto_rotate", String.valueOf(this.f61866av), C23232a.f62005a);
        if (C23794bh.m58390d().mo47106c()) {
            mo48072a("is_teen_mode", "1", C23232a.f62005a);
        }
        if (C23198ae.m56862e(this.f61985g)) {
            mo48072a("is_auto_play", C23199af.m56890a(this.f61867aw), C23232a.f62005a);
            mo48072a("enter_fullscreen", String.valueOf(this.f61873d), C23232a.f62005a);
            if (!TextUtils.isEmpty(this.f61868ax)) {
                mo48072a("is_reposted", "1", C23232a.f62005a);
                mo48072a("repost_from_group_id", this.f61868ax, C23232a.f62005a);
                mo48072a("repost_from_user_id", this.f61869ay, C23232a.f62005a);
            }
            mo48069a("notice_type", C31874a.m74294a());
            mo48069a("show_cnt", String.valueOf(C31874a.m74295b()));
            mo48069a("yellow_dot_logid", C31874a.m74296c());
        }
        if (C23198ae.m56864f(this.f61985g)) {
            String str2 = "relation_type";
            if (this.f61834aD) {
                str = "follow";
            } else {
                str = "unfollow";
            }
            mo48069a(str2, str);
            mo48069a("video_type", this.f61835aE);
            mo48069a("rec_uid", this.f61836aF);
        }
        if (C23198ae.m56866g(this.f61985g)) {
            String str3 = this.f61864at;
            String str4 = this.f61819P;
            String str5 = this.f61820Q;
            mo48069a("process_id", str3);
            mo48069a("rank_index", str4);
            mo48069a("tag_id", str5);
        }
        if (C23198ae.m56868h(this.f61985g)) {
            mo48069a("process_id", this.f61864at);
        }
        if (!TextUtils.isEmpty(this.f62036B)) {
            mo48069a("tab_name", this.f62036B);
        }
        C40485c.m89893a(this.f61985g, this.f62036B, this.f61850af, new C23218aw(this));
        if (!TextUtils.isEmpty(this.f61833aC)) {
            mo48072a("compilation_id", this.f61833aC, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61825V)) {
            mo48072a("carrier_type", this.f61825V, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61826W)) {
            mo48072a("refer_seed_id", this.f61826W, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61827X)) {
            mo48072a("refer_seed_name", this.f61827X, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61828Y)) {
            mo48072a("from_group_id", this.f61828Y, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61829Z)) {
            mo48072a("data_type", this.f61829Z, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61845aa)) {
            mo48069a("refer_commodity_id", this.f61845aa);
        }
        if (C27338h.m65876a()) {
            mo48069a("is_fullscreen", "1");
        }
        if (this.f62039E.booleanValue()) {
            mo48069a("is_fullscreen", "0");
        }
        if (!TextUtils.isEmpty(this.f62002x)) {
            mo48069a("creation_id", this.f62002x);
        }
        if (!TextUtils.isEmpty(this.f61846ab)) {
            mo48069a("tab_name", this.f61846ab);
        }
        if (!TextUtils.isEmpty(this.f61847ac)) {
            mo48069a("region", this.f61847ac);
        }
        mo48069a("play_order", String.valueOf(this.f61843aM));
        if (!TextUtils.isEmpty(this.f61837aG)) {
            mo48069a("relation_tag", this.f61837aG);
        }
        if (this.f61838aH != 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f61838aH);
            mo48072a("is_media", sb2.toString(), C23232a.f62005a);
        }
        if (this.f61839aI != 0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f61839aI);
            mo48072a("is_history", sb3.toString(), C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61840aJ)) {
            mo48072a("eid", this.f61840aJ, C23232a.f62005a);
        }
        if (this.f61841aK != 0) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.f61841aK);
            mo48072a("from_tag_id", sb4.toString(), C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61842aL)) {
            mo48069a("follow_status", this.f61842aL);
        }
        if ("compilation_detail".equals(this.f61985g)) {
            if ("from_mix_video".equals(this.f61848ad)) {
                mo48069a("page_type", "simple");
            } else {
                mo48069a("page_type", "complete");
            }
        }
        if (!TextUtils.isEmpty(this.f62046L)) {
            mo48069a("impr_id", this.f62046L);
        } else {
            mo48069a("impr_id", this.f62047M);
        }
        if (!TextUtils.isEmpty(this.f61849ae)) {
            mo48069a("to_user_id", this.f61849ae);
        }
    }

    /* renamed from: a */
    public final C23217av mo48020a(int i) {
        this.f61843aM = i;
        return this;
    }

    /* renamed from: b */
    public final C23217av mo48024b(int i) {
        this.f61862ar = i;
        return this;
    }

    /* renamed from: c */
    public final C23217av mo48027c(String str) {
        this.f61864at = str;
        return this;
    }

    /* renamed from: d */
    public final C23217av mo48029d(String str) {
        this.f61858an = str;
        return this;
    }

    /* renamed from: e */
    public final C23217av mo48031e(String str) {
        this.f61859ao = str;
        return this;
    }

    /* renamed from: f */
    public final C23217av mo48032f(String str) {
        this.f61852ah = str;
        return this;
    }

    /* renamed from: g */
    public final C23217av mo48033g(String str) {
        this.f61860ap = str;
        return this;
    }

    /* renamed from: h */
    public final C23217av mo48035h(String str) {
        this.f61861aq = str;
        return this;
    }

    /* renamed from: s */
    public final C23217av mo48036s(String str) {
        this.f61865au = str;
        return this;
    }

    /* renamed from: a */
    public final C23217av mo48022a(String str) {
        this.f61848ad = str;
        return this;
    }

    /* renamed from: b */
    public final C23217av mo48025b(String str) {
        this.f61985g = str;
        return this;
    }

    /* renamed from: a */
    public final C23217av mo48021a(C30669b bVar) {
        if (bVar != null) {
            this.f62002x = bVar.getCreationId();
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

    public C23217av(String str) {
        super(str);
    }

    /* renamed from: e */
    public final C23217av mo47954f(Aweme aweme) {
        String str;
        super.mo47954f(aweme);
        if (aweme != null) {
            this.f61850af = aweme.getAid();
            this.f61851ag = m57044d(aweme);
            this.f62047M = C23198ae.m56857c(aweme);
            if (aweme.isImage()) {
                str = "1";
            } else {
                str = "0";
            }
            this.f61855ak = str;
            this.f61854aj = C23198ae.m56849a(aweme.getDistance());
            this.f61863as = C23198ae.m56883s(aweme);
            PoiStruct poiStruct = aweme.getPoiStruct();
            if (poiStruct != null && !TextUtils.isEmpty(poiStruct.poiLatitude) && !TextUtils.isEmpty(poiStruct.poiLongitude)) {
                this.f61853ai = String.valueOf(poiStruct.getPoiSubTitleType());
                if ("".equals(this.f61854aj)) {
                    this.f61854aj = PoiServiceImpl.createIPoiServicebyMonsterPlugin().getMobDistance(C11010c.m22280a(), poiStruct);
                }
            }
            this.f61867aw = aweme.isImage();
            this.f61868ax = aweme.getRepostFromGroupId();
            this.f61869ay = aweme.getRepostFromUserId();
            if (aweme.getMixInfo() != null) {
                this.f61833aC = aweme.getMixInfo().mixId;
            }
            this.f61834aD = C47915gg.m103646a(aweme);
            this.f61835aE = C23198ae.m56886v(aweme);
            this.f61836aF = C23198ae.m56887w(aweme);
            this.f61837aG = C23198ae.m56888x(aweme);
            this.f61842aL = C23198ae.m56885u(aweme);
            this.f62040F = C23198ae.m56889y(aweme);
        }
        m56973h();
        return this;
    }

    /* renamed from: c */
    public final C23217av mo48026c(Aweme aweme, int i) {
        String str;
        super.mo47954f(aweme);
        if (aweme != null) {
            this.f61850af = aweme.getAid();
            this.f61851ag = m57044d(aweme);
            this.f62047M = m57042a(aweme, i);
            this.f62037C = m57043b(aweme, i);
            if (TextUtils.isEmpty(this.f62037C)) {
                this.f62037C = m57043b(aweme, 1);
            }
            this.f61857am = String.valueOf(aweme.getFeedCount());
            if (aweme.isImage()) {
                str = "1";
            } else {
                str = "0";
            }
            this.f61855ak = str;
            this.f61867aw = aweme.isImage();
            this.f61854aj = C23198ae.m56849a(aweme.getDistance());
            this.f61863as = C23198ae.m56883s(aweme);
            PoiStruct poiStruct = aweme.getPoiStruct();
            if (poiStruct != null) {
                this.f61853ai = String.valueOf(poiStruct.getPoiSubTitleType());
                if ("".equals(this.f61854aj)) {
                    this.f61854aj = PoiServiceImpl.createIPoiServicebyMonsterPlugin().getMobDistance(C11010c.m22280a(), poiStruct);
                }
            }
            this.f61867aw = aweme.isImage();
            this.f61868ax = aweme.getRepostFromGroupId();
            this.f61869ay = aweme.getRepostFromUserId();
            if (aweme.getMixInfo() != null) {
                this.f61833aC = aweme.getMixInfo().mixId;
            }
            this.f61834aD = C47915gg.m103646a(aweme);
            this.f61835aE = C23198ae.m56886v(aweme);
            this.f61836aF = C23198ae.m56887w(aweme);
            this.f61837aG = C23198ae.m56888x(aweme);
            this.f61842aL = C23198ae.m56885u(aweme);
            this.f62040F = C23198ae.m56889y(aweme);
            if (aweme.getAnchors() != null) {
                this.f61844aN = aweme.getAnchors();
            }
        }
        m56973h();
        return this;
    }

    /* renamed from: a */
    public final C23217av mo48023a(String str, String str2, String str3) {
        this.f61850af = str;
        this.f61851ag = str2;
        this.f62047M = str3;
        return this;
    }
}
