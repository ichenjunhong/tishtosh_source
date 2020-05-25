package p064c.p065a.p072e.p076d;

import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1674ab;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p072e.p075c.C1750d;
import p064c.p065a.p072e.p075c.C1755i;
import p064c.p065a.p072e.p083f.C2071b;
import p064c.p065a.p072e.p083f.C2072c;

/* renamed from: c.a.e.d.k */
public final class C1766k<T> extends AtomicReference<C1690c> implements C1674ab<T>, C1690c {
    private static final long serialVersionUID = -5417183359794346637L;

    /* renamed from: a */
    final C1767l<T> f5888a;

    /* renamed from: b */
    final int f5889b;

    /* renamed from: c */
    C1755i<T> f5890c;

    /* renamed from: d */
    volatile boolean f5891d;

    /* renamed from: e */
    int f5892e;

    public final void dispose() {
        C1718b.dispose(this);
    }

    public final int fusionMode() {
        return this.f5892e;
    }

    public final boolean isDone() {
        return this.f5891d;
    }

    public final C1755i<T> queue() {
        return this.f5890c;
    }

    public final void setDone() {
        this.f5891d = true;
    }

    public final void onComplete() {
        this.f5888a.mo6248a(this);
    }

    public final boolean isDisposed() {
        return C1718b.isDisposed((C1690c) get());
    }

    public final void onError(Throwable th) {
        this.f5888a.mo6250a(this, th);
    }

    public final void onNext(T t) {
        if (this.f5892e == 0) {
            this.f5888a.mo6249a(this, t);
        } else {
            this.f5888a.mo6247a();
        }
    }

    public final void onSubscribe(C1690c cVar) {
        C1755i<T> iVar;
        if (C1718b.setOnce(this, cVar)) {
            if (cVar instanceof C1750d) {
                C1750d dVar = (C1750d) cVar;
                int requestFusion = dVar.requestFusion(3);
                if (requestFusion == 1) {
                    this.f5892e = requestFusion;
                    this.f5890c = dVar;
                    this.f5891d = true;
                    this.f5888a.mo6248a(this);
                    return;
                } else if (requestFusion == 2) {
                    this.f5892e = requestFusion;
                    this.f5890c = dVar;
                    return;
                }
            }
            int i = -this.f5889b;
            if (i < 0) {
                iVar = new C2072c<>(-i);
            } else {
                iVar = new C2071b<>(i);
            }
            this.f5890c = iVar;
        }
    }

    public C1766k(C1767l<T> lVar, int i) {
        this.f5888a = lVar;
        this.f5889b = i;
    }
}
