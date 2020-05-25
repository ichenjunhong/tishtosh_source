package kotlinx.coroutines;

import p2628d.p2631c.C52625c;
import p2628d.p2631c.p2633b.p2634a.C52617e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.ck */
public final class C53295ck<U, T extends U> extends C53190a<T> implements C52617e, C52625c<T>, Runnable {

    /* renamed from: b */
    public final long f131918b;

    /* renamed from: e */
    public final C52625c<U> f131919e;

    /* renamed from: f */
    public final int mo110759f() {
        return 2;
    }

    /* renamed from: g */
    public final String mo110760g() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.mo110760g());
        sb.append("(timeMillis=");
        sb.append(this.f131918b);
        sb.append(')');
        return sb.toString();
    }

    public final C52617e getCallerFrame() {
        C52625c<U> cVar = this.f131919e;
        if (!(cVar instanceof C52617e)) {
            cVar = null;
        }
        C52617e eVar = (C52617e) cVar;
        if (eVar != null) {
            return eVar.getCallerFrame();
        }
        return null;
    }

    public final StackTraceElement getStackTraceElement() {
        C52625c<U> cVar = this.f131919e;
        if (!(cVar instanceof C52617e)) {
            cVar = null;
        }
        C52617e eVar = (C52617e) cVar;
        if (eVar != null) {
            return eVar.getStackTraceElement();
        }
        return null;
    }

    public final void run() {
        long j = this.f131918b;
        C53263bl blVar = this;
        C52711k.m112240b(blVar, "coroutine");
        StringBuilder sb = new StringBuilder("Timed out waiting for ");
        sb.append(j);
        sb.append(" ms");
        mo110863b((Throwable) new C53294cj(sb.toString(), blVar));
    }

    public C53295ck(long j, C52625c<? super U> cVar) {
        C52711k.m112240b(cVar, "uCont");
        super(cVar.getContext(), true);
        this.f131918b = j;
        this.f131919e = cVar;
    }

    /* renamed from: a */
    public final void mo110752a(Object obj, int i, boolean z) {
        if (obj instanceof C53354t) {
            C53287cc.m113262b(this.f131919e, ((C53354t) obj).f131987b, i);
        } else {
            C53287cc.m113261b(this.f131919e, obj, i);
        }
    }
}
