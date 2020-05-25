package p064c.p065a.p072e.p077e.p082e;

import p064c.p065a.C1680ad;
import p064c.p065a.C1683ag;
import p064c.p065a.C1685ai;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p072e.p074b.C1745b;

/* renamed from: c.a.e.e.e.k */
public final class C2049k<T, R> extends C1680ad<R> {

    /* renamed from: a */
    final C1685ai<? extends T> f6684a;

    /* renamed from: b */
    final C1711f<? super T, ? extends R> f6685b;

    /* renamed from: c.a.e.e.e.k$a */
    static final class C2050a<T, R> implements C1683ag<T> {

        /* renamed from: a */
        final C1683ag<? super R> f6686a;

        /* renamed from: b */
        final C1711f<? super T, ? extends R> f6687b;

        public final void onError(Throwable th) {
            this.f6686a.onError(th);
        }

        public final void onSubscribe(C1690c cVar) {
            this.f6686a.onSubscribe(cVar);
        }

        public final void onSuccess(T t) {
            try {
                this.f6686a.onSuccess(C1745b.m6050a(this.f6687b.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                C1700b.m6017b(th);
                onError(th);
            }
        }

        C2050a(C1683ag<? super R> agVar, C1711f<? super T, ? extends R> fVar) {
            this.f6686a = agVar;
            this.f6687b = fVar;
        }
    }

    /* renamed from: a */
    public final void mo6154a(C1683ag<? super R> agVar) {
        this.f6684a.mo6159b(new C2050a(agVar, this.f6685b));
    }

    public C2049k(C1685ai<? extends T> aiVar, C1711f<? super T, ? extends R> fVar) {
        this.f6684a = aiVar;
        this.f6685b = fVar;
    }
}
