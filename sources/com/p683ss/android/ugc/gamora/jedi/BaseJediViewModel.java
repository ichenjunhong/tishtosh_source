package com.p683ss.android.ugc.gamora.jedi;

import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0176h.C0178b;
import android.arch.lifecycle.C0184k;
import com.bytedance.jedi.arch.C11787a;
import com.bytedance.jedi.arch.C11788aa;
import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.arch.C11866f;
import com.bytedance.jedi.arch.C11910j;
import com.bytedance.jedi.arch.C11931r;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.C11934u;
import com.bytedance.jedi.arch.C11937x;
import com.bytedance.jedi.arch.C11938y;
import com.bytedance.jedi.arch.C11939z;
import com.bytedance.jedi.arch.JediViewModel;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import p064c.p065a.C2201v;
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

/* renamed from: com.ss.android.ugc.gamora.jedi.BaseJediViewModel */
public abstract class BaseJediViewModel<S extends C11932s> extends JediViewModel<S> {

    /* renamed from: com.ss.android.ugc.gamora.jedi.BaseJediViewModel$a */
    static final class C49543a extends C52712l implements C52671b<S, S> {

        /* renamed from: a */
        public static final C49543a f124296a = new C49543a();

        C49543a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C11932s sVar = (C11932s) obj;
            C52711k.m112240b(sVar, "it");
            return sVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.jedi.BaseJediViewModel$b */
    public static final class C49544b implements C49548a {

        /* renamed from: a */
        final /* synthetic */ C0184k f124297a;

        /* renamed from: c */
        public final C11910j mo22553c() {
            return C49549a.m106927b(this);
        }

        /* renamed from: d */
        public final C11931r<C11866f> mo22554d() {
            return C49549a.m106934d(this);
        }

        /* renamed from: f */
        public final boolean mo22555f() {
            return C49549a.m106935e(this);
        }

        /* renamed from: h */
        public final C0184k mo22626h() {
            return C49549a.m106918a(this);
        }

        /* renamed from: i */
        public final /* synthetic */ C11796d mo22645i() {
            return C49549a.m106930c(this);
        }

        public final C0176h getLifecycle() {
            C0176h lifecycle = this.f124297a.getLifecycle();
            C52711k.m112236a((Object) lifecycle, "lifecycleOwner.lifecycle");
            return lifecycle;
        }

        C49544b(C0184k kVar) {
            this.f124297a = kVar;
        }

        /* renamed from: a */
        public final <VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R mo22552a(VM1 vm1, C52671b<? super S1, ? extends R> bVar) {
            C52711k.m112240b(vm1, "viewModel1");
            C52711k.m112240b(bVar, "block");
            return C49549a.m106924a(this, vm1, bVar);
        }

        /* renamed from: a */
        public final <S extends C11932s> C1690c mo22546a(JediViewModel<S> jediViewModel, C11934u<S> uVar, C52682m<? super C11866f, ? super S, C52860x> mVar) {
            C52711k.m112240b(jediViewModel, "$this$subscribe");
            C52711k.m112240b(uVar, "config");
            C52711k.m112240b(mVar, "subscriber");
            return C49549a.m106919a(this, jediViewModel, uVar, mVar);
        }

        /* renamed from: b */
        public final <S extends C11932s, A> void mo49443b(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
            C52711k.m112240b(jediViewModel, "$this$selectNonNullSubscribe");
            C52711k.m112240b(jVar, "prop1");
            C52711k.m112240b(uVar, "config");
            C52711k.m112240b(mVar, "subscriber");
            C49549a.m106925a(this, jediViewModel, jVar, uVar, mVar);
        }

        /* renamed from: c */
        public final <S extends C11932s, A> void mo49444c(JediViewModel<S> jediViewModel, C52771j<S, ? extends C49555b<? extends A>> jVar, C11934u<C11937x<C49555b<A>>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
            C52711k.m112240b(jediViewModel, "$this$subscribeEvent");
            C52711k.m112240b(jVar, "prop1");
            C52711k.m112240b(uVar, "config");
            C52711k.m112240b(mVar, "subscriber");
            C49549a.m106928b(this, jediViewModel, jVar, uVar, mVar);
        }

        /* renamed from: d */
        public final <S extends C11932s, A> void mo49445d(JediViewModel<S> jediViewModel, C52771j<S, ? extends C49562i<? extends A>> jVar, C11934u<C11937x<C49562i<A>>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
            C52711k.m112240b(jediViewModel, "$this$subscribeMultiEvent");
            C52711k.m112240b(jVar, "prop1");
            C52711k.m112240b(uVar, "config");
            C52711k.m112240b(mVar, "subscriber");
            C49549a.m106931c(this, jediViewModel, jVar, uVar, mVar);
        }

        /* renamed from: a */
        public final <S extends C11932s, A> C1690c mo22547a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super C11866f, ? super A, C52860x> mVar) {
            C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
            C52711k.m112240b(jVar, "prop1");
            C52711k.m112240b(uVar, "config");
            C52711k.m112240b(mVar, "subscriber");
            return C49549a.m106933d(this, jediViewModel, jVar, uVar, mVar);
        }

        /* renamed from: a */
        public final <S extends C11932s, A, B> C1690c mo22549a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C11934u<C11938y<A, B>> uVar, C52686q<? super C11866f, ? super A, ? super B, C52860x> qVar) {
            C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
            C52711k.m112240b(jVar, "prop1");
            C52711k.m112240b(jVar2, "prop2");
            C52711k.m112240b(uVar, "config");
            C52711k.m112240b(qVar, "subscriber");
            return C49549a.m106921a(this, jediViewModel, jVar, jVar2, uVar, qVar);
        }

        /* renamed from: a */
        public final <S extends C11932s, T> C1690c mo22548a(JediViewModel<S> jediViewModel, C52771j<S, ? extends C11787a<? extends T>> jVar, C11934u<C11937x<C11787a<T>>> uVar, C52682m<? super C11866f, ? super Throwable, C52860x> mVar, C52671b<? super C11866f, C52860x> bVar, C52682m<? super C11866f, ? super T, C52860x> mVar2) {
            C52711k.m112240b(jediViewModel, "$this$asyncSubscribe");
            C52711k.m112240b(jVar, "prop");
            C52711k.m112240b(uVar, "config");
            return C49549a.m106920a((C49548a) this, jediViewModel, jVar, uVar, mVar, bVar, mVar2);
        }

        /* renamed from: a */
        public final <S extends C11932s, A, B, C> C1690c mo22550a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C11934u<C11939z<A, B, C>> uVar, C52687r<? super C11866f, ? super A, ? super B, ? super C, C52860x> rVar) {
            C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
            C52711k.m112240b(jVar, "prop1");
            C52711k.m112240b(jVar2, "prop2");
            C52711k.m112240b(jVar3, "prop3");
            C52711k.m112240b(uVar, "config");
            C52711k.m112240b(rVar, "subscriber");
            return C49549a.m106922a((C49548a) this, jediViewModel, jVar, jVar2, jVar3, uVar, rVar);
        }

        /* renamed from: a */
        public final <S extends C11932s, A, B, C, D> C1690c mo22551a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C52771j<S, ? extends D> jVar4, C11934u<C11788aa<A, B, C, D>> uVar, C52688s<? super C11866f, ? super A, ? super B, ? super C, ? super D, C52860x> sVar) {
            C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
            C52711k.m112240b(jVar, "prop1");
            C52711k.m112240b(jVar2, "prop2");
            C52711k.m112240b(jVar3, "prop3");
            C52711k.m112240b(jVar4, "prop4");
            C52711k.m112240b(uVar, "config");
            C52711k.m112240b(sVar, "subscriber");
            return C49549a.m106923a(this, jediViewModel, jVar, jVar2, jVar3, jVar4, uVar, sVar);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.jedi.BaseJediViewModel$c */
    static final class C49545c extends C52712l implements C52671b<A, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C52671b f124298a;

        C49545c(C52671b bVar) {
            this.f124298a = bVar;
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                this.f124298a.invoke(obj);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.jedi.BaseJediViewModel$d */
    static final class C49546d extends C52712l implements C52671b<C49555b<? extends A>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C52671b f124299a;

        C49546d(C52671b bVar) {
            this.f124299a = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C49555b bVar = (C49555b) obj;
            C52711k.m112240b(bVar, "it");
            bVar.mo97467a(new C52671b<A, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C49546d f124300a;

                {
                    this.f124300a = r1;
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    this.f124300a.f124299a.invoke(obj);
                    return C52860x.f131107a;
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public final S mo97464a(C0184k kVar) {
        C52711k.m112240b(kVar, "lifecycleOwner");
        return (C11932s) new C49544b(kVar).mo22552a(this, C49543a.f124296a);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public <A> C1690c m106897b(C0184k kVar, C52771j<S, ? extends C49555b<? extends A>> jVar, C11934u<C11937x<C49555b<A>>> uVar, C52671b<? super A, C52860x> bVar) {
        C52711k.m112240b(kVar, "lifecycleOwner");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(bVar, "subscriber");
        return m106895a(kVar, jVar, uVar, new C49546d(bVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public <A> C1690c m106895a(C0184k kVar, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52671b<? super A, C52860x> bVar) {
        C52711k.m112240b(kVar, "lifecycleOwner");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(bVar, "subscriber");
        C52671b cVar = new C49545c(bVar);
        C52711k.m112240b(kVar, "lifecycleOwner");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(cVar, "subscriber");
        C0176h lifecycle = kVar.getLifecycle();
        C52711k.m112236a((Object) lifecycle, "lifecycleOwner.lifecycle");
        if (lifecycle.mo323a() == C0178b.DESTROYED) {
            C1690c j = C2201v.m6610b().mo6551j();
            C52711k.m112236a((Object) j, "Observable.empty<Int>().subscribe()");
            return j;
        }
        C1690c a = mo22524a(jVar, uVar, cVar);
        kVar.getLifecycle().mo324a(new BaseJediViewModel$selectSubscribe$2(a));
        return a;
    }
}
