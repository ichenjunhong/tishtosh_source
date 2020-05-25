package p064c.p065a.p072e.p077e.p079b;

import org.p2692b.C53695c;
import p064c.p065a.C2149h;
import p064c.p065a.C2177l;
import p064c.p065a.p070c.C1695a;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1706a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p072e.p075c.C1747a;
import p064c.p065a.p072e.p085h.C2112a;
import p064c.p065a.p072e.p085h.C2113b;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.e.e.b.d */
public final class C1811d<T> extends C1785a<T, T> {

    /* renamed from: c */
    final C1710e<? super T> f5984c;

    /* renamed from: d */
    final C1710e<? super Throwable> f5985d;

    /* renamed from: e */
    final C1706a f5986e;

    /* renamed from: f */
    final C1706a f5987f;

    /* renamed from: c.a.e.e.b.d$a */
    static final class C1812a<T> extends C2112a<T, T> {

        /* renamed from: a */
        final C1710e<? super T> f5988a;

        /* renamed from: b */
        final C1710e<? super Throwable> f5989b;

        /* renamed from: c */
        final C1706a f5990c;

        /* renamed from: d */
        final C1706a f5991d;

        public final void onComplete() {
            if (!this.f6850h) {
                try {
                    this.f5990c.mo6199a();
                    this.f6850h = true;
                    this.f6847e.onComplete();
                    try {
                        this.f5991d.mo6199a();
                    } catch (Throwable th) {
                        C1700b.m6017b(th);
                        C2150a.m6492a(th);
                    }
                } catch (Throwable th2) {
                    mo6403a(th2);
                }
            }
        }

        public final T poll() throws Exception {
            try {
                T poll = this.f6849g.poll();
                if (poll != null) {
                    try {
                        this.f5988a.accept(poll);
                        this.f5991d.mo6199a();
                    } catch (Throwable th) {
                        throw new C1695a(th, th);
                    }
                } else if (this.f6851i == 1) {
                    this.f5990c.mo6199a();
                    this.f5991d.mo6199a();
                }
                return poll;
            } catch (Throwable th2) {
                throw new C1695a(th, th2);
            }
        }

        public final int requestFusion(int i) {
            return mo6402a(i);
        }

        /* renamed from: a */
        public final boolean mo6227a(T t) {
            if (this.f6850h) {
                return false;
            }
            try {
                this.f5988a.accept(t);
                return this.f6847e.mo6227a(t);
            } catch (Throwable th) {
                mo6403a(th);
                return false;
            }
        }

        public final void onNext(T t) {
            if (!this.f6850h) {
                if (this.f6851i != 0) {
                    this.f6847e.onNext(null);
                    return;
                }
                try {
                    this.f5988a.accept(t);
                    this.f6847e.onNext(t);
                } catch (Throwable th) {
                    mo6403a(th);
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.f6850h) {
                C2150a.m6492a(th);
                return;
            }
            boolean z = true;
            this.f6850h = true;
            try {
                this.f5989b.accept(th);
            } catch (Throwable th2) {
                C1700b.m6017b(th2);
                this.f6847e.onError(new C1695a(th, th2));
                z = false;
            }
            if (z) {
                this.f6847e.onError(th);
            }
            try {
                this.f5991d.mo6199a();
            } catch (Throwable th3) {
                C1700b.m6017b(th3);
                C2150a.m6492a(th3);
            }
        }

        C1812a(C1747a<? super T> aVar, C1710e<? super T> eVar, C1710e<? super Throwable> eVar2, C1706a aVar2, C1706a aVar3) {
            super(aVar);
            this.f5988a = eVar;
            this.f5989b = eVar2;
            this.f5990c = aVar2;
            this.f5991d = aVar3;
        }
    }

    /* renamed from: c.a.e.e.b.d$b */
    static final class C1813b<T> extends C2113b<T, T> {

        /* renamed from: a */
        final C1710e<? super T> f5992a;

        /* renamed from: b */
        final C1710e<? super Throwable> f5993b;

        /* renamed from: c */
        final C1706a f5994c;

        /* renamed from: d */
        final C1706a f5995d;

        public final void onComplete() {
            if (!this.f6855h) {
                try {
                    this.f5994c.mo6199a();
                    this.f6855h = true;
                    this.f6852e.onComplete();
                    try {
                        this.f5995d.mo6199a();
                    } catch (Throwable th) {
                        C1700b.m6017b(th);
                        C2150a.m6492a(th);
                    }
                } catch (Throwable th2) {
                    mo6405a(th2);
                }
            }
        }

        public final T poll() throws Exception {
            try {
                T poll = this.f6854g.poll();
                if (poll != null) {
                    try {
                        this.f5992a.accept(poll);
                        this.f5995d.mo6199a();
                    } catch (Throwable th) {
                        throw new C1695a(th, th);
                    }
                } else if (this.f6856i == 1) {
                    this.f5994c.mo6199a();
                    this.f5995d.mo6199a();
                }
                return poll;
            } catch (Throwable th2) {
                throw new C1695a(th, th2);
            }
        }

        public final int requestFusion(int i) {
            return mo6404a(i);
        }

        public final void onNext(T t) {
            if (!this.f6855h) {
                if (this.f6856i != 0) {
                    this.f6852e.onNext(null);
                    return;
                }
                try {
                    this.f5992a.accept(t);
                    this.f6852e.onNext(t);
                } catch (Throwable th) {
                    mo6405a(th);
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.f6855h) {
                C2150a.m6492a(th);
                return;
            }
            boolean z = true;
            this.f6855h = true;
            try {
                this.f5993b.accept(th);
            } catch (Throwable th2) {
                C1700b.m6017b(th2);
                this.f6852e.onError(new C1695a(th, th2));
                z = false;
            }
            if (z) {
                this.f6852e.onError(th);
            }
            try {
                this.f5995d.mo6199a();
            } catch (Throwable th3) {
                C1700b.m6017b(th3);
                C2150a.m6492a(th3);
            }
        }

        C1813b(C53695c<? super T> cVar, C1710e<? super T> eVar, C1710e<? super Throwable> eVar2, C1706a aVar, C1706a aVar2) {
            super(cVar);
            this.f5992a = eVar;
            this.f5993b = eVar2;
            this.f5994c = aVar;
            this.f5995d = aVar2;
        }
    }

    /* renamed from: b */
    public final void mo6264b(C53695c<? super T> cVar) {
        if (cVar instanceof C1747a) {
            C2149h hVar = this.f5924a;
            C1812a aVar = new C1812a((C1747a) cVar, this.f5984c, this.f5985d, this.f5986e, this.f5987f);
            hVar.mo6449a((C2177l<? super T>) aVar);
            return;
        }
        C2149h hVar2 = this.f5924a;
        C1813b bVar = new C1813b(cVar, this.f5984c, this.f5985d, this.f5986e, this.f5987f);
        hVar2.mo6449a((C2177l<? super T>) bVar);
    }

    public C1811d(C2149h<T> hVar, C1710e<? super T> eVar, C1710e<? super Throwable> eVar2, C1706a aVar, C1706a aVar2) {
        super(hVar);
        this.f5984c = eVar;
        this.f5985d = eVar2;
        this.f5986e = aVar;
        this.f5987f = aVar2;
    }
}
