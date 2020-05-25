package com.bytedance.jedi.arch.internal;

import com.bytedance.jedi.arch.C11933t;
import java.util.LinkedList;
import java.util.List;
import p064c.p065a.C1675ac;
import p064c.p065a.C2201v;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p094l.C2178a;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;

/* renamed from: com.bytedance.jedi.arch.internal.c */
public final class C11881c<S> implements C11933t<S> {

    /* renamed from: a */
    final C2178a<S> f31479a;

    /* renamed from: b */
    final C11884a<S> f31480b;

    /* renamed from: c */
    private final C1689b f31481c = new C1689b();

    /* renamed from: d */
    private final C2178a<C52860x> f31482d;

    /* renamed from: e */
    private final C2201v<S> f31483e;

    /* renamed from: com.bytedance.jedi.arch.internal.c$a */
    static final class C11884a<S> {

        /* renamed from: a */
        private final LinkedList<C52671b<S, C52860x>> f31485a = new LinkedList<>();

        /* renamed from: b */
        private LinkedList<C52671b<S, S>> f31486b = new LinkedList<>();

        /* renamed from: a */
        public final synchronized C52671b<S, C52860x> mo22618a() {
            if (this.f31485a.isEmpty()) {
                return null;
            }
            return (C52671b) this.f31485a.removeFirst();
        }

        /* renamed from: b */
        public final synchronized List<C52671b<S, S>> mo22620b() {
            if (this.f31486b.isEmpty()) {
                return null;
            }
            LinkedList<C52671b<S, S>> linkedList = this.f31486b;
            this.f31486b = new LinkedList<>();
            return linkedList;
        }

        /* renamed from: a */
        public final synchronized void mo22619a(C52671b<? super S, C52860x> bVar) {
            C52711k.m112240b(bVar, "block");
            this.f31485a.add(bVar);
        }

        /* renamed from: b */
        public final synchronized void mo22621b(C52671b<? super S, ? extends S> bVar) {
            C52711k.m112240b(bVar, "block");
            this.f31486b.add(bVar);
        }
    }

    /* renamed from: b */
    public final C2201v<S> mo22615b() {
        return this.f31483e;
    }

    /* renamed from: a */
    public final S mo22613a() {
        S m = this.f31479a.mo6469m();
        if (m == null) {
            C52711k.m112234a();
        }
        return m;
    }

    /* renamed from: a */
    public final void mo22614a(C52671b<? super S, C52860x> bVar) {
        C52711k.m112240b(bVar, "block");
        this.f31480b.mo22619a(bVar);
        this.f31482d.onNext(C52860x.f131107a);
    }

    /* renamed from: b */
    public final void mo22616b(C52671b<? super S, ? extends S> bVar) {
        C52711k.m112240b(bVar, "stateReducer");
        this.f31480b.mo22621b(bVar);
        this.f31482d.onNext(C52860x.f131107a);
    }

    /* renamed from: c */
    public final void mo22617c(C52671b<? super S, ? extends S> bVar) {
        C52711k.m112240b(bVar, "stateReducer");
        this.f31479a.onNext(bVar.invoke(mo22613a()));
    }

    public C11881c(S s, C1675ac acVar) {
        C52711k.m112240b(s, "initialState");
        C52711k.m112240b(acVar, "scheduler");
        C2178a<S> a = C2178a.m6524a(s);
        C52711k.m112236a((Object) a, "BehaviorSubject.createDefault(initialState)");
        this.f31479a = a;
        C2178a<C52860x> l = C2178a.m6527l();
        C52711k.m112236a((Object) l, "BehaviorSubject.create<Unit>()");
        this.f31482d = l;
        this.f31480b = new C11884a<>();
        C2201v<S> e = this.f31479a.mo6542e();
        C52711k.m112236a((Object) e, "subject.hide()");
        this.f31483e = e;
        C1690c a2 = this.f31482d.mo6514a(acVar).mo6505a((C1710e<? super T>) new C1710e<C52860x>(this) {

            /* renamed from: a */
            final /* synthetic */ C11881c f31484a;

            {
                this.f31484a = r1;
            }

            public final /* synthetic */ void accept(Object obj) {
                C52860x xVar = (C52860x) obj;
                C11881c cVar = this.f31484a;
                while (true) {
                    C52671b a = cVar.f31480b.mo22618a();
                    List b = cVar.f31480b.mo22620b();
                    if (b != null) {
                        Iterable<C52671b> iterable = b;
                        Object a2 = cVar.mo22613a();
                        for (C52671b invoke : iterable) {
                            a2 = invoke.invoke(a2);
                        }
                        cVar.f31479a.onNext(a2);
                    }
                    if (a != null) {
                        a.invoke(cVar.mo22613a());
                    } else {
                        return;
                    }
                }
            }
        }, (C1710e<? super Throwable>) new C11885d<Object>(new C52671b<Throwable, C52860x>(this) {
            public final String getName() {
                return "handleError";
            }

            public final C52761d getOwner() {
                return C52728w.m112245a(C11881c.class);
            }

            public final String getSignature() {
                return "handleError(Ljava/lang/Throwable;)V";
            }

            public final /* synthetic */ Object invoke(Object obj) {
                Throwable th;
                Throwable th2 = (Throwable) obj;
                C52711k.m112240b(th2, "p1");
                while (true) {
                    if (th2 != null) {
                        th = th2.getCause();
                    } else {
                        th = null;
                    }
                    if (th == null) {
                        break;
                    }
                    th2 = th2.getCause();
                }
                if (th2 == null) {
                    return C52860x.f131107a;
                }
                throw th2;
            }
        }));
        C52711k.m112236a((Object) a2, "flushQueueSubject.observ…ueues() }, ::handleError)");
        this.f31481c.mo6181a(a2);
    }
}
