package p064c.p065a.p072e.p077e.p079b;

import java.util.concurrent.atomic.AtomicLong;
import org.p2692b.C53695c;
import org.p2692b.C53696d;
import p064c.p065a.C1675ac;
import p064c.p065a.C1675ac.C1678c;
import p064c.p065a.C2149h;
import p064c.p065a.C2177l;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p070c.C1701c;
import p064c.p065a.p072e.p075c.C1747a;
import p064c.p065a.p072e.p075c.C1752f;
import p064c.p065a.p072e.p075c.C1755i;
import p064c.p065a.p072e.p083f.C2071b;
import p064c.p065a.p072e.p086i.C2117a;
import p064c.p065a.p072e.p086i.C2122f;
import p064c.p065a.p072e.p087j.C2127d;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.b.q */
public final class C1836q<T> extends C1785a<T, T> {

    /* renamed from: c */
    final C1675ac f6057c;

    /* renamed from: d */
    final boolean f6058d;

    /* renamed from: e */
    final int f6059e;

    /* renamed from: c.a.e.e.b.q$a */
    static abstract class C1837a<T> extends C2117a<T> implements C2177l<T>, Runnable {
        private static final long serialVersionUID = -8241002408341274697L;

        /* renamed from: a */
        final C1678c f6060a;

        /* renamed from: b */
        final boolean f6061b;

        /* renamed from: c */
        final int f6062c;

        /* renamed from: d */
        final int f6063d;

        /* renamed from: e */
        final AtomicLong f6064e = new AtomicLong();

        /* renamed from: f */
        C53696d f6065f;

        /* renamed from: g */
        C1755i<T> f6066g;

        /* renamed from: h */
        volatile boolean f6067h;

        /* renamed from: i */
        volatile boolean f6068i;

        /* renamed from: j */
        Throwable f6069j;

        /* renamed from: k */
        int f6070k;

        /* renamed from: l */
        long f6071l;

        /* renamed from: m */
        boolean f6072m;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo6291a();

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract void mo6293b();

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public abstract void mo6294c();

        public final void clear() {
            this.f6066g.clear();
        }

        public final boolean isEmpty() {
            return this.f6066g.isEmpty();
        }

        /* renamed from: d */
        private void m6144d() {
            if (getAndIncrement() == 0) {
                this.f6060a.mo6144a((Runnable) this);
            }
        }

        public final void onComplete() {
            if (!this.f6068i) {
                this.f6068i = true;
                m6144d();
            }
        }

        public final void cancel() {
            if (!this.f6067h) {
                this.f6067h = true;
                this.f6065f.cancel();
                this.f6060a.dispose();
                if (getAndIncrement() == 0) {
                    this.f6066g.clear();
                }
            }
        }

        public final void run() {
            if (this.f6072m) {
                mo6291a();
            } else if (this.f6070k == 1) {
                mo6293b();
            } else {
                mo6294c();
            }
        }

        public final void request(long j) {
            if (C2122f.validate(j)) {
                C2127d.m6415a(this.f6064e, j);
                m6144d();
            }
        }

        public final int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f6072m = true;
            return 2;
        }

        public final void onError(Throwable th) {
            if (this.f6068i) {
                C2150a.m6492a(th);
                return;
            }
            this.f6069j = th;
            this.f6068i = true;
            m6144d();
        }

        public final void onNext(T t) {
            if (!this.f6068i) {
                if (this.f6070k == 2) {
                    m6144d();
                    return;
                }
                if (!this.f6066g.offer(t)) {
                    this.f6065f.cancel();
                    this.f6069j = new C1701c("Queue is full?!");
                    this.f6068i = true;
                }
                m6144d();
            }
        }

        C1837a(C1678c cVar, boolean z, int i) {
            this.f6060a = cVar;
            this.f6061b = z;
            this.f6062c = i;
            this.f6063d = i - (i >> 2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo6292a(boolean z, boolean z2, C53695c<?> cVar) {
            if (this.f6067h) {
                clear();
                return true;
            }
            if (z) {
                if (!this.f6061b) {
                    Throwable th = this.f6069j;
                    if (th != null) {
                        this.f6067h = true;
                        clear();
                        cVar.onError(th);
                        this.f6060a.dispose();
                        return true;
                    } else if (z2) {
                        this.f6067h = true;
                        cVar.onComplete();
                        this.f6060a.dispose();
                        return true;
                    }
                } else if (z2) {
                    this.f6067h = true;
                    Throwable th2 = this.f6069j;
                    if (th2 != null) {
                        cVar.onError(th2);
                    } else {
                        cVar.onComplete();
                    }
                    this.f6060a.dispose();
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: c.a.e.e.b.q$b */
    static final class C1838b<T> extends C1837a<T> {
        private static final long serialVersionUID = 644624475404284533L;

        /* renamed from: n */
        final C1747a<? super T> f6073n;

        /* renamed from: o */
        long f6074o;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6291a() {
            int i = 1;
            while (!this.f6067h) {
                boolean z = this.f6068i;
                this.f6073n.onNext(null);
                if (z) {
                    this.f6067h = true;
                    Throwable th = this.f6069j;
                    if (th != null) {
                        this.f6073n.onError(th);
                    } else {
                        this.f6073n.onComplete();
                    }
                    this.f6060a.dispose();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        public final T poll() throws Exception {
            T poll = this.f6066g.poll();
            if (!(poll == null || this.f6070k == 1)) {
                long j = this.f6074o + 1;
                if (j == ((long) this.f6063d)) {
                    this.f6074o = 0;
                    this.f6065f.request(j);
                } else {
                    this.f6074o = j;
                }
            }
            return poll;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo6293b() {
            C1747a<? super T> aVar = this.f6073n;
            C1755i iVar = this.f6066g;
            long j = this.f6071l;
            int i = 1;
            while (true) {
                long j2 = this.f6064e.get();
                while (j != j2) {
                    try {
                        Object poll = iVar.poll();
                        if (!this.f6067h) {
                            if (poll == null) {
                                this.f6067h = true;
                                aVar.onComplete();
                                this.f6060a.dispose();
                                return;
                            } else if (aVar.mo6227a(poll)) {
                                j++;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C1700b.m6017b(th);
                        this.f6067h = true;
                        this.f6065f.cancel();
                        aVar.onError(th);
                        this.f6060a.dispose();
                        return;
                    }
                }
                if (!this.f6067h) {
                    if (iVar.isEmpty()) {
                        this.f6067h = true;
                        aVar.onComplete();
                        this.f6060a.dispose();
                        return;
                    }
                    int i2 = get();
                    if (i == i2) {
                        this.f6071l = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo6294c() {
            boolean z;
            C1747a<? super T> aVar = this.f6073n;
            C1755i iVar = this.f6066g;
            long j = this.f6071l;
            long j2 = this.f6074o;
            int i = 1;
            while (true) {
                long j3 = this.f6064e.get();
                while (j != j3) {
                    boolean z2 = this.f6068i;
                    try {
                        Object poll = iVar.poll();
                        if (poll == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!mo6292a(z2, z, aVar)) {
                            if (z) {
                                break;
                            }
                            if (aVar.mo6227a(poll)) {
                                j++;
                            }
                            j2++;
                            if (j2 == ((long) this.f6063d)) {
                                this.f6065f.request(j2);
                                j2 = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C1700b.m6017b(th);
                        this.f6067h = true;
                        this.f6065f.cancel();
                        iVar.clear();
                        aVar.onError(th);
                        this.f6060a.dispose();
                        return;
                    }
                }
                if (j != j3 || !mo6292a(this.f6068i, iVar.isEmpty(), aVar)) {
                    int i2 = get();
                    if (i == i2) {
                        this.f6071l = j;
                        this.f6074o = j2;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        public final void onSubscribe(C53696d dVar) {
            if (C2122f.validate(this.f6065f, dVar)) {
                this.f6065f = dVar;
                if (dVar instanceof C1752f) {
                    C1752f fVar = (C1752f) dVar;
                    int requestFusion = fVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.f6070k = 1;
                        this.f6066g = fVar;
                        this.f6068i = true;
                        this.f6073n.onSubscribe(this);
                        return;
                    } else if (requestFusion == 2) {
                        this.f6070k = 2;
                        this.f6066g = fVar;
                        this.f6073n.onSubscribe(this);
                        dVar.request((long) this.f6062c);
                        return;
                    }
                }
                this.f6066g = new C2071b(this.f6062c);
                this.f6073n.onSubscribe(this);
                dVar.request((long) this.f6062c);
            }
        }

        C1838b(C1747a<? super T> aVar, C1678c cVar, boolean z, int i) {
            super(cVar, z, i);
            this.f6073n = aVar;
        }
    }

    /* renamed from: c.a.e.e.b.q$c */
    static final class C1839c<T> extends C1837a<T> implements C2177l<T> {
        private static final long serialVersionUID = -4547113800637756442L;

        /* renamed from: n */
        final C53695c<? super T> f6075n;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6291a() {
            int i = 1;
            while (!this.f6067h) {
                boolean z = this.f6068i;
                this.f6075n.onNext(null);
                if (z) {
                    this.f6067h = true;
                    Throwable th = this.f6069j;
                    if (th != null) {
                        this.f6075n.onError(th);
                    } else {
                        this.f6075n.onComplete();
                    }
                    this.f6060a.dispose();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        public final T poll() throws Exception {
            T poll = this.f6066g.poll();
            if (!(poll == null || this.f6070k == 1)) {
                long j = this.f6071l + 1;
                if (j == ((long) this.f6063d)) {
                    this.f6071l = 0;
                    this.f6065f.request(j);
                } else {
                    this.f6071l = j;
                }
            }
            return poll;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo6293b() {
            C53695c<? super T> cVar = this.f6075n;
            C1755i iVar = this.f6066g;
            long j = this.f6071l;
            int i = 1;
            while (true) {
                long j2 = this.f6064e.get();
                while (j != j2) {
                    try {
                        Object poll = iVar.poll();
                        if (!this.f6067h) {
                            if (poll == null) {
                                this.f6067h = true;
                                cVar.onComplete();
                                this.f6060a.dispose();
                                return;
                            }
                            cVar.onNext(poll);
                            j++;
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C1700b.m6017b(th);
                        this.f6067h = true;
                        this.f6065f.cancel();
                        cVar.onError(th);
                        this.f6060a.dispose();
                        return;
                    }
                }
                if (!this.f6067h) {
                    if (iVar.isEmpty()) {
                        this.f6067h = true;
                        cVar.onComplete();
                        this.f6060a.dispose();
                        return;
                    }
                    int i2 = get();
                    if (i == i2) {
                        this.f6071l = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo6294c() {
            boolean z;
            C53695c<? super T> cVar = this.f6075n;
            C1755i iVar = this.f6066g;
            long j = this.f6071l;
            int i = 1;
            while (true) {
                long j2 = this.f6064e.get();
                while (j != j2) {
                    boolean z2 = this.f6068i;
                    try {
                        Object poll = iVar.poll();
                        if (poll == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!mo6292a(z2, z, cVar)) {
                            if (z) {
                                break;
                            }
                            cVar.onNext(poll);
                            j++;
                            if (j == ((long) this.f6063d)) {
                                if (j2 != Long.MAX_VALUE) {
                                    j2 = this.f6064e.addAndGet(-j);
                                }
                                this.f6065f.request(j);
                                j = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C1700b.m6017b(th);
                        this.f6067h = true;
                        this.f6065f.cancel();
                        iVar.clear();
                        cVar.onError(th);
                        this.f6060a.dispose();
                        return;
                    }
                }
                if (j != j2 || !mo6292a(this.f6068i, iVar.isEmpty(), cVar)) {
                    int i2 = get();
                    if (i == i2) {
                        this.f6071l = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        public final void onSubscribe(C53696d dVar) {
            if (C2122f.validate(this.f6065f, dVar)) {
                this.f6065f = dVar;
                if (dVar instanceof C1752f) {
                    C1752f fVar = (C1752f) dVar;
                    int requestFusion = fVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.f6070k = 1;
                        this.f6066g = fVar;
                        this.f6068i = true;
                        this.f6075n.onSubscribe(this);
                        return;
                    } else if (requestFusion == 2) {
                        this.f6070k = 2;
                        this.f6066g = fVar;
                        this.f6075n.onSubscribe(this);
                        dVar.request((long) this.f6062c);
                        return;
                    }
                }
                this.f6066g = new C2071b(this.f6062c);
                this.f6075n.onSubscribe(this);
                dVar.request((long) this.f6062c);
            }
        }

        C1839c(C53695c<? super T> cVar, C1678c cVar2, boolean z, int i) {
            super(cVar2, z, i);
            this.f6075n = cVar;
        }
    }

    /* renamed from: b */
    public final void mo6264b(C53695c<? super T> cVar) {
        C1678c a = this.f6057c.mo6130a();
        if (cVar instanceof C1747a) {
            this.f5924a.mo6449a((C2177l<? super T>) new C1838b<Object>((C1747a) cVar, a, this.f6058d, this.f6059e));
        } else {
            this.f5924a.mo6449a((C2177l<? super T>) new C1839c<Object>(cVar, a, this.f6058d, this.f6059e));
        }
    }

    public C1836q(C2149h<T> hVar, C1675ac acVar, boolean z, int i) {
        super(hVar);
        this.f6057c = acVar;
        this.f6058d = z;
        this.f6059e = i;
    }
}
