package p064c.p065a.p091i;

import org.p2692b.C53695c;
import org.p2692b.C53696d;
import p064c.p065a.p072e.p087j.C2123a;
import p064c.p065a.p072e.p087j.C2134j;

/* renamed from: c.a.i.c */
final class C2155c<T> extends C2152a<T> {

    /* renamed from: a */
    final C2152a<T> f6941a;

    /* renamed from: c */
    boolean f6942c;

    /* renamed from: d */
    C2123a<Object> f6943d;

    /* renamed from: e */
    volatile boolean f6944e;

    /* renamed from: g */
    private void m6505g() {
        C2123a<Object> aVar;
        while (true) {
            synchronized (this) {
                aVar = this.f6943d;
                if (aVar == null) {
                    this.f6942c = false;
                    return;
                }
                this.f6943d = null;
            }
            aVar.mo6422a((C53695c<? super U>) this.f6941a);
        }
        while (true) {
        }
    }

    public final void onComplete() {
        if (!this.f6944e) {
            synchronized (this) {
                if (!this.f6944e) {
                    this.f6944e = true;
                    if (this.f6942c) {
                        C2123a<Object> aVar = this.f6943d;
                        if (aVar == null) {
                            aVar = new C2123a<>(4);
                            this.f6943d = aVar;
                        }
                        aVar.mo6421a(C2134j.complete());
                        return;
                    }
                    this.f6942c = true;
                    this.f6941a.onComplete();
                }
            }
        }
    }

    C2155c(C2152a<T> aVar) {
        this.f6941a = aVar;
    }

    /* renamed from: b */
    public final void mo6264b(C53695c<? super T> cVar) {
        this.f6941a.mo336a(cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002f, code lost:
        if (r0 == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0031, code lost:
        p064c.p065a.p090h.C2150a.m6492a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0035, code lost:
        r2.f6941a.onError(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onError(java.lang.Throwable r3) {
        /*
            r2 = this;
            boolean r0 = r2.f6944e
            if (r0 == 0) goto L_0x0008
            p064c.p065a.p090h.C2150a.m6492a(r3)
            return
        L_0x0008:
            monitor-enter(r2)
            boolean r0 = r2.f6944e     // Catch:{ all -> 0x003b }
            r1 = 1
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x002e
        L_0x0010:
            r2.f6944e = r1     // Catch:{ all -> 0x003b }
            boolean r0 = r2.f6942c     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x002b
            c.a.e.j.a<java.lang.Object> r0 = r2.f6943d     // Catch:{ all -> 0x003b }
            if (r0 != 0) goto L_0x0022
            c.a.e.j.a r0 = new c.a.e.j.a     // Catch:{ all -> 0x003b }
            r1 = 4
            r0.<init>(r1)     // Catch:{ all -> 0x003b }
            r2.f6943d = r0     // Catch:{ all -> 0x003b }
        L_0x0022:
            java.lang.Object r3 = p064c.p065a.p072e.p087j.C2134j.error(r3)     // Catch:{ all -> 0x003b }
            r0.mo6423b(r3)     // Catch:{ all -> 0x003b }
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            return
        L_0x002b:
            r0 = 0
            r2.f6942c = r1     // Catch:{ all -> 0x003b }
        L_0x002e:
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0035
            p064c.p065a.p090h.C2150a.m6492a(r3)
            return
        L_0x0035:
            c.a.i.a<T> r0 = r2.f6941a
            r0.onError(r3)
            return
        L_0x003b:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p064c.p065a.p091i.C2155c.onError(java.lang.Throwable):void");
    }

    public final void onNext(T t) {
        if (!this.f6944e) {
            synchronized (this) {
                if (!this.f6944e) {
                    if (this.f6942c) {
                        C2123a<Object> aVar = this.f6943d;
                        if (aVar == null) {
                            aVar = new C2123a<>(4);
                            this.f6943d = aVar;
                        }
                        aVar.mo6421a(C2134j.next(t));
                        return;
                    }
                    this.f6942c = true;
                    this.f6941a.onNext(t);
                    m6505g();
                }
            }
        }
    }

    public final void onSubscribe(C53696d dVar) {
        boolean z = true;
        if (!this.f6944e) {
            synchronized (this) {
                if (!this.f6944e) {
                    if (this.f6942c) {
                        C2123a<Object> aVar = this.f6943d;
                        if (aVar == null) {
                            aVar = new C2123a<>(4);
                            this.f6943d = aVar;
                        }
                        aVar.mo6421a(C2134j.subscription(dVar));
                        return;
                    }
                    this.f6942c = true;
                    z = false;
                }
            }
        }
        if (z) {
            dVar.cancel();
            return;
        }
        this.f6941a.onSubscribe(dVar);
        m6505g();
    }
}
