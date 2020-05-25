package com.p683ss.android.ugc.aweme.tools.live;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.als.ApiCenter;
import com.bytedance.als.ApiCenter.C2755a;
import com.bytedance.als.C2767k;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
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
import com.bytedance.scene.ktx.C12932b;
import com.p683ss.android.ugc.asve.recorder.p1245b.C20426a;
import com.p683ss.android.ugc.aweme.common.p1595g.C26888e;
import com.p683ss.android.ugc.aweme.port.internal.C39655e;
import com.p683ss.android.ugc.aweme.port.internal.C39655e.C39656a;
import com.p683ss.android.ugc.aweme.port.internal.C39666o;
import com.p683ss.android.ugc.aweme.port.p2082in.C39564aq;
import com.p683ss.android.ugc.aweme.port.p2082in.C39564aq.C39565a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p683ss.android.ugc.aweme.shortvideo.C42423an;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.p2203g.C43859a;
import com.p683ss.android.ugc.aweme.shortvideo.p2217n.C44321a;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a;
import com.p683ss.android.ugc.aweme.tools.C47093m;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49577b;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49604i;
import com.p683ss.android.ugc.tools.utils.C50203g;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p064c.p065a.p069b.C1690c;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52855s;
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

/* renamed from: com.ss.android.ugc.aweme.tools.live.a */
public final class C47069a extends C49604i implements C49548a {

    /* renamed from: i */
    static final /* synthetic */ C52767h[] f118860i = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C47069a.class), "liveModule", "getLiveModule()Lcom/ss/android/ugc/aweme/port/internal/ILiveModule;"))};

    /* renamed from: k */
    public static final C47070a f118861k = new C47070a(null);

    /* renamed from: j */
    public RecordLiveViewModel f118862j;

    /* renamed from: l */
    private final C52668f f118863l = C52732g.m112285a(new C47074d(this));

    /* renamed from: m */
    private C39565a f118864m;

    /* renamed from: com.ss.android.ugc.aweme.tools.live.a$a */
    public static final class C47070a {
        private C47070a() {
        }

        public /* synthetic */ C47070a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.a$b */
    public static final class C47071b implements C39656a {

        /* renamed from: a */
        final /* synthetic */ C47069a f118865a;

        /* renamed from: b */
        final /* synthetic */ C39655e f118866b;

        /* renamed from: com.ss.android.ugc.aweme.tools.live.a$b$a */
        static final class C47072a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C47071b f118867a;

            C47072a(C47071b bVar) {
                this.f118867a = bVar;
            }

            public final void run() {
                ApiCenter a = C2755a.m7851a(C12932b.m25979b(this.f118867a.f118865a));
                ((C43859a) a.mo7339a(C43859a.class)).mo89400c(false);
                ((C49577b) a.mo7339a(C49577b.class)).mo97483a(true);
            }
        }

        /* renamed from: c */
        private boolean m102213c() {
            if (C47069a.m102189a(this.f118865a).f118859d == null) {
                return false;
            }
            ShortVideoContext shortVideoContext = C47069a.m102189a(this.f118865a).f118859d;
            if (shortVideoContext == null) {
                C52711k.m112234a();
            }
            if (!shortVideoContext.mo86365f()) {
                ShortVideoContext shortVideoContext2 = C47069a.m102189a(this.f118865a).f118859d;
                if (shortVideoContext2 == null) {
                    C52711k.m112234a();
                }
                if (!shortVideoContext2.mo86366g()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public final void mo80736a() {
            if (m102213c() && this.f118866b.mo74809a() != null) {
                View a = this.f118866b.mo74809a();
                if (a == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) a, "module.liveEntryView!!");
                a.setVisibility(8);
            }
        }

        /* renamed from: b */
        public final void mo80737b() {
            if (m102213c() && this.f118866b.mo74809a() != null) {
                View a = this.f118866b.mo74809a();
                if (a == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) a, "module.liveEntryView!!");
                a.setVisibility(0);
                C12932b.m25978a(this.f118865a, new C47072a(this), 200);
            }
        }

        C47071b(C47069a aVar, C39655e eVar) {
            this.f118865a = aVar;
            this.f118866b = eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.a$c */
    static final class C47073c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C47069a f118868a;

        /* renamed from: b */
        final /* synthetic */ C39655e f118869b;

        C47073c(C47069a aVar, C39655e eVar) {
            this.f118868a = aVar;
            this.f118869b = eVar;
        }

        public final void onClick(View view) {
            C47093m mVar;
            ClickInstrumentation.onClick(view);
            C45004a a = C47069a.m102189a(this.f118868a).mo94358a();
            if (a.mo91315U() == 0) {
                mVar = C47093m.m102238a();
                C52711k.m112236a((Object) mVar, "FrontRearChangeEvent.toFront()");
                ImageView b = this.f118869b.mo74815b();
                if (b == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) b, "module.liveCameraReverseBtn!!");
                b.setSelected(true);
            } else {
                mVar = C47093m.m102239b();
                C52711k.m112236a((Object) mVar, "FrontRearChangeEvent.toRear()");
                ImageView b2 = this.f118869b.mo74815b();
                if (b2 == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) b2, "module.liveCameraReverseBtn!!");
                b2.setSelected(false);
            }
            a.mo91353b(mVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.a$d */
    static final class C47074d extends C52712l implements C52670a<C39655e> {

        /* renamed from: a */
        final /* synthetic */ C47069a f118870a;

        C47074d(C47069a aVar) {
            this.f118870a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            boolean z;
            C39655e c = C39618d.f101180u.mo74213c();
            C47069a aVar = this.f118870a;
            C52711k.m112236a((Object) c, "this");
            Context context = aVar.f33840g_;
            RecordLiveViewModel recordLiveViewModel = aVar.f118862j;
            if (recordLiveViewModel == null) {
                C52711k.m112237a("recordLiveViewModel");
            }
            c.mo74810a(context, recordLiveViewModel.f118856a);
            boolean z2 = false;
            c.mo74814a(new View[0]);
            c.mo74813a((C39656a) new C47071b(aVar, c));
            if (c.mo74815b() != null) {
                ImageView b = c.mo74815b();
                if (b == null) {
                    C52711k.m112234a();
                }
                b.setOnClickListener(new C47073c(aVar, c));
            }
            RecordLiveViewModel recordLiveViewModel2 = aVar.f118862j;
            if (recordLiveViewModel2 == null) {
                C52711k.m112237a("recordLiveViewModel");
            }
            C45004a a = recordLiveViewModel2.mo94358a();
            C39564aq aqVar = C39618d.f101180u;
            if (a.mo91315U() == 1) {
                z = true;
            } else {
                z = false;
            }
            aqVar.mo74211b(z);
            if (c.mo74815b() != null) {
                ImageView b2 = c.mo74815b();
                if (b2 == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) b2, "module.liveCameraReverseBtn!!");
                if (a.mo91315U() != 0) {
                    z2 = true;
                }
                b2.setSelected(z2);
            }
            return c;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.a$e */
    static final class C47075e<T> implements C2767k<C52855s<? extends Integer, ? extends Integer, ? extends Intent>> {

        /* renamed from: a */
        final /* synthetic */ C47069a f118871a;

        C47075e(C47069a aVar) {
            this.f118871a = aVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C52855s sVar = (C52855s) obj;
            ((Number) sVar.component1()).intValue();
            ((Number) sVar.component2()).intValue();
            sVar.component3();
            this.f118871a.mo94359I();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.a$f */
    static final class C47076f implements C39565a {

        /* renamed from: a */
        final /* synthetic */ C47069a f118872a;

        C47076f(C47069a aVar) {
            this.f118872a = aVar;
        }

        /* renamed from: a */
        public final void mo80656a() {
            C50203g.m108358a("OnLiveStartListener#onStartLive");
            RecordLiveViewModel a = C47069a.m102189a(this.f118872a);
            C20426a aVar = a.f118858c;
            if (aVar == null) {
                C52711k.m112237a("mediaController");
            }
            aVar.mo43302b();
            a.mo94358a().mo91343ac();
        }
    }

    /* renamed from: F */
    public final String mo49446F() {
        return "RecordLiveScene";
    }

    /* renamed from: I */
    public final C39655e mo94359I() {
        return (C39655e) this.f118863l.getValue();
    }

    /* renamed from: M */
    public final boolean mo94360M() {
        mo94359I();
        return false;
    }

    public final boolean bd_() {
        mo94359I();
        return false;
    }

    public final boolean be_() {
        mo94359I();
        return false;
    }

    public final boolean bf_() {
        mo94359I();
        return false;
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

    /* renamed from: p */
    public final void mo24469p() {
        C39564aq aqVar = C39618d.f101180u;
        C39565a aVar = this.f118864m;
        if (aVar == null) {
            C52711k.m112237a("mLiveStartListener");
        }
        aqVar.mo74210b(aVar);
        super.mo24469p();
    }

    /* renamed from: H */
    public final void mo49448H() {
        C39655e I = mo94359I();
        View view = this.f33834b;
        if (view != null) {
            I.mo74811a((ViewGroup) view);
            C39564aq aqVar = C39618d.f101180u;
            C39565a aVar = this.f118864m;
            if (aVar == null) {
                C52711k.m112237a("mLiveStartListener");
            }
            aqVar.mo74210b(aVar);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: G */
    public final void mo49447G() {
        String str;
        boolean z;
        mo94359I();
        Bundle bundle = new Bundle();
        String str2 = "shoot_way";
        RecordLiveViewModel recordLiveViewModel = this.f118862j;
        if (recordLiveViewModel == null) {
            C52711k.m112237a("recordLiveViewModel");
        }
        ShortVideoContext shortVideoContext = recordLiveViewModel.f118859d;
        if (shortVideoContext != null) {
            str = shortVideoContext.f107132y;
        } else {
            str = null;
        }
        bundle.putString(str2, str);
        bundle.putString("video_id", C42423an.m93185a());
        C43214dh a = C43214dh.m94817a();
        C52711k.m112236a((Object) a, "PublishManager.inst()");
        List<AVChallenge> list = a.f109287b;
        C52711k.m112236a((Object) list, "PublishManager.inst().challenges");
        if (!list.isEmpty()) {
            C43214dh a2 = C43214dh.m94817a();
            C52711k.m112236a((Object) a2, "PublishManager.inst()");
            String b = C39629l.m88232a().mo58566D().mo34889b((AVChallenge) a2.f109287b.get(0));
            C52711k.m112236a((Object) b, "CameraClient.getAPI().ge…son().toJson(avChallenge)");
            bundle.putString("challenge", b);
        }
        C39655e I = mo94359I();
        View view = this.f33834b;
        if (view != null) {
            I.mo74812a((ViewGroup) view, bundle);
            RecordLiveViewModel recordLiveViewModel2 = this.f118862j;
            if (recordLiveViewModel2 == null) {
                C52711k.m112237a("recordLiveViewModel");
            }
            ShortVideoContext shortVideoContext2 = recordLiveViewModel2.f118859d;
            if (shortVideoContext2 != null && shortVideoContext2.f107119l.isEmpty()) {
                C39564aq aqVar = C39618d.f101180u;
                C39565a aVar = this.f118864m;
                if (aVar == null) {
                    C52711k.m112237a("mLiveStartListener");
                }
                aqVar.mo74207a(aVar);
            }
            RecordLiveViewModel recordLiveViewModel3 = this.f118862j;
            if (recordLiveViewModel3 == null) {
                C52711k.m112237a("recordLiveViewModel");
            }
            ShortVideoContext shortVideoContext3 = recordLiveViewModel3.f118859d;
            if (shortVideoContext3 != null) {
                z = shortVideoContext3.f107056aH;
            } else {
                z = false;
            }
            if (C44321a.m97076a(z, be_())) {
                Effect effect = C44321a.f112187e.mo90200a().f112189b;
                int i = C44321a.f112187e.mo90200a().f112190c;
                if (!(effect == null || i == -1)) {
                    mo94359I();
                }
                ((C49577b) C2755a.m7851a(C12932b.m25979b(this)).mo7339a(C49577b.class)).mo97481a(-1);
                boolean g = ((C39666o) C26888e.m65000a(this.f33840g_, C39666o.class)).mo48466g(false);
                if ((i == 1 || i == 2) && !g) {
                    ((C39666o) C26888e.m65000a(this.f33840g_, C39666o.class)).mo48465f(true);
                    return;
                }
                return;
            }
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: a */
    public static final /* synthetic */ RecordLiveViewModel m102189a(C47069a aVar) {
        RecordLiveViewModel recordLiveViewModel = aVar.f118862j;
        if (recordLiveViewModel == null) {
            C52711k.m112237a("recordLiveViewModel");
        }
        return recordLiveViewModel;
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        super.mo24448e(bundle);
        ((C43859a) C2755a.m7851a(C12932b.m25979b(this)).mo7339a(C43859a.class)).mo89405f().mo7349a(this, new C47075e(this));
        Activity activity = this.f33840g_;
        if (activity != null) {
            C0209x a = C0214z.m440a((FragmentActivity) activity).mo359a(RecordLiveViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…iveViewModel::class.java)");
            this.f118862j = (RecordLiveViewModel) a;
            this.f118864m = new C47076f(this);
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
    public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.atw, viewGroup, false);
        C52711k.m112236a((Object) inflate, "inflater.inflate(R.layou…_scene, container, false)");
        return inflate;
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
