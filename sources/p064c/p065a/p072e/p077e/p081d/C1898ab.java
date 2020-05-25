package p064c.p065a.p072e.p077e.p081d;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1674ab;
import p064c.p065a.C2206z;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p072e.p073a.C1719c;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p083f.C2072c;
import p064c.p065a.p088f.C2144b;

/* renamed from: c.a.e.e.d.ab */
public final class C1898ab<T, K, V> extends C1896a<T, C2144b<K, V>> {

    /* renamed from: b */
    final C1711f<? super T, ? extends K> f6204b;

    /* renamed from: c */
    final C1711f<? super T, ? extends V> f6205c;

    /* renamed from: d */
    final int f6206d;

    /* renamed from: e */
    final boolean f6207e;

    /* renamed from: c.a.e.e.d.ab$a */
    public static final class C1899a<T, K, V> extends AtomicInteger implements C1674ab<T>, C1690c {

        /* renamed from: g */
        static final Object f6208g = new Object();
        private static final long serialVersionUID = -3688291656102519502L;

        /* renamed from: a */
        final C1674ab<? super C2144b<K, V>> f6209a;

        /* renamed from: b */
        final C1711f<? super T, ? extends K> f6210b;

        /* renamed from: c */
        final C1711f<? super T, ? extends V> f6211c;

        /* renamed from: d */
        final int f6212d;

        /* renamed from: e */
        final boolean f6213e;

        /* renamed from: f */
        final Map<Object, C1900b<K, V>> f6214f;

        /* renamed from: h */
        C1690c f6215h;

        /* renamed from: i */
        final AtomicBoolean f6216i = new AtomicBoolean();

        public final boolean isDisposed() {
            return this.f6216i.get();
        }

        public final void dispose() {
            if (this.f6216i.compareAndSet(false, true) && decrementAndGet() == 0) {
                this.f6215h.dispose();
            }
        }

        public final void onComplete() {
            ArrayList<C1900b> arrayList = new ArrayList<>(this.f6214f.values());
            this.f6214f.clear();
            for (C1900b bVar : arrayList) {
                C1901c<T, K> cVar = bVar.f6217a;
                cVar.f6222e = true;
                cVar.mo6313a();
            }
            this.f6209a.onComplete();
        }

        public final void onSubscribe(C1690c cVar) {
            if (C1718b.validate(this.f6215h, cVar)) {
                this.f6215h = cVar;
                this.f6209a.onSubscribe(this);
            }
        }

        public final void cancel(K k) {
            if (k == null) {
                k = f6208g;
            }
            this.f6214f.remove(k);
            if (decrementAndGet() == 0) {
                this.f6215h.dispose();
            }
        }

        public final void onError(Throwable th) {
            ArrayList<C1900b> arrayList = new ArrayList<>(this.f6214f.values());
            this.f6214f.clear();
            for (C1900b bVar : arrayList) {
                C1901c<T, K> cVar = bVar.f6217a;
                cVar.f6223f = th;
                cVar.f6222e = true;
                cVar.mo6313a();
            }
            this.f6209a.onError(th);
        }

        public final void onNext(T t) {
            Object obj;
            try {
                Object apply = this.f6210b.apply(t);
                if (apply != null) {
                    obj = apply;
                } else {
                    obj = f6208g;
                }
                C1900b bVar = (C1900b) this.f6214f.get(obj);
                if (bVar == null) {
                    if (!this.f6216i.get()) {
                        bVar = C1900b.m6200a(apply, this.f6212d, this, this.f6213e);
                        this.f6214f.put(obj, bVar);
                        getAndIncrement();
                        this.f6209a.onNext(bVar);
                    } else {
                        return;
                    }
                }
                try {
                    Object a = C1745b.m6050a(this.f6211c.apply(t), "The value supplied is null");
                    C1901c<T, K> cVar = bVar.f6217a;
                    cVar.f6219b.offer(a);
                    cVar.mo6313a();
                } catch (Throwable th) {
                    C1700b.m6017b(th);
                    this.f6215h.dispose();
                    onError(th);
                }
            } catch (Throwable th2) {
                C1700b.m6017b(th2);
                this.f6215h.dispose();
                onError(th2);
            }
        }

        public C1899a(C1674ab<? super C2144b<K, V>> abVar, C1711f<? super T, ? extends K> fVar, C1711f<? super T, ? extends V> fVar2, int i, boolean z) {
            this.f6209a = abVar;
            this.f6210b = fVar;
            this.f6211c = fVar2;
            this.f6212d = i;
            this.f6213e = z;
            this.f6214f = new ConcurrentHashMap();
            lazySet(1);
        }
    }

    /* renamed from: c.a.e.e.d.ab$b */
    static final class C1900b<K, T> extends C2144b<K, T> {

        /* renamed from: a */
        final C1901c<T, K> f6217a;

        /* renamed from: a_ */
        public final void mo6311a_(C1674ab<? super T> abVar) {
            this.f6217a.mo6314a(abVar);
        }

        private C1900b(K k, C1901c<T, K> cVar) {
            super(k);
            this.f6217a = cVar;
        }

        /* renamed from: a */
        public static <T, K> C1900b<K, T> m6200a(K k, int i, C1899a<?, K, T> aVar, boolean z) {
            return new C1900b<>(k, new C1901c(i, aVar, k, z));
        }
    }

    /* renamed from: c.a.e.e.d.ab$c */
    static final class C1901c<T, K> extends AtomicInteger implements C1690c, C2206z<T> {
        private static final long serialVersionUID = -3852313036005250360L;

        /* renamed from: a */
        final K f6218a;

        /* renamed from: b */
        final C2072c<T> f6219b;

        /* renamed from: c */
        final C1899a<?, K, T> f6220c;

        /* renamed from: d */
        final boolean f6221d;

        /* renamed from: e */
        volatile boolean f6222e;

        /* renamed from: f */
        Throwable f6223f;

        /* renamed from: g */
        final AtomicBoolean f6224g = new AtomicBoolean();

        /* renamed from: h */
        final AtomicBoolean f6225h = new AtomicBoolean();

        /* renamed from: i */
        final AtomicReference<C1674ab<? super T>> f6226i = new AtomicReference<>();

        public final boolean isDisposed() {
            return this.f6224g.get();
        }

        public final void dispose() {
            if (this.f6224g.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.f6226i.lazySet(null);
                this.f6220c.cancel(this.f6218a);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6313a() {
            boolean z;
            if (getAndIncrement() == 0) {
                C2072c<T> cVar = this.f6219b;
                boolean z2 = this.f6221d;
                C1674ab abVar = (C1674ab) this.f6226i.get();
                int i = 1;
                while (true) {
                    if (abVar != null) {
                        while (true) {
                            boolean z3 = this.f6222e;
                            Object poll = cVar.poll();
                            if (poll == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!m6202a(z3, z, abVar, z2)) {
                                if (z) {
                                    break;
                                }
                                abVar.onNext(poll);
                            } else {
                                return;
                            }
                        }
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                    if (abVar == null) {
                        abVar = (C1674ab) this.f6226i.get();
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo6314a(C1674ab<? super T> abVar) {
            if (this.f6225h.compareAndSet(false, true)) {
                abVar.onSubscribe(this);
                this.f6226i.lazySet(abVar);
                if (this.f6224g.get()) {
                    this.f6226i.lazySet(null);
                } else {
                    mo6313a();
                }
            } else {
                C1719c.error((Throwable) new IllegalStateException("Only one Observer allowed!"), abVar);
            }
        }

        C1901c(int i, C1899a<?, K, T> aVar, K k, boolean z) {
            this.f6219b = new C2072c<>(i);
            this.f6220c = aVar;
            this.f6218a = k;
            this.f6221d = z;
        }

        /* renamed from: a */
        private boolean m6202a(boolean z, boolean z2, C1674ab<? super T> abVar, boolean z3) {
            if (this.f6224g.get()) {
                this.f6219b.clear();
                this.f6220c.cancel(this.f6218a);
                this.f6226i.lazySet(null);
                return true;
            }
            if (z) {
                if (!z3) {
                    Throwable th = this.f6223f;
                    if (th != null) {
                        this.f6219b.clear();
                        this.f6226i.lazySet(null);
                        abVar.onError(th);
                        return true;
                    } else if (z2) {
                        this.f6226i.lazySet(null);
                        abVar.onComplete();
                        return true;
                    }
                } else if (z2) {
                    Throwable th2 = this.f6223f;
                    this.f6226i.lazySet(null);
                    if (th2 != null) {
                        abVar.onError(th2);
                    } else {
                        abVar.onComplete();
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super C2144b<K, V>> abVar) {
        C2206z zVar = this.f6202a;
        C1899a aVar = new C1899a(abVar, this.f6204b, this.f6205c, this.f6206d, this.f6207e);
        zVar.mo6314a(aVar);
    }

    public C1898ab(C2206z<T> zVar, C1711f<? super T, ? extends K> fVar, C1711f<? super T, ? extends V> fVar2, int i, boolean z) {
        super(zVar);
        this.f6204b = fVar;
        this.f6205c = fVar2;
        this.f6206d = i;
        this.f6207e = z;
    }
}
