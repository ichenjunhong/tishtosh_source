package p064c.p065a;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.p2692b.C53694b;
import org.p2692b.C53695c;
import org.p2692b.C53696d;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1706a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p071d.C1715j;
import p064c.p065a.p072e.p074b.C1723a;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p075c.C1753g;
import p064c.p065a.p072e.p077e.p079b.C1786aa;
import p064c.p065a.p072e.p077e.p079b.C1790ac;
import p064c.p065a.p072e.p077e.p079b.C1794ae;
import p064c.p065a.p072e.p077e.p079b.C1799b;
import p064c.p065a.p072e.p077e.p079b.C1811d;
import p064c.p065a.p072e.p077e.p079b.C1816f;
import p064c.p065a.p072e.p077e.p079b.C1818h;
import p064c.p065a.p072e.p077e.p079b.C1821i;
import p064c.p065a.p072e.p077e.p079b.C1824j;
import p064c.p065a.p072e.p077e.p079b.C1827l;
import p064c.p065a.p072e.p077e.p079b.C1828m.C1829a;
import p064c.p065a.p072e.p077e.p079b.C1832o;
import p064c.p065a.p072e.p077e.p079b.C1833p;
import p064c.p065a.p072e.p077e.p079b.C1836q;
import p064c.p065a.p072e.p077e.p079b.C1840r;
import p064c.p065a.p072e.p077e.p079b.C1842s;
import p064c.p065a.p072e.p077e.p079b.C1846u;
import p064c.p065a.p072e.p077e.p079b.C1854x;
import p064c.p065a.p072e.p077e.p079b.C1858z;
import p064c.p065a.p072e.p085h.C2114c;
import p064c.p065a.p072e.p085h.C2116e;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.h */
public abstract class C2149h<T> implements C53694b<T> {

    /* renamed from: b */
    static final int f6910b = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    /* renamed from: a */
    public static int m6447a() {
        return f6910b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo6264b(C53695c<? super T> cVar);

    /* renamed from: a */
    public final <R> R mo6448a(C2151i<T, ? extends R> iVar) {
        return ((C2151i) C1745b.m6050a(iVar, "converter is null")).mo6457a(this);
    }

    /* renamed from: a */
    public C2149h<T> mo6445a(C1710e<? super T> eVar, C1710e<? super Throwable> eVar2, C1706a aVar, C1706a aVar2) {
        C1745b.m6050a(eVar, "onNext is null");
        C1745b.m6050a(eVar2, "onError is null");
        C1745b.m6050a(aVar, "onComplete is null");
        C1745b.m6050a(aVar2, "onAfterTerminate is null");
        C1811d dVar = new C1811d(this, eVar, eVar2, aVar, aVar2);
        return C2150a.m6483a((C2149h<T>) dVar);
    }

    /* renamed from: a */
    public final C2149h<T> mo6444a(C1710e<? super T> eVar) {
        C1710e b = C1723a.m6037b();
        C1706a aVar = C1723a.f5844c;
        return mo6445a(eVar, b, aVar, aVar);
    }

    /* renamed from: a */
    public final C2149h<T> mo6447a(C1715j<? super T> jVar) {
        C1745b.m6050a(jVar, "predicate is null");
        return C2150a.m6483a((C2149h<T>) new C1818h<T>(this, jVar));
    }

    /* renamed from: a */
    public final <R> C2149h<R> mo6446a(C1711f<? super T, ? extends C53694b<? extends R>> fVar) {
        return m6450a(fVar, false, m6447a(), m6447a());
    }

    /* renamed from: a */
    public final C2149h<T> mo6443a(C1675ac acVar) {
        return m6449a(acVar, false, m6447a());
    }

    /* renamed from: a */
    public final C2149h<T> mo6440a(int i, boolean z, boolean z2) {
        C1745b.m6048a(i, "bufferSize");
        C1840r rVar = new C1840r(this, i, z2, false, C1723a.f5844c);
        return C2150a.m6483a((C2149h<T>) rVar);
    }

    /* renamed from: a */
    public final C2149h<T> mo6441a(long j, C1715j<? super Throwable> jVar) {
        if (j >= 0) {
            C1745b.m6050a(jVar, "predicate is null");
            return C2150a.m6483a((C2149h<T>) new C1854x<T>(this, j, jVar));
        }
        StringBuilder sb = new StringBuilder("times >= 0 required but it was ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final C2149h<T> mo6442a(long j, TimeUnit timeUnit, C1675ac acVar, boolean z) {
        C1745b.m6050a(timeUnit, "unit is null");
        C1745b.m6050a(acVar, "scheduler is null");
        C1858z zVar = new C1858z(this, j, timeUnit, acVar, true);
        return C2150a.m6483a((C2149h<T>) zVar);
    }

    /* renamed from: a */
    public final void mo336a(C53695c<? super T> cVar) {
        if (cVar instanceof C2177l) {
            mo6449a((C2177l) cVar);
            return;
        }
        C1745b.m6050a(cVar, "s is null");
        mo6449a((C2177l<? super T>) new C2116e<Object>(cVar));
    }

    /* renamed from: a */
    public final void mo6449a(C2177l<? super T> lVar) {
        C1745b.m6050a(lVar, "s is null");
        try {
            C53695c a = C2150a.m6490a(this, (C53695c<? super T>) lVar);
            C1745b.m6050a(a, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo6264b(a);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C1700b.m6017b(th);
            C2150a.m6492a(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: f */
    private static <T> C2149h<T> mo6458f() {
        return C2150a.m6483a(C1816f.f6004a);
    }

    /* renamed from: c */
    public final C2149h<T> mo6454c() {
        return C2150a.m6483a((C2149h<T>) new C1842s<T>(this));
    }

    /* renamed from: d */
    public final C2149h<T> mo6455d() {
        return C2150a.m6483a((C2149h<T>) new C1846u<T>(this));
    }

    /* renamed from: e */
    public final C2193n<T> mo6456e() {
        return C2150a.m6484a((C2193n<T>) new C1790ac<T>(this));
    }

    /* renamed from: b */
    public final C2149h<T> mo6451b() {
        return mo6440a(m6447a(), false, true);
    }

    /* renamed from: b */
    public final C1690c mo6450b(C1710e<? super T> eVar) {
        return mo6439a(eVar, C1723a.f5847f, C1723a.f5844c, (C1710e<? super C53696d>) C1829a.INSTANCE);
    }

    /* renamed from: b */
    public final C2149h<T> mo6452b(C1675ac acVar) {
        boolean z;
        C1745b.m6050a(acVar, "scheduler is null");
        if (!(this instanceof C1799b)) {
            z = true;
        } else {
            z = false;
        }
        return m6448a(acVar, z);
    }

    /* renamed from: a */
    public static <T> C2149h<T> m6451a(T t) {
        C1745b.m6050a(t, "item is null");
        return C2150a.m6483a((C2149h<T>) new C1832o<T>(t));
    }

    /* renamed from: b */
    public final <R> C2149h<R> mo6453b(C1711f<? super T, ? extends R> fVar) {
        C1745b.m6050a(fVar, "mapper is null");
        return C2150a.m6483a((C2149h<T>) new C1833p<T>(this, fVar));
    }

    /* renamed from: a */
    public static <T> C2149h<T> m6452a(Callable<? extends T> callable) {
        C1745b.m6050a(callable, "supplier is null");
        return C2150a.m6483a((C2149h<T>) new C1824j<T>(callable));
    }

    /* renamed from: a */
    public static <T> C2149h<T> m6453a(C53694b<? extends T> bVar) {
        if (bVar instanceof C2149h) {
            return C2150a.m6483a((C2149h) bVar);
        }
        C1745b.m6050a(bVar, "publisher is null");
        return C2150a.m6483a((C2149h<T>) new C1827l<T>(bVar));
    }

    /* renamed from: a */
    private C2149h<T> m6448a(C1675ac acVar, boolean z) {
        C1745b.m6050a(acVar, "scheduler is null");
        return C2150a.m6483a((C2149h<T>) new C1794ae<T>(this, acVar, z));
    }

    /* renamed from: a */
    public final C1690c mo6438a(C1710e<? super T> eVar, C1710e<? super Throwable> eVar2) {
        return mo6439a(eVar, eVar2, C1723a.f5844c, (C1710e<? super C53696d>) C1829a.INSTANCE);
    }

    /* renamed from: a */
    private C2149h<T> m6449a(C1675ac acVar, boolean z, int i) {
        C1745b.m6050a(acVar, "scheduler is null");
        C1745b.m6048a(i, "bufferSize");
        return C2150a.m6483a((C2149h<T>) new C1836q<T>(this, acVar, false, i));
    }

    /* renamed from: a */
    private <R> C2149h<R> m6450a(C1711f<? super T, ? extends C53694b<? extends R>> fVar, boolean z, int i, int i2) {
        C1745b.m6050a(fVar, "mapper is null");
        C1745b.m6048a(i, "maxConcurrency");
        C1745b.m6048a(i2, "bufferSize");
        if (this instanceof C1753g) {
            Object call = ((C1753g) this).call();
            if (call == null) {
                return mo6458f();
            }
            return C1786aa.m6079a(call, fVar);
        }
        C1821i iVar = new C1821i(this, fVar, false, i, i2);
        return C2150a.m6483a((C2149h<T>) iVar);
    }

    /* renamed from: a */
    public final C1690c mo6439a(C1710e<? super T> eVar, C1710e<? super Throwable> eVar2, C1706a aVar, C1710e<? super C53696d> eVar3) {
        C1745b.m6050a(eVar, "onNext is null");
        C1745b.m6050a(eVar2, "onError is null");
        C1745b.m6050a(aVar, "onComplete is null");
        C1745b.m6050a(eVar3, "onSubscribe is null");
        C2114c cVar = new C2114c(eVar, eVar2, aVar, eVar3);
        mo6449a((C2177l<? super T>) cVar);
        return cVar;
    }
}
