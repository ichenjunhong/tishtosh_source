package p064c.p065a.p072e.p077e.p080c;

import com.C2240a;
import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C2193n;
import p064c.p065a.C2195p;
import p064c.p065a.C2196q;
import p064c.p065a.C2197r;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.c.c */
public final class C1864c<T> extends C2193n<T> {

    /* renamed from: a */
    final C2197r<T> f6141a;

    /* renamed from: c.a.e.e.c.c$a */
    static final class C1865a<T> extends AtomicReference<C1690c> implements C1690c, C2195p<T> {
        private static final long serialVersionUID = -2467358622224974244L;

        /* renamed from: a */
        final C2196q<? super T> f6142a;

        public final void dispose() {
            C1718b.dispose(this);
        }

        public final boolean isDisposed() {
            return C1718b.isDisposed((C1690c) get());
        }

        public final String toString() {
            return C2240a.m6772a("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
        }

        C1865a(C2196q<? super T> qVar) {
            this.f6142a = qVar;
        }

        /* renamed from: a */
        public final void mo6304a(Throwable th) {
            if (!m6176b(th)) {
                C2150a.m6492a(th);
            }
        }

        /* renamed from: b */
        private boolean m6176b(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (get() != C1718b.DISPOSED) {
                C1690c cVar = (C1690c) getAndSet(C1718b.DISPOSED);
                if (cVar != C1718b.DISPOSED) {
                    try {
                        this.f6142a.onError(th);
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

        /* renamed from: a */
        public final void mo6303a(T t) {
            if (get() != C1718b.DISPOSED) {
                C1690c cVar = (C1690c) getAndSet(C1718b.DISPOSED);
                if (cVar != C1718b.DISPOSED) {
                    if (t == null) {
                        try {
                            this.f6142a.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                        } catch (Throwable th) {
                            if (cVar != null) {
                                cVar.dispose();
                            }
                            throw th;
                        }
                    } else {
                        this.f6142a.onSuccess(t);
                    }
                    if (cVar != null) {
                        cVar.dispose();
                    }
                }
            }
        }
    }

    public C1864c(C2197r<T> rVar) {
        this.f6141a = rVar;
    }

    /* renamed from: a */
    public final void mo6269a(C2196q<? super T> qVar) {
        C1865a aVar = new C1865a(qVar);
        qVar.onSubscribe(aVar);
        try {
            this.f6141a.mo6498a(aVar);
        } catch (Throwable th) {
            C1700b.m6017b(th);
            aVar.mo6304a(th);
        }
    }
}
