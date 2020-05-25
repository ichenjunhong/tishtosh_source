package com.p683ss.android.ugc.aweme.shortvideo.duet;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0214z;
import android.arch.lifecycle.LiveData;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
import android.support.p043v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.jedi.arch.C11787a;
import com.bytedance.jedi.arch.C11788aa;
import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.arch.C11866f;
import com.bytedance.jedi.arch.C11910j;
import com.bytedance.jedi.arch.C11931r;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.C11934u;
import com.bytedance.jedi.arch.C11935v;
import com.bytedance.jedi.arch.C11937x;
import com.bytedance.jedi.arch.C11938y;
import com.bytedance.jedi.arch.C11939z;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.C12924i;
import com.bytedance.scene.navigation.C12961g;
import com.p683ss.android.ugc.aweme.effectplatform.C29242c;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a.C37722a;
import com.p683ss.android.ugc.aweme.p1484bx.C24458h;
import com.p683ss.android.ugc.aweme.p1484bx.C24458h.C24459a;
import com.p683ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;
import com.p683ss.android.ugc.aweme.shortvideo.C42562ct;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.gesture.C43866a;
import com.p683ss.android.ugc.aweme.shortvideo.gesture.C43866a.C43867a;
import com.p683ss.android.ugc.aweme.shortvideo.messagecenter.C43992a;
import com.p683ss.android.ugc.aweme.shortvideo.messagecenter.MessageCenterViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.p2177b.C42443a;
import com.p683ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtPanelRelativeLayout;
import com.p683ss.android.ugc.aweme.tools.C47336q;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.ugc.gamora.p2457a.C48923a;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
import p2628d.p2648k.C52760c;
import p2628d.p2648k.C52767h;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.r */
public final class C43275r extends C12924i implements C49548a {

    /* renamed from: A */
    public static final C43277b f109424A = new C43277b(null);

    /* renamed from: i */
    static final /* synthetic */ C52767h[] f109425i = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C43275r.class), "duetLayoutModeViewModel", "getDuetLayoutModeViewModel()Lcom/ss/android/ugc/aweme/shortvideo/duet/DuetLayoutModeViewModel;"))};

    /* renamed from: B */
    private View f109426B;

    /* renamed from: C */
    private AVDmtPanelRelativeLayout f109427C;

    /* renamed from: D */
    private AVDmtPanelRecyleView f109428D;

    /* renamed from: E */
    private View f109429E;

    /* renamed from: F */
    private View f109430F;

    /* renamed from: G */
    private View f109431G;

    /* renamed from: H */
    private View f109432H;

    /* renamed from: I */
    private final C52668f f109433I;

    /* renamed from: J */
    private C29252f f109434J;

    /* renamed from: j */
    public int f109435j;

    /* renamed from: k */
    public int f109436k = 1;

    /* renamed from: l */
    public C48923a f109437l;

    /* renamed from: m */
    public C42443a f109438m;

    /* renamed from: n */
    public RelativeLayout f109439n;

    /* renamed from: o */
    public ImageView f109440o;

    /* renamed from: p */
    public DmtTextView f109441p;

    /* renamed from: q */
    DmtStatusView f109442q;

    /* renamed from: r */
    C43267n f109443r;

    /* renamed from: s */
    C43238c f109444s;

    /* renamed from: t */
    public C43246f f109445t;

    /* renamed from: u */
    final C12961g f109446u;

    /* renamed from: v */
    public final C52682m<Float, Float, C52860x> f109447v;

    /* renamed from: w */
    public final C52670a<C52860x> f109448w;

    /* renamed from: x */
    public boolean f109449x;

    /* renamed from: y */
    float f109450y;

    /* renamed from: z */
    public final C52671b<C43866a, C52860x> f109451z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.r$a */
    public static final class C43276a extends C52712l implements C52670a<DuetLayoutModeViewModel> {

        /* renamed from: a */
        final /* synthetic */ C12924i f109452a;

        /* renamed from: b */
        final /* synthetic */ C52760c f109453b;

        /* renamed from: c */
        final /* synthetic */ C52760c f109454c;

        public C43276a(C12924i iVar, C52760c cVar, C52760c cVar2) {
            this.f109452a = iVar;
            this.f109453b = cVar;
            this.f109454c = cVar2;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r2v4 */
        /* JADX WARNING: type inference failed for: r2v5, types: [com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutModeViewModel] */
        /* JADX WARNING: type inference failed for: r2v10, types: [com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutModeViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r2v15 */
        /* JADX WARNING: type inference failed for: r2v16 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v10, types: [com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutModeViewModel, com.bytedance.jedi.arch.JediViewModel]
          assigns: [com.bytedance.jedi.arch.JediViewModel]
          uses: [com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutModeViewModel]
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
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 4 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p683ss.android.ugc.aweme.shortvideo.duet.DuetLayoutModeViewModel invoke() {
            /*
                r5 = this;
                com.bytedance.scene.i r0 = r5.f109452a
                com.bytedance.scene.i r0 = r0.f33835c
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "android.arch.lifecycle.ViewModelProvider.DefaultKey:"
                r1.<init>(r2)
                d.k.c r2 = r5.f109454c
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                java.lang.String r2 = r2.getCanonicalName()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
            L_0x001c:
                if (r0 == 0) goto L_0x0050
                com.bytedance.scene.i r2 = r5.f109452a     // Catch:{ ae -> 0x004d }
                android.arch.lifecycle.y$b r3 = com.bytedance.jedi.arch.C11793b.m24134a()     // Catch:{ ae -> 0x004d }
                android.arch.lifecycle.y r2 = com.bytedance.scene.C12968s.m26081a(r2, r3)     // Catch:{ ae -> 0x004d }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ ae -> 0x004d }
                java.lang.String r4 = "android.arch.lifecycle.ViewModelProvider.DefaultKey:"
                r3.<init>(r4)     // Catch:{ ae -> 0x004d }
                d.k.c r4 = r5.f109454c     // Catch:{ ae -> 0x004d }
                java.lang.Class r4 = p2628d.p2639f.C52669a.m112219a(r4)     // Catch:{ ae -> 0x004d }
                java.lang.String r4 = r4.getCanonicalName()     // Catch:{ ae -> 0x004d }
                r3.append(r4)     // Catch:{ ae -> 0x004d }
                java.lang.String r3 = r3.toString()     // Catch:{ ae -> 0x004d }
                d.k.c r4 = r5.f109453b     // Catch:{ ae -> 0x004d }
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
                com.bytedance.scene.i r0 = r5.f109452a
                android.app.Activity r0 = r0.mo24477v()
                if (r0 == 0) goto L_0x0073
                android.support.v4.app.FragmentActivity r0 = (android.support.p030v4.app.FragmentActivity) r0
                android.arch.lifecycle.y$b r2 = com.bytedance.jedi.arch.C11793b.m24134a()
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m441a(r0, r2)
                d.k.c r2 = r5.f109453b
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
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.duet.C43275r.C43276a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.r$b */
    public static final class C43277b {
        private C43277b() {
        }

        public /* synthetic */ C43277b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.r$c */
    static final class C43278c extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C43275r f109455a;

        C43278c(C43275r rVar) {
            this.f109455a = rVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C43275r rVar = this.f109455a;
            C48923a aVar = rVar.f109437l;
            if (aVar == null) {
                C52711k.m112237a("recordEnv");
            }
            aVar.mo96754e().mo43455a(0, 0.5f, 0.0f, 0);
            C48923a aVar2 = rVar.f109437l;
            if (aVar2 == null) {
                C52711k.m112237a("recordEnv");
            }
            aVar2.mo96754e().mo43453a(0.5f, 0.0f, 0.0f, 0.0f, 1.0f);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.r$d */
    static final class C43279d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C43275r f109456a;

        C43279d(C43275r rVar) {
            this.f109456a = rVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f109456a.mo87948G();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.r$e */
    static final class C43280e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C43275r f109457a;

        C43280e(C43275r rVar) {
            this.f109457a = rVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f109457a.f109435j ^= 1;
            Activity activity = this.f109457a.f33840g_;
            if (activity != null) {
                ((ChangeDuetLayoutViewModel) C48927d.m105736a((FragmentActivity) activity).mo96760a(ChangeDuetLayoutViewModel.class)).mo22530c(new C43230a(this.f109457a.f109435j));
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.r$f */
    static final class C43281f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C43275r f109458a;

        C43281f(C43275r rVar) {
            this.f109458a = rVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f109458a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.r$g */
    public static final class C43282g implements C0199s<C43992a> {

        /* renamed from: a */
        final /* synthetic */ C43275r f109459a;

        C43282g(C43275r rVar) {
            this.f109459a = rVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C43992a aVar = (C43992a) obj;
            if (aVar != null && aVar.f111411a == 20 && aVar.f111412b == 16176) {
                this.f109459a.f109436k = aVar.f111413c;
                DuetLayoutModeViewModel F = this.f109459a.mo87947F();
                int i = 2;
                if (aVar.f111413c == 2) {
                    i = 1;
                }
                F.mo22530c(new C43234b(i));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.r$h */
    static final class C43283h extends C52712l implements C52682m<C49548a, Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C43275r f109460a;

        C43283h(C43275r rVar) {
            this.f109460a = rVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49548a aVar = (C49548a) obj;
            int intValue = ((Number) obj2).intValue();
            C52711k.m112240b(aVar, "$receiver");
            this.f109460a.f109435j = 0;
            switch (intValue) {
                case 1:
                    C43275r.m94921b(this.f109460a).setImageDrawable(this.f109460a.mo24478w().getDrawable(R.drawable.d1d));
                    C43275r.m94922c(this.f109460a).setText(this.f109460a.mo24478w().getString(R.string.ga2));
                    C43275r.m94923d(this.f109460a).setVisibility(0);
                    break;
                case 2:
                    C43275r.m94921b(this.f109460a).setImageDrawable(this.f109460a.mo24478w().getDrawable(R.drawable.d1g));
                    C43275r.m94922c(this.f109460a).setText(this.f109460a.mo24478w().getString(R.string.ga3));
                    C43275r.m94923d(this.f109460a).setVisibility(0);
                    break;
                default:
                    C43275r.m94923d(this.f109460a).setVisibility(4);
                    break;
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.r$i */
    static final class C43284i extends C52712l implements C52682m<C49548a, Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C43275r f109461a;

        C43284i(C43275r rVar) {
            this.f109461a = rVar;
            super(2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0076, code lost:
            r6.f109359a.setTranslationY(r6.f109365g);
            r6.f109359a.mo6659d();
            r6.f109359a.mo6652a((android.animation.Animator.AnimatorListener) r6);
            r6.f109359a.setAnimation("duet_layout_drag_lottie_mt.json");
            r6.f109359a.setRepeatCount(1);
            r6.f109359a.setRepeatMode(1);
            r6.f109359a.postDelayed(new com.p683ss.android.ugc.aweme.shortvideo.duet.C43256h(new com.p683ss.android.ugc.aweme.shortvideo.duet.C43246f.C43253g(r6)), r6.f109364f);
            r7 = r6.f109368j.getContext();
            p2628d.p2639f.p2641b.C52711k.m112236a((java.lang.Object) r7, "mRootLayout.context");
            r7 = android.animation.ValueAnimator.ofFloat(new float[]{0.0f, -r7.getResources().getDimension(com.ss.android.ugc.trill.R.dimen.z7)}).setDuration(r6.f109361c);
            r7.removeAllUpdateListeners();
            r6.f109360b = r7;
            r7 = r6.f109360b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x00e4, code lost:
            if (r7 == null) goto L_0x00f0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00e6, code lost:
            r7.addUpdateListener(new com.p683ss.android.ugc.aweme.shortvideo.duet.C43246f.C43254h(r6));
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r6, java.lang.Object r7) {
            /*
                r5 = this;
                com.ss.android.ugc.gamora.jedi.a r6 = (com.p683ss.android.ugc.gamora.jedi.C49548a) r6
                java.lang.Number r7 = (java.lang.Number) r7
                int r7 = r7.intValue()
                java.lang.String r0 = "$receiver"
                p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
                com.ss.android.ugc.aweme.shortvideo.duet.f$a r6 = com.p683ss.android.ugc.aweme.shortvideo.duet.C43246f.C43247a.NONE
                switch(r7) {
                    case 1: goto L_0x0016;
                    case 2: goto L_0x0013;
                    default: goto L_0x0012;
                }
            L_0x0012:
                goto L_0x0018
            L_0x0013:
                com.ss.android.ugc.aweme.shortvideo.duet.f$a r6 = com.p683ss.android.ugc.aweme.shortvideo.duet.C43246f.C43247a.THREE_SCREEN
                goto L_0x0018
            L_0x0016:
                com.ss.android.ugc.aweme.shortvideo.duet.f$a r6 = com.p683ss.android.ugc.aweme.shortvideo.duet.C43246f.C43247a.UP_DOWN
            L_0x0018:
                com.ss.android.ugc.aweme.shortvideo.duet.r r7 = r5.f109461a
                com.ss.android.ugc.aweme.shortvideo.duet.f r0 = new com.ss.android.ugc.aweme.shortvideo.duet.f
                com.ss.android.ugc.aweme.shortvideo.duet.r r1 = r5.f109461a
                android.view.View r1 = r1.f33834b
                if (r1 == 0) goto L_0x00f3
                android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                r0.<init>(r1, r6)
                r7.f109445t = r0
                com.ss.android.ugc.aweme.shortvideo.duet.r r6 = r5.f109461a
                com.ss.android.ugc.aweme.shortvideo.duet.f r6 = r6.f109445t
                if (r6 == 0) goto L_0x003b
                com.ss.android.ugc.aweme.shortvideo.duet.r r7 = r5.f109461a
                d.f.a.m<java.lang.Float, java.lang.Float, d.x> r7 = r7.f109447v
                com.ss.android.ugc.aweme.shortvideo.duet.r r0 = r5.f109461a
                d.f.a.a<d.x> r0 = r0.f109448w
                r6.f109366h = r7
                r6.f109367i = r0
            L_0x003b:
                com.ss.android.ugc.aweme.shortvideo.duet.r r6 = r5.f109461a
                com.ss.android.ugc.aweme.shortvideo.duet.f r6 = r6.f109445t
                if (r6 == 0) goto L_0x00f0
                com.ss.android.ugc.aweme.shortvideo.duet.f$a r7 = r6.f109369k
                int[] r0 = com.p683ss.android.ugc.aweme.shortvideo.duet.C43255g.f109377a
                int r7 = r7.ordinal()
                r7 = r0[r7]
                r0 = 1
                switch(r7) {
                    case 1: goto L_0x0064;
                    case 2: goto L_0x0051;
                    default: goto L_0x004f;
                }
            L_0x004f:
                goto L_0x00f0
            L_0x0051:
                com.ss.android.ugc.aweme.base.h.g r7 = com.p683ss.android.ugc.aweme.shortvideo.duet.C43259k.f109389a
                java.lang.String r1 = "duet_layout_three_screen_drag_gesture_hint"
                boolean r7 = r7.mo48705a(r1, r0)
                if (r7 == 0) goto L_0x00f0
                float r7 = r6.f109362d
                float r7 = -r7
                r1 = 1077936128(0x40400000, float:3.0)
                float r7 = r7 / r1
                r6.f109365g = r7
                goto L_0x0076
            L_0x0064:
                com.ss.android.ugc.aweme.base.h.g r7 = com.p683ss.android.ugc.aweme.shortvideo.duet.C43259k.f109389a
                java.lang.String r1 = "duet_layout_up_down_drag_gesture_hint"
                boolean r7 = r7.mo48705a(r1, r0)
                if (r7 == 0) goto L_0x00f0
                float r7 = r6.f109362d
                float r7 = -r7
                r1 = 1082130432(0x40800000, float:4.0)
                float r7 = r7 / r1
                r6.f109365g = r7
            L_0x0076:
                com.airbnb.lottie.LottieAnimationView r7 = r6.f109359a
                float r1 = r6.f109365g
                r7.setTranslationY(r1)
                com.airbnb.lottie.LottieAnimationView r7 = r6.f109359a
                r7.mo6659d()
                com.airbnb.lottie.LottieAnimationView r7 = r6.f109359a
                r1 = r6
                android.animation.Animator$AnimatorListener r1 = (android.animation.Animator.AnimatorListener) r1
                r7.mo6652a(r1)
                com.airbnb.lottie.LottieAnimationView r7 = r6.f109359a
                java.lang.String r1 = "duet_layout_drag_lottie_mt.json"
                r7.setAnimation(r1)
                com.airbnb.lottie.LottieAnimationView r7 = r6.f109359a
                r7.setRepeatCount(r0)
                com.airbnb.lottie.LottieAnimationView r7 = r6.f109359a
                r7.setRepeatMode(r0)
                com.airbnb.lottie.LottieAnimationView r7 = r6.f109359a
                com.ss.android.ugc.aweme.shortvideo.duet.f$g r1 = new com.ss.android.ugc.aweme.shortvideo.duet.f$g
                r2 = r6
                com.ss.android.ugc.aweme.shortvideo.duet.f r2 = (com.p683ss.android.ugc.aweme.shortvideo.duet.C43246f) r2
                r1.<init>(r2)
                d.f.a.a r1 = (p2628d.p2639f.p2640a.C52670a) r1
                com.ss.android.ugc.aweme.shortvideo.duet.h r2 = new com.ss.android.ugc.aweme.shortvideo.duet.h
                r2.<init>(r1)
                java.lang.Runnable r2 = (java.lang.Runnable) r2
                long r3 = r6.f109364f
                r7.postDelayed(r2, r3)
                android.view.ViewGroup r7 = r6.f109368j
                android.content.Context r7 = r7.getContext()
                java.lang.String r1 = "mRootLayout.context"
                p2628d.p2639f.p2641b.C52711k.m112236a(r7, r1)
                android.content.res.Resources r7 = r7.getResources()
                r1 = 2131886431(0x7f12015f, float:1.940744E38)
                float r7 = r7.getDimension(r1)
                float r7 = -r7
                r1 = 2
                float[] r1 = new float[r1]
                r2 = 0
                r3 = 0
                r1[r2] = r3
                r1[r0] = r7
                android.animation.ValueAnimator r7 = android.animation.ValueAnimator.ofFloat(r1)
                long r0 = r6.f109361c
                android.animation.ValueAnimator r7 = r7.setDuration(r0)
                r7.removeAllUpdateListeners()
                r6.f109360b = r7
                android.animation.ValueAnimator r7 = r6.f109360b
                if (r7 == 0) goto L_0x00f0
                com.ss.android.ugc.aweme.shortvideo.duet.f$h r0 = new com.ss.android.ugc.aweme.shortvideo.duet.f$h
                r0.<init>(r6)
                android.animation.ValueAnimator$AnimatorUpdateListener r0 = (android.animation.ValueAnimator.AnimatorUpdateListener) r0
                r7.addUpdateListener(r0)
            L_0x00f0:
                d.x r6 = p2628d.C52860x.f131107a
                return r6
            L_0x00f3:
                d.u r6 = new d.u
                java.lang.String r7 = "null cannot be cast to non-null type android.view.ViewGroup"
                r6.<init>(r7)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.duet.C43275r.C43284i.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.r$j */
    static final class C43285j extends C52712l implements C52682m<C49548a, Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C43275r f109462a;

        C43285j(C43275r rVar) {
            this.f109462a = rVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49548a aVar = (C49548a) obj;
            int intValue = ((Number) obj2).intValue();
            C52711k.m112240b(aVar, "$receiver");
            switch (intValue) {
                case 0:
                    this.f109462a.f109451z.invoke(new C43867a());
                    break;
                case 1:
                    C52671b<C43866a, C52860x> bVar = this.f109462a.f109451z;
                    C48923a aVar2 = this.f109462a.f109437l;
                    if (aVar2 == null) {
                        C52711k.m112237a("recordEnv");
                    }
                    bVar.invoke(new C43258j(aVar2.mo96754e()));
                    break;
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.r$k */
    static final class C43286k extends C52712l implements C52682m<C49548a, Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C43275r f109463a;

        C43286k(C43275r rVar) {
            this.f109463a = rVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49548a aVar = (C49548a) obj;
            ((Number) obj2).intValue();
            C52711k.m112240b(aVar, "$receiver");
            C43246f fVar = this.f109463a.f109445t;
            if (fVar != null) {
                fVar.mo87924a();
            }
            this.f109463a.f109449x = true;
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.r$l */
    static final class C43287l<T> implements C0199s<C37721a<EffectChannelResponse>> {

        /* renamed from: a */
        final /* synthetic */ C43275r f109464a;

        C43287l(C43275r rVar) {
            this.f109464a = rVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            List<? extends StickerWrapper> list;
            C37721a aVar = (C37721a) obj;
            C43275r rVar = this.f109464a;
            if (aVar != null) {
                if (aVar.f96126b == C37722a.LOADING) {
                    DmtStatusView dmtStatusView = rVar.f109442q;
                    if (dmtStatusView == null) {
                        C52711k.m112237a("statusView");
                    }
                    dmtStatusView.mo19212f();
                } else if (aVar.f96126b == C37722a.ERROR) {
                    DmtStatusView dmtStatusView2 = rVar.f109442q;
                    if (dmtStatusView2 == null) {
                        C52711k.m112237a("statusView");
                    }
                    dmtStatusView2.mo19214h();
                } else {
                    if (aVar.f96126b == C37722a.SUCCESS) {
                        EffectChannelResponse effectChannelResponse = (EffectChannelResponse) aVar.f96125a;
                        if (effectChannelResponse == null || C9414h.m18630a(effectChannelResponse.getAllCategoryEffects())) {
                            DmtStatusView dmtStatusView3 = rVar.f109442q;
                            if (dmtStatusView3 == null) {
                                C52711k.m112237a("statusView");
                            }
                            dmtStatusView3.mo19213g();
                            return;
                        }
                        DmtStatusView dmtStatusView4 = rVar.f109442q;
                        if (dmtStatusView4 == null) {
                            C52711k.m112237a("statusView");
                        }
                        dmtStatusView4.mo19209d();
                        C43267n nVar = rVar.f109443r;
                        if (nVar != null) {
                            List<Effect> allCategoryEffects = effectChannelResponse.getAllCategoryEffects();
                            C52711k.m112236a((Object) allCategoryEffects, "response.allCategoryEffects");
                            C52711k.m112240b(allCategoryEffects, "modeList");
                            if (C9376b.m18558a((Collection<T>) allCategoryEffects)) {
                                list = new ArrayList<>();
                            } else {
                                ArrayList arrayList = new ArrayList();
                                if (allCategoryEffects == null) {
                                    C52711k.m112234a();
                                }
                                for (Effect stickerWrapper : allCategoryEffects) {
                                    arrayList.add(new StickerWrapper(stickerWrapper, "", 3));
                                }
                                list = arrayList;
                            }
                            nVar.f109405a = list;
                        }
                        C43267n nVar2 = rVar.f109443r;
                        if (nVar2 != null) {
                            nVar2.notifyDataSetChanged();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.r$m */
    public static final class C43288m extends C24459a {

        /* renamed from: a */
        final /* synthetic */ C43275r f109465a;

        /* renamed from: a */
        public final void mo50217a() {
            C43275r.m94920a(this.f109465a).mo86534a(new C47336q(0));
        }

        /* renamed from: d */
        public final void mo50225d() {
            C43275r.m94920a(this.f109465a).mo86534a(new C47336q(4));
        }

        C43288m(C43275r rVar) {
            this.f109465a = rVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.r$n */
    static final class C43289n implements C12961g {

        /* renamed from: a */
        final /* synthetic */ C43275r f109466a;

        C43289n(C43275r rVar) {
            this.f109466a = rVar;
        }

        /* renamed from: a */
        public final boolean mo24532a() {
            this.f109466a.dismiss();
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.r$o */
    static final class C43290o extends C52712l implements C52682m<Float, Float, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C43275r f109467a;

        C43290o(C43275r rVar) {
            this.f109467a = rVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i;
            float floatValue = ((Number) obj).floatValue();
            float floatValue2 = ((Number) obj2).floatValue();
            C43275r rVar = this.f109467a;
            if (this.f109467a.f109436k == 0) {
                i = 1;
            } else {
                i = this.f109467a.f109436k;
            }
            float f = floatValue2 / ((float) i);
            int e = C43303dy.m94974e(rVar.f33840g_);
            if (rVar.f109449x) {
                rVar.f109450y = f;
                C48923a aVar = rVar.f109437l;
                if (aVar == null) {
                    C52711k.m112237a("recordEnv");
                }
                aVar.mo96754e().mo43455a(0, 0.5f, (-floatValue) / ((float) e), 0);
                rVar.f109449x = false;
            }
            C48923a aVar2 = rVar.f109437l;
            if (aVar2 == null) {
                C52711k.m112237a("recordEnv");
            }
            float f2 = (float) e;
            aVar2.mo96754e().mo43453a(0.5f, ((-floatValue) + f) / f2, 0.0f, (-(f - rVar.f109450y)) / f2, 1.0f);
            return C52860x.f131107a;
        }
    }

    /* renamed from: F */
    public final DuetLayoutModeViewModel mo87947F() {
        return (DuetLayoutModeViewModel) this.f109433I.getValue();
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

    public final void dismiss() {
        C43246f fVar = this.f109445t;
        if (fVar != null) {
            fVar.mo87924a();
        }
        mo87947F().mo87913a(false);
        mo24479x().mo24523a(this.f109446u);
    }

    /* renamed from: G */
    public final void mo87948G() {
        Activity activity = this.f33840g_;
        if (activity != null) {
            DuetLayoutListViewModel duetLayoutListViewModel = (DuetLayoutListViewModel) C0214z.m440a((FragmentActivity) activity).mo359a(DuetLayoutListViewModel.class);
            C29252f fVar = this.f109434J;
            if (fVar == null) {
                C52711k.m112237a("effectPlatform");
            }
            C0198r a = duetLayoutListViewModel.mo87898a(fVar, "duet-layout");
            Activity activity2 = this.f33840g_;
            if (activity2 != null) {
                a.observe((FragmentActivity) activity2, new C43287l(this));
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public static final /* synthetic */ C42443a m94920a(C43275r rVar) {
        C42443a aVar = rVar.f109438m;
        if (aVar == null) {
            C52711k.m112237a("uiEventApi");
        }
        return aVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ ImageView m94921b(C43275r rVar) {
        ImageView imageView = rVar.f109440o;
        if (imageView == null) {
            C52711k.m112237a("mSwitchIcon");
        }
        return imageView;
    }

    /* renamed from: c */
    public static final /* synthetic */ DmtTextView m94922c(C43275r rVar) {
        DmtTextView dmtTextView = rVar.f109441p;
        if (dmtTextView == null) {
            C52711k.m112237a("mSwitchText");
        }
        return dmtTextView;
    }

    /* renamed from: d */
    public static final /* synthetic */ RelativeLayout m94923d(C43275r rVar) {
        RelativeLayout relativeLayout = rVar.f109439n;
        if (relativeLayout == null) {
            C52711k.m112237a("mSwitchContainer");
        }
        return relativeLayout;
    }

    public C43275r(C52671b<? super C43866a, C52860x> bVar) {
        C52711k.m112240b(bVar, "onChangeGestureListener");
        this.f109451z = bVar;
        C52760c a = C52728w.m112245a(DuetLayoutModeViewModel.class);
        this.f109433I = C52732g.m112285a(new C43276a(this, a, a));
        this.f109446u = new C43289n(this);
        this.f109447v = new C43290o(this);
        this.f109448w = new C43278c(this);
        this.f109449x = true;
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        super.mo24448e(bundle);
        Object a = mo24460E().mo24560a("record_env_context");
        if (a == null) {
            C52711k.m112234a();
        }
        this.f109437l = (C48923a) a;
        C48923a aVar = this.f109437l;
        if (aVar == null) {
            C52711k.m112237a("recordEnv");
        }
        IRecordingOperationPanel a2 = aVar.mo96750a();
        if (a2 != null) {
            C42443a d = ((C42562ct) a2).mo86791d();
            C52711k.m112236a((Object) d, "(recordEnv.recordingOper…l as PlanC).planCEventApi");
            this.f109438m = d;
            View view = this.f109426B;
            if (view == null) {
                C52711k.m112237a("rootView");
            }
            View findViewById = view.findViewById(R.id.e6h);
            C52711k.m112236a((Object) findViewById, "findViewById(R.id.duet_l…t_order_switch_container)");
            this.f109439n = (RelativeLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.e6i);
            C52711k.m112236a((Object) findViewById2, "findViewById(R.id.duet_layout_order_switch_icon)");
            this.f109440o = (ImageView) findViewById2;
            View findViewById3 = view.findViewById(R.id.e6j);
            C52711k.m112236a((Object) findViewById3, "findViewById(R.id.duet_layout_order_switch_text)");
            this.f109441p = (DmtTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.e6c);
            C52711k.m112236a((Object) findViewById4, "findViewById(R.id.duet_layout_bottom_sheet)");
            this.f109427C = (AVDmtPanelRelativeLayout) findViewById4;
            View findViewById5 = view.findViewById(R.id.e6f);
            C52711k.m112236a((Object) findViewById5, "findViewById(R.id.duet_layout_mode_list)");
            this.f109428D = (AVDmtPanelRecyleView) findViewById5;
            View findViewById6 = view.findViewById(R.id.e6g);
            C52711k.m112236a((Object) findViewById6, "findViewById(R.id.duet_layout_mode_touch_outside)");
            this.f109429E = findViewById6;
            View findViewById7 = view.findViewById(R.id.e6d);
            C52711k.m112236a((Object) findViewById7, "findViewById(R.id.duet_layout_list_container)");
            this.f109430F = findViewById7;
            View findViewById8 = view.findViewById(R.id.e6e);
            C52711k.m112236a((Object) findViewById8, "findViewById(R.id.duet_layout_list_status)");
            this.f109442q = (DmtStatusView) findViewById8;
            LayoutInflater from = LayoutInflater.from(this.f33840g_);
            View view2 = this.f109426B;
            if (view2 == null) {
                C52711k.m112237a("rootView");
            }
            if (view2 != null) {
                View inflate = from.inflate(R.layout.gc, (ViewGroup) view2, false);
                C52711k.m112236a((Object) inflate, "LayoutInflater.from(acti…View as ViewGroup, false)");
                this.f109431G = inflate;
                View view3 = this.f109431G;
                if (view3 == null) {
                    C52711k.m112237a("errorView");
                }
                View findViewById9 = view3.findViewById(R.id.ab_);
                C52711k.m112236a((Object) findViewById9, "errorView.findViewById(R.id.error_retry_button)");
                this.f109432H = findViewById9;
                View view4 = this.f109432H;
                if (view4 == null) {
                    C52711k.m112237a("retryView");
                }
                view4.setOnClickListener(new C43279d(this));
                RelativeLayout relativeLayout = this.f109439n;
                if (relativeLayout == null) {
                    C52711k.m112237a("mSwitchContainer");
                }
                relativeLayout.setOnClickListener(new C43280e(this));
                View view5 = this.f109429E;
                if (view5 == null) {
                    C52711k.m112237a("mOutsideView");
                }
                view5.setOnClickListener(new C43281f(this));
                DmtStatusView dmtStatusView = this.f109442q;
                if (dmtStatusView == null) {
                    C52711k.m112237a("statusView");
                }
                C10719a a3 = C10719a.m21676a(mo24473s());
                View view6 = this.f109431G;
                if (view6 == null) {
                    C52711k.m112237a("errorView");
                }
                dmtStatusView.setBuilder(a3.mo19234c(view6).mo19224a((int) R.string.bx4).mo19233c(1));
                Activity activity = this.f33840g_;
                if (activity != null) {
                    LiveData liveData = ((MessageCenterViewModel) C0214z.m440a((FragmentActivity) activity).mo359a(MessageCenterViewModel.class)).f111405a;
                    Activity activity2 = this.f33840g_;
                    if (activity2 != null) {
                        liveData.observe((FragmentActivity) activity2, new C43282g(this));
                        mo49443b(mo87947F(), C43291s.f109468a, C11935v.m24277a(false, 1, null), new C43283h(this));
                        mo49443b(mo87947F(), C43292t.f109469a, C11935v.m24277a(false, 1, null), new C43284i(this));
                        mo49443b(mo87947F(), C43293u.f109470a, C11935v.m24277a(false, 1, null), new C43285j(this));
                        mo49443b(mo87947F(), C43294v.f109471a, C11935v.m24277a(false, 1, null), new C43286k(this));
                        View view7 = this.f109426B;
                        if (view7 == null) {
                            C52711k.m112237a("rootView");
                        }
                        this.f109444s = new C43238c(view7);
                        C43238c cVar = this.f109444s;
                        if (cVar != null) {
                            cVar.mo50220a((C24458h) new C43288m(this));
                        }
                        Activity activity3 = this.f33840g_;
                        if (activity3 == null) {
                            C52711k.m112234a();
                        }
                        C52711k.m112236a((Object) activity3, "activity!!");
                        this.f109434J = C29242c.m68869a(activity3, null);
                        Activity activity4 = this.f33840g_;
                        if (activity4 != null) {
                            AppCompatActivity appCompatActivity = (AppCompatActivity) activity4;
                            C48923a aVar2 = this.f109437l;
                            if (aVar2 == null) {
                                C52711k.m112237a("recordEnv");
                            }
                            ShortVideoContext c = aVar2.mo96752c();
                            C29252f fVar = this.f109434J;
                            if (fVar == null) {
                                C52711k.m112237a("effectPlatform");
                            }
                            this.f109443r = new C43267n(appCompatActivity, c, fVar, mo87947F());
                            AVDmtPanelRecyleView aVDmtPanelRecyleView = this.f109428D;
                            if (aVDmtPanelRecyleView == null) {
                                C52711k.m112237a("mModeRecyclerView");
                            }
                            aVDmtPanelRecyleView.setAdapter(this.f109443r);
                            AVDmtPanelRecyleView aVDmtPanelRecyleView2 = this.f109428D;
                            if (aVDmtPanelRecyleView2 == null) {
                                C52711k.m112237a("mModeRecyclerView");
                            }
                            aVDmtPanelRecyleView2.setLayoutManager(new LinearLayoutManager(this.f33840g_, 0, false));
                            mo87948G();
                            return;
                        }
                        throw new C52857u("null cannot be cast to non-null type android.support.v7.app.AppCompatActivity");
                    }
                    throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
                throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
            throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.PlanC");
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
        View inflate = layoutInflater.inflate(R.layout.axx, viewGroup, false);
        C52711k.m112236a((Object) inflate, "it");
        this.f109426B = inflate;
        C52711k.m112236a((Object) inflate, "inflater.inflate(R.layou…  .also { rootView = it }");
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
