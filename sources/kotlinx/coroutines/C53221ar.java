package kotlinx.coroutines;

import kotlinx.coroutines.internal.C53334w;
import p2628d.p2631c.C52625c;
import p2628d.p2631c.C52628e;
import p2628d.p2631c.p2633b.p2634a.C52617e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.ar */
public final class C53221ar<T> extends C53224au<T> implements C52617e, C52625c<T> {

    /* renamed from: a */
    public Object f131799a = C53223at.f131805a;

    /* renamed from: b */
    public final Object f131800b;

    /* renamed from: c */
    public final C53360z f131801c;

    /* renamed from: d */
    public final C52625c<T> f131802d;

    /* renamed from: h */
    private final C52617e f131803h;

    /* renamed from: d */
    public final C52625c<T> mo110791d() {
        return this;
    }

    public final C52617e getCallerFrame() {
        return this.f131803h;
    }

    public final C52628e getContext() {
        return this.f131802d.getContext();
    }

    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    /* renamed from: a */
    public final Object mo110790a() {
        boolean z;
        Object obj = this.f131799a;
        if (obj != C53223at.f131805a) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f131799a = C53223at.f131805a;
            return obj;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DispatchedContinuation[");
        sb.append(this.f131801c);
        sb.append(", ");
        sb.append(C53203ai.m113028a(this.f131802d));
        sb.append(']');
        return sb.toString();
    }

    public final void resumeWith(Object obj) {
        C52628e context;
        Object a;
        C52628e context2 = this.f131802d.getContext();
        Object a2 = C53355u.m113421a(obj);
        if (this.f131801c.mo19709a(context2)) {
            this.f131799a = a2;
            this.f131806e = 0;
            this.f131801c.mo19708a(context2, this);
            return;
        }
        C53249ba a3 = C53291cg.m113269a();
        if (a3.mo110843f()) {
            this.f131799a = a2;
            this.f131806e = 0;
            a3.mo110836a((C53224au<?>) this);
            return;
        }
        a3.mo110837a(true);
        try {
            context = getContext();
            a = C53334w.m113370a(context, this.f131800b);
            this.f131802d.resumeWith(obj);
            C53334w.m113371b(context, a);
            do {
            } while (a3.mo110842e());
            a3.mo110839b(true);
        } catch (Throwable th) {
            try {
                throw new C53220aq("Unexpected exception in unconfined event loop", th);
            } catch (Throwable th2) {
                a3.mo110839b(true);
                throw th2;
            }
        }
    }

    public C53221ar(C53360z zVar, C52625c<? super T> cVar) {
        C52711k.m112240b(zVar, "dispatcher");
        C52711k.m112240b(cVar, "continuation");
        super(0);
        this.f131801c = zVar;
        this.f131802d = cVar;
        C52625c<T> cVar2 = this.f131802d;
        if (!(cVar2 instanceof C52617e)) {
            cVar2 = null;
        }
        this.f131803h = (C52617e) cVar2;
        this.f131800b = C53334w.m113369a(getContext());
    }
}
