package p064c.p065a.p072e.p076d;

import p064c.p065a.C1674ab;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p075c.C1754h;
import p064c.p065a.p072e.p087j.C2138k;
import p064c.p065a.p072e.p087j.C2141n;

/* renamed from: c.a.e.d.n */
public abstract class C1769n<T, U, V> extends C1771p implements C1674ab<T>, C2138k<U, V> {

    /* renamed from: a */
    protected final C1674ab<? super V> f5897a;

    /* renamed from: b */
    public final C1754h<U> f5898b;

    /* renamed from: c */
    public volatile boolean f5899c;

    /* renamed from: d */
    protected volatile boolean f5900d;

    /* renamed from: e */
    protected Throwable f5901e;

    /* renamed from: a */
    public void mo6253a(C1674ab<? super V> abVar, U u) {
    }

    /* renamed from: b */
    public final boolean mo6257b() {
        return this.f5900d;
    }

    /* renamed from: d */
    public final Throwable mo6259d() {
        return this.f5901e;
    }

    /* renamed from: a */
    public final boolean mo6255a() {
        return this.f5899c;
    }

    /* renamed from: c */
    public final boolean mo6258c() {
        if (this.f5902f.getAndIncrement() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final int mo6252a(int i) {
        return this.f5902f.addAndGet(i);
    }

    public C1769n(C1674ab<? super V> abVar, C1754h<U> hVar) {
        this.f5897a = abVar;
        this.f5898b = hVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6254a(U u, boolean z, C1690c cVar) {
        C1674ab<? super V> abVar = this.f5897a;
        C1754h<U> hVar = this.f5898b;
        if (this.f5902f.get() != 0 || !this.f5902f.compareAndSet(0, 1)) {
            hVar.offer(u);
            if (!mo6258c()) {
                return;
            }
        } else {
            mo6253a(abVar, u);
            if (mo6252a(-1) == 0) {
                return;
            }
        }
        C2141n.m6438a(hVar, abVar, false, cVar, this);
    }

    /* renamed from: b */
    public final void mo6256b(U u, boolean z, C1690c cVar) {
        C1674ab<? super V> abVar = this.f5897a;
        C1754h<U> hVar = this.f5898b;
        if (this.f5902f.get() != 0 || !this.f5902f.compareAndSet(0, 1)) {
            hVar.offer(u);
            if (!mo6258c()) {
                return;
            }
        } else if (hVar.isEmpty()) {
            mo6253a(abVar, u);
            if (mo6252a(-1) == 0) {
                return;
            }
        } else {
            hVar.offer(u);
        }
        C2141n.m6438a(hVar, abVar, false, cVar, this);
    }
}
