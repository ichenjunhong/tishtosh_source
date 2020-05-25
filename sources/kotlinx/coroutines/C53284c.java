package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import p2628d.p2631c.C52628e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.c */
final class C53284c<T> extends C53190a<T> {

    /* renamed from: b */
    private final Thread f131911b;

    /* renamed from: e */
    private final C53249ba f131912e;

    /* JADX INFO: finally extract failed */
    public final T cC_() {
        long j;
        C53249ba baVar = this.f131912e;
        T t = null;
        if (baVar != null) {
            baVar.mo110837a(false);
        }
        while (!Thread.interrupted()) {
            try {
                C53249ba baVar2 = this.f131912e;
                if (baVar2 != null) {
                    j = baVar2.mo110838b();
                } else {
                    j = Long.MAX_VALUE;
                }
                if (!mo110864i()) {
                    C53293ci.m113275a().mo110777a(this, j);
                } else {
                    C53249ba baVar3 = this.f131912e;
                    if (baVar3 != null) {
                        baVar3.mo110839b(false);
                    }
                    T b = C53277bt.m113248b(mo110883n());
                    if (b instanceof C53354t) {
                        t = b;
                    }
                    C53354t tVar = (C53354t) t;
                    if (tVar == null) {
                        return b;
                    }
                    throw tVar.f131987b;
                }
            } catch (Throwable th) {
                C53249ba baVar4 = this.f131912e;
                if (baVar4 != null) {
                    baVar4.mo110839b(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        mo110863b((Throwable) interruptedException);
        throw interruptedException;
    }

    public C53284c(C52628e eVar, Thread thread, C53249ba baVar) {
        C52711k.m112240b(eVar, "parentContext");
        C52711k.m112240b(thread, "blockedThread");
        super(eVar, true);
        this.f131911b = thread;
        this.f131912e = baVar;
    }

    /* renamed from: a */
    public final void mo110752a(Object obj, int i, boolean z) {
        if (!C52711k.m112239a((Object) Thread.currentThread(), (Object) this.f131911b)) {
            LockSupport.unpark(this.f131911b);
        }
    }
}
