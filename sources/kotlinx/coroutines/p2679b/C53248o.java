package kotlinx.coroutines.p2679b;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2647j.C52753d;

/* renamed from: kotlinx.coroutines.b.o */
public final class C53248o {

    /* renamed from: b */
    static final AtomicIntegerFieldUpdater f131868b = AtomicIntegerFieldUpdater.newUpdater(C53248o.class, "producerIndex");

    /* renamed from: c */
    static final AtomicIntegerFieldUpdater f131869c = AtomicIntegerFieldUpdater.newUpdater(C53248o.class, "consumerIndex");

    /* renamed from: d */
    private static final AtomicReferenceFieldUpdater f131870d = AtomicReferenceFieldUpdater.newUpdater(C53248o.class, Object.class, "lastScheduledTask");

    /* renamed from: a */
    public final AtomicReferenceArray<C53242i> f131871a = new AtomicReferenceArray<>(128);
    volatile int consumerIndex = 0;
    volatile Object lastScheduledTask = null;
    volatile int producerIndex = 0;

    /* renamed from: a */
    public final int mo110830a() {
        return this.producerIndex - this.consumerIndex;
    }

    /* renamed from: b */
    public final C53242i mo110834b() {
        C53242i iVar = (C53242i) f131870d.getAndSet(this, null);
        if (iVar != null) {
            return iVar;
        }
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (((C53242i) this.f131871a.get(i2)) != null && f131869c.compareAndSet(this, i, i + 1)) {
                return (C53242i) this.f131871a.getAndSet(i2, null);
            }
        }
    }

    /* renamed from: a */
    private final boolean m113122a(C53242i iVar) {
        if (mo110830a() == 127) {
            return false;
        }
        int i = this.producerIndex & 127;
        if (this.f131871a.get(i) != null) {
            return false;
        }
        this.f131871a.lazySet(i, iVar);
        f131868b.incrementAndGet(this);
        return true;
    }

    /* renamed from: b */
    private final void m113123b(C53238e eVar) {
        C53242i iVar;
        int c = C52753d.m112321c(mo110830a() / 2, 1);
        int i = 0;
        while (i < c) {
            while (true) {
                int i2 = this.consumerIndex;
                iVar = null;
                if (i2 - this.producerIndex == 0) {
                    break;
                }
                int i3 = i2 & 127;
                if (((C53242i) this.f131871a.get(i3)) != null && f131869c.compareAndSet(this, i2, i2 + 1)) {
                    iVar = (C53242i) this.f131871a.getAndSet(i3, null);
                    break;
                }
            }
            if (iVar != null) {
                m113120a(eVar, iVar);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo110831a(C53238e eVar) {
        C53242i iVar;
        C52711k.m112240b(eVar, "globalQueue");
        C53242i iVar2 = (C53242i) f131870d.getAndSet(this, null);
        if (iVar2 != null) {
            m113120a(eVar, iVar2);
        }
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                iVar = null;
            } else {
                int i2 = i & 127;
                if (((C53242i) this.f131871a.get(i2)) != null && f131869c.compareAndSet(this, i, i + 1)) {
                    iVar = (C53242i) this.f131871a.getAndSet(i2, null);
                }
            }
            if (iVar != null) {
                m113120a(eVar, iVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static void m113120a(C53238e eVar, C53242i iVar) {
        if (!eVar.mo110914a(iVar)) {
            throw new IllegalStateException("GlobalQueue could not be closed yet".toString());
        }
    }

    /* renamed from: b */
    public final boolean mo110835b(C53242i iVar, C53238e eVar) {
        C52711k.m112240b(iVar, "task");
        C52711k.m112240b(eVar, "globalQueue");
        boolean z = true;
        while (!m113122a(iVar)) {
            m113123b(eVar);
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public final boolean mo110832a(C53242i iVar, C53238e eVar) {
        C52711k.m112240b(iVar, "task");
        C52711k.m112240b(eVar, "globalQueue");
        C53242i iVar2 = (C53242i) f131870d.getAndSet(this, iVar);
        if (iVar2 == null) {
            return true;
        }
        return mo110835b(iVar2, eVar);
    }

    /* renamed from: a */
    public final boolean mo110833a(C53248o oVar, C53238e eVar) {
        C53242i iVar;
        boolean z;
        C53248o oVar2 = oVar;
        C53238e eVar2 = eVar;
        C52711k.m112240b(oVar2, "victim");
        C52711k.m112240b(eVar2, "globalQueue");
        long a = C53246m.f131867g.mo110826a();
        int a2 = oVar.mo110830a();
        if (a2 == 0) {
            return m113121a(a, oVar2, eVar2);
        }
        int c = C52753d.m112321c(a2 / 2, 1);
        int i = 0;
        boolean z2 = false;
        while (i < c) {
            while (true) {
                int i2 = oVar2.consumerIndex;
                iVar = null;
                if (i2 - oVar2.producerIndex == 0) {
                    break;
                }
                int i3 = i2 & 127;
                C53242i iVar2 = (C53242i) oVar2.f131871a.get(i3);
                if (iVar2 != null) {
                    if (a - iVar2.f131857f >= C53246m.f131861a || oVar.mo110830a() > C53246m.f131862b) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        break;
                    } else if (f131869c.compareAndSet(oVar2, i2, i2 + 1)) {
                        iVar = (C53242i) oVar2.f131871a.getAndSet(i3, null);
                        break;
                    }
                }
            }
            if (iVar == null) {
                return z2;
            }
            mo110832a(iVar, eVar2);
            i++;
            z2 = true;
        }
        return z2;
    }

    /* renamed from: a */
    private final boolean m113121a(long j, C53248o oVar, C53238e eVar) {
        C53242i iVar = (C53242i) oVar.lastScheduledTask;
        if (iVar == null || j - iVar.f131857f < C53246m.f131861a || !f131870d.compareAndSet(oVar, iVar, null)) {
            return false;
        }
        mo110832a(iVar, eVar);
        return true;
    }
}
