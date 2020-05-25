package com.p683ss.android.ugc.gamora.recorder.filter.filter_panel;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0195p;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.LiveData;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.als.ApiCenter;
import com.bytedance.als.C2767k;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.p618i.C10172a.C10173a;
import com.bytedance.ui_component.C13359a;
import com.bytedance.ui_component.C13359a.C13360a;
import com.bytedance.ui_component.C13359a.C13361b;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31499l;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31483a;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31487c;
import com.p683ss.android.ugc.aweme.filter.view.p1750a.C31605a;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.aweme.port.p2082in.C39527aa.C39528a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49561h;
import com.p683ss.android.ugc.gamora.recorder.filter.p2470a.C49683a;
import com.ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.C52860x;
import p2628d.p2629a.C52550ab;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.FilterPanelViewModel */
public final class FilterPanelViewModel extends LifecycleAwareViewModel<FilterPanelState> implements C49745b {

    /* renamed from: e */
    static final /* synthetic */ C52767h[] f124709e = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(FilterPanelViewModel.class), "filterApiComponent", "getFilterApiComponent()Lcom/ss/android/ugc/gamora/recorder/filter/filter_core/FilterApiComponent;"))};

    /* renamed from: f */
    public final Handler f124710f = new Handler(Looper.getMainLooper());

    /* renamed from: g */
    public final C0198r<C49756e> f124711g = new C0198r<>();

    /* renamed from: h */
    public final ApiCenter f124712h;

    /* renamed from: i */
    public final Context f124713i;

    /* renamed from: j */
    public final C31499l f124714j;

    /* renamed from: k */
    final boolean f124715k = true;

    /* renamed from: l */
    private final C52668f f124716l = C52732g.m112285a(new C49726a(this));

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.FilterPanelViewModel$a */
    static final class C49726a extends C52712l implements C52670a<C49683a> {

        /* renamed from: a */
        final /* synthetic */ FilterPanelViewModel f124717a;

        C49726a(FilterPanelViewModel filterPanelViewModel) {
            this.f124717a = filterPanelViewModel;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (C49683a) this.f124717a.f124712h.mo7339a(C49683a.class);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.FilterPanelViewModel$b */
    static final class C49727b<T> implements C2767k<C31459g> {

        /* renamed from: a */
        final /* synthetic */ FilterPanelViewModel f124718a;

        C49727b(FilterPanelViewModel filterPanelViewModel) {
            this.f124718a = filterPanelViewModel;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            final C31459g gVar = (C31459g) obj;
            this.f124718a.mo22533d(new C52671b<FilterPanelState, FilterPanelState>() {
                public final /* synthetic */ Object invoke(Object obj) {
                    FilterPanelState filterPanelState = (FilterPanelState) obj;
                    C52711k.m112240b(filterPanelState, "$receiver");
                    return FilterPanelState.copy$default(filterPanelState, null, gVar, null, false, null, null, 0, 125, null);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.FilterPanelViewModel$c */
    static final class C49729c<T> implements C2767k<List<? extends C52847n<? extends EffectCategoryResponse, ? extends List<? extends C31459g>>>> {

        /* renamed from: a */
        final /* synthetic */ FilterPanelViewModel f124720a;

        C49729c(FilterPanelViewModel filterPanelViewModel) {
            this.f124720a = filterPanelViewModel;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            final List list = (List) obj;
            this.f124720a.mo22533d(new C52671b<FilterPanelState, FilterPanelState>() {
                public final /* synthetic */ Object invoke(Object obj) {
                    FilterPanelState filterPanelState = (FilterPanelState) obj;
                    C52711k.m112240b(filterPanelState, "$receiver");
                    return FilterPanelState.copy$default(filterPanelState, null, null, null, false, C31483a.m73321c(list), null, 0, 111, null);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.FilterPanelViewModel$d */
    static final class C49731d<T> implements C2767k<List<? extends C31459g>> {

        /* renamed from: a */
        final /* synthetic */ FilterPanelViewModel f124722a;

        C49731d(FilterPanelViewModel filterPanelViewModel) {
            this.f124722a = filterPanelViewModel;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            List list = (List) obj;
            if (list != null) {
                FilterPanelViewModel filterPanelViewModel = this.f124722a;
                filterPanelViewModel.mo22527b(new C49742n(filterPanelViewModel, list));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.FilterPanelViewModel$e */
    static final class C49732e extends C52712l implements C52671b<FilterPanelState, C52860x> {

        /* renamed from: a */
        final /* synthetic */ FilterPanelViewModel f124723a;

        /* renamed from: b */
        final /* synthetic */ C31605a f124724b;

        C49732e(FilterPanelViewModel filterPanelViewModel, C31605a aVar) {
            this.f124723a = filterPanelViewModel;
            this.f124724b = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final C31459g gVar;
            FilterPanelState filterPanelState = (FilterPanelState) obj;
            C52711k.m112240b(filterPanelState, "state");
            C31459g selectedFilter = filterPanelState.getSelectedFilter();
            if (selectedFilter != null && selectedFilter.f82324a == this.f124724b.f82611b.f82392a.f82404a) {
                List list = (List) C39629l.m88232a().mo58584o().mo64334d().mo64415e().mo64418a().getValue();
                if (list == null || list.isEmpty()) {
                    gVar = C31483a.m73320c();
                    gVar.f82325b = this.f124723a.f124713i.getResources().getStringArray(R.array.a8)[0];
                } else {
                    gVar = (C31459g) list.get(0);
                }
                this.f124723a.f124710f.post(new Runnable(this) {

                    /* renamed from: a */
                    final /* synthetic */ C49732e f124725a;

                    {
                        this.f124725a = r1;
                    }

                    public final void run() {
                        this.f124725a.f124723a.mo97628a(gVar);
                    }
                });
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.FilterPanelViewModel$f */
    public static final class C49734f implements C39528a {

        /* renamed from: a */
        final /* synthetic */ FilterPanelViewModel f124727a;

        /* renamed from: b */
        final /* synthetic */ Activity f124728b;

        /* renamed from: b */
        public final void mo64372b() {
        }

        /* renamed from: a */
        public final void mo64371a() {
            this.f124727a.f124714j.mo64411a(true);
        }

        C49734f(FilterPanelViewModel filterPanelViewModel, Activity activity) {
            this.f124727a = filterPanelViewModel;
            this.f124728b = activity;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.FilterPanelViewModel$g */
    static final class C49735g extends C52712l implements C52671b<FilterPanelState, FilterPanelState> {

        /* renamed from: a */
        public static final C49735g f124729a = new C49735g();

        C49735g() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            FilterPanelState filterPanelState = (FilterPanelState) obj;
            C52711k.m112240b(filterPanelState, "$receiver");
            return FilterPanelState.copy$default(filterPanelState, null, null, null, false, null, new C49561h(), 0, 95, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.FilterPanelViewModel$h */
    static final class C49736h extends C52712l implements C52671b<FilterPanelState, FilterPanelState> {

        /* renamed from: a */
        final /* synthetic */ boolean f124730a;

        C49736h(boolean z) {
            this.f124730a = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            FilterPanelState filterPanelState = (FilterPanelState) obj;
            C52711k.m112240b(filterPanelState, "$receiver");
            return FilterPanelState.copy$default(filterPanelState, null, null, null, this.f124730a, null, null, 0, 119, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.FilterPanelViewModel$i */
    static final class C49737i extends C52712l implements C52671b<FilterPanelState, FilterPanelState> {

        /* renamed from: a */
        public static final C49737i f124731a = new C49737i();

        C49737i() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            FilterPanelState filterPanelState = (FilterPanelState) obj;
            C52711k.m112240b(filterPanelState, "$receiver");
            return FilterPanelState.copy$default(filterPanelState, null, null, null, false, null, null, 0, 125, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.FilterPanelViewModel$j */
    static final class C49738j extends C52712l implements C52671b<FilterPanelState, FilterPanelState> {

        /* renamed from: a */
        final /* synthetic */ int f124732a;

        C49738j(int i) {
            this.f124732a = i;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            FilterPanelState filterPanelState = (FilterPanelState) obj;
            C52711k.m112240b(filterPanelState, "$receiver");
            return FilterPanelState.copy$default(filterPanelState, null, null, null, false, null, null, this.f124732a, 63, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.FilterPanelViewModel$k */
    static final class C49739k extends C52712l implements C52671b<FilterPanelState, FilterPanelState> {

        /* renamed from: a */
        public static final C49739k f124733a = new C49739k();

        C49739k() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            FilterPanelState filterPanelState = (FilterPanelState) obj;
            C52711k.m112240b(filterPanelState, "$receiver");
            return FilterPanelState.copy$default(filterPanelState, null, null, null, false, null, null, 0, 119, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.FilterPanelViewModel$l */
    static final class C49740l extends C52712l implements C52671b<FilterPanelState, FilterPanelState> {

        /* renamed from: a */
        final /* synthetic */ C31459g f124734a;

        C49740l(C31459g gVar) {
            this.f124734a = gVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            FilterPanelState filterPanelState = (FilterPanelState) obj;
            C52711k.m112240b(filterPanelState, "$receiver");
            return FilterPanelState.copy$default(filterPanelState, null, this.f124734a, null, false, null, null, 0, 125, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.FilterPanelViewModel$m */
    static final class C49741m extends C52712l implements C52671b<FilterPanelState, FilterPanelState> {

        /* renamed from: a */
        final /* synthetic */ FilterPanelViewModel f124735a;

        /* renamed from: b */
        final /* synthetic */ boolean f124736b;

        C49741m(FilterPanelViewModel filterPanelViewModel, boolean z) {
            this.f124735a = filterPanelViewModel;
            this.f124736b = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C13359a aVar;
            FilterPanelState filterPanelState = (FilterPanelState) obj;
            C52711k.m112240b(filterPanelState, "$receiver");
            if (this.f124736b) {
                C13361b bVar = new C13361b();
                this.f124735a.f124711g.setValue(C49756e.ON_SHOWN);
                aVar = bVar;
            } else {
                C13360a aVar2 = new C13360a();
                this.f124735a.f124711g.setValue(C49756e.ON_DISMISSED);
                aVar = aVar2;
            }
            return FilterPanelState.copy$default(filterPanelState, aVar, null, null, false, null, null, 0, 126, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.filter.filter_panel.FilterPanelViewModel$n */
    static final class C49742n extends C52712l implements C52671b<FilterPanelState, C52860x> {

        /* renamed from: a */
        final /* synthetic */ FilterPanelViewModel f124737a;

        /* renamed from: b */
        final /* synthetic */ List f124738b;

        C49742n(FilterPanelViewModel filterPanelViewModel, List list) {
            this.f124737a = filterPanelViewModel;
            this.f124738b = list;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Object obj2;
            boolean z;
            FilterPanelState filterPanelState = (FilterPanelState) obj;
            C52711k.m112240b(filterPanelState, "state");
            Iterator it = this.f124738b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((C31459g) obj2).f82324a == filterPanelState.getPendingSelected()) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            final C31459g gVar = (C31459g) obj2;
            if (!(filterPanelState.getPendingSelected() == Integer.MIN_VALUE || gVar == null)) {
                this.f124737a.mo97631f();
                this.f124737a.f124710f.post(new Runnable(this) {

                    /* renamed from: a */
                    final /* synthetic */ C49742n f124739a;

                    {
                        this.f124739a = r1;
                    }

                    public final void run() {
                        this.f124739a.f124737a.mo97628a(gVar);
                    }
                });
            }
            return C52860x.f131107a;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final C49683a mo97630e() {
        return (C49683a) this.f124716l.getValue();
    }

    /* renamed from: f */
    public final void mo97631f() {
        mo97627a((int) DynamicTabYellowPointVersion.DEFAULT);
    }

    /* renamed from: a */
    public final LiveData<C49756e> mo97626a() {
        LiveData liveData = this.f124711g;
        C52711k.m112240b(liveData, "$this$distinctUntilChanged");
        C0195p pVar = new C0195p();
        pVar.mo342a(liveData, new C10173a(pVar));
        return pVar;
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        FilterPanelState filterPanelState = new FilterPanelState(new C13360a(), null, new C49555b(null), C39629l.m88232a().mo58574e().mo83117a(C40796a.DisableFilter), C52550ab.m112045a(), null, 0, 96, null);
        return filterPanelState;
    }

    /* renamed from: d */
    public final void mo22532d() {
        super.mo22532d();
        C0184k kVar = this;
        mo97630e().mo97572b().mo7352a(kVar, new C49727b(this));
        this.f124714j.mo64415e().mo64419b().observe(kVar, new C49729c(this));
        this.f124714j.mo64415e().mo64418a().observe(kVar, new C49731d(this));
        mo97631f();
        this.f124714j.mo64411a(false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo97627a(int i) {
        mo22530c(new C49738j(i));
    }

    /* renamed from: a */
    public final void mo97628a(C31459g gVar) {
        if (C31487c.m73325a(this.f124714j, gVar)) {
            if (gVar != null) {
                mo97630e().mo97570a(gVar, (String) null);
                mo97630e().mo97571a(false);
                mo22530c(C49739k.f124733a);
            }
            mo22533d(new C49740l(gVar));
        }
    }

    /* renamed from: a */
    public final void mo97629a(boolean z) {
        mo22533d(new C49741m(this, z));
    }

    public FilterPanelViewModel(ApiCenter apiCenter, Context context, C31499l lVar, boolean z) {
        C52711k.m112240b(apiCenter, "apiCenter");
        C52711k.m112240b(context, "context");
        C52711k.m112240b(lVar, "repository");
        this.f124712h = apiCenter;
        this.f124713i = context;
        this.f124714j = lVar;
    }
}
