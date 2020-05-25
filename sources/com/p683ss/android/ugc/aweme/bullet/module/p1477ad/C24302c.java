package com.p683ss.android.ugc.aweme.bullet.module.p1477ad;

import com.bytedance.ies.bullet.p628b.p643i.C10369b;
import com.bytedance.ies.bullet.p628b.p643i.C10385f;
import com.bytedance.ies.bullet.p628b.p643i.C10389j;
import com.bytedance.ies.bullet.p628b.p643i.C10391l;
import com.bytedance.ies.bullet.p628b.p643i.C10419n;
import com.bytedance.ies.bullet.p628b.p643i.C10421p;
import com.bytedance.ies.bullet.p653ui.common.p657d.C10578a;
import java.util.List;
import p2628d.p2629a.C52575l;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.ad.c */
public final class C24302c extends C10578a {

    /* renamed from: M */
    public final C10369b f64438M;

    /* renamed from: N */
    public final C10389j f64439N;

    /* renamed from: O */
    public final C10389j f64440O;

    /* renamed from: P */
    public final C10389j f64441P;

    /* renamed from: Q */
    public final C10369b f64442Q;

    /* renamed from: R */
    public final C10369b f64443R;

    /* renamed from: S */
    public final C10389j f64444S;

    /* renamed from: T */
    private final C10385f<String> f64445T;

    /* renamed from: U */
    private final C10385f<String> f64446U;

    /* renamed from: V */
    private final C10385f<String> f64447V;

    /* renamed from: W */
    private final C10385f<String> f64448W;

    /* renamed from: X */
    private final C10369b f64449X;

    /* renamed from: b */
    public final C10391l f64450b;

    /* renamed from: d */
    public final C10389j f64451d = new C10389j("ad_system_origin", 0, 2, null);

    /* renamed from: e */
    public final C10385f<String> f64452e;

    /* renamed from: f */
    public final C10385f<String> f64453f;

    /* renamed from: g */
    public final C10385f<String> f64454g;

    /* renamed from: h */
    public final C10385f<String> f64455h;

    /* renamed from: i */
    public final C10385f<String> f64456i;

    /* renamed from: j */
    public final C10385f<String> f64457j;

    /* renamed from: c */
    public final String mo50048c() {
        String str = (String) this.f64445T.mo18457b();
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: d */
    public final String mo50049d() {
        String str = (String) this.f64446U.mo18457b();
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: e */
    public final String mo50050e() {
        String str = (String) this.f64447V.mo18457b();
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: f */
    public final String mo50051f() {
        String str = (String) this.f64448W.mo18457b();
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: b */
    public final String mo50047b() {
        Long l = (Long) this.f64450b.mo18457b();
        if (l != null) {
            String valueOf = String.valueOf(l.longValue());
            if (valueOf != null) {
                return valueOf;
            }
        }
        return "";
    }

    /* renamed from: g */
    public final boolean mo50052g() {
        Boolean bool = (Boolean) this.f64449X.mo18457b();
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: a */
    public final List<C10385f<?>> mo18322a() {
        return C52575l.m112133c(super.mo18322a(), C52575l.m112099b((Object[]) new C10385f[]{this.f64450b, this.f64445T, this.f64451d, this.f64446U, this.f64452e, this.f64453f, this.f64447V, this.f64454g, this.f64455h, this.f64448W, this.f64456i, this.f64457j, this.f64438M, this.f64439N, this.f64440O, this.f64441P, this.f64442Q, this.f64443R, this.f64444S, this.f64449X}));
    }

    public C24302c() {
        C10391l lVar = new C10391l("ad_id", 0, 2, null);
        this.f64450b = lVar;
        C10419n nVar = new C10419n("aweme_group_id", C10421p.m20979f(), null, 4, null);
        this.f64445T = nVar;
        C10419n nVar2 = new C10419n("bundle_download_app_log_extra", C10421p.m20979f(), null, 4, null);
        this.f64446U = nVar2;
        C10419n nVar3 = new C10419n("bundle_download_url", C10421p.m20979f(), null, 4, null);
        this.f64452e = nVar3;
        C10419n nVar4 = new C10419n("aweme_package_name", C10421p.m20979f(), null, 4, null);
        this.f64453f = nVar4;
        C10419n nVar5 = new C10419n("bundle_download_app_name", C10421p.m20979f(), null, 4, null);
        this.f64447V = nVar5;
        C10419n nVar6 = new C10419n("bundle_open_url", C10421p.m20979f(), null, 4, null);
        this.f64454g = nVar6;
        C10419n nVar7 = new C10419n("bundle_web_url", C10421p.m20979f(), null, 4, null);
        this.f64455h = nVar7;
        C10419n nVar8 = new C10419n("bundle_ad_quick_app_url", C10421p.m20979f(), null, 4, null);
        this.f64448W = nVar8;
        C10419n nVar9 = new C10419n("ad_type", C10421p.m20979f(), null, 4, null);
        this.f64456i = nVar9;
        C10419n nVar10 = new C10419n("bundle_web_title", C10421p.m20979f(), null, 4, null);
        this.f64457j = nVar10;
        this.f64438M = new C10369b("show_report", false, 2, null);
        this.f64439N = new C10389j("web_type", 0, 2, null);
        this.f64440O = new C10389j("bundle_download_mode", 0, 2, null);
        this.f64441P = new C10389j("bundle_link_mode", 0, 2, null);
        this.f64442Q = new C10369b("bundle_support_multiple_download", false, 2, null);
        this.f64443R = new C10369b("bundle_disable_download_dialog", true);
        this.f64444S = new C10389j("bundle_webview_background", -2);
        this.f64449X = new C10369b("bundle_nav_bar_status_padding", false, 2, null);
    }
}
