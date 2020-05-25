package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.internal.j */
public class C53319j<E> {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f131943a = AtomicReferenceFieldUpdater.newUpdater(C53319j.class, Object.class, "_cur$internal");
    public volatile /* synthetic */ Object _cur$internal = new C53320k(8, false);

    /* renamed from: a */
    public final void mo110913a() {
        while (true) {
            C53320k kVar = (C53320k) this._cur$internal;
            if (!kVar.mo110919b()) {
                f131943a.compareAndSet(this, kVar, kVar.mo110920c());
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006c, code lost:
        r7 = r9;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final E mo110915b() {
        /*
            r11 = this;
        L_0x0000:
            java.lang.Object r0 = r11._cur$internal
            kotlinx.coroutines.internal.k r0 = (kotlinx.coroutines.internal.C53320k) r0
        L_0x0004:
            long r3 = r0._state$internal
            r1 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            r5 = 0
            r7 = 0
            int r8 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r8 == 0) goto L_0x0013
            kotlinx.coroutines.internal.u r7 = kotlinx.coroutines.internal.C53320k.f131945e
            goto L_0x006d
        L_0x0013:
            r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r1 = r1 & r3
            r5 = 0
            long r1 = r1 >> r5
            int r8 = (int) r1
            r1 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r1 = r1 & r3
            r5 = 30
            long r1 = r1 >> r5
            int r1 = (int) r1
            int r2 = r0.f131948a
            r1 = r1 & r2
            int r2 = r0.f131948a
            r2 = r2 & r8
            if (r1 != r2) goto L_0x002d
            goto L_0x006d
        L_0x002d:
            java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r1 = r0.f131949c
            int r2 = r0.f131948a
            r2 = r2 & r8
            java.lang.Object r9 = r1.get(r2)
            if (r9 != 0) goto L_0x003d
            boolean r1 = r0.f131950d
            if (r1 == 0) goto L_0x0004
            goto L_0x006d
        L_0x003d:
            boolean r1 = r9 instanceof kotlinx.coroutines.internal.C53320k.C53322b
            if (r1 == 0) goto L_0x0042
            goto L_0x006d
        L_0x0042:
            int r1 = r8 + 1
            r2 = 1073741823(0x3fffffff, float:1.9999999)
            r10 = r1 & r2
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.internal.C53320k.f131944b
            kotlinx.coroutines.internal.k$a r2 = kotlinx.coroutines.internal.C53320k.f131946f
            long r5 = r2.mo110921a(r3, r10)
            r2 = r0
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L_0x0061
            java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r1 = r0.f131949c
            int r2 = r0.f131948a
            r2 = r2 & r8
            r1.set(r2, r7)
            goto L_0x006c
        L_0x0061:
            boolean r1 = r0.f131950d
            if (r1 == 0) goto L_0x0004
            r1 = r0
        L_0x0066:
            kotlinx.coroutines.internal.k r1 = r1.mo110917a(r8, r10)
            if (r1 != 0) goto L_0x0066
        L_0x006c:
            r7 = r9
        L_0x006d:
            kotlinx.coroutines.internal.u r1 = kotlinx.coroutines.internal.C53320k.f131945e
            if (r7 == r1) goto L_0x0072
            return r7
        L_0x0072:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f131943a
            kotlinx.coroutines.internal.k r2 = r0.mo110920c()
            r1.compareAndSet(r11, r0, r2)
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C53319j.mo110915b():java.lang.Object");
    }

    public C53319j(boolean z) {
    }

    /* renamed from: a */
    public final boolean mo110914a(E e) {
        C52711k.m112240b(e, "element");
        while (true) {
            C53320k kVar = (C53320k) this._cur$internal;
            switch (kVar.mo110916a(e)) {
                case 0:
                    return true;
                case 1:
                    f131943a.compareAndSet(this, kVar, kVar.mo110920c());
                    break;
                case 2:
                    return false;
            }
        }
    }
}
