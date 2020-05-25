package com.p683ss.android.ugc.gamora.recorder.filter.filter_panel;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import com.bytedance.jedi.arch.internal.C11896i;
import com.bytedance.jedi.p725a.p728c.C11575f;
import com.bytedance.scene.C12924i;
import com.bytedance.ui_component.C13359a.C13361b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.filter.C31415ap;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31496i;
import com.p683ss.android.ugc.aweme.filter.view.internal.C31631c;
import com.p683ss.android.ugc.aweme.filter.view.internal.C31660h;
import com.p683ss.android.ugc.aweme.filter.view.internal.filterbox.C31651a;
import com.p683ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxViewModel;
import com.p683ss.android.ugc.aweme.filter.view.internal.main.C31663a;
import com.p683ss.android.ugc.aweme.filter.view.internal.main.C31711k;
import com.p683ss.android.ugc.aweme.filter.view.p1750a.C31605a;
import com.p683ss.android.ugc.aweme.filter.view.p1750a.C31607c;
import com.p683ss.android.ugc.aweme.filter.view.p1750a.C31608d;
import com.p683ss.android.ugc.aweme.filter.view.p1750a.C31609e;
import com.p683ss.android.ugc.aweme.filter.view.p1750a.C31610f;
import com.p683ss.android.ugc.aweme.filter.view.p1750a.C31615j;
import com.p683ss.android.ugc.aweme.p2345t.C46771c.C46772a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.p683ss.android.ugc.aweme.utils.C47675ap;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p072e.p074b.C1723a;
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
import p2628d.p2648k.C52760c;
import p2628d.p2648k.C52767h;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.f */
public final class C49757f extends C12924i implements C49548a {

    /* renamed from: i */
    static final /* synthetic */ C52767h[] f124765i = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49757f.class), "vm", "getVm()Lcom/ss/android/ugc/gamora/recorder/filter/filter_panel/FilterPanelViewModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49757f.class), "activity", "getActivity()Landroid/support/v7/app/AppCompatActivity;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49757f.class), "shortVideoContextViewModel", "getShortVideoContextViewModel()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContextViewModel;"))};

    /* renamed from: p */
    public static final C49759b f124766p = new C49759b(null);

    /* renamed from: j */
    public C31615j f124767j;

    /* renamed from: k */
    public C31610f f124768k;

    /* renamed from: l */
    public C31660h f124769l;

    /* renamed from: m */
    boolean f124770m;

    /* renamed from: n */
    final C1689b f124771n = new C1689b();

    /* renamed from: o */
    public final C31631c f124772o;

    /* renamed from: q */
    private final C52668f f124773q;

    /* renamed from: r */
    private final C52668f f124774r = C52732g.m112285a(new C49760c(this));

    /* renamed from: s */
    private final C52668f f124775s = C52732g.m112285a(new C49779s(this));

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.f$a */
    public static final class C49758a extends C52712l implements C52670a<FilterPanelViewModel> {

        /* renamed from: a */
        final /* synthetic */ C12924i f124776a;

        /* renamed from: b */
        final /* synthetic */ C52760c f124777b;

        /* renamed from: c */
        final /* synthetic */ C52760c f124778c;

        public C49758a(C12924i iVar, C52760c cVar, C52760c cVar2) {
            this.f124776a = iVar;
            this.f124777b = cVar;
            this.f124778c = cVar2;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r2v4 */
        /* JADX WARNING: type inference failed for: r2v5, types: [com.ss.android.ugc.gamora.recorder.filter.filter_panel.FilterPanelViewModel] */
        /* JADX WARNING: type inference failed for: r2v10, types: [com.ss.android.ugc.gamora.recorder.filter.filter_panel.FilterPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r2v15 */
        /* JADX WARNING: type inference failed for: r2v16 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v10, types: [com.ss.android.ugc.gamora.recorder.filter.filter_panel.FilterPanelViewModel, com.bytedance.jedi.arch.JediViewModel]
          assigns: [com.bytedance.jedi.arch.JediViewModel]
          uses: [com.ss.android.ugc.gamora.recorder.filter.filter_panel.FilterPanelViewModel]
          mth insns count: 45
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 4 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p683ss.android.ugc.gamora.recorder.filter.filter_panel.FilterPanelViewModel invoke() {
            /*
                r5 = this;
                com.bytedance.scene.i r0 = r5.f124776a
                com.bytedance.scene.i r0 = r0.f33835c
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "android.arch.lifecycle.ViewModelProvider.DefaultKey:"
                r1.<init>(r2)
                d.k.c r2 = r5.f124778c
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                java.lang.String r2 = r2.getCanonicalName()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
            L_0x001c:
                if (r0 == 0) goto L_0x0050
                com.bytedance.scene.i r2 = r5.f124776a     // Catch:{ ae -> 0x004d }
                android.arch.lifecycle.y$b r3 = com.bytedance.jedi.arch.C11793b.m24134a()     // Catch:{ ae -> 0x004d }
                android.arch.lifecycle.y r2 = com.bytedance.scene.C12968s.m26081a(r2, r3)     // Catch:{ ae -> 0x004d }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ ae -> 0x004d }
                java.lang.String r4 = "android.arch.lifecycle.ViewModelProvider.DefaultKey:"
                r3.<init>(r4)     // Catch:{ ae -> 0x004d }
                d.k.c r4 = r5.f124778c     // Catch:{ ae -> 0x004d }
                java.lang.Class r4 = p2628d.p2639f.C52669a.m112219a(r4)     // Catch:{ ae -> 0x004d }
                java.lang.String r4 = r4.getCanonicalName()     // Catch:{ ae -> 0x004d }
                r3.append(r4)     // Catch:{ ae -> 0x004d }
                java.lang.String r3 = r3.toString()     // Catch:{ ae -> 0x004d }
                d.k.c r4 = r5.f124777b     // Catch:{ ae -> 0x004d }
                java.lang.Class r4 = p2628d.p2639f.C52669a.m112219a(r4)     // Catch:{ ae -> 0x004d }
                android.arch.lifecycle.x r2 = r2.mo360a(r3, r4)     // Catch:{ ae -> 0x004d }
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2     // Catch:{ ae -> 0x004d }
                goto L_0x0051
            L_0x004d:
                com.bytedance.scene.i r0 = r0.f33835c
                goto L_0x001c
            L_0x0050:
                r2 = 0
            L_0x0051:
                if (r2 != 0) goto L_0x007b
                com.bytedance.scene.i r0 = r5.f124776a
                android.app.Activity r0 = r0.mo24477v()
                if (r0 == 0) goto L_0x0073
                android.support.v4.app.FragmentActivity r0 = (android.support.p030v4.app.FragmentActivity) r0
                android.arch.lifecycle.y$b r2 = com.bytedance.jedi.arch.C11793b.m24134a()
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m441a(r0, r2)
                d.k.c r2 = r5.f124777b
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                r2 = r0
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                goto L_0x007b
            L_0x0073:
                d.u r0 = new d.u
                java.lang.String r1 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
                r0.<init>(r1)
                throw r0
            L_0x007b:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.recorder.filter.filter_panel.C49757f.C49758a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.f$b */
    public static final class C49759b {
        private C49759b() {
        }

        public /* synthetic */ C49759b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.f$c */
    static final class C49760c extends C52712l implements C52670a<AppCompatActivity> {

        /* renamed from: a */
        final /* synthetic */ C49757f f124779a;

        C49760c(C49757f fVar) {
            this.f124779a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Activity v = this.f124779a.mo24477v();
            if (v != null) {
                return (AppCompatActivity) v;
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v7.app.AppCompatActivity");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.f$d */
    static final class C49761d<T> implements C1710e<C11575f<? extends C31459g>> {

        /* renamed from: a */
        final /* synthetic */ C49757f f124780a;

        C49761d(C49757f fVar) {
            this.f124780a = fVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.f124780a.mo97634F().mo97628a((C31459g) ((C11575f) obj).mo22313a());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.f$e */
    static final class C49762e extends C52712l implements C52682m<C11866f, C31459g, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49757f f124781a;

        C49762e(C49757f fVar) {
            this.f124781a = fVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            boolean z;
            C31459g gVar = (C31459g) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C31459g a = C49757f.m107373a(this.f124781a).mo64504a();
            if (!(gVar == null && a == null) && (gVar == null || a == null || gVar.f82324a != a.f82324a)) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                C49757f.m107373a(this.f124781a).mo64505a(gVar);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.f$f */
    static final class C49763f extends C52712l implements C52682m<C49548a, C52860x, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49757f f124782a;

        C49763f(C49757f fVar) {
            this.f124782a = fVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C52860x xVar = (C52860x) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(xVar, "it");
            C49757f.m107374b(this.f124782a).mo64571b();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.f$g */
    static final class C49764g<T> implements C1710e<C11939z<C31609e, Integer, C31459g>> {

        /* renamed from: a */
        final /* synthetic */ C49757f f124783a;

        C49764g(C49757f fVar) {
            this.f124783a = fVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            final C11939z zVar = (C11939z) obj;
            this.f124783a.mo97639a((C52671b<? super AppCompatActivity, C52860x>) new C52671b<AppCompatActivity, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C49764g f124784a;

                {
                    this.f124784a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    C52711k.m112240b((AppCompatActivity) obj, "it");
                    FilterPanelViewModel F = this.f124784a.f124783a.mo97634F();
                    C31459g gVar = (C31459g) zVar.f31626c;
                    int intValue = ((Number) zVar.f31625b).intValue();
                    C52711k.m112240b(gVar, "filterBean");
                    F.mo97630e().mo97569a(gVar, intValue);
                    return C52860x.f131107a;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.f$h */
    static final class C49766h<T> implements C1710e<C31607c> {

        /* renamed from: a */
        final /* synthetic */ C49757f f124786a;

        C49766h(C49757f fVar) {
            this.f124786a = fVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C31607c cVar = (C31607c) obj;
            if (cVar.f82613a == C31608d.TAB_CLICK) {
                EffectCategoryResponse effectCategoryResponse = cVar.f82614b;
                if (effectCategoryResponse != null) {
                    this.f124786a.mo97638a(effectCategoryResponse);
                }
            } else if (cVar.f82613a == C31608d.CLEAR_MODE_CLICK) {
                AVETParameter I = this.f124786a.mo97637I();
                if (I != null) {
                    C39629l.m88232a().mo58567E().mo49430a("select_filter", C42438az.m93209a().mo86526a("creation_id", I.getCreationId()).mo86526a("shoot_way", I.getShootWay()).mo86523a("draft_id", I.getDraftId()).mo86526a("filter_name", "empty").mo86526a("filter_id", "0").mo86526a("content_source", I.getContentSource()).mo86526a("content_type", I.getContentType()).mo86526a("enter_from", "video_shoot_page").f107329a);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.f$i */
    static final class C49767i<T> implements C1710e<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49757f f124787a;

        C49767i(C49757f fVar) {
            this.f124787a = fVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Boolean bool = (Boolean) obj;
            FilterPanelViewModel F = this.f124787a.mo97634F();
            C52711k.m112236a((Object) bool, "it");
            boolean booleanValue = bool.booleanValue();
            F.mo97630e().mo97571a(booleanValue);
            F.mo22530c(new C49736h(booleanValue));
            if (booleanValue) {
                F.mo22533d(C49737i.f124731a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.f$j */
    static final class C49768j<T> implements C1710e<C31605a> {

        /* renamed from: a */
        final /* synthetic */ C49757f f124788a;

        C49768j(C49757f fVar) {
            this.f124788a = fVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            boolean z;
            C31605a aVar = (C31605a) obj;
            FilterPanelViewModel F = this.f124788a.mo97634F();
            C52711k.m112236a((Object) aVar, "event");
            C52711k.m112240b(aVar, "event");
            switch (C49755d.f124763a[aVar.f82610a.ordinal()]) {
                case 1:
                case 2:
                    List list = (List) F.f124714j.mo64415e().mo64418a().getValue();
                    C31459g gVar = null;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                if (((C31459g) next).f82324a == aVar.f82611b.f82392a.f82404a) {
                                    z = true;
                                    continue;
                                } else {
                                    z = false;
                                    continue;
                                }
                                if (z) {
                                    gVar = next;
                                }
                            }
                        }
                        gVar = gVar;
                    }
                    if (gVar != null) {
                        F.mo97628a(gVar);
                        return;
                    } else {
                        F.mo97627a(aVar.f82611b.f82392a.f82404a);
                        return;
                    }
                case 3:
                    F.mo97631f();
                    F.mo22527b(new C49732e(F, aVar));
                    break;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.f$k */
    static final class C49769k<T> implements C1710e<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49757f f124789a;

        C49769k(C49757f fVar) {
            this.f124789a = fVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Boolean bool = (Boolean) obj;
            this.f124789a.mo97634F().mo97631f();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.f$l */
    static final class C49770l<T> implements C1710e<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49757f f124790a;

        C49770l(C49757f fVar) {
            this.f124790a = fVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            if (!((Boolean) obj).booleanValue()) {
                this.f124790a.mo97639a((C52671b<? super AppCompatActivity, C52860x>) new C52671b<AppCompatActivity, C52860x>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C49770l f124791a;

                    {
                        this.f124791a = r1;
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        C52711k.m112240b((AppCompatActivity) obj, "it");
                        this.f124791a.f124790a.mo22552a(this.f124791a.f124790a.mo97634F(), new C52671b<FilterPanelState, C52860x>(this) {

                            /* renamed from: a */
                            final /* synthetic */ C497711 f124792a;

                            {
                                this.f124792a = r1;
                            }

                            public final /* synthetic */ Object invoke(Object obj) {
                                FilterPanelState filterPanelState = (FilterPanelState) obj;
                                C52711k.m112240b(filterPanelState, "it");
                                if (filterPanelState.getUi() instanceof C13361b) {
                                    this.f124792a.f124791a.f124790a.mo97634F().mo97629a(false);
                                }
                                return C52860x.f131107a;
                            }
                        });
                        return C52860x.f131107a;
                    }
                });
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.f$m */
    static final class C49773m extends C52712l implements C52682m<C11866f, Map<EffectCategoryResponse, ? extends List<? extends C31459g>>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49757f f124793a;

        C49773m(C49757f fVar) {
            this.f124793a = fVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Map map = (Map) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(map, "data");
            C49757f.m107373a(this.f124793a).mo64491a(map);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.f$n */
    static final class C49774n extends C52712l implements C52671b<FilterPanelState, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49757f f124794a;

        C49774n(C49757f fVar) {
            this.f124794a = fVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            FilterPanelState filterPanelState = (FilterPanelState) obj;
            C52711k.m112240b(filterPanelState, "it");
            if (filterPanelState.getDisableFilter()) {
                C49757f.m107373a(this.f124794a).mo64508d();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.f$o */
    static final class C49775o extends C52712l implements C52670a<C31615j> {

        /* renamed from: a */
        final /* synthetic */ C49757f f124795a;

        C49775o(C49757f fVar) {
            this.f124795a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C49757f.m107373a(this.f124795a);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.f$p */
    static final class C49776p extends C52712l implements C52670a<C31610f> {

        /* renamed from: a */
        final /* synthetic */ C49757f f124796a;

        C49776p(C49757f fVar) {
            this.f124796a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C31610f fVar = this.f124796a.f124768k;
            if (fVar == null) {
                C52711k.m112237a("filterBoxView");
            }
            return fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.f$q */
    static final class C49777q extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49757f f124797a;

        C49777q(C49757f fVar) {
            this.f124797a = fVar;
            super(0);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x006b, code lost:
            if (r0 == null) goto L_0x006d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke() {
            /*
                r8 = this;
                com.ss.android.ugc.gamora.recorder.filter.filter_panel.f r0 = r8.f124797a
                com.ss.android.ugc.gamora.recorder.filter.filter_panel.FilterPanelViewModel r0 = r0.mo97634F()
                com.ss.android.ugc.gamora.recorder.filter.filter_panel.f r1 = r8.f124797a
                android.support.v7.app.AppCompatActivity r1 = r1.mo97635G()
                r3 = r1
                android.app.Activity r3 = (android.app.Activity) r3
                boolean r1 = r0.f124715k
                r2 = 0
                if (r1 == 0) goto L_0x0025
                com.ss.android.ugc.aweme.port.in.u r1 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
                com.ss.android.ugc.aweme.port.in.aa r1 = r1.mo58593x()
                boolean r1 = r1.mo74282b()
                if (r1 == 0) goto L_0x0023
                goto L_0x0025
            L_0x0023:
                r1 = 0
                goto L_0x0026
            L_0x0025:
                r1 = 1
            L_0x0026:
                if (r1 != 0) goto L_0x0043
                if (r3 == 0) goto L_0x004f
                com.ss.android.ugc.aweme.port.in.u r1 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
                com.ss.android.ugc.aweme.port.in.aa r2 = r1.mo58593x()
                java.lang.String r4 = ""
                java.lang.String r5 = ""
                r6 = 0
                com.ss.android.ugc.gamora.recorder.filter.filter_panel.FilterPanelViewModel$f r1 = new com.ss.android.ugc.gamora.recorder.filter.filter_panel.FilterPanelViewModel$f
                r1.<init>(r0, r3)
                r7 = r1
                com.ss.android.ugc.aweme.port.in.aa$a r7 = (com.p683ss.android.ugc.aweme.port.p2082in.C39527aa.C39528a) r7
                r2.mo74276a(r3, r4, r5, r6, r7)
                goto L_0x004f
            L_0x0043:
                com.ss.android.ugc.aweme.filter.repository.a.l r1 = r0.f124714j
                r1.mo64411a(r2)
                com.ss.android.ugc.gamora.recorder.filter.filter_panel.FilterPanelViewModel$g r1 = com.p683ss.android.ugc.gamora.recorder.filter.filter_panel.FilterPanelViewModel.C49735g.f124729a
                d.f.a.b r1 = (p2628d.p2639f.p2640a.C52671b) r1
                r0.mo22530c(r1)
            L_0x004f:
                com.ss.android.ugc.gamora.recorder.filter.filter_panel.f r0 = r8.f124797a
                com.ss.android.ugc.aweme.port.in.u r1 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
                com.ss.android.ugc.aweme.port.in.as r1 = r1.mo58567E()
                java.lang.String r2 = "click_filter_box"
                com.ss.android.ugc.aweme.app.f.d r3 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r4 = "enter_from"
                com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r0 = r0.mo97637I()
                if (r0 == 0) goto L_0x006d
                java.lang.String r0 = r0.getShootWay()
                if (r0 != 0) goto L_0x006f
            L_0x006d:
                java.lang.String r0 = ""
            L_0x006f:
                com.ss.android.ugc.aweme.app.f.d r0 = r3.mo47829a(r4, r0)
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
                r1.mo49430a(r2, r0)
                d.x r0 = p2628d.C52860x.f131107a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.recorder.filter.filter_panel.C49757f.C49777q.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.f$r */
    static final class C49778r extends C52712l implements C52671b<Context, C31415ap> {

        /* renamed from: a */
        public static final C49778r f124798a = new C49778r();

        C49778r() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Context context = (Context) obj;
            C52711k.m112240b(context, "it");
            return new C31415ap(context);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.f$s */
    static final class C49779s extends C52712l implements C52670a<ShortVideoContextViewModel> {

        /* renamed from: a */
        final /* synthetic */ C49757f f124799a;

        C49779s(C49757f fVar) {
            this.f124799a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            AppCompatActivity G = this.f124799a.mo97635G();
            if (G == null) {
                return null;
            }
            if (G != null) {
                return (ShortVideoContextViewModel) C0214z.m440a((FragmentActivity) G).mo359a(ShortVideoContextViewModel.class);
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v7.app.AppCompatActivity");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.f$t */
    static final class C49780t extends C52712l implements C52671b<AppCompatActivity, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49757f f124800a;

        C49780t(C49757f fVar) {
            this.f124800a = fVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((AppCompatActivity) obj, "activity");
            ShortVideoContextViewModel H = this.f124800a.mo97636H();
            if (H != null) {
                ShortVideoContext shortVideoContext = H.f107134a;
                if (shortVideoContext != null) {
                    C26890h.m65011a("click_modify_entrance", C23089d.m56640a().mo47829a("creation_id", shortVideoContext.f107131x).mo47829a("shoot_way", shortVideoContext.f107132y).mo47829a("content_source", shortVideoContext.mo86370k().getContentSource()).mo47829a("content_type", shortVideoContext.mo86370k().getContentType()).mo47829a("enter_from", "video_shoot_page").mo47829a("scene_id", "1004").f61491a);
                    C49757f fVar = this.f124800a;
                    if (!fVar.f124770m) {
                        C52711k.m112240b(fVar, "$this$createFilterView");
                        View findViewById = fVar.f33834b.findViewById(R.id.c_h);
                        C52711k.m112236a((Object) findViewById, "view.findViewById(R.id.record_filter_extra)");
                        C0184k kVar = fVar;
                        C46772a aVar = new C46772a(fVar, (ViewGroup) findViewById, kVar, C39629l.m88232a().mo58584o().mo64334d(), new C31663a(C39629l.m88232a().mo58584o().mo64335e(), C39629l.m88232a().mo58584o().mo64334d()), fVar.f124772o, true);
                        fVar.f124767j = aVar;
                        fVar.mo22552a(fVar.mo97634F(), new C49774n(fVar));
                        C52671b bVar = C49778r.f124798a;
                        View findViewById2 = fVar.f33834b.findViewById(R.id.c_i);
                        C52711k.m112236a((Object) findViewById2, "view.findViewById(R.id.record_filter_extra2)");
                        ViewGroup viewGroup = (ViewGroup) findViewById2;
                        C31496i a = C39629l.m88232a().mo58584o().mo64336f().mo64402a();
                        C52711k.m112240b(viewGroup, "root");
                        C52711k.m112240b(kVar, "lifecycleOwner");
                        C52711k.m112240b(a, "repository");
                        fVar.f124768k = new C31651a(viewGroup, kVar, new FilterBoxViewModel(kVar, a), bVar);
                        fVar.f124769l = new C31711k(new C49775o(fVar), new C49776p(fVar), C47675ap.m103187a((Activity) fVar.mo97635G()), new C49777q(fVar));
                        C1689b bVar2 = fVar.f124771n;
                        C31615j jVar = fVar.f124767j;
                        if (jVar == null) {
                            C52711k.m112237a("filterView");
                        }
                        bVar2.mo6181a(jVar.mo64510f().mo6505a((C1710e<? super T>) new C49761d<Object>(fVar), C1723a.f5846e));
                        C1689b bVar3 = fVar.f124771n;
                        C31615j jVar2 = fVar.f124767j;
                        if (jVar2 == null) {
                            C52711k.m112237a("filterView");
                        }
                        bVar3.mo6181a(jVar2.mo64509e().mo6505a((C1710e<? super T>) new C49764g<Object>(fVar), C1723a.f5846e));
                        C1689b bVar4 = fVar.f124771n;
                        C31615j jVar3 = fVar.f124767j;
                        if (jVar3 == null) {
                            C52711k.m112237a("filterView");
                        }
                        bVar4.mo6181a(jVar3.mo64512h().mo6505a((C1710e<? super T>) new C49766h<Object>(fVar), C1723a.f5846e));
                        C1689b bVar5 = fVar.f124771n;
                        C31615j jVar4 = fVar.f124767j;
                        if (jVar4 == null) {
                            C52711k.m112237a("filterView");
                        }
                        bVar5.mo6181a(jVar4.mo64511g().mo6505a((C1710e<? super T>) new C49767i<Object>(fVar), C1723a.f5846e));
                        C1689b bVar6 = fVar.f124771n;
                        C31610f fVar2 = fVar.f124768k;
                        if (fVar2 == null) {
                            C52711k.m112237a("filterBoxView");
                        }
                        bVar6.mo6181a(fVar2.mo64488c().mo6505a((C1710e<? super T>) new C49768j<Object>(fVar), C1723a.f5846e));
                        C1689b bVar7 = fVar.f124771n;
                        C31610f fVar3 = fVar.f124768k;
                        if (fVar3 == null) {
                            C52711k.m112237a("filterBoxView");
                        }
                        bVar7.mo6181a(fVar3.mo64489d().mo6505a((C1710e<? super T>) new C49769k<Object>(fVar), C1723a.f5846e));
                        C1689b bVar8 = fVar.f124771n;
                        C31660h hVar = fVar.f124769l;
                        if (hVar == null) {
                            C52711k.m112237a("combiner");
                        }
                        bVar8.mo6181a(hVar.mo64573d().mo6505a((C1710e<? super T>) new C49770l<Object>(fVar), C1723a.f5846e));
                        C49757f fVar4 = fVar;
                        fVar4.mo22547a(fVar.mo97634F(), C49783i.f124803a, C11896i.m24255a(), new C49773m(fVar));
                        fVar4.mo22547a(fVar.mo97634F(), C49781g.f124801a, C11896i.m24255a(), new C49762e(fVar));
                        fVar4.mo49444c(fVar.mo97634F(), C49782h.f124802a, new C11934u(), new C49763f(fVar));
                        fVar.f124770m = true;
                    }
                    C49757f.m107374b(this.f124800a).mo64570a();
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: F */
    public final FilterPanelViewModel mo97634F() {
        return (FilterPanelViewModel) this.f124773q.getValue();
    }

    /* renamed from: G */
    public final AppCompatActivity mo97635G() {
        return (AppCompatActivity) this.f124774r.getValue();
    }

    /* renamed from: H */
    public final ShortVideoContextViewModel mo97636H() {
        return (ShortVideoContextViewModel) this.f124775s.getValue();
    }

    /* renamed from: a */
    public final void mo97638a(EffectCategoryResponse effectCategoryResponse) {
        AVETParameter I = mo97637I();
        if (I != null) {
            C47702b.f120193a.mo94984a("click_filter_tab", C23089d.m56640a().mo47829a("creation_id", I.getCreationId()).mo47829a("shoot_way", I.getShootWay()).mo47829a("tab_name", effectCategoryResponse.getName()).mo47829a("content_source", I.getContentSource()).mo47829a("content_type", I.getContentType()).mo47829a("enter_from", "video_shoot_page").mo47829a("scene_id", "1002").f61491a);
        }
    }

    /* renamed from: a */
    public final void mo97639a(C52671b<? super AppCompatActivity, C52860x> bVar) {
        AppCompatActivity G = mo97635G();
        if (G == null) {
            return;
        }
        if (G != null) {
            bVar.invoke(G);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v7.app.AppCompatActivity");
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

    /* access modifiers changed from: 0000 */
    /* renamed from: I */
    public final AVETParameter mo97637I() {
        ShortVideoContextViewModel H = mo97636H();
        C52711k.m112236a((Object) H, "shortVideoContextViewModel");
        ShortVideoContext shortVideoContext = H.f107134a;
        C52711k.m112236a((Object) shortVideoContext, "shortVideoContextViewModel.shortVideoContext");
        return shortVideoContext.mo86370k();
    }

    /* renamed from: a */
    public static final /* synthetic */ C31615j m107373a(C49757f fVar) {
        C31615j jVar = fVar.f124767j;
        if (jVar == null) {
            C52711k.m112237a("filterView");
        }
        return jVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ C31660h m107374b(C49757f fVar) {
        C31660h hVar = fVar.f124769l;
        if (hVar == null) {
            C52711k.m112237a("combiner");
        }
        return hVar;
    }

    public C49757f(C31631c cVar) {
        C52711k.m112240b(cVar, "filterIntensitySource");
        this.f124772o = cVar;
        C52760c a = C52728w.m112245a(FilterPanelViewModel.class);
        this.f124773q = C52732g.m112285a(new C49758a(this, a, a));
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
        View inflate = layoutInflater.inflate(R.layout.atv, viewGroup, false);
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
