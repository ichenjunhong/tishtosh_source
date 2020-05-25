package com.p683ss.android.ugc.aweme.bullet.module.p1477ad;

import com.bytedance.ies.bullet.p628b.p643i.C10369b;
import com.bytedance.ies.bullet.p628b.p643i.C10385f;
import com.bytedance.ies.bullet.p628b.p643i.C10389j;
import com.bytedance.ies.bullet.p628b.p643i.C10391l;
import com.bytedance.ies.bullet.p628b.p643i.C10419n;
import com.bytedance.ies.bullet.p628b.p643i.C10421p;
import com.p683ss.android.ugc.aweme.bullet.module.base.C24336d;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26384ak;
import java.util.List;
import org.json.JSONObject;
import p2628d.p2629a.C52575l;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.ad.h */
public final class C24310h extends C24336d {

    /* renamed from: M */
    public final C10369b f64476M = new C10369b("enable_web_report", false, 2, null);

    /* renamed from: N */
    public final C10369b f64477N = new C10369b("bundle_show_download_status_bar", true);

    /* renamed from: O */
    public final C10385f<String> f64478O;

    /* renamed from: P */
    public final C10385f<String> f64479P;

    /* renamed from: Q */
    public final C10385f<String> f64480Q;

    /* renamed from: R */
    public final C10385f<String> f64481R;

    /* renamed from: S */
    public final C10385f<String> f64482S;

    /* renamed from: T */
    final C10385f<String> f64483T;

    /* renamed from: U */
    public final C10369b f64484U;

    /* renamed from: V */
    public final C10385f<String> f64485V;

    /* renamed from: W */
    public final C10385f<String> f64486W;

    /* renamed from: X */
    public final C10385f<String> f64487X;

    /* renamed from: Y */
    public final C10385f<String> f64488Y;

    /* renamed from: Z */
    public final C10389j f64489Z;

    /* renamed from: aa */
    public final C10389j f64490aa;

    /* renamed from: ab */
    public final C10389j f64491ab;

    /* renamed from: ac */
    public final C10369b f64492ac;

    /* renamed from: ad */
    public final C10385f<String> f64493ad;

    /* renamed from: ae */
    public final C10385f<String> f64494ae;

    /* renamed from: af */
    public final C10385f<String> f64495af;

    /* renamed from: ag */
    public final C10391l f64496ag;

    /* renamed from: ah */
    final C10389j f64497ah;

    /* renamed from: ai */
    public boolean f64498ai;

    /* renamed from: aq */
    private final C10385f<String> f64499aq;

    /* renamed from: ar */
    private final C10369b f64500ar = new C10369b("show_report", false, 2, null);

    /* renamed from: as */
    private final C10385f<String> f64501as;

    /* renamed from: e */
    public final C10391l f64502e;

    /* renamed from: f */
    public final C10389j f64503f = new C10389j("ad_system_origin", 0, 2, null);

    /* renamed from: g */
    public final C10389j f64504g = new C10389j("web_type", 0, 2, null);

    /* renamed from: h */
    public final C10369b f64505h = new C10369b("bundle_is_from_app_ad", false, 2, null);

    /* renamed from: i */
    public final C10369b f64506i = new C10369b("bundle_forbidden_jump", false, 2, null);

    /* renamed from: j */
    public final C10369b f64507j = new C10369b("bundle_is_from_comment_app_ad", false, 2, null);

    /* renamed from: b */
    public final String mo50064b() {
        String str = (String) this.f64501as.mo18457b();
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: c */
    public final String mo50065c() {
        String str = (String) this.f64482S.mo18457b();
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: a */
    public final List<C10385f<?>> mo18322a() {
        return C52575l.m112133c(super.mo18322a(), C52575l.m112099b((Object[]) new C10385f[]{this.f64502e, this.f64503f, this.f64504g, this.f64499aq, this.f64505h, this.f64476M, this.f64506i, this.f64477N, this.f64478O, this.f64479P, this.f64480Q, this.f64481R, this.f64482S, this.f64483T, this.f64501as, this.f64484U, this.f64485V, this.f64486W, this.f64487X, this.f64507j, this.f64488Y, this.f64489Z, this.f64490aa, this.f64491ab, this.f64492ac, this.f64493ad, this.f64494ae, this.f64495af, this.f64496ag, this.f64500ar, this.f64497ah}));
    }

    /* renamed from: d */
    public final JSONObject mo50066d() {
        long j;
        int i;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cid", this.f64502e.mo18457b());
            jSONObject.put("ad_type", this.f64503f.mo18457b());
            jSONObject.put("log_extra", this.f64482S.mo18457b());
            jSONObject.put("download_url", this.f64478O.mo18457b());
            jSONObject.put("package_name", this.f64480Q.mo18457b());
            jSONObject.put("app_name", this.f64479P.mo18457b());
            String str = "code";
            Long l = (Long) this.f64502e.mo18457b();
            long j2 = 0;
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            if (j == 0) {
                i = 0;
            } else {
                i = 1;
            }
            jSONObject.put(str, i);
            C26384ak akVar = C26384ak.f69607d;
            Long l2 = (Long) this.f64502e.mo18457b();
            if (l2 != null) {
                j2 = l2.longValue();
            }
            akVar.mo54105a(j2, (String) this.f64482S.mo18457b());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public C24310h() {
        C10391l lVar = new C10391l("ad_id", 0, 2, null);
        this.f64502e = lVar;
        C10419n nVar = new C10419n("ad_type", C10421p.m20979f(), null, 4, null);
        this.f64499aq = nVar;
        C10419n nVar2 = new C10419n("bundle_download_url", C10421p.m20979f(), null, 4, null);
        this.f64478O = nVar2;
        C10419n nVar3 = new C10419n("bundle_download_app_name", C10421p.m20979f(), null, 4, null);
        this.f64479P = nVar3;
        C10419n nVar4 = new C10419n("aweme_package_name", C10421p.m20979f(), null, 4, null);
        this.f64480Q = nVar4;
        C10419n nVar5 = new C10419n("bundle_download_app_extra", C10421p.m20979f(), null, 4, null);
        this.f64481R = nVar5;
        C10419n nVar6 = new C10419n("bundle_download_app_log_extra", C10421p.m20979f(), null, 4, null);
        this.f64482S = nVar6;
        C10419n nVar7 = new C10419n("gd_label", C10421p.m20979f(), null, 4, null);
        this.f64483T = nVar7;
        C10419n nVar8 = new C10419n("gd_ext_json", C10421p.m20979f(), null, 4, null);
        this.f64501as = nVar8;
        this.f64484U = new C10369b("bundle_disable_download_dialog", true);
        C10419n nVar9 = new C10419n("aweme_creative_id", C10421p.m20979f(), null, 4, null);
        this.f64485V = nVar9;
        C10419n nVar10 = new C10419n("ad_js_url", C10421p.m20979f(), null, 4, null);
        this.f64486W = nVar10;
        C10419n nVar11 = new C10419n("bundle_ad_quick_app_url", C10421p.m20979f(), null, 4, null);
        this.f64487X = nVar11;
        C10419n nVar12 = new C10419n("quick_shop_enter_from", C10421p.m20979f(), null, 4, null);
        this.f64488Y = nVar12;
        this.f64489Z = new C10389j("bundle_app_ad_from", 0, 2, null);
        this.f64490aa = new C10389j("bundle_download_mode", 0, 2, null);
        this.f64491ab = new C10389j("bundle_link_mode", 0, 2, null);
        this.f64492ac = new C10369b("bundle_support_multiple_download", false, 2, null);
        C10419n nVar13 = new C10419n("aweme_json_extra", C10421p.m20979f(), null, 4, null);
        this.f64493ad = nVar13;
        C10419n nVar14 = new C10419n("bundle_open_url", C10421p.m20979f(), null, 4, null);
        this.f64494ae = nVar14;
        C10419n nVar15 = new C10419n("bundle_web_url", C10421p.m20979f(), null, 4, null);
        this.f64495af = nVar15;
        C10391l lVar2 = new C10391l("user_click_time", 0, 2, null);
        this.f64496ag = lVar2;
        this.f64497ah = new C10389j("bundle_webview_background", -2);
    }
}
