package com.p683ss.android.ugc.aweme.bullet.module.base;

import com.bytedance.ies.bullet.kit.web.p652e.C10522c;
import com.bytedance.ies.bullet.p628b.p643i.C10369b;
import com.bytedance.ies.bullet.p628b.p643i.C10385f;
import com.bytedance.ies.bullet.p628b.p643i.C10389j;
import com.bytedance.ies.bullet.p628b.p643i.C10419n;
import com.bytedance.ies.bullet.p628b.p643i.C10421p;
import java.util.List;
import p2628d.p2629a.C52575l;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.base.d */
public class C24336d extends C10522c {

    /* renamed from: M */
    private final C10389j f64604M = new C10389j("preload_web_status", 0, 2, null);

    /* renamed from: N */
    private final C10385f<String> f64605N;

    /* renamed from: O */
    private final C10369b f64606O;

    /* renamed from: P */
    private final C10369b f64607P;

    /* renamed from: Q */
    private final C10369b f64608Q;

    /* renamed from: R */
    private final C10369b f64609R;

    /* renamed from: S */
    private final C10389j f64610S;

    /* renamed from: aj */
    final C10369b f64611aj;

    /* renamed from: ak */
    final C10369b f64612ak;

    /* renamed from: al */
    final C10369b f64613al;

    /* renamed from: am */
    public final C10369b f64614am;

    /* renamed from: an */
    final C10369b f64615an;

    /* renamed from: ao */
    public final C10385f<String> f64616ao;

    /* renamed from: ap */
    final C10369b f64617ap;

    /* renamed from: e */
    private final C10385f<String> f64618e;

    /* renamed from: f */
    private final C10385f<String> f64619f;

    /* renamed from: g */
    private final C10385f<String> f64620g;

    /* renamed from: h */
    private final C10385f<String> f64621h;

    /* renamed from: i */
    private final C10385f<String> f64622i;

    /* renamed from: j */
    private final C10385f<String> f64623j;

    /* renamed from: e */
    public final String mo50124e() {
        String str = (String) this.f64620g.mo18457b();
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: f */
    public final String mo50125f() {
        String str = (String) this.f64622i.mo18457b();
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: g */
    public final String mo50126g() {
        String str = (String) this.f64621h.mo18457b();
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: h */
    public final String mo50127h() {
        String str = (String) this.f64623j.mo18457b();
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: k */
    public final String mo50130k() {
        String str = (String) this.f64618e.mo18457b();
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: m */
    public final String mo50132m() {
        String str = (String) this.f64619f.mo18457b();
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: i */
    public final int mo50128i() {
        Integer num = (Integer) this.f64604M.mo18457b();
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: j */
    public final int mo50129j() {
        Integer num = (Integer) this.f64610S.mo18457b();
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: l */
    public final boolean mo50131l() {
        Boolean bool = (Boolean) this.f64609R.mo18457b();
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public C24336d() {
        C10419n nVar = new C10419n("bundle_origin_url", C10421p.m20979f(), null, 4, null);
        this.f64618e = nVar;
        C10419n nVar2 = new C10419n("owner_id", C10421p.m20979f(), null, 4, null);
        this.f64619f = nVar2;
        C10419n nVar3 = new C10419n("aweme_id", C10421p.m20979f(), null, 4, null);
        this.f64620g = nVar3;
        C10419n nVar4 = new C10419n("group_id", C10421p.m20979f(), null, 4, null);
        this.f64621h = nVar4;
        C10419n nVar5 = new C10419n("enter_from", C10421p.m20979f(), null, 4, null);
        this.f64622i = nVar5;
        C10419n nVar6 = new C10419n("preload_channel_name", C10421p.m20979f(), null, 4, null);
        this.f64623j = nVar6;
        C10419n nVar7 = new C10419n("add_common", C10421p.m20979f(), null, 4, null);
        this.f64605N = nVar7;
        this.f64611aj = new C10369b("show_not_official_content_warning", false, 2, null);
        this.f64606O = new C10369b("control_request_url", false, 2, null);
        this.f64612ak = new C10369b("from_notification", false, 2, null);
        this.f64613al = new C10369b("bundle_auto_play_audio", false, 2, null);
        this.f64607P = new C10369b("safeTemplate", false, 2, null);
        this.f64608Q = new C10369b("copy_link_action", false, 2, null);
        this.f64609R = new C10369b("bundle_nav_bar_status_padding", false, 2, null);
        this.f64610S = new C10389j("preload_is_web_url", 0, 2, null);
        this.f64614am = new C10369b("bundle_enable_open_browser_to_download_apk", false, 2, null);
        this.f64615an = new C10369b("use_webview_title", false, 2, null);
        C10419n nVar8 = new C10419n("bundle_web_title", C10421p.m20979f(), null, 4, null);
        this.f64616ao = nVar8;
        this.f64617ap = new C10369b("hide_system_video_poster", false, 2, null);
    }

    /* renamed from: a */
    public List<C10385f<?>> mo18322a() {
        return C52575l.m112133c(super.mo18322a(), C52575l.m112099b((Object[]) new C10385f[]{this.f64618e, this.f64619f, this.f64620g, this.f64621h, this.f64623j, this.f64604M, this.f64622i, this.f64606O, this.f64612ak, this.f64613al, this.f64607P, this.f64605N, this.f64611aj, this.f64608Q, this.f64609R, this.f64610S, this.f64615an, this.f64616ao, this.f64614am, this.f64617ap}));
    }
}
