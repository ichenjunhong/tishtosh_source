package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.android.gms.analytics.C15084a;
import com.google.android.gms.analytics.C15098l;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.util.C15514e;
import com.google.android.gms.common.util.C15517h;

/* renamed from: com.google.android.gms.internal.measurement.t */
public class C16862t {

    /* renamed from: k */
    private static volatile C16862t f47333k;

    /* renamed from: a */
    public final Context f47334a;

    /* renamed from: b */
    public final Context f47335b;

    /* renamed from: c */
    public final C15514e f47336c = C15517h.m32280d();

    /* renamed from: d */
    public final C16550au f47337d = new C16550au(this);

    /* renamed from: e */
    public final C16568bl f47338e;

    /* renamed from: f */
    final C16555az f47339f;

    /* renamed from: g */
    final C16574br f47340g;

    /* renamed from: h */
    public final C16818k f47341h;

    /* renamed from: i */
    public final C16535af f47342i;

    /* renamed from: j */
    public final C16554ay f47343j;

    /* renamed from: l */
    private final C15098l f47344l;

    /* renamed from: m */
    private final C16849l f47345m;

    /* renamed from: n */
    private final C16586cc f47346n;

    /* renamed from: o */
    private final C15084a f47347o;

    /* renamed from: p */
    private final C16542am f47348p;

    private C16862t(C16864v vVar) {
        Context context = vVar.f47350a;
        C15464q.m32124a(context, (Object) "Application context can't be null");
        Context context2 = vVar.f47351b;
        C15464q.m32123a(context2);
        this.f47334a = context;
        this.f47335b = context2;
        C16568bl blVar = new C16568bl(this);
        blVar.mo32517s();
        this.f47338e = blVar;
        C16568bl a = mo32518a();
        String str = C16861s.f47331a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 134);
        sb.append("Google Analytics ");
        sb.append(str);
        sb.append(" is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4");
        a.mo32500d(sb.toString());
        C16574br brVar = new C16574br(this);
        brVar.mo32517s();
        this.f47340g = brVar;
        C16586cc ccVar = new C16586cc(this);
        ccVar.mo32517s();
        this.f47346n = ccVar;
        C16849l lVar = new C16849l(this, vVar);
        C16542am amVar = new C16542am(this);
        C16818k kVar = new C16818k(this);
        C16535af afVar = new C16535af(this);
        C16554ay ayVar = new C16554ay(this);
        C15098l a2 = C15098l.m31265a(context);
        a2.f38975d = new C16863u(this);
        this.f47344l = a2;
        C15084a aVar = new C15084a(this);
        amVar.mo32517s();
        this.f47348p = amVar;
        kVar.mo32517s();
        this.f47341h = kVar;
        afVar.mo32517s();
        this.f47342i = afVar;
        ayVar.mo32517s();
        this.f47343j = ayVar;
        C16555az azVar = new C16555az(this);
        azVar.mo32517s();
        this.f47339f = azVar;
        lVar.mo32517s();
        this.f47345m = lVar;
        C16586cc e = aVar.f38948e.mo32522e();
        e.mo31862d();
        if (e.mo31863e()) {
            aVar.f38942c = e.mo31864t();
        }
        e.mo31862d();
        aVar.f38941b = true;
        this.f47347o = aVar;
        lVar.f47303a.mo31788b();
    }

    /* renamed from: a */
    public static C16862t m40963a(Context context) {
        C15464q.m32123a(context);
        if (f47333k == null) {
            synchronized (C16862t.class) {
                if (f47333k == null) {
                    C15514e d = C15517h.m32280d();
                    long b = d.mo28524b();
                    C16862t tVar = new C16862t(new C16864v(context));
                    f47333k = tVar;
                    synchronized (C15084a.class) {
                        if (C15084a.f38940a != null) {
                            for (Runnable run : C15084a.f38940a) {
                                run.run();
                            }
                            C15084a.f38940a = null;
                        }
                    }
                    long b2 = d.mo28524b() - b;
                    long longValue = ((Long) C16559bc.f46507E.f46547a).longValue();
                    if (b2 > longValue) {
                        tVar.mo32518a().mo32499c("Slow initialization (ms)", Long.valueOf(b2), Long.valueOf(longValue));
                    }
                }
            }
        }
        return f47333k;
    }

    /* renamed from: a */
    public final C16568bl mo32518a() {
        m40964a((C16860r) this.f47338e);
        return this.f47338e;
    }

    /* renamed from: b */
    public final C15098l mo32519b() {
        C15464q.m32123a(this.f47344l);
        return this.f47344l;
    }

    /* renamed from: c */
    public final C16849l mo32520c() {
        m40964a((C16860r) this.f47345m);
        return this.f47345m;
    }

    /* renamed from: d */
    public final C15084a mo32521d() {
        C15464q.m32123a(this.f47347o);
        C15464q.m32134b(this.f47347o.mo27821a(), "Analytics instance not initialized");
        return this.f47347o;
    }

    /* renamed from: e */
    public final C16586cc mo32522e() {
        m40964a((C16860r) this.f47346n);
        return this.f47346n;
    }

    /* renamed from: f */
    public final C16542am mo32523f() {
        m40964a((C16860r) this.f47348p);
        return this.f47348p;
    }

    /* renamed from: a */
    public static void m40964a(C16860r rVar) {
        C15464q.m32124a(rVar, (Object) "Analytics service not created/initialized");
        C15464q.m32134b(rVar.mo32515q(), "Analytics service not initialized");
    }
}
