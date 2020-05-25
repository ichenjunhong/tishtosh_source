package com.p683ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
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
import com.bytedance.scene.C12924i;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31487c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.p2206j.C43899b;
import com.p683ss.android.ugc.aweme.story.widget.CompositeStoryFilterIndicator;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p069b.C1690c;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.gamora.editor.q */
public final class C49452q extends C12924i implements C49548a {

    /* renamed from: i */
    static final /* synthetic */ C52767h[] f124089i = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49452q.class), "filterIndicator", "getFilterIndicator()Lcom/ss/android/ugc/aweme/story/widget/CompositeStoryFilterIndicator;"))};

    /* renamed from: n */
    public static final C49453a f124090n = new C49453a(null);

    /* renamed from: j */
    public EditFilterIndicatorViewModel f124091j;

    /* renamed from: k */
    final C52668f f124092k = C52732g.m112285a(new C49454b(this));

    /* renamed from: l */
    public ViewStub f124093l;

    /* renamed from: m */
    C31459g f124094m;

    /* renamed from: com.ss.android.ugc.gamora.editor.q$a */
    public static final class C49453a {
        private C49453a() {
        }

        public /* synthetic */ C49453a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.q$b */
    static final class C49454b extends C52712l implements C52670a<CompositeStoryFilterIndicator> {

        /* renamed from: a */
        final /* synthetic */ C49452q f124095a;

        C49454b(C49452q qVar) {
            this.f124095a = qVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ViewStub viewStub = this.f124095a.f124093l;
            if (viewStub == null) {
                C52711k.m112237a("filterIndicatorStub");
            }
            View inflate = viewStub.inflate();
            if (inflate != null) {
                return (CompositeStoryFilterIndicator) inflate;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.story.widget.CompositeStoryFilterIndicator");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.q$c */
    static final class C49455c extends C52712l implements C52682m<C49548a, C31459g, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49452q f124096a;

        C49455c(C49452q qVar) {
            this.f124096a = qVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            String str;
            boolean z;
            C31459g gVar = (C31459g) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(gVar, "it");
            C49452q qVar = this.f124096a;
            EditFilterIndicatorViewModel editFilterIndicatorViewModel = this.f124096a.f124091j;
            if (editFilterIndicatorViewModel == null) {
                C52711k.m112237a("viewModel");
            }
            boolean z2 = editFilterIndicatorViewModel.f123116d;
            C31459g gVar2 = qVar.f124094m;
            if (gVar2 != null) {
                int a = C31487c.m73323a(C39629l.m88232a().mo58584o().mo64334d().mo64415e(), gVar2);
                int a2 = C31487c.m73323a(C39629l.m88232a().mo58584o().mo64334d().mo64415e(), gVar);
                if (a != a2) {
                    EffectCategoryResponse b = C31487c.m73327b(C39629l.m88232a().mo58584o().mo64334d().mo64415e(), gVar2);
                    String str2 = null;
                    if (b != null) {
                        str = b.getName();
                    } else {
                        str = null;
                    }
                    EffectCategoryResponse b2 = C31487c.m73327b(C39629l.m88232a().mo58584o().mo64334d().mo64415e(), gVar);
                    if (b2 != null) {
                        str2 = b2.getName();
                    }
                    CompositeStoryFilterIndicator compositeStoryFilterIndicator = (CompositeStoryFilterIndicator) qVar.f124092k.getValue();
                    String str3 = gVar2.f82325b;
                    C52711k.m112236a((Object) str3, "it.name");
                    C43899b bVar = new C43899b(str3, str);
                    String str4 = gVar.f82325b;
                    C52711k.m112236a((Object) str4, "filterBean.name");
                    C43899b bVar2 = new C43899b(str4, str2);
                    if (a < a2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    compositeStoryFilterIndicator.mo93945a(bVar, bVar2, z, z2);
                    qVar.f124094m = gVar;
                }
            }
            return C52860x.f131107a;
        }
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

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        super.mo24448e(bundle);
        Activity activity = this.f33840g_;
        if (activity != null) {
            JediViewModel a = C48927d.m105736a((FragmentActivity) activity).mo96760a(EditFilterIndicatorViewModel.class);
            C52711k.m112236a((Object) a, "JediViewModelProviders.o…torViewModel::class.java]");
            this.f124091j = (EditFilterIndicatorViewModel) a;
            this.f124094m = C39629l.m88232a().mo58584o().mo64333c().mo64346b(0);
            EditFilterIndicatorViewModel editFilterIndicatorViewModel = this.f124091j;
            if (editFilterIndicatorViewModel == null) {
                C52711k.m112237a("viewModel");
            }
            mo49443b(editFilterIndicatorViewModel, C49456r.f124097a, new C11934u(), new C49455c(this));
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
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

    /* renamed from: a */
    public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.ae2, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.ctx);
        C52711k.m112236a((Object) findViewById, "view.findViewById(R.id.stub_filter_indicator)");
        this.f124093l = (ViewStub) findViewById;
        C52711k.m112236a((Object) inflate, "view");
        return inflate;
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
