package com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
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
import com.bytedance.scene.C12924i;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.filter.C31384a;
import com.p683ss.android.ugc.aweme.p1484bx.C24453c;
import com.p683ss.android.ugc.aweme.p1484bx.C24458h;
import com.p683ss.android.ugc.aweme.p1484bx.C24458h.C24459a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.C43359c.C43360a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.C43359c.C43364e;
import com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.p2189a.C43352d;
import com.p683ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.gamora.editor.EditAudioEffectViewModel;
import com.p683ss.android.ugc.gamora.editor.EditViewModel;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.ss.android.ugc.trill.R;
import dmt.p2652av.video.VEVideoPublishEditViewModel;
import p064c.p065a.p069b.C1690c;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.i */
public final class C43382i extends C12924i implements C43395l, C49548a {

    /* renamed from: z */
    public static final C43383a f109668z = new C43383a(null);

    /* renamed from: A */
    private int f109669A = 1;

    /* renamed from: B */
    private VEVideoPublishEditViewModel f109670B;

    /* renamed from: i */
    public boolean f109671i;

    /* renamed from: j */
    public View f109672j;

    /* renamed from: k */
    TextView f109673k;

    /* renamed from: l */
    View f109674l;

    /* renamed from: m */
    public RecyclerView f109675m;

    /* renamed from: n */
    C31384a f109676n;

    /* renamed from: o */
    public C24458h f109677o;

    /* renamed from: p */
    public C43368e f109678p;

    /* renamed from: q */
    public C1332i f109679q;

    /* renamed from: r */
    public int f109680r;

    /* renamed from: s */
    public int f109681s;

    /* renamed from: t */
    C43352d f109682t;

    /* renamed from: u */
    public C20347c f109683u;

    /* renamed from: v */
    FrameLayout f109684v;

    /* renamed from: w */
    public EditViewModel f109685w;

    /* renamed from: x */
    public VideoPublishEditModel f109686x;

    /* renamed from: y */
    public EditAudioEffectViewModel f109687y;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.i$a */
    public static final class C43383a {
        private C43383a() {
        }

        public /* synthetic */ C43383a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.i$b */
    public static final class C43384b implements C43364e {

        /* renamed from: a */
        final /* synthetic */ C43382i f109688a;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.i$b$a */
        static final class C43385a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C43384b f109689a;

            /* renamed from: b */
            final /* synthetic */ CategoryPageModel f109690b;

            C43385a(C43384b bVar, CategoryPageModel categoryPageModel) {
                this.f109689a = bVar;
                this.f109690b = categoryPageModel;
            }

            public final void run() {
                this.f109689a.f109688a.mo88314a(this.f109690b, true);
            }
        }

        /* renamed from: a */
        public final void mo88297a(int i, String str) {
            C52711k.m112240b(str, "msg");
        }

        C43384b(C43382i iVar) {
            this.f109688a = iVar;
        }

        /* renamed from: a */
        public final void mo88298a(CategoryPageModel categoryPageModel) {
            RecyclerView recyclerView = this.f109688a.f109675m;
            if (recyclerView != null) {
                recyclerView.post(new C43385a(this, categoryPageModel));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.i$c */
    public static final class C43386c extends C24459a {

        /* renamed from: a */
        final /* synthetic */ C43382i f109691a;

        /* renamed from: a */
        public final void mo50217a() {
            this.f109691a.f109671i = true;
            C24458h hVar = this.f109691a.f109677o;
            if (hVar != null) {
                hVar.mo50217a();
            }
        }

        /* renamed from: b */
        public final void mo50221b() {
            C24458h hVar = this.f109691a.f109677o;
            if (hVar != null) {
                hVar.mo50221b();
            }
        }

        /* renamed from: c */
        public final void mo50224c() {
            C24458h hVar = this.f109691a.f109677o;
            if (hVar != null) {
                hVar.mo50224c();
            }
        }

        /* renamed from: d */
        public final void mo50225d() {
            this.f109691a.f109671i = false;
            C24458h hVar = this.f109691a.f109677o;
            if (hVar != null) {
                hVar.mo50225d();
            }
        }

        C43386c(C43382i iVar) {
            this.f109691a = iVar;
        }

        /* renamed from: a */
        public final void mo50218a(float f, int i, int i2) {
            C24458h hVar = this.f109691a.f109677o;
            if (hVar != null) {
                hVar.mo50218a(f, i, i2);
            }
        }

        /* renamed from: b */
        public final void mo50222b(float f, int i, int i2) {
            C24458h hVar = this.f109691a.f109677o;
            if (hVar != null) {
                hVar.mo50222b(f, i, i2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.i$d */
    static final class C43387d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C43382i f109692a;

        C43387d(C43382i iVar) {
            this.f109692a = iVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            EditAudioEffectViewModel editAudioEffectViewModel = this.f109692a.f109687y;
            if (editAudioEffectViewModel == null) {
                C52711k.m112237a("audioEffectViewModel");
            }
            editAudioEffectViewModel.mo96770a(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.i$e */
    static final class C43388e<T> implements C0199s<AudioEffectParam> {

        /* renamed from: a */
        final /* synthetic */ C43382i f109693a;

        C43388e(C43382i iVar) {
            this.f109693a = iVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            AudioEffectParam audioEffectParam = (AudioEffectParam) obj;
            VideoPublishEditModel videoPublishEditModel = this.f109693a.f109686x;
            if (videoPublishEditModel == null) {
                C52711k.m112237a("publishEditModel");
            }
            videoPublishEditModel.veAudioEffectParam = audioEffectParam;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.i$f */
    public static final class C43389f extends C24459a {

        /* renamed from: a */
        final /* synthetic */ C43382i f109694a;

        /* renamed from: d */
        public final void mo50225d() {
            EditViewModel editViewModel = this.f109694a.f109685w;
            if (editViewModel == null) {
                C52711k.m112237a("editViewModel");
            }
            editViewModel.mo97033a(true, false, true);
        }

        C43389f(C43382i iVar) {
            this.f109694a = iVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.i$g */
    static final class C43390g extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C43382i f109695a;

        C43390g(C43382i iVar) {
            this.f109695a = iVar;
            super(2);
        }

        /* JADX WARNING: type inference failed for: r7v2 */
        /* JADX WARNING: type inference failed for: r7v4, types: [android.view.View] */
        /* JADX WARNING: type inference failed for: r7v6, types: [android.view.View] */
        /* JADX WARNING: type inference failed for: r7v10, types: [android.widget.FrameLayout] */
        /* JADX WARNING: type inference failed for: r7v29, types: [android.widget.FrameLayout] */
        /* JADX WARNING: type inference failed for: r7v30 */
        /* JADX WARNING: type inference failed for: r7v31 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r7v2
          assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], android.widget.FrameLayout, android.view.View]
          uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], android.view.View, android.widget.FrameLayout]
          mth insns count: 155
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
        /* JADX WARNING: Unknown variable types count: 3 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r7, java.lang.Object r8) {
            /*
                r6 = this;
                com.ss.android.ugc.gamora.jedi.a r7 = (com.p683ss.android.ugc.gamora.jedi.C49548a) r7
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                java.lang.String r0 = "$receiver"
                p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
                r7 = 0
                r0 = 0
                if (r8 == 0) goto L_0x015b
                com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.i r8 = r6.f109695a
                com.ss.android.ugc.gamora.editor.EditViewModel r1 = r8.f109685w
                if (r1 != 0) goto L_0x001c
                java.lang.String r2 = "editViewModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r2)
            L_0x001c:
                android.arch.lifecycle.r r1 = r1.mo97038h()
                java.lang.Object r1 = r1.getValue()
                com.ss.android.ugc.asve.c.c r1 = (com.p683ss.android.ugc.asve.p1239c.C20347c) r1
                r8.f109683u = r1
                android.widget.FrameLayout r1 = r8.f109684v
                if (r1 != 0) goto L_0x0031
                java.lang.String r2 = "parentLayout"
                p2628d.p2639f.p2641b.C52711k.m112237a(r2)
            L_0x0031:
                r1.removeAllViews()
                android.app.Activity r1 = r8.f33840g_
                if (r1 == 0) goto L_0x0153
                android.support.v7.app.AppCompatActivity r1 = (android.support.p043v7.app.AppCompatActivity) r1
                android.widget.FrameLayout r2 = r8.f109684v
                if (r2 != 0) goto L_0x0043
                java.lang.String r3 = "parentLayout"
                p2628d.p2639f.p2641b.C52711k.m112237a(r3)
            L_0x0043:
                android.view.View r3 = r8.f109672j
                if (r3 != 0) goto L_0x0139
                android.content.Context r1 = (android.content.Context) r1
                android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
                r3 = 2132213979(0x7f1700db, float:2.0071787E38)
                r4 = r2
                android.view.ViewGroup r4 = (android.view.ViewGroup) r4
                android.view.View r1 = r1.inflate(r3, r4, r0)
                r8.f109672j = r1
                android.view.View r1 = r8.f109672j
                if (r1 == 0) goto L_0x0067
                r3 = 2132023785(0x7f1419e9, float:1.9686028E38)
                android.view.View r1 = r1.findViewById(r3)
                android.widget.TextView r1 = (android.widget.TextView) r1
                goto L_0x0068
            L_0x0067:
                r1 = r7
            L_0x0068:
                r8.f109673k = r1
                com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.a r1 = new com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.a
                android.view.View r3 = r8.f109672j
                if (r3 == 0) goto L_0x0079
                r7 = 2132020488(0x7f140d08, float:1.967934E38)
                android.view.View r7 = r3.findViewById(r7)
                android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            L_0x0079:
                r1.<init>(r7)
                com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.d r1 = (com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.p2189a.C43352d) r1
                r8.f109682t = r1
                android.view.View r7 = r8.f109672j
                if (r7 != 0) goto L_0x0087
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0087:
                r1 = 2132024619(0x7f141d2b, float:1.968772E38)
                android.view.View r7 = r7.findViewById(r1)
                r8.f109674l = r7
                android.view.View r7 = r8.f109672j
                if (r7 != 0) goto L_0x0097
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0097:
                r1 = 2132024624(0x7f141d30, float:1.968773E38)
                android.view.View r7 = r7.findViewById(r1)
                com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.i$d r1 = new com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.i$d
                r1.<init>(r8)
                android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
                r7.setOnClickListener(r1)
                android.view.View r7 = r8.f109672j
                if (r7 != 0) goto L_0x00af
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x00af:
                r1 = 2132024622(0x7f141d2e, float:1.9687725E38)
                android.view.View r7 = r7.findViewById(r1)
                android.support.v7.widget.RecyclerView r7 = (android.support.p043v7.widget.RecyclerView) r7
                r8.f109675m = r7
                android.support.v7.widget.LinearLayoutManager r7 = new android.support.v7.widget.LinearLayoutManager
                android.app.Activity r1 = r8.f33840g_
                android.content.Context r1 = (android.content.Context) r1
                r7.<init>(r1, r0, r0)
                android.support.v7.widget.RecyclerView$i r7 = (android.support.p043v7.widget.RecyclerView.C1332i) r7
                r8.f109679q = r7
                android.support.v7.widget.RecyclerView r7 = r8.f109675m
                if (r7 == 0) goto L_0x00d0
                android.support.v7.widget.RecyclerView$i r0 = r8.f109679q
                r7.setLayoutManager(r0)
            L_0x00d0:
                com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.e r7 = new com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.e
                android.app.Activity r0 = r8.f33840g_
                if (r0 == 0) goto L_0x0131
                android.support.v7.app.AppCompatActivity r0 = (android.support.p043v7.app.AppCompatActivity) r0
                com.ss.android.ugc.asve.c.c r1 = r8.f109683u
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r8.f109686x
                if (r3 != 0) goto L_0x00e3
                java.lang.String r4 = "publishEditModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r4)
            L_0x00e3:
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r8.f109686x
                if (r4 != 0) goto L_0x00ec
                java.lang.String r5 = "publishEditModel"
                p2628d.p2639f.p2641b.C52711k.m112237a(r5)
            L_0x00ec:
                com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r4 = r4.veAudioEffectParam
                r7.<init>(r0, r1, r3, r4)
                r8.f109678p = r7
                com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.e r7 = r8.f109678p
                if (r7 == 0) goto L_0x00fc
                r0 = r8
                com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.l r0 = (com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.C43395l) r0
                r7.f109637c = r0
            L_0x00fc:
                android.support.v7.widget.RecyclerView r7 = r8.f109675m
                if (r7 == 0) goto L_0x0107
                com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.e r0 = r8.f109678p
                android.support.v7.widget.RecyclerView$a r0 = (android.support.p043v7.widget.RecyclerView.C1322a) r0
                r7.setAdapter(r0)
            L_0x0107:
                r8.mo88313F()
                com.ss.android.ugc.aweme.filter.a r7 = new com.ss.android.ugc.aweme.filter.a
                android.view.View r0 = r8.f109672j
                if (r0 != 0) goto L_0x0113
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0113:
                android.view.View r1 = r8.f109674l
                if (r1 != 0) goto L_0x011a
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x011a:
                r7.<init>(r2, r0, r1)
                r8.f109676n = r7
                com.ss.android.ugc.aweme.filter.a r7 = r8.f109676n
                if (r7 != 0) goto L_0x0126
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0126:
                com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.i$c r0 = new com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.i$c
                r0.<init>(r8)
                com.ss.android.ugc.aweme.bx.h r0 = (com.p683ss.android.ugc.aweme.p1484bx.C24458h) r0
                r7.mo50220a(r0)
                goto L_0x013c
            L_0x0131:
                d.u r7 = new d.u
                java.lang.String r8 = "null cannot be cast to non-null type android.support.v7.app.AppCompatActivity"
                r7.<init>(r8)
                throw r7
            L_0x0139:
                r8.mo88313F()
            L_0x013c:
                android.view.View r7 = r8.f109672j
                if (r7 == 0) goto L_0x0144
                r0 = 4
                r7.setVisibility(r0)
            L_0x0144:
                com.ss.android.ugc.aweme.filter.a r7 = r8.f109676n
                if (r7 == 0) goto L_0x0185
                com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.i$i r0 = new com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.i$i
                r0.<init>(r8)
                com.ss.android.ugc.aweme.bx.d r0 = (com.p683ss.android.ugc.aweme.p1484bx.C24454d) r0
                r7.mo50219a(r0)
                goto L_0x0185
            L_0x0153:
                d.u r7 = new d.u
                java.lang.String r8 = "null cannot be cast to non-null type android.support.v7.app.AppCompatActivity"
                r7.<init>(r8)
                throw r7
            L_0x015b:
                com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.i r8 = r6.f109695a
                android.support.v7.widget.RecyclerView$i r1 = r8.f109679q
                if (r1 == 0) goto L_0x0165
                android.view.View r7 = r1.mo5050g(r0)
            L_0x0165:
                if (r7 == 0) goto L_0x0177
                int r1 = r7.getLeft()
                r8.f109681s = r1
                android.support.v7.widget.RecyclerView$i r1 = r8.f109679q
                if (r1 == 0) goto L_0x0175
                int r0 = android.support.p043v7.widget.RecyclerView.C1332i.m4418c(r7)
            L_0x0175:
                r8.f109680r = r0
            L_0x0177:
                com.ss.android.ugc.aweme.filter.a r7 = r8.f109676n
                if (r7 == 0) goto L_0x0185
                com.ss.android.ugc.aweme.bx.c r8 = new com.ss.android.ugc.aweme.bx.c
                r8.<init>()
                com.ss.android.ugc.aweme.bx.d r8 = (com.p683ss.android.ugc.aweme.p1484bx.C24454d) r8
                r7.mo50223b(r8)
            L_0x0185:
                d.x r7 = p2628d.C52860x.f131107a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.C43382i.C43390g.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.i$h */
    static final class C43391h extends C52712l implements C52682m<C49548a, Object, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C43382i f109696a;

        C43391h(C43382i iVar) {
            this.f109696a = iVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(obj2, "it");
            C43368e eVar = this.f109696a.f109678p;
            if (eVar != null) {
                eVar.mo88305b(0);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.i$i */
    public static final class C43392i extends C24453c {

        /* renamed from: a */
        final /* synthetic */ C43382i f109697a;

        /* renamed from: a */
        public final void mo50217a() {
            View view = this.f109697a.f109672j;
            if (view != null) {
                view.setVisibility(0);
            }
            if (this.f109697a.f109679q != null) {
                C1332i iVar = this.f109697a.f109679q;
                if (iVar != null) {
                    ((LinearLayoutManager) iVar).mo4721a(this.f109697a.f109680r, this.f109697a.f109681s);
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
                }
            }
            super.mo50217a();
        }

        C43392i(C43382i iVar) {
            this.f109697a = iVar;
        }
    }

    /* renamed from: a */
    public final void mo88315a(Effect effect) {
        C43352d dVar = this.f109682t;
        if (dVar != null) {
            dVar.mo88284a(effect);
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

    /* access modifiers changed from: 0000 */
    /* renamed from: F */
    public final void mo88313F() {
        mo88314a(C43357b.m95082b(), false);
        C43360a.m95089a().mo88294a((C43364e) new C43384b(this));
    }

    /* renamed from: p */
    public final void mo24469p() {
        super.mo24469p();
        C43360a.m95089a();
        C29252f b = C43360a.m95090b();
        if (b != null) {
            b.destroy();
        }
        C43359c.f109625c = null;
    }

    /* renamed from: q */
    public final void mo24470q() {
        super.mo24470q();
        C43360a.m95089a();
        C43360a.m95091c().f109666a.mo2504a(1);
        C43352d dVar = this.f109682t;
        if (dVar != null) {
            dVar.mo88283a();
        }
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        super.mo24448e(bundle);
        Activity activity = this.f33840g_;
        if (activity != null) {
            JediViewModel a = C48927d.m105736a((FragmentActivity) activity).mo96760a(EditViewModel.class);
            C52711k.m112236a((Object) a, "JediViewModelProviders.o…ditViewModel::class.java)");
            this.f109685w = (EditViewModel) a;
            EditViewModel editViewModel = this.f109685w;
            if (editViewModel == null) {
                C52711k.m112237a("editViewModel");
            }
            this.f109686x = editViewModel.mo97035e();
            Activity activity2 = this.f33840g_;
            if (activity2 != null) {
                C0209x a2 = C0214z.m440a((FragmentActivity) activity2).mo359a(VEVideoPublishEditViewModel.class);
                C52711k.m112236a((Object) a2, "ViewModelProviders.of(ac…ditViewModel::class.java)");
                this.f109670B = (VEVideoPublishEditViewModel) a2;
                Activity activity3 = this.f33840g_;
                if (activity3 != null) {
                    JediViewModel a3 = C48927d.m105736a((FragmentActivity) activity3).mo96760a(EditAudioEffectViewModel.class);
                    C52711k.m112236a((Object) a3, "JediViewModelProviders.o…ectViewModel::class.java)");
                    this.f109687y = (EditAudioEffectViewModel) a3;
                    VideoPublishEditModel videoPublishEditModel = this.f109686x;
                    if (videoPublishEditModel == null) {
                        C52711k.m112237a("publishEditModel");
                    }
                    this.f109669A = C43347a.m95068a(videoPublishEditModel);
                    VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f109670B;
                    if (vEVideoPublishEditViewModel == null) {
                        C52711k.m112237a("publishEditViewModel");
                    }
                    vEVideoPublishEditViewModel.mo110459d().observe(this, new C43388e(this));
                    this.f109677o = new C43389f(this);
                    EditAudioEffectViewModel editAudioEffectViewModel = this.f109687y;
                    if (editAudioEffectViewModel == null) {
                        C52711k.m112237a("audioEffectViewModel");
                    }
                    mo49443b(editAudioEffectViewModel, C43393j.f109698a, new C11934u(), new C43390g(this));
                    EditAudioEffectViewModel editAudioEffectViewModel2 = this.f109687y;
                    if (editAudioEffectViewModel2 == null) {
                        C52711k.m112237a("audioEffectViewModel");
                    }
                    mo49443b(editAudioEffectViewModel2, C43394k.f109699a, new C11934u(), new C43391h(this));
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R mo22552a(VM1 vm1, C52671b<? super S1, ? extends R> bVar) {
        C52711k.m112240b(vm1, "viewModel1");
        C52711k.m112240b(bVar, "block");
        return C49549a.m106924a(this, vm1, bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo88314a(CategoryPageModel categoryPageModel, boolean z) {
        if (categoryPageModel != null) {
            C43368e eVar = this.f109678p;
            if (eVar != null) {
                eVar.mo88303a(categoryPageModel, z);
            }
        }
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
        View inflate = layoutInflater.inflate(R.layout.adw, viewGroup, false);
        if (inflate != null) {
            this.f109684v = (FrameLayout) inflate;
            FrameLayout frameLayout = this.f109684v;
            if (frameLayout == null) {
                C52711k.m112237a("parentLayout");
            }
            return frameLayout;
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout");
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
