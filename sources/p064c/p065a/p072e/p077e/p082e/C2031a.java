package p064c.p065a.p072e.p077e.p082e;

import com.C2240a;
import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1680ad;
import p064c.p065a.C1682af;
import p064c.p065a.C1683ag;
import p064c.p065a.C1684ah;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.e.a */
public final class C2031a<T> extends C1680ad<T> {

    /* renamed from: a */
    final C1684ah<T> f6652a;

    /* renamed from: c.a.e.e.e.a$a */
    static final class C2032a<T> extends AtomicReference<C1690c> implements C1682af<T>, C1690c {
        private static final long serialVersionUID = -2467358622224974244L;

        /* renamed from: a */
        final C1683ag<? super T> f6653a;

        public final void dispose() {
            C1718b.dispose(this);
        }

        public final boolean isDisposed() {
            return C1718b.isDisposed((C1690c) get());
        }

        public final String toString() {
            return C2240a.m6772a("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
        }

        C2032a(C1683ag<? super T> agVar) {
            this.f6653a = agVar;
        }

        /* renamed from: a */
        public final void mo6165a(Throwable th) {
            if (!mo6166b(th)) {
                C2150a.m6492a(th);
            }
        }

        /* renamed from: a */
        public final void mo6164a(T t) {
            if (get() != C1718b.DISPOSED) {
                C1690c cVar = (C1690c) getAndSet(C1718b.DISPOSED);
                if (cVar != C1718b.DISPOSED) {
                    if (t == null) {
                        try {
                            this.f6653a.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                        } catch (Throwable th) {
                            if (cVar != null) {
                                cVar.dispose();
                            }
                            throw th;
                        }
                    } else {
                        this.f6653a.onSuccess(t);
                    }
                    if (cVar != null) {
                        cVar.dispose();
                    }
                }
            }
        }

        /* renamed from: b */
        public final boolean mo6166b(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (get() != C1718b.DISPOSED) {
                C1690c cVar = (C1690c) getAndSet(C1718b.DISPOSED);
                if (cVar != C1718b.DISPOSED) {
                    try {
                        this.f6653a.onError(th);
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

    public C2031a(C1684ah<T> ahVar) {
        this.f6652a = ahVar;
    }

    /* renamed from: a */
    public final void mo6154a(C1683ag<? super T> agVar) {
        C2032a aVar = new C2032a(agVar);
        agVar.onSubscribe(aVar);
        try {
            this.f6652a.mo6171a(aVar);
        } catch (Throwable th) {
            C1700b.m6017b(th);
            aVar.mo6165a(th);
        }
    }
}
