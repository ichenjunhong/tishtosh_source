package com.p683ss.android.ugc.aweme.language;

import android.content.Context;
import android.os.Bundle;
import android.support.p043v7.app.C1160b;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.language.RegionApi.C35829a;
import com.p683ss.android.ugc.aweme.views.AutoRTLImageView;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.language.m */
public final class C35843m extends C1160b {

    /* renamed from: b */
    public AutoRTLImageView f92025b;

    /* renamed from: c */
    public DmtTextView f92026c;

    /* renamed from: d */
    public RecyclerView f92027d;

    /* renamed from: e */
    public DmtStatusView f92028e;

    /* renamed from: f */
    public View f92029f;

    /* renamed from: g */
    public int f92030g;

    /* renamed from: h */
    public C35831b f92031h;

    /* renamed from: i */
    public C35841k f92032i;

    /* renamed from: j */
    public C35841k f92033j;

    /* renamed from: k */
    public C52686q<? super C35841k, ? super C35841k, ? super C35841k, C52860x> f92034k;

    /* renamed from: l */
    public C35841k f92035l;

    /* renamed from: m */
    private final C1689b f92036m = new C1689b();

    /* renamed from: n */
    private final List<C35841k> f92037n;

    /* renamed from: com.ss.android.ugc.aweme.language.m$a */
    static final class C35844a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C35843m f92038a;

        C35844a(C35843m mVar) {
            this.f92038a = mVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            switch (this.f92038a.f92030g) {
                case 0:
                    this.f92038a.dismiss();
                    return;
                case 1:
                    this.f92038a.mo74502c();
                    return;
                case 2:
                    this.f92038a.mo74500a(false);
                    break;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.language.m$b */
    static final class C35845b extends C52712l implements C52671b<C35841k, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C35843m f92039a;

        C35845b(C35843m mVar) {
            this.f92039a = mVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C35841k kVar;
            C35841k kVar2 = (C35841k) obj;
            C52711k.m112240b(kVar2, "selectedModel");
            this.f92039a.f92033j = kVar2;
            if (this.f92039a.f92034k != null) {
                if (this.f92039a.f92032i == null || (this.f92039a.f92033j instanceof C35832c)) {
                    kVar = null;
                } else {
                    kVar = this.f92039a.f92033j;
                }
                C52686q b = this.f92039a.mo42942b();
                C35841k kVar3 = this.f92039a.f92035l;
                if (kVar3 == null) {
                    C52711k.m112234a();
                }
                b.invoke(kVar3, this.f92039a.f92032i, kVar);
            }
            this.f92039a.dismiss();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.language.m$c */
    static final class C35846c extends C52712l implements C52671b<C35841k, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C35843m f92040a;

        C35846c(C35843m mVar) {
            this.f92040a = mVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str;
            C35841k kVar = (C35841k) obj;
            C52711k.m112240b(kVar, "selectedModel");
            C35841k kVar2 = this.f92040a.f92035l;
            String str2 = null;
            if (kVar2 != null) {
                str = kVar2.f92021b;
            } else {
                str = null;
            }
            if (!C52830p.m112406a(str, kVar.f92021b, true)) {
                this.f92040a.f92032i = null;
                this.f92040a.f92033j = null;
            }
            C35841k kVar3 = this.f92040a.f92035l;
            if (kVar3 != null) {
                str2 = kVar3.f92021b;
            }
            boolean z = !C52830p.m112406a(str2, kVar.f92021b, true);
            this.f92040a.f92035l = kVar;
            this.f92040a.mo74500a(z);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.language.m$d */
    static final class C35847d<T> implements C1710e<C35831b> {

        /* renamed from: a */
        final /* synthetic */ C35843m f92041a;

        /* renamed from: com.ss.android.ugc.aweme.language.m$d$a */
        static final class C35848a extends C52712l implements C52671b<C35841k, C52860x> {

            /* renamed from: a */
            final /* synthetic */ C35847d f92042a;

            /* renamed from: b */
            final /* synthetic */ C35831b f92043b;

            C35848a(C35847d dVar, C35831b bVar) {
                this.f92042a = dVar;
                this.f92043b = bVar;
                super(1);
            }

            /* JADX WARNING: Removed duplicated region for block: B:45:0x010a  */
            /* JADX WARNING: Removed duplicated region for block: B:48:0x0119  */
            /* JADX WARNING: Removed duplicated region for block: B:51:0x0124  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ java.lang.Object invoke(java.lang.Object r9) {
                /*
                    r8 = this;
                    com.ss.android.ugc.aweme.language.k r9 = (com.p683ss.android.ugc.aweme.language.C35841k) r9
                    java.lang.String r0 = "selectedModel"
                    p2628d.p2639f.p2641b.C52711k.m112240b(r9, r0)
                    boolean r0 = r9 instanceof com.p683ss.android.ugc.aweme.language.C35832c
                    r1 = 0
                    if (r0 == 0) goto L_0x0033
                    com.ss.android.ugc.aweme.language.m$d r9 = r8.f92042a
                    com.ss.android.ugc.aweme.language.m r9 = r9.f92041a
                    d.f.a.q<? super com.ss.android.ugc.aweme.language.k, ? super com.ss.android.ugc.aweme.language.k, ? super com.ss.android.ugc.aweme.language.k, d.x> r9 = r9.f92034k
                    if (r9 == 0) goto L_0x002a
                    com.ss.android.ugc.aweme.language.m$d r9 = r8.f92042a
                    com.ss.android.ugc.aweme.language.m r9 = r9.f92041a
                    d.f.a.q r9 = r9.mo42942b()
                    com.ss.android.ugc.aweme.language.m$d r0 = r8.f92042a
                    com.ss.android.ugc.aweme.language.m r0 = r0.f92041a
                    com.ss.android.ugc.aweme.language.k r0 = r0.f92035l
                    if (r0 != 0) goto L_0x0027
                    p2628d.p2639f.p2641b.C52711k.m112234a()
                L_0x0027:
                    r9.invoke(r0, r1, r1)
                L_0x002a:
                    com.ss.android.ugc.aweme.language.m$d r9 = r8.f92042a
                    com.ss.android.ugc.aweme.language.m r9 = r9.f92041a
                    r9.dismiss()
                    goto L_0x0133
                L_0x0033:
                    java.lang.String r0 = r9.f92021b
                    com.ss.android.ugc.aweme.language.m$d r2 = r8.f92042a
                    com.ss.android.ugc.aweme.language.m r2 = r2.f92041a
                    com.ss.android.ugc.aweme.language.k r2 = r2.f92032i
                    if (r2 == 0) goto L_0x0040
                    java.lang.String r2 = r2.f92021b
                    goto L_0x0041
                L_0x0040:
                    r2 = r1
                L_0x0041:
                    r3 = 1
                    boolean r0 = p2628d.p2650m.C52830p.m112406a(r0, r2, r3)
                    if (r0 != 0) goto L_0x004e
                    com.ss.android.ugc.aweme.language.m$d r0 = r8.f92042a
                    com.ss.android.ugc.aweme.language.m r0 = r0.f92041a
                    r0.f92033j = r1
                L_0x004e:
                    com.ss.android.ugc.aweme.language.m$d r0 = r8.f92042a
                    com.ss.android.ugc.aweme.language.m r0 = r0.f92041a
                    r0.f92032i = r9
                    com.ss.android.ugc.aweme.language.m$d r9 = r8.f92042a
                    com.ss.android.ugc.aweme.language.m r9 = r9.f92041a
                    r9.mo74501b(r3)
                    r0 = 2
                    r9.f92030g = r0
                    com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r9.f92026c
                    if (r0 != 0) goto L_0x0067
                    java.lang.String r2 = "title"
                    p2628d.p2639f.p2641b.C52711k.m112237a(r2)
                L_0x0067:
                    java.lang.String r2 = "选择城市"
                    java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                    r0.setText(r2)
                    com.ss.android.ugc.aweme.language.l r0 = new com.ss.android.ugc.aweme.language.l
                    r0.<init>()
                    com.ss.android.ugc.aweme.language.c r2 = new com.ss.android.ugc.aweme.language.c
                    r2.<init>()
                    java.util.List r2 = p2628d.p2629a.C52575l.m112092a(r2)
                    java.util.Collection r2 = (java.util.Collection) r2
                    com.ss.android.ugc.aweme.language.b r4 = r9.f92031h
                    if (r4 == 0) goto L_0x00eb
                    java.util.List<com.ss.android.ugc.aweme.language.f> r4 = r4.f92007a
                    if (r4 == 0) goto L_0x00eb
                    java.lang.Iterable r4 = (java.lang.Iterable) r4
                    java.util.Iterator r4 = r4.iterator()
                L_0x008c:
                    boolean r5 = r4.hasNext()
                    if (r5 == 0) goto L_0x00ae
                    java.lang.Object r5 = r4.next()
                    r6 = r5
                    com.ss.android.ugc.aweme.language.f r6 = (com.p683ss.android.ugc.aweme.language.C35835f) r6
                    int r6 = r6.f92010c
                    java.lang.String r6 = java.lang.String.valueOf(r6)
                    com.ss.android.ugc.aweme.language.k r7 = r9.f92032i
                    if (r7 == 0) goto L_0x00a6
                    java.lang.String r7 = r7.f92021b
                    goto L_0x00a7
                L_0x00a6:
                    r7 = r1
                L_0x00a7:
                    boolean r6 = p2628d.p2650m.C52830p.m112406a(r6, r7, r3)
                    if (r6 == 0) goto L_0x008c
                    r1 = r5
                L_0x00ae:
                    com.ss.android.ugc.aweme.language.f r1 = (com.p683ss.android.ugc.aweme.language.C35835f) r1
                    if (r1 == 0) goto L_0x00eb
                    java.util.List<com.ss.android.ugc.aweme.language.a> r1 = r1.f92008a
                    if (r1 == 0) goto L_0x00eb
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    java.util.ArrayList r3 = new java.util.ArrayList
                    r4 = 10
                    int r4 = p2628d.p2629a.C52575l.m112104a(r1, r4)
                    r3.<init>(r4)
                    java.util.Collection r3 = (java.util.Collection) r3
                    java.util.Iterator r1 = r1.iterator()
                L_0x00c9:
                    boolean r4 = r1.hasNext()
                    if (r4 == 0) goto L_0x00e6
                    java.lang.Object r4 = r1.next()
                    com.ss.android.ugc.aweme.language.a r4 = (com.p683ss.android.ugc.aweme.language.C35830a) r4
                    com.ss.android.ugc.aweme.language.k r5 = new com.ss.android.ugc.aweme.language.k
                    java.lang.String r6 = r4.f92005a
                    int r4 = r4.f92006b
                    java.lang.String r4 = java.lang.String.valueOf(r4)
                    r5.<init>(r6, r4)
                    r3.add(r5)
                    goto L_0x00c9
                L_0x00e6:
                    java.util.List r3 = (java.util.List) r3
                    java.lang.Iterable r3 = (java.lang.Iterable) r3
                    goto L_0x00f2
                L_0x00eb:
                    java.util.List r1 = p2628d.p2629a.C52575l.m112097a()
                    r3 = r1
                    java.lang.Iterable r3 = (java.lang.Iterable) r3
                L_0x00f2:
                    java.util.List r1 = p2628d.p2629a.C52575l.m112133c(r2, r3)
                    r0.mo74498a(r1)
                    com.ss.android.ugc.aweme.language.k r1 = r9.f92033j
                    r0.f92024c = r1
                    com.ss.android.ugc.aweme.language.m$b r1 = new com.ss.android.ugc.aweme.language.m$b
                    r1.<init>(r9)
                    d.f.a.b r1 = (p2628d.p2639f.p2640a.C52671b) r1
                    r0.f92023b = r1
                    android.support.v7.widget.RecyclerView r1 = r9.f92027d
                    if (r1 != 0) goto L_0x010f
                    java.lang.String r2 = "list"
                    p2628d.p2639f.p2641b.C52711k.m112237a(r2)
                L_0x010f:
                    r2 = r0
                    android.support.v7.widget.RecyclerView$a r2 = (android.support.p043v7.widget.RecyclerView.C1322a) r2
                    r1.setAdapter(r2)
                    android.support.v7.widget.RecyclerView r1 = r9.f92027d
                    if (r1 != 0) goto L_0x011e
                    java.lang.String r2 = "list"
                    p2628d.p2639f.p2641b.C52711k.m112237a(r2)
                L_0x011e:
                    android.support.v7.widget.RecyclerView$i r1 = r1.getLayoutManager()
                    if (r1 == 0) goto L_0x012f
                    java.util.List<? extends com.ss.android.ugc.aweme.language.k> r0 = r0.f92022a
                    com.ss.android.ugc.aweme.language.k r2 = r9.f92033j
                    int r0 = p2628d.p2629a.C52575l.m112114a(r0, r2)
                    r1.mo4741e(r0)
                L_0x012f:
                    r0 = 0
                    r9.mo74501b(r0)
                L_0x0133:
                    d.x r9 = p2628d.C52860x.f131107a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.language.C35843m.C35847d.C35848a.invoke(java.lang.Object):java.lang.Object");
            }
        }

        C35847d(C35843m mVar) {
            this.f92041a = mVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C35831b bVar = (C35831b) obj;
            this.f92041a.f92030g = 1;
            DmtTextView dmtTextView = this.f92041a.f92026c;
            if (dmtTextView == null) {
                C52711k.m112237a("title");
            }
            dmtTextView.setText("选择省份");
            this.f92041a.f92031h = bVar;
            C35842l lVar = new C35842l();
            Collection a = C52575l.m112092a(new C35832c());
            Iterable<C35835f> iterable = bVar.f92007a;
            Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
            for (C35835f fVar : iterable) {
                arrayList.add(new C35841k(fVar.f92009b, String.valueOf(fVar.f92010c)));
            }
            lVar.mo74498a(C52575l.m112133c(a, (List) arrayList));
            lVar.f92024c = this.f92041a.f92032i;
            lVar.f92023b = new C35848a(this, bVar);
            this.f92041a.mo74499a().setAdapter(lVar);
            C1332i layoutManager = this.f92041a.mo74499a().getLayoutManager();
            if (layoutManager != null) {
                layoutManager.mo4741e(C52575l.m112114a(lVar.f92022a, this.f92041a.f92032i));
            }
            this.f92041a.mo74501b(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.language.m$e */
    static final class C35849e<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C35843m f92044a;

        /* renamed from: b */
        final /* synthetic */ C35841k f92045b;

        C35849e(C35843m mVar, C35841k kVar) {
            this.f92044a = mVar;
            this.f92045b = kVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Context context = this.f92044a.getContext();
            StringBuilder sb = new StringBuilder("Choosing city for ");
            sb.append(this.f92045b.f92021b);
            sb.append(" is not supported");
            C10691a.m21551c(context, sb.toString()).mo19066a();
            if (this.f92044a.f92034k != null) {
                C52686q b = this.f92044a.mo42942b();
                C35841k kVar = this.f92044a.f92035l;
                if (kVar == null) {
                    C52711k.m112234a();
                }
                b.invoke(kVar, null, null);
            }
            this.f92044a.dismiss();
        }
    }

    /* renamed from: a */
    public final RecyclerView mo74499a() {
        RecyclerView recyclerView = this.f92027d;
        if (recyclerView == null) {
            C52711k.m112237a("list");
        }
        return recyclerView;
    }

    /* renamed from: b */
    public final C52686q<C35841k, C35841k, C35841k, C52860x> mo42942b() {
        C52686q<? super C35841k, ? super C35841k, ? super C35841k, C52860x> qVar = this.f92034k;
        if (qVar == null) {
            C52711k.m112237a("selectionResultCallBack");
        }
        return qVar;
    }

    public final void cancel() {
        this.f92036m.dispose();
        super.cancel();
    }

    public final void dismiss() {
        this.f92036m.dispose();
        super.dismiss();
    }

    /* renamed from: c */
    public final void mo74502c() {
        this.f92030g = 0;
        DmtTextView dmtTextView = this.f92026c;
        if (dmtTextView == null) {
            C52711k.m112237a("title");
        }
        dmtTextView.setText("选择国家和地区");
        C35842l lVar = new C35842l();
        lVar.mo74498a(this.f92037n);
        lVar.f92024c = this.f92035l;
        lVar.f92023b = new C35846c(this);
        RecyclerView recyclerView = this.f92027d;
        if (recyclerView == null) {
            C52711k.m112237a("list");
        }
        recyclerView.setAdapter(lVar);
        RecyclerView recyclerView2 = this.f92027d;
        if (recyclerView2 == null) {
            C52711k.m112237a("list");
        }
        C1332i layoutManager = recyclerView2.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.mo4741e(C52575l.m112114a(lVar.f92022a, this.f92035l));
        }
    }

    /* renamed from: b */
    public final void mo74501b(boolean z) {
        if (z) {
            View view = this.f92029f;
            if (view == null) {
                C52711k.m112237a("maskView");
            }
            view.setVisibility(0);
            DmtStatusView dmtStatusView = this.f92028e;
            if (dmtStatusView == null) {
                C52711k.m112237a("loadingView");
            }
            dmtStatusView.mo19212f();
            return;
        }
        View view2 = this.f92029f;
        if (view2 == null) {
            C52711k.m112237a("maskView");
        }
        view2.setVisibility(8);
        DmtStatusView dmtStatusView2 = this.f92028e;
        if (dmtStatusView2 == null) {
            C52711k.m112237a("loadingView");
        }
        dmtStatusView2.mo19208c(true);
    }

    /* renamed from: a */
    public final void mo74500a(boolean z) {
        C2201v vVar;
        C35841k kVar = this.f92035l;
        if (kVar != null) {
            mo74501b(true);
            C35831b bVar = this.f92031h;
            if (bVar == null || z) {
                String str = kVar.f92021b;
                C52711k.m112240b(str, "countryCode");
                RegionApi regionApi = C35829a.f92003a;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("_en_L3.json");
                vVar = regionApi.getCountryDetail(sb.toString()).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a());
                C52711k.m112236a((Object) vVar, "sApi.getCountryDetail(\"$…dSchedulers.mainThread())");
            } else {
                vVar = C2201v.m6614b(bVar);
            }
            C1690c a = vVar.mo6505a((C1710e<? super T>) new C35847d<Object>(this), (C1710e<? super Throwable>) new C35849e<Object>(this, kVar));
            C52711k.m112236a((Object) a, "if (data == null || chan…     dismiss()\n        })");
            C1689b bVar2 = this.f92036m;
            C52711k.m112240b(a, "$receiver");
            C52711k.m112240b(bVar2, "compositeDisposable");
            bVar2.mo6181a(a);
        }
    }

    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        super.onCreate(bundle);
        setContentView((int) R.layout.adk);
        View findViewById = findViewById(R.id.ik);
        if (findViewById == null) {
            C52711k.m112234a();
        }
        this.f92025b = (AutoRTLImageView) findViewById;
        View findViewById2 = findViewById(R.id.title);
        if (findViewById2 == null) {
            C52711k.m112234a();
        }
        this.f92026c = (DmtTextView) findViewById2;
        View findViewById3 = findViewById(R.id.bbo);
        if (findViewById3 == null) {
            C52711k.m112234a();
        }
        this.f92027d = (RecyclerView) findViewById3;
        View findViewById4 = findViewById(R.id.bhy);
        if (findViewById4 == null) {
            C52711k.m112234a();
        }
        this.f92028e = (DmtStatusView) findViewById4;
        View findViewById5 = findViewById(R.id.u9);
        if (findViewById5 == null) {
            C52711k.m112234a();
        }
        this.f92029f = findViewById5;
        RecyclerView recyclerView = this.f92027d;
        if (recyclerView == null) {
            C52711k.m112237a("list");
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        AutoRTLImageView autoRTLImageView = this.f92025b;
        if (autoRTLImageView == null) {
            C52711k.m112237a("mBackBtn");
        }
        autoRTLImageView.setOnClickListener(new C35844a(this));
        Map c = C35837h.m80978c();
        String str4 = null;
        if (c != null) {
            str = (String) c.get("province_name");
        } else {
            str = null;
        }
        if (c != null) {
            str2 = (String) c.get("province_id");
        } else {
            str2 = null;
        }
        if (!(str == null || str2 == null)) {
            this.f92032i = new C35841k(str, str2);
        }
        if (c != null) {
            str3 = (String) c.get("city_name");
        } else {
            str3 = null;
        }
        if (c != null) {
            str4 = (String) c.get("city_id");
        }
        if (!(str3 == null || str4 == null)) {
            this.f92033j = new C35841k(str3, str4);
        }
        DmtStatusView dmtStatusView = this.f92028e;
        if (dmtStatusView == null) {
            C52711k.m112237a("loadingView");
        }
        dmtStatusView.setBuilder(C10719a.m21676a(getContext()));
        mo74502c();
    }

    public C35843m(Context context, List<? extends C35841k> list, C35841k kVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(list, "regionList");
        super(context);
        this.f92037n = list;
        this.f92035l = kVar;
    }
}
