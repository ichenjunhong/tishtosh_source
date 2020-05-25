package p064c.p065a.p072e.p077e.p082e;

import p064c.p065a.C1680ad;
import p064c.p065a.C1683ag;
import p064c.p065a.C1685ai;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p072e.p073a.C1719c;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.e.d */
public final class C2037d<T> extends C1680ad<T> {

    /* renamed from: a */
    final C1685ai<T> f6663a;

    /* renamed from: b */
    final C1710e<? super C1690c> f6664b;

    /* renamed from: c.a.e.e.e.d$a */
    static final class C2038a<T> implements C1683ag<T> {

        /* renamed from: a */
        final C1683ag<? super T> f6665a;

        /* renamed from: b */
        final C1710e<? super C1690c> f6666b;

        /* renamed from: c */
        boolean f6667c;

        public final void onError(Throwable th) {
            if (this.f6667c) {
                C2150a.m6492a(th);
            } else {
                this.f6665a.onError(th);
            }
        }

        public final void onSuccess(T t) {
            if (!this.f6667c) {
                this.f6665a.onSuccess(t);
            }
        }

        public final void onSubscribe(C1690c cVar) {
            try {
                this.f6666b.accept(cVar);
                this.f6665a.onSubscribe(cVar);
            } catch (Throwable th) {
                C1700b.m6017b(th);
                this.f6667c = true;
                cVar.dispose();
                C1719c.error(th, this.f6665a);
            }
        }

        C2038a(C1683ag<? super T> agVar, C1710e<? super C1690c> eVar) {
            this.f6665a = agVar;
            this.f6666b = eVar;
        }
    }

    /* renamed from: a */
    public final void mo6154a(C1683ag<? super T> agVar) {
        this.f6663a.mo6159b(new C2038a(agVar, this.f6664b));
    }

    public C2037d(C1685ai<T> aiVar, C1710e<? super C1690c> eVar) {
        this.f6663a = aiVar;
        this.f6664b = eVar;
    }
}
