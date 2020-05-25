package com.bytedance.android.live.core.rxutils.autodispose;

import java.util.concurrent.atomic.AtomicReference;
import org.p2692b.C53696d;

/* renamed from: com.bytedance.android.live.core.rxutils.autodispose.y */
enum C4050y implements C53696d {
    CANCELLED;

    public final void cancel() {
    }

    public final void request(long j) {
    }

    /* renamed from: a */
    static boolean m10171a(AtomicReference<C53696d> atomicReference) {
        if (((C53696d) atomicReference.get()) != CANCELLED) {
            C53696d dVar = (C53696d) atomicReference.getAndSet(CANCELLED);
            if (dVar != CANCELLED) {
                if (dVar != null) {
                    dVar.cancel();
                }
                return true;
            }
        }
        return false;
    }
}
