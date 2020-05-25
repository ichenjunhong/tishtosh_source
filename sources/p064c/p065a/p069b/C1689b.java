package p064c.p065a.p069b;

import java.util.ArrayList;
import java.util.List;
import p064c.p065a.p070c.C1695a;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p072e.p073a.C1717a;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p087j.C2131h;
import p064c.p065a.p072e.p087j.C2139l;

/* renamed from: c.a.b.b */
public final class C1689b implements C1690c, C1717a {

    /* renamed from: a */
    C2139l<C1690c> f5831a;

    /* renamed from: b */
    volatile boolean f5832b;

    public final boolean isDisposed() {
        return this.f5832b;
    }

    /* renamed from: a */
    public final void mo6180a() {
        if (!this.f5832b) {
            synchronized (this) {
                if (!this.f5832b) {
                    C2139l<C1690c> lVar = this.f5831a;
                    this.f5831a = null;
                    m5997a(lVar);
                }
            }
        }
    }

    public final void dispose() {
        if (!this.f5832b) {
            synchronized (this) {
                if (!this.f5832b) {
                    this.f5832b = true;
                    C2139l<C1690c> lVar = this.f5831a;
                    this.f5831a = null;
                    m5997a(lVar);
                }
            }
        }
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
        if (!this.f5832b) {
            synchronized (this) {
                if (!this.f5832b) {
                    C2139l<C1690c> lVar = this.f5831a;
                    if (lVar == null) {
                        lVar = new C2139l<>();
                        this.f5831a = lVar;
                    }
                    lVar.mo6435a(cVar);
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
            boolean r0 = r2.f5832b
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            monitor-enter(r2)
            boolean r0 = r2.f5832b     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0012:
            c.a.e.j.l<c.a.b.c> r0 = r2.f5831a     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0020
            boolean r3 = r0.mo6436b(r3)     // Catch:{ all -> 0x0022 }
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
        throw new UnsupportedOperationException("Method not decompiled: p064c.p065a.p069b.C1689b.mo6184c(c.a.b.c):boolean");
    }

    /* renamed from: a */
    private static void m5997a(C2139l<C1690c> lVar) {
        T[] tArr;
        if (lVar != null) {
            List list = null;
            for (T t : lVar.f6900e) {
                if (t instanceof C1690c) {
                    try {
                        ((C1690c) t).dispose();
                    } catch (Throwable th) {
                        C1700b.m6017b(th);
                        if (list == null) {
                            list = new ArrayList();
                        }
                        list.add(th);
                    }
                }
            }
            if (list == null) {
                return;
            }
            if (list.size() == 1) {
                throw C2131h.m6422a((Throwable) list.get(0));
            }
            throw new C1695a((Iterable<? extends Throwable>) list);
        }
    }

    /* renamed from: a */
    public final boolean mo6182a(C1690c... cVarArr) {
        C1745b.m6050a(cVarArr, "ds is null");
        if (!this.f5832b) {
            synchronized (this) {
                if (!this.f5832b) {
                    C2139l<C1690c> lVar = this.f5831a;
                    if (lVar == null) {
                        lVar = new C2139l<>(3);
                        this.f5831a = lVar;
                    }
                    for (int i = 0; i < 2; i++) {
                        C1690c cVar = cVarArr[i];
                        C1745b.m6050a(cVar, "d is null");
                        lVar.mo6435a(cVar);
                    }
                    return true;
                }
            }
        }
        for (int i2 = 0; i2 < 2; i2++) {
            cVarArr[i2].dispose();
        }
        return false;
    }
}
