package com.p683ss.android.ugc.aweme.filter.view.internal.main;

import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.support.p043v7.widget.C1415af;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1346r;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.jedi.arch.C11939z;
import com.bytedance.jedi.p725a.p728c.C11575f;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.filter.EffectCenterLayoutManager;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31494g;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31499l;
import com.p683ss.android.ugc.aweme.filter.view.internal.C31619a;
import com.p683ss.android.ugc.aweme.filter.view.internal.C31630b;
import com.p683ss.android.ugc.aweme.filter.view.internal.C31631c;
import com.p683ss.android.ugc.aweme.filter.view.internal.C31632d;
import com.p683ss.android.ugc.aweme.filter.view.internal.C31633e;
import com.p683ss.android.ugc.aweme.filter.view.internal.C31634f;
import com.p683ss.android.ugc.aweme.filter.view.internal.C31659g;
import com.p683ss.android.ugc.aweme.filter.view.p1750a.C31607c;
import com.p683ss.android.ugc.aweme.filter.view.p1750a.C31608d;
import com.p683ss.android.ugc.aweme.filter.view.p1750a.C31609e;
import com.p683ss.android.ugc.aweme.filter.view.p1750a.C31613h;
import com.p683ss.android.ugc.aweme.filter.view.p1750a.C31614i;
import com.p683ss.android.ugc.aweme.filter.view.p1750a.C31615j;
import com.p683ss.android.ugc.aweme.filter.widget.FilterBeautySeekBar;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTabLayout;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p064c.p065a.C2201v;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p072e.p074b.C1723a;
import p064c.p065a.p094l.C2180b;
import p064c.p065a.p094l.C2189f;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.j */
public class C31699j implements C31615j {

    /* renamed from: a */
    private ViewGroup f82792a;

    /* renamed from: b */
    protected C31614i f82793b;

    /* renamed from: c */
    C31459g f82794c;

    /* renamed from: d */
    int f82795d;

    /* renamed from: e */
    final C2189f<C11939z<C31609e, Integer, C31459g>> f82796e;

    /* renamed from: f */
    final C2189f<C31607c> f82797f;

    /* renamed from: g */
    private C31633e f82798g;

    /* renamed from: h */
    private C31630b f82799h;

    /* renamed from: i */
    private C31619a f82800i;

    /* renamed from: j */
    private C31632d f82801j;

    /* renamed from: k */
    private C31659g f82802k;

    /* renamed from: l */
    private boolean f82803l;

    /* renamed from: m */
    private final C2189f<C52847n<Boolean, C31459g>> f82804m;

    /* renamed from: n */
    private final C2189f<Boolean> f82805n;

    /* renamed from: o */
    private final C1689b f82806o;

    /* renamed from: p */
    private final C31710k f82807p;

    /* renamed from: q */
    private final ViewGroup f82808q;

    /* renamed from: r */
    private final C0184k f82809r;

    /* renamed from: s */
    private final C31499l f82810s;

    /* renamed from: t */
    private final C31631c f82811t;

    /* renamed from: u */
    private final C31634f f82812u;

    /* renamed from: v */
    private final boolean f82813v;

    /* renamed from: w */
    private final boolean f82814w;

    /* renamed from: x */
    private final boolean f82815x;

    /* renamed from: y */
    private final boolean f82816y;

    /* renamed from: z */
    private final boolean f82817z;

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.j$a */
    public final class C31700a extends C31669d {

        /* renamed from: k */
        final /* synthetic */ C31699j f82818k;

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo64579b(int i, int i2) {
            C1332i layoutManager = this.f82730g.getLayoutManager();
            if (!(layoutManager instanceof LinearLayoutManager)) {
                layoutManager = null;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (linearLayoutManager != null) {
                C1415af rVar = new C31732r(this.f82730g.getContext());
                rVar.f4778g = i;
                linearLayoutManager.mo5022a((C1346r) rVar);
            }
        }

        private C31700a(C31699j jVar, RecyclerView recyclerView, C0184k kVar, C31730p pVar, C31731q qVar, C52686q<? super C31613h, ? super C31459g, ? super C31494g, C52860x> qVar2) {
            C52711k.m112240b(recyclerView, "recyclerView");
            C52711k.m112240b(kVar, "lifecycleOwner");
            this.f82818k = jVar;
            super(recyclerView, kVar, pVar, qVar, qVar2);
        }

        public /* synthetic */ C31700a(C31699j jVar, RecyclerView recyclerView, C0184k kVar, C31730p pVar, C31731q qVar, C52686q qVar2, int i, C52707g gVar) {
            this(jVar, recyclerView, kVar, pVar, qVar, C31669d.f82722i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.j$b */
    public final class C31701b extends C31684g {

        /* renamed from: h */
        final /* synthetic */ C31699j f82819h;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo64584a(List<? extends EffectCategoryResponse> list) {
            C52711k.m112240b(list, "tabDataList");
            TabLayout tabLayout = this.f82757f;
            if (!(tabLayout instanceof AVDmtTabLayout)) {
                tabLayout = null;
            }
            AVDmtTabLayout aVDmtTabLayout = (AVDmtTabLayout) tabLayout;
            if (aVDmtTabLayout != null) {
                int size = list.size() + this.f82753b.size();
                Iterable<EffectCategoryResponse> iterable = list;
                Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                for (EffectCategoryResponse name : iterable) {
                    arrayList.add(name.getName());
                }
                aVDmtTabLayout.mo93995a(size, (List) arrayList);
            }
            super.mo64584a(list);
        }

        public C31701b(C31699j jVar, C31613h hVar, TabLayout tabLayout, C31634f fVar) {
            C52711k.m112240b(hVar, "filterListView");
            C52711k.m112240b(tabLayout, "tabLayout");
            this.f82819h = jVar;
            super(hVar, tabLayout, fVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.j$c */
    static final class C31702c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31699j f82820a;

        C31702c(C31699j jVar) {
            this.f82820a = jVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f82820a.mo64596j();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.j$d */
    static final class C31703d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31699j f82821a;

        C31703d(C31699j jVar) {
            this.f82821a = jVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C2189f<C31607c> fVar = this.f82821a.f82797f;
            C31607c cVar = new C31607c(C31608d.FILTER_BOX_ENTRANCE_CLICK, null, null, 6, null);
            fVar.onNext(cVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.j$e */
    static final class C31704e<T> implements C1710e<C11575f<? extends C31459g>> {

        /* renamed from: a */
        final /* synthetic */ C31699j f82822a;

        C31704e(C31699j jVar) {
            this.f82822a = jVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.f82822a.mo64594c((C31459g) ((C11575f) obj).mo22313a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.j$f */
    static final class C31705f<T> implements C1710e<C31459g> {

        /* renamed from: a */
        final /* synthetic */ C31699j f82823a;

        C31705f(C31699j jVar) {
            this.f82823a = jVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C31459g gVar = (C31459g) obj;
            C31699j jVar = this.f82823a;
            C52711k.m112236a((Object) gVar, "it");
            jVar.mo64593b(gVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.j$g */
    static final class C31706g<T> implements C1710e<EffectCategoryResponse> {

        /* renamed from: a */
        final /* synthetic */ C31699j f82824a;

        C31706g(C31699j jVar) {
            this.f82824a = jVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            EffectCategoryResponse effectCategoryResponse = (EffectCategoryResponse) obj;
            C31699j jVar = this.f82824a;
            C52711k.m112236a((Object) effectCategoryResponse, "it");
            jVar.mo64591a(effectCategoryResponse);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.j$h */
    static final class C31707h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31699j f82825a;

        C31707h(C31699j jVar) {
            this.f82825a = jVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C2189f<C31607c> fVar = this.f82825a.f82797f;
            C31607c cVar = new C31607c(C31608d.OUTSIDE_TOUCH, null, null, 6, null);
            fVar.onNext(cVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.j$i */
    static final class C31708i<T> implements C1710e<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C31699j f82826a;

        C31708i(C31699j jVar) {
            this.f82826a = jVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Boolean bool = (Boolean) obj;
            C31699j jVar = this.f82826a;
            C52711k.m112236a((Object) bool, "showHide");
            jVar.mo64592a(bool.booleanValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.j$j */
    public static final class C31709j implements C31632d {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f82827a;

        C31709j(ViewGroup viewGroup) {
            this.f82827a = viewGroup;
        }

        /* renamed from: a */
        public final void mo64540a(OnClickListener onClickListener) {
            C52711k.m112240b(onClickListener, "observer");
            View findViewById = this.f82827a.findViewById(R.id.ctg);
            if (findViewById != null) {
                findViewById.setOnClickListener(onClickListener);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.j$k */
    public static final class C31710k implements OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ C31699j f82828a;

        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        C31710k(C31699j jVar) {
            this.f82828a = jVar;
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            C31699j jVar = this.f82828a;
            C31459g gVar = jVar.f82794c;
            if (gVar != null) {
                jVar.f82796e.onNext(new C11939z(C31609e.CHANGE_END, Integer.valueOf(jVar.f82795d), gVar));
            }
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C31699j jVar = this.f82828a;
            jVar.f82795d = i;
            C31459g gVar = jVar.f82794c;
            if (gVar != null) {
                jVar.f82796e.onNext(new C11939z(C31609e.CHANGING, Integer.valueOf(i), gVar));
            }
        }
    }

    /* renamed from: k */
    private void m73639k() {
        m73638b(false);
    }

    /* renamed from: d */
    public final void mo64508d() {
        m73638b(true);
    }

    /* renamed from: a */
    public final C31459g mo64504a() {
        C31614i iVar = this.f82793b;
        if (iVar == null) {
            C52711k.m112237a("tabListView");
        }
        return iVar.mo64492a();
    }

    /* renamed from: e */
    public final C2201v<C11939z<C31609e, Integer, C31459g>> mo64509e() {
        C2201v<C11939z<C31609e, Integer, C31459g>> e = this.f82796e.mo6542e();
        C52711k.m112236a((Object) e, "rateChangeSubject.hide()");
        return e;
    }

    /* renamed from: f */
    public final C2201v<C11575f<C31459g>> mo64510f() {
        C31614i iVar = this.f82793b;
        if (iVar == null) {
            C52711k.m112237a("tabListView");
        }
        return iVar.mo64497c();
    }

    /* renamed from: g */
    public final C2201v<Boolean> mo64511g() {
        C2201v<Boolean> e = this.f82805n.mo6542e();
        C52711k.m112236a((Object) e, "clearModelSubject.hide()");
        return e;
    }

    /* renamed from: h */
    public final C2201v<C31607c> mo64512h() {
        C2201v<C31607c> e = this.f82797f.mo6542e();
        C52711k.m112236a((Object) e, "filterViewActionSubject.hide()");
        return e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C31614i mo64595i() {
        C31614i iVar = this.f82793b;
        if (iVar == null) {
            C52711k.m112237a("tabListView");
        }
        return iVar;
    }

    /* renamed from: b */
    public final void mo64506b() {
        if (this.f82817z) {
            C31659g gVar = this.f82802k;
            if (gVar == null) {
                C52711k.m112237a("transitionView");
            }
            gVar.mo64565a();
            return;
        }
        C31659g gVar2 = this.f82802k;
        if (gVar2 == null) {
            C52711k.m112237a("transitionView");
        }
        gVar2.mo64566b();
    }

    /* renamed from: c */
    public final void mo64507c() {
        if (this.f82817z) {
            C31659g gVar = this.f82802k;
            if (gVar == null) {
                C52711k.m112237a("transitionView");
            }
            gVar.mo64567c();
            return;
        }
        C31659g gVar2 = this.f82802k;
        if (gVar2 == null) {
            C52711k.m112237a("transitionView");
        }
        gVar2.mo64568d();
    }

    /* renamed from: j */
    public final void mo64596j() {
        C31630b bVar = this.f82799h;
        if (bVar == null) {
            C52711k.m112237a("cleanView");
        }
        if (!bVar.mo64535a()) {
            mo64508d();
        }
        C2189f<C31607c> fVar = this.f82797f;
        C31607c cVar = new C31607c(C31608d.CLEAR_MODE_CLICK, null, null, 6, null);
        fVar.onNext(cVar);
    }

    /* renamed from: a */
    public final void mo64505a(C31459g gVar) {
        C31614i iVar = this.f82793b;
        if (iVar == null) {
            C52711k.m112237a("tabListView");
        }
        iVar.mo64493a(gVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C31619a mo64590a(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, C42311c.f106865i);
        Context context = this.f82808q.getContext();
        C52711k.m112236a((Object) context, "root.context");
        C31614i iVar = this.f82793b;
        if (iVar == null) {
            C52711k.m112237a("tabListView");
        }
        return new C31666b(context, iVar);
    }

    /* renamed from: b */
    public final void mo64593b(C31459g gVar) {
        m73639k();
        C2189f<C31607c> fVar = this.f82797f;
        C31607c cVar = new C31607c(C31608d.TAB_CLICK, null, gVar, 2, null);
        fVar.onNext(cVar);
    }

    /* renamed from: b */
    private final void m73638b(boolean z) {
        if (this.f82814w && this.f82803l != z) {
            this.f82803l = z;
            C31630b bVar = this.f82799h;
            if (bVar == null) {
                C52711k.m112237a("cleanView");
            }
            bVar.mo64534a(this.f82803l);
            if (this.f82803l) {
                mo64505a((C31459g) null);
                C31614i iVar = this.f82793b;
                if (iVar == null) {
                    C52711k.m112237a("tabListView");
                }
                iVar.mo64500a((EffectCategoryResponse) null, false);
            }
            C31614i iVar2 = this.f82793b;
            if (iVar2 == null) {
                C52711k.m112237a("tabListView");
            }
            iVar2.mo64501a(!this.f82803l);
            this.f82805n.onNext(Boolean.valueOf(this.f82803l));
        }
    }

    /* renamed from: a */
    public final void mo64591a(EffectCategoryResponse effectCategoryResponse) {
        C2189f<C31607c> fVar = this.f82797f;
        C31607c cVar = new C31607c(C31608d.TAB_CLICK, effectCategoryResponse, null, 4, null);
        fVar.onNext(cVar);
        m73639k();
    }

    /* renamed from: c */
    public final void mo64594c(C31459g gVar) {
        this.f82794c = gVar;
        if (this.f82794c != null) {
            m73639k();
        }
        C31459g gVar2 = this.f82794c;
        if (this.f82813v) {
            boolean z = false;
            if (gVar2 != null) {
                C31633e eVar = this.f82798g;
                if (eVar == null) {
                    C52711k.m112237a("seekBarView");
                }
                if (this.f82811t.mo64539c(gVar2) != 0.0f) {
                    z = true;
                }
                eVar.mo64542a(z);
                C31633e eVar2 = this.f82798g;
                if (eVar2 == null) {
                    C52711k.m112237a("seekBarView");
                }
                if (eVar2.mo64543b()) {
                    C31633e eVar3 = this.f82798g;
                    if (eVar3 == null) {
                        C52711k.m112237a("seekBarView");
                    }
                    SeekBar a = eVar3.mo64541a();
                    a.setProgress(this.f82811t.mo64537a(gVar2));
                    if (a instanceof FilterBeautySeekBar) {
                        int b = this.f82811t.mo64538b(gVar2);
                        FilterBeautySeekBar filterBeautySeekBar = (FilterBeautySeekBar) a;
                        if (b == 0 || b == 100) {
                            b = -1;
                        }
                        filterBeautySeekBar.setDefaultDotProgress(b);
                    }
                }
            } else {
                C31633e eVar4 = this.f82798g;
                if (eVar4 == null) {
                    C52711k.m112237a("seekBarView");
                }
                eVar4.mo64542a(false);
            }
        }
    }

    /* renamed from: a */
    public final void mo64491a(Map<EffectCategoryResponse, ? extends List<? extends C31459g>> map) {
        C52711k.m112240b(map, "filterList");
        C31614i iVar = this.f82793b;
        if (iVar == null) {
            C52711k.m112237a("tabListView");
        }
        iVar.mo64491a(map);
    }

    /* renamed from: a */
    public final void mo64592a(boolean z) {
        if (z) {
            C31459g gVar = this.f82794c;
            if (gVar != null) {
                C31614i iVar = this.f82793b;
                if (iVar == null) {
                    C52711k.m112237a("tabListView");
                }
                iVar.mo64496b(gVar);
            }
        }
        this.f82804m.onNext(C52856t.m112465a(Boolean.valueOf(z), this.f82794c));
    }

    private C31699j(ViewGroup viewGroup, C0184k kVar, C31499l lVar, C31631c cVar, C31634f fVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        ViewGroup viewGroup2 = viewGroup;
        C0184k kVar2 = kVar;
        C31499l lVar2 = lVar;
        C31631c cVar2 = cVar;
        C52711k.m112240b(viewGroup, "root");
        C52711k.m112240b(kVar, "lifecycleOwner");
        C52711k.m112240b(lVar, "repository");
        C52711k.m112240b(cVar, "filterIntensitySource");
        this.f82808q = viewGroup2;
        this.f82809r = kVar2;
        this.f82810s = lVar2;
        this.f82811t = cVar2;
        this.f82812u = fVar;
        this.f82813v = z;
        this.f82814w = z2;
        this.f82815x = z3;
        this.f82816y = z4;
        this.f82817z = z5;
        C2180b l = C2180b.m6534l();
        C52711k.m112236a((Object) l, "PublishSubject.create()");
        this.f82804m = l;
        C2180b l2 = C2180b.m6534l();
        C52711k.m112236a((Object) l2, "PublishSubject.create()");
        this.f82796e = l2;
        C2180b l3 = C2180b.m6534l();
        C52711k.m112236a((Object) l3, "PublishSubject.create()");
        this.f82797f = l3;
        C2180b l4 = C2180b.m6534l();
        C52711k.m112236a((Object) l4, "PublishSubject.create()");
        this.f82805n = l4;
        this.f82806o = new C1689b();
        this.f82807p = new C31710k(this);
        ViewGroup viewGroup3 = this.f82808q;
        C52711k.m112240b(viewGroup3, "root");
        View inflate = LayoutInflater.from(viewGroup3.getContext()).inflate(R.layout.axy, viewGroup3, false);
        if (inflate != null) {
            this.f82792a = (ViewGroup) inflate;
            ViewGroup viewGroup4 = this.f82808q;
            ViewGroup viewGroup5 = this.f82792a;
            if (viewGroup5 == null) {
                C52711k.m112237a(C42311c.f106865i);
            }
            viewGroup4.addView(viewGroup5);
            ViewGroup viewGroup6 = this.f82792a;
            if (viewGroup6 == null) {
                C52711k.m112237a(C42311c.f106865i);
            }
            C52711k.m112240b(viewGroup6, C42311c.f106865i);
            View findViewById = viewGroup6.findViewById(R.id.afj);
            C52711k.m112236a((Object) findViewById, "content.findViewById(R.id.filter_recyclerView)");
            RecyclerView recyclerView = (RecyclerView) findViewById;
            recyclerView.setLayoutManager(new EffectCenterLayoutManager(viewGroup6.getContext(), 0, false));
            View findViewById2 = viewGroup6.findViewById(R.id.afm);
            C52711k.m112236a((Object) findViewById2, "content.findViewById(R.id.filter_tab)");
            TabLayout tabLayout = (TabLayout) findViewById2;
            tabLayout.setTabMargin(12);
            C31700a aVar = new C31700a(this, recyclerView, this.f82809r, new FilterListViewSelectionViewModel(this.f82809r, this.f82810s, this.f82812u), new FilterListViewStateViewModel(this.f82809r, this.f82810s), null, 16, null);
            this.f82793b = new C31701b(this, aVar, tabLayout, this.f82812u);
            C1689b bVar = this.f82806o;
            C31614i iVar = this.f82793b;
            if (iVar == null) {
                C52711k.m112237a("tabListView");
            }
            bVar.mo6181a(iVar.mo64497c().mo6505a((C1710e<? super T>) new C31704e<Object>(this), C1723a.f5846e));
            C1689b bVar2 = this.f82806o;
            C31614i iVar2 = this.f82793b;
            if (iVar2 == null) {
                C52711k.m112237a("tabListView");
            }
            bVar2.mo6181a(iVar2.mo64495b().mo6505a((C1710e<? super T>) new C31705f<Object>(this), C1723a.f5846e));
            C1689b bVar3 = this.f82806o;
            C31614i iVar3 = this.f82793b;
            if (iVar3 == null) {
                C52711k.m112237a("tabListView");
            }
            bVar3.mo6181a(iVar3.mo64502e().mo6505a((C1710e<? super T>) new C31706g<Object>(this), C1723a.f5846e));
            ViewGroup viewGroup7 = this.f82792a;
            if (viewGroup7 == null) {
                C52711k.m112237a(C42311c.f106865i);
            }
            C52711k.m112240b(viewGroup7, C42311c.f106865i);
            View findViewById3 = viewGroup7.findViewById(R.id.ch2);
            C52711k.m112236a((Object) findViewById3, "content.findViewById(R.id.sb_filter_intensity)");
            this.f82798g = new C31683f((SeekBar) findViewById3);
            C31633e eVar = this.f82798g;
            if (eVar == null) {
                C52711k.m112237a("seekBarView");
            }
            eVar.mo64542a(this.f82813v);
            if (this.f82813v) {
                C31633e eVar2 = this.f82798g;
                if (eVar2 == null) {
                    C52711k.m112237a("seekBarView");
                }
                eVar2.mo64541a().setOnSeekBarChangeListener(this.f82807p);
            }
            ViewGroup viewGroup8 = this.f82792a;
            if (viewGroup8 == null) {
                C52711k.m112237a(C42311c.f106865i);
            }
            C52711k.m112240b(viewGroup8, C42311c.f106865i);
            this.f82799h = new C31668c(viewGroup8.findViewById(R.id.arw), viewGroup8.findViewById(R.id.cx3));
            C31630b bVar4 = this.f82799h;
            if (bVar4 == null) {
                C52711k.m112237a("cleanView");
            }
            bVar4.mo64536b(this.f82814w);
            if (this.f82814w) {
                C31630b bVar5 = this.f82799h;
                if (bVar5 == null) {
                    C52711k.m112237a("cleanView");
                }
                bVar5.mo64533a((OnClickListener) new C31702c(this));
            }
            ViewGroup viewGroup9 = this.f82792a;
            if (viewGroup9 == null) {
                C52711k.m112237a(C42311c.f106865i);
            }
            this.f82800i = mo64590a(viewGroup9);
            if (this.f82815x) {
                C31619a aVar2 = this.f82800i;
                if (aVar2 == null) {
                    C52711k.m112237a("filterBoxEntranceView");
                }
                aVar2.mo64518a();
                C31619a aVar3 = this.f82800i;
                if (aVar3 == null) {
                    C52711k.m112237a("filterBoxEntranceView");
                }
                aVar3.mo64519a(new C31703d(this));
            }
            ViewGroup viewGroup10 = this.f82792a;
            if (viewGroup10 == null) {
                C52711k.m112237a(C42311c.f106865i);
            }
            C52711k.m112240b(viewGroup10, C42311c.f106865i);
            this.f82801j = new C31709j(viewGroup10);
            if (this.f82816y) {
                C31632d dVar = this.f82801j;
                if (dVar == null) {
                    C52711k.m112237a("outsideTouchView");
                }
                dVar.mo64540a(new C31707h(this));
            }
            ViewGroup viewGroup11 = this.f82792a;
            if (viewGroup11 == null) {
                C52711k.m112237a(C42311c.f106865i);
            }
            C52711k.m112240b(viewGroup11, C42311c.f106865i);
            this.f82802k = new C31694h(viewGroup11, viewGroup11.findViewById(R.id.csz));
            C31659g gVar = this.f82802k;
            if (gVar == null) {
                C52711k.m112237a("transitionView");
            }
            this.f82806o.mo6181a(gVar.mo64569e().mo6505a((C1710e<? super T>) new C31708i<Object>(this), C1723a.f5846e));
            C31659g gVar2 = this.f82802k;
            if (gVar2 == null) {
                C52711k.m112237a("transitionView");
            }
            gVar2.mo64568d();
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public /* synthetic */ C31699j(ViewGroup viewGroup, C0184k kVar, C31499l lVar, C31631c cVar, C31634f fVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, C52707g gVar) {
        this(viewGroup, kVar, lVar, cVar, fVar, z, true, true, true, true);
    }
}
