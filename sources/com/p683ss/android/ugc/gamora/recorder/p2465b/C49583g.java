package com.p683ss.android.ugc.gamora.recorder.p2465b;

import android.app.Activity;
import android.arch.lifecycle.C0176h.C0178b;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.als.ApiCenter.C2755a;
import com.bytedance.als.C2759d;
import com.bytedance.als.C2760e;
import com.bytedance.als.C2762f;
import com.bytedance.als.C2764h;
import com.bytedance.als.C2765i;
import com.bytedance.als.C2767k;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
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
import com.bytedance.p582g.p583a.p585b.p590e.C9979b;
import com.bytedance.p780m.C12356a;
import com.bytedance.p780m.C12361b;
import com.bytedance.scene.C12924i;
import com.bytedance.scene.group.C12896b;
import com.bytedance.scene.ktx.C12931a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.out.AVServiceImpl;
import com.p683ss.android.ugc.aweme.p2403xs.C48415a;
import com.p683ss.android.ugc.aweme.p2403xs.C48417b;
import com.p683ss.android.ugc.aweme.p2403xs.C48420d;
import com.p683ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.C43804f;
import com.p683ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.p2203g.C43859a;
import com.p683ss.android.ugc.aweme.shortvideo.p2217n.C44321a;
import com.p683ss.android.ugc.aweme.shortvideo.p2217n.C44330b;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoRecordNewActivity;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a;
import com.p683ss.android.ugc.aweme.shortvideo.record.C44450b;
import com.p683ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.p683ss.android.ugc.aweme.shortvideo.widget.TabItemView;
import com.p683ss.android.ugc.aweme.tools.C47337r;
import com.p683ss.android.ugc.aweme.utils.C47842ed;
import com.p683ss.android.ugc.aweme.utils.C47911gc;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.ugc.gamora.p2457a.C48923a;
import com.p683ss.android.ugc.gamora.recorder.p2478l.C49860a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p064c.p065a.p069b.C1690c;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52722v.C52727e;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.gamora.recorder.b.g */
public final class C49583g extends C2764h<C49577b> implements C12356a, C49548a, C49577b {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f124375a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49583g.class), "cameraApiComponent", "getCameraApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/ui/component/CameraApiComponent;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49583g.class), "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;"))};

    /* renamed from: b */
    public final C49577b f124376b = this;

    /* renamed from: c */
    final C52668f f124377c = C52732g.m112286a(C52757k.NONE, new C49585b(this, null));

    /* renamed from: d */
    public C48923a f124378d;

    /* renamed from: e */
    public final C49580e f124379e = new C49580e();

    /* renamed from: f */
    public int f124380f;

    /* renamed from: g */
    public final C12896b f124381g;

    /* renamed from: h */
    public final List<C49576a> f124382h;

    /* renamed from: i */
    private final C43859a f124383i = ((C43859a) mo23370j().mo23372a(C43859a.class));

    /* renamed from: j */
    private final C52668f f124384j = C52732g.m112286a(C52757k.NONE, new C49584a(this, null));

    /* renamed from: k */
    private SafeHandler f124385k;

    /* renamed from: l */
    private final C2765i<C49578c> f124386l = new C2765i<>();

    /* renamed from: m */
    private final C2762f<C49578c> f124387m = this.f124386l;

    /* renamed from: n */
    private final C2765i<Boolean> f124388n = new C2765i<>();

    /* renamed from: o */
    private final C2765i<Boolean> f124389o = new C2765i<>();

    /* renamed from: p */
    private final C2760e<Integer> f124390p = new C2760e<>(null);

    /* renamed from: q */
    private final C49596h f124391q = new C49596h(this.f124379e, this.f124383i.mo89401d());

    /* renamed from: r */
    private boolean f124392r;

    /* renamed from: s */
    private final C12361b f124393s;

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.g$a */
    public static final class C49584a extends C52712l implements C52670a<C45004a> {

        /* renamed from: a */
        final /* synthetic */ C12356a f124394a;

        /* renamed from: b */
        final /* synthetic */ String f124395b;

        public C49584a(C12356a aVar, String str) {
            this.f124394a = aVar;
            this.f124395b = str;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.shortvideo.ui.b.a, java.lang.Object] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v2, types: [com.ss.android.ugc.aweme.shortvideo.ui.b.a, java.lang.Object]
          assigns: [java.lang.Object]
          uses: [com.ss.android.ugc.aweme.shortvideo.ui.b.a]
          mth insns count: 6
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
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a invoke() {
            /*
                r3 = this;
                com.bytedance.m.a r0 = r3.f124394a
                com.bytedance.m.b r0 = r0.mo23370j()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ui.b.a> r1 = com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a.class
                java.lang.String r2 = r3.f124395b
                java.lang.Object r0 = r0.mo23373a(r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.recorder.p2465b.C49583g.C49584a.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.g$b */
    public static final class C49585b extends C52712l implements C52670a<ShortVideoContext> {

        /* renamed from: a */
        final /* synthetic */ C12356a f124396a;

        /* renamed from: b */
        final /* synthetic */ String f124397b;

        public C49585b(C12356a aVar, String str) {
            this.f124396a = aVar;
            this.f124397b = str;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, java.lang.Object] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v2, types: [com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, java.lang.Object]
          assigns: [java.lang.Object]
          uses: [com.ss.android.ugc.aweme.shortvideo.ShortVideoContext]
          mth insns count: 6
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
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext invoke() {
            /*
                r3 = this;
                com.bytedance.m.a r0 = r3.f124396a
                com.bytedance.m.b r0 = r0.mo23370j()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ShortVideoContext> r1 = com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext.class
                java.lang.String r2 = r3.f124397b
                java.lang.Object r0 = r0.mo23373a(r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.recorder.p2465b.C49583g.C49585b.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.g$c */
    static final class C49586c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12896b f124398a;

        /* renamed from: b */
        final /* synthetic */ C49582f f124399b;

        /* renamed from: c */
        final /* synthetic */ C49583g f124400c;

        /* renamed from: d */
        final /* synthetic */ C49576a f124401d;

        /* renamed from: e */
        final /* synthetic */ int f124402e;

        C49586c(C12896b bVar, C49582f fVar, C49583g gVar, C49576a aVar, int i) {
            this.f124398a = bVar;
            this.f124399b = fVar;
            this.f124400c = gVar;
            this.f124401d = aVar;
            this.f124402e = i;
        }

        public final void run() {
            C49583g.m106993a(this.f124398a, this.f124399b, true);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.g$d */
    static final class C49587d<T> implements C2767k<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C12896b f124403a;

        C49587d(C12896b bVar) {
            this.f124403a = bVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C52711k.m112236a((Object) bool, "it");
            if (bool.booleanValue()) {
                C12931a.m25973a(this.f124403a, "RecordBottomTabScene");
            } else {
                C12931a.m25974b(this.f124403a, "RecordBottomTabScene");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.g$e */
    static final class C49588e<T> implements C2767k<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49583g f124404a;

        /* renamed from: b */
        final /* synthetic */ C12896b f124405b;

        C49588e(C49583g gVar, C12896b bVar) {
            this.f124404a = gVar;
            this.f124405b = bVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            boolean z2;
            boolean z3;
            Boolean bool = (Boolean) obj;
            IAVSettingsService avSettingsService = AVServiceImpl.createIInternalAVServicebyMonsterPlugin().avSettingsService();
            C52711k.m112236a((Object) avSettingsService, "ServiceManager.get().get…java).avSettingsService()");
            if (avSettingsService.isXsSupport()) {
                boolean z4 = C49583g.m106990a(this.f124404a).mo96752c().f107058aJ;
                if (this.f124404a.f124380f > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z4 || z) {
                    C48415a aVar = (C48415a) this.f124405b.mo24388a("RecordXsEnterScene");
                    if (aVar == null || aVar.f121777i != 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (this.f124404a.f124380f == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    C52711k.m112236a((Object) bool, "it");
                    if (!bool.booleanValue()) {
                        C12931a.m25974b(this.f124405b, "RecordXsEnterScene");
                        C48415a aVar2 = (C48415a) this.f124405b.mo24388a("RecordXsEnterScene");
                        if (aVar2 != null) {
                            aVar2.f121778j = true;
                        }
                    } else if (z2 || z4 || !z3) {
                        C12931a.m25973a(this.f124405b, "RecordXsEnterScene");
                        C48415a aVar3 = (C48415a) this.f124405b.mo24388a("RecordXsEnterScene");
                        if (aVar3 != null) {
                            aVar3.f121778j = false;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.g$f */
    static final class C49589f extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49583g f124406a;

        /* renamed from: b */
        final /* synthetic */ C12896b f124407b;

        C49589f(C49583g gVar, C12896b bVar) {
            this.f124406a = gVar;
            this.f124407b = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f124406a.mo97498a(this.f124407b, this.f124406a.f124379e.f124364a);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.g$g */
    static final class C49590g extends C52712l implements C52671b<C48420d, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49583g f124408a;

        C49590g(C49583g gVar) {
            this.f124408a = gVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C48420d) obj, "event");
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.g$h */
    static final class C49591h<T> implements C2767k<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49583g f124409a;

        /* renamed from: b */
        final /* synthetic */ C12896b f124410b;

        /* renamed from: c */
        final /* synthetic */ C49582f f124411c;

        C49591h(C49583g gVar, C12896b bVar, C49582f fVar) {
            this.f124409a = gVar;
            this.f124410b = bVar;
            this.f124411c = fVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                bool.booleanValue();
                if (this.f124411c.f124374c != null) {
                    if (bool.booleanValue()) {
                        if (C52711k.m112239a((Object) this.f124411c.f124374c.mo49446F(), (Object) "RecordLiveScene")) {
                            if (!this.f124411c.f124374c.bd_()) {
                                Activity activity = this.f124410b.f33840g_;
                                if (activity != null) {
                                    ((VideoRecordNewActivity) activity).mo91193a(true, false);
                                } else {
                                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity");
                                }
                            } else {
                                Activity activity2 = this.f124410b.f33840g_;
                                if (activity2 != null) {
                                    ((VideoRecordNewActivity) activity2).f113800z = true;
                                } else {
                                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity");
                                }
                            }
                            if (this.f124409a.mo97488l() && this.f124409a.mo97490n()) {
                                this.f124409a.mo97481a(-1);
                            }
                        }
                        this.f124410b.mo24409d((C12924i) this.f124411c.f124374c);
                        this.f124411c.f124374c.mo49447G();
                        return;
                    }
                    if (C52711k.m112239a((Object) this.f124411c.f124374c.mo49446F(), (Object) "RecordLiveScene") && !this.f124411c.f124374c.bd_()) {
                        Activity activity3 = this.f124410b.f33840g_;
                        if (activity3 != null) {
                            ((VideoRecordNewActivity) activity3).mo91193a(false, true);
                        } else {
                            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity");
                        }
                    }
                    this.f124411c.f124374c.mo49448H();
                    this.f124410b.mo24404c((C12924i) this.f124411c.f124374c);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.g$i */
    static final class C49592i<T> implements C2767k<Integer> {

        /* renamed from: a */
        final /* synthetic */ C12896b f124412a;

        C49592i(C12896b bVar) {
            this.f124412a = bVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                int intValue = num.intValue();
                C12924i a = this.f124412a.mo24388a("RecordBottomTabScene");
                if (a == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) a, "findSceneByTag<RecordBot…cordBottomTabScene.TAG)!!");
                C49596h hVar = (C49596h) a;
                if (intValue == -1) {
                    String a2 = C47911gc.m103636a(R.string.d5h);
                    if (!TextUtils.isEmpty(a2)) {
                        LinearLayout F = hVar.mo97500F();
                        C52711k.m112236a((Object) F, "tabContainer");
                        if (F.getChildCount() > 0) {
                            int i = 0;
                            LinearLayout F2 = hVar.mo97500F();
                            C52711k.m112236a((Object) F2, "tabContainer");
                            int childCount = F2.getChildCount();
                            while (i < childCount) {
                                View childAt = hVar.mo97500F().getChildAt(i);
                                if (childAt != null && (childAt instanceof TabItemView)) {
                                    TabItemView tabItemView = (TabItemView) childAt;
                                    if (C52711k.m112239a((Object) a2, tabItemView.getTag())) {
                                        if (tabItemView.mo91956c()) {
                                            String str = "prop";
                                            ShortVideoContext shortVideoContext = hVar.f124419j;
                                            if (shortVideoContext == null) {
                                                C52711k.m112237a("shortVideoContext");
                                            }
                                            C44330b.m97098a(str, shortVideoContext.f107132y);
                                        } else {
                                            String str2 = "normal_type";
                                            ShortVideoContext shortVideoContext2 = hVar.f124419j;
                                            if (shortVideoContext2 == null) {
                                                C52711k.m112237a("shortVideoContext");
                                            }
                                            C44330b.m97098a(str2, shortVideoContext2.f107132y);
                                        }
                                        tabItemView.mo91955b();
                                    }
                                    i++;
                                }
                            }
                        }
                    }
                } else if (!C52711k.m112239a((Object) C47911gc.m103636a(R.string.d5h), hVar.mo97504J())) {
                    if (intValue == 1) {
                        hVar.mo97508a(C47911gc.m103636a(R.string.d5h), C47911gc.m103636a(R.string.t6));
                    } else if (intValue == 2) {
                        hVar.mo97508a(C47911gc.m103636a(R.string.d5h), C47911gc.m103636a(R.string.hbg));
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.g$j */
    static final class C49593j<T> implements C2767k<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C12896b f124413a;

        /* renamed from: b */
        final /* synthetic */ C52727e f124414b;

        C49593j(C12896b bVar, C52727e eVar) {
            this.f124413a = bVar;
            this.f124414b = eVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x0075  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0093  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onChanged(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                if (r9 == 0) goto L_0x0180
                r9.booleanValue()
                d.f.b.v$e r0 = r8.f124414b
                T r0 = r0.element
                com.ss.android.ugc.gamora.recorder.b.f r0 = (com.p683ss.android.ugc.gamora.recorder.p2465b.C49582f) r0
                com.ss.android.ugc.gamora.recorder.b.i r0 = r0.f124374c
                if (r0 != 0) goto L_0x0012
                return
            L_0x0012:
                com.bytedance.scene.group.b r0 = r8.f124413a
                java.lang.String r1 = "RecordBottomTabScene"
                com.bytedance.scene.i r0 = r0.mo24388a(r1)
                if (r0 != 0) goto L_0x001f
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x001f:
                java.lang.String r1 = "findSceneByTag<RecordBot…cordBottomTabScene.TAG)!!"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                com.ss.android.ugc.gamora.recorder.b.h r0 = (com.p683ss.android.ugc.gamora.recorder.p2465b.C49596h) r0
                boolean r9 = r9.booleanValue()
                r1 = 200(0xc8, double:9.9E-322)
                r3 = 1
                r4 = 2
                r5 = 0
                if (r9 == 0) goto L_0x00f5
                com.bytedance.scene.group.b r9 = r8.f124413a
                d.f.b.v$e r6 = r8.f124414b
                T r6 = r6.element
                com.ss.android.ugc.gamora.recorder.b.f r6 = (com.p683ss.android.ugc.gamora.recorder.p2465b.C49582f) r6
                com.ss.android.ugc.gamora.recorder.b.i r6 = r6.f124374c
                if (r6 != 0) goto L_0x0040
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0040:
                com.bytedance.scene.i r6 = (com.bytedance.scene.C12924i) r6
                r9.mo24409d(r6)
                d.f.b.v$e r9 = r8.f124414b
                T r9 = r9.element
                com.ss.android.ugc.gamora.recorder.b.f r9 = (com.p683ss.android.ugc.gamora.recorder.p2465b.C49582f) r9
                com.ss.android.ugc.gamora.recorder.b.i r9 = r9.f124374c
                if (r9 != 0) goto L_0x0052
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0052:
                r9.mo49447G()
                r0.f124423n = r5
                android.view.View r9 = r0.mo97501G()
                r6 = 4
                r9.setVisibility(r6)
                boolean r9 = r0.f124424o
                if (r9 == 0) goto L_0x0072
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r9 = r0.f124419j
                if (r9 != 0) goto L_0x006c
                java.lang.String r6 = "shortVideoContext"
                p2628d.p2639f.p2641b.C52711k.m112237a(r6)
            L_0x006c:
                boolean r9 = r9.f107058aJ
                if (r9 == 0) goto L_0x0072
                r9 = 1
                goto L_0x0073
            L_0x0072:
                r9 = 0
            L_0x0073:
                if (r9 == 0) goto L_0x0093
                r0.f124424o = r5
                com.ss.android.ugc.aweme.views.EdgeTransparentView r9 = r0.mo97502H()
                r1 = 0
                r9.setAlpha(r1)
                int r9 = r0.f124423n
                if (r9 != 0) goto L_0x017f
                com.ss.android.ugc.aweme.shortvideo.widget.TabHost r9 = r0.f124420k
                if (r9 != 0) goto L_0x008c
                java.lang.String r0 = "tabHost"
                p2628d.p2639f.p2641b.C52711k.m112237a(r0)
            L_0x008c:
                r0 = 8
                r9.setVisibility(r0)
                goto L_0x017f
            L_0x0093:
                android.animation.ObjectAnimator r9 = r0.f124422m
                if (r9 == 0) goto L_0x009a
                r9.cancel()
            L_0x009a:
                android.animation.ObjectAnimator r9 = r0.f124421l
                if (r9 == 0) goto L_0x00a1
                r9.cancel()
            L_0x00a1:
                java.lang.String r9 = "alpha"
                r6 = 3
                float[] r6 = new float[r6]
                r6 = {1065353216, 0, 0} // fill-array
                android.animation.PropertyValuesHolder r9 = android.animation.PropertyValuesHolder.ofFloat(r9, r6)
                java.lang.String r6 = "scaleX"
                float[] r7 = new float[r4]
                r7 = {1065353216, 0} // fill-array
                android.animation.PropertyValuesHolder r6 = android.animation.PropertyValuesHolder.ofFloat(r6, r7)
                com.ss.android.ugc.aweme.views.EdgeTransparentView r7 = r0.mo97502H()
                android.animation.PropertyValuesHolder[] r4 = new android.animation.PropertyValuesHolder[r4]
                r4[r5] = r9
                r4[r3] = r6
                android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r7, r4)
                r0.f124421l = r9
                android.animation.ObjectAnimator r9 = r0.f124421l
                if (r9 == 0) goto L_0x00d6
                com.ss.android.ugc.gamora.recorder.b.h$c r3 = new com.ss.android.ugc.gamora.recorder.b.h$c
                r3.<init>(r0)
                android.animation.Animator$AnimatorListener r3 = (android.animation.Animator.AnimatorListener) r3
                r9.addListener(r3)
            L_0x00d6:
                android.animation.ObjectAnimator r9 = r0.f124421l
                if (r9 == 0) goto L_0x00dd
                r9.setDuration(r1)
            L_0x00dd:
                android.animation.ObjectAnimator r9 = r0.f124421l
                if (r9 == 0) goto L_0x00eb
                com.ss.android.ugc.aweme.ai.a r1 = new com.ss.android.ugc.aweme.ai.a
                r1.<init>()
                android.animation.TimeInterpolator r1 = (android.animation.TimeInterpolator) r1
                r9.setInterpolator(r1)
            L_0x00eb:
                android.animation.ObjectAnimator r9 = r0.f124421l
                if (r9 == 0) goto L_0x00f4
                r9.start()
                goto L_0x017f
            L_0x00f4:
                return
            L_0x00f5:
                d.f.b.v$e r9 = r8.f124414b
                T r9 = r9.element
                com.ss.android.ugc.gamora.recorder.b.f r9 = (com.p683ss.android.ugc.gamora.recorder.p2465b.C49582f) r9
                com.ss.android.ugc.gamora.recorder.b.i r9 = r9.f124374c
                if (r9 != 0) goto L_0x0102
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0102:
                r9.mo49448H()
                com.bytedance.scene.group.b r9 = r8.f124413a
                d.f.b.v$e r6 = r8.f124414b
                T r6 = r6.element
                com.ss.android.ugc.gamora.recorder.b.f r6 = (com.p683ss.android.ugc.gamora.recorder.p2465b.C49582f) r6
                com.ss.android.ugc.gamora.recorder.b.i r6 = r6.f124374c
                if (r6 != 0) goto L_0x0114
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0114:
                com.bytedance.scene.i r6 = (com.bytedance.scene.C12924i) r6
                r9.mo24404c(r6)
                r0.f124423n = r3
                com.ss.android.ugc.aweme.shortvideo.widget.TabHost r9 = r0.f124420k
                if (r9 != 0) goto L_0x0124
                java.lang.String r6 = "tabHost"
                p2628d.p2639f.p2641b.C52711k.m112237a(r6)
            L_0x0124:
                r9.setVisibility(r5)
                android.view.View r9 = r0.mo97501G()
                r9.setVisibility(r5)
                android.animation.ObjectAnimator r9 = r0.f124422m
                if (r9 == 0) goto L_0x0135
                r9.cancel()
            L_0x0135:
                android.animation.ObjectAnimator r9 = r0.f124421l
                if (r9 == 0) goto L_0x013c
                r9.cancel()
            L_0x013c:
                java.lang.String r9 = "alpha"
                float[] r6 = new float[r4]
                r6 = {0, 1065353216} // fill-array
                android.animation.PropertyValuesHolder r9 = android.animation.PropertyValuesHolder.ofFloat(r9, r6)
                java.lang.String r6 = "scaleX"
                float[] r7 = new float[r4]
                r7 = {0, 1065353216} // fill-array
                android.animation.PropertyValuesHolder r6 = android.animation.PropertyValuesHolder.ofFloat(r6, r7)
                com.ss.android.ugc.aweme.views.EdgeTransparentView r7 = r0.mo97502H()
                android.animation.PropertyValuesHolder[] r4 = new android.animation.PropertyValuesHolder[r4]
                r4[r5] = r9
                r4[r3] = r6
                android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r7, r4)
                r0.f124422m = r9
                android.animation.ObjectAnimator r9 = r0.f124422m
                if (r9 == 0) goto L_0x0169
                r9.setDuration(r1)
            L_0x0169:
                android.animation.ObjectAnimator r9 = r0.f124422m
                if (r9 == 0) goto L_0x0177
                com.ss.android.ugc.aweme.ai.a r1 = new com.ss.android.ugc.aweme.ai.a
                r1.<init>()
                android.animation.TimeInterpolator r1 = (android.animation.TimeInterpolator) r1
                r9.setInterpolator(r1)
            L_0x0177:
                android.animation.ObjectAnimator r9 = r0.f124422m
                if (r9 == 0) goto L_0x017f
                r9.start()
                return
            L_0x017f:
                return
            L_0x0180:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.recorder.p2465b.C49583g.C49593j.onChanged(java.lang.Object):void");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.g$k */
    static final class C49594k<T> implements C2767k<C49578c> {

        /* renamed from: a */
        final /* synthetic */ C49583g f124415a;

        C49594k(C49583g gVar) {
            this.f124415a = gVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C49578c cVar = (C49578c) obj;
            C49583g gVar = this.f124415a;
            C52711k.m112236a((Object) cVar, "event");
            C52711k.m112240b(cVar, "event");
            String str = "";
            if (TextUtils.equals(str, "")) {
                for (C49582f fVar : gVar.f124379e.f124364a) {
                    Object obj2 = cVar.f124357c;
                    if (obj2 == null) {
                        throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
                    } else if (TextUtils.equals((CharSequence) obj2, fVar.f124373b.f124360c)) {
                        str = fVar.f124373b.f124361d;
                    }
                }
            }
            CharSequence charSequence = str;
            if (!TextUtils.equals(charSequence, "")) {
                C48923a aVar = gVar.f124378d;
                if (aVar == null) {
                    C52711k.m112237a("recordEnv");
                }
                C0209x a = C0214z.m440a(aVar.mo96751b()).mo359a(ShortVideoContextViewModel.class);
                C52711k.m112236a((Object) a, "ViewModelProviders.of(re…extViewModel::class.java)");
                ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f107134a;
                C48923a aVar2 = gVar.f124378d;
                if (aVar2 == null) {
                    C52711k.m112237a("recordEnv");
                }
                FragmentActivity b = aVar2.mo96751b();
                if (TextUtils.equals(charSequence, "video_60") || TextUtils.equals(charSequence, "video_15")) {
                    C43214dh a2 = C43214dh.m94817a();
                    C52711k.m112236a((Object) a2, "PublishManager.inst()");
                    C43804f fVar2 = a2.f109289d;
                    if (fVar2 != null && !fVar2.f110931h) {
                        C10691a.m21548c((Context) b, (int) R.string.gtq).mo19066a();
                        C26890h.m65011a("show_task_activity_warn_toast", C23089d.m56640a().mo47829a("toast_type", "8").mo47829a("task_id", fVar2.f110924a).f61491a);
                    }
                }
                C26890h.m65011a("change_record_mode", C23089d.m56640a().mo47829a("creation_id", shortVideoContext.f107131x).mo47829a("shoot_way", shortVideoContext.f107132y).mo47826a("draft_id", shortVideoContext.f107022A).mo47829a("enter_from", "video_shoot_page").mo47829a("to_status", str).f61491a);
            }
            if (TextUtils.equals((CharSequence) cVar.f124356b, C49583g.m106990a(this.f124415a).mo96751b().getString(R.string.d5h))) {
                Object obj3 = cVar.f124357c;
                if (obj3 == null) {
                    throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
                } else if (!TextUtils.equals((CharSequence) obj3, C49583g.m106990a(this.f124415a).mo96751b().getString(R.string.d5h))) {
                    C49860a aVar3 = (C49860a) C2755a.m7851a(C49583g.m106990a(this.f124415a).mo96751b()).mo7341b(C49860a.class);
                    if (aVar3 != null) {
                        aVar3.mo97688a(true);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.g$l */
    static final class C49595l<T> implements C2767k<C47337r> {

        /* renamed from: a */
        final /* synthetic */ C49583g f124416a;

        C49595l(C49583g gVar) {
            this.f124416a = gVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C47337r rVar = (C47337r) obj;
            if (!rVar.f119493b.isEmpty() || rVar.f119494c != 0) {
                this.f124416a.mo97483a(false);
                this.f124416a.mo97484b(false);
            } else if (!((ShortVideoContext) this.f124416a.f124377c.getValue()).f107122o && rVar.f119496e) {
                this.f124416a.mo97483a(true);
                this.f124416a.mo97484b(true);
            }
        }
    }

    /* renamed from: e */
    public final C2762f<C49578c> mo97485e() {
        return this.f124387m;
    }

    /* renamed from: j */
    public final C12361b mo23370j() {
        return this.f124393s;
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

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2759d mo7353a() {
        return this.f124376b;
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R mo22552a(VM1 vm1, C52671b<? super S1, ? extends R> bVar) {
        C52711k.m112240b(vm1, "viewModel1");
        C52711k.m112240b(bVar, "block");
        return C49549a.m106924a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final void mo97483a(boolean z) {
        this.f124388n.mo7350a(Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final void mo97481a(int i) {
        this.f124390p.mo7345a(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo97498a(C12896b bVar, List<C49582f> list) {
        Object obj;
        if (!this.f124392r) {
            this.f124392r = true;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C49582f) obj).f124373b.f124362e) {
                    break;
                }
            }
            C49582f fVar = (C49582f) obj;
            if (fVar != null) {
                m106993a(bVar, fVar, false);
                this.f124379e.mo97496a();
            }
        }
    }

    /* renamed from: a */
    public final void mo97482a(int i, C49576a aVar, int i2) {
        Object obj;
        C52711k.m112240b(aVar, "bottomTab");
        C12896b bVar = this.f124381g;
        Iterator it = this.f124379e.f124364a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String str = ((C49582f) obj).f124373b.f124360c;
            C48923a aVar2 = this.f124378d;
            if (aVar2 == null) {
                C52711k.m112237a("recordEnv");
            }
            if (C52711k.m112239a((Object) str, (Object) aVar.mo49418b(aVar2).f124360c)) {
                break;
            }
        }
        if (((C49582f) obj) == null) {
            C49580e eVar = this.f124379e;
            C48923a aVar3 = this.f124378d;
            if (aVar3 == null) {
                C52711k.m112237a("recordEnv");
            }
            C52711k.m112240b(aVar3, "recordEnv");
            C52711k.m112240b(aVar, "bottomTab");
            aVar.mo49417a(aVar3);
            C49582f fVar = new C49582f(aVar.mo49418b(aVar3), aVar.mo49416a());
            eVar.f124364a.add(i, fVar);
            String str2 = fVar.f124373b.f124359b;
            String str3 = fVar.f124373b.f124360c;
            if (C47842ed.m103485a(aVar3.mo96751b())) {
                TabHost tabHost = eVar.f124369f;
                if (tabHost == null) {
                    C52711k.m112237a("bottomTabHost");
                }
                int tabCount = tabHost.getTabCount() - i;
                C44450b bVar2 = eVar.f124368e;
                if (bVar2 == null) {
                    C52711k.m112237a("tabConfig");
                }
                bVar2.mo90337a(tabCount, str2, str3);
                TabHost tabHost2 = eVar.f124369f;
                if (tabHost2 == null) {
                    C52711k.m112237a("bottomTabHost");
                }
                tabHost2.requestLayout();
                TabHost tabHost3 = eVar.f124369f;
                if (tabHost3 == null) {
                    C52711k.m112237a("bottomTabHost");
                }
                if (tabCount < tabHost3.getCurrentIndex()) {
                    TabHost tabHost4 = eVar.f124369f;
                    if (tabHost4 == null) {
                        C52711k.m112237a("bottomTabHost");
                    }
                    TabHost tabHost5 = eVar.f124369f;
                    if (tabHost5 == null) {
                        C52711k.m112237a("bottomTabHost");
                    }
                    int currentIndex = tabHost5.getCurrentIndex() + 1;
                    TabHost tabHost6 = eVar.f124369f;
                    if (tabHost6 == null) {
                        C52711k.m112237a("bottomTabHost");
                    }
                    tabHost4.mo91936b(Math.min(currentIndex, tabHost6.getTabCount() - 1), true);
                }
            } else {
                C44450b bVar3 = eVar.f124368e;
                if (bVar3 == null) {
                    C52711k.m112237a("tabConfig");
                }
                bVar3.mo90337a(i, str2, str3);
                TabHost tabHost7 = eVar.f124369f;
                if (tabHost7 == null) {
                    C52711k.m112237a("bottomTabHost");
                }
                tabHost7.requestLayout();
            }
            m106992a(bVar, fVar);
            C49604i iVar = fVar.f124374c;
            if (iVar != null) {
                C12931a.m25972a(bVar, R.id.c_r, iVar, iVar.mo49446F());
            }
            if (fVar.f124373b.f124362e) {
                SafeHandler safeHandler = this.f124385k;
                if (safeHandler == null) {
                    C52711k.m112237a("safeHandler");
                }
                C49586c cVar = new C49586c(bVar, fVar, this, aVar, i);
                safeHandler.postDelayed(cVar, 500);
            }
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

    /* renamed from: g */
    public final int mo97486g() {
        return this.f124379e.f124364a.size();
    }

    /* renamed from: o */
    public final boolean mo97491o() {
        if (!getLifecycle().mo323a().isAtLeast(C0178b.CREATED)) {
            return false;
        }
        return this.f124391q.mo97503I();
    }

    /* renamed from: k */
    public final String mo97487k() {
        C49580e eVar = this.f124379e;
        TabHost tabHost = eVar.f124369f;
        if (tabHost == null) {
            C52711k.m112237a("bottomTabHost");
        }
        TabHost tabHost2 = eVar.f124369f;
        if (tabHost2 == null) {
            C52711k.m112237a("bottomTabHost");
        }
        Object a = tabHost.mo91934a(tabHost2.getCurrentIndex());
        if (a != null) {
            return (String) a;
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.String");
    }

    /* renamed from: l */
    public final boolean mo97488l() {
        String str;
        boolean z = false;
        if (C9979b.m20068a(this.f124379e.f124364a)) {
            return false;
        }
        for (C49582f fVar : this.f124379e.f124364a) {
            String str2 = "RecordLiveScene";
            C49604i iVar = fVar.f124374c;
            if (iVar != null) {
                str = iVar.mo49446F();
            } else {
                str = null;
            }
            if (C52711k.m112239a((Object) str2, (Object) str)) {
                z = fVar.f124374c.be_();
            }
        }
        return z;
    }

    /* renamed from: m */
    public final boolean mo97489m() {
        String str;
        boolean z = false;
        if (C9979b.m20068a(this.f124379e.f124364a)) {
            return false;
        }
        for (C49582f fVar : this.f124379e.f124364a) {
            String str2 = "RecordLiveScene";
            C49604i iVar = fVar.f124374c;
            if (iVar != null) {
                str = iVar.mo49446F();
            } else {
                str = null;
            }
            if (C52711k.m112239a((Object) str2, (Object) str)) {
                z = fVar.f124374c.bf_();
            }
        }
        return z;
    }

    /* renamed from: n */
    public final boolean mo97490n() {
        String str;
        boolean z = false;
        if (C9979b.m20068a(this.f124379e.f124364a)) {
            return false;
        }
        for (C49582f fVar : this.f124379e.f124364a) {
            String str2 = "RecordLiveScene";
            C49604i iVar = fVar.f124374c;
            if (iVar != null) {
                str = iVar.mo49446F();
            } else {
                str = null;
            }
            if (C52711k.m112239a((Object) str2, (Object) str)) {
                z = fVar.f124374c.mo94360M();
            }
        }
        return z;
    }

    public final void bO_() {
        super.bO_();
        C12896b bVar = this.f124381g;
        Object a = bVar.mo24460E().mo24560a("record_env_context");
        if (a == null) {
            C52711k.m112234a();
        }
        this.f124378d = (C48923a) a;
        Object a2 = bVar.mo24460E().mo24560a("safe_handler");
        if (a2 == null) {
            C52711k.m112234a();
        }
        this.f124385k = (SafeHandler) a2;
        C49580e eVar = this.f124379e;
        C48923a aVar = this.f124378d;
        if (aVar == null) {
            C52711k.m112237a("recordEnv");
        }
        List<C49576a> list = this.f124382h;
        C2765i<C49578c> iVar = this.f124386l;
        C52711k.m112240b(aVar, "recordEnv");
        C52711k.m112240b(list, "bottoms");
        C52711k.m112240b(iVar, "bottomTabIndexChangeEvent");
        eVar.f124367d = iVar;
        Iterable iterable = list;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            if (!(((C49576a) next) instanceof C48417b)) {
                arrayList.add(next);
            }
        }
        for (C49576a aVar2 : (List) arrayList) {
            aVar2.mo49417a(aVar);
            eVar.f124364a.add(new C49582f(aVar2.mo49418b(aVar), aVar2.mo49416a()));
        }
        Collection arrayList2 = new ArrayList();
        for (Object next2 : iterable) {
            if (next2 instanceof C48417b) {
                arrayList2.add(next2);
            }
        }
        for (C48417b bVar2 : (List) arrayList2) {
            bVar2.mo49417a(aVar);
            eVar.f124366c = new C49582f(bVar2.mo49418b(aVar), bVar2.mo49416a());
        }
        List<C49582f> list2 = this.f124379e.f124364a;
        for (C49582f fVar : list2) {
            if (fVar.f124374c != null) {
                C12931a.m25972a(this.f124381g, R.id.c_q, fVar.f124374c, fVar.f124374c.mo49446F());
            }
        }
        this.f124381g.mo24389a((int) R.id.c_q, (C12924i) this.f124391q, "RecordBottomTabScene");
        m106995b(this.f124381g, list2);
        C12896b bVar3 = this.f124381g;
        C49582f fVar2 = this.f124379e.f124366c;
        C12924i a3 = bVar3.mo24388a("RecordBottomTabScene");
        if (a3 == null) {
            C52711k.m112234a();
        }
        C52711k.m112236a((Object) a3, "findSceneByTag<RecordBot…cordBottomTabScene.TAG)!!");
        C49596h hVar = (C49596h) a3;
        if (fVar2 == null) {
            hVar.f124425p = false;
        } else {
            Activity activity = bVar3.f33840g_;
            if (activity != null) {
                C48415a aVar3 = new C48415a((FragmentActivity) activity, this.f124379e, this.f124383i.mo89401d(), new C49589f(this, bVar3), new C49590g(this));
                C48923a aVar4 = this.f124378d;
                if (aVar4 == null) {
                    C52711k.m112237a("recordEnv");
                }
                if (aVar4.mo96752c().f107058aJ) {
                    bVar3.mo24389a((int) R.id.c_q, (C12924i) aVar3, "RecordXsEnterScene");
                } else {
                    C12931a.m25972a(bVar3, R.id.c_q, aVar3, "RecordXsEnterScene");
                }
                if (fVar2.f124374c != null) {
                    C49604i iVar2 = fVar2.f124374c;
                    C12924i iVar3 = iVar2.f33835c;
                    if (iVar3 != null) {
                        if (!(iVar3 instanceof C12896b)) {
                            iVar3 = null;
                        }
                        C12896b bVar4 = (C12896b) iVar3;
                        if (bVar4 != null) {
                            bVar4.mo24399b((C12924i) iVar2);
                        }
                    }
                    C12931a.m25972a(bVar3, R.id.c_q, fVar2.f124374c, fVar2.f124374c.mo49446F());
                }
                m106991a(bVar3);
            } else {
                throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
        }
        C12896b bVar5 = this.f124381g;
        C48923a aVar5 = this.f124378d;
        if (aVar5 == null) {
            C52711k.m112237a("recordEnv");
        }
        boolean z = true;
        if (!aVar5.mo96752c().f107058aJ || this.f124379e.f124366c == null) {
            z = false;
        } else {
            C48923a aVar6 = this.f124378d;
            if (aVar6 == null) {
                C52711k.m112237a("recordEnv");
            }
            if (C52711k.m112239a((Object) aVar6.mo96752c().f107059aK, (Object) "homepage_fresh")) {
                bVar5.mo24388a("RecordXsEnterScene");
            } else {
                bVar5.mo24388a("RecordXsEnterScene");
            }
            new C48420d(this.f124379e.f124365b, true);
        }
        if (!z) {
            mo97498a(bVar5, list2);
        }
        C0184k kVar = this;
        mo97485e().mo7349a(kVar, new C49594k(this));
        ((C45004a) this.f124384j.getValue()).mo91295A().mo7349a(kVar, new C49595l(this));
    }

    /* renamed from: a */
    public static final /* synthetic */ C48923a m106990a(C49583g gVar) {
        C48923a aVar = gVar.f124378d;
        if (aVar == null) {
            C52711k.m112237a("recordEnv");
        }
        return aVar;
    }

    /* renamed from: b */
    public final void mo97484b(boolean z) {
        this.f124389o.mo7350a(Boolean.valueOf(z));
    }

    /* renamed from: a */
    private final void m106991a(C12896b bVar) {
        C52727e eVar = new C52727e();
        T t = this.f124379e.f124366c;
        if (t != null) {
            eVar.element = t;
            C49582f fVar = (C49582f) eVar.element;
            if (fVar == null) {
                C52711k.m112234a();
            }
            fVar.f124372a.observe(bVar.mo24479x(), new C49593j(bVar, eVar));
        }
    }

    /* renamed from: a */
    private final void m106992a(C12896b bVar, C49582f fVar) {
        fVar.f124372a.observe(bVar.mo24479x(), new C49591h(this, bVar, fVar));
    }

    /* renamed from: b */
    private final void m106995b(C12896b bVar, List<C49582f> list) {
        Object obj;
        Iterable<C49582f> iterable = list;
        for (C49582f a : iterable) {
            m106992a(bVar, a);
        }
        C0184k kVar = bVar;
        this.f124388n.mo7349a(kVar, new C49587d(bVar));
        this.f124389o.mo7349a(kVar, new C49588e(this, bVar));
        Iterator it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C49582f) obj).f124373b.f124362e) {
                break;
            }
        }
        C49582f fVar = (C49582f) obj;
        if (fVar != null) {
            m106993a(bVar, fVar, true);
        }
        C48923a aVar = this.f124378d;
        if (aVar == null) {
            C52711k.m112237a("recordEnv");
        }
        if (C44321a.m97076a(aVar.mo96752c().f107056aH, mo97488l())) {
            this.f124390p.mo7352a(kVar, new C49592i(bVar));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m106993a(C12896b bVar, C49582f fVar, boolean z) {
        C12924i a = bVar.mo24388a("RecordBottomTabScene");
        if (a == null) {
            C52711k.m112234a();
        }
        C52711k.m112236a((Object) a, "findSceneByTag<RecordBot…cordBottomTabScene.TAG)!!");
        C49596h hVar = (C49596h) a;
        int a2 = hVar.mo97505a((Object) fVar.f124373b.f124360c);
        if (a2 >= 0) {
            hVar.mo97506a(a2, false, z);
        }
    }

    public C49583g(C12896b bVar, C12361b bVar2, List<? extends C49576a> list) {
        C52711k.m112240b(bVar, "parentScene");
        C52711k.m112240b(bVar2, "diContainer");
        C52711k.m112240b(list, "bottoms");
        this.f124381g = bVar;
        this.f124393s = bVar2;
        this.f124382h = list;
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
}
