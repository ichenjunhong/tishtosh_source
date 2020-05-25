package p064c.p065a.p072e.p073a;

import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1703e;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.a.b */
public enum C1718b implements C1690c {
    DISPOSED;

    public final void dispose() {
    }

    public final boolean isDisposed() {
        return true;
    }

    public static void reportDisposableSet() {
        C2150a.m6492a((Throwable) new C1703e("Disposable already set!"));
    }

    public static boolean isDisposed(C1690c cVar) {
        if (cVar == DISPOSED) {
            return true;
        }
        return false;
    }

    public static boolean dispose(AtomicReference<C1690c> atomicReference) {
        C1690c cVar = (C1690c) atomicReference.get();
        C1718b bVar = DISPOSED;
        if (cVar != bVar) {
            C1690c cVar2 = (C1690c) atomicReference.getAndSet(bVar);
            if (cVar2 != bVar) {
                if (cVar2 != null) {
                    cVar2.dispose();
                }
                return true;
            }
        }
        return false;
    }

    public static boolean replace(AtomicReference<C1690c> atomicReference, C1690c cVar) {
        C1690c cVar2;
        do {
            cVar2 = (C1690c) atomicReference.get();
            if (cVar2 == DISPOSED) {
                if (cVar != null) {
                    cVar.dispose();
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(cVar2, cVar));
        return true;
    }

    public static boolean set(AtomicReference<C1690c> atomicReference, C1690c cVar) {
        C1690c cVar2;
        do {
            cVar2 = (C1690c) atomicReference.get();
            if (cVar2 == DISPOSED) {
                if (cVar != null) {
                    cVar.dispose();
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(cVar2, cVar));
        if (cVar2 != null) {
            cVar2.dispose();
        }
        return true;
    }

    public static boolean setOnce(AtomicReference<C1690c> atomicReference, C1690c cVar) {
        C1745b.m6050a(cVar, "d is null");
        if (atomicReference.compareAndSet(null, cVar)) {
            return true;
        }
        cVar.dispose();
        if (atomicReference.get() != DISPOSED) {
            reportDisposableSet();
        }
        return false;
    }

    public static boolean trySet(AtomicReference<C1690c> atomicReference, C1690c cVar) {
        if (atomicReference.compareAndSet(null, cVar)) {
            return true;
        }
        if (atomicReference.get() == DISPOSED) {
            cVar.dispose();
        }
        return false;
    }

    public static boolean validate(C1690c cVar, C1690c cVar2) {
        if (cVar2 == null) {
            C2150a.m6492a((Throwable) new NullPointerException("next is null"));
            return false;
        } else if (cVar == null) {
            return true;
        } else {
            cVar2.dispose();
            reportDisposableSet();
            return false;
        }
    }
}
