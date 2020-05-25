package com.p683ss.android.ugc.gamora.recorder.p2467d;

import android.arch.lifecycle.C0184k;
import com.bytedance.als.C2759d;
import com.bytedance.als.C2760e;
import com.bytedance.als.C2764h;
import com.bytedance.als.C2767k;
import com.bytedance.p780m.C12356a;
import com.bytedance.p780m.C12361b;
import com.bytedance.scene.group.C12896b;
import com.bytedance.scene.ktx.C12931a;
import com.p683ss.android.ugc.aweme.shortvideo.C43225dr;
import com.p683ss.android.ugc.aweme.shortvideo.p2203g.C43859a;
import com.p683ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p683ss.android.ugc.aweme.tools.C47065j;
import com.p683ss.android.ugc.gamora.recorder.p2480n.C49912d;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.gamora.recorder.d.b */
public final class C49649b extends C2764h<C49648a> implements C12356a, C49648a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f124525a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49649b.class), "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49649b.class), "speedApiComponent", "getSpeedApiComponent()Lcom/ss/android/ugc/gamora/recorder/speed/SpeedApiComponent;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49649b.class), "ownerHost", "getOwnerHost()Lcom/ss/android/ugc/aweme/shortvideo/RecordingOperationPanelScene;"))};

    /* renamed from: b */
    public final C49648a f124526b = this;

    /* renamed from: c */
    public boolean f124527c;

    /* renamed from: d */
    public final C12896b f124528d;

    /* renamed from: e */
    private final C52668f f124529e = C52732g.m112286a(C52757k.NONE, new C49650a(this, null));

    /* renamed from: f */
    private final C52668f f124530f = C52732g.m112286a(C52757k.NONE, new C49651b(this, null));

    /* renamed from: g */
    private final C52668f f124531g = C52732g.m112285a(new C49654e(this));

    /* renamed from: h */
    private final C2760e<Boolean> f124532h = new C2760e<>(Boolean.valueOf(true));

    /* renamed from: i */
    private final C12361b f124533i;

    /* renamed from: com.ss.android.ugc.gamora.recorder.d.b$a */
    public static final class C49650a extends C52712l implements C52670a<C43859a> {

        /* renamed from: a */
        final /* synthetic */ C12356a f124534a;

        /* renamed from: b */
        final /* synthetic */ String f124535b;

        public C49650a(C12356a aVar, String str) {
            this.f124534a = aVar;
            this.f124535b = str;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.shortvideo.g.a, java.lang.Object] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v2, types: [com.ss.android.ugc.aweme.shortvideo.g.a, java.lang.Object]
          assigns: [java.lang.Object]
          uses: [com.ss.android.ugc.aweme.shortvideo.g.a]
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
        public final com.p683ss.android.ugc.aweme.shortvideo.p2203g.C43859a invoke() {
            /*
                r3 = this;
                com.bytedance.m.a r0 = r3.f124534a
                com.bytedance.m.b r0 = r0.mo23370j()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.g.a> r1 = com.p683ss.android.ugc.aweme.shortvideo.p2203g.C43859a.class
                java.lang.String r2 = r3.f124535b
                java.lang.Object r0 = r0.mo23373a(r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.recorder.p2467d.C49649b.C49650a.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.d.b$b */
    public static final class C49651b extends C52712l implements C52670a<C49912d> {

        /* renamed from: a */
        final /* synthetic */ C12356a f124536a;

        /* renamed from: b */
        final /* synthetic */ String f124537b;

        public C49651b(C12356a aVar, String str) {
            this.f124536a = aVar;
            this.f124537b = str;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, com.ss.android.ugc.gamora.recorder.n.d] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v2, types: [java.lang.Object, com.ss.android.ugc.gamora.recorder.n.d]
          assigns: [java.lang.Object]
          uses: [com.ss.android.ugc.gamora.recorder.n.d]
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
        public final com.p683ss.android.ugc.gamora.recorder.p2480n.C49912d invoke() {
            /*
                r3 = this;
                com.bytedance.m.a r0 = r3.f124536a
                com.bytedance.m.b r0 = r0.mo23370j()
                java.lang.Class<com.ss.android.ugc.gamora.recorder.n.d> r1 = com.p683ss.android.ugc.gamora.recorder.p2480n.C49912d.class
                java.lang.String r2 = r3.f124537b
                java.lang.Object r0 = r0.mo23373a(r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.recorder.p2467d.C49649b.C49651b.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.d.b$c */
    static final class C49652c<T> implements C2767k<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49649b f124538a;

        C49652c(C49649b bVar) {
            this.f124538a = bVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            this.f124538a.mo97554h();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.d.b$d */
    static final class C49653d<T> implements C2767k<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49649b f124539a;

        C49653d(C49649b bVar) {
            this.f124539a = bVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C49649b bVar = this.f124539a;
            C52711k.m112236a((Object) bool, "it");
            bVar.f124527c = bool.booleanValue();
            this.f124539a.mo97554h();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.d.b$e */
    static final class C49654e extends C52712l implements C52670a<C43225dr> {

        /* renamed from: a */
        final /* synthetic */ C49649b f124540a;

        C49654e(C49649b bVar) {
            this.f124540a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object a = this.f124540a.f124528d.mo24460E().mo24560a("owner");
            if (a == null) {
                C52711k.m112234a();
            }
            return (C43225dr) a;
        }
    }

    /* renamed from: i */
    private final C43859a m107146i() {
        return (C43859a) this.f124529e.getValue();
    }

    /* renamed from: k */
    private final C43225dr m107147k() {
        return (C43225dr) this.f124531g.getValue();
    }

    /* renamed from: j */
    public final C12361b mo23370j() {
        return this.f124533i;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2759d mo7353a() {
        return this.f124526b;
    }

    public final void bO_() {
        super.bO_();
        C12931a.m25972a(this.f124528d, R.id.c_q, new C49655c(m107146i().mo89401d()), "RecordCommerceTagScene");
        C0184k kVar = this;
        this.f124532h.mo7352a(kVar, new C49652c(this));
        m107146i().mo89399c().mo7352a(kVar, new C49653d(this));
    }

    /* renamed from: c */
    public final void mo97553c() {
        boolean z;
        C43225dr k = m107147k();
        C52711k.m112236a((Object) k, "ownerHost");
        FaceStickerBean L = k.mo87885L();
        if (L != null) {
            z = L.shouldShowCommerceStickerTag();
        } else {
            z = false;
        }
        if (z) {
            ((C49912d) this.f124530f.getValue()).mo97721a(false);
        }
        mo97554h();
    }

    /* renamed from: h */
    public final void mo97554h() {
        boolean z;
        C43225dr k = m107147k();
        C52711k.m112236a((Object) k, "ownerHost");
        FaceStickerBean L = k.mo87885L();
        if (L != null) {
            z = L.shouldShowCommerceStickerTag();
        } else {
            z = false;
        }
        if (this.f124527c && z) {
            Object a = this.f124532h.mo7351a();
            C52711k.m112236a(a, "commerceTagCanShow.value");
            if (((Boolean) a).booleanValue()) {
                C49655c cVar = (C49655c) this.f124528d.mo24388a("RecordCommerceTagScene");
                if (cVar != null) {
                    C43225dr k2 = m107147k();
                    C52711k.m112236a((Object) k2, "ownerHost");
                    FaceStickerBean L2 = k2.mo87885L();
                    C43225dr k3 = m107147k();
                    C52711k.m112236a((Object) k3, "ownerHost");
                    cVar.mo97555a(new C47065j(0, L2, k3.mo87884K().f107132y));
                }
                return;
            }
        }
        C12931a.m25974b(this.f124528d, "RecordCommerceTagScene");
    }

    /* renamed from: a */
    public final void mo97552a(boolean z) {
        this.f124532h.mo7345a(Boolean.valueOf(z));
    }

    public C49649b(C12896b bVar, C12361b bVar2) {
        C52711k.m112240b(bVar, "parent");
        C52711k.m112240b(bVar2, "diContainer");
        this.f124528d = bVar;
        this.f124533i = bVar2;
    }
}
