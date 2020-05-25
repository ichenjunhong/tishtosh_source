package com.p683ss.android.ugc.aweme.p1382aq;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.detail.C27338h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1382aq.C23231d.C23232a;
import com.p683ss.android.ugc.aweme.p1382aq.C23241k;
import com.p683ss.android.ugc.aweme.p1912k.C35802a;

/* renamed from: com.ss.android.ugc.aweme.aq.k */
public abstract class C23241k<E extends C23241k> extends C23231d {

    /* renamed from: A */
    protected String f62035A;

    /* renamed from: B */
    protected String f62036B;

    /* renamed from: C */
    protected String f62037C;

    /* renamed from: D */
    protected Boolean f62038D = Boolean.valueOf(false);

    /* renamed from: E */
    protected Boolean f62039E = Boolean.valueOf(false);

    /* renamed from: F */
    protected String f62040F;

    /* renamed from: G */
    protected int f62041G = 0;

    /* renamed from: H */
    protected String f62042H;

    /* renamed from: I */
    protected String f62043I;

    /* renamed from: J */
    protected String f62044J;

    /* renamed from: K */
    protected String f62045K;

    /* renamed from: L */
    protected String f62046L;

    /* renamed from: M */
    protected String f62047M;

    /* renamed from: N */
    protected String f62048N;

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public String mo48034g() {
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo47945b() {
        String str;
        if ("homepage_country".equals(this.f61985g) && !TextUtils.isEmpty(this.f62035A)) {
            mo48072a("country_name", this.f62035A, C23232a.f62005a);
        }
        if (("others_homepage".equals(this.f61985g) || "collection_video".equals(this.f61985g) || "personal_homepage".equals(this.f61985g) || "playlist".equals(this.f61985g)) && !TextUtils.isEmpty(this.f62036B)) {
            mo48072a("tab_name", this.f62036B, C23232a.f62005a);
            mo48072a("order", this.f62037C, C23232a.f62005a);
        }
        if ((TextUtils.equals(this.f61985g, "homepage_fresh") || TextUtils.equals(this.f61985g, "homepage_channel")) && C35802a.m80931b() && !(this instanceof C23213as)) {
            mo48069a("tab_name", C35802a.m80930a());
        }
        if (!TextUtils.isEmpty(this.f61999u)) {
            if (TextUtils.equals(this.f61985g, "homepage_fresh_topic") || this.f62000v) {
                mo48072a("topic_name", this.f61999u, C23232a.f62005a);
            } else {
                mo48072a("trending_topic", this.f61999u, C23232a.f62005a);
            }
        }
        if ("discovery_category".equals(this.f61985g) && !TextUtils.isEmpty(this.f62036B)) {
            mo48072a("discovery_category", this.f62036B, C23232a.f62005a);
            mo48072a("order", this.f62037C, C23232a.f62005a);
        }
        mo48072a("enter_from", this.f61985g, C23232a.f62005a);
        if (this.f62041G != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f62041G);
            mo48072a("topic_type", sb.toString(), C23232a.f62005a);
        }
        if (TextUtils.equals(this.f61985g, "general_search")) {
            mo48069a("video_tag", this.f62003y);
        }
        if (TextUtils.equals(this.f61985g, "general_search") || TextUtils.equals(this.f61985g, "search_result")) {
            mo48072a("rank", this.f62004z, C23232a.f62005a);
            String str2 = "is_fullscreen";
            if (C27338h.m65876a()) {
                str = "1";
            } else {
                str = "0";
            }
            mo48069a(str2, str);
            if (!TextUtils.isEmpty(this.f62042H)) {
                mo48069a("search_result_id", this.f62042H);
            }
            if (!TextUtils.isEmpty(this.f62042H)) {
                mo48072a("search_result_id", this.f62042H, C23232a.f62005a);
                if (TextUtils.isEmpty(this.f62044J)) {
                    mo48072a("list_item_id", mo48034g(), C23232a.f62005a);
                } else {
                    mo48072a("list_item_id", this.f62044J, C23232a.f62005a);
                }
            }
            if (!TextUtils.isEmpty(this.f62043I)) {
                mo48072a("list_result_type", this.f62043I, C23232a.f62005a);
            }
            if (!TextUtils.isEmpty(this.f62045K)) {
                mo48072a("search_third_item_id", mo48034g(), C23232a.f62005a);
            }
            if (!TextUtils.isEmpty(this.f62046L)) {
                mo48069a("impr_id", this.f62046L);
            } else {
                mo48069a("impr_id", this.f62047M);
            }
        }
        if (!TextUtils.isEmpty(this.f62048N)) {
            mo48069a("search_id", this.f62048N);
        }
        if (this.f62039E.booleanValue()) {
            mo48069a("is_fullscreen", "0");
        }
        if (TextUtils.equals(this.f61985g, "homepage_hot") && !TextUtils.isEmpty(this.f62040F)) {
            mo48072a("rec_type", this.f62040F, C23232a.f62005a);
        }
    }

    /* renamed from: a */
    public final E mo48098a(Boolean bool) {
        this.f62038D = bool;
        return this;
    }

    /* renamed from: b */
    public final E mo48099b(Boolean bool) {
        this.f62039E = bool;
        return this;
    }

    /* renamed from: j */
    public final E mo48100j(String str) {
        this.f62036B = str;
        return this;
    }

    /* renamed from: k */
    public final E mo48101k(String str) {
        this.f62037C = str;
        return this;
    }

    /* renamed from: l */
    public final E mo48102l(String str) {
        this.f62003y = str;
        return this;
    }

    /* renamed from: m */
    public final E mo48103m(String str) {
        this.f62042H = str;
        return this;
    }

    /* renamed from: n */
    public final E mo48104n(String str) {
        this.f62043I = str;
        return this;
    }

    /* renamed from: o */
    public final E mo48105o(String str) {
        this.f62044J = str;
        return this;
    }

    /* renamed from: p */
    public final E mo48106p(String str) {
        this.f62045K = str;
        return this;
    }

    /* renamed from: q */
    public E mo48046q(String str) {
        this.f62046L = str;
        return this;
    }

    /* renamed from: r */
    public final E mo48107r(String str) {
        this.f62048N = str;
        return this;
    }

    /* renamed from: a */
    public final E mo48097a(C23252v vVar) {
        if (vVar != null) {
            vVar.installToMetrics(this);
        }
        return this;
    }

    public C23241k(String str) {
        super(str);
    }

    /* renamed from: f */
    public E mo47954f(Aweme aweme) {
        if (!(aweme == null || aweme.getAuthor() == null)) {
            this.f62035A = aweme.getAuthor().getRegion();
        }
        mo48071a(aweme);
        mo48073b(aweme);
        mo48028c(aweme);
        return this;
    }
}
