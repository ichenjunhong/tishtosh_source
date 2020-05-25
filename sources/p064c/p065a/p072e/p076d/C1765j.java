package p064c.p065a.p072e.p076d;

import p064c.p065a.C1674ab;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1706a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p072e.p073a.C1719c;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.d.j */
public final class C1765j<T> implements C1674ab<T>, C1690c {

    /* renamed from: a */
    final C1674ab<? super T> f5884a;

    /* renamed from: b */
    final C1710e<? super C1690c> f5885b;

    /* renamed from: c */
    final C1706a f5886c;

    /* renamed from: d */
    C1690c f5887d;

    public final boolean isDisposed() {
        return this.f5887d.isDisposed();
    }

    public final void onComplete() {
        if (this.f5887d != C1718b.DISPOSED) {
            this.f5887d = C1718b.DISPOSED;
            this.f5884a.onComplete();
        }
    }

    public final void dispose() {
        C1690c cVar = this.f5887d;
        if (cVar != C1718b.DISPOSED) {
            this.f5887d = C1718b.DISPOSED;
            try {
                this.f5886c.mo6199a();
            } catch (Throwable th) {
                C1700b.m6017b(th);
                C2150a.m6492a(th);
            }
            cVar.dispose();
        }
    }

    public final void onNext(T t) {
        this.f5884a.onNext(t);
    }

    public final void onError(Throwable th) {
        if (this.f5887d != C1718b.DISPOSED) {
            this.f5887d = C1718b.DISPOSED;
            this.f5884a.onError(th);
            return;
        }
        C2150a.m6492a(th);
    }

    public final void onSubscribe(C1690c cVar) {
        try {
            this.f5885b.accept(cVar);
            if (C1718b.validate(this.f5887d, cVar)) {
                this.f5887d = cVar;
                this.f5884a.onSubscribe(this);
            }
        } catch (Throwable th) {
            C1700b.m6017b(th);
            cVar.dispose();
            this.f5887d = C1718b.DISPOSED;
            C1719c.error(th, this.f5884a);
        }
    }

    public C1765j(C1674ab<? super T> abVar, C1710e<? super C1690c> eVar, C1706a aVar) {
        this.f5884a = abVar;
        this.f5885b = eVar;
        this.f5886c = aVar;
    }
}
