package p064c.p065a.p095m;

import org.p2692b.C53695c;
import org.p2692b.C53696d;
import p064c.p065a.C2177l;
import p064c.p065a.p072e.p086i.C2122f;
import p064c.p065a.p072e.p087j.C2123a;
import p064c.p065a.p072e.p087j.C2134j;

/* renamed from: c.a.m.b */
public final class C2192b<T> implements C2177l<T>, C53696d {

    /* renamed from: a */
    final C53695c<? super T> f7024a;

    /* renamed from: b */
    final boolean f7025b;

    /* renamed from: c */
    C53696d f7026c;

    /* renamed from: d */
    boolean f7027d;

    /* renamed from: e */
    C2123a<Object> f7028e;

    /* renamed from: f */
    volatile boolean f7029f;

    public final void cancel() {
        this.f7026c.cancel();
    }

    /* renamed from: a */
    private void m6555a() {
        C2123a<Object> aVar;
        do {
            synchronized (this) {
                aVar = this.f7028e;
                if (aVar == null) {
                    this.f7027d = false;
                    return;
                }
                this.f7028e = null;
            }
        } while (!aVar.mo6422a(this.f7024a));
    }

    public final void onComplete() {
        if (!this.f7029f) {
            synchronized (this) {
                if (!this.f7029f) {
                    if (this.f7027d) {
                        C2123a<Object> aVar = this.f7028e;
                        if (aVar == null) {
                            aVar = new C2123a<>(4);
                            this.f7028e = aVar;
                        }
                        aVar.mo6421a(C2134j.complete());
                        return;
                    }
                    this.f7029f = true;
                    this.f7027d = true;
                    this.f7024a.onComplete();
                }
            }
        }
    }

    public C2192b(C53695c<? super T> cVar) {
        this(cVar, false);
    }

    public final void request(long j) {
        this.f7026c.request(j);
    }

    public final void onSubscribe(C53696d dVar) {
        if (C2122f.validate(this.f7026c, dVar)) {
            this.f7026c = dVar;
            this.f7024a.onSubscribe(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        if (r1 == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        p064c.p065a.p090h.C2150a.m6492a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        r2.f7024a.onError(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onError(java.lang.Throwable r3) {
        /*
            r2 = this;
            boolean r0 = r2.f7029f
            if (r0 == 0) goto L_0x0008
            p064c.p065a.p090h.C2150a.m6492a(r3)
            return
        L_0x0008:
            monitor-enter(r2)
            boolean r0 = r2.f7029f     // Catch:{ all -> 0x0044 }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            goto L_0x0037
        L_0x000f:
            boolean r0 = r2.f7027d     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0032
            r2.f7029f = r1     // Catch:{ all -> 0x0044 }
            c.a.e.j.a<java.lang.Object> r0 = r2.f7028e     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x0021
            c.a.e.j.a r0 = new c.a.e.j.a     // Catch:{ all -> 0x0044 }
            r1 = 4
            r0.<init>(r1)     // Catch:{ all -> 0x0044 }
            r2.f7028e = r0     // Catch:{ all -> 0x0044 }
        L_0x0021:
            java.lang.Object r3 = p064c.p065a.p072e.p087j.C2134j.error(r3)     // Catch:{ all -> 0x0044 }
            boolean r1 = r2.f7025b     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x002d
            r0.mo6421a(r3)     // Catch:{ all -> 0x0044 }
            goto L_0x0030
        L_0x002d:
            r0.mo6423b(r3)     // Catch:{ all -> 0x0044 }
        L_0x0030:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            return
        L_0x0032:
            r2.f7029f = r1     // Catch:{ all -> 0x0044 }
            r2.f7027d = r1     // Catch:{ all -> 0x0044 }
            r1 = 0
        L_0x0037:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x003e
            p064c.p065a.p090h.C2150a.m6492a(r3)
            return
        L_0x003e:
            org.b.c<? super T> r0 = r2.f7024a
            r0.onError(r3)
            return
        L_0x0044:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p064c.p065a.p095m.C2192b.onError(java.lang.Throwable):void");
    }

    public final void onNext(T t) {
        if (!this.f7029f) {
            if (t == null) {
                this.f7026c.cancel();
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            synchronized (this) {
                if (!this.f7029f) {
                    if (this.f7027d) {
                        C2123a<Object> aVar = this.f7028e;
                        if (aVar == null) {
                            aVar = new C2123a<>(4);
                            this.f7028e = aVar;
                        }
                        aVar.mo6421a(C2134j.next(t));
                        return;
                    }
                    this.f7027d = true;
                    this.f7024a.onNext(t);
                    m6555a();
                }
            }
        }
    }

    private C2192b(C53695c<? super T> cVar, boolean z) {
        this.f7024a = cVar;
        this.f7025b = false;
    }
}
