package p064c.p065a.p072e.p077e.p081d;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1674ab;
import p064c.p065a.C1675ac;
import p064c.p065a.C1675ac.C1678c;
import p064c.p065a.C2206z;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p072e.p073a.C1719c;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p076d.C1769n;
import p064c.p065a.p072e.p083f.C2069a;
import p064c.p065a.p072e.p087j.C2141n;
import p064c.p065a.p089g.C2148c;

/* renamed from: c.a.e.e.d.b */
public final class C1959b<T, U extends Collection<? super T>> extends C1896a<T, U> {

    /* renamed from: b */
    final long f6375b;

    /* renamed from: c */
    final long f6376c;

    /* renamed from: d */
    final TimeUnit f6377d;

    /* renamed from: e */
    final C1675ac f6378e;

    /* renamed from: f */
    final Callable<U> f6379f;

    /* renamed from: g */
    final int f6380g;

    /* renamed from: h */
    final boolean f6381h;

    /* renamed from: c.a.e.e.d.b$a */
    static final class C1960a<T, U extends Collection<? super T>> extends C1769n<T, U, U> implements C1690c, Runnable {

        /* renamed from: g */
        final Callable<U> f6382g;

        /* renamed from: h */
        final long f6383h;

        /* renamed from: i */
        final TimeUnit f6384i;

        /* renamed from: j */
        final int f6385j;

        /* renamed from: k */
        final boolean f6386k;

        /* renamed from: l */
        final C1678c f6387l;

        /* renamed from: m */
        U f6388m;

        /* renamed from: n */
        C1690c f6389n;

        /* renamed from: o */
        C1690c f6390o;

        /* renamed from: p */
        long f6391p;

        /* renamed from: q */
        long f6392q;

        public final boolean isDisposed() {
            return this.f5899c;
        }

        public final void dispose() {
            if (!this.f5899c) {
                this.f5899c = true;
                this.f6390o.dispose();
                this.f6387l.dispose();
                synchronized (this) {
                    this.f6388m = null;
                }
            }
        }

        public final void onComplete() {
            U u;
            this.f6387l.dispose();
            synchronized (this) {
                u = this.f6388m;
                this.f6388m = null;
            }
            this.f5898b.offer(u);
            this.f5900d = true;
            if (mo6258c()) {
                C2141n.m6438a(this.f5898b, this.f5897a, false, this, this);
            }
        }

        public final void run() {
            try {
                U u = (Collection) C1745b.m6050a(this.f6382g.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    U u2 = this.f6388m;
                    if (u2 != null) {
                        if (this.f6391p == this.f6392q) {
                            this.f6388m = u;
                            mo6256b(u2, false, this);
                        }
                    }
                }
            } catch (Throwable th) {
                C1700b.m6017b(th);
                dispose();
                this.f5897a.onError(th);
            }
        }

        public final void onError(Throwable th) {
            synchronized (this) {
                this.f6388m = null;
            }
            this.f5897a.onError(th);
            this.f6387l.dispose();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
            if (r7.f6386k == false) goto L_0x0028;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
            r7.f6389n.dispose();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
            mo6256b(r0, false, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            r8 = (java.util.Collection) p064c.p065a.p072e.p074b.C1745b.m6050a(r7.f6382g.call(), "The buffer supplied is null");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
            monitor-enter(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            r7.f6388m = r8;
            r7.f6392q++;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
            monitor-exit(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
            if (r7.f6386k == false) goto L_0x0057;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
            r7.f6389n = r7.f6387l.mo6145a(r7, r7.f6383h, r7.f6383h, r7.f6384i);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0057, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x005b, code lost:
            r8 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x005c, code lost:
            p064c.p065a.p070c.C1700b.m6017b(r8);
            r7.f5897a.onError(r8);
            dispose();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0067, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onNext(T r8) {
            /*
                r7 = this;
                monitor-enter(r7)
                U r0 = r7.f6388m     // Catch:{ all -> 0x0068 }
                if (r0 != 0) goto L_0x0007
                monitor-exit(r7)     // Catch:{ all -> 0x0068 }
                return
            L_0x0007:
                r0.add(r8)     // Catch:{ all -> 0x0068 }
                int r8 = r0.size()     // Catch:{ all -> 0x0068 }
                int r1 = r7.f6385j     // Catch:{ all -> 0x0068 }
                if (r8 >= r1) goto L_0x0014
                monitor-exit(r7)     // Catch:{ all -> 0x0068 }
                return
            L_0x0014:
                r8 = 0
                r7.f6388m = r8     // Catch:{ all -> 0x0068 }
                long r1 = r7.f6391p     // Catch:{ all -> 0x0068 }
                r3 = 1
                long r1 = r1 + r3
                r7.f6391p = r1     // Catch:{ all -> 0x0068 }
                monitor-exit(r7)     // Catch:{ all -> 0x0068 }
                boolean r8 = r7.f6386k
                if (r8 == 0) goto L_0x0028
                c.a.b.c r8 = r7.f6389n
                r8.dispose()
            L_0x0028:
                r8 = 0
                r7.mo6256b(r0, r8, r7)
                java.util.concurrent.Callable<U> r8 = r7.f6382g     // Catch:{ Throwable -> 0x005b }
                java.lang.Object r8 = r8.call()     // Catch:{ Throwable -> 0x005b }
                java.lang.String r0 = "The buffer supplied is null"
                java.lang.Object r8 = p064c.p065a.p072e.p074b.C1745b.m6050a(r8, r0)     // Catch:{ Throwable -> 0x005b }
                java.util.Collection r8 = (java.util.Collection) r8     // Catch:{ Throwable -> 0x005b }
                monitor-enter(r7)
                r7.f6388m = r8     // Catch:{ all -> 0x0058 }
                long r0 = r7.f6392q     // Catch:{ all -> 0x0058 }
                r8 = 0
                long r0 = r0 + r3
                r7.f6392q = r0     // Catch:{ all -> 0x0058 }
                monitor-exit(r7)     // Catch:{ all -> 0x0058 }
                boolean r8 = r7.f6386k
                if (r8 == 0) goto L_0x0057
                c.a.ac$c r0 = r7.f6387l
                long r2 = r7.f6383h
                long r4 = r7.f6383h
                java.util.concurrent.TimeUnit r6 = r7.f6384i
                r1 = r7
                c.a.b.c r8 = r0.mo6145a(r1, r2, r4, r6)
                r7.f6389n = r8
            L_0x0057:
                return
            L_0x0058:
                r8 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x0058 }
                throw r8
            L_0x005b:
                r8 = move-exception
                p064c.p065a.p070c.C1700b.m6017b(r8)
                c.a.ab r0 = r7.f5897a
                r0.onError(r8)
                r7.dispose()
                return
            L_0x0068:
                r8 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x0068 }
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p064c.p065a.p072e.p077e.p081d.C1959b.C1960a.onNext(java.lang.Object):void");
        }

        public final void onSubscribe(C1690c cVar) {
            if (C1718b.validate(this.f6390o, cVar)) {
                this.f6390o = cVar;
                try {
                    this.f6388m = (Collection) C1745b.m6050a(this.f6382g.call(), "The buffer supplied is null");
                    this.f5897a.onSubscribe(this);
                    this.f6389n = this.f6387l.mo6145a(this, this.f6383h, this.f6383h, this.f6384i);
                } catch (Throwable th) {
                    C1700b.m6017b(th);
                    cVar.dispose();
                    C1719c.error(th, this.f5897a);
                    this.f6387l.dispose();
                }
            }
        }

        /* renamed from: a */
        public final /* synthetic */ void mo6253a(C1674ab abVar, Object obj) {
            abVar.onNext((Collection) obj);
        }

        C1960a(C1674ab<? super U> abVar, Callable<U> callable, long j, TimeUnit timeUnit, int i, boolean z, C1678c cVar) {
            super(abVar, new C2069a());
            this.f6382g = callable;
            this.f6383h = j;
            this.f6384i = timeUnit;
            this.f6385j = i;
            this.f6386k = z;
            this.f6387l = cVar;
        }
    }

    /* renamed from: c.a.e.e.d.b$b */
    static final class C1961b<T, U extends Collection<? super T>> extends C1769n<T, U, U> implements C1690c, Runnable {

        /* renamed from: g */
        final Callable<U> f6393g;

        /* renamed from: h */
        final long f6394h;

        /* renamed from: i */
        final TimeUnit f6395i;

        /* renamed from: j */
        final C1675ac f6396j;

        /* renamed from: k */
        C1690c f6397k;

        /* renamed from: l */
        U f6398l;

        /* renamed from: m */
        final AtomicReference<C1690c> f6399m = new AtomicReference<>();

        public final void dispose() {
            C1718b.dispose(this.f6399m);
            this.f6397k.dispose();
        }

        public final boolean isDisposed() {
            if (this.f6399m.get() == C1718b.DISPOSED) {
                return true;
            }
            return false;
        }

        public final void onComplete() {
            U u;
            synchronized (this) {
                u = this.f6398l;
                this.f6398l = null;
            }
            if (u != null) {
                this.f5898b.offer(u);
                this.f5900d = true;
                if (mo6258c()) {
                    C2141n.m6438a(this.f5898b, this.f5897a, false, null, this);
                }
            }
            C1718b.dispose(this.f6399m);
        }

        public final void run() {
            U u;
            try {
                U u2 = (Collection) C1745b.m6050a(this.f6393g.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    u = this.f6398l;
                    if (u != null) {
                        this.f6398l = u2;
                    }
                }
                if (u == null) {
                    C1718b.dispose(this.f6399m);
                } else {
                    mo6254a(u, false, this);
                }
            } catch (Throwable th) {
                C1700b.m6017b(th);
                this.f5897a.onError(th);
                dispose();
            }
        }

        public final void onNext(T t) {
            synchronized (this) {
                U u = this.f6398l;
                if (u != null) {
                    u.add(t);
                }
            }
        }

        public final void onError(Throwable th) {
            synchronized (this) {
                this.f6398l = null;
            }
            this.f5897a.onError(th);
            C1718b.dispose(this.f6399m);
        }

        public final void onSubscribe(C1690c cVar) {
            if (C1718b.validate(this.f6397k, cVar)) {
                this.f6397k = cVar;
                try {
                    this.f6398l = (Collection) C1745b.m6050a(this.f6393g.call(), "The buffer supplied is null");
                    this.f5897a.onSubscribe(this);
                    if (!this.f5899c) {
                        C1690c a = this.f6396j.mo6140a(this, this.f6394h, this.f6394h, this.f6395i);
                        if (!this.f6399m.compareAndSet(null, a)) {
                            a.dispose();
                        }
                    }
                } catch (Throwable th) {
                    C1700b.m6017b(th);
                    dispose();
                    C1719c.error(th, this.f5897a);
                }
            }
        }

        /* renamed from: a */
        public final /* synthetic */ void mo6253a(C1674ab abVar, Object obj) {
            this.f5897a.onNext((Collection) obj);
        }

        C1961b(C1674ab<? super U> abVar, Callable<U> callable, long j, TimeUnit timeUnit, C1675ac acVar) {
            super(abVar, new C2069a());
            this.f6393g = callable;
            this.f6394h = j;
            this.f6395i = timeUnit;
            this.f6396j = acVar;
        }
    }

    /* renamed from: c.a.e.e.d.b$c */
    static final class C1962c<T, U extends Collection<? super T>> extends C1769n<T, U, U> implements C1690c, Runnable {

        /* renamed from: g */
        final Callable<U> f6400g;

        /* renamed from: h */
        final long f6401h;

        /* renamed from: i */
        final long f6402i;

        /* renamed from: j */
        final TimeUnit f6403j;

        /* renamed from: k */
        final C1678c f6404k;

        /* renamed from: l */
        final List<U> f6405l = new LinkedList();

        /* renamed from: m */
        C1690c f6406m;

        /* renamed from: c.a.e.e.d.b$c$a */
        final class C1963a implements Runnable {

            /* renamed from: b */
            private final U f6408b;

            public final void run() {
                synchronized (C1962c.this) {
                    C1962c.this.f6405l.remove(this.f6408b);
                }
                C1962c.this.mo6256b(this.f6408b, false, C1962c.this.f6404k);
            }

            C1963a(U u) {
                this.f6408b = u;
            }
        }

        /* renamed from: c.a.e.e.d.b$c$b */
        final class C1964b implements Runnable {

            /* renamed from: b */
            private final U f6410b;

            public final void run() {
                synchronized (C1962c.this) {
                    C1962c.this.f6405l.remove(this.f6410b);
                }
                C1962c.this.mo6256b(this.f6410b, false, C1962c.this.f6404k);
            }

            C1964b(U u) {
                this.f6410b = u;
            }
        }

        public final boolean isDisposed() {
            return this.f5899c;
        }

        /* renamed from: e */
        private void m6250e() {
            synchronized (this) {
                this.f6405l.clear();
            }
        }

        public final void dispose() {
            if (!this.f5899c) {
                this.f5899c = true;
                m6250e();
                this.f6406m.dispose();
                this.f6404k.dispose();
            }
        }

        public final void onComplete() {
            ArrayList<Collection> arrayList;
            synchronized (this) {
                arrayList = new ArrayList<>(this.f6405l);
                this.f6405l.clear();
            }
            for (Collection offer : arrayList) {
                this.f5898b.offer(offer);
            }
            this.f5900d = true;
            if (mo6258c()) {
                C2141n.m6438a(this.f5898b, this.f5897a, false, this.f6404k, this);
            }
        }

        public final void run() {
            if (!this.f5899c) {
                try {
                    Collection collection = (Collection) C1745b.m6050a(this.f6400g.call(), "The bufferSupplier returned a null buffer");
                    synchronized (this) {
                        if (!this.f5899c) {
                            this.f6405l.add(collection);
                            this.f6404k.mo6132a(new C1963a(collection), this.f6401h, this.f6403j);
                        }
                    }
                } catch (Throwable th) {
                    C1700b.m6017b(th);
                    this.f5897a.onError(th);
                    dispose();
                }
            }
        }

        public final void onError(Throwable th) {
            this.f5900d = true;
            m6250e();
            this.f5897a.onError(th);
            this.f6404k.dispose();
        }

        public final void onNext(T t) {
            synchronized (this) {
                for (U add : this.f6405l) {
                    add.add(t);
                }
            }
        }

        public final void onSubscribe(C1690c cVar) {
            if (C1718b.validate(this.f6406m, cVar)) {
                this.f6406m = cVar;
                try {
                    Collection collection = (Collection) C1745b.m6050a(this.f6400g.call(), "The buffer supplied is null");
                    this.f6405l.add(collection);
                    this.f5897a.onSubscribe(this);
                    this.f6404k.mo6145a(this, this.f6402i, this.f6402i, this.f6403j);
                    this.f6404k.mo6132a(new C1964b(collection), this.f6401h, this.f6403j);
                } catch (Throwable th) {
                    C1700b.m6017b(th);
                    cVar.dispose();
                    C1719c.error(th, this.f5897a);
                    this.f6404k.dispose();
                }
            }
        }

        /* renamed from: a */
        public final /* synthetic */ void mo6253a(C1674ab abVar, Object obj) {
            abVar.onNext((Collection) obj);
        }

        C1962c(C1674ab<? super U> abVar, Callable<U> callable, long j, long j2, TimeUnit timeUnit, C1678c cVar) {
            super(abVar, new C2069a());
            this.f6400g = callable;
            this.f6401h = j;
            this.f6402i = j2;
            this.f6403j = timeUnit;
            this.f6404k = cVar;
        }
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super U> abVar) {
        if (this.f6375b == this.f6376c && this.f6380g == Integer.MAX_VALUE) {
            C2206z zVar = this.f6202a;
            C1961b bVar = new C1961b(new C2148c(abVar), this.f6379f, this.f6375b, this.f6377d, this.f6378e);
            zVar.mo6314a(bVar);
            return;
        }
        C1678c a = this.f6378e.mo6130a();
        if (this.f6375b == this.f6376c) {
            C2206z zVar2 = this.f6202a;
            C1960a aVar = new C1960a(new C2148c(abVar), this.f6379f, this.f6375b, this.f6377d, this.f6380g, this.f6381h, a);
            zVar2.mo6314a(aVar);
            return;
        }
        C2206z zVar3 = this.f6202a;
        C1962c cVar = new C1962c(new C2148c(abVar), this.f6379f, this.f6375b, this.f6376c, this.f6377d, a);
        zVar3.mo6314a(cVar);
    }

    public C1959b(C2206z<T> zVar, long j, long j2, TimeUnit timeUnit, C1675ac acVar, Callable<U> callable, int i, boolean z) {
        super(zVar);
        this.f6375b = j;
        this.f6376c = j2;
        this.f6377d = timeUnit;
        this.f6378e = acVar;
        this.f6379f = callable;
        this.f6380g = i;
        this.f6381h = z;
    }
}
