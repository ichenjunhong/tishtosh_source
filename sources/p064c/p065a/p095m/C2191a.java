package p064c.p065a.p095m;

import java.util.concurrent.atomic.AtomicReference;
import org.p2692b.C53696d;
import p064c.p065a.C2177l;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p086i.C2122f;
import p064c.p065a.p072e.p087j.C2129f;

/* renamed from: c.a.m.a */
public abstract class C2191a<T> implements C1690c, C2177l<T> {

    /* renamed from: c */
    final AtomicReference<C53696d> f7023c = new AtomicReference<>();

    public final void dispose() {
        C2122f.cancel(this.f7023c);
    }

    public final boolean isDisposed() {
        if (this.f7023c.get() == C2122f.CANCELLED) {
            return true;
        }
        return false;
    }

    public final void onSubscribe(C53696d dVar) {
        boolean z;
        AtomicReference<C53696d> atomicReference = this.f7023c;
        Class cls = getClass();
        C1745b.m6050a(dVar, "next is null");
        if (!atomicReference.compareAndSet(null, dVar)) {
            dVar.cancel();
            if (atomicReference.get() != C2122f.CANCELLED) {
                C2129f.m6420a(cls);
            }
            z = false;
        } else {
            z = true;
        }
        if (z) {
            ((C53696d) this.f7023c.get()).request(Long.MAX_VALUE);
        }
    }
}
