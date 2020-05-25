package p064c.p065a.p072e.p076d;

import java.util.concurrent.CountDownLatch;
import p064c.p065a.C1683ag;
import p064c.p065a.C1705d;
import p064c.p065a.C2196q;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p087j.C2128e;
import p064c.p065a.p072e.p087j.C2131h;

/* renamed from: c.a.e.d.f */
public final class C1761f<T> extends CountDownLatch implements C1683ag<T>, C1705d, C2196q<T> {

    /* renamed from: a */
    T f5874a;

    /* renamed from: b */
    Throwable f5875b;

    /* renamed from: c */
    C1690c f5876c;

    /* renamed from: d */
    volatile boolean f5877d;

    public final void onComplete() {
        countDown();
    }

    public C1761f() {
        super(1);
    }

    /* renamed from: a */
    public final T mo6235a() {
        if (getCount() != 0) {
            try {
                C2128e.m6418a();
                await();
            } catch (InterruptedException e) {
                this.f5877d = true;
                C1690c cVar = this.f5876c;
                if (cVar != null) {
                    cVar.dispose();
                }
                throw C2131h.m6422a(e);
            }
        }
        Throwable th = this.f5875b;
        if (th == null) {
            return this.f5874a;
        }
        throw C2131h.m6422a(th);
    }

    public final void onError(Throwable th) {
        this.f5875b = th;
        countDown();
    }

    public final void onSuccess(T t) {
        this.f5874a = t;
        countDown();
    }

    public final void onSubscribe(C1690c cVar) {
        this.f5876c = cVar;
        if (this.f5877d) {
            cVar.dispose();
        }
    }
}
