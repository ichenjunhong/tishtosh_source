package p064c.p065a.p072e.p076d;

import p064c.p065a.C1674ab;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p072e.p075c.C1750d;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.d.a */
public abstract class C1756a<T, R> implements C1674ab<T>, C1750d<R> {

    /* renamed from: a */
    protected final C1674ab<? super R> f5865a;

    /* renamed from: b */
    protected C1690c f5866b;

    /* renamed from: c */
    protected C1750d<T> f5867c;

    /* renamed from: d */
    protected boolean f5868d;

    /* renamed from: e */
    protected int f5869e;

    public void clear() {
        this.f5867c.clear();
    }

    public void dispose() {
        this.f5866b.dispose();
    }

    public boolean isDisposed() {
        return this.f5866b.isDisposed();
    }

    public boolean isEmpty() {
        return this.f5867c.isEmpty();
    }

    public void onComplete() {
        if (!this.f5868d) {
            this.f5868d = true;
            this.f5865a.onComplete();
        }
    }

    public C1756a(C1674ab<? super R> abVar) {
        this.f5865a = abVar;
    }

    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6232a(Throwable th) {
        C1700b.m6017b(th);
        this.f5866b.dispose();
        onError(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo6231a(int i) {
        C1750d<T> dVar = this.f5867c;
        if (dVar == null || (i & 4) != 0) {
            return 0;
        }
        int requestFusion = dVar.requestFusion(i);
        if (requestFusion != 0) {
            this.f5869e = requestFusion;
        }
        return requestFusion;
    }

    public void onError(Throwable th) {
        if (this.f5868d) {
            C2150a.m6492a(th);
            return;
        }
        this.f5868d = true;
        this.f5865a.onError(th);
    }

    public final void onSubscribe(C1690c cVar) {
        if (C1718b.validate(this.f5866b, cVar)) {
            this.f5866b = cVar;
            if (cVar instanceof C1750d) {
                this.f5867c = (C1750d) cVar;
            }
            this.f5865a.onSubscribe(this);
        }
    }
}
