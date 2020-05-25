package kotlinx.coroutines;

import p2628d.p2631c.C52625c;
import p2628d.p2631c.C52628e;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.a */
public abstract class C53190a<T> extends C53272bs implements C52625c<T>, C53199ae, C53263bl {

    /* renamed from: a */
    protected final C52628e f131767a;

    /* renamed from: b */
    private final C52628e f131768b = this.f131767a.plus(this);

    /* renamed from: a */
    public final C52628e mo65786a() {
        return this.f131768b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo110757d() {
    }

    /* renamed from: e */
    public final void mo110758e() {
        mo110757d();
    }

    /* renamed from: f */
    public int mo110759f() {
        return 0;
    }

    public final C52628e getContext() {
        return this.f131768b;
    }

    /* renamed from: b */
    public final boolean mo110755b() {
        return super.mo110755b();
    }

    public final void cA_() {
        mo110876a((C53263bl) this.f131767a.get(C53263bl.f131892c));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        if (r0 == null) goto L_0x002a;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo110760g() {
        /*
            r3 = this;
            d.c.e r0 = r3.f131768b
            java.lang.String r1 = "receiver$0"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r1)
            boolean r1 = kotlinx.coroutines.C53203ai.f131777a
            r2 = 0
            if (r1 != 0) goto L_0x000d
            goto L_0x0042
        L_0x000d:
            kotlinx.coroutines.ac$a r1 = kotlinx.coroutines.C53195ac.f131770b
            d.c.e$c r1 = (p2628d.p2631c.C52628e.C52633c) r1
            d.c.e$b r1 = r0.get(r1)
            kotlinx.coroutines.ac r1 = (kotlinx.coroutines.C53195ac) r1
            if (r1 != 0) goto L_0x001a
            goto L_0x0042
        L_0x001a:
            kotlinx.coroutines.ad$a r2 = kotlinx.coroutines.C53197ad.f131772b
            d.c.e$c r2 = (p2628d.p2631c.C52628e.C52633c) r2
            d.c.e$b r0 = r0.get(r2)
            kotlinx.coroutines.ad r0 = (kotlinx.coroutines.C53197ad) r0
            if (r0 == 0) goto L_0x002a
            java.lang.String r0 = r0.f131773a
            if (r0 != 0) goto L_0x002c
        L_0x002a:
            java.lang.String r0 = "coroutine"
        L_0x002c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r0 = 35
            r2.append(r0)
            long r0 = r1.f131771a
            r2.append(r0)
            java.lang.String r2 = r2.toString()
        L_0x0042:
            if (r2 != 0) goto L_0x0049
            java.lang.String r0 = super.mo110760g()
            return r0
        L_0x0049:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\""
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = "\":"
            r0.append(r1)
            java.lang.String r1 = super.mo110760g()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C53190a.mo110760g():java.lang.String");
    }

    public final void resumeWith(Object obj) {
        mo110878a(C53355u.m113421a(obj), mo110759f());
    }

    /* renamed from: a */
    public final void mo110753a(Throwable th) {
        C52711k.m112240b(th, "exception");
        C53194ab.m113022a(this.f131767a, th, this);
    }

    public C53190a(C52628e eVar, boolean z) {
        C52711k.m112240b(eVar, "parentContext");
        super(z);
        this.f131767a = eVar;
    }

    /* renamed from: a */
    public void mo110752a(Object obj, int i, boolean z) {
        if (obj instanceof C53354t) {
            C52711k.m112240b(((C53354t) obj).f131987b, "exception");
        }
    }

    /* renamed from: a */
    public final <R> void mo110754a(C53201ag agVar, R r, C52682m<? super R, ? super C52625c<? super T>, ? extends Object> mVar) {
        C52711k.m112240b(agVar, "start");
        C52711k.m112240b(mVar, "block");
        cA_();
        agVar.invoke(mVar, r, this);
    }
}
