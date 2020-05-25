package kotlinx.coroutines.internal;

import kotlinx.coroutines.C53190a;
import kotlinx.coroutines.C53287cc;
import kotlinx.coroutines.C53354t;
import p2628d.p2631c.C52625c;
import p2628d.p2631c.C52628e;
import p2628d.p2631c.p2633b.p2634a.C52617e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.internal.r */
public class C53329r<T> extends C53190a<T> implements C52617e {

    /* renamed from: e */
    public final C52625c<T> f131958e;

    /* renamed from: f */
    public int mo110759f() {
        return 2;
    }

    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public final C52617e getCallerFrame() {
        return (C52617e) this.f131958e;
    }

    public C53329r(C52628e eVar, C52625c<? super T> cVar) {
        C52711k.m112240b(eVar, "context");
        C52711k.m112240b(cVar, "uCont");
        super(eVar, true);
        this.f131958e = cVar;
    }

    /* renamed from: a */
    public void mo110752a(Object obj, int i, boolean z) {
        Throwable th;
        if (obj instanceof C53354t) {
            if (i == 4) {
                th = ((C53354t) obj).f131987b;
            } else {
                th = C53331t.m113355a(((C53354t) obj).f131987b, this.f131958e);
            }
            C53287cc.m113262b(this.f131958e, th, i);
            return;
        }
        C53287cc.m113261b(this.f131958e, obj, i);
    }
}
