package com.google.android.gms.ads.internal;

import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.overlay.C15004a;
import com.google.android.gms.ads.internal.overlay.C15015l;
import com.google.android.gms.ads.internal.overlay.C15024u;
import com.google.android.gms.ads.internal.overlay.C15025v;
import com.google.android.gms.common.util.C15514e;
import com.google.android.gms.common.util.C15517h;
import com.google.android.gms.internal.ads.C15798cc;
import com.google.android.gms.internal.ads.C16029kq;
import com.google.android.gms.internal.ads.C16048li;
import com.google.android.gms.internal.ads.C16096nc;
import com.google.android.gms.internal.ads.C16127og;
import com.google.android.gms.internal.ads.C16219rr;
import com.google.android.gms.internal.ads.C16243so;
import com.google.android.gms.internal.ads.C16299uq;
import com.google.android.gms.internal.ads.C16300ur;
import com.google.android.gms.internal.ads.C16368xe;
import com.google.android.gms.internal.ads.aad;
import com.google.android.gms.internal.ads.abh;
import com.google.android.gms.internal.ads.acd;
import com.google.android.gms.internal.ads.acm;
import com.google.android.gms.internal.ads.acp;
import com.google.android.gms.internal.ads.acq;
import com.google.android.gms.internal.ads.acr;
import com.google.android.gms.internal.ads.acs;
import com.google.android.gms.internal.ads.act;
import com.google.android.gms.internal.ads.acu;
import com.google.android.gms.internal.ads.acv;
import com.google.android.gms.internal.ads.acw;
import com.google.android.gms.internal.ads.acy;
import com.google.android.gms.internal.ads.adi;
import com.google.android.gms.internal.ads.aee;
import com.google.android.gms.internal.ads.aef;
import com.google.android.gms.internal.ads.aeo;
import com.google.android.gms.internal.ads.agm;
import com.google.android.gms.internal.ads.agu;
import com.google.android.gms.internal.ads.aks;
import com.google.android.gms.internal.ads.amg;
import com.google.android.gms.internal.ads.bwk;
import com.google.android.gms.internal.ads.bxg;
import com.google.android.gms.internal.ads.bxh;
import com.google.android.gms.internal.ads.byb;

@C16299uq
/* renamed from: com.google.android.gms.ads.internal.ax */
public final class C14963ax {

    /* renamed from: a */
    private static C14963ax f38574a = new C14963ax();

    /* renamed from: A */
    private final aef f38575A;

    /* renamed from: B */
    private final C16219rr f38576B;

    /* renamed from: C */
    private final byb f38577C;

    /* renamed from: D */
    private final aad f38578D;

    /* renamed from: E */
    private final aeo f38579E;

    /* renamed from: F */
    private final aks f38580F;

    /* renamed from: G */
    private final agu f38581G;

    /* renamed from: b */
    private final C15004a f38582b;

    /* renamed from: c */
    private final C16300ur f38583c;

    /* renamed from: d */
    private final C15015l f38584d;

    /* renamed from: e */
    private final C16243so f38585e;

    /* renamed from: f */
    private final acd f38586f;

    /* renamed from: g */
    private final amg f38587g;

    /* renamed from: h */
    private final acm f38588h;

    /* renamed from: i */
    private final bwk f38589i;

    /* renamed from: j */
    private final abh f38590j;

    /* renamed from: k */
    private final acy f38591k;

    /* renamed from: l */
    private final bxg f38592l;

    /* renamed from: m */
    private final bxh f38593m;

    /* renamed from: n */
    private final C15514e f38594n;

    /* renamed from: o */
    private final C14994f f38595o;

    /* renamed from: p */
    private final C15798cc f38596p;

    /* renamed from: q */
    private final adi f38597q;

    /* renamed from: r */
    private final C16368xe f38598r;

    /* renamed from: s */
    private final C16048li f38599s;

    /* renamed from: t */
    private final agm f38600t;

    /* renamed from: u */
    private final C16029kq f38601u;

    /* renamed from: v */
    private final C16096nc f38602v;

    /* renamed from: w */
    private final aee f38603w;

    /* renamed from: x */
    private final C15024u f38604x;

    /* renamed from: y */
    private final C15025v f38605y;

    /* renamed from: z */
    private final C16127og f38606z;

    protected C14963ax() {
        acm acm;
        C15004a aVar = new C15004a();
        C16300ur urVar = new C16300ur();
        C15015l lVar = new C15015l();
        C16243so soVar = new C16243so();
        acd acd = new acd();
        amg amg = new amg();
        int i = VERSION.SDK_INT;
        if (i >= 28) {
            acm = new acw();
        } else if (i >= 26) {
            acm = new acv();
        } else if (i >= 24) {
            acm = new acu();
        } else if (i >= 21) {
            acm = new act();
        } else if (i >= 19) {
            acm = new acs();
        } else if (i >= 18) {
            acm = new acq();
        } else if (i >= 17) {
            acm = new acp();
        } else if (i >= 16) {
            acm = new acr();
        } else {
            acm = new acm();
        }
        acm acm2 = acm;
        bwk bwk = r0;
        bwk bwk2 = new bwk();
        abh abh = r0;
        abh abh2 = new abh();
        acy acy = r0;
        acy acy2 = new acy();
        bxg bxg = r0;
        bxg bxg2 = new bxg();
        bxh bxh = r0;
        bxh bxh2 = new bxh();
        C15514e d = C15517h.m32280d();
        C14994f fVar = r0;
        C14994f fVar2 = new C14994f();
        C15798cc ccVar = r0;
        C15798cc ccVar2 = new C15798cc();
        adi adi = r0;
        adi adi2 = new adi();
        C16368xe xeVar = r0;
        C16368xe xeVar2 = new C16368xe();
        C16048li liVar = r0;
        C16048li liVar2 = new C16048li();
        agm agm = r0;
        agm agm2 = new agm();
        C16096nc ncVar = r0;
        C16096nc ncVar2 = new C16096nc();
        aee aee = r0;
        aee aee2 = new aee();
        C15024u uVar = r0;
        C15024u uVar2 = new C15024u();
        C15025v vVar = r0;
        C15025v vVar2 = new C15025v();
        C16127og ogVar = r0;
        C16127og ogVar2 = new C16127og();
        aef aef = r0;
        aef aef2 = new aef();
        C16219rr rrVar = r0;
        C16219rr rrVar2 = new C16219rr();
        byb byb = r0;
        byb byb2 = new byb();
        aad aad = r0;
        aad aad2 = new aad();
        aeo aeo = r0;
        aeo aeo2 = new aeo();
        aks aks = r0;
        aks aks2 = new aks();
        agu agu = r0;
        agu agu2 = new agu();
        this(aVar, urVar, lVar, soVar, acd, amg, acm2, bwk, abh, acy, bxg, bxh, d, fVar, ccVar, adi, xeVar, liVar, agm, ncVar, aee, uVar, vVar, ogVar, aef, rrVar, byb, aad, aeo, aks, agu);
    }

    private C14963ax(C15004a aVar, C16300ur urVar, C15015l lVar, C16243so soVar, acd acd, amg amg, acm acm, bwk bwk, abh abh, acy acy, bxg bxg, bxh bxh, C15514e eVar, C14994f fVar, C15798cc ccVar, adi adi, C16368xe xeVar, C16048li liVar, agm agm, C16096nc ncVar, aee aee, C15024u uVar, C15025v vVar, C16127og ogVar, aef aef, C16219rr rrVar, byb byb, aad aad, aeo aeo, aks aks, agu agu) {
        this.f38582b = aVar;
        this.f38583c = urVar;
        this.f38584d = lVar;
        this.f38585e = soVar;
        this.f38586f = acd;
        this.f38587g = amg;
        this.f38588h = acm;
        this.f38589i = bwk;
        this.f38590j = abh;
        this.f38591k = acy;
        this.f38592l = bxg;
        this.f38593m = bxh;
        this.f38594n = eVar;
        this.f38595o = fVar;
        this.f38596p = ccVar;
        this.f38597q = adi;
        this.f38598r = xeVar;
        this.f38599s = liVar;
        this.f38600t = agm;
        this.f38601u = new C16029kq();
        this.f38602v = ncVar;
        this.f38603w = aee;
        this.f38604x = uVar;
        this.f38605y = vVar;
        this.f38606z = ogVar;
        this.f38575A = aef;
        this.f38576B = rrVar;
        this.f38577C = byb;
        this.f38578D = aad;
        this.f38579E = aeo;
        this.f38580F = aks;
        this.f38581G = agu;
    }

    /* renamed from: a */
    public static acd m30831a() {
        return f38574a.f38586f;
    }

    /* renamed from: b */
    public static acm m30832b() {
        return f38574a.f38588h;
    }

    /* renamed from: c */
    public static bwk m30833c() {
        return f38574a.f38589i;
    }

    /* renamed from: d */
    public static abh m30834d() {
        return f38574a.f38590j;
    }

    /* renamed from: e */
    public static acy m30835e() {
        return f38574a.f38591k;
    }

    /* renamed from: f */
    public static bxh m30836f() {
        return f38574a.f38593m;
    }

    /* renamed from: g */
    public static C15514e m30837g() {
        return f38574a.f38594n;
    }

    /* renamed from: h */
    public static C14994f m30838h() {
        return f38574a.f38595o;
    }

    /* renamed from: i */
    public static adi m30839i() {
        return f38574a.f38597q;
    }

    /* renamed from: j */
    public static C16368xe m30840j() {
        return f38574a.f38598r;
    }

    /* renamed from: k */
    public static C16048li m30841k() {
        return f38574a.f38599s;
    }

    /* renamed from: l */
    public static C16029kq m30842l() {
        return f38574a.f38601u;
    }

    /* renamed from: m */
    public static C16096nc m30843m() {
        return f38574a.f38602v;
    }

    /* renamed from: n */
    public static aee m30844n() {
        return f38574a.f38603w;
    }

    /* renamed from: o */
    public static C16219rr m30845o() {
        return f38574a.f38576B;
    }

    /* renamed from: p */
    public static aef m30846p() {
        return f38574a.f38575A;
    }

    /* renamed from: q */
    public static aeo m30847q() {
        return f38574a.f38579E;
    }

    /* renamed from: r */
    public static aks m30848r() {
        return f38574a.f38580F;
    }

    /* renamed from: s */
    public static aad m30849s() {
        return f38574a.f38578D;
    }
}
