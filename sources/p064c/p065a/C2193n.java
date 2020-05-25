package p064c.p065a;

import java.util.concurrent.TimeUnit;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1706a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p071d.C1715j;
import p064c.p065a.p072e.p074b.C1723a;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p075c.C1748b;
import p064c.p065a.p072e.p076d.C1761f;
import p064c.p065a.p072e.p077e.p080c.C1863b;
import p064c.p065a.p072e.p077e.p080c.C1864c;
import p064c.p065a.p072e.p077e.p080c.C1866d;
import p064c.p065a.p072e.p077e.p080c.C1870f;
import p064c.p065a.p072e.p077e.p080c.C1871g;
import p064c.p065a.p072e.p077e.p080c.C1875i;
import p064c.p065a.p072e.p077e.p080c.C1877j;
import p064c.p065a.p072e.p077e.p080c.C1879k;
import p064c.p065a.p072e.p077e.p080c.C1881l;
import p064c.p065a.p072e.p077e.p080c.C1887n;
import p064c.p065a.p072e.p077e.p080c.C1891o;
import p064c.p065a.p072e.p077e.p080c.C1893p;
import p064c.p065a.p072e.p077e.p080c.C1895q;
import p064c.p065a.p090h.C2150a;
import p064c.p065a.p093k.C2168a;

/* renamed from: c.a.n */
public abstract class C2193n<T> implements C2198s<T> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo6269a(C2196q<? super T> qVar);

    /* renamed from: a */
    public final T mo6490a() {
        C1761f fVar = new C1761f();
        mo6495b((C2196q<? super T>) fVar);
        return fVar.mo6235a();
    }

    /* renamed from: a */
    public final <R> C2193n<R> mo6489a(C2199t<? super T, ? extends R> tVar) {
        return m6559a(((C2199t) C1745b.m6050a(tVar, "transformer is null")).mo6499a(this));
    }

    /* renamed from: a */
    public final C2193n<T> mo6485a(C1706a aVar) {
        C1745b.m6050a(aVar, "onFinally is null");
        return C2150a.m6484a((C2193n<T>) new C1866d<T>(this, aVar));
    }

    /* renamed from: a */
    public final C2193n<T> mo6486a(C1710e<? super Throwable> eVar) {
        C1710e b = C1723a.m6037b();
        C1710e b2 = C1723a.m6037b();
        C1710e eVar2 = (C1710e) C1745b.m6050a(eVar, "onError is null");
        C1706a aVar = C1723a.f5844c;
        C1879k kVar = new C1879k(this, b, b2, eVar2, aVar, aVar, C1723a.f5844c);
        return C2150a.m6484a((C2193n<T>) kVar);
    }

    /* renamed from: a */
    public final <R> C2193n<R> mo6487a(C1711f<? super T, ? extends R> fVar) {
        C1745b.m6050a(fVar, "mapper is null");
        return C2150a.m6484a((C2193n<T>) new C1871g<T>(this, fVar));
    }

    /* renamed from: a */
    public final C2193n<T> mo6488a(C1715j<? super Throwable> jVar) {
        C1745b.m6050a(jVar, "predicate is null");
        return C2150a.m6484a((C2193n<T>) new C1875i<T>(this, jVar));
    }

    /* renamed from: a */
    public final C2193n<T> mo6484a(C1675ac acVar) {
        C1745b.m6050a(acVar, "scheduler is null");
        return C2150a.m6484a((C2193n<T>) new C1881l<T>(this, acVar));
    }

    /* renamed from: c */
    private C2149h<T> m6563c() {
        if (this instanceof C1748b) {
            return ((C1748b) this).cy_();
        }
        return C2150a.m6483a((C2149h<T>) new C1893p<T>(this));
    }

    /* renamed from: b */
    public final C1690c mo6491b() {
        return mo6481a(C1723a.m6037b(), C1723a.f5847f, C1723a.f5844c);
    }

    /* renamed from: c */
    private <E extends C2196q<? super T>> E m6564c(E e) {
        mo6495b((C2196q<? super T>) e);
        return e;
    }

    /* renamed from: b */
    private <U> C2193n<T> m6562b(C2198s<U> sVar) {
        C1745b.m6050a(sVar, "timeoutIndicator is null");
        return C2150a.m6484a((C2193n<T>) new C1887n<T>(this, sVar, null));
    }

    /* renamed from: a */
    public static <T> C2193n<T> m6558a(C2197r<T> rVar) {
        C1745b.m6050a(rVar, "onSubscribe is null");
        return C2150a.m6484a((C2193n<T>) new C1864c<T>(rVar));
    }

    /* renamed from: c */
    public final C2193n<T> mo6496c(C1710e<? super T> eVar) {
        C1710e b = C1723a.m6037b();
        C1710e eVar2 = (C1710e) C1745b.m6050a(eVar, "onSubscribe is null");
        C1710e b2 = C1723a.m6037b();
        C1706a aVar = C1723a.f5844c;
        C1879k kVar = new C1879k(this, b, eVar2, b2, aVar, aVar, C1723a.f5844c);
        return C2150a.m6484a((C2193n<T>) kVar);
    }

    /* renamed from: a */
    private static <T> C2193n<T> m6559a(C2198s<T> sVar) {
        if (sVar instanceof C2193n) {
            return C2150a.m6484a((C2193n) sVar);
        }
        C1745b.m6050a(sVar, "onSubscribe is null");
        return C2150a.m6484a((C2193n<T>) new C1895q<T>(sVar));
    }

    /* renamed from: b */
    public final C2193n<T> mo6492b(C1706a aVar) {
        C1710e b = C1723a.m6037b();
        C1710e b2 = C1723a.m6037b();
        C1710e b3 = C1723a.m6037b();
        C1706a aVar2 = (C1706a) C1745b.m6050a(aVar, "onComplete is null");
        C1706a aVar3 = C1723a.f5844c;
        C1879k kVar = new C1879k(this, b, b2, b3, aVar2, aVar3, aVar3);
        return C2150a.m6484a((C2193n<T>) kVar);
    }

    /* renamed from: a */
    public static <T> C2193n<T> m6560a(T t) {
        C1745b.m6050a(t, "item is null");
        return C2150a.m6484a((C2193n<T>) new C1870f<T>(t));
    }

    /* renamed from: b */
    public final C2193n<T> mo6493b(C1710e<? super C1690c> eVar) {
        C1710e eVar2 = (C1710e) C1745b.m6050a(eVar, "onSubscribe is null");
        C1710e b = C1723a.m6037b();
        C1710e b2 = C1723a.m6037b();
        C1706a aVar = C1723a.f5844c;
        C1879k kVar = new C1879k(this, eVar2, b, b2, aVar, aVar, C1723a.f5844c);
        return C2150a.m6484a((C2193n<T>) kVar);
    }

    /* renamed from: b */
    public final C2193n<T> mo6494b(C1711f<? super Throwable, ? extends T> fVar) {
        C1745b.m6050a(fVar, "valueSupplier is null");
        return C2150a.m6484a((C2193n<T>) new C1877j<T>(this, fVar));
    }

    /* renamed from: a */
    public final C2193n<T> mo6482a(long j) {
        return m6556a(2, C1723a.m6041c());
    }

    /* renamed from: b */
    public final void mo6495b(C2196q<? super T> qVar) {
        C1745b.m6050a(qVar, "observer is null");
        C2196q a = C2150a.m6485a(this, qVar);
        C1745b.m6050a(a, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            mo6269a(a);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C1700b.m6017b(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: a */
    private C2193n<T> m6556a(long j, C1715j<? super Throwable> jVar) {
        return m6563c().mo6441a(j, jVar).mo6456e();
    }

    /* renamed from: a */
    public final C2193n<T> mo6483a(long j, TimeUnit timeUnit) {
        return m6561b(3, timeUnit, C2168a.m6519a());
    }

    /* renamed from: b */
    private C2193n<T> m6561b(long j, TimeUnit timeUnit, C1675ac acVar) {
        return m6562b((C2198s<U>) m6557a(j, timeUnit, acVar));
    }

    /* renamed from: a */
    private static C2193n<Long> m6557a(long j, TimeUnit timeUnit, C1675ac acVar) {
        C1745b.m6050a(timeUnit, "unit is null");
        C1745b.m6050a(acVar, "scheduler is null");
        return C2150a.m6484a((C2193n<T>) new C1891o<T>(Math.max(0, j), timeUnit, acVar));
    }

    /* renamed from: a */
    public final C1690c mo6481a(C1710e<? super T> eVar, C1710e<? super Throwable> eVar2, C1706a aVar) {
        C1745b.m6050a(eVar, "onSuccess is null");
        C1745b.m6050a(eVar2, "onError is null");
        C1745b.m6050a(aVar, "onComplete is null");
        return (C1690c) m6564c((E) new C1863b(eVar, eVar2, aVar));
    }
}
