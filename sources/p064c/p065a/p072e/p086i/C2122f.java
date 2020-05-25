package p064c.p065a.p072e.p086i;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p2692b.C53696d;
import p064c.p065a.p070c.C1703e;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p087j.C2127d;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.i.f */
public enum C2122f implements C53696d {
    CANCELLED;

    public final void cancel() {
    }

    public final void request(long j) {
    }

    public static void reportSubscriptionSet() {
        C2150a.m6492a((Throwable) new C1703e("Subscription already set!"));
    }

    public static boolean cancel(AtomicReference<C53696d> atomicReference) {
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

    public static void reportMoreProduced(long j) {
        StringBuilder sb = new StringBuilder("More produced than requested: ");
        sb.append(j);
        C2150a.m6492a((Throwable) new C1703e(sb.toString()));
    }

    public static boolean validate(long j) {
        if (j > 0) {
            return true;
        }
        StringBuilder sb = new StringBuilder("n > 0 required but it was ");
        sb.append(j);
        C2150a.m6492a((Throwable) new IllegalArgumentException(sb.toString()));
        return false;
    }

    public static boolean replace(AtomicReference<C53696d> atomicReference, C53696d dVar) {
        C53696d dVar2;
        do {
            dVar2 = (C53696d) atomicReference.get();
            if (dVar2 == CANCELLED) {
                if (dVar != null) {
                    dVar.cancel();
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(dVar2, dVar));
        return true;
    }

    public static boolean set(AtomicReference<C53696d> atomicReference, C53696d dVar) {
        C53696d dVar2;
        do {
            dVar2 = (C53696d) atomicReference.get();
            if (dVar2 == CANCELLED) {
                if (dVar != null) {
                    dVar.cancel();
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(dVar2, dVar));
        if (dVar2 != null) {
            dVar2.cancel();
        }
        return true;
    }

    public static boolean setOnce(AtomicReference<C53696d> atomicReference, C53696d dVar) {
        C1745b.m6050a(dVar, "s is null");
        if (atomicReference.compareAndSet(null, dVar)) {
            return true;
        }
        dVar.cancel();
        if (atomicReference.get() != CANCELLED) {
            reportSubscriptionSet();
        }
        return false;
    }

    public static boolean validate(C53696d dVar, C53696d dVar2) {
        if (dVar2 == null) {
            C2150a.m6492a((Throwable) new NullPointerException("next is null"));
            return false;
        } else if (dVar == null) {
            return true;
        } else {
            dVar2.cancel();
            reportSubscriptionSet();
            return false;
        }
    }

    public static boolean setOnce(AtomicReference<C53696d> atomicReference, C53696d dVar, long j) {
        if (!setOnce(atomicReference, dVar)) {
            return false;
        }
        dVar.request(j);
        return true;
    }

    public static boolean deferredSetOnce(AtomicReference<C53696d> atomicReference, AtomicLong atomicLong, C53696d dVar) {
        if (!setOnce(atomicReference, dVar)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0);
        if (andSet != 0) {
            dVar.request(andSet);
        }
        return true;
    }

    public static void deferredRequest(AtomicReference<C53696d> atomicReference, AtomicLong atomicLong, long j) {
        C53696d dVar = (C53696d) atomicReference.get();
        if (dVar != null) {
            dVar.request(j);
            return;
        }
        if (validate(j)) {
            C2127d.m6415a(atomicLong, j);
            C53696d dVar2 = (C53696d) atomicReference.get();
            if (dVar2 != null) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    dVar2.request(andSet);
                }
            }
        }
    }
}
