package com.p683ss.android.ugc.gamora.recorder.p2480n;

import android.arch.lifecycle.C0184k;
import com.bytedance.als.C2759d;
import com.bytedance.als.C2760e;
import com.bytedance.als.C2762f;
import com.bytedance.als.C2764h;
import com.bytedance.als.C2765i;
import com.bytedance.als.C2767k;
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
import com.bytedance.p780m.C12356a;
import com.bytedance.p780m.C12361b;
import com.bytedance.scene.C12924i;
import com.bytedance.scene.group.C12896b;
import com.bytedance.scene.ktx.C12931a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.shortvideo.p2203g.C43859a;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.ugc.gamora.recorder.p2467d.C49648a;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p069b.C1690c;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.gamora.recorder.n.a */
public final class C49904a extends C2764h<C49912d> implements C12356a, C49548a, C49912d {

    /* renamed from: a */
    public final C49912d f125052a = this;

    /* renamed from: b */
    public final C43859a f125053b = ((C43859a) mo23370j().mo23373a(C43859a.class, (String) null));

    /* renamed from: c */
    public final C49648a f125054c = ((C49648a) mo23370j().mo23373a(C49648a.class, (String) null));

    /* renamed from: d */
    public final C2760e<Boolean> f125055d = new C2760e<>(Boolean.valueOf(C39618d.f101151O.mo83117a(C40796a.SpeedPanelOpen)));

    /* renamed from: e */
    public final C2765i<Integer> f125056e = new C2765i<>();

    /* renamed from: f */
    public final C12896b f125057f;

    /* renamed from: g */
    private final C2762f<Integer> f125058g = this.f125056e;

    /* renamed from: h */
    private final C12361b f125059h;

    /* renamed from: com.ss.android.ugc.gamora.recorder.n.a$a */
    static final class C49905a<T> implements C2767k<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49904a f125060a;

        C49905a(C49904a aVar) {
            this.f125060a = aVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            Boolean bool = (Boolean) obj;
            C52711k.m112236a((Object) bool, "it");
            if (bool.booleanValue()) {
                C12896b bVar = this.f125060a.f125057f;
                String str = "RecordSpeedGroupScene";
                C52711k.m112240b(bVar, "$this$exist");
                C52711k.m112240b(str, "tag");
                if (bVar.mo24388a(str) != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    this.f125060a.f125057f.mo24389a((int) R.id.c_q, (C12924i) new C49907b(this.f125060a.f125053b.mo89401d()), "RecordSpeedGroupScene");
                    C39618d.f101151O.mo83116a(C40796a.SpeedPanelOpen, true);
                    this.f125060a.f125056e.mo7350a(Integer.valueOf(0));
                    this.f125060a.f125054c.mo97552a(false);
                }
            } else {
                C12896b bVar2 = this.f125060a.f125057f;
                String str2 = "RecordSpeedGroupScene";
                C52711k.m112240b(bVar2, "$this$remove");
                C52711k.m112240b(str2, "tag");
                C12924i a = bVar2.mo24388a(str2);
                if (a != null) {
                    bVar2.mo24399b(a);
                }
                C39618d.f101151O.mo83116a(C40796a.SpeedPanelOpen, false);
                this.f125060a.f125056e.mo7350a(Integer.valueOf(8));
                this.f125060a.f125054c.mo97552a(true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.n.a$b */
    static final class C49906b<T> implements C2767k<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49904a f125061a;

        C49906b(C49904a aVar) {
            this.f125061a = aVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C52711k.m112236a((Object) bool, "it");
            if (bool.booleanValue()) {
                Object a = this.f125061a.f125055d.mo7351a();
                C52711k.m112236a(a, "speedPanelShow.value");
                if (((Boolean) a).booleanValue()) {
                    C12931a.m25973a(this.f125061a.f125057f, "RecordSpeedGroupScene");
                }
            } else {
                C12931a.m25974b(this.f125061a.f125057f, "RecordSpeedGroupScene");
            }
        }
    }

    /* renamed from: j */
    public final C12361b mo23370j() {
        return this.f125059h;
    }

    /* renamed from: k */
    public final C2762f<Integer> mo97722k() {
        return this.f125058g;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2759d mo7353a() {
        return this.f125052a;
    }

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

    public final void bO_() {
        super.bO_();
        C0184k kVar = this;
        this.f125055d.mo7352a(kVar, new C49905a(this));
        this.f125053b.mo89399c().mo7352a(kVar, new C49906b(this));
    }

    /* renamed from: a */
    public final void mo97721a(boolean z) {
        this.f125055d.mo7345a(Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R mo22552a(VM1 vm1, C52671b<? super S1, ? extends R> bVar) {
        C52711k.m112240b(vm1, "viewModel1");
        C52711k.m112240b(bVar, "block");
        return C49549a.m106924a(this, vm1, bVar);
    }

    public C49904a(C12896b bVar, C12361b bVar2) {
        C52711k.m112240b(bVar, "parent");
        C52711k.m112240b(bVar2, "diContainer");
        this.f125057f = bVar;
        this.f125059h = bVar2;
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
