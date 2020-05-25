package com.bytedance.jedi.arch;

import android.arch.lifecycle.C0184k;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.internal.C11894g;
import com.bytedance.jedi.arch.internal.C11896i.C11897a;
import com.bytedance.jedi.arch.internal.C11896i.C11898b;
import com.bytedance.jedi.arch.internal.C11896i.C11899c;
import com.bytedance.jedi.arch.internal.C11896i.C11900d;
import com.bytedance.jedi.arch.internal.C11896i.C11901e;
import p064c.p065a.C1675ac;
import p064c.p065a.C2201v;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2648k.C52771j;

/* renamed from: com.bytedance.jedi.arch.l */
public class C11912l<S extends C11932s, PROP extends C11932s> {

    /* renamed from: a */
    C1689b f31573a;

    /* renamed from: b */
    public JediViewModel<S> f31574b;

    /* renamed from: c */
    public C52771j<S, ? extends PROP> f31575c;

    /* renamed from: d */
    public C52682m<? super S, ? super PROP, ? extends S> f31576d;

    /* renamed from: com.bytedance.jedi.arch.l$a */
    static final class C11913a extends C52712l implements C52671b<Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C52682m f31577a;

        /* renamed from: b */
        final /* synthetic */ C11931r f31578b;

        C11913a(C52682m mVar, C11931r rVar) {
            this.f31577a = mVar;
            this.f31578b = rVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            C52711k.m112240b(th, "it");
            C11796d i = this.f31578b.mo22645i();
            if (i != null) {
                this.f31577a.invoke(i, th);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.jedi.arch.l$b */
    static final class C11914b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C52671b f31579a;

        /* renamed from: b */
        final /* synthetic */ C11931r f31580b;

        C11914b(C52671b bVar, C11931r rVar) {
            this.f31579a = bVar;
            this.f31580b = rVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C11796d i = this.f31580b.mo22645i();
            if (i != null) {
                this.f31579a.invoke(i);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.jedi.arch.l$c */
    static final class C11915c extends C52712l implements C52671b<T, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C52682m f31581a;

        /* renamed from: b */
        final /* synthetic */ C11931r f31582b;

        C11915c(C52682m mVar, C11931r rVar) {
            this.f31581a = mVar;
            this.f31582b = rVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C11796d i = this.f31582b.mo22645i();
            if (i != null) {
                this.f31581a.invoke(i, obj);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.jedi.arch.l$d */
    static final class C11916d extends C52712l implements C52671b<T, T> {

        /* renamed from: a */
        public static final C11916d f31583a = new C11916d();

        C11916d() {
            super(1);
        }

        public final T invoke(T t) {
            return t;
        }
    }

    /* renamed from: com.bytedance.jedi.arch.l$e */
    static final class C11917e extends C52712l implements C52671b<PROP, PROP> {

        /* renamed from: a */
        final /* synthetic */ C52682m f31584a;

        C11917e(C52682m mVar) {
            this.f31584a = mVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C11932s sVar = (C11932s) obj;
            C52711k.m112240b(sVar, "$receiver");
            return (C11932s) this.f31584a.invoke(sVar, new C11911k());
        }
    }

    /* renamed from: com.bytedance.jedi.arch.l$f */
    static final class C11918f<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        final /* synthetic */ C52671b f31585a;

        C11918f(C52671b bVar) {
            this.f31585a = bVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            return new C11936w(this.f31585a.invoke(obj));
        }
    }

    /* renamed from: com.bytedance.jedi.arch.l$g */
    static final class C11919g<T, R> implements C1711f<Throwable, C11787a<? extends V>> {

        /* renamed from: a */
        public static final C11919g f31586a = new C11919g();

        C11919g() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            C52711k.m112240b(th, "it");
            return new C11795c(th);
        }
    }

    /* renamed from: com.bytedance.jedi.arch.l$h */
    static final class C11920h<T> implements C1710e<C11787a<? extends V>> {

        /* renamed from: a */
        final /* synthetic */ C11912l f31587a;

        /* renamed from: b */
        final /* synthetic */ boolean f31588b;

        /* renamed from: c */
        final /* synthetic */ Thread f31589c;

        /* renamed from: d */
        final /* synthetic */ C52682m f31590d;

        C11920h(C11912l lVar, boolean z, Thread thread, C52682m mVar) {
            this.f31587a = lVar;
            this.f31588b = z;
            this.f31589c = thread;
            this.f31590d = mVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            final C11787a aVar = (C11787a) obj;
            if (!this.f31588b || this.f31589c != Thread.currentThread()) {
                this.f31587a.mo22636b(new C52671b<PROP, PROP>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C11920h f31591a;

                    {
                        this.f31591a = r1;
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        C11932s sVar = (C11932s) obj;
                        C52711k.m112240b(sVar, "$receiver");
                        C52682m mVar = this.f31591a.f31590d;
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

    /* renamed from: com.bytedance.jedi.arch.l$i */
    static final class C11922i extends C52712l implements C52671b<A, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C11931r f31593a;

        /* renamed from: b */
        final /* synthetic */ C11912l f31594b;

        /* renamed from: c */
        final /* synthetic */ C11797e f31595c;

        /* renamed from: d */
        final /* synthetic */ C52771j f31596d;

        /* renamed from: e */
        final /* synthetic */ boolean f31597e;

        /* renamed from: f */
        final /* synthetic */ boolean f31598f;

        /* renamed from: g */
        final /* synthetic */ C52682m f31599g;

        C11922i(C11931r rVar, C11912l lVar, C11797e eVar, C52771j jVar, boolean z, boolean z2, C52682m mVar) {
            this.f31593a = rVar;
            this.f31594b = lVar;
            this.f31595c = eVar;
            this.f31596d = jVar;
            this.f31597e = z;
            this.f31598f = z2;
            this.f31599g = mVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C11796d i = this.f31593a.mo22645i();
            if (i != null) {
                this.f31599g.invoke(i, obj);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.jedi.arch.l$j */
    static final class C11923j extends C52712l implements C52671b<S, S> {

        /* renamed from: a */
        final /* synthetic */ C11912l f31600a;

        /* renamed from: b */
        final /* synthetic */ C52671b f31601b;

        C11923j(C11912l lVar, C52671b bVar) {
            this.f31600a = lVar;
            this.f31601b = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C11932s sVar = (C11932s) obj;
            C52711k.m112240b(sVar, "$receiver");
            C52682m<? super S, ? super PROP, ? extends S> mVar = this.f31600a.f31576d;
            if (mVar == null) {
                C52711k.m112237a("mainStateReducer");
            }
            return (C11932s) mVar.invoke(sVar, this.f31601b.invoke(this.f31600a.mo22632a().invoke(sVar)));
        }
    }

    /* renamed from: com.bytedance.jedi.arch.l$k */
    static final class C11924k extends C52712l implements C52671b<S, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C11912l f31602a;

        /* renamed from: b */
        final /* synthetic */ C52682m f31603b;

        C11924k(C11912l lVar, C52682m mVar) {
            this.f31602a = lVar;
            this.f31603b = mVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C11932s sVar = (C11932s) obj;
            C52711k.m112240b(sVar, "it");
            this.f31603b.invoke(sVar, this.f31602a.mo22632a().invoke(sVar));
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.jedi.arch.l$l */
    static final class C11925l extends C52712l implements C52671b<S, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C11912l f31604a;

        /* renamed from: b */
        final /* synthetic */ C52671b f31605b;

        C11925l(C11912l lVar, C52671b bVar) {
            this.f31604a = lVar;
            this.f31605b = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C11932s sVar = (C11932s) obj;
            C52711k.m112240b(sVar, "it");
            this.f31605b.invoke(this.f31604a.mo22632a().invoke(sVar));
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public final C52771j<S, PROP> mo22632a() {
        C52771j<S, ? extends PROP> jVar = this.f31575c;
        if (jVar == null) {
            C52711k.m112237a("substate");
        }
        return jVar;
    }

    /* renamed from: a */
    public final void mo22633a(C52671b<? super PROP, C52860x> bVar) {
        C52711k.m112240b(bVar, "block");
        JediViewModel<S> jediViewModel = this.f31574b;
        if (jediViewModel == null) {
            C52711k.m112237a("viewModel");
        }
        jediViewModel.mo22534e(new C11925l(this, bVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo22636b(C52671b<? super PROP, ? extends PROP> bVar) {
        C52711k.m112240b(bVar, "reducer");
        JediViewModel<S> jediViewModel = this.f31574b;
        if (jediViewModel == null) {
            C52711k.m112237a("viewModel");
        }
        jediViewModel.mo22535f(new C11923j(this, bVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo22634a(C52682m<? super S, ? super PROP, C52860x> mVar) {
        C52711k.m112240b(mVar, "block");
        JediViewModel<S> jediViewModel = this.f31574b;
        if (jediViewModel == null) {
            C52711k.m112237a("viewModel");
        }
        jediViewModel.mo22534e(new C11924k(this, mVar));
    }

    /* renamed from: a */
    public final <T> C1690c mo22629a(C2201v<T> vVar, C52682m<? super PROP, ? super C11787a<? extends T>, ? extends PROP> mVar) {
        boolean z;
        Thread thread;
        C52711k.m112240b(vVar, "$this$execute");
        C52711k.m112240b(mVar, "stateReducer");
        C52671b bVar = C11916d.f31583a;
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
        mo22636b(new C11917e(mVar));
        C1690c f = vVar.mo6541d((C1711f<? super T, ? extends R>) new C11918f<Object,Object>(bVar)).mo6547f((C1711f<? super Throwable, ? extends T>) C11919g.f31586a).mo6545f((C1710e<? super T>) new C11920h<Object>(this, z, thread, mVar));
        C52711k.m112236a((Object) f, "map<Async<V>> { Success(…syncData) }\n            }");
        C52711k.m112240b(f, "$this$disposeOnClear");
        C1689b bVar2 = this.f31573a;
        if (bVar2 == null) {
            C52711k.m112237a("disposables");
        }
        bVar2.mo6181a(f);
        return f;
    }

    /* renamed from: a */
    public final void mo22635a(C52771j<S, ? extends PROP> jVar, C52682m<? super S, ? super PROP, ? extends S> mVar) {
        C52711k.m112240b(jVar, "subState");
        C52711k.m112240b(mVar, "mainStateReducer");
        this.f31575c = jVar;
        this.f31576d = mVar;
    }

    /* renamed from: a */
    public final <RECEIVER extends C11796d, A> C1690c mo22630a(C11797e<? extends RECEIVER> eVar, C52771j<PROP, ? extends A> jVar, boolean z, boolean z2, C52682m<? super RECEIVER, ? super A, C52860x> mVar) {
        C52771j<PROP, ? extends A> jVar2 = jVar;
        C52711k.m112240b(eVar, "$this$selectSubscribe");
        C52711k.m112240b(jVar2, "prop1");
        C52711k.m112240b(mVar, "subscriber");
        C11931r d = eVar.mo22554d();
        JediViewModel<S> jediViewModel = this.f31574b;
        if (jediViewModel == null) {
            C52711k.m112237a("viewModel");
        }
        C0184k h = eVar.mo22553c().mo22626h();
        C52771j<S, ? extends PROP> jVar3 = this.f31575c;
        if (jVar3 == null) {
            C52711k.m112237a("substate");
        }
        boolean z3 = z;
        boolean z4 = z2;
        C11922i iVar = new C11922i(d, this, eVar, jVar, z3, z4, mVar);
        C52671b bVar = iVar;
        C52711k.m112240b(jediViewModel, "$this$middlewareSelectSubscribeInternal");
        C52711k.m112240b(jVar2, "prop1");
        C52711k.m112240b(jVar3, "subprop");
        C52711k.m112240b(bVar, "subscriber");
        C2201v c = jediViewModel.ca_().mo6541d((C1711f<? super T, ? extends R>) new C11899c<Object,Object>(jVar3)).mo6533c();
        C52711k.m112236a((Object) c, "map { subprop(it) }.distinctUntilChanged()");
        C2201v c2 = c.mo6541d((C1711f<? super T, ? extends R>) new C11900d<Object,Object>(jVar2)).mo6533c();
        C52711k.m112236a((Object) c2, "upstream");
        C11901e eVar2 = new C11901e(jediViewModel, h, z3, z4, bVar);
        return jediViewModel.mo22522a(c2, h, z, z2, (C1675ac) C11894g.m24247a(), (C52671b<? super T, C52860x>) eVar2);
    }

    /* renamed from: a */
    public final <RECEIVER extends C11796d, T> C1690c mo22631a(C11797e<? extends RECEIVER> eVar, C52771j<PROP, ? extends C11787a<? extends T>> jVar, boolean z, boolean z2, C52682m<? super RECEIVER, ? super Throwable, C52860x> mVar, C52671b<? super RECEIVER, C52860x> bVar, C52682m<? super RECEIVER, ? super T, C52860x> mVar2) {
        C52771j<PROP, ? extends C11787a<? extends T>> jVar2 = jVar;
        C11797e<? extends RECEIVER> eVar2 = eVar;
        C52711k.m112240b(eVar, "$this$asyncSubscribe");
        C52711k.m112240b(jVar2, "prop");
        C11931r d = eVar.mo22554d();
        JediViewModel<S> jediViewModel = this.f31574b;
        if (jediViewModel == null) {
            C52711k.m112237a("viewModel");
        }
        C0184k h = eVar.mo22553c().mo22626h();
        C52771j<S, ? extends PROP> jVar3 = this.f31575c;
        if (jVar3 == null) {
            C52711k.m112237a("substate");
        }
        C52671b aVar = new C11913a(mVar, d);
        C52670a bVar2 = new C11914b(bVar, d);
        C52671b cVar = new C11915c(mVar2, d);
        C52711k.m112240b(jediViewModel, "$this$middlewareAsyncSubscribeInternal");
        C52711k.m112240b(jVar2, "prop1");
        C52711k.m112240b(jVar3, "subprop");
        C2201v c = jediViewModel.ca_().mo6541d((C1711f<? super T, ? extends R>) new C11899c<Object,Object>(jVar3)).mo6533c();
        C52711k.m112236a((Object) c, "map { subprop(it) }.distinctUntilChanged()");
        C2201v c2 = c.mo6541d((C1711f<? super T, ? extends R>) new C11897a<Object,Object>(jVar2)).mo6533c();
        C52711k.m112236a((Object) c2, "upstream");
        C0184k kVar = h;
        boolean z3 = z;
        boolean z4 = z2;
        C11898b bVar3 = new C11898b(jediViewModel, kVar, z3, z4, cVar, aVar, bVar2);
        return jediViewModel.mo22522a(c2, kVar, z3, z4, (C1675ac) C11894g.m24247a(), (C52671b<? super T, C52860x>) bVar3);
    }
}
