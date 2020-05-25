package p064c.p065a.p072e.p077e.p078a;

import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1675ac;
import p064c.p065a.C1687b;
import p064c.p065a.C1705d;
import p064c.p065a.C2142f;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p073a.C1718b;

/* renamed from: c.a.e.e.a.e */
public final class C1779e extends C1687b {

    /* renamed from: a */
    final C2142f f5910a;

    /* renamed from: b */
    final C1675ac f5911b;

    /* renamed from: c.a.e.e.a.e$a */
    static final class C1780a extends AtomicReference<C1690c> implements C1690c, C1705d, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;

        /* renamed from: a */
        final C1705d f5912a;

        /* renamed from: b */
        final C1675ac f5913b;

        /* renamed from: c */
        Throwable f5914c;

        public final void dispose() {
            C1718b.dispose(this);
        }

        public final boolean isDisposed() {
            return C1718b.isDisposed((C1690c) get());
        }

        public final void onComplete() {
            C1718b.replace(this, this.f5913b.mo6139a(this));
        }

        public final void run() {
            Throwable th = this.f5914c;
            if (th != null) {
                this.f5914c = null;
                this.f5912a.onError(th);
                return;
            }
            this.f5912a.onComplete();
        }

        public final void onError(Throwable th) {
            this.f5914c = th;
            C1718b.replace(this, this.f5913b.mo6139a(this));
        }

        public final void onSubscribe(C1690c cVar) {
            if (C1718b.setOnce(this, cVar)) {
                this.f5912a.onSubscribe(this);
            }
        }

        C1780a(C1705d dVar, C1675ac acVar) {
            this.f5912a = dVar;
            this.f5913b = acVar;
        }
    }

    /* renamed from: b */
    public final void mo6178b(C1705d dVar) {
        this.f5910a.mo6175a(new C1780a(dVar, this.f5911b));
    }

    public C1779e(C2142f fVar, C1675ac acVar) {
        this.f5910a = fVar;
        this.f5911b = acVar;
    }
}
