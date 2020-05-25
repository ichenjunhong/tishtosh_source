package p064c.p065a.p072e.p077e.p078a;

import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1675ac;
import p064c.p065a.C1687b;
import p064c.p065a.C1705d;
import p064c.p065a.C2142f;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p072e.p073a.C1722f;

/* renamed from: c.a.e.e.a.g */
public final class C1783g extends C1687b {

    /* renamed from: a */
    final C2142f f5919a;

    /* renamed from: b */
    final C1675ac f5920b;

    /* renamed from: c.a.e.e.a.g$a */
    static final class C1784a extends AtomicReference<C1690c> implements C1690c, C1705d, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;

        /* renamed from: a */
        final C1705d f5921a;

        /* renamed from: b */
        final C1722f f5922b = new C1722f();

        /* renamed from: c */
        final C2142f f5923c;

        public final void onComplete() {
            this.f5921a.onComplete();
        }

        public final void run() {
            this.f5923c.mo6175a(this);
        }

        public final void dispose() {
            C1718b.dispose(this);
            this.f5922b.dispose();
        }

        public final boolean isDisposed() {
            return C1718b.isDisposed((C1690c) get());
        }

        public final void onSubscribe(C1690c cVar) {
            C1718b.setOnce(this, cVar);
        }

        public final void onError(Throwable th) {
            this.f5921a.onError(th);
        }

        C1784a(C1705d dVar, C2142f fVar) {
            this.f5921a = dVar;
            this.f5923c = fVar;
        }
    }

    /* renamed from: b */
    public final void mo6178b(C1705d dVar) {
        C1784a aVar = new C1784a(dVar, this.f5919a);
        dVar.onSubscribe(aVar);
        aVar.f5922b.replace(this.f5920b.mo6139a(aVar));
    }

    public C1783g(C2142f fVar, C1675ac acVar) {
        this.f5919a = fVar;
        this.f5920b = acVar;
    }
}
