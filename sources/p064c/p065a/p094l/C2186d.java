package p064c.p065a.p094l;

import p064c.p065a.C1674ab;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p087j.C2123a;
import p064c.p065a.p072e.p087j.C2123a.C2124a;
import p064c.p065a.p072e.p087j.C2134j;

/* renamed from: c.a.l.d */
final class C2186d<T> extends C2189f<T> implements C2124a<Object> {

    /* renamed from: a */
    final C2189f<T> f7012a;

    /* renamed from: b */
    boolean f7013b;

    /* renamed from: c */
    C2123a<Object> f7014c;

    /* renamed from: d */
    volatile boolean f7015d;

    /* renamed from: l */
    private void m6547l() {
        C2123a<Object> aVar;
        while (true) {
            synchronized (this) {
                aVar = this.f7014c;
                if (aVar == null) {
                    this.f7013b = false;
                    return;
                }
                this.f7014c = null;
            }
            aVar.mo6420a((C2124a<? super T>) this);
        }
        while (true) {
        }
    }

    public final void onComplete() {
        if (!this.f7015d) {
            synchronized (this) {
                if (!this.f7015d) {
                    this.f7015d = true;
                    if (this.f7013b) {
                        C2123a<Object> aVar = this.f7014c;
                        if (aVar == null) {
                            aVar = new C2123a<>(4);
                            this.f7014c = aVar;
                        }
                        aVar.mo6421a(C2134j.complete());
                        return;
                    }
                    this.f7013b = true;
                    this.f7012a.onComplete();
                }
            }
        }
    }

    C2186d(C2189f<T> fVar) {
        this.f7012a = fVar;
    }

    /* renamed from: a */
    public final boolean mo6207a(Object obj) {
        return C2134j.acceptFull(obj, (C1674ab<? super T>) this.f7012a);
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super T> abVar) {
        this.f7012a.mo6314a(abVar);
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
        r2.f7012a.onError(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onError(java.lang.Throwable r3) {
        /*
            r2 = this;
            boolean r0 = r2.f7015d
            if (r0 == 0) goto L_0x0008
            p064c.p065a.p090h.C2150a.m6492a(r3)
            return
        L_0x0008:
            monitor-enter(r2)
            boolean r0 = r2.f7015d     // Catch:{ all -> 0x003b }
            r1 = 1
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x002e
        L_0x0010:
            r2.f7015d = r1     // Catch:{ all -> 0x003b }
            boolean r0 = r2.f7013b     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x002b
            c.a.e.j.a<java.lang.Object> r0 = r2.f7014c     // Catch:{ all -> 0x003b }
            if (r0 != 0) goto L_0x0022
            c.a.e.j.a r0 = new c.a.e.j.a     // Catch:{ all -> 0x003b }
            r1 = 4
            r0.<init>(r1)     // Catch:{ all -> 0x003b }
            r2.f7014c = r0     // Catch:{ all -> 0x003b }
        L_0x0022:
            java.lang.Object r3 = p064c.p065a.p072e.p087j.C2134j.error(r3)     // Catch:{ all -> 0x003b }
            r0.mo6423b(r3)     // Catch:{ all -> 0x003b }
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            return
        L_0x002b:
            r0 = 0
            r2.f7013b = r1     // Catch:{ all -> 0x003b }
        L_0x002e:
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0035
            p064c.p065a.p090h.C2150a.m6492a(r3)
            return
        L_0x0035:
            c.a.l.f<T> r0 = r2.f7012a
            r0.onError(r3)
            return
        L_0x003b:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p064c.p065a.p094l.C2186d.onError(java.lang.Throwable):void");
    }

    public final void onNext(T t) {
        if (!this.f7015d) {
            synchronized (this) {
                if (!this.f7015d) {
                    if (this.f7013b) {
                        C2123a<Object> aVar = this.f7014c;
                        if (aVar == null) {
                            aVar = new C2123a<>(4);
                            this.f7014c = aVar;
                        }
                        aVar.mo6421a(C2134j.next(t));
                        return;
                    }
                    this.f7013b = true;
                    this.f7012a.onNext(t);
                    m6547l();
                }
            }
        }
    }

    public final void onSubscribe(C1690c cVar) {
        boolean z = true;
        if (!this.f7015d) {
            synchronized (this) {
                if (!this.f7015d) {
                    if (this.f7013b) {
                        C2123a<Object> aVar = this.f7014c;
                        if (aVar == null) {
                            aVar = new C2123a<>(4);
                            this.f7014c = aVar;
                        }
                        aVar.mo6421a(C2134j.disposable(cVar));
                        return;
                    }
                    this.f7013b = true;
                    z = false;
                }
            }
        }
        if (z) {
            cVar.dispose();
            return;
        }
        this.f7012a.onSubscribe(cVar);
        m6547l();
    }
}
