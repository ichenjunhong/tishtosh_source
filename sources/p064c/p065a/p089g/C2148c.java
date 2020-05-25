package p064c.p065a.p089g;

import p064c.p065a.C1674ab;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p072e.p087j.C2123a;
import p064c.p065a.p072e.p087j.C2134j;

/* renamed from: c.a.g.c */
public final class C2148c<T> implements C1674ab<T>, C1690c {

    /* renamed from: a */
    final C1674ab<? super T> f6904a;

    /* renamed from: b */
    final boolean f6905b;

    /* renamed from: c */
    C1690c f6906c;

    /* renamed from: d */
    boolean f6907d;

    /* renamed from: e */
    C2123a<Object> f6908e;

    /* renamed from: f */
    volatile boolean f6909f;

    public final void dispose() {
        this.f6906c.dispose();
    }

    public final boolean isDisposed() {
        return this.f6906c.isDisposed();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        if (r3 == null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
        if (r4 >= r0) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        r5 = r3[r4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r5 == null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0021, code lost:
        if (p064c.p065a.p072e.p087j.C2134j.acceptFull((java.lang.Object) r5, r2) == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0023, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0025, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0028, code lost:
        r3 = r3[r0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x002d, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000e, code lost:
        r2 = r6.f6904a;
        r3 = r0.f6886b;
        r0 = r0.f6885a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6446a() {
        /*
            r6 = this;
        L_0x0000:
            monitor-enter(r6)
            c.a.e.j.a<java.lang.Object> r0 = r6.f6908e     // Catch:{ all -> 0x0030 }
            r1 = 0
            if (r0 != 0) goto L_0x000a
            r6.f6907d = r1     // Catch:{ all -> 0x0030 }
            monitor-exit(r6)     // Catch:{ all -> 0x0030 }
            return
        L_0x000a:
            r2 = 0
            r6.f6908e = r2     // Catch:{ all -> 0x0030 }
            monitor-exit(r6)     // Catch:{ all -> 0x0030 }
            c.a.ab<? super T> r2 = r6.f6904a
            java.lang.Object[] r3 = r0.f6886b
            int r0 = r0.f6885a
        L_0x0014:
            if (r3 == 0) goto L_0x002d
            r4 = 0
        L_0x0017:
            if (r4 >= r0) goto L_0x0028
            r5 = r3[r4]
            if (r5 == 0) goto L_0x0028
            boolean r5 = p064c.p065a.p072e.p087j.C2134j.acceptFull(r5, r2)
            if (r5 == 0) goto L_0x0025
            r1 = 1
            goto L_0x002d
        L_0x0025:
            int r4 = r4 + 1
            goto L_0x0017
        L_0x0028:
            r3 = r3[r0]
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            goto L_0x0014
        L_0x002d:
            if (r1 == 0) goto L_0x0000
            return
        L_0x0030:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0030 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p064c.p065a.p089g.C2148c.m6446a():void");
    }

    public final void onComplete() {
        if (!this.f6909f) {
            synchronized (this) {
                if (!this.f6909f) {
                    if (this.f6907d) {
                        C2123a<Object> aVar = this.f6908e;
                        if (aVar == null) {
                            aVar = new C2123a<>(4);
                            this.f6908e = aVar;
                        }
                        aVar.mo6421a(C2134j.complete());
                        return;
                    }
                    this.f6909f = true;
                    this.f6907d = true;
                    this.f6904a.onComplete();
                }
            }
        }
    }

    public C2148c(C1674ab<? super T> abVar) {
        this(abVar, false);
    }

    public final void onSubscribe(C1690c cVar) {
        if (C1718b.validate(this.f6906c, cVar)) {
            this.f6906c = cVar;
            this.f6904a.onSubscribe(this);
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
        r2.f6904a.onError(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onError(java.lang.Throwable r3) {
        /*
            r2 = this;
            boolean r0 = r2.f6909f
            if (r0 == 0) goto L_0x0008
            p064c.p065a.p090h.C2150a.m6492a(r3)
            return
        L_0x0008:
            monitor-enter(r2)
            boolean r0 = r2.f6909f     // Catch:{ all -> 0x0044 }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            goto L_0x0037
        L_0x000f:
            boolean r0 = r2.f6907d     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0032
            r2.f6909f = r1     // Catch:{ all -> 0x0044 }
            c.a.e.j.a<java.lang.Object> r0 = r2.f6908e     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x0021
            c.a.e.j.a r0 = new c.a.e.j.a     // Catch:{ all -> 0x0044 }
            r1 = 4
            r0.<init>(r1)     // Catch:{ all -> 0x0044 }
            r2.f6908e = r0     // Catch:{ all -> 0x0044 }
        L_0x0021:
            java.lang.Object r3 = p064c.p065a.p072e.p087j.C2134j.error(r3)     // Catch:{ all -> 0x0044 }
            boolean r1 = r2.f6905b     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x002d
            r0.mo6421a(r3)     // Catch:{ all -> 0x0044 }
            goto L_0x0030
        L_0x002d:
            r0.mo6423b(r3)     // Catch:{ all -> 0x0044 }
        L_0x0030:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            return
        L_0x0032:
            r2.f6909f = r1     // Catch:{ all -> 0x0044 }
            r2.f6907d = r1     // Catch:{ all -> 0x0044 }
            r1 = 0
        L_0x0037:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x003e
            p064c.p065a.p090h.C2150a.m6492a(r3)
            return
        L_0x003e:
            c.a.ab<? super T> r0 = r2.f6904a
            r0.onError(r3)
            return
        L_0x0044:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p064c.p065a.p089g.C2148c.onError(java.lang.Throwable):void");
    }

    public final void onNext(T t) {
        if (!this.f6909f) {
            if (t == null) {
                this.f6906c.dispose();
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            synchronized (this) {
                if (!this.f6909f) {
                    if (this.f6907d) {
                        C2123a<Object> aVar = this.f6908e;
                        if (aVar == null) {
                            aVar = new C2123a<>(4);
                            this.f6908e = aVar;
                        }
                        aVar.mo6421a(C2134j.next(t));
                        return;
                    }
                    this.f6907d = true;
                    this.f6904a.onNext(t);
                    m6446a();
                }
            }
        }
    }

    private C2148c(C1674ab<? super T> abVar, boolean z) {
        this.f6904a = abVar;
        this.f6905b = false;
    }
}
