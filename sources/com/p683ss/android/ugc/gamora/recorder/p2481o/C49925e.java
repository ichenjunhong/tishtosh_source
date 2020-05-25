package com.p683ss.android.ugc.gamora.recorder.p2481o;

import android.content.Context;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.google.p1057b.p1058a.C17437s;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.effectplatform.C29242c;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.C42437ay;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45324z;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p683ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48701f;
import com.p683ss.android.ugc.gamora.recorder.p2481o.C49917c.C49919b;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.gamora.recorder.o.e */
public final class C49925e {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f125097a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49925e.class), "effectPlatform", "getEffectPlatform()Lcom/ss/android/ugc/aweme/effectplatform/IEffectPlatform;"))};

    /* renamed from: b */
    public ViewGroup f125098b;

    /* renamed from: c */
    public ViewGroup f125099c;

    /* renamed from: d */
    public ViewGroup f125100d;

    /* renamed from: e */
    public OnClickListener f125101e;

    /* renamed from: f */
    public C49917c f125102f;

    /* renamed from: g */
    public C49917c f125103g;

    /* renamed from: h */
    public C49917c f125104h;

    /* renamed from: i */
    public final List<C49923d> f125105i = new ArrayList();

    /* renamed from: j */
    public final List<C49923d> f125106j = new ArrayList();

    /* renamed from: k */
    public final List<C49923d> f125107k = new ArrayList();

    /* renamed from: l */
    public C49919b f125108l;

    /* renamed from: m */
    public C52847n<Integer, Integer> f125109m;

    /* renamed from: n */
    public C52847n<Integer, Integer> f125110n;

    /* renamed from: o */
    public final FrameLayout f125111o;

    /* renamed from: p */
    private final C52668f f125112p = C52732g.m112285a(new C49926a(this));

    /* renamed from: q */
    private C52847n<Integer, ? extends ViewGroup> f125113q = new C52847n<>(Integer.valueOf(-1), null);

    /* renamed from: com.ss.android.ugc.gamora.recorder.o.e$a */
    static final class C49926a extends C52712l implements C52670a<C29252f> {

        /* renamed from: a */
        final /* synthetic */ C49925e f125114a;

        C49926a(C49925e eVar) {
            this.f125114a = eVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Context context = this.f125114a.f125111o.getContext();
            C52711k.m112236a((Object) context, "parentView.context");
            return C29242c.m68869a(context, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.o.e$b */
    public static final class C49927b implements C49919b {

        /* renamed from: a */
        final /* synthetic */ C49925e f125115a;

        C49927b(C49925e eVar) {
            this.f125115a = eVar;
        }

        /* renamed from: a */
        public final void mo97340a(C49923d dVar, int i) {
            C52711k.m112240b(dVar, "model");
            C49919b bVar = this.f125115a.f125108l;
            if (bVar != null) {
                bVar.mo97340a(dVar, i);
            }
            this.f125115a.f125110n = new C52847n<>(Integer.valueOf(0), Integer.valueOf(i));
            C49917c cVar = this.f125115a.f125104h;
            if (cVar != null) {
                cVar.mo97726b();
            }
            C49917c cVar2 = this.f125115a.f125103g;
            if (cVar2 != null) {
                cVar2.mo97726b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.o.e$c */
    static final class C49928c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C49925e f125116a;

        C49928c(C49925e eVar) {
            this.f125116a = eVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            ViewGroup viewGroup = this.f125116a.f125098b;
            if (viewGroup != null) {
                View findViewById = viewGroup.findViewById(R.id.eil);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
            }
            this.f125116a.mo97729a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.o.e$d */
    public static final class C49929d implements C49919b {

        /* renamed from: a */
        final /* synthetic */ C49925e f125117a;

        C49929d(C49925e eVar) {
            this.f125117a = eVar;
        }

        /* renamed from: a */
        public final void mo97340a(C49923d dVar, int i) {
            C52711k.m112240b(dVar, "model");
            C49919b bVar = this.f125117a.f125108l;
            if (bVar != null) {
                bVar.mo97340a(dVar, i);
            }
            this.f125117a.f125110n = new C52847n<>(Integer.valueOf(1), Integer.valueOf(i));
            C49917c cVar = this.f125117a.f125102f;
            if (cVar != null) {
                cVar.mo97726b();
            }
            C49917c cVar2 = this.f125117a.f125104h;
            if (cVar2 != null) {
                cVar2.mo97726b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.o.e$e */
    static final class C49930e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C49925e f125118a;

        C49930e(C49925e eVar) {
            this.f125118a = eVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            ViewGroup viewGroup = this.f125118a.f125099c;
            if (viewGroup != null) {
                View findViewById = viewGroup.findViewById(R.id.eil);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
            }
            this.f125118a.mo97731b();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.o.e$f */
    public static final class C49931f implements C49919b {

        /* renamed from: a */
        final /* synthetic */ C49925e f125119a;

        C49931f(C49925e eVar) {
            this.f125119a = eVar;
        }

        /* renamed from: a */
        public final void mo97340a(C49923d dVar, int i) {
            C52711k.m112240b(dVar, "model");
            C49919b bVar = this.f125119a.f125108l;
            if (bVar != null) {
                bVar.mo97340a(dVar, i);
            }
            this.f125119a.f125110n = new C52847n<>(Integer.valueOf(2), Integer.valueOf(i));
            C49917c cVar = this.f125119a.f125102f;
            if (cVar != null) {
                cVar.mo97726b();
            }
            C49917c cVar2 = this.f125119a.f125103g;
            if (cVar2 != null) {
                cVar2.mo97726b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.o.e$g */
    static final class C49932g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C49925e f125120a;

        C49932g(C49925e eVar) {
            this.f125120a = eVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            ViewGroup viewGroup = this.f125120a.f125100d;
            if (viewGroup != null) {
                View findViewById = viewGroup.findViewById(R.id.eil);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
            }
            this.f125120a.mo97732c();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.o.e$h */
    static final class C49933h<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C49925e f125121a;

        C49933h(C49925e eVar) {
            this.f125121a = eVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0067 A[LOOP:1: B:20:0x0065->B:21:0x0067, LOOP_END] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object call() {
            /*
                r8 = this;
                com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.a r0 = com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.C46476a.f117261d
                java.util.List r0 = r0.mo93214d()
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L_0x0053
                r3 = r0
                java.util.Collection r3 = (java.util.Collection) r3
                boolean r3 = r3.isEmpty()
                r3 = r3 ^ r2
                if (r3 == 0) goto L_0x0015
                goto L_0x0016
            L_0x0015:
                r0 = 0
            L_0x0016:
                if (r0 == 0) goto L_0x0053
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.Collection r3 = (java.util.Collection) r3
                java.util.Iterator r0 = r0.iterator()
            L_0x0025:
                boolean r4 = r0.hasNext()
                if (r4 == 0) goto L_0x0050
                java.lang.Object r4 = r0.next()
                r5 = r4
                java.lang.String r5 = (java.lang.String) r5
                java.lang.String r6 = "path"
                p2628d.p2639f.p2641b.C52711k.m112240b(r5, r6)
                int[] r5 = com.p683ss.android.ugc.aweme.photo.C38681j.m86037a(r5)
                r6 = r5[r1]
                r5 = r5[r2]
                r7 = 360(0x168, float:5.04E-43)
                if (r6 < r7) goto L_0x0049
                r6 = 480(0x1e0, float:6.73E-43)
                if (r5 < r6) goto L_0x0049
                r5 = 1
                goto L_0x004a
            L_0x0049:
                r5 = 0
            L_0x004a:
                if (r5 == 0) goto L_0x0025
                r3.add(r4)
                goto L_0x0025
            L_0x0050:
                java.util.List r3 = (java.util.List) r3
                goto L_0x005b
            L_0x0053:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r3 = r0
                java.util.List r3 = (java.util.List) r3
            L_0x005b:
                int r0 = r3.size()
                r4 = 200(0xc8, float:2.8E-43)
                int r0 = java.lang.Math.min(r4, r0)
            L_0x0065:
                if (r1 >= r0) goto L_0x007c
                com.ss.android.ugc.gamora.recorder.o.d r4 = new com.ss.android.ugc.gamora.recorder.o.d
                java.lang.Object r5 = r3.get(r1)
                java.lang.String r5 = (java.lang.String) r5
                r4.<init>(r5)
                com.ss.android.ugc.gamora.recorder.o.e r5 = r8.f125121a
                java.util.List<com.ss.android.ugc.gamora.recorder.o.d> r5 = r5.f125105i
                r5.add(r4)
                int r1 = r1 + 1
                goto L_0x0065
            L_0x007c:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.recorder.p2481o.C49925e.C49933h.call():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.o.e$i */
    static final class C49934i<TTaskResult, TContinuationResult> implements C0011g<Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49925e f125122a;

        C49934i(C49925e eVar) {
            this.f125122a = eVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C52711k.m112236a((Object) iVar, "lastTask");
            Object e = iVar.mo34e();
            C52711k.m112236a(e, "lastTask.result");
            C49925e.m107740a(((Boolean) e).booleanValue(), this.f125122a.f125098b, this.f125122a.f125102f);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.o.e$j */
    public static final class C49935j implements C48701f {

        /* renamed from: a */
        final /* synthetic */ C49925e f125123a;

        C49935j(C49925e eVar) {
            this.f125123a = eVar;
        }

        /* renamed from: a */
        public final void mo59186a(C48649d dVar) {
            C49925e.m107740a(false, this.f125123a.f125099c, this.f125123a.f125103g);
        }

        /* renamed from: a */
        public final /* synthetic */ void mo8638a(Object obj) {
            CategoryPageModel categoryPageModel = (CategoryPageModel) obj;
            if (categoryPageModel != null) {
                CategoryEffectModel categoryEffects = categoryPageModel.getCategoryEffects();
                if (categoryEffects != null) {
                    List<Effect> effects = categoryEffects.getEffects();
                    if (effects != null) {
                        for (Effect effect : effects) {
                            List<C49923d> list = this.f125123a.f125106j;
                            C52711k.m112236a((Object) effect, "effect");
                            list.add(new C49923d(effect));
                        }
                    }
                }
            }
            if (C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableStatusBgRandomOrder)) {
                Collections.shuffle(this.f125123a.f125106j);
            }
            C49925e.m107740a(true, this.f125123a.f125099c, this.f125123a.f125103g);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.o.e$k */
    public static final class C49936k implements C48701f {

        /* renamed from: a */
        final /* synthetic */ C49925e f125124a;

        C49936k(C49925e eVar) {
            this.f125124a = eVar;
        }

        /* renamed from: a */
        public final void mo59186a(C48649d dVar) {
            C49925e.m107740a(false, this.f125124a.f125100d, this.f125124a.f125104h);
            if (dVar == null) {
                C49925e.m107739a(false, 1, (Exception) null);
            } else {
                C49925e.m107739a(false, dVar.f122279a, dVar.f122281c);
            }
        }

        /* renamed from: a */
        public final /* synthetic */ void mo8638a(Object obj) {
            CategoryPageModel categoryPageModel = (CategoryPageModel) obj;
            if (categoryPageModel != null) {
                CategoryEffectModel categoryEffects = categoryPageModel.getCategoryEffects();
                if (categoryEffects != null) {
                    List<Effect> effects = categoryEffects.getEffects();
                    if (effects != null) {
                        for (Effect effect : effects) {
                            List<C49923d> list = this.f125124a.f125107k;
                            C52711k.m112236a((Object) effect, "effect");
                            list.add(new C49923d(effect));
                        }
                    }
                }
            }
            if (C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableStatusBgRandomOrder)) {
                Collections.shuffle(this.f125124a.f125107k);
            }
            C49925e.m107740a(true, this.f125124a.f125100d, this.f125124a.f125104h);
            C49925e.m107739a(true, 0, (Exception) null);
        }
    }

    /* renamed from: d */
    private final C29252f m107741d() {
        return (C29252f) this.f125112p.getValue();
    }

    /* renamed from: b */
    public final void mo97731b() {
        ViewGroup viewGroup = this.f125099c;
        if (viewGroup != null) {
            View findViewById = viewGroup.findViewById(R.id.bhy);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
        }
        m107741d().mo59134a("status-background", "template", false, 0, 0, 0, null, new C49935j(this));
    }

    /* renamed from: c */
    public final void mo97732c() {
        ViewGroup viewGroup = this.f125100d;
        if (viewGroup != null) {
            View findViewById = viewGroup.findViewById(R.id.bhy);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
        }
        m107741d().mo59134a("status-background", "wallpaper", false, 0, 0, 0, null, new C49936k(this));
    }

    /* renamed from: e */
    private final void m107742e() {
        if (this.f125100d == null) {
            this.f125100d = (ViewGroup) LayoutInflater.from(this.f125111o.getContext()).inflate(R.layout.buy, this.f125111o, false);
            this.f125111o.addView(this.f125100d);
            RecyclerView recyclerView = null;
            this.f125104h = new C49917c(this.f125107k, false, 2, null);
            C49917c cVar = this.f125104h;
            if (cVar != null) {
                cVar.f125079a = new C49931f(this);
            }
            ViewGroup viewGroup = this.f125100d;
            if (viewGroup != null) {
                recyclerView = (RecyclerView) viewGroup.findViewById(R.id.ca3);
            }
            if (recyclerView == null) {
                C52711k.m112234a();
            }
            recyclerView.setLayoutManager(new LinearLayoutManager(this.f125111o.getContext(), 0, false));
            recyclerView.setAdapter(this.f125104h);
            ViewGroup viewGroup2 = this.f125100d;
            if (viewGroup2 != null) {
                View findViewById = viewGroup2.findViewById(R.id.det);
                if (findViewById != null) {
                    findViewById.setOnClickListener(new C49932g(this));
                }
            }
            mo97732c();
        }
    }

    /* renamed from: f */
    private final void m107743f() {
        if (this.f125099c == null) {
            this.f125099c = (ViewGroup) LayoutInflater.from(this.f125111o.getContext()).inflate(R.layout.buy, this.f125111o, false);
            this.f125111o.addView(this.f125099c);
            RecyclerView recyclerView = null;
            this.f125103g = new C49917c(this.f125106j, false, 2, null);
            C49917c cVar = this.f125103g;
            if (cVar != null) {
                cVar.f125079a = new C49929d(this);
            }
            ViewGroup viewGroup = this.f125099c;
            if (viewGroup != null) {
                recyclerView = (RecyclerView) viewGroup.findViewById(R.id.ca3);
            }
            if (recyclerView == null) {
                C52711k.m112234a();
            }
            recyclerView.setLayoutManager(new LinearLayoutManager(this.f125111o.getContext(), 0, false));
            recyclerView.setAdapter(this.f125103g);
            ViewGroup viewGroup2 = this.f125099c;
            if (viewGroup2 != null) {
                View findViewById = viewGroup2.findViewById(R.id.det);
                if (findViewById != null) {
                    findViewById.setOnClickListener(new C49930e(this));
                }
            }
            mo97731b();
        }
    }

    /* renamed from: g */
    private final void m107744g() {
        RecyclerView recyclerView;
        if (this.f125098b == null) {
            this.f125098b = (ViewGroup) LayoutInflater.from(this.f125111o.getContext()).inflate(R.layout.buy, this.f125111o, false);
            this.f125111o.addView(this.f125098b);
            this.f125102f = new C49917c(this.f125105i, true);
            C49917c cVar = this.f125102f;
            if (cVar != null) {
                cVar.f125080b = this.f125101e;
            }
            C49917c cVar2 = this.f125102f;
            if (cVar2 != null) {
                cVar2.f125079a = new C49927b(this);
            }
            ViewGroup viewGroup = this.f125098b;
            if (viewGroup != null) {
                recyclerView = (RecyclerView) viewGroup.findViewById(R.id.ca3);
            } else {
                recyclerView = null;
            }
            if (recyclerView == null) {
                C52711k.m112234a();
            }
            recyclerView.setLayoutManager(new LinearLayoutManager(this.f125111o.getContext(), 0, false));
            recyclerView.setAdapter(this.f125102f);
            ViewGroup viewGroup2 = this.f125098b;
            if (viewGroup2 != null) {
                View findViewById = viewGroup2.findViewById(R.id.det);
                if (findViewById != null) {
                    findViewById.setOnClickListener(new C49928c(this));
                }
            }
            mo97729a();
        }
    }

    /* renamed from: a */
    public final void mo97729a() {
        ViewGroup viewGroup = this.f125098b;
        if (viewGroup != null) {
            View findViewById = viewGroup.findViewById(R.id.bhy);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
        }
        C0013i.m16a((Callable<TResult>) new C49933h<TResult>(this)).mo20a((C0011g<TResult, TContinuationResult>) new C49934i<TResult,TContinuationResult>(this), C0013i.f25b);
    }

    public C49925e(FrameLayout frameLayout) {
        C52711k.m112240b(frameLayout, "parentView");
        this.f125111o = frameLayout;
    }

    /* renamed from: a */
    public final void mo97730a(int i) {
        if (((Number) this.f125113q.getFirst()).intValue() != i) {
            ViewGroup viewGroup = (ViewGroup) this.f125113q.getSecond();
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            switch (i) {
                case 0:
                    m107744g();
                    this.f125113q = new C52847n<>(Integer.valueOf(0), this.f125098b);
                    break;
                case 1:
                    m107743f();
                    this.f125113q = new C52847n<>(Integer.valueOf(1), this.f125099c);
                    break;
                case 2:
                    m107742e();
                    this.f125113q = new C52847n<>(Integer.valueOf(2), this.f125100d);
                    break;
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f125113q.getSecond();
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(0);
            }
        }
    }

    /* renamed from: a */
    public static void m107739a(boolean z, int i, Exception exc) {
        JSONObject jSONObject = null;
        if (z) {
            C23569o.m57776a("status_resource_list_download_error_state", 0, (JSONObject) null);
            return;
        }
        if (exc != null) {
            jSONObject = C42437ay.m93202a().mo86521a("exception", C17437s.m42688b(exc)).mo86521a("event", C45324z.m98803a().mo91603b().toString()).mo86522b();
        }
        C23569o.m57776a("status_resource_list_download_error_state", i, jSONObject);
    }

    /* renamed from: a */
    public static void m107740a(boolean z, ViewGroup viewGroup, C49917c cVar) {
        if (z) {
            if (viewGroup != null) {
                View findViewById = viewGroup.findViewById(R.id.bby);
                if (findViewById != null) {
                    findViewById.setVisibility(0);
                }
            }
            if (viewGroup != null) {
                View findViewById2 = viewGroup.findViewById(R.id.bhy);
                if (findViewById2 != null) {
                    findViewById2.setVisibility(8);
                }
            }
            if (cVar != null) {
                cVar.notifyDataSetChanged();
            }
        } else {
            if (viewGroup != null) {
                View findViewById3 = viewGroup.findViewById(R.id.bhy);
                if (findViewById3 != null) {
                    findViewById3.setVisibility(8);
                }
            }
            if (viewGroup != null) {
                View findViewById4 = viewGroup.findViewById(R.id.eil);
                if (findViewById4 != null) {
                    findViewById4.setVisibility(0);
                }
            }
        }
    }
}
