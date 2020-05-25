package com.bytedance.ies.bullet.p653ui.common.p657d;

import com.bytedance.ies.bullet.p628b.p633e.C10278b;
import com.bytedance.ies.bullet.p628b.p643i.C10369b;
import com.bytedance.ies.bullet.p628b.p643i.C10385f;
import com.bytedance.ies.bullet.p628b.p643i.C10389j;
import com.bytedance.ies.bullet.p628b.p643i.C10419n;
import com.bytedance.ies.bullet.p628b.p643i.C10421p;
import java.util.List;
import p2628d.p2629a.C52575l;

/* renamed from: com.bytedance.ies.bullet.ui.common.d.a */
public class C10578a extends C10278b {

    /* renamed from: A */
    public final C10385f<Boolean> f28094A;

    /* renamed from: B */
    public final C10385f<Boolean> f28095B;

    /* renamed from: C */
    public final C10385f<String> f28096C;

    /* renamed from: D */
    public final C10369b f28097D;

    /* renamed from: E */
    public final C10369b f28098E;

    /* renamed from: F */
    public final C10389j f28099F;

    /* renamed from: G */
    public final C10369b f28100G;

    /* renamed from: H */
    public final C10385f<String> f28101H;

    /* renamed from: I */
    public final C10369b f28102I;

    /* renamed from: J */
    public final C10385f<Boolean> f28103J;

    /* renamed from: K */
    public final C10385f<String> f28104K;

    /* renamed from: L */
    public final C10385f<String> f28105L;

    /* renamed from: k */
    public final C10385f<Boolean> f28106k = new C10369b("no_hw", false, 2, null);

    /* renamed from: l */
    public final C10385f<Boolean> f28107l = new C10369b("status_font_dark", false, 2, null);

    /* renamed from: m */
    public final C10385f<C10584e> f28108m = new C10419n("loading_bgcolor", C10585f.m21365a(), new C10584e(-2));

    /* renamed from: n */
    public final C10385f<Boolean> f28109n = new C10369b("need_bottom_out", false, 2, null);

    /* renamed from: o */
    public final C10385f<Boolean> f28110o = new C10369b("should_full_screen", false, 2, null);

    /* renamed from: p */
    public final C10385f<Boolean> f28111p = new C10369b("hide_loading", false, 2, null);

    /* renamed from: q */
    public final C10385f<Boolean> f28112q = new C10369b("hide_status_bar", false, 2, null);

    /* renamed from: r */
    public final C10385f<C10584e> f28113r = new C10419n("status_bar_color", C10585f.m21365a(), new C10584e(-2));

    /* renamed from: s */
    public final C10385f<Boolean> f28114s = new C10369b("hide_nav_bar", false, 2, null);

    /* renamed from: t */
    public final C10385f<Boolean> f28115t = new C10369b("status_bar_padding", false, 2, null);

    /* renamed from: u */
    public final C10385f<Boolean> f28116u = new C10369b("show_debug_title", false, 2, null);

    /* renamed from: v */
    public final C10385f<C10584e> f28117v;

    /* renamed from: w */
    public final C10385f<C10584e> f28118w;

    /* renamed from: x */
    public final C10385f<String> f28119x;

    /* renamed from: y */
    public final C10385f<C10584e> f28120y;

    /* renamed from: z */
    public final C10385f<C10584e> f28121z;

    /* renamed from: a */
    public List<C10385f<?>> mo18322a() {
        return C52575l.m112133c(super.mo18322a(), C52575l.m112099b((Object[]) new C10385f[]{this.f28106k, this.f28107l, this.f28108m, this.f28109n, this.f28110o, this.f28111p, this.f28112q, this.f28113r, this.f28114s, this.f28115t, this.f28116u, this.f28117v, this.f28118w, this.f28119x, this.f28120y, this.f28121z, this.f28094A, this.f28095B, this.f28096C, this.f28097D, this.f28099F, this.f28098E, this.f28100G, this.f28101H, this.f28102I, this.f28103J, this.f28104K, this.f28105L}));
    }

    public C10578a() {
        C10419n nVar = new C10419n("bg_color", C10585f.m21365a(), null, 4, null);
        this.f28117v = nVar;
        C10419n nVar2 = new C10419n("container_bgcolor", C10585f.m21365a(), null, 4, null);
        this.f28118w = nVar2;
        C10419n nVar3 = new C10419n("title", C10421p.m20979f(), null, 4, null);
        this.f28119x = nVar3;
        this.f28120y = new C10419n("nav_bar_color", C10585f.m21365a(), new C10584e(-2));
        this.f28121z = new C10419n("title_color", C10585f.m21365a(), new C10584e(-2));
        this.f28094A = new C10369b("show_closeall", false, 2, null);
        this.f28095B = new C10369b("is_adjust_pan", false, 2, null);
        C10419n nVar4 = new C10419n("disable_pop_gesture", C10421p.m20979f(), null, 4, null);
        this.f28096C = nVar4;
        this.f28097D = new C10369b("hide_more", true);
        this.f28098E = new C10369b("show_more_button", false, 2, null);
        this.f28099F = new C10389j("nav_btn_type", 0, 2, null);
        this.f28100G = new C10369b("use_ordinary_web", true);
        C10419n nVar5 = new C10419n("topbar_type", C10421p.m20979f(), null, 4, null);
        this.f28101H = nVar5;
        this.f28102I = new C10369b("show_load_dialog", true);
        this.f28103J = new C10369b("_need_container_id", false, 2, null);
        C10419n nVar6 = new C10419n("report_bid", C10421p.m20979f(), null, 4, null);
        this.f28104K = nVar6;
        C10419n nVar7 = new C10419n("report_pid", C10421p.m20979f(), null, 4, null);
        this.f28105L = nVar7;
    }
}
