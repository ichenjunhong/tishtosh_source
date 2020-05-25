package p064c.p065a.p072e.p073a;

import java.util.LinkedList;
import java.util.List;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p074b.C1745b;

/* renamed from: c.a.e.a.d */
public final class C1720d implements C1690c, C1717a {

    /* renamed from: a */
    List<C1690c> f5840a;

    /* renamed from: b */
    volatile boolean f5841b;

    public final boolean isDisposed() {
        return this.f5841b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        if (r1 == null) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
        r1 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        if (r1.hasNext() == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        ((p064c.p065a.p069b.C1690c) r1.next()).dispose();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002c, code lost:
        p064c.p065a.p070c.C1700b.m6017b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002f, code lost:
        if (r2 == null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0031, code lost:
        r2 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        r2.add(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        if (r2 == null) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        if (r2.size() != 1) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004d, code lost:
        throw p064c.p065a.p072e.p087j.C2131h.m6422a((java.lang.Throwable) r2.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0053, code lost:
        throw new p064c.p065a.p070c.C1695a((java.lang.Iterable<? extends java.lang.Throwable>) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0054, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dispose() {
        /*
            r4 = this;
            boolean r0 = r4.f5841b
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r4)
            boolean r0 = r4.f5841b     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r4)     // Catch:{ all -> 0x0055 }
            return
        L_0x000c:
            r0 = 1
            r4.f5841b = r0     // Catch:{ all -> 0x0055 }
            java.util.List<c.a.b.c> r1 = r4.f5840a     // Catch:{ all -> 0x0055 }
            r2 = 0
            r4.f5840a = r2     // Catch:{ all -> 0x0055 }
            monitor-exit(r4)     // Catch:{ all -> 0x0055 }
            if (r1 == 0) goto L_0x0054
            java.util.Iterator r1 = r1.iterator()
        L_0x001b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x003a
            java.lang.Object r3 = r1.next()
            c.a.b.c r3 = (p064c.p065a.p069b.C1690c) r3
            r3.dispose()     // Catch:{ Throwable -> 0x002b }
            goto L_0x001b
        L_0x002b:
            r3 = move-exception
            p064c.p065a.p070c.C1700b.m6017b(r3)
            if (r2 != 0) goto L_0x0036
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0036:
            r2.add(r3)
            goto L_0x001b
        L_0x003a:
            if (r2 == 0) goto L_0x0054
            int r1 = r2.size()
            if (r1 != r0) goto L_0x004e
            r0 = 0
            java.lang.Object r0 = r2.get(r0)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.RuntimeException r0 = p064c.p065a.p072e.p087j.C2131h.m6422a(r0)
            throw r0
        L_0x004e:
            c.a.c.a r0 = new c.a.c.a
            r0.<init>(r2)
            throw r0
        L_0x0054:
            return
        L_0x0055:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0055 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p064c.p065a.p072e.p073a.C1720d.dispose():void");
    }

    /* renamed from: b */
    public final boolean mo6183b(C1690c cVar) {
        if (!mo6184c(cVar)) {
            return false;
        }
        cVar.dispose();
        return true;
    }

    /* renamed from: a */
    public final boolean mo6181a(C1690c cVar) {
        C1745b.m6050a(cVar, "d is null");
        if (!this.f5841b) {
            synchronized (this) {
                if (!this.f5841b) {
                    List list = this.f5840a;
                    if (list == null) {
                        list = new LinkedList();
                        this.f5840a = list;
                    }
                    list.add(cVar);
                    return true;
                }
            }
        }
        cVar.dispose();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0021, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo6184c(p064c.p065a.p069b.C1690c r3) {
        /*
            r2 = this;
            java.lang.String r0 = "Disposable item is null"
            p064c.p065a.p072e.p074b.C1745b.m6050a(r3, r0)
            boolean r0 = r2.f5841b
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            monitor-enter(r2)
            boolean r0 = r2.f5841b     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0012:
            java.util.List<c.a.b.c> r0 = r2.f5840a     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0020
            boolean r3 = r0.remove(r3)     // Catch:{ all -> 0x0022 }
            if (r3 != 0) goto L_0x001d
            goto L_0x0020
        L_0x001d:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            r3 = 1
            return r3
        L_0x0020:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0022:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p064c.p065a.p072e.p073a.C1720d.mo6184c(c.a.b.c):boolean");
    }
}
