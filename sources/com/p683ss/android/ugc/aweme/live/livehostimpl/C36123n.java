package com.p683ss.android.ugc.aweme.live.livehostimpl;

import com.bytedance.android.live.base.C2952b;
import com.bytedance.android.live.base.p185b.C2953a;
import com.bytedance.android.live.p245d.C4114b;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdkapi.host.C8777a;
import com.bytedance.android.livesdkapi.host.C8792b;
import com.bytedance.android.livesdkapi.host.C8794c;
import com.bytedance.android.livesdkapi.host.C8800d;
import com.bytedance.android.livesdkapi.host.C8801e;
import com.bytedance.android.livesdkapi.host.C8802f;
import com.bytedance.android.livesdkapi.host.C8803g;
import com.bytedance.android.livesdkapi.host.C8804h;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.livesdkapi.host.IHostWallet;
import com.bytedance.android.livesdkapi.p445e.C8734d;
import com.bytedance.android.livesdkapi.service.C8861d;
import com.bytedance.p753k.C12103a;
import com.p683ss.android.ugc.aweme.live.C36093g;

/* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.n */
public final class C36123n implements C8861d {

    /* renamed from: a */
    private IHostAction f92511a = new C36104e();

    /* renamed from: b */
    private IHostContext f92512b = new C36100a();

    /* renamed from: c */
    private C2953a f92513c = new C36118k();

    /* renamed from: d */
    private IHostNetwork f92514d = new C36119l();

    /* renamed from: e */
    private C8801e f92515e = new C36117j();

    /* renamed from: f */
    private IHostPlugin f92516f = new C36122m();

    /* renamed from: g */
    private IHostApp f92517g = new C36105f();

    /* renamed from: h */
    private IHostShare f92518h = new C36124o();

    /* renamed from: i */
    private IHostUser f92519i = new C36128s();

    /* renamed from: j */
    private IHostWallet f92520j = new C36134v();

    /* renamed from: k */
    private C8777a f92521k = new C36109g(this.f92512b.context());

    /* renamed from: l */
    private C8802f f92522l = new C36125p();

    /* renamed from: m */
    private C8804h f92523m = new C36136w();

    /* renamed from: n */
    private C8734d f92524n = ((C36093g) C12103a.m24530b(C36093g.class)).mo74844a();

    /* renamed from: o */
    private C8803g f92525o = new C36133u();

    /* renamed from: p */
    private C8794c f92526p = new C36114i();

    /* renamed from: q */
    private C8792b f92527q = ((C36093g) C12103a.m24530b(C36093g.class)).mo74848d();

    /* renamed from: a */
    public final IHostContext mo13038G() {
        return this.f92512b;
    }

    /* renamed from: b */
    public final C8777a mo13037F() {
        return this.f92521k;
    }

    /* renamed from: c */
    public final IHostApp mo13036E() {
        return this.f92517g;
    }

    /* renamed from: d */
    public final C2953a mo13035D() {
        return this.f92513c;
    }

    /* renamed from: e */
    public final C8801e mo13034C() {
        return this.f92515e;
    }

    /* renamed from: f */
    public final IHostWallet mo13033B() {
        return this.f92520j;
    }

    /* renamed from: g */
    public final IHostShare mo13032A() {
        return this.f92518h;
    }

    /* renamed from: h */
    public final IHostNetwork mo13064z() {
        return this.f92514d;
    }

    /* renamed from: i */
    public final IHostAction mo13063y() {
        return this.f92511a;
    }

    /* renamed from: j */
    public final C8802f mo13062x() {
        return this.f92522l;
    }

    /* renamed from: k */
    public final IHostUser mo13061w() {
        return this.f92519i;
    }

    /* renamed from: l */
    public final C8804h mo13060v() {
        return this.f92523m;
    }

    /* renamed from: m */
    public final C8734d mo13059u() {
        return this.f92524n;
    }

    /* renamed from: n */
    public final C8803g mo13058t() {
        return this.f92525o;
    }

    /* renamed from: o */
    public final C8794c mo13057s() {
        return this.f92526p;
    }

    /* renamed from: p */
    public final C8800d mo13056r() {
        return null;
    }

    /* renamed from: q */
    public final C8792b mo13055q() {
        return this.f92527q;
    }

    public C36123n() {
        C4116c.m10251a(IHostAction.class, (C2952b) C4114b.m10247a(mo13063y(), IHostAction.class));
        C4116c.m10251a(IHostContext.class, (C2952b) C4114b.m10247a(mo13038G(), IHostContext.class));
        C4116c.m10251a(C2953a.class, mo13035D());
        C4116c.m10251a(IHostNetwork.class, mo13064z());
        C4116c.m10251a(C8801e.class, mo13034C());
        C4116c.m10251a(C8794c.class, mo13057s());
        C4116c.m10251a(IHostApp.class, (C2952b) C4114b.m10247a(mo13036E(), IHostApp.class));
        C4116c.m10251a(IHostPlugin.class, (C2952b) C4114b.m10247a(this.f92516f, IHostPlugin.class));
        C4116c.m10251a(C8804h.class, mo13060v());
        C4116c.m10251a(C8734d.class, mo13059u());
        C4116c.m10251a(IHostShare.class, (C2952b) C4114b.m10247a(mo13032A(), IHostShare.class));
        C4116c.m10251a(C8777a.class, mo13037F());
        C4116c.m10251a(C8803g.class, mo13058t());
        C4116c.m10251a(C8802f.class, mo13062x());
    }
}
