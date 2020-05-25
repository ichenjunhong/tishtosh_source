package p064c.p065a.p072e.p085h;

import org.p2692b.C53696d;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p072e.p075c.C1747a;
import p064c.p065a.p072e.p075c.C1752f;
import p064c.p065a.p072e.p086i.C2122f;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.h.a */
public abstract class C2112a<T, R> implements C1747a<T>, C1752f<R> {

    /* renamed from: e */
    protected final C1747a<? super R> f6847e;

    /* renamed from: f */
    protected C53696d f6848f;

    /* renamed from: g */
    protected C1752f<T> f6849g;

    /* renamed from: h */
    protected boolean f6850h;

    /* renamed from: i */
    protected int f6851i;

    public void cancel() {
        this.f6848f.cancel();
    }

    public void clear() {
        this.f6849g.clear();
    }

    public boolean isEmpty() {
        return this.f6849g.isEmpty();
    }

    public void onComplete() {
        if (!this.f6850h) {
            this.f6850h = true;
            this.f6847e.onComplete();
        }
    }

    public C2112a(C1747a<? super R> aVar) {
        this.f6847e = aVar;
    }

    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public void request(long j) {
        this.f6848f.request(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6403a(Throwable th) {
        C1700b.m6017b(th);
        this.f6848f.cancel();
        onError(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo6402a(int i) {
        C1752f<T> fVar = this.f6849g;
        if (fVar == null || (i & 4) != 0) {
            return 0;
        }
        int requestFusion = fVar.requestFusion(i);
        if (requestFusion != 0) {
            this.f6851i = requestFusion;
        }
        return requestFusion;
    }

    public void onError(Throwable th) {
        if (this.f6850h) {
            C2150a.m6492a(th);
            return;
        }
        this.f6850h = true;
        this.f6847e.onError(th);
    }

    public final void onSubscribe(C53696d dVar) {
        if (C2122f.validate(this.f6848f, dVar)) {
            this.f6848f = dVar;
            if (dVar instanceof C1752f) {
                this.f6849g = (C1752f) dVar;
            }
            this.f6847e.onSubscribe(this);
        }
    }
}
