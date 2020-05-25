package com.p902d.p903a;

import p064c.p065a.C1674ab;

/* renamed from: com.d.a.d */
public final class C13455d<T> extends C13454c<T> {

    /* renamed from: a */
    private final C13454c<T> f35042a;

    /* renamed from: b */
    private boolean f35043b;

    /* renamed from: c */
    private C13451a<T> f35044c;

    public C13455d(C13454c<T> cVar) {
        this.f35042a = cVar;
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super T> abVar) {
        this.f35042a.mo6314a(abVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        r6.f35042a.accept(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r7 = r6.f35044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
        if (r7 != null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003b, code lost:
        r6.f35043b = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003f, code lost:
        r6.f35044c = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0042, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
        r0 = r6.f35042a;
        r2 = r7.f35035b;
        r7 = r7.f35034a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0049, code lost:
        if (r2 == null) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004b, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004c, code lost:
        if (r3 >= r7) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004e, code lost:
        r4 = r2[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0050, code lost:
        if (r4 == null) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0052, code lost:
        r0.accept(r4);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0058, code lost:
        r2 = r2[r7];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(T r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f35043b     // Catch:{ all -> 0x0060 }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x002e
            com.d.a.a<T> r0 = r6.f35044c     // Catch:{ all -> 0x0060 }
            if (r0 != 0) goto L_0x0013
            com.d.a.a r0 = new com.d.a.a     // Catch:{ all -> 0x0060 }
            r3 = 4
            r0.<init>(r3)     // Catch:{ all -> 0x0060 }
            r6.f35044c = r0     // Catch:{ all -> 0x0060 }
        L_0x0013:
            int r3 = r0.f35034a     // Catch:{ all -> 0x0060 }
            int r4 = r0.f35037d     // Catch:{ all -> 0x0060 }
            if (r4 != r3) goto L_0x0024
            int r4 = r3 + 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0060 }
            java.lang.Object[] r5 = r0.f35036c     // Catch:{ all -> 0x0060 }
            r5[r3] = r4     // Catch:{ all -> 0x0060 }
            r0.f35036c = r4     // Catch:{ all -> 0x0060 }
            goto L_0x0025
        L_0x0024:
            r1 = r4
        L_0x0025:
            java.lang.Object[] r3 = r0.f35036c     // Catch:{ all -> 0x0060 }
            r3[r1] = r7     // Catch:{ all -> 0x0060 }
            int r1 = r1 + r2
            r0.f35037d = r1     // Catch:{ all -> 0x0060 }
            monitor-exit(r6)     // Catch:{ all -> 0x0060 }
            return
        L_0x002e:
            r6.f35043b = r2     // Catch:{ all -> 0x0060 }
            monitor-exit(r6)     // Catch:{ all -> 0x0060 }
            com.d.a.c<T> r0 = r6.f35042a
            r0.accept(r7)
        L_0x0036:
            monitor-enter(r6)
            com.d.a.a<T> r7 = r6.f35044c     // Catch:{ all -> 0x005d }
            if (r7 != 0) goto L_0x003f
            r6.f35043b = r1     // Catch:{ all -> 0x005d }
            monitor-exit(r6)     // Catch:{ all -> 0x005d }
            return
        L_0x003f:
            r0 = 0
            r6.f35044c = r0     // Catch:{ all -> 0x005d }
            monitor-exit(r6)     // Catch:{ all -> 0x005d }
            com.d.a.c<T> r0 = r6.f35042a
            java.lang.Object[] r2 = r7.f35035b
            int r7 = r7.f35034a
        L_0x0049:
            if (r2 == 0) goto L_0x0036
            r3 = 0
        L_0x004c:
            if (r3 >= r7) goto L_0x0058
            r4 = r2[r3]
            if (r4 == 0) goto L_0x0058
            r0.accept(r4)
            int r3 = r3 + 1
            goto L_0x004c
        L_0x0058:
            r2 = r2[r7]
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            goto L_0x0049
        L_0x005d:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x005d }
            throw r7
        L_0x0060:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0060 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p902d.p903a.C13455d.accept(java.lang.Object):void");
    }
}
