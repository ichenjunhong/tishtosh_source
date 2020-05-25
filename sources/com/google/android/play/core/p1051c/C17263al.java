package com.google.android.play.core.p1051c;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.play.core.c.al */
final class C17263al extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f48732a;

    public C17263al(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.f48732a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (this == obj) {
                return true;
            }
            C17263al alVar = (C17263al) obj;
            return this.f48732a == alVar.f48732a && get() == alVar.get();
        }
    }

    public final int hashCode() {
        return this.f48732a;
    }
}
