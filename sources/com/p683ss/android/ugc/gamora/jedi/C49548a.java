package com.p683ss.android.ugc.gamora.jedi;

import android.arch.lifecycle.C0184k;
import com.bytedance.jedi.arch.C11787a;
import com.bytedance.jedi.arch.C11788aa;
import com.bytedance.jedi.arch.C11866f;
import com.bytedance.jedi.arch.C11872h;
import com.bytedance.jedi.arch.C11872h.C11873a;
import com.bytedance.jedi.arch.C11910j;
import com.bytedance.jedi.arch.C11931r;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.C11934u;
import com.bytedance.jedi.arch.C11937x;
import com.bytedance.jedi.arch.C11938y;
import com.bytedance.jedi.arch.C11939z;
import com.bytedance.jedi.arch.JediViewModel;
import p064c.p065a.p069b.C1690c;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.gamora.jedi.a */
public interface C49548a extends C11872h {

    /* renamed from: com.ss.android.ugc.gamora.jedi.a$a */
    public static final class C49549a {

        /* renamed from: com.ss.android.ugc.gamora.jedi.a$a$a */
        static final class C49550a extends C52712l implements C52682m<C11866f, A, C52860x> {

            /* renamed from: a */
            final /* synthetic */ C52682m f124302a;

            /* renamed from: com.ss.android.ugc.gamora.jedi.a$a$a$a */
            static final class C49551a implements Runnable {

                /* renamed from: a */
                final /* synthetic */ Throwable f124303a;

                C49551a(Throwable th) {
                    this.f124303a = th;
                }

                public final void run() {
                    throw this.f124303a;
                }
            }

            C49550a(C52682m mVar) {
                this.f124302a = mVar;
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                C11866f fVar = (C11866f) obj;
                C52711k.m112240b(fVar, "$receiver");
                if (obj2 != null) {
                    try {
                        this.f124302a.invoke((C49548a) fVar, obj2);
                    } catch (Throwable th) {
                        C49557d.f124310a.post(new C49551a(th));
                        throw th;
                    }
                }
                return C52860x.f131107a;
            }
        }

        /* renamed from: com.ss.android.ugc.gamora.jedi.a$a$b */
        static final class C49552b extends C52712l implements C52682m<C49548a, C49555b<? extends A>, C52860x> {

            /* renamed from: a */
            final /* synthetic */ C52682m f124304a;

            C49552b(C52682m mVar) {
                this.f124304a = mVar;
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                final C49548a aVar = (C49548a) obj;
                C49555b bVar = (C49555b) obj2;
                C52711k.m112240b(aVar, "$receiver");
                C52711k.m112240b(bVar, "it");
                bVar.mo97467a(new C52671b<A, C52860x>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C49552b f124305a;

                    {
                        this.f124305a = r1;
                    }

                    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        this.f124305a.f124304a.invoke(aVar, obj);
                        return C52860x.f131107a;
                    }
                });
                return C52860x.f131107a;
            }
        }

        /* renamed from: com.ss.android.ugc.gamora.jedi.a$a$c */
        static final class C49554c extends C52712l implements C52682m<C49548a, C49562i<? extends A>, C52860x> {

            /* renamed from: a */
            final /* synthetic */ C52682m f124307a;

            C49554c(C52682m mVar) {
                this.f124307a = mVar;
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                C49548a aVar = (C49548a) obj;
                C49562i iVar = (C49562i) obj2;
                C52711k.m112240b(aVar, "$receiver");
                C52711k.m112240b(iVar, "it");
                this.f124307a.invoke(aVar, iVar.f124311a);
                return C52860x.f131107a;
            }
        }

        /* renamed from: a */
        public static C0184k m106918a(C49548a aVar) {
            return C11873a.m24229c(aVar);
        }

        /* renamed from: a */
        public static <S extends C11932s> C1690c m106919a(C49548a aVar, JediViewModel<S> jediViewModel, C11934u<S> uVar, C52682m<? super C11866f, ? super S, C52860x> mVar) {
            C52711k.m112240b(jediViewModel, "$this$subscribe");
            C52711k.m112240b(uVar, "config");
            C52711k.m112240b(mVar, "subscriber");
            return C11873a.m24220a(aVar, jediViewModel, uVar, mVar);
        }

        /* renamed from: a */
        public static <S extends C11932s, T> C1690c m106920a(C49548a aVar, JediViewModel<S> jediViewModel, C52771j<S, ? extends C11787a<? extends T>> jVar, C11934u<C11937x<C11787a<T>>> uVar, C52682m<? super C11866f, ? super Throwable, C52860x> mVar, C52671b<? super C11866f, C52860x> bVar, C52682m<? super C11866f, ? super T, C52860x> mVar2) {
            C52711k.m112240b(jediViewModel, "$this$asyncSubscribe");
            C52711k.m112240b(jVar, "prop");
            C52711k.m112240b(uVar, "config");
            return C11873a.m24222a((C11872h) aVar, jediViewModel, jVar, uVar, mVar, bVar, mVar2);
        }

        /* renamed from: a */
        public static <S extends C11932s, A, B> C1690c m106921a(C49548a aVar, JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C11934u<C11938y<A, B>> uVar, C52686q<? super C11866f, ? super A, ? super B, C52860x> qVar) {
            C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
            C52711k.m112240b(jVar, "prop1");
            C52711k.m112240b(jVar2, "prop2");
            C52711k.m112240b(uVar, "config");
            C52711k.m112240b(qVar, "subscriber");
            return C11873a.m24223a(aVar, jediViewModel, jVar, jVar2, uVar, qVar);
        }

        /* renamed from: a */
        public static <S extends C11932s, A, B, C> C1690c m106922a(C49548a aVar, JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C11934u<C11939z<A, B, C>> uVar, C52687r<? super C11866f, ? super A, ? super B, ? super C, C52860x> rVar) {
            C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
            C52711k.m112240b(jVar, "prop1");
            C52711k.m112240b(jVar2, "prop2");
            C52711k.m112240b(jVar3, "prop3");
            C52711k.m112240b(uVar, "config");
            C52711k.m112240b(rVar, "subscriber");
            return C11873a.m24224a((C11872h) aVar, jediViewModel, jVar, jVar2, jVar3, uVar, rVar);
        }

        /* renamed from: a */
        public static <S extends C11932s, A, B, C, D> C1690c m106923a(C49548a aVar, JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C52771j<S, ? extends D> jVar4, C11934u<C11788aa<A, B, C, D>> uVar, C52688s<? super C11866f, ? super A, ? super B, ? super C, ? super D, C52860x> sVar) {
            JediViewModel<S> jediViewModel2 = jediViewModel;
            C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
            C52771j<S, ? extends A> jVar5 = jVar;
            C52711k.m112240b(jVar, "prop1");
            C52771j<S, ? extends B> jVar6 = jVar2;
            C52711k.m112240b(jVar2, "prop2");
            C52771j<S, ? extends C> jVar7 = jVar3;
            C52711k.m112240b(jVar3, "prop3");
            C52771j<S, ? extends D> jVar8 = jVar4;
            C52711k.m112240b(jVar4, "prop4");
            C11934u<C11788aa<A, B, C, D>> uVar2 = uVar;
            C52711k.m112240b(uVar, "config");
            C52688s<? super C11866f, ? super A, ? super B, ? super C, ? super D, C52860x> sVar2 = sVar;
            C52711k.m112240b(sVar2, "subscriber");
            return C11873a.m24225a(aVar, jediViewModel2, jVar5, jVar6, jVar7, jVar8, uVar2, sVar2);
        }

        /* renamed from: a */
        public static <VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R m106924a(C49548a aVar, VM1 vm1, C52671b<? super S1, ? extends R> bVar) {
            C52711k.m112240b(vm1, "viewModel1");
            C52711k.m112240b(bVar, "block");
            return C11873a.m24227a(aVar, vm1, bVar);
        }

        /* renamed from: b */
        public static C11910j m106927b(C49548a aVar) {
            return C11873a.m24226a(aVar);
        }

        /* renamed from: c */
        public static C11866f m106930c(C49548a aVar) {
            return C11873a.m24230d(aVar);
        }

        /* renamed from: d */
        public static <S extends C11932s, A> C1690c m106933d(C49548a aVar, JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super C11866f, ? super A, C52860x> mVar) {
            C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
            C52711k.m112240b(jVar, "prop1");
            C52711k.m112240b(uVar, "config");
            C52711k.m112240b(mVar, "subscriber");
            return C11873a.m24221a(aVar, jediViewModel, jVar, uVar, mVar);
        }

        /* renamed from: d */
        public static C11931r<C11866f> m106934d(C49548a aVar) {
            return C11873a.m24228b(aVar);
        }

        /* renamed from: e */
        public static boolean m106935e(C49548a aVar) {
            return C11873a.m24231e(aVar);
        }

        /* renamed from: b */
        public static <S extends C11932s, A> void m106928b(C49548a aVar, JediViewModel<S> jediViewModel, C52771j<S, ? extends C49555b<? extends A>> jVar, C11934u<C11937x<C49555b<A>>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
            C52711k.m112240b(jediViewModel, "$this$subscribeEvent");
            C52711k.m112240b(jVar, "prop1");
            C52711k.m112240b(uVar, "config");
            C52711k.m112240b(mVar, "subscriber");
            aVar.mo49443b(jediViewModel, jVar, uVar, new C49552b(mVar));
        }

        /* renamed from: c */
        public static <S extends C11932s, A> void m106931c(C49548a aVar, JediViewModel<S> jediViewModel, C52771j<S, ? extends C49562i<? extends A>> jVar, C11934u<C11937x<C49562i<A>>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
            C52711k.m112240b(jediViewModel, "$this$subscribeMultiEvent");
            C52711k.m112240b(jVar, "prop1");
            C52711k.m112240b(uVar, "config");
            C52711k.m112240b(mVar, "subscriber");
            aVar.mo49443b(jediViewModel, jVar, uVar, new C49554c(mVar));
        }

        /* renamed from: a */
        public static <S extends C11932s, A> void m106925a(C49548a aVar, JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
            C52711k.m112240b(jediViewModel, "$this$selectNonNullSubscribe");
            C52711k.m112240b(jVar, "prop1");
            C52711k.m112240b(uVar, "config");
            C52711k.m112240b(mVar, "subscriber");
            aVar.mo22547a(jediViewModel, jVar, uVar, new C49550a(mVar));
        }
    }

    /* renamed from: b */
    <S extends C11932s, A> void mo49443b(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar);

    /* renamed from: c */
    <S extends C11932s, A> void mo49444c(JediViewModel<S> jediViewModel, C52771j<S, ? extends C49555b<? extends A>> jVar, C11934u<C11937x<C49555b<A>>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar);

    /* renamed from: d */
    <S extends C11932s, A> void mo49445d(JediViewModel<S> jediViewModel, C52771j<S, ? extends C49562i<? extends A>> jVar, C11934u<C11937x<C49562i<A>>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar);
}
