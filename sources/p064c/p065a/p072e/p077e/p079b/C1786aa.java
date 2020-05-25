package p064c.p065a.p072e.p077e.p079b;

import java.util.concurrent.Callable;
import org.p2692b.C53694b;
import org.p2692b.C53695c;
import p064c.p065a.C2149h;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p086i.C2119c;
import p064c.p065a.p072e.p086i.C2120d;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.b.aa */
public final class C1786aa {

    /* renamed from: c.a.e.e.b.aa$a */
    static final class C1787a<T, R> extends C2149h<R> {

        /* renamed from: a */
        final T f5925a;

        /* renamed from: c */
        final C1711f<? super T, ? extends C53694b<? extends R>> f5926c;

        /* renamed from: b */
        public final void mo6264b(C53695c<? super R> cVar) {
            try {
                C53694b bVar = (C53694b) C1745b.m6050a(this.f5926c.apply(this.f5925a), "The mapper returned a null Publisher");
                if (bVar instanceof Callable) {
                    try {
                        Object call = ((Callable) bVar).call();
                        if (call == null) {
                            C2119c.complete(cVar);
                        } else {
                            cVar.onSubscribe(new C2120d(cVar, call));
                        }
                    } catch (Throwable th) {
                        C1700b.m6017b(th);
                        C2119c.error(th, cVar);
                    }
                } else {
                    bVar.mo336a(cVar);
                }
            } catch (Throwable th2) {
                C2119c.error(th2, cVar);
            }
        }

        C1787a(T t, C1711f<? super T, ? extends C53694b<? extends R>> fVar) {
            this.f5925a = t;
            this.f5926c = fVar;
        }
    }

    /* renamed from: a */
    public static <T, U> C2149h<U> m6079a(T t, C1711f<? super T, ? extends C53694b<? extends U>> fVar) {
        return C2150a.m6483a((C2149h<T>) new C1787a<T>(t, fVar));
    }

    /* renamed from: a */
    public static <T, R> boolean m6080a(C53694b<T> bVar, C53695c<? super R> cVar, C1711f<? super T, ? extends C53694b<? extends R>> fVar) {
        if (!(bVar instanceof Callable)) {
            return false;
        }
        try {
            Object call = ((Callable) bVar).call();
            if (call == null) {
                C2119c.complete(cVar);
                return true;
            }
            try {
                C53694b bVar2 = (C53694b) C1745b.m6050a(fVar.apply(call), "The mapper returned a null Publisher");
                if (bVar2 instanceof Callable) {
                    try {
                        Object call2 = ((Callable) bVar2).call();
                        if (call2 == null) {
                            C2119c.complete(cVar);
                            return true;
                        }
                        cVar.onSubscribe(new C2120d(cVar, call2));
                    } catch (Throwable th) {
                        C1700b.m6017b(th);
                        C2119c.error(th, cVar);
                        return true;
                    }
                } else {
                    bVar2.mo336a(cVar);
                }
                return true;
            } catch (Throwable th2) {
                C1700b.m6017b(th2);
                C2119c.error(th2, cVar);
                return true;
            }
        } catch (Throwable th3) {
            C1700b.m6017b(th3);
            C2119c.error(th3, cVar);
            return true;
        }
    }
}
