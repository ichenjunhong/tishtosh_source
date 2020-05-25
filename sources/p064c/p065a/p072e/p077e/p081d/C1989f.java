package p064c.p065a.p072e.p077e.p081d;

import com.C2240a;
import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1674ab;
import p064c.p065a.C2201v;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.d.f */
public final class C1989f<T> extends C2201v<T> {

    /* renamed from: a */
    final C2205y<T> f6516a;

    /* renamed from: c.a.e.e.d.f$a */
    static final class C1990a<T> extends AtomicReference<C1690c> implements C1690c, C2204x<T> {
        private static final long serialVersionUID = -3434801548987643227L;

        /* renamed from: a */
        final C1674ab<? super T> f6517a;

        public final void dispose() {
            C1718b.dispose(this);
        }

        public final boolean isDisposed() {
            return C1718b.isDisposed((C1690c) get());
        }

        /* renamed from: a */
        public final void mo6273a() {
            if (!isDisposed()) {
                try {
                    this.f6517a.onComplete();
                } finally {
                    dispose();
                }
            }
        }

        public final String toString() {
            return C2240a.m6772a("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
        }

        C1990a(C1674ab<? super T> abVar) {
            this.f6517a = abVar;
        }

        /* renamed from: a */
        public final void mo6274a(Throwable th) {
            if (!m6280b(th)) {
                C2150a.m6492a(th);
            }
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: b */
        private boolean m6280b(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isDisposed()) {
                return false;
            }
            try {
                this.f6517a.onError(th);
                dispose();
                return true;
            } catch (Throwable th2) {
                dispose();
                throw th2;
            }
        }

        /* renamed from: a */
        public final void mo6282a(T t) {
            if (t == null) {
                mo6274a((Throwable) new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            if (!isDisposed()) {
                this.f6517a.onNext(t);
            }
        }
    }

    public C1989f(C2205y<T> yVar) {
        this.f6516a = yVar;
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super T> abVar) {
        C1990a aVar = new C1990a(abVar);
        abVar.onSubscribe(aVar);
        try {
            this.f6516a.subscribe(aVar);
        } catch (Throwable th) {
            C1700b.m6017b(th);
            aVar.mo6274a(th);
        }
    }
}
