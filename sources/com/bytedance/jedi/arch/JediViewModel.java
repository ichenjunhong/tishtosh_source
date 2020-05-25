package com.bytedance.jedi.arch;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0209x;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.internal.C11895h;
import com.bytedance.jedi.arch.internal.C11896i;
import com.bytedance.jedi.arch.internal.LifecycleAwareObserver;
import p064c.p065a.C1674ab;
import p064c.p065a.C1675ac;
import p064c.p065a.C1680ad;
import p064c.p065a.C2201v;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2648k.C52771j;

public abstract class JediViewModel<S extends C11932s> extends C0209x {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f31277a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(JediViewModel.class), "storeOwner", "getStoreOwner()Lcom/bytedance/jedi/arch/internal/StoreOwner;"))};

    /* renamed from: b */
    S f31278b;

    /* renamed from: c */
    public final C11927n f31279c = new C11928o();

    /* renamed from: d */
    private final C52668f f31280d = C52732g.m112285a(new C11786g(this));

    /* renamed from: e */
    private final C1689b f31281e = new C1689b();

    /* renamed from: com.bytedance.jedi.arch.JediViewModel$a */
    static final class C11779a extends C52712l implements C52671b<T, T> {

        /* renamed from: a */
        public static final C11779a f31282a = new C11779a();

        C11779a() {
            super(1);
        }

        public final T invoke(T t) {
            return t;
        }
    }

    /* renamed from: com.bytedance.jedi.arch.JediViewModel$b */
    static final class C11780b extends C52712l implements C52671b<T, T> {

        /* renamed from: a */
        public static final C11780b f31283a = new C11780b();

        C11780b() {
            super(1);
        }

        public final T invoke(T t) {
            return t;
        }
    }

    /* renamed from: com.bytedance.jedi.arch.JediViewModel$c */
    static final class C11781c extends C52712l implements C52671b<S, S> {

        /* renamed from: a */
        final /* synthetic */ C52682m f31284a;

        C11781c(C52682m mVar) {
            this.f31284a = mVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C11932s sVar = (C11932s) obj;
            C52711k.m112240b(sVar, "$receiver");
            return (C11932s) this.f31284a.invoke(sVar, new C11911k());
        }
    }

    /* renamed from: com.bytedance.jedi.arch.JediViewModel$d */
    static final class C11782d<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        final /* synthetic */ C52671b f31285a;

        C11782d(C52671b bVar) {
            this.f31285a = bVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            return new C11936w(this.f31285a.invoke(obj));
        }
    }

    /* renamed from: com.bytedance.jedi.arch.JediViewModel$e */
    static final class C11783e<T, R> implements C1711f<Throwable, C11787a<? extends V>> {

        /* renamed from: a */
        public static final C11783e f31286a = new C11783e();

        C11783e() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            C52711k.m112240b(th, "it");
            return new C11795c(th);
        }
    }

    /* renamed from: com.bytedance.jedi.arch.JediViewModel$f */
    static final class C11784f<T> implements C1710e<C11787a<? extends V>> {

        /* renamed from: a */
        final /* synthetic */ JediViewModel f31287a;

        /* renamed from: b */
        final /* synthetic */ boolean f31288b;

        /* renamed from: c */
        final /* synthetic */ Thread f31289c;

        /* renamed from: d */
        final /* synthetic */ C52682m f31290d;

        C11784f(JediViewModel jediViewModel, boolean z, Thread thread, C52682m mVar) {
            this.f31287a = jediViewModel;
            this.f31288b = z;
            this.f31289c = thread;
            this.f31290d = mVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            final C11787a aVar = (C11787a) obj;
            if (!this.f31288b || this.f31289c != Thread.currentThread()) {
                this.f31287a.mo22530c(new C52671b<S, S>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C11784f f31291a;

                    {
                        this.f31291a = r1;
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        C11932s sVar = (C11932s) obj;
                        C52711k.m112240b(sVar, "$receiver");
                        C52682m mVar = this.f31291a.f31290d;
                        C11787a aVar = aVar;
                        C52711k.m112236a((Object) aVar, "asyncData");
                        return (C11932s) mVar.invoke(sVar, aVar);
                    }
                });
                return;
            }
            throw new IllegalStateException("you need schedule upstream to another thread, you can call subscribeOn(IO)".toString());
        }
    }

    /* renamed from: com.bytedance.jedi.arch.JediViewModel$g */
    static final class C11786g extends C52712l implements C52670a<C11895h<S>> {

        /* renamed from: a */
        final /* synthetic */ JediViewModel f31293a;

        C11786g(JediViewModel jediViewModel) {
            this.f31293a = jediViewModel;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            JediViewModel jediViewModel = this.f31293a;
            S s = jediViewModel.f31278b;
            if (s != null) {
                C52682m<? super JediViewModel<C11932s>, ? super C11932s, ? extends C11933t<C11932s>> mVar = C11867g.f31451a;
                if (jediViewModel != null) {
                    Object invoke = mVar.invoke(jediViewModel, s);
                    if (invoke != null) {
                        return new C11895h((C11933t) invoke);
                    }
                    throw new C52857u("null cannot be cast to non-null type com.bytedance.jedi.arch.Store<S>");
                }
                throw new C52857u("null cannot be cast to non-null type com.bytedance.jedi.arch.JediViewModel<com.bytedance.jedi.arch.State>");
            }
            StringBuilder sb = new StringBuilder("Cannot visit store before ViewModel(");
            sb.append(jediViewModel.getClass());
            sb.append(") is initialized");
            throw new IllegalArgumentException(sb.toString().toString());
        }
    }

    /* access modifiers changed from: 0000 */
    public final C11895h<S> bZ_() {
        return (C11895h) this.f31280d.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract S mo22529c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo22532d() {
    }

    /* renamed from: a */
    public final void mo22526a(C52671b<? super S, ? extends S> bVar) {
        C52711k.m112240b(bVar, "argsAcceptor");
        if (this.f31278b == null) {
            this.f31278b = (C11932s) bVar.invoke(mo22529c());
            mo22532d();
        }
    }

    /* renamed from: a */
    public final <PROP, MW extends C11912l<S, PROP>> void mo22525a(MW mw) {
        C52711k.m112240b(mw, "middleware");
        C1689b bVar = this.f31281e;
        C52711k.m112240b(bVar, "disposables");
        C52711k.m112240b(this, "viewModel");
        mw.f31573a = bVar;
        mw.f31574b = this;
    }

    public void onCleared() {
        this.f31281e.mo6180a();
    }

    public final C2201v<S> ca_() {
        return bZ_().mo22615b();
    }

    /* renamed from: b */
    public final void mo22527b(C52671b<? super S, C52860x> bVar) {
        C52711k.m112240b(bVar, "block");
        mo22534e(bVar);
    }

    /* renamed from: c */
    public final void mo22530c(C52671b<? super S, ? extends S> bVar) {
        C52711k.m112240b(bVar, "reducer");
        mo22535f(bVar);
    }

    /* renamed from: e */
    public final void mo22534e(C52671b<? super S, C52860x> bVar) {
        C52711k.m112240b(bVar, "block");
        bZ_().mo22614a(bVar);
    }

    /* renamed from: f */
    public final void mo22535f(C52671b<? super S, ? extends S> bVar) {
        C52711k.m112240b(bVar, "reducer");
        bZ_().mo22616b(bVar);
    }

    /* renamed from: d */
    public final void mo22533d(C52671b<? super S, ? extends S> bVar) {
        C52711k.m112240b(bVar, "reducer");
        C52711k.m112240b(bVar, "reducer");
        bZ_().mo22617c(bVar);
    }

    /* renamed from: a */
    public final C1690c mo22521a(C1690c cVar) {
        C52711k.m112240b(cVar, "$this$disposeOnClear");
        this.f31281e.mo6181a(cVar);
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final <T> C1690c mo22520a(C1680ad<T> adVar, C52682m<? super S, ? super C11787a<? extends T>, ? extends S> mVar) {
        C52711k.m112240b(adVar, "$this$execute");
        C52711k.m112240b(mVar, "stateReducer");
        C2201v c = adVar.mo6161c();
        C52711k.m112236a((Object) c, "toObservable()");
        return m24115a(c, (C52671b<? super T, ? extends V>) C11779a.f31282a, mVar);
    }

    /* renamed from: a */
    public final <T> C1690c mo22523a(C2201v<T> vVar, C52682m<? super S, ? super C11787a<? extends T>, ? extends S> mVar) {
        C52711k.m112240b(vVar, "$this$execute");
        C52711k.m112240b(mVar, "stateReducer");
        return m24115a(vVar, (C52671b<? super T, ? extends V>) C11780b.f31283a, mVar);
    }

    /* renamed from: a */
    private <T, V> C1690c m24115a(C2201v<T> vVar, C52671b<? super T, ? extends V> bVar, C52682m<? super S, ? super C11787a<? extends V>, ? extends S> mVar) {
        boolean z;
        Thread thread;
        C52711k.m112240b(vVar, "$this$execute");
        C52711k.m112240b(bVar, "mapper");
        C52711k.m112240b(mVar, "stateReducer");
        if (!C11867g.m24217a() || C11867g.m24218b()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            thread = Thread.currentThread();
        } else {
            thread = null;
        }
        mo22530c(new C11781c(mVar));
        C1690c f = vVar.mo6541d((C1711f<? super T, ? extends R>) new C11782d<Object,Object>(bVar)).mo6547f((C1711f<? super Throwable, ? extends T>) C11783e.f31286a).mo6545f((C1710e<? super T>) new C11784f<Object>(this, z, thread, mVar));
        C52711k.m112236a((Object) f, "map<Async<V>> { Success(…syncData) }\n            }");
        return mo22521a(f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final <A> C1690c mo22524a(C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52671b<? super A, C52860x> bVar) {
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(bVar, "subscriber");
        return C11896i.m24254a(this, null, jVar, uVar, bVar);
    }

    /* renamed from: a */
    public final <T> C1690c mo22522a(C2201v<T> vVar, C0184k kVar, boolean z, boolean z2, C1675ac acVar, C52671b<? super T, C52860x> bVar) {
        C52711k.m112240b(vVar, "source");
        C52711k.m112240b(bVar, "subscriber");
        if (kVar == null) {
            if (acVar != null) {
                vVar = vVar.mo6514a(acVar);
            }
            C1690c f = vVar.mo6545f((C1710e<? super T>) new C11874i<Object>(bVar));
            C52711k.m112236a((Object) f, "source\n                .…   .subscribe(subscriber)");
            return mo22521a(f);
        }
        if (acVar != null) {
            vVar = vVar.mo6514a(acVar);
        }
        C1674ab b = vVar.mo6526b(new LifecycleAwareObserver(kVar, !z, z2, bVar));
        C52711k.m112236a((Object) b, "source\n            .let …          )\n            )");
        return mo22521a((C1690c) b);
    }
}
