package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.C15333e;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.p1037d.C15377d;
import com.google.android.gms.common.util.C15514e;
import com.google.android.gms.common.util.C15517h;
import com.google.android.gms.internal.measurement.C16663er;
import com.google.android.gms.internal.measurement.C16670ey;
import com.google.android.gms.internal.measurement.C16675fc;
import com.google.android.gms.internal.measurement.C16682fj;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.C17122h.C17123a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.ay */
public class C17005ay implements C17030bw {

    /* renamed from: l */
    private static volatile C17005ay f47954l;

    /* renamed from: A */
    private boolean f47955A;

    /* renamed from: B */
    private Boolean f47956B;

    /* renamed from: C */
    private long f47957C;

    /* renamed from: D */
    private volatile Boolean f47958D;

    /* renamed from: E */
    private Boolean f47959E;

    /* renamed from: F */
    private Boolean f47960F;

    /* renamed from: G */
    private AtomicInteger f47961G = new AtomicInteger(0);

    /* renamed from: a */
    public final String f47962a;

    /* renamed from: b */
    public final String f47963b;

    /* renamed from: c */
    public final String f47964c;

    /* renamed from: d */
    public final boolean f47965d;

    /* renamed from: e */
    public final C17110eu f47966e;

    /* renamed from: f */
    final C17133r f47967f;

    /* renamed from: g */
    public final C17000at f47968g;

    /* renamed from: h */
    public final AppMeasurement f47969h;

    /* renamed from: i */
    public C16992al f47970i;

    /* renamed from: j */
    int f47971j;

    /* renamed from: k */
    final long f47972k;

    /* renamed from: m */
    private final Context f47973m;

    /* renamed from: n */
    private final C17108es f47974n;

    /* renamed from: o */
    private final C16986af f47975o;

    /* renamed from: p */
    private final C17080ds f47976p;

    /* renamed from: q */
    private final C17102em f47977q;

    /* renamed from: r */
    private final C17131p f47978r;

    /* renamed from: s */
    private final C15514e f47979s;

    /* renamed from: t */
    private final C17051cq f47980t;

    /* renamed from: u */
    private final C17038cd f47981u;

    /* renamed from: v */
    private final C16980a f47982v;

    /* renamed from: w */
    private C17129n f47983w;

    /* renamed from: x */
    private C17055cu f47984x;

    /* renamed from: y */
    private C17007b f47985y;

    /* renamed from: z */
    private C17127l f47986z;

    private C17005ay(C17036cb cbVar) {
        C15464q.m32123a(cbVar);
        this.f47974n = new C17108es(cbVar.f48066a);
        C17122h.f48363a = this.f47974n;
        C17123a.m41881a();
        this.f47973m = cbVar.f48066a;
        this.f47962a = cbVar.f48067b;
        this.f47963b = cbVar.f48068c;
        this.f47964c = cbVar.f48069d;
        this.f47965d = cbVar.f48070e;
        this.f47958D = cbVar.f48071f;
        C17128m mVar = cbVar.f48072g;
        if (!(mVar == null || mVar.f48437g == null)) {
            Object obj = mVar.f48437g.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f47959E = (Boolean) obj;
            }
            Object obj2 = mVar.f48437g.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f47960F = (Boolean) obj2;
            }
        }
        Context context = this.f47973m;
        synchronized (C16675fc.f46909a) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (C16675fc.f46910b != context) {
                synchronized (C16663er.class) {
                    C16663er.f46893a.clear();
                }
                synchronized (C16682fj.class) {
                    C16682fj.f46921a.clear();
                }
                synchronized (C16670ey.class) {
                    C16670ey.f46903a = null;
                }
                C16675fc.f46911d.incrementAndGet();
                C16675fc.f46910b = context;
            }
        }
        this.f47979s = C15517h.m32280d();
        this.f47972k = this.f47979s.mo28523a();
        this.f47966e = new C17110eu(this);
        C16986af afVar = new C16986af(this);
        afVar.mo32981x();
        this.f47975o = afVar;
        C17133r rVar = new C17133r(this);
        rVar.mo32981x();
        this.f47967f = rVar;
        C17102em emVar = new C17102em(this);
        emVar.mo32981x();
        this.f47977q = emVar;
        C17131p pVar = new C17131p(this);
        pVar.mo32981x();
        this.f47978r = pVar;
        this.f47982v = new C16980a(this);
        C17051cq cqVar = new C17051cq(this);
        cqVar.mo33069D();
        this.f47980t = cqVar;
        C17038cd cdVar = new C17038cd(this);
        cdVar.mo33069D();
        this.f47981u = cdVar;
        this.f47969h = new AppMeasurement(this);
        C17080ds dsVar = new C17080ds(this);
        dsVar.mo33069D();
        this.f47976p = dsVar;
        C17000at atVar = new C17000at(this);
        atVar.mo32981x();
        this.f47968g = atVar;
        if (this.f47973m.getApplicationContext() instanceof Application) {
            C17038cd d = mo32925d();
            if (d.mo32850m().getApplicationContext() instanceof Application) {
                Application application = (Application) d.mo32850m().getApplicationContext();
                if (d.f48075a == null) {
                    d.f48075a = new C17047cm(d, null);
                }
                application.unregisterActivityLifecycleCallbacks(d.f48075a);
                application.registerActivityLifecycleCallbacks(d.f48075a);
                d.mo32854q().f48453j.mo33376a("Registered activity lifecycle callback");
            }
        } else {
            mo32854q().f48448e.mo33376a("Application context is not an Application");
        }
        this.f47968g.mo32912a((Runnable) new C17006az(this, cbVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo32921a() {
        mo32853p().mo32840c();
        if (mo32923b().f47875d.mo32882a() == 0) {
            mo32923b().f47875d.mo32883a(this.f47979s.mo28523a());
        }
        if (Long.valueOf(mo32923b().f47880i.mo32882a()).longValue() == 0) {
            mo32854q().f48453j.mo33377a("Persisting first open", Long.valueOf(this.f47972k));
            mo32923b().f47880i.mo32883a(this.f47972k);
        }
        if (mo32939v()) {
            if (!TextUtils.isEmpty(mo32933n().mo33354w()) || !TextUtils.isEmpty(mo32933n().mo33355x())) {
                mo32926e();
                if (C17102em.m41664a(mo32933n().mo33354w(), mo32923b().mo32874g(), mo32933n().mo33355x(), mo32923b().mo32875h())) {
                    mo32854q().f48451h.mo33376a("Rechecking which service to use due to a GMP App Id change");
                    mo32923b().mo32877j();
                    C17129n g = mo32928g();
                    g.mo32840c();
                    try {
                        int delete = g.mo33360v().delete("messages", null, null) + 0;
                        if (delete > 0) {
                            g.mo32854q().f48453j.mo33377a("Reset local analytics data. records", Integer.valueOf(delete));
                        }
                    } catch (SQLiteException e) {
                        g.mo32854q().f48445b.mo33377a("Error resetting local analytics data. error", e);
                    }
                    this.f47984x.mo33039z();
                    this.f47984x.mo33038y();
                    mo32923b().f47880i.mo32883a(this.f47972k);
                    mo32923b().f47882k.mo32886a(null);
                }
                mo32923b().mo32868c(mo32933n().mo33354w());
                mo32923b().mo32870d(mo32933n().mo33355x());
                if (this.f47966e.mo33290j(mo32933n().mo33353v())) {
                    this.f47976p.mo33074a(this.f47972k);
                }
            }
            C17038cd d = mo32925d();
            C16991ak akVar = mo32923b().f47882k;
            if (!akVar.f47908b) {
                akVar.f47908b = true;
                akVar.f47909c = akVar.f47910d.mo32873f().getString(akVar.f47907a, null);
            }
            d.mo32989a(akVar.f47909c);
            if (!TextUtils.isEmpty(mo32933n().mo33354w()) || !TextUtils.isEmpty(mo32933n().mo33355x())) {
                boolean s = mo32936s();
                if (!mo32923b().f47873b.contains("deferred_analytics_collection") && !this.f47966e.mo33283f()) {
                    mo32923b().mo32869c(!s);
                }
                if (!this.f47966e.mo33282e(mo32933n().mo33353v()) || s) {
                    mo32925d().mo32998v();
                }
                mo32931j().mo33032a(new AtomicReference<>());
            }
        } else if (mo32936s()) {
            if (!mo32926e().mo33152d("android.permission.INTERNET")) {
                mo32854q().f48445b.mo33376a("App is missing INTERNET permission");
            }
            if (!mo32926e().mo33152d("android.permission.ACCESS_NETWORK_STATE")) {
                mo32854q().f48445b.mo33376a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!C15377d.m31951a(this.f47973m).mo28319a() && !this.f47966e.mo33293u()) {
                if (!C16995ao.m41192a(this.f47973m)) {
                    mo32854q().f48445b.mo33376a("AppMeasurementReceiver not registered/enabled");
                }
                if (!C17102em.m41660a(this.f47973m, false)) {
                    mo32854q().f48445b.mo33376a("AppMeasurementService not registered/enabled");
                }
            }
            mo32854q().f48445b.mo33376a("Uploading is not possible. App measurement disabled");
        }
    }

    /* renamed from: b */
    public final C16986af mo32923b() {
        m41258a((C17028bu) this.f47975o);
        return this.f47975o;
    }

    /* renamed from: q */
    public final C17133r mo32854q() {
        m41259a((C17029bv) this.f47967f);
        return this.f47967f;
    }

    /* renamed from: p */
    public final C17000at mo32853p() {
        m41259a((C17029bv) this.f47968g);
        return this.f47968g;
    }

    /* renamed from: c */
    public final C17080ds mo32924c() {
        m41260a((C17076do) this.f47976p);
        return this.f47976p;
    }

    /* renamed from: d */
    public final C17038cd mo32925d() {
        m41260a((C17076do) this.f47981u);
        return this.f47981u;
    }

    /* renamed from: e */
    public final C17102em mo32926e() {
        m41258a((C17028bu) this.f47977q);
        return this.f47977q;
    }

    /* renamed from: f */
    public final C17131p mo32927f() {
        m41258a((C17028bu) this.f47978r);
        return this.f47978r;
    }

    /* renamed from: g */
    public final C17129n mo32928g() {
        m41260a((C17076do) this.f47983w);
        return this.f47983w;
    }

    /* renamed from: m */
    public final Context mo32850m() {
        return this.f47973m;
    }

    /* renamed from: h */
    public final boolean mo32929h() {
        return TextUtils.isEmpty(this.f47962a);
    }

    /* renamed from: l */
    public final C15514e mo32849l() {
        return this.f47979s;
    }

    /* renamed from: i */
    public final C17051cq mo32930i() {
        m41260a((C17076do) this.f47980t);
        return this.f47980t;
    }

    /* renamed from: j */
    public final C17055cu mo32931j() {
        m41260a((C17076do) this.f47984x);
        return this.f47984x;
    }

    /* renamed from: k */
    public final C17007b mo32932k() {
        m41259a((C17029bv) this.f47985y);
        return this.f47985y;
    }

    /* renamed from: n */
    public final C17127l mo32933n() {
        m41260a((C17076do) this.f47986z);
        return this.f47986z;
    }

    /* renamed from: o */
    public final C16980a mo32934o() {
        if (this.f47982v != null) {
            return this.f47982v;
        }
        throw new IllegalStateException("Component not created");
    }

    /* renamed from: a */
    public static C17005ay m41256a(Context context, C17128m mVar) {
        if (mVar != null && (mVar.f48435e == null || mVar.f48436f == null)) {
            C17128m mVar2 = new C17128m(mVar.f48431a, mVar.f48432b, mVar.f48433c, mVar.f48434d, null, null, mVar.f48437g);
            mVar = mVar2;
        }
        C15464q.m32123a(context);
        C15464q.m32123a(context.getApplicationContext());
        if (f47954l == null) {
            synchronized (C17005ay.class) {
                if (f47954l == null) {
                    f47954l = new C17005ay(new C17036cb(context, mVar));
                }
            }
        } else if (!(mVar == null || mVar.f48437g == null || !mVar.f48437g.containsKey("dataCollectionDefaultEnabled"))) {
            f47954l.mo32922a(mVar.f48437g.getBoolean("dataCollectionDefaultEnabled"));
        }
        return f47954l;
    }

    /* renamed from: w */
    private final void m41261w() {
        if (!this.f47955A) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
    }

    /* renamed from: a */
    private static void m41259a(C17029bv bvVar) {
        if (bvVar == null) {
            throw new IllegalStateException("Component not created");
        } else if (!bvVar.mo32979v()) {
            String valueOf = String.valueOf(bvVar.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    private static void m41260a(C17076do doVar) {
        if (doVar == null) {
            throw new IllegalStateException("Component not created");
        } else if (!doVar.mo33067B()) {
            String valueOf = String.valueOf(doVar.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    private static void m41258a(C17028bu buVar) {
        if (buVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo32922a(boolean z) {
        this.f47958D = Boolean.valueOf(z);
    }

    /* renamed from: r */
    public final boolean mo32935r() {
        return this.f47958D != null && this.f47958D.booleanValue();
    }

    /* renamed from: s */
    public final boolean mo32936s() {
        boolean z;
        mo32853p().mo32840c();
        m41261w();
        if (this.f47966e.mo33274a(C17122h.f48382ar)) {
            if (this.f47966e.mo33283f()) {
                return false;
            }
            if (this.f47960F != null && this.f47960F.booleanValue()) {
                return false;
            }
            Boolean t = mo32923b().mo32878t();
            if (t != null) {
                return t.booleanValue();
            }
            Boolean g = this.f47966e.mo33285g();
            if (g != null) {
                return g.booleanValue();
            }
            if (this.f47959E != null) {
                return this.f47959E.booleanValue();
            }
            if (C15333e.m31886b()) {
                return false;
            }
            if (!this.f47966e.mo33274a(C17122h.f48378an) || this.f47958D == null) {
                return true;
            }
            return this.f47958D.booleanValue();
        } else if (this.f47966e.mo33283f()) {
            return false;
        } else {
            Boolean g2 = this.f47966e.mo33285g();
            if (g2 != null) {
                z = g2.booleanValue();
            } else {
                z = !C15333e.m31886b();
                if (z && this.f47958D != null && ((Boolean) C17122h.f48378an.mo33351b()).booleanValue()) {
                    z = this.f47958D.booleanValue();
                }
            }
            return mo32923b().mo32867b(z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public final void mo32937t() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public final void mo32938u() {
        this.f47961G.incrementAndGet();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final boolean mo32939v() {
        m41261w();
        mo32853p().mo32840c();
        if (this.f47956B == null || this.f47957C == 0 || (this.f47956B != null && !this.f47956B.booleanValue() && Math.abs(this.f47979s.mo28524b() - this.f47957C) > 1000)) {
            this.f47957C = this.f47979s.mo28524b();
            boolean z = true;
            this.f47956B = Boolean.valueOf(mo32926e().mo33152d("android.permission.INTERNET") && mo32926e().mo33152d("android.permission.ACCESS_NETWORK_STATE") && (C15377d.m31951a(this.f47973m).mo28319a() || this.f47966e.mo33293u() || (C16995ao.m41192a(this.f47973m) && C17102em.m41660a(this.f47973m, false))));
            if (this.f47956B.booleanValue()) {
                if (!mo32926e().mo33150b(mo32933n().mo33354w(), mo32933n().mo33355x()) && TextUtils.isEmpty(mo32933n().mo33355x())) {
                    z = false;
                }
                this.f47956B = Boolean.valueOf(z);
            }
        }
        return this.f47956B.booleanValue();
    }

    /* renamed from: a */
    static /* synthetic */ void m41257a(C17005ay ayVar, C17036cb cbVar) {
        String str;
        C17135t tVar;
        ayVar.mo32853p().mo32840c();
        C17110eu.m41770d();
        C17007b bVar = new C17007b(ayVar);
        bVar.mo32981x();
        ayVar.f47985y = bVar;
        C17127l lVar = new C17127l(ayVar);
        lVar.mo33069D();
        ayVar.f47986z = lVar;
        C17129n nVar = new C17129n(ayVar);
        nVar.mo33069D();
        ayVar.f47983w = nVar;
        C17055cu cuVar = new C17055cu(ayVar);
        cuVar.mo33069D();
        ayVar.f47984x = cuVar;
        ayVar.f47977q.mo32982y();
        ayVar.f47975o.mo32982y();
        ayVar.f47970i = new C16992al(ayVar);
        ayVar.f47986z.mo33070E();
        ayVar.mo32854q().f48451h.mo33377a("App measurement is starting up, version", Long.valueOf(14710));
        ayVar.mo32854q().f48451h.mo33376a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String v = lVar.mo33353v();
        if (TextUtils.isEmpty(ayVar.f47962a)) {
            if (ayVar.mo32926e().mo33154f(v)) {
                tVar = ayVar.mo32854q().f48451h;
                str = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
            } else {
                tVar = ayVar.mo32854q().f48451h;
                String str2 = "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ";
                String valueOf = String.valueOf(v);
                str = valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
            }
            tVar.mo33376a(str);
        }
        ayVar.mo32854q().f48452i.mo33376a("Debug-level message logging enabled");
        if (ayVar.f47971j != ayVar.f47961G.get()) {
            ayVar.mo32854q().f48445b.mo33378a("Not all components initialized", Integer.valueOf(ayVar.f47971j), Integer.valueOf(ayVar.f47961G.get()));
        }
        ayVar.f47955A = true;
    }
}
