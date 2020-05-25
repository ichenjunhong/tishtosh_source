package p064c.p065a.p072e.p085h;

import org.p2692b.C53695c;
import org.p2692b.C53696d;
import p064c.p065a.C2177l;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p072e.p075c.C1752f;
import p064c.p065a.p072e.p086i.C2122f;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.h.b */
public abstract class C2113b<T, R> implements C1752f<R>, C2177l<T> {

    /* renamed from: e */
    protected final C53695c<? super R> f6852e;

    /* renamed from: f */
    protected C53696d f6853f;

    /* renamed from: g */
    protected C1752f<T> f6854g;

    /* renamed from: h */
    protected boolean f6855h;

    /* renamed from: i */
    protected int f6856i;

    public void cancel() {
        this.f6853f.cancel();
    }

    public void clear() {
        this.f6854g.clear();
    }

    public boolean isEmpty() {
        return this.f6854g.isEmpty();
    }

    public void onComplete() {
        if (!this.f6855h) {
            this.f6855h = true;
            this.f6852e.onComplete();
        }
    }

    public C2113b(C53695c<? super R> cVar) {
        this.f6852e = cVar;
    }

    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public void request(long j) {
        this.f6853f.request(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6405a(Throwable th) {
        C1700b.m6017b(th);
        this.f6853f.cancel();
        onError(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo6404a(int i) {
        C1752f<T> fVar = this.f6854g;
        if (fVar == null || (i & 4) != 0) {
            return 0;
        }
        int requestFusion = fVar.requestFusion(i);
        if (requestFusion != 0) {
            this.f6856i = requestFusion;
        }
        return requestFusion;
    }

    public void onError(Throwable th) {
        if (this.f6855h) {
            C2150a.m6492a(th);
            return;
        }
        this.f6855h = true;
        this.f6852e.onError(th);
    }

    public final void onSubscribe(C53696d dVar) {
        if (C2122f.validate(this.f6853f, dVar)) {
            this.f6853f = dVar;
            if (dVar instanceof C1752f) {
                this.f6854g = (C1752f) dVar;
            }
            this.f6852e.onSubscribe(this);
        }
    }
}
