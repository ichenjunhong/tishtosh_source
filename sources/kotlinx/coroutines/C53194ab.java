package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import p2628d.C52546a;
import p2628d.p2631c.C52628e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.ab */
public final class C53194ab {
    /* renamed from: a */
    public static final Throwable m113020a(Throwable th, Throwable th2) {
        C52711k.m112240b(th, "originalException");
        C52711k.m112240b(th2, "thrownException");
        if (th == th2) {
            return th;
        }
        Throwable runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        C52546a.m112152a(runtimeException, th);
        return runtimeException;
    }

    /* renamed from: a */
    public static final void m113021a(C52628e eVar, Throwable th) {
        C52711k.m112240b(eVar, "context");
        C52711k.m112240b(th, "exception");
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) eVar.get(CoroutineExceptionHandler.f131765b);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(eVar, th);
            } else {
                C53193aa.m113019a(eVar, th);
            }
        } catch (Throwable th2) {
            C53193aa.m113019a(eVar, m113020a(th, th2));
        }
    }

    /* renamed from: a */
    public static final void m113022a(C52628e eVar, Throwable th, C53263bl blVar) {
        C52711k.m112240b(eVar, "context");
        C52711k.m112240b(th, "exception");
        if (!(th instanceof CancellationException)) {
            C53263bl blVar2 = (C53263bl) eVar.get(C53263bl.f131892c);
            if (blVar2 == null || blVar2 == blVar || !blVar2.mo110863b(th)) {
                m113021a(eVar, th);
            }
        }
    }
}
