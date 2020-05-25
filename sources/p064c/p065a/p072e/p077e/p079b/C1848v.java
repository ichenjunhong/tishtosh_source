package p064c.p065a.p072e.p077e.p079b;

import org.p2692b.C53695c;
import p064c.p065a.C2149h;
import p064c.p065a.C2177l;
import p064c.p065a.p070c.C1695a;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p085h.C2115d;

/* renamed from: c.a.e.e.b.v */
public final class C1848v<T> extends C1785a<T, T> {

    /* renamed from: c */
    final C1711f<? super Throwable, ? extends T> f6105c;

    /* renamed from: c.a.e.e.b.v$a */
    static final class C1849a<T> extends C2115d<T, T> {
        private static final long serialVersionUID = -3740826063558713822L;

        /* renamed from: a */
        final C1711f<? super Throwable, ? extends T> f6106a;

        public final void onComplete() {
            this.f6861b.onComplete();
        }

        public final void onNext(T t) {
            this.f6864e++;
            this.f6861b.onNext(t);
        }

        public final void onError(Throwable th) {
            try {
                mo6407a(C1745b.m6050a(this.f6106a.apply(th), "The valueSupplier returned a null value"));
            } catch (Throwable th2) {
                C1700b.m6017b(th2);
                this.f6861b.onError(new C1695a(th, th2));
            }
        }

        C1849a(C53695c<? super T> cVar, C1711f<? super Throwable, ? extends T> fVar) {
            super(cVar);
            this.f6106a = fVar;
        }
    }

    /* renamed from: b */
    public final void mo6264b(C53695c<? super T> cVar) {
        this.f5924a.mo6449a((C2177l<? super T>) new C1849a<Object>(cVar, this.f6105c));
    }

    public C1848v(C2149h<T> hVar, C1711f<? super Throwable, ? extends T> fVar) {
        super(hVar);
        this.f6105c = fVar;
    }
}
