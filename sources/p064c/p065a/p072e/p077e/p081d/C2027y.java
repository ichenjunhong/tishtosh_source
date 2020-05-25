package p064c.p065a.p072e.p077e.p081d;

import java.util.Iterator;
import p064c.p065a.C1674ab;
import p064c.p065a.C2201v;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p072e.p073a.C1719c;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p076d.C1758c;

/* renamed from: c.a.e.e.d.y */
public final class C2027y<T> extends C2201v<T> {

    /* renamed from: a */
    final Iterable<? extends T> f6642a;

    /* renamed from: c.a.e.e.d.y$a */
    static final class C2028a<T> extends C1758c<T> {

        /* renamed from: a */
        final C1674ab<? super T> f6643a;

        /* renamed from: b */
        final Iterator<? extends T> f6644b;

        /* renamed from: c */
        volatile boolean f6645c;

        /* renamed from: d */
        boolean f6646d;

        /* renamed from: e */
        boolean f6647e;

        /* renamed from: f */
        boolean f6648f;

        public final void clear() {
            this.f6647e = true;
        }

        public final void dispose() {
            this.f6645c = true;
        }

        public final boolean isDisposed() {
            return this.f6645c;
        }

        public final boolean isEmpty() {
            return this.f6647e;
        }

        public final T poll() {
            if (this.f6647e) {
                return null;
            }
            if (!this.f6648f) {
                this.f6648f = true;
            } else if (!this.f6644b.hasNext()) {
                this.f6647e = true;
                return null;
            }
            return C1745b.m6050a(this.f6644b.next(), "The iterator returned a null value");
        }

        public final int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f6646d = true;
            return 1;
        }

        C2028a(C1674ab<? super T> abVar, Iterator<? extends T> it) {
            this.f6643a = abVar;
            this.f6644b = it;
        }
    }

    public C2027y(Iterable<? extends T> iterable) {
        this.f6642a = iterable;
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super T> abVar) {
        try {
            Iterator it = this.f6642a.iterator();
            try {
                if (!it.hasNext()) {
                    C1719c.complete(abVar);
                    return;
                }
                C2028a aVar = new C2028a(abVar, it);
                abVar.onSubscribe(aVar);
                if (!aVar.f6646d) {
                    while (true) {
                        if (aVar.isDisposed()) {
                            break;
                        }
                        try {
                            aVar.f6643a.onNext(C1745b.m6050a(aVar.f6644b.next(), "The iterator returned a null value"));
                            if (aVar.isDisposed()) {
                                break;
                            }
                            try {
                                if (!aVar.f6644b.hasNext()) {
                                    if (!aVar.isDisposed()) {
                                        aVar.f6643a.onComplete();
                                    }
                                }
                            } catch (Throwable th) {
                                C1700b.m6017b(th);
                                aVar.f6643a.onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            C1700b.m6017b(th2);
                            aVar.f6643a.onError(th2);
                            return;
                        }
                    }
                }
            } catch (Throwable th3) {
                C1700b.m6017b(th3);
                C1719c.error(th3, abVar);
            }
        } catch (Throwable th4) {
            C1700b.m6017b(th4);
            C1719c.error(th4, abVar);
        }
    }
}
