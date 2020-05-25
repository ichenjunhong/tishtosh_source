package com.google.android.gms.internal.p1044e;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.e.e */
final class C16488e extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f46388a;

    public C16488e(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.f46388a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final int hashCode() {
        return this.f46388a;
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C16488e eVar = (C16488e) obj;
        return this.f46388a == eVar.f46388a && get() == eVar.get();
    }
}
