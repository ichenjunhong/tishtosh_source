package p064c.p065a.p072e.p077e.p078a;

import com.C2240a;
import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1687b;
import p064c.p065a.C1694c;
import p064c.p065a.C1705d;
import p064c.p065a.C1716e;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.a.a */
public final class C1774a extends C1687b {

    /* renamed from: a */
    final C1716e f5905a;

    /* renamed from: c.a.e.e.a.a$a */
    static final class C1775a extends AtomicReference<C1690c> implements C1690c, C1694c {
        private static final long serialVersionUID = -2467358622224974244L;

        /* renamed from: a */
        final C1705d f5906a;

        public final void dispose() {
            C1718b.dispose(this);
        }

        public final boolean isDisposed() {
            return C1718b.isDisposed((C1690c) get());
        }

        public final String toString() {
            return C2240a.m6772a("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
        }

        /* renamed from: a */
        public final void mo6186a() {
            if (get() != C1718b.DISPOSED) {
                C1690c cVar = (C1690c) getAndSet(C1718b.DISPOSED);
                if (cVar != C1718b.DISPOSED) {
                    try {
                        this.f5906a.onComplete();
                    } finally {
                        if (cVar != null) {
                            cVar.dispose();
                        }
                    }
                }
            }
        }

        C1775a(C1705d dVar) {
            this.f5906a = dVar;
        }

        /* renamed from: a */
        public final boolean mo6260a(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (get() != C1718b.DISPOSED) {
                C1690c cVar = (C1690c) getAndSet(C1718b.DISPOSED);
                if (cVar != C1718b.DISPOSED) {
                    try {
                        this.f5906a.onError(th);
                        return true;
                    } finally {
                        if (cVar != null) {
                            cVar.dispose();
                        }
                    }
                }
            }
            return false;
        }
    }

    public C1774a(C1716e eVar) {
        this.f5905a = eVar;
    }

    /* renamed from: b */
    public final void mo6178b(C1705d dVar) {
        C1775a aVar = new C1775a(dVar);
        dVar.onSubscribe(aVar);
        try {
            this.f5905a.mo6208a(aVar);
        } catch (Throwable th) {
            C1700b.m6017b(th);
            if (!aVar.mo6260a(th)) {
                C2150a.m6492a(th);
            }
        }
    }
}
