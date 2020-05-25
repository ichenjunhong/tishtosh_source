package p064c.p065a.p072e.p076d;

import java.util.concurrent.CountDownLatch;
import p064c.p065a.C1674ab;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p087j.C2128e;
import p064c.p065a.p072e.p087j.C2131h;

/* renamed from: c.a.e.d.d */
public abstract class C1759d<T> extends CountDownLatch implements C1674ab<T>, C1690c {

    /* renamed from: a */
    T f5870a;

    /* renamed from: b */
    Throwable f5871b;

    /* renamed from: c */
    C1690c f5872c;

    /* renamed from: d */
    volatile boolean f5873d;

    public final boolean isDisposed() {
        return this.f5873d;
    }

    public final void onComplete() {
        countDown();
    }

    public C1759d() {
        super(1);
    }

    public final void dispose() {
        this.f5873d = true;
        C1690c cVar = this.f5872c;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    /* renamed from: a */
    public final T mo6234a() {
        if (getCount() != 0) {
            try {
                C2128e.m6418a();
                await();
            } catch (InterruptedException e) {
                dispose();
                throw C2131h.m6422a(e);
            }
        }
        Throwable th = this.f5871b;
        if (th == null) {
            return this.f5870a;
        }
        throw C2131h.m6422a(th);
    }

    public final void onSubscribe(C1690c cVar) {
        this.f5872c = cVar;
        if (this.f5873d) {
            cVar.dispose();
        }
    }
}
