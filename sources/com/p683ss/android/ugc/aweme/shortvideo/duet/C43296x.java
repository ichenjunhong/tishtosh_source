package com.p683ss.android.ugc.aweme.shortvideo.duet;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.C11934u;
import com.bytedance.jedi.arch.C11937x;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p780m.C12356a;
import com.bytedance.p780m.C12361b;
import com.bytedance.scene.group.C12896b;
import com.bytedance.scene.ktx.C12931a;
import com.bytedance.scene.navigation.C12942d;
import com.bytedance.ui_component.C13362b;
import com.p683ss.android.ugc.aweme.p1484bx.C24453c;
import com.p683ss.android.ugc.aweme.p1484bx.C24454d;
import com.p683ss.android.ugc.aweme.shortvideo.gesture.C43866a;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.ugc.gamora.recorder.p2474h.C49822a;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.x */
public final class C43296x extends C13362b<DuetLayoutModeViewModel> implements C12356a, C49548a {

    /* renamed from: d */
    private final C52670a<DuetLayoutModeViewModel> f109472d = C43298b.f109477a;

    /* renamed from: e */
    private final C43275r f109473e = new C43275r(new C43297a(this));

    /* renamed from: f */
    private final C12896b f109474f;

    /* renamed from: g */
    private final C12361b f109475g;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.x$a */
    static final class C43297a extends C52712l implements C52671b<C43866a, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C43296x f109476a;

        C43297a(C43296x xVar) {
            this.f109476a = xVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C43866a aVar = (C43866a) obj;
            C52711k.m112240b(aVar, "it");
            C49822a aVar2 = (C49822a) this.f109476a.mo23370j().mo23375b(C49822a.class, (String) null);
            if (aVar2 != null) {
                aVar2.mo97668a(aVar, 4);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.x$b */
    static final class C43298b extends C52712l implements C52670a<DuetLayoutModeViewModel> {

        /* renamed from: a */
        public static final C43298b f109477a = new C43298b();

        C43298b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new DuetLayoutModeViewModel();
        }
    }

    /* renamed from: j */
    public final C12361b mo23370j() {
        return this.f109475g;
    }

    /* renamed from: k */
    public final C12896b mo24974k() {
        return this.f109474f;
    }

    /* renamed from: m */
    public final C52670a<DuetLayoutModeViewModel> mo24976m() {
        return this.f109472d;
    }

    public final void bO_() {
        super.bO_();
        C12931a.m25972a(mo24974k(), R.id.c_q, this.f109473e, "DuetLayoutModeScene");
    }

    /* renamed from: p */
    public final void mo24979p() {
        C43238c cVar = this.f109473e.f109444s;
        if (cVar != null) {
            cVar.mo50223b(new C24453c());
        }
    }

    /* renamed from: o */
    public final void mo24978o() {
        C43275r rVar = this.f109473e;
        C12942d x = rVar.mo24479x();
        Activity activity = rVar.f33840g_;
        if (activity != null) {
            x.mo24517a((C0184k) (FragmentActivity) activity, rVar.f109446u);
            C43238c cVar = rVar.f109444s;
            if (cVar != null) {
                cVar.mo50219a((C24454d) new C24453c());
                return;
            }
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    public C43296x(C12896b bVar, C12361b bVar2) {
        C52711k.m112240b(bVar, "parentScene");
        C52711k.m112240b(bVar2, "diContainer");
        this.f109474f = bVar;
        this.f109475g = bVar2;
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
}
