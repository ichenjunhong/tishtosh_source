package com.bytedance.jedi.arch;

import android.arch.lifecycle.C0184k;
import com.bytedance.jedi.arch.C11797e.C11798a;
import p064c.p065a.p069b.C1690c;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2648k.C52771j;

/* renamed from: com.bytedance.jedi.arch.h */
public interface C11872h extends C11866f {

    /* renamed from: com.bytedance.jedi.arch.h$a */
    public static final class C11873a {
        /* renamed from: d */
        public static C11866f m24230d(C11872h hVar) {
            return hVar;
        }

        /* renamed from: e */
        public static boolean m24231e(C11872h hVar) {
            C11866f fVar = hVar;
            return true;
        }

        /* renamed from: a */
        public static C11910j m24226a(C11872h hVar) {
            return hVar;
        }

        /* renamed from: b */
        public static C11931r<C11866f> m24228b(C11872h hVar) {
            return hVar;
        }

        /* renamed from: c */
        public static C0184k m24229c(C11872h hVar) {
            return hVar;
        }

        /* renamed from: a */
        public static <VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R m24227a(C11872h hVar, VM1 vm1, C52671b<? super S1, ? extends R> bVar) {
            C52711k.m112240b(vm1, "viewModel1");
            C52711k.m112240b(bVar, "block");
            C11866f fVar = hVar;
            C52711k.m112240b(vm1, "viewModel1");
            C52711k.m112240b(bVar, "block");
            return C11798a.m24156a(fVar, vm1, bVar);
        }

        /* renamed from: a */
        public static <S extends C11932s> C1690c m24220a(C11872h hVar, JediViewModel<S> jediViewModel, C11934u<S> uVar, C52682m<? super C11866f, ? super S, C52860x> mVar) {
            C52711k.m112240b(jediViewModel, "$this$subscribe");
            C52711k.m112240b(uVar, "config");
            C52711k.m112240b(mVar, "subscriber");
            C11866f fVar = hVar;
            C52711k.m112240b(jediViewModel, "$this$subscribe");
            C52711k.m112240b(uVar, "config");
            C52711k.m112240b(mVar, "subscriber");
            return C11798a.m24146a(fVar, jediViewModel, uVar, mVar);
        }

        /* renamed from: a */
        public static <S extends C11932s, A> C1690c m24221a(C11872h hVar, JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super C11866f, ? super A, C52860x> mVar) {
            C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
            C52711k.m112240b(jVar, "prop1");
            C52711k.m112240b(uVar, "config");
            C52711k.m112240b(mVar, "subscriber");
            C11866f fVar = hVar;
            C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
            C52711k.m112240b(jVar, "prop1");
            C52711k.m112240b(uVar, "config");
            C52711k.m112240b(mVar, "subscriber");
            return C11798a.m24148a(fVar, jediViewModel, jVar, uVar, mVar);
        }

        /* renamed from: a */
        public static <S extends C11932s, A, B> C1690c m24223a(C11872h hVar, JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C11934u<C11938y<A, B>> uVar, C52686q<? super C11866f, ? super A, ? super B, C52860x> qVar) {
            C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
            C52711k.m112240b(jVar, "prop1");
            C52711k.m112240b(jVar2, "prop2");
            C52711k.m112240b(uVar, "config");
            C52711k.m112240b(qVar, "subscriber");
            C11866f fVar = hVar;
            C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
            C52711k.m112240b(jVar, "prop1");
            C52711k.m112240b(jVar2, "prop2");
            C52711k.m112240b(uVar, "config");
            C52711k.m112240b(qVar, "subscriber");
            return C11798a.m24152a((C11797e<? extends RECEIVER>) fVar, jediViewModel, jVar, jVar2, uVar, qVar);
        }

        /* renamed from: a */
        public static <S extends C11932s, T> C1690c m24222a(C11872h hVar, JediViewModel<S> jediViewModel, C52771j<S, ? extends C11787a<? extends T>> jVar, C11934u<C11937x<C11787a<T>>> uVar, C52682m<? super C11866f, ? super Throwable, C52860x> mVar, C52671b<? super C11866f, C52860x> bVar, C52682m<? super C11866f, ? super T, C52860x> mVar2) {
            C52711k.m112240b(jediViewModel, "$this$asyncSubscribe");
            C52711k.m112240b(jVar, "prop");
            C52711k.m112240b(uVar, "config");
            C11866f fVar = hVar;
            C52711k.m112240b(jediViewModel, "$this$asyncSubscribe");
            C52711k.m112240b(jVar, "prop");
            C52711k.m112240b(uVar, "config");
            return C11798a.m24150a((C11797e<? extends RECEIVER>) fVar, jediViewModel, jVar, uVar, mVar, bVar, mVar2);
        }

        /* renamed from: a */
        public static <S extends C11932s, A, B, C> C1690c m24224a(C11872h hVar, JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C11934u<C11939z<A, B, C>> uVar, C52687r<? super C11866f, ? super A, ? super B, ? super C, C52860x> rVar) {
            C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
            C52711k.m112240b(jVar, "prop1");
            C52711k.m112240b(jVar2, "prop2");
            C52711k.m112240b(jVar3, "prop3");
            C52711k.m112240b(uVar, "config");
            C52711k.m112240b(rVar, "subscriber");
            C11866f fVar = hVar;
            C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
            C52711k.m112240b(jVar, "prop1");
            C52711k.m112240b(jVar2, "prop2");
            C52711k.m112240b(jVar3, "prop3");
            C52711k.m112240b(uVar, "config");
            C52711k.m112240b(rVar, "subscriber");
            return C11798a.m24154a((C11797e<? extends RECEIVER>) fVar, jediViewModel, jVar, jVar2, jVar3, uVar, rVar);
        }

        /* renamed from: a */
        public static <S extends C11932s, A, B, C, D> C1690c m24225a(C11872h hVar, JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C52771j<S, ? extends D> jVar4, C11934u<C11788aa<A, B, C, D>> uVar, C52688s<? super C11866f, ? super A, ? super B, ? super C, ? super D, C52860x> sVar) {
            JediViewModel<S> jediViewModel2 = jediViewModel;
            C52771j<S, ? extends A> jVar5 = jVar;
            C52771j<S, ? extends B> jVar6 = jVar2;
            C52771j<S, ? extends C> jVar7 = jVar3;
            C52771j<S, ? extends D> jVar8 = jVar4;
            C11934u<C11788aa<A, B, C, D>> uVar2 = uVar;
            C52688s<? super C11866f, ? super A, ? super B, ? super C, ? super D, C52860x> sVar2 = sVar;
            C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
            C52711k.m112240b(jVar, "prop1");
            C52711k.m112240b(jVar2, "prop2");
            C52711k.m112240b(jVar3, "prop3");
            C52711k.m112240b(jVar4, "prop4");
            C52711k.m112240b(uVar, "config");
            C52711k.m112240b(sVar2, "subscriber");
            C11866f fVar = hVar;
            C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
            C52711k.m112240b(jVar, "prop1");
            C52711k.m112240b(jVar2, "prop2");
            C52711k.m112240b(jVar3, "prop3");
            C52711k.m112240b(jVar4, "prop4");
            C52711k.m112240b(uVar, "config");
            C52711k.m112240b(sVar2, "subscriber");
            return C11798a.m24155a((C11797e<? extends RECEIVER>) fVar, jediViewModel2, jVar5, jVar6, jVar7, jVar8, uVar2, sVar2);
        }
    }
}
