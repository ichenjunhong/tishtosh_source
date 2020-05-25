package com.p683ss.android.ugc.asve.sandbox;

import com.bef.effectsdk.C2592c;
import com.p683ss.android.ugc.asve.C20370d;
import com.p683ss.android.ugc.asve.C20377e;
import com.p683ss.android.ugc.asve.context.C20358e;
import com.p683ss.android.ugc.asve.context.C20358e.C20360b;
import com.p683ss.android.ugc.asve.context.PreviewSize;
import com.p683ss.android.ugc.asve.p1238b.C20328i;
import com.p683ss.android.ugc.asve.p1238b.C20328i.C20329a;
import com.p683ss.android.ugc.asve.recorder.C20483d;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20584a.C20590f;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20584a.C20591g;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20584a.C20592h;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20584a.C20593i;
import com.p683ss.android.ugc.asve.sandbox.wrap.C20819b;
import com.p683ss.android.ugc.asve.sandbox.wrap.C20822c;
import com.p683ss.android.ugc.asve.sandbox.wrap.C20828e;
import com.p683ss.android.ugc.asve.sandbox.wrap.SandBoxASContextWrapper;
import com.p683ss.android.vesdk.C50702h;
import com.p683ss.android.vesdk.VEListener.C50538b;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.sandbox.a */
public final class C20583a implements C20358e {

    /* renamed from: b */
    private final boolean f56404b;

    /* renamed from: c */
    private final boolean f56405c;

    /* renamed from: d */
    private final C20328i f56406d;

    /* renamed from: e */
    private final boolean f56407e;

    /* renamed from: f */
    private final File f56408f;

    /* renamed from: g */
    private final int f56409g;

    /* renamed from: h */
    private final int f56410h;

    /* renamed from: i */
    private final boolean f56411i;

    /* renamed from: j */
    private final File f56412j;

    /* renamed from: k */
    private final boolean f56413k;

    /* renamed from: l */
    private final boolean f56414l;

    /* renamed from: m */
    private final C20370d f56415m;

    /* renamed from: n */
    private final C20483d f56416n;

    /* renamed from: o */
    private final C50538b f56417o;

    /* renamed from: p */
    private final C20377e f56418p;

    /* renamed from: q */
    private final int f56419q;

    /* renamed from: r */
    private final String f56420r;

    /* renamed from: s */
    private final PreviewSize f56421s;

    /* renamed from: t */
    private final boolean f56422t;

    /* renamed from: u */
    private final boolean f56423u;

    /* renamed from: v */
    private final int f56424v;

    /* renamed from: w */
    private final boolean f56425w;

    /* renamed from: x */
    private final boolean f56426x;

    /* renamed from: y */
    private final C50702h f56427y;

    /* renamed from: A */
    public final boolean mo43144A() {
        return false;
    }

    /* renamed from: B */
    public final boolean mo43145B() {
        return this.f56426x;
    }

    /* renamed from: C */
    public final Map<String, Object> mo43146C() {
        return null;
    }

    /* renamed from: b */
    public final C20370d mo43148b() {
        return this.f56415m;
    }

    /* renamed from: c */
    public final C20377e mo43149c() {
        return this.f56418p;
    }

    /* renamed from: d */
    public final C20483d mo43150d() {
        return this.f56416n;
    }

    /* renamed from: e */
    public final C50538b mo43151e() {
        return this.f56417o;
    }

    /* renamed from: f */
    public final C2592c mo43152f() {
        return null;
    }

    /* renamed from: h */
    public final boolean mo43154h() {
        return this.f56405c;
    }

    /* renamed from: i */
    public final C20328i mo43155i() {
        return this.f56406d;
    }

    /* renamed from: j */
    public final boolean mo43156j() {
        return this.f56422t;
    }

    /* renamed from: k */
    public final boolean mo43157k() {
        return this.f56407e;
    }

    /* renamed from: l */
    public final File mo43158l() {
        return this.f56408f;
    }

    /* renamed from: m */
    public final int mo43159m() {
        return this.f56409g;
    }

    /* renamed from: n */
    public final boolean mo43160n() {
        return this.f56423u;
    }

    /* renamed from: o */
    public final int mo43161o() {
        return this.f56410h;
    }

    /* renamed from: p */
    public final boolean mo43162p() {
        return this.f56411i;
    }

    /* renamed from: q */
    public final File mo43163q() {
        return this.f56412j;
    }

    /* renamed from: r */
    public final boolean mo43164r() {
        return this.f56413k;
    }

    /* renamed from: s */
    public final boolean mo43165s() {
        return this.f56414l;
    }

    /* renamed from: t */
    public final int mo43166t() {
        return this.f56424v;
    }

    /* renamed from: u */
    public final boolean mo43167u() {
        return this.f56425w;
    }

    /* renamed from: v */
    public final int mo43168v() {
        return this.f56419q;
    }

    /* renamed from: w */
    public final boolean mo43169w() {
        return this.f56404b;
    }

    /* renamed from: x */
    public final C50702h mo43170x() {
        return this.f56427y;
    }

    /* renamed from: y */
    public final PreviewSize mo43171y() {
        return this.f56421s;
    }

    /* renamed from: z */
    public final String mo43172z() {
        return this.f56420r;
    }

    /* renamed from: g */
    public final String mo43153g() {
        return C20360b.m50449a(this);
    }

    /* renamed from: a */
    public final ExecutorService mo43147a() {
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        C52711k.m112236a((Object) newCachedThreadPool, "Executors.newCachedThreadPool()");
        return newCachedThreadPool;
    }

    public C20583a(SandBoxASContextWrapper sandBoxASContextWrapper, C20822c cVar, C20828e eVar, C20819b bVar, C50702h hVar, C20779f fVar) {
        C20483d dVar;
        C50538b bVar2;
        C20377e eVar2;
        C52711k.m112240b(sandBoxASContextWrapper, "sandBoxContextWrapper");
        C52711k.m112240b(cVar, "iasLogger");
        C52711k.m112240b(hVar, "veAppField");
        this.f56427y = hVar;
        this.f56405c = sandBoxASContextWrapper.f56707a;
        this.f56406d = C20329a.m50104a(sandBoxASContextWrapper.f56708b);
        this.f56407e = sandBoxASContextWrapper.f56709c;
        this.f56408f = new File(sandBoxASContextWrapper.f56710d);
        this.f56409g = sandBoxASContextWrapper.f56711e;
        this.f56410h = sandBoxASContextWrapper.f56712f;
        this.f56411i = sandBoxASContextWrapper.f56713g;
        this.f56412j = new File(sandBoxASContextWrapper.f56714h);
        this.f56413k = sandBoxASContextWrapper.f56715i;
        this.f56414l = sandBoxASContextWrapper.f56716j;
        C52711k.m112240b(cVar, "$this$stub");
        this.f56415m = new C20590f(cVar);
        PreviewSize previewSize = null;
        if (eVar != null) {
            C52711k.m112240b(eVar, "$this$stub");
            dVar = new C20591g(eVar);
        } else {
            dVar = null;
        }
        this.f56416n = dVar;
        if (bVar != null) {
            C52711k.m112240b(bVar, "$this$stub");
            bVar2 = new C20592h(bVar);
        } else {
            bVar2 = null;
        }
        this.f56417o = bVar2;
        if (fVar != null) {
            C52711k.m112240b(fVar, "$this$stub");
            eVar2 = new C20593i(fVar);
        } else {
            eVar2 = null;
        }
        this.f56418p = eVar2;
        this.f56419q = sandBoxASContextWrapper.f56726t;
        String str = sandBoxASContextWrapper.f56723q;
        C52711k.m112236a((Object) str, "sandBoxContextWrapper.veRuntimeConfig");
        this.f56420r = str;
        if (sandBoxASContextWrapper.f56724r * sandBoxASContextWrapper.f56725s != 0) {
            previewSize = new PreviewSize(sandBoxASContextWrapper.f56724r, sandBoxASContextWrapper.f56725s);
        }
        this.f56421s = previewSize;
        this.f56422t = sandBoxASContextWrapper.f56727u;
        this.f56423u = sandBoxASContextWrapper.f56728v;
        this.f56424v = sandBoxASContextWrapper.f56717k;
        this.f56425w = sandBoxASContextWrapper.f56718l;
        this.f56426x = sandBoxASContextWrapper.f56729w;
    }
}
