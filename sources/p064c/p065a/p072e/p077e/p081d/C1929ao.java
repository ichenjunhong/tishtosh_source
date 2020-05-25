package p064c.p065a.p072e.p077e.p081d;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1674ab;
import p064c.p065a.C1675ac;
import p064c.p065a.C2201v;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p072e.p073a.C1721e;
import p064c.p065a.p088f.C2143a;
import p064c.p065a.p090h.C2150a;
import p064c.p065a.p093k.C2168a;

/* renamed from: c.a.e.e.d.ao */
public final class C1929ao<T> extends C2201v<T> {

    /* renamed from: a */
    final C2143a<T> f6292a;

    /* renamed from: b */
    final int f6293b;

    /* renamed from: c */
    final long f6294c;

    /* renamed from: d */
    final TimeUnit f6295d;

    /* renamed from: e */
    final C1675ac f6296e;

    /* renamed from: f */
    C1930a f6297f;

    /* renamed from: c.a.e.e.d.ao$a */
    static final class C1930a extends AtomicReference<C1690c> implements C1710e<C1690c>, Runnable {
        private static final long serialVersionUID = -4552101107598366241L;

        /* renamed from: a */
        final C1929ao<?> f6298a;

        /* renamed from: b */
        C1690c f6299b;

        /* renamed from: c */
        long f6300c;

        /* renamed from: d */
        boolean f6301d;

        /* renamed from: e */
        boolean f6302e;

        public final void run() {
            this.f6298a.mo6323b(this);
        }

        C1930a(C1929ao<?> aoVar) {
            this.f6298a = aoVar;
        }

        public final /* synthetic */ void accept(Object obj) throws Exception {
            C1718b.replace(this, (C1690c) obj);
            synchronized (this.f6298a) {
            }
        }
    }

    /* renamed from: c.a.e.e.d.ao$b */
    static final class C1931b<T> extends AtomicBoolean implements C1674ab<T>, C1690c {
        private static final long serialVersionUID = -7419642935409022375L;

        /* renamed from: a */
        final C1674ab<? super T> f6303a;

        /* renamed from: b */
        final C1929ao<T> f6304b;

        /* renamed from: c */
        final C1930a f6305c;

        /* renamed from: d */
        C1690c f6306d;

        public final boolean isDisposed() {
            return this.f6306d.isDisposed();
        }

        public final void onComplete() {
            if (compareAndSet(false, true)) {
                this.f6304b.mo6322a(this.f6305c);
                this.f6303a.onComplete();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
            r2.replace(r0.f6296e.mo6131a(r1, r0.f6294c, r0.f6295d));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0051, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void dispose() {
            /*
                r7 = this;
                c.a.b.c r0 = r7.f6306d
                r0.dispose()
                r0 = 0
                r1 = 1
                boolean r0 = r7.compareAndSet(r0, r1)
                if (r0 == 0) goto L_0x0055
                c.a.e.e.d.ao<T> r0 = r7.f6304b
                c.a.e.e.d.ao$a r1 = r7.f6305c
                monitor-enter(r0)
                c.a.e.e.d.ao$a r2 = r0.f6297f     // Catch:{ all -> 0x0052 }
                if (r2 == 0) goto L_0x0050
                c.a.e.e.d.ao$a r2 = r0.f6297f     // Catch:{ all -> 0x0052 }
                if (r2 == r1) goto L_0x001b
                goto L_0x0050
            L_0x001b:
                long r2 = r1.f6300c     // Catch:{ all -> 0x0052 }
                r4 = 1
                long r2 = r2 - r4
                r1.f6300c = r2     // Catch:{ all -> 0x0052 }
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L_0x004e
                boolean r2 = r1.f6301d     // Catch:{ all -> 0x0052 }
                if (r2 != 0) goto L_0x002d
                goto L_0x004e
            L_0x002d:
                long r2 = r0.f6294c     // Catch:{ all -> 0x0052 }
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L_0x0038
                r0.mo6323b(r1)     // Catch:{ all -> 0x0052 }
                monitor-exit(r0)     // Catch:{ all -> 0x0052 }
                return
            L_0x0038:
                c.a.e.a.f r2 = new c.a.e.a.f     // Catch:{ all -> 0x0052 }
                r2.<init>()     // Catch:{ all -> 0x0052 }
                r1.f6299b = r2     // Catch:{ all -> 0x0052 }
                monitor-exit(r0)     // Catch:{ all -> 0x0052 }
                c.a.ac r3 = r0.f6296e
                long r4 = r0.f6294c
                java.util.concurrent.TimeUnit r0 = r0.f6295d
                c.a.b.c r0 = r3.mo6131a(r1, r4, r0)
                r2.replace(r0)
                goto L_0x0055
            L_0x004e:
                monitor-exit(r0)     // Catch:{ all -> 0x0052 }
                return
            L_0x0050:
                monitor-exit(r0)     // Catch:{ all -> 0x0052 }
                return
            L_0x0052:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0052 }
                throw r1
            L_0x0055:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p064c.p065a.p072e.p077e.p081d.C1929ao.C1931b.dispose():void");
        }

        public final void onNext(T t) {
            this.f6303a.onNext(t);
        }

        public final void onSubscribe(C1690c cVar) {
            if (C1718b.validate(this.f6306d, cVar)) {
                this.f6306d = cVar;
                this.f6303a.onSubscribe(this);
            }
        }

        public final void onError(Throwable th) {
            if (compareAndSet(false, true)) {
                this.f6304b.mo6322a(this.f6305c);
                this.f6303a.onError(th);
                return;
            }
            C2150a.m6492a(th);
        }

        C1931b(C1674ab<? super T> abVar, C1929ao<T> aoVar, C1930a aVar) {
            this.f6303a = abVar;
            this.f6304b = aoVar;
            this.f6305c = aVar;
        }
    }

    public C1929ao(C2143a<T> aVar) {
        this(aVar, 1, 0, TimeUnit.NANOSECONDS, C2168a.f6969d);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6322a(C1930a aVar) {
        synchronized (this) {
            if (this.f6297f != null && this.f6297f == aVar) {
                this.f6297f = null;
                if (aVar.f6299b != null) {
                    aVar.f6299b.dispose();
                }
            }
            long j = aVar.f6300c - 1;
            aVar.f6300c = j;
            if (j == 0) {
                if (this.f6292a instanceof C1690c) {
                    ((C1690c) this.f6292a).dispose();
                } else if (this.f6292a instanceof C1721e) {
                    aVar.get();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo6323b(C1930a aVar) {
        synchronized (this) {
            if (aVar.f6300c == 0 && aVar == this.f6297f) {
                this.f6297f = null;
                C1690c cVar = (C1690c) aVar.get();
                C1718b.dispose(aVar);
                if (this.f6292a instanceof C1690c) {
                    ((C1690c) this.f6292a).dispose();
                } else if ((this.f6292a instanceof C1721e) && cVar == null) {
                    aVar.f6302e = true;
                }
            }
        }
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super T> abVar) {
        C1930a aVar;
        boolean z;
        synchronized (this) {
            aVar = this.f6297f;
            if (aVar == null) {
                aVar = new C1930a(this);
                this.f6297f = aVar;
            }
            long j = aVar.f6300c;
            if (j == 0 && aVar.f6299b != null) {
                aVar.f6299b.dispose();
            }
            long j2 = j + 1;
            aVar.f6300c = j2;
            z = true;
            if (aVar.f6301d || j2 != ((long) this.f6293b)) {
                z = false;
            } else {
                aVar.f6301d = true;
            }
        }
        this.f6292a.mo6314a((C1674ab<? super T>) new C1931b<Object>(abVar, this, aVar));
        if (z) {
            this.f6292a.mo6320g(aVar);
        }
    }

    private C1929ao(C2143a<T> aVar, int i, long j, TimeUnit timeUnit, C1675ac acVar) {
        this.f6292a = aVar;
        this.f6293b = 1;
        this.f6294c = 0;
        this.f6295d = timeUnit;
        this.f6296e = acVar;
    }
}
