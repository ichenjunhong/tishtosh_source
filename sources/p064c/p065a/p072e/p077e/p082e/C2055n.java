package p064c.p065a.p072e.p077e.p082e;

import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1680ad;
import p064c.p065a.C1683ag;
import p064c.p065a.C1685ai;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1695a;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p072e.p073a.C1718b;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p076d.C1773r;

/* renamed from: c.a.e.e.e.n */
public final class C2055n<T> extends C1680ad<T> {

    /* renamed from: a */
    final C1685ai<? extends T> f6699a;

    /* renamed from: b */
    final C1711f<? super Throwable, ? extends C1685ai<? extends T>> f6700b;

    /* renamed from: c.a.e.e.e.n$a */
    static final class C2056a<T> extends AtomicReference<C1690c> implements C1683ag<T>, C1690c {
        private static final long serialVersionUID = -5314538511045349925L;

        /* renamed from: a */
        final C1683ag<? super T> f6701a;

        /* renamed from: b */
        final C1711f<? super Throwable, ? extends C1685ai<? extends T>> f6702b;

        public final void dispose() {
            C1718b.dispose(this);
        }

        public final boolean isDisposed() {
            return C1718b.isDisposed((C1690c) get());
        }

        public final void onSuccess(T t) {
            this.f6701a.onSuccess(t);
        }

        public final void onSubscribe(C1690c cVar) {
            if (C1718b.setOnce(this, cVar)) {
                this.f6701a.onSubscribe(this);
            }
        }

        public final void onError(Throwable th) {
            try {
                ((C1685ai) C1745b.m6050a(this.f6702b.apply(th), "The nextFunction returned a null SingleSource.")).mo6159b(new C1773r(this, this.f6701a));
            } catch (Throwable th2) {
                C1700b.m6017b(th2);
                this.f6701a.onError(new C1695a(th, th2));
            }
        }

        C2056a(C1683ag<? super T> agVar, C1711f<? super Throwable, ? extends C1685ai<? extends T>> fVar) {
            this.f6701a = agVar;
            this.f6702b = fVar;
        }
    }

    /* renamed from: a */
    public final void mo6154a(C1683ag<? super T> agVar) {
        this.f6699a.mo6159b(new C2056a(agVar, this.f6700b));
    }

    public C2055n(C1685ai<? extends T> aiVar, C1711f<? super Throwable, ? extends C1685ai<? extends T>> fVar) {
        this.f6699a = aiVar;
        this.f6700b = fVar;
    }
}
