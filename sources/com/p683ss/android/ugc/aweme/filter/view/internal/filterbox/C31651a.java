package com.p683ss.android.ugc.aweme.filter.view.internal.filterbox;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.LiveData;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31482a;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31489b;
import com.p683ss.android.ugc.aweme.filter.view.internal.C31659g;
import com.p683ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView.C31646c;
import com.p683ss.android.ugc.aweme.filter.view.internal.main.C31694h;
import com.p683ss.android.ugc.aweme.filter.view.p1750a.C31605a;
import com.p683ss.android.ugc.aweme.filter.view.p1750a.C31606b;
import com.p683ss.android.ugc.aweme.filter.view.p1750a.C31610f;
import com.p683ss.android.ugc.aweme.filter.view.p1750a.C31610f.C31611a;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.trill.R;
import p064c.p065a.C2201v;
import p064c.p065a.p094l.C2180b;
import p064c.p065a.p094l.C2189f;
import p2628d.C52847n;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.view.internal.filterbox.a */
public final class C31651a implements C31610f {

    /* renamed from: f */
    public static final C31652a f82679f = new C31652a(null);

    /* renamed from: a */
    FilterBoxListView f82680a;

    /* renamed from: b */
    public final C2189f<C52860x> f82681b;

    /* renamed from: c */
    final C2189f<C31605a> f82682c;

    /* renamed from: d */
    final C31646c f82683d = new C31655d(this);

    /* renamed from: e */
    final C31658d f82684e;

    /* renamed from: g */
    private C31659g f82685g;

    /* renamed from: h */
    private final ViewGroup f82686h;

    /* renamed from: i */
    private final C0184k f82687i;

    /* renamed from: j */
    private final C52671b<Context, ContextWrapper> f82688j;

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.filterbox.a$a */
    public static final class C31652a {
        private C31652a() {
        }

        public /* synthetic */ C31652a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.filterbox.a$b */
    static final class C31653b<T> implements C0199s<C52847n<? extends C31611a, ? extends C31482a>> {

        /* renamed from: a */
        final /* synthetic */ C31651a f82689a;

        C31653b(C31651a aVar) {
            this.f82689a = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0074, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onChanged(java.lang.Object r4) {
            /*
                r3 = this;
                d.n r4 = (p2628d.C52847n) r4
                if (r4 == 0) goto L_0x0075
                com.ss.android.ugc.aweme.filter.view.internal.filterbox.a r0 = r3.f82689a
                java.lang.Object r1 = r4.getFirst()
                com.ss.android.ugc.aweme.filter.view.a.f$a r1 = (com.p683ss.android.ugc.aweme.filter.view.p1750a.C31610f.C31611a) r1
                java.lang.Object r4 = r4.getSecond()
                com.ss.android.ugc.aweme.filter.repository.a.a r4 = (com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31482a) r4
                int[] r2 = com.p683ss.android.ugc.aweme.filter.view.internal.filterbox.C31656b.f82692a
                int r1 = r1.ordinal()
                r1 = r2[r1]
                switch(r1) {
                    case 1: goto L_0x0066;
                    case 2: goto L_0x0058;
                    case 3: goto L_0x004a;
                    case 4: goto L_0x001e;
                    default: goto L_0x001d;
                }
            L_0x001d:
                goto L_0x0074
            L_0x001e:
                if (r4 == 0) goto L_0x0074
                com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView r1 = r0.f82680a
                if (r1 != 0) goto L_0x0029
                java.lang.String r2 = "listView"
                p2628d.p2639f.p2641b.C52711k.m112237a(r2)
            L_0x0029:
                r2 = 0
                r1.setState(r2)
                com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView r1 = r0.f82680a
                if (r1 != 0) goto L_0x0036
                java.lang.String r2 = "listView"
                p2628d.p2639f.p2641b.C52711k.m112237a(r2)
            L_0x0036:
                java.util.List<d.n<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel, java.util.List<com.ss.android.ugc.aweme.filter.repository.a.b>>> r4 = r4.f82383b
                r1.setCategoryMap(r4)
                com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView r4 = r0.f82680a
                if (r4 != 0) goto L_0x0044
                java.lang.String r1 = "listView"
                p2628d.p2639f.p2641b.C52711k.m112237a(r1)
            L_0x0044:
                com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView$c r0 = r0.f82683d
                r4.setCallback(r0)
                goto L_0x0074
            L_0x004a:
                com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView r4 = r0.f82680a
                if (r4 != 0) goto L_0x0053
                java.lang.String r0 = "listView"
                p2628d.p2639f.p2641b.C52711k.m112237a(r0)
            L_0x0053:
                r0 = 2
                r4.setState(r0)
                goto L_0x0075
            L_0x0058:
                com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView r4 = r0.f82680a
                if (r4 != 0) goto L_0x0061
                java.lang.String r0 = "listView"
                p2628d.p2639f.p2641b.C52711k.m112237a(r0)
            L_0x0061:
                r0 = 3
                r4.setState(r0)
                goto L_0x0075
            L_0x0066:
                com.ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView r4 = r0.f82680a
                if (r4 != 0) goto L_0x006f
                java.lang.String r0 = "listView"
                p2628d.p2639f.p2641b.C52711k.m112237a(r0)
            L_0x006f:
                r0 = 1
                r4.setState(r0)
                goto L_0x0075
            L_0x0074:
                return
            L_0x0075:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.filter.view.internal.filterbox.C31651a.C31653b.onChanged(java.lang.Object):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.filterbox.a$c */
    static final class C31654c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31651a f82690a;

        C31654c(C31651a aVar) {
            this.f82690a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f82690a.f82681b.onNext(C52860x.f131107a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.filterbox.a$d */
    public static final class C31655d implements C31646c {

        /* renamed from: a */
        final /* synthetic */ C31651a f82691a;

        C31655d(C31651a aVar) {
            this.f82691a = aVar;
        }

        /* renamed from: a */
        public final void mo64363a(EffectCategoryModel effectCategoryModel, C31489b bVar) {
            C52711k.m112240b(effectCategoryModel, "category");
            C52711k.m112240b(bVar, "filter");
            C31651a aVar = this.f82691a;
            C31658d dVar = aVar.f82684e;
            if (dVar != null) {
                dVar.mo64560a(bVar);
            }
            aVar.f82682c.onNext(new C31605a(C31606b.BUILTIN_CLICK, bVar));
        }

        /* renamed from: b */
        public final void mo64364b(EffectCategoryModel effectCategoryModel, C31489b bVar) {
            C52711k.m112240b(effectCategoryModel, "category");
            C52711k.m112240b(bVar, "filter");
            C31651a aVar = this.f82691a;
            C31658d dVar = aVar.f82684e;
            if (dVar != null) {
                dVar.mo64560a(bVar);
            }
            aVar.f82682c.onNext(new C31605a(C31606b.INSERT, bVar));
        }

        /* renamed from: c */
        public final void mo64365c(EffectCategoryModel effectCategoryModel, C31489b bVar) {
            C52711k.m112240b(effectCategoryModel, "category");
            C52711k.m112240b(bVar, "filter");
            C31651a aVar = this.f82691a;
            C31658d dVar = aVar.f82684e;
            if (dVar != null) {
                dVar.mo64562b(bVar);
            }
            aVar.f82682c.onNext(new C31605a(C31606b.REMOVE, bVar));
        }
    }

    /* renamed from: c */
    public final C2201v<C31605a> mo64488c() {
        C2201v<C31605a> e = this.f82682c.mo6542e();
        C52711k.m112236a((Object) e, "actionSubject.hide()");
        return e;
    }

    /* renamed from: d */
    public final C2201v<Boolean> mo64489d() {
        C31659g gVar = this.f82685g;
        if (gVar == null) {
            C52711k.m112237a("transitionView");
        }
        return gVar.mo64569e();
    }

    /* renamed from: e */
    public final C2201v<C52860x> mo64490e() {
        C2201v<C52860x> e = this.f82681b.mo6542e();
        C52711k.m112236a((Object) e, "outSideTouchSubject.hide()");
        return e;
    }

    /* renamed from: a */
    public final void mo64486a() {
        C31658d dVar = this.f82684e;
        if (dVar != null) {
            dVar.mo64561b();
        }
        C31659g gVar = this.f82685g;
        if (gVar == null) {
            C52711k.m112237a("transitionView");
        }
        gVar.mo64565a();
    }

    /* renamed from: b */
    public final void mo64487b() {
        C31658d dVar = this.f82684e;
        if (dVar != null) {
            dVar.mo64563c();
        }
        C31659g gVar = this.f82685g;
        if (gVar == null) {
            C52711k.m112237a("transitionView");
        }
        gVar.mo64567c();
        FilterBoxListView filterBoxListView = this.f82680a;
        if (filterBoxListView == null) {
            C52711k.m112237a("listView");
        }
        filterBoxListView.setCategoryMap(C52575l.m112097a());
    }

    public C31651a(ViewGroup viewGroup, C0184k kVar, C31658d dVar, C52671b<? super Context, ? extends ContextWrapper> bVar) {
        C52711k.m112240b(viewGroup, "root");
        C52711k.m112240b(kVar, "lifecycleOwner");
        this.f82686h = viewGroup;
        this.f82687i = kVar;
        this.f82684e = dVar;
        this.f82688j = bVar;
        C2180b l = C2180b.m6534l();
        C52711k.m112236a((Object) l, "PublishSubject.create()");
        this.f82681b = l;
        C2180b l2 = C2180b.m6534l();
        C52711k.m112236a((Object) l2, "PublishSubject.create()");
        this.f82682c = l2;
        View inflate = LayoutInflater.from(this.f82686h.getContext()).inflate(R.layout.fa, this.f82686h, false);
        this.f82686h.addView(inflate);
        View findViewById = inflate.findViewById(R.id.af3);
        C52711k.m112236a((Object) findViewById, "content.findViewById(R.id.filter_box_view)");
        this.f82680a = (FilterBoxListView) findViewById;
        C52671b<Context, ContextWrapper> bVar2 = this.f82688j;
        if (bVar2 != null) {
            FilterBoxListView filterBoxListView = this.f82680a;
            if (filterBoxListView == null) {
                C52711k.m112237a("listView");
            }
            filterBoxListView.setThemeProvider(bVar2);
        }
        C52711k.m112236a((Object) inflate, C42311c.f106865i);
        this.f82685g = new C31694h(inflate, inflate.findViewById(R.id.csz));
        inflate.findViewById(R.id.ctg).setOnClickListener(new C31654c(this));
        C31659g gVar = this.f82685g;
        if (gVar == null) {
            C52711k.m112237a("transitionView");
        }
        gVar.mo64568d();
        C0184k kVar2 = this.f82687i;
        C31658d dVar2 = this.f82684e;
        if (dVar2 != null) {
            LiveData a = dVar2.mo64559a();
            if (a != null) {
                a.observe(kVar2, new C31653b(this));
            }
        }
    }
}
