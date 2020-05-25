package p064c.p065a;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1706a;
import p064c.p065a.p071d.C1707b;
import p064c.p065a.p071d.C1708c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p071d.C1715j;
import p064c.p065a.p072e.p074b.C1723a;
import p064c.p065a.p072e.p074b.C1723a.C1726c;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p075c.C1753g;
import p064c.p065a.p072e.p076d.C1768m;
import p064c.p065a.p072e.p077e.p079b.C1825k;
import p064c.p065a.p072e.p077e.p079b.C1844t;
import p064c.p065a.p072e.p077e.p081d.C1897aa;
import p064c.p065a.p072e.p077e.p081d.C1898ab;
import p064c.p065a.p072e.p077e.p081d.C1902ac;
import p064c.p065a.p072e.p077e.p081d.C1906ae;
import p064c.p065a.p072e.p077e.p081d.C1916ai;
import p064c.p065a.p072e.p077e.p081d.C1917aj;
import p064c.p065a.p072e.p077e.p081d.C1919ak;
import p064c.p065a.p072e.p077e.p081d.C1921al;
import p064c.p065a.p072e.p077e.p081d.C1923am;
import p064c.p065a.p072e.p077e.p081d.C1925an;
import p064c.p065a.p072e.p077e.p081d.C1925an.C1928c;
import p064c.p065a.p072e.p077e.p081d.C1932ap;
import p064c.p065a.p072e.p077e.p081d.C1941as;
import p064c.p065a.p072e.p077e.p081d.C1944at;
import p064c.p065a.p072e.p077e.p081d.C1946au;
import p064c.p065a.p072e.p077e.p081d.C1948av;
import p064c.p065a.p072e.p077e.p081d.C1952ax;
import p064c.p065a.p072e.p077e.p081d.C1955ay;
import p064c.p065a.p072e.p077e.p081d.C1957az;
import p064c.p065a.p072e.p077e.p081d.C1959b;
import p064c.p065a.p072e.p077e.p081d.C1970bc;
import p064c.p065a.p072e.p077e.p081d.C1974be;
import p064c.p065a.p072e.p077e.p081d.C1976bf;
import p064c.p065a.p072e.p077e.p081d.C1982d;
import p064c.p065a.p072e.p077e.p081d.C1987e;
import p064c.p065a.p072e.p077e.p081d.C1989f;
import p064c.p065a.p072e.p077e.p081d.C1991g;
import p064c.p065a.p072e.p077e.p081d.C1995i;
import p064c.p065a.p072e.p077e.p081d.C2002k;
import p064c.p065a.p072e.p077e.p081d.C2004l;
import p064c.p065a.p072e.p077e.p081d.C2006m;
import p064c.p065a.p072e.p077e.p081d.C2008n;
import p064c.p065a.p072e.p077e.p081d.C2013q;
import p064c.p065a.p072e.p077e.p081d.C2015r;
import p064c.p065a.p072e.p077e.p081d.C2016s;
import p064c.p065a.p072e.p077e.p081d.C2017t;
import p064c.p065a.p072e.p077e.p081d.C2019u;
import p064c.p065a.p072e.p077e.p081d.C2022v;
import p064c.p065a.p072e.p077e.p081d.C2024w;
import p064c.p065a.p072e.p077e.p081d.C2026x;
import p064c.p065a.p072e.p077e.p081d.C2027y;
import p064c.p065a.p072e.p087j.C2125b;
import p064c.p065a.p072e.p087j.C2130g;
import p064c.p065a.p088f.C2143a;
import p064c.p065a.p088f.C2144b;
import p064c.p065a.p090h.C2150a;
import p064c.p065a.p093k.C2168a;

/* renamed from: c.a.v */
public abstract class C2201v<T> implements C2206z<T> {
    /* access modifiers changed from: protected */
    /* renamed from: a_ */
    public abstract void mo6311a_(C1674ab<? super T> abVar);

    /* renamed from: a */
    public static <T> C2201v<T> m6602a(C2206z<? extends T> zVar, C2206z<? extends T> zVar2) {
        C1745b.m6050a(zVar, "source1 is null");
        C1745b.m6050a(zVar2, "source2 is null");
        return m6608a((C2206z<? extends T>[]) new C2206z[]{zVar, zVar2});
    }

    /* renamed from: a */
    public static <T> C2201v<T> m6608a(C2206z<? extends T>... zVarArr) {
        return C2150a.m6486a((C2201v<T>) new C1982d<T>(m6609a((T[]) zVarArr), C1723a.m6033a(), m6590a(), C2130g.BOUNDARY));
    }

    /* renamed from: a */
    public static <T> C2201v<T> m6604a(Iterable<? extends C2206z<? extends T>> iterable) {
        return m6605a(iterable, m6590a(), m6590a());
    }

    /* renamed from: a */
    private static <T> C2201v<T> m6605a(Iterable<? extends C2206z<? extends T>> iterable, int i, int i2) {
        return m6613b(iterable).m6596a(C1723a.m6033a(), i, i2, false);
    }

    /* renamed from: a */
    public static <T> C2201v<T> m6601a(C2205y<T> yVar) {
        C1745b.m6050a(yVar, "source is null");
        return C2150a.m6486a((C2201v<T>) new C1989f<T>(yVar));
    }

    /* renamed from: a */
    public static <T> C2201v<T> m6606a(Throwable th) {
        C1745b.m6050a(th, "e is null");
        return m6615b(C1723a.m6036a(th));
    }

    /* renamed from: a */
    public static <T> C2201v<T> m6609a(T... tArr) {
        C1745b.m6050a(tArr, "items is null");
        if (tArr.length == 0) {
            return m6610b();
        }
        if (tArr.length == 1) {
            return m6614b(tArr[0]);
        }
        return C2150a.m6486a((C2201v<T>) new C2024w<T>(tArr));
    }

    /* renamed from: a */
    public static <T> C2201v<T> m6607a(Callable<? extends T> callable) {
        C1745b.m6050a(callable, "supplier is null");
        return C2150a.m6486a((C2201v<T>) new C2026x<T>(callable));
    }

    /* renamed from: a */
    public static <T1, T2, R> C2201v<R> m6603a(C2206z<? extends T1> zVar, C2206z<? extends T2> zVar2, C1707b<? super T1, ? super T2, ? extends R> bVar) {
        C1745b.m6050a(zVar, "source1 is null");
        C1745b.m6050a(zVar2, "source2 is null");
        return m6600a(C1723a.m6034a(bVar), false, m6590a(), (C2206z<? extends T>[]) new C2206z[]{zVar, zVar2});
    }

    /* renamed from: a */
    private static <T, R> C2201v<R> m6600a(C1711f<? super Object[], ? extends R> fVar, boolean z, int i, C2206z<? extends T>... zVarArr) {
        C1745b.m6050a(fVar, "zipper is null");
        C1745b.m6048a(i, "bufferSize");
        C1976bf bfVar = new C1976bf(zVarArr, null, fVar, i, false);
        return C2150a.m6486a((C2201v<T>) bfVar);
    }

    /* renamed from: a */
    public final <R> R mo6525a(C2203w<T, ? extends R> wVar) {
        return ((C2203w) C1745b.m6050a(wVar, "converter is null")).mo6553a(this);
    }

    /* renamed from: a */
    public final <R> C2201v<R> mo6513a(C1673aa<? super T, ? extends R> aaVar) {
        return m6618d(((C1673aa) C1745b.m6050a(aaVar, "composer is null")).mo6134a(this));
    }

    /* renamed from: a */
    public final C2201v<T> mo6511a(long j, TimeUnit timeUnit, C1675ac acVar) {
        return mo6512a(j, timeUnit, acVar, false);
    }

    /* renamed from: a */
    public final C2201v<T> mo6512a(long j, TimeUnit timeUnit, C1675ac acVar, boolean z) {
        C1745b.m6050a(timeUnit, "unit is null");
        C1745b.m6050a(acVar, "scheduler is null");
        C1995i iVar = new C1995i(this, j, timeUnit, acVar, z);
        return C2150a.m6486a((C2201v<T>) iVar);
    }

    /* renamed from: a */
    public final C2201v<T> mo6517a(C1708c<? super T, ? super T> cVar) {
        C1745b.m6050a(cVar, "comparer is null");
        return C2150a.m6486a((C2201v<T>) new C2002k<T>(this, C1723a.m6033a(), cVar));
    }

    /* renamed from: a */
    public final C2201v<T> mo6518a(C1710e<? super T> eVar) {
        C1745b.m6050a(eVar, "onAfterNext is null");
        return C2150a.m6486a((C2201v<T>) new C2004l<T>(this, eVar));
    }

    /* renamed from: a */
    public final C2201v<T> mo6516a(C1706a aVar) {
        return mo6519a(C1723a.m6037b(), C1723a.m6037b(), aVar, C1723a.f5844c);
    }

    /* renamed from: a */
    public C2201v<T> mo6519a(C1710e<? super T> eVar, C1710e<? super Throwable> eVar2, C1706a aVar, C1706a aVar2) {
        C1745b.m6050a(eVar, "onNext is null");
        C1745b.m6050a(eVar2, "onError is null");
        C1745b.m6050a(aVar, "onComplete is null");
        C1745b.m6050a(aVar2, "onAfterTerminate is null");
        C2006m mVar = new C2006m(this, eVar, eVar2, aVar, aVar2);
        return C2150a.m6486a((C2201v<T>) mVar);
    }

    /* renamed from: b */
    public final C2201v<T> mo6530b(C1710e<? super C2200u<T>> eVar) {
        C1745b.m6050a(eVar, "consumer is null");
        return mo6519a(C1723a.m6032a(eVar), C1723a.m6038b(eVar), C1723a.m6040c(eVar), C1723a.f5844c);
    }

    /* renamed from: a */
    public final C2201v<T> mo6522a(C1715j<? super T> jVar) {
        C1745b.m6050a(jVar, "predicate is null");
        return C2150a.m6486a((C2201v<T>) new C2017t<T>(this, jVar));
    }

    /* renamed from: a */
    public final <R> C2201v<R> mo6520a(C1711f<? super T, ? extends C2206z<? extends R>> fVar) {
        return m6598a(fVar, false);
    }

    /* renamed from: a */
    public final <R> C2201v<R> mo6521a(C1711f<? super T, ? extends C2206z<? extends R>> fVar, boolean z, int i) {
        return m6599a(fVar, z, i, m6590a());
    }

    /* renamed from: a */
    private <R> C2201v<R> m6599a(C1711f<? super T, ? extends C2206z<? extends R>> fVar, boolean z, int i, int i2) {
        C1745b.m6050a(fVar, "mapper is null");
        C1745b.m6048a(i, "maxConcurrency");
        C1745b.m6048a(i2, "bufferSize");
        if (this instanceof C1753g) {
            Object call = ((C1753g) this).call();
            if (call == null) {
                return m6610b();
            }
            return C1941as.m6237a(call, fVar);
        }
        C2019u uVar = new C2019u(this, fVar, z, i, i2);
        return C2150a.m6486a((C2201v<T>) uVar);
    }

    /* renamed from: b */
    public final <U> C2201v<U> mo6531b(C1711f<? super T, ? extends Iterable<? extends U>> fVar) {
        C1745b.m6050a(fVar, "mapper is null");
        return C2150a.m6486a((C2201v<T>) new C2022v<T>(this, fVar));
    }

    /* renamed from: a */
    public final C2201v<T> mo6514a(C1675ac acVar) {
        return mo6515a(acVar, false, m6590a());
    }

    /* renamed from: a */
    public final C2201v<T> mo6515a(C1675ac acVar, boolean z, int i) {
        C1745b.m6050a(acVar, "scheduler is null");
        C1745b.m6048a(i, "bufferSize");
        return C2150a.m6486a((C2201v<T>) new C1919ak<T>(this, acVar, z, i));
    }

    /* renamed from: a */
    public final <U> C2201v<U> mo6524a(Class<U> cls) {
        C1745b.m6050a(cls, "clazz is null");
        return mo6522a(C1723a.m6035a(cls)).m6612b(cls);
    }

    /* renamed from: a */
    public final C2201v<T> mo6523a(C2206z<? extends T> zVar) {
        C1745b.m6050a(zVar, "next is null");
        return mo6544e(C1723a.m6039b(zVar));
    }

    /* renamed from: b */
    public final C2201v<T> mo6532b(C2206z<? extends T> zVar) {
        C1745b.m6050a(zVar, "next is null");
        return C2150a.m6486a((C2201v<T>) new C1921al<T>(this, C1723a.m6039b(zVar), true));
    }

    /* renamed from: a */
    public final C2201v<T> mo6510a(long j, C1715j<? super Throwable> jVar) {
        if (j >= 0) {
            C1745b.m6050a(jVar, "predicate is null");
            return C2150a.m6486a((C2201v<T>) new C1932ap<T>(this, j, jVar));
        }
        StringBuilder sb = new StringBuilder("times >= 0 required but it was ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final C2201v<T> mo6509a(long j) {
        return C2150a.m6486a((C2201v<T>) new C1948av<T>(this, 1));
    }

    /* renamed from: a */
    public final C1690c mo6505a(C1710e<? super T> eVar, C1710e<? super Throwable> eVar2) {
        return mo6507a(eVar, eVar2, C1723a.f5844c, C1723a.m6037b());
    }

    /* renamed from: a */
    public final C1690c mo6506a(C1710e<? super T> eVar, C1710e<? super Throwable> eVar2, C1706a aVar) {
        return mo6507a(eVar, eVar2, aVar, C1723a.m6037b());
    }

    /* renamed from: a */
    public final C1690c mo6507a(C1710e<? super T> eVar, C1710e<? super Throwable> eVar2, C1706a aVar, C1710e<? super C1690c> eVar3) {
        C1745b.m6050a(eVar, "onNext is null");
        C1745b.m6050a(eVar2, "onError is null");
        C1745b.m6050a(aVar, "onComplete is null");
        C1745b.m6050a(eVar3, "onSubscribe is null");
        C1768m mVar = new C1768m(eVar, eVar2, aVar, eVar3);
        mo6314a((C1674ab<? super T>) mVar);
        return mVar;
    }

    /* renamed from: a */
    public final void mo6314a(C1674ab<? super T> abVar) {
        C1745b.m6050a(abVar, "observer is null");
        try {
            C1674ab a = C2150a.m6476a(this, abVar);
            C1745b.m6050a(a, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo6311a_(a);
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

    /* renamed from: a */
    public final C2149h<T> mo6508a(C1663a aVar) {
        C1825k kVar = new C1825k(this);
        switch (aVar) {
            case DROP:
                return kVar.mo6454c();
            case LATEST:
                return kVar.mo6455d();
            case MISSING:
                return kVar;
            case ERROR:
                return C2150a.m6483a((C2149h<T>) new C1844t<T>(kVar));
            default:
                return kVar.mo6451b();
        }
    }

    /* renamed from: a */
    public static int m6590a() {
        return C2149h.m6447a();
    }

    /* renamed from: b */
    public static <T> C2201v<T> m6610b() {
        return C2150a.m6486a(C2015r.f6600a);
    }

    /* renamed from: d */
    public final C1680ad<T> mo6538d() {
        return m6616c(0);
    }

    /* renamed from: k */
    public final C1680ad<List<T>> mo6552k() {
        return m6591a(16);
    }

    /* renamed from: e */
    public final C2201v<T> mo6542e() {
        return C2150a.m6486a((C2201v<T>) new C1902ac<T>(this));
    }

    /* renamed from: g */
    public final C2201v<T> mo6548g() {
        return mo6437l().mo6437l();
    }

    /* renamed from: h */
    public final C2193n<T> mo6549h() {
        return C2150a.m6484a((C2193n<T>) new C1944at<T>(this));
    }

    /* renamed from: i */
    public final C1680ad<T> mo6550i() {
        return C2150a.m6480a((C1680ad<T>) new C1946au<T>(this, null));
    }

    /* renamed from: l */
    private C2143a<T> mo6437l() {
        AtomicReference atomicReference = new AtomicReference();
        C1925an anVar = new C1925an(new C1928c(atomicReference), this, atomicReference);
        C1711f<? super C2143a, ? extends C2143a> fVar = C2150a.f6923m;
        if (fVar != null) {
            return (C2143a) C2150a.m6488a(fVar, anVar);
        }
        return anVar;
    }

    /* renamed from: f */
    public final C1687b mo6546f() {
        return C2150a.m6482a((C1687b) new C1906ae(this));
    }

    /* renamed from: j */
    public final C1690c mo6551j() {
        return mo6507a(C1723a.m6037b(), C1723a.f5847f, C1723a.f5844c, C1723a.m6037b());
    }

    /* renamed from: c */
    public final C2201v<T> mo6533c() {
        return m6619g(C1723a.m6033a());
    }

    /* renamed from: b */
    public final <E extends C1674ab<? super T>> E mo6526b(E e) {
        mo6314a((C1674ab<? super T>) e);
        return e;
    }

    /* renamed from: e */
    public final C2201v<T> mo6543e(C1710e<? super C1690c> eVar) {
        return m6595a(eVar, C1723a.f5844c);
    }

    /* renamed from: b */
    private <U> C2201v<U> m6612b(Class<U> cls) {
        C1745b.m6050a(cls, "clazz is null");
        return mo6541d((C1711f<? super T, ? extends R>) new C1726c<Object,Object>(cls));
    }

    /* renamed from: c */
    private C1680ad<T> m6616c(long j) {
        return C2150a.m6480a((C1680ad<T>) new C2013q<T>(this, 0, null));
    }

    /* renamed from: f */
    public final C1690c mo6545f(C1710e<? super T> eVar) {
        return mo6507a(eVar, C1723a.f5847f, C1723a.f5844c, C1723a.m6037b());
    }

    /* renamed from: a */
    private C1680ad<List<T>> m6591a(int i) {
        C1745b.m6048a(16, "capacityHint");
        return C2150a.m6480a((C1680ad<T>) new C1974be<T>(this, 16));
    }

    /* renamed from: d */
    private static <T> C2201v<T> m6618d(C2206z<T> zVar) {
        C1745b.m6050a(zVar, "source is null");
        if (zVar instanceof C2201v) {
            return C2150a.m6486a((C2201v) zVar);
        }
        return C2150a.m6486a((C2201v<T>) new C1897aa<T>(zVar));
    }

    /* renamed from: g */
    private <K> C2201v<T> m6619g(C1711f<? super T, K> fVar) {
        C1745b.m6050a(fVar, "keySelector is null");
        return C2150a.m6486a((C2201v<T>) new C2002k<T>(this, fVar, C1745b.m6049a()));
    }

    /* renamed from: e */
    public final C2201v<T> mo6544e(C1711f<? super Throwable, ? extends C2206z<? extends T>> fVar) {
        C1745b.m6050a(fVar, "resumeFunction is null");
        return C2150a.m6486a((C2201v<T>) new C1921al<T>(this, fVar, false));
    }

    /* renamed from: b */
    public static <T> C2201v<T> m6613b(Iterable<? extends T> iterable) {
        C1745b.m6050a(iterable, "source is null");
        return C2150a.m6486a((C2201v<T>) new C2027y<T>(iterable));
    }

    /* renamed from: d */
    public final C2201v<T> mo6540d(C1710e<? super T> eVar) {
        C1710e b = C1723a.m6037b();
        C1706a aVar = C1723a.f5844c;
        return mo6519a(eVar, b, aVar, aVar);
    }

    /* renamed from: f */
    public final C2201v<T> mo6547f(C1711f<? super Throwable, ? extends T> fVar) {
        C1745b.m6050a(fVar, "valueSupplier is null");
        return C2150a.m6486a((C2201v<T>) new C1923am<T>(this, fVar));
    }

    /* renamed from: b */
    public static <T> C2201v<T> m6614b(T t) {
        C1745b.m6050a(t, "The item is null");
        return C2150a.m6486a((C2201v<T>) new C1916ai<T>(t));
    }

    /* renamed from: d */
    public final <R> C2201v<R> mo6541d(C1711f<? super T, ? extends R> fVar) {
        C1745b.m6050a(fVar, "mapper is null");
        return C2150a.m6486a((C2201v<T>) new C1917aj<T>(this, fVar));
    }

    /* renamed from: b */
    private static <T> C2201v<T> m6615b(Callable<? extends Throwable> callable) {
        C1745b.m6050a(callable, "errorSupplier is null");
        return C2150a.m6486a((C2201v<T>) new C2016s<T>(callable));
    }

    /* renamed from: c */
    public final C2201v<T> mo6535c(C1710e<? super Throwable> eVar) {
        C1710e b = C1723a.m6037b();
        C1706a aVar = C1723a.f5844c;
        return mo6519a(b, eVar, aVar, aVar);
    }

    /* renamed from: b */
    public final C2201v<T> mo6527b(long j) {
        if (j >= 0) {
            return C2150a.m6486a((C2201v<T>) new C1957az<T>(this, j));
        }
        StringBuilder sb = new StringBuilder("count >= 0 required but it was ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: c */
    public final <K> C2201v<C2144b<K, T>> mo6536c(C1711f<? super T, ? extends K> fVar) {
        return m6597a(fVar, C1723a.m6033a(), false, m6590a());
    }

    /* renamed from: c */
    public final C2201v<T> mo6537c(C2206z<? extends T> zVar) {
        C1745b.m6050a(zVar, "other is null");
        return C2150a.m6486a((C2201v<T>) new C1955ay<T>(this, zVar));
    }

    /* renamed from: b */
    public final C2201v<T> mo6529b(C1675ac acVar) {
        C1745b.m6050a(acVar, "scheduler is null");
        return C2150a.m6486a((C2201v<T>) new C1952ax<T>(this, acVar));
    }

    /* renamed from: a */
    public static C2201v<Long> m6592a(long j, TimeUnit timeUnit) {
        return m6611b(j, timeUnit, C2168a.m6519a());
    }

    /* renamed from: d */
    public final C2201v<T> mo6539d(long j, TimeUnit timeUnit) {
        return mo6512a(j, timeUnit, C2168a.m6519a(), false);
    }

    /* renamed from: c */
    public final C2201v<T> mo6534c(long j, TimeUnit timeUnit) {
        return m6617c(j, timeUnit, C2168a.m6519a());
    }

    /* renamed from: a */
    private C2201v<T> m6595a(C1710e<? super C1690c> eVar, C1706a aVar) {
        C1745b.m6050a(eVar, "onSubscribe is null");
        C1745b.m6050a(aVar, "onDispose is null");
        return C2150a.m6486a((C2201v<T>) new C2008n<T>(this, eVar, aVar));
    }

    /* renamed from: b */
    public final C2201v<List<T>> mo6528b(long j, TimeUnit timeUnit) {
        return m6593a(j, timeUnit, C2168a.m6519a(), Integer.MAX_VALUE);
    }

    /* renamed from: a */
    private <R> C2201v<R> m6598a(C1711f<? super T, ? extends C2206z<? extends R>> fVar, boolean z) {
        return mo6521a(fVar, false, Integer.MAX_VALUE);
    }

    /* renamed from: b */
    private static C2201v<Long> m6611b(long j, TimeUnit timeUnit, C1675ac acVar) {
        C1745b.m6050a(timeUnit, "unit is null");
        C1745b.m6050a(acVar, "scheduler is null");
        return C2150a.m6486a((C2201v<T>) new C1970bc<T>(Math.max(j, 0), timeUnit, acVar));
    }

    /* renamed from: c */
    private C2201v<T> m6617c(long j, TimeUnit timeUnit, C1675ac acVar) {
        C1745b.m6050a(timeUnit, "unit is null");
        C1745b.m6050a(acVar, "scheduler is null");
        C1991g gVar = new C1991g(this, j, timeUnit, acVar);
        return C2150a.m6486a((C2201v<T>) gVar);
    }

    /* renamed from: a */
    private C2201v<List<T>> m6593a(long j, TimeUnit timeUnit, C1675ac acVar, int i) {
        return m6594a(j, timeUnit, acVar, Integer.MAX_VALUE, C2125b.asCallable(), false);
    }

    /* renamed from: a */
    private <R> C2201v<R> m6596a(C1711f<? super T, ? extends C2206z<? extends R>> fVar, int i, int i2, boolean z) {
        C1745b.m6050a(fVar, "mapper is null");
        C1745b.m6048a(i, "maxConcurrency");
        C1745b.m6048a(i2, "prefetch");
        C1987e eVar = new C1987e(this, fVar, C2130g.BOUNDARY, i, i2);
        return C2150a.m6486a((C2201v<T>) eVar);
    }

    /* renamed from: a */
    private <K, V> C2201v<C2144b<K, V>> m6597a(C1711f<? super T, ? extends K> fVar, C1711f<? super T, ? extends V> fVar2, boolean z, int i) {
        C1745b.m6050a(fVar, "keySelector is null");
        C1745b.m6050a(fVar2, "valueSelector is null");
        C1745b.m6048a(i, "bufferSize");
        C1898ab abVar = new C1898ab(this, fVar, fVar2, i, false);
        return C2150a.m6486a((C2201v<T>) abVar);
    }

    /* renamed from: a */
    private <U extends Collection<? super T>> C2201v<U> m6594a(long j, TimeUnit timeUnit, C1675ac acVar, int i, Callable<U> callable, boolean z) {
        TimeUnit timeUnit2 = timeUnit;
        C1745b.m6050a(timeUnit, "unit is null");
        C1675ac acVar2 = acVar;
        C1745b.m6050a(acVar2, "scheduler is null");
        Callable<U> callable2 = callable;
        C1745b.m6050a(callable2, "bufferSupplier is null");
        int i2 = i;
        C1745b.m6048a(i2, "count");
        C1959b bVar = new C1959b(this, j, j, timeUnit2, acVar2, callable2, i2, false);
        return C2150a.m6486a((C2201v<T>) bVar);
    }
}
