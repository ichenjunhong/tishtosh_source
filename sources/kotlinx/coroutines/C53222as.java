package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.internal.C53329r;
import p2628d.p2631c.C52625c;
import p2628d.p2631c.C52628e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.as */
final class C53222as<T> extends C53329r<T> {

    /* renamed from: b */
    static final AtomicIntegerFieldUpdater f131804b = AtomicIntegerFieldUpdater.newUpdater(C53222as.class, "_decision");
    volatile int _decision = 0;

    /* renamed from: f */
    public final int mo110759f() {
        return 0;
    }

    public C53222as(C52628e eVar, C52625c<? super T> cVar) {
        C52711k.m112240b(eVar, "context");
        C52711k.m112240b(cVar, "uCont");
        super(eVar, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo110752a(java.lang.Object r4, int r5, boolean r6) {
        /*
            r3 = this;
        L_0x0000:
            int r0 = r3._decision
            r1 = 0
            switch(r0) {
                case 0: goto L_0x0014;
                case 1: goto L_0x001e;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Already resumed"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            throw r4
        L_0x0014:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f131804b
            r2 = 2
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            if (r0 == 0) goto L_0x0000
            r1 = 1
        L_0x001e:
            if (r1 == 0) goto L_0x0021
            return
        L_0x0021:
            super.mo110752a(r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C53222as.mo110752a(java.lang.Object, int, boolean):void");
    }
}
