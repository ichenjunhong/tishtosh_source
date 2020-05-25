package p064c.p065a.p072e.p077e.p081d;

import p064c.p065a.C1674ab;
import p064c.p065a.p071d.C1706a;
import p064c.p065a.p071d.C1710e;

/* renamed from: c.a.e.e.d.af */
public final class C1908af {

    /* renamed from: c.a.e.e.d.af$a */
    public static final class C1909a<T> implements C1706a {

        /* renamed from: a */
        final C1674ab<T> f6234a;

        /* renamed from: a */
        public final void mo6199a() throws Exception {
            this.f6234a.onComplete();
        }

        public C1909a(C1674ab<T> abVar) {
            this.f6234a = abVar;
        }
    }

    /* renamed from: c.a.e.e.d.af$b */
    public static final class C1910b<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final C1674ab<T> f6235a;

        public C1910b(C1674ab<T> abVar) {
            this.f6235a = abVar;
        }

        public final /* synthetic */ void accept(Object obj) throws Exception {
            this.f6235a.onError((Throwable) obj);
        }
    }

    /* renamed from: c.a.e.e.d.af$c */
    public static final class C1911c<T> implements C1710e<T> {

        /* renamed from: a */
        final C1674ab<T> f6236a;

        public C1911c(C1674ab<T> abVar) {
            this.f6236a = abVar;
        }

        public final void accept(T t) throws Exception {
            this.f6236a.onNext(t);
        }
    }
}
