package p064c.p065a.p072e.p077e.p079b;

import org.p2692b.C53695c;
import org.p2692b.C53696d;
import p064c.p065a.C2149h;
import p064c.p065a.C2177l;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1706a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1714i;
import p064c.p065a.p072e.p086i.C2119c;
import p064c.p065a.p072e.p086i.C2122f;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.b.e */
public final class C1814e<T> extends C1785a<T, T> {

    /* renamed from: c */
    private final C1710e<? super C53696d> f5996c;

    /* renamed from: d */
    private final C1714i f5997d;

    /* renamed from: e */
    private final C1706a f5998e;

    /* renamed from: c.a.e.e.b.e$a */
    static final class C1815a<T> implements C2177l<T>, C53696d {

        /* renamed from: a */
        final C53695c<? super T> f5999a;

        /* renamed from: b */
        final C1710e<? super C53696d> f6000b;

        /* renamed from: c */
        final C1714i f6001c;

        /* renamed from: d */
        final C1706a f6002d;

        /* renamed from: e */
        C53696d f6003e;

        public final void onComplete() {
            if (this.f6003e != C2122f.CANCELLED) {
                this.f5999a.onComplete();
            }
        }

        public final void cancel() {
            C53696d dVar = this.f6003e;
            if (dVar != C2122f.CANCELLED) {
                this.f6003e = C2122f.CANCELLED;
                try {
                    this.f6002d.mo6199a();
                } catch (Throwable th) {
                    C1700b.m6017b(th);
                    C2150a.m6492a(th);
                }
                dVar.cancel();
            }
        }

        public final void onNext(T t) {
            this.f5999a.onNext(t);
        }

        public final void request(long j) {
            this.f6003e.request(j);
        }

        public final void onError(Throwable th) {
            if (this.f6003e != C2122f.CANCELLED) {
                this.f5999a.onError(th);
            } else {
                C2150a.m6492a(th);
            }
        }

        public final void onSubscribe(C53696d dVar) {
            try {
                this.f6000b.accept(dVar);
                if (C2122f.validate(this.f6003e, dVar)) {
                    this.f6003e = dVar;
                    this.f5999a.onSubscribe(this);
                }
            } catch (Throwable th) {
                C1700b.m6017b(th);
                dVar.cancel();
                this.f6003e = C2122f.CANCELLED;
                C2119c.error(th, this.f5999a);
            }
        }

        C1815a(C53695c<? super T> cVar, C1710e<? super C53696d> eVar, C1714i iVar, C1706a aVar) {
            this.f5999a = cVar;
            this.f6000b = eVar;
            this.f6002d = aVar;
            this.f6001c = iVar;
        }
    }

    /* renamed from: b */
    public final void mo6264b(C53695c<? super T> cVar) {
        this.f5924a.mo6449a((C2177l<? super T>) new C1815a<Object>(cVar, this.f5996c, this.f5997d, this.f5998e));
    }

    public C1814e(C2149h<T> hVar, C1710e<? super C53696d> eVar, C1714i iVar, C1706a aVar) {
        super(hVar);
        this.f5996c = eVar;
        this.f5997d = iVar;
        this.f5998e = aVar;
    }
}
