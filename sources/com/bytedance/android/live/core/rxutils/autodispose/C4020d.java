package com.bytedance.android.live.core.rxutils.autodispose;

import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.p069b.C1690c;

/* renamed from: com.bytedance.android.live.core.rxutils.autodispose.d */
enum C4020d implements C1690c {
    DISPOSED;

    public final void dispose() {
    }

    public final boolean isDisposed() {
        return true;
    }

    /* renamed from: a */
    static boolean m10135a(AtomicReference<C1690c> atomicReference) {
        C1690c cVar = (C1690c) atomicReference.get();
        C4020d dVar = DISPOSED;
        if (cVar != dVar) {
            C1690c cVar2 = (C1690c) atomicReference.getAndSet(dVar);
            if (cVar2 != dVar) {
                if (cVar2 != null) {
                    cVar2.dispose();
                }
                return true;
            }
        }
        return false;
    }
}
