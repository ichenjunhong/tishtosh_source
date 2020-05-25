package com.bytedance.jedi.arch;

import android.arch.lifecycle.C0184k;
import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.arch.internal.C11896i;
import com.bytedance.jedi.arch.internal.C11896i.C11904h;
import com.bytedance.jedi.arch.internal.C11896i.C11905i;
import com.bytedance.jedi.arch.internal.C11896i.C11906j;
import com.bytedance.jedi.arch.internal.C11896i.C11907k;
import com.bytedance.jedi.arch.internal.C11896i.C11908l;
import com.bytedance.jedi.arch.internal.C11896i.C11909m;
import p064c.p065a.C1675ac;
import p064c.p065a.C2201v;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1711f;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2648k.C52771j;

/* renamed from: com.bytedance.jedi.arch.e */
public interface C11797e<RECEIVER extends C11796d> {

    /* renamed from: com.bytedance.jedi.arch.e$a */
    public static final class C11798a {

        /* renamed from: com.bytedance.jedi.arch.e$a$a */
        static final class C11799a extends C52712l implements C52671b<C11787a<? extends T>, C52860x> {

            /* renamed from: a */
            final /* synthetic */ C11931r f31302a;

            /* renamed from: b */
            final /* synthetic */ C11797e f31303b;

            /* renamed from: c */
            final /* synthetic */ JediViewModel f31304c;

            /* renamed from: d */
            final /* synthetic */ C52771j f31305d;

            /* renamed from: e */
            final /* synthetic */ C11934u f31306e;

            /* renamed from: f */
            final /* synthetic */ C52671b f31307f;

            /* renamed from: g */
            final /* synthetic */ C52682m f31308g;

            /* renamed from: h */
            final /* synthetic */ C52682m f31309h;

            C11799a(C11931r rVar, C11797e eVar, JediViewModel jediViewModel, C52771j jVar, C11934u uVar, C52671b bVar, C52682m mVar, C52682m mVar2) {
                this.f31302a = rVar;
                this.f31303b = eVar;
                this.f31304c = jediViewModel;
                this.f31305d = jVar;
                this.f31306e = uVar;
                this.f31307f = bVar;
                this.f31308g = mVar;
                this.f31309h = mVar2;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                C11787a aVar = (C11787a) obj;
                C52711k.m112240b(aVar, "async");
                if (aVar instanceof C11911k) {
                    C52671b bVar = this.f31307f;
                    if (bVar != null) {
                        C11796d i = this.f31302a.mo22645i();
                        if (i != null) {
                            bVar.invoke(i);
                        }
                    }
                } else if (aVar instanceof C11795c) {
                    C52682m mVar = this.f31308g;
                    if (mVar != null) {
                        C11796d i2 = this.f31302a.mo22645i();
                        if (i2 != null) {
                            mVar.invoke(i2, ((C11795c) aVar).f31301a);
                        }
                    }
                } else if (aVar instanceof C11936w) {
                    C52682m mVar2 = this.f31309h;
                    if (mVar2 != null) {
                        C11796d i3 = this.f31302a.mo22645i();
                        if (i3 != null) {
                            mVar2.invoke(i3, ((C11936w) aVar).mo22538a());
                        }
                    }
                }
                return C52860x.f131107a;
            }
        }

        /* renamed from: com.bytedance.jedi.arch.e$a$b */
        static final class C11800b extends C52712l implements C52671b<A, C52860x> {

            /* renamed from: a */
            final /* synthetic */ C11931r f31310a;

            /* renamed from: b */
            final /* synthetic */ C11797e f31311b;

            /* renamed from: c */
            final /* synthetic */ JediViewModel f31312c;

            /* renamed from: d */
            final /* synthetic */ C52771j f31313d;

            /* renamed from: e */
            final /* synthetic */ C11934u f31314e;

            /* renamed from: f */
            final /* synthetic */ C52682m f31315f;

            C11800b(C11931r rVar, C11797e eVar, JediViewModel jediViewModel, C52771j jVar, C11934u uVar, C52682m mVar) {
                this.f31310a = rVar;
                this.f31311b = eVar;
                this.f31312c = jediViewModel;
                this.f31313d = jVar;
                this.f31314e = uVar;
                this.f31315f = mVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                C11796d i = this.f31310a.mo22645i();
                if (i != null) {
                    this.f31315f.invoke(i, obj);
                }
                return C52860x.f131107a;
            }
        }

        /* renamed from: com.bytedance.jedi.arch.e$a$c */
        static final class C11801c extends C52712l implements C52682m<A, B, C52860x> {

            /* renamed from: a */
            final /* synthetic */ C11931r f31316a;

            /* renamed from: b */
            final /* synthetic */ C11797e f31317b;

            /* renamed from: c */
            final /* synthetic */ JediViewModel f31318c;

            /* renamed from: d */
            final /* synthetic */ C52771j f31319d;

            /* renamed from: e */
            final /* synthetic */ C52771j f31320e;

            /* renamed from: f */
            final /* synthetic */ C11934u f31321f;

            /* renamed from: g */
            final /* synthetic */ C52686q f31322g;

            C11801c(C11931r rVar, C11797e eVar, JediViewModel jediViewModel, C52771j jVar, C52771j jVar2, C11934u uVar, C52686q qVar) {
                this.f31316a = rVar;
                this.f31317b = eVar;
                this.f31318c = jediViewModel;
                this.f31319d = jVar;
                this.f31320e = jVar2;
                this.f31321f = uVar;
                this.f31322g = qVar;
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                C11796d i = this.f31316a.mo22645i();
                if (i != null) {
                    this.f31322g.invoke(i, obj, obj2);
                }
                return C52860x.f131107a;
            }
        }

        /* renamed from: com.bytedance.jedi.arch.e$a$d */
        static final class C11802d extends C52712l implements C52686q<A, B, C, C52860x> {

            /* renamed from: a */
            final /* synthetic */ C11931r f31323a;

            /* renamed from: b */
            final /* synthetic */ C11797e f31324b;

            /* renamed from: c */
            final /* synthetic */ JediViewModel f31325c;

            /* renamed from: d */
            final /* synthetic */ C52771j f31326d;

            /* renamed from: e */
            final /* synthetic */ C52771j f31327e;

            /* renamed from: f */
            final /* synthetic */ C52771j f31328f;

            /* renamed from: g */
            final /* synthetic */ C11934u f31329g;

            /* renamed from: h */
            final /* synthetic */ C52687r f31330h;

            C11802d(C11931r rVar, C11797e eVar, JediViewModel jediViewModel, C52771j jVar, C52771j jVar2, C52771j jVar3, C11934u uVar, C52687r rVar2) {
                this.f31323a = rVar;
                this.f31324b = eVar;
                this.f31325c = jediViewModel;
                this.f31326d = jVar;
                this.f31327e = jVar2;
                this.f31328f = jVar3;
                this.f31329g = uVar;
                this.f31330h = rVar2;
                super(3);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                C11796d i = this.f31323a.mo22645i();
                if (i != null) {
                    this.f31330h.mo18305a(i, obj, obj2, obj3);
                }
                return C52860x.f131107a;
            }
        }

        /* renamed from: com.bytedance.jedi.arch.e$a$e */
        static final class C11803e extends C52712l implements C52687r<A, B, C, D, C52860x> {

            /* renamed from: a */
            final /* synthetic */ C11931r f31331a;

            /* renamed from: b */
            final /* synthetic */ C11797e f31332b;

            /* renamed from: c */
            final /* synthetic */ JediViewModel f31333c;

            /* renamed from: d */
            final /* synthetic */ C52771j f31334d;

            /* renamed from: e */
            final /* synthetic */ C52771j f31335e;

            /* renamed from: f */
            final /* synthetic */ C52771j f31336f;

            /* renamed from: g */
            final /* synthetic */ C52771j f31337g;

            /* renamed from: h */
            final /* synthetic */ C11934u f31338h;

            /* renamed from: i */
            final /* synthetic */ C52688s f31339i;

            C11803e(C11931r rVar, C11797e eVar, JediViewModel jediViewModel, C52771j jVar, C52771j jVar2, C52771j jVar3, C52771j jVar4, C11934u uVar, C52688s sVar) {
                this.f31331a = rVar;
                this.f31332b = eVar;
                this.f31333c = jediViewModel;
                this.f31334d = jVar;
                this.f31335e = jVar2;
                this.f31336f = jVar3;
                this.f31337g = jVar4;
                this.f31338h = uVar;
                this.f31339i = sVar;
                super(4);
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo18305a(Object obj, Object obj2, Object obj3, Object obj4) {
                C11796d i = this.f31331a.mo22645i();
                if (i != null) {
                    this.f31339i.mo58987a(i, obj, obj2, obj3, obj4);
                }
                return C52860x.f131107a;
            }
        }

        /* renamed from: com.bytedance.jedi.arch.e$a$f */
        static final class C11804f extends C52712l implements C52671b<S, C52860x> {

            /* renamed from: a */
            final /* synthetic */ C11931r f31340a;

            /* renamed from: b */
            final /* synthetic */ C11797e f31341b;

            /* renamed from: c */
            final /* synthetic */ JediViewModel f31342c;

            /* renamed from: d */
            final /* synthetic */ C11934u f31343d;

            /* renamed from: e */
            final /* synthetic */ C52682m f31344e;

            C11804f(C11931r rVar, C11797e eVar, JediViewModel jediViewModel, C11934u uVar, C52682m mVar) {
                this.f31340a = rVar;
                this.f31341b = eVar;
                this.f31342c = jediViewModel;
                this.f31343d = uVar;
                this.f31344e = mVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                C11932s sVar = (C11932s) obj;
                C52711k.m112240b(sVar, "it");
                C11796d i = this.f31340a.mo22645i();
                if (i != null) {
                    this.f31344e.invoke(i, sVar);
                }
                return C52860x.f131107a;
            }
        }

        /* renamed from: a */
        public static <RECEIVER extends C11796d, S extends C11932s, A, B, C> C1690c m24154a(C11797e<? extends RECEIVER> eVar, JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C11934u<C11939z<A, B, C>> uVar, C52687r<? super RECEIVER, ? super A, ? super B, ? super C, C52860x> rVar) {
            JediViewModel<S> jediViewModel2 = jediViewModel;
            C52771j<S, ? extends A> jVar4 = jVar;
            C52771j<S, ? extends B> jVar5 = jVar2;
            C52771j<S, ? extends C> jVar6 = jVar3;
            C11934u<C11939z<A, B, C>> uVar2 = uVar;
            C52711k.m112240b(jediViewModel2, "$this$selectSubscribe");
            C52711k.m112240b(jVar4, "prop1");
            C52711k.m112240b(jVar5, "prop2");
            C52711k.m112240b(jVar6, "prop3");
            C52711k.m112240b(uVar2, "config");
            C52687r<? super RECEIVER, ? super A, ? super B, ? super C, C52860x> rVar2 = rVar;
            C52711k.m112240b(rVar2, "subscriber");
            C11931r d = eVar.mo22554d();
            C0184k h = eVar.mo22553c().mo22626h();
            C11797e<? extends RECEIVER> eVar2 = eVar;
            C11934u a = C11896i.m24256a(eVar2, uVar2);
            C11802d dVar = new C11802d(d, eVar2, jediViewModel, jVar, jVar2, jVar3, uVar2, rVar2);
            C52686q qVar = dVar;
            C52711k.m112240b(jediViewModel2, "$this$selectSubscribeInternal");
            C52711k.m112240b(jVar4, "prop1");
            C52711k.m112240b(jVar5, "prop2");
            C52711k.m112240b(jVar6, "prop3");
            C52711k.m112240b(a, "config");
            C52711k.m112240b(qVar, "subscriber");
            C2201v ca_ = jediViewModel.ca_();
            C11906j jVar7 = new C11906j(jediViewModel, h, jVar, jVar2, jVar3, qVar);
            C2201v a2 = ca_.mo6541d((C1711f<? super T, ? extends R>) jVar7).mo6517a(a.f31615b);
            if (a.f31614a) {
                a2 = a2.mo6509a(1);
            }
            C2201v vVar = a2;
            C52711k.m112236a((Object) vVar, "upstream");
            boolean z = a.f31618e;
            boolean z2 = a.f31616c;
            C1675ac acVar = a.f31619f;
            boolean z3 = z2;
            C11907k kVar = new C11907k(a, jediViewModel, h, jVar, jVar2, jVar3, qVar);
            return jediViewModel.mo22522a(vVar, h, z, z3, acVar, (C52671b<? super T, C52860x>) kVar);
        }

        /* renamed from: a */
        public static <RECEIVER extends C11796d, S extends C11932s, A, B, C, D> C1690c m24155a(C11797e<? extends RECEIVER> eVar, JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C52771j<S, ? extends D> jVar4, C11934u<C11788aa<A, B, C, D>> uVar, C52688s<? super RECEIVER, ? super A, ? super B, ? super C, ? super D, C52860x> sVar) {
            JediViewModel<S> jediViewModel2 = jediViewModel;
            C52771j<S, ? extends A> jVar5 = jVar;
            C52771j<S, ? extends B> jVar6 = jVar2;
            C52771j<S, ? extends C> jVar7 = jVar3;
            C52771j<S, ? extends D> jVar8 = jVar4;
            C11934u<C11788aa<A, B, C, D>> uVar2 = uVar;
            C52711k.m112240b(jediViewModel2, "$this$selectSubscribe");
            C52711k.m112240b(jVar5, "prop1");
            C52711k.m112240b(jVar6, "prop2");
            C52711k.m112240b(jVar7, "prop3");
            C52711k.m112240b(jVar8, "prop4");
            C52711k.m112240b(uVar2, "config");
            C52688s<? super RECEIVER, ? super A, ? super B, ? super C, ? super D, C52860x> sVar2 = sVar;
            C52711k.m112240b(sVar2, "subscriber");
            C11931r d = eVar.mo22554d();
            C11797e<? extends RECEIVER> eVar2 = eVar;
            C0184k h = eVar.mo22553c().mo22626h();
            C11934u a = C11896i.m24256a(eVar2, uVar2);
            C11803e eVar3 = new C11803e(d, eVar2, jediViewModel, jVar, jVar2, jVar3, jVar4, uVar2, sVar2);
            C52687r rVar = eVar3;
            C52711k.m112240b(jediViewModel2, "$this$selectSubscribeInternal");
            C52711k.m112240b(jVar5, "prop1");
            C52711k.m112240b(jVar6, "prop2");
            C52711k.m112240b(jVar7, "prop3");
            C52711k.m112240b(jVar8, "prop4");
            C52711k.m112240b(a, "config");
            C52711k.m112240b(rVar, "subscriber");
            C2201v ca_ = jediViewModel.ca_();
            C11908l lVar = new C11908l(jediViewModel, h, jVar, jVar2, jVar3, jVar4, rVar);
            C2201v a2 = ca_.mo6541d((C1711f<? super T, ? extends R>) lVar).mo6517a(a.f31615b);
            if (a.f31614a) {
                a2 = a2.mo6509a(1);
            }
            C2201v vVar = a2;
            C52711k.m112236a((Object) vVar, "upstream");
            boolean z = a.f31618e;
            boolean z2 = a.f31616c;
            C1675ac acVar = a.f31619f;
            boolean z3 = z2;
            boolean z4 = z;
            C11909m mVar = new C11909m(a, jediViewModel, h, jVar, jVar2, jVar3, jVar4, rVar);
            return jediViewModel.mo22522a(vVar, h, z4, z3, acVar, (C52671b<? super T, C52860x>) mVar);
        }

        /* renamed from: a */
        public static <RECEIVER extends C11796d, VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R m24156a(C11797e<? extends RECEIVER> eVar, VM1 vm1, C52671b<? super S1, ? extends R> bVar) {
            C52711k.m112240b(vm1, "viewModel1");
            C52711k.m112240b(bVar, "block");
            return bVar.invoke((C11932s) vm1.bZ_().mo22613a());
        }

        /* renamed from: a */
        public static <RECEIVER extends C11796d, S extends C11932s> C1690c m24146a(C11797e<? extends RECEIVER> eVar, JediViewModel<S> jediViewModel, C11934u<S> uVar, C52682m<? super RECEIVER, ? super S, C52860x> mVar) {
            C52711k.m112240b(jediViewModel, "$this$subscribe");
            C52711k.m112240b(uVar, "config");
            C52711k.m112240b(mVar, "subscriber");
            C11931r d = eVar.mo22554d();
            C0184k h = eVar.mo22553c().mo22626h();
            C11934u a = C11896i.m24256a(eVar, uVar);
            C11804f fVar = new C11804f(d, eVar, jediViewModel, uVar, mVar);
            C52671b bVar = fVar;
            C52711k.m112240b(jediViewModel, "$this$subscribeInternal");
            C52711k.m112240b(a, "config");
            C52711k.m112240b(bVar, "subscriber");
            C2201v a2 = jediViewModel.ca_().mo6517a(a.f31615b);
            if (a.f31614a) {
                a2 = a2.mo6509a(1);
            }
            C2201v vVar = a2;
            C52711k.m112236a((Object) vVar, "it");
            return jediViewModel.mo22522a(vVar, h, a.f31618e, a.f31616c, a.f31619f, bVar);
        }

        /* renamed from: a */
        public static <RECEIVER extends C11796d, S extends C11932s, A> C1690c m24148a(C11797e<? extends RECEIVER> eVar, JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super RECEIVER, ? super A, C52860x> mVar) {
            C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
            C52711k.m112240b(jVar, "prop1");
            C52711k.m112240b(uVar, "config");
            C52711k.m112240b(mVar, "subscriber");
            C11931r d = eVar.mo22554d();
            C0184k h = eVar.mo22553c().mo22626h();
            C11934u a = C11896i.m24256a(eVar, uVar);
            C11800b bVar = new C11800b(d, eVar, jediViewModel, jVar, uVar, mVar);
            return C11896i.m24254a(jediViewModel, h, jVar, a, bVar);
        }

        /* renamed from: a */
        public static <RECEIVER extends C11796d, S extends C11932s, A, B> C1690c m24152a(C11797e<? extends RECEIVER> eVar, JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C11934u<C11938y<A, B>> uVar, C52686q<? super RECEIVER, ? super A, ? super B, C52860x> qVar) {
            JediViewModel<S> jediViewModel2 = jediViewModel;
            C52771j<S, ? extends A> jVar3 = jVar;
            C52771j<S, ? extends B> jVar4 = jVar2;
            C11934u<C11938y<A, B>> uVar2 = uVar;
            C52711k.m112240b(jediViewModel2, "$this$selectSubscribe");
            C52711k.m112240b(jVar3, "prop1");
            C52711k.m112240b(jVar4, "prop2");
            C52711k.m112240b(uVar2, "config");
            C52686q<? super RECEIVER, ? super A, ? super B, C52860x> qVar2 = qVar;
            C52711k.m112240b(qVar2, "subscriber");
            C11931r d = eVar.mo22554d();
            C0184k h = eVar.mo22553c().mo22626h();
            C11797e<? extends RECEIVER> eVar2 = eVar;
            C11934u a = C11896i.m24256a(eVar2, uVar2);
            C11801c cVar = new C11801c(d, eVar2, jediViewModel, jVar, jVar2, uVar2, qVar2);
            C52682m mVar = cVar;
            C52711k.m112240b(jediViewModel2, "$this$selectSubscribeInternal");
            C52711k.m112240b(jVar3, "prop1");
            C52711k.m112240b(jVar4, "prop2");
            C52711k.m112240b(a, "config");
            C52711k.m112240b(mVar, "subscriber");
            C2201v ca_ = jediViewModel.ca_();
            C11904h hVar = new C11904h(jediViewModel, h, jVar, jVar2, mVar);
            C2201v a2 = ca_.mo6541d((C1711f<? super T, ? extends R>) hVar).mo6517a(a.f31615b);
            if (a.f31614a) {
                a2 = a2.mo6509a(1);
            }
            C2201v vVar = a2;
            C52711k.m112236a((Object) vVar, "upstream");
            boolean z = a.f31618e;
            boolean z2 = a.f31616c;
            C1675ac acVar = a.f31619f;
            C11905i iVar = new C11905i(a, jediViewModel, h, jVar, jVar2, mVar);
            return jediViewModel.mo22522a(vVar, h, z, z2, acVar, (C52671b<? super T, C52860x>) iVar);
        }

        /* renamed from: a */
        public static <RECEIVER extends C11796d, S extends C11932s, T> C1690c m24150a(C11797e<? extends RECEIVER> eVar, JediViewModel<S> jediViewModel, C52771j<S, ? extends C11787a<? extends T>> jVar, C11934u<C11937x<C11787a<T>>> uVar, C52682m<? super RECEIVER, ? super Throwable, C52860x> mVar, C52671b<? super RECEIVER, C52860x> bVar, C52682m<? super RECEIVER, ? super T, C52860x> mVar2) {
            JediViewModel<S> jediViewModel2 = jediViewModel;
            C52771j<S, ? extends C11787a<? extends T>> jVar2 = jVar;
            C11934u<C11937x<C11787a<T>>> uVar2 = uVar;
            C52711k.m112240b(jediViewModel, "$this$asyncSubscribe");
            C52711k.m112240b(jVar2, "prop");
            C52711k.m112240b(uVar2, "config");
            C11931r d = eVar.mo22554d();
            C0184k h = eVar.mo22553c().mo22626h();
            C11797e<? extends RECEIVER> eVar2 = eVar;
            C11934u a = C11896i.m24256a(eVar, uVar2);
            C11799a aVar = new C11799a(d, eVar2, jediViewModel, jVar, uVar2, bVar, mVar, mVar2);
            return C11896i.m24254a(jediViewModel, h, jVar2, a, aVar);
        }

        /* renamed from: a */
        public static /* synthetic */ C1690c m24151a(C11797e eVar, JediViewModel jediViewModel, C52771j jVar, C11934u uVar, C52682m mVar, C52671b bVar, C52682m mVar2, int i, Object obj) {
            C52682m mVar3;
            C52671b bVar2;
            C52682m mVar4;
            if ((i & 2) != 0) {
                uVar = C11896i.m24255a();
            }
            C11934u uVar2 = uVar;
            if ((i & 4) != 0) {
                mVar3 = null;
            } else {
                mVar3 = mVar;
            }
            if ((i & 8) != 0) {
                bVar2 = null;
            } else {
                bVar2 = bVar;
            }
            if ((i & 16) != 0) {
                mVar4 = null;
            } else {
                mVar4 = mVar2;
            }
            return eVar.mo22548a(jediViewModel, jVar, uVar2, mVar3, bVar2, mVar4);
        }
    }

    /* renamed from: a */
    <S extends C11932s> C1690c mo22546a(JediViewModel<S> jediViewModel, C11934u<S> uVar, C52682m<? super RECEIVER, ? super S, C52860x> mVar);

    /* renamed from: a */
    <S extends C11932s, A> C1690c mo22547a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super RECEIVER, ? super A, C52860x> mVar);

    /* renamed from: a */
    <S extends C11932s, T> C1690c mo22548a(JediViewModel<S> jediViewModel, C52771j<S, ? extends C11787a<? extends T>> jVar, C11934u<C11937x<C11787a<T>>> uVar, C52682m<? super RECEIVER, ? super Throwable, C52860x> mVar, C52671b<? super RECEIVER, C52860x> bVar, C52682m<? super RECEIVER, ? super T, C52860x> mVar2);

    /* renamed from: a */
    <S extends C11932s, A, B> C1690c mo22549a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C11934u<C11938y<A, B>> uVar, C52686q<? super RECEIVER, ? super A, ? super B, C52860x> qVar);

    /* renamed from: a */
    <S extends C11932s, A, B, C> C1690c mo22550a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C11934u<C11939z<A, B, C>> uVar, C52687r<? super RECEIVER, ? super A, ? super B, ? super C, C52860x> rVar);

    /* renamed from: a */
    <S extends C11932s, A, B, C, D> C1690c mo22551a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C52771j<S, ? extends D> jVar4, C11934u<C11788aa<A, B, C, D>> uVar, C52688s<? super RECEIVER, ? super A, ? super B, ? super C, ? super D, C52860x> sVar);

    /* renamed from: a */
    <VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R mo22552a(VM1 vm1, C52671b<? super S1, ? extends R> bVar);

    /* renamed from: c */
    C11910j mo22553c();

    /* renamed from: d */
    C11931r<RECEIVER> mo22554d();

    /* renamed from: f */
    boolean mo22555f();
}
