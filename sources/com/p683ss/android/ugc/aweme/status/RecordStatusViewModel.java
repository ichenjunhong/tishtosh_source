package com.p683ss.android.ugc.aweme.status;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import com.p683ss.android.ugc.aweme.status.p2273b.C45739a;
import com.p683ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.status.RecordStatusViewModel */
public final class RecordStatusViewModel extends C0209x {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f115553a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(RecordStatusViewModel.class), "loadStatusList", "getLoadStatusList()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(RecordStatusViewModel.class), "effectResponse", "getEffectResponse()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(RecordStatusViewModel.class), "loadCateoryList", "getLoadCateoryList()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(RecordStatusViewModel.class), "effectCategoryResponse", "getEffectCategoryResponse()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(RecordStatusViewModel.class), "downloadEffect", "getDownloadEffect()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(RecordStatusViewModel.class), "enterEditActivity", "getEnterEditActivity()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(RecordStatusViewModel.class), "loadRandomData", "getLoadRandomData()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(RecordStatusViewModel.class), "createStatusEnterEditActivity", "getCreateStatusEnterEditActivity()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(RecordStatusViewModel.class), "createStatusEnterEditActivityMusicProgress", "getCreateStatusEnterEditActivityMusicProgress()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(RecordStatusViewModel.class), "createStatusEnterEditActivityBgProgress", "getCreateStatusEnterEditActivityBgProgress()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(RecordStatusViewModel.class), "createStatusEnterEditActivityEffectProgress", "getCreateStatusEnterEditActivityEffectProgress()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(RecordStatusViewModel.class), "clickStatusPendant", "getClickStatusPendant()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(RecordStatusViewModel.class), "hideStatusPendantScene", "getHideStatusPendantScene()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(RecordStatusViewModel.class), "statusEnter", "getStatusEnter()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(RecordStatusViewModel.class), "showTemplate", "getShowTemplate()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(RecordStatusViewModel.class), "statusEnterMethod", "getStatusEnterMethod()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(RecordStatusViewModel.class), "clickTabName", "getClickTabName()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: b */
    final C52668f f115554b = C52732g.m112285a(C45721g.f115577a);

    /* renamed from: c */
    private final C52668f f115555c = C52732g.m112285a(C45728n.f115584a);

    /* renamed from: d */
    private final C52668f f115556d = C52732g.m112285a(C45723i.f115579a);

    /* renamed from: e */
    private final C52668f f115557e = C52732g.m112285a(C45726l.f115582a);

    /* renamed from: f */
    private final C52668f f115558f = C52732g.m112285a(C45722h.f115578a);

    /* renamed from: g */
    private final C52668f f115559g = C52732g.m112285a(C45724j.f115580a);

    /* renamed from: h */
    private final C52668f f115560h = C52732g.m112285a(C45727m.f115583a);

    /* renamed from: i */
    private final C52668f f115561i = C52732g.m112285a(C45717c.f115573a);

    /* renamed from: j */
    private final C52668f f115562j = C52732g.m112285a(C45720f.f115576a);

    /* renamed from: k */
    private final C52668f f115563k = C52732g.m112285a(C45718d.f115574a);

    /* renamed from: l */
    private final C52668f f115564l = C52732g.m112285a(C45719e.f115575a);

    /* renamed from: m */
    private final C52668f f115565m = C52732g.m112285a(C45715a.f115571a);

    /* renamed from: n */
    private final C52668f f115566n = C52732g.m112285a(C45725k.f115581a);

    /* renamed from: o */
    private final C52668f f115567o = C52732g.m112285a(C45730p.f115586a);

    /* renamed from: p */
    private final C52668f f115568p = C52732g.m112285a(C45729o.f115585a);

    /* renamed from: q */
    private final C52668f f115569q = C52732g.m112285a(C45731q.f115587a);

    /* renamed from: r */
    private final C52668f f115570r = C52732g.m112285a(C45716b.f115572a);

    /* renamed from: com.ss.android.ugc.aweme.status.RecordStatusViewModel$a */
    static final class C45715a extends C52712l implements C52670a<C0198r<Boolean>> {

        /* renamed from: a */
        public static final C45715a f115571a = new C45715a();

        C45715a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.RecordStatusViewModel$b */
    static final class C45716b extends C52712l implements C52670a<C0198r<String>> {

        /* renamed from: a */
        public static final C45716b f115572a = new C45716b();

        C45716b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.RecordStatusViewModel$c */
    static final class C45717c extends C52712l implements C52670a<C0198r<C45739a>> {

        /* renamed from: a */
        public static final C45717c f115573a = new C45717c();

        C45717c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.RecordStatusViewModel$d */
    static final class C45718d extends C52712l implements C52670a<C0198r<Integer>> {

        /* renamed from: a */
        public static final C45718d f115574a = new C45718d();

        C45718d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.RecordStatusViewModel$e */
    static final class C45719e extends C52712l implements C52670a<C0198r<Integer>> {

        /* renamed from: a */
        public static final C45719e f115575a = new C45719e();

        C45719e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.RecordStatusViewModel$f */
    static final class C45720f extends C52712l implements C52670a<C0198r<Integer>> {

        /* renamed from: a */
        public static final C45720f f115576a = new C45720f();

        C45720f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.RecordStatusViewModel$g */
    static final class C45721g extends C52712l implements C52670a<C0198r<C45739a>> {

        /* renamed from: a */
        public static final C45721g f115577a = new C45721g();

        C45721g() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.RecordStatusViewModel$h */
    static final class C45722h extends C52712l implements C52670a<C0198r<CategoryPageModel>> {

        /* renamed from: a */
        public static final C45722h f115578a = new C45722h();

        C45722h() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.RecordStatusViewModel$i */
    static final class C45723i extends C52712l implements C52670a<C0198r<EffectChannelResponse>> {

        /* renamed from: a */
        public static final C45723i f115579a = new C45723i();

        C45723i() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.RecordStatusViewModel$j */
    static final class C45724j extends C52712l implements C52670a<C0198r<C45739a>> {

        /* renamed from: a */
        public static final C45724j f115580a = new C45724j();

        C45724j() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.RecordStatusViewModel$k */
    static final class C45725k extends C52712l implements C52670a<C0198r<Boolean>> {

        /* renamed from: a */
        public static final C45725k f115581a = new C45725k();

        C45725k() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.RecordStatusViewModel$l */
    static final class C45726l extends C52712l implements C52670a<C0198r<String>> {

        /* renamed from: a */
        public static final C45726l f115582a = new C45726l();

        C45726l() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.RecordStatusViewModel$m */
    static final class C45727m extends C52712l implements C52670a<C0198r<C45739a>> {

        /* renamed from: a */
        public static final C45727m f115583a = new C45727m();

        C45727m() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.RecordStatusViewModel$n */
    static final class C45728n extends C52712l implements C52670a<C0198r<Boolean>> {

        /* renamed from: a */
        public static final C45728n f115584a = new C45728n();

        C45728n() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.RecordStatusViewModel$o */
    static final class C45729o extends C52712l implements C52670a<C0198r<String>> {

        /* renamed from: a */
        public static final C45729o f115585a = new C45729o();

        C45729o() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.RecordStatusViewModel$p */
    static final class C45730p extends C52712l implements C52670a<C0198r<Integer>> {

        /* renamed from: a */
        public static final C45730p f115586a = new C45730p();

        C45730p() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.RecordStatusViewModel$q */
    static final class C45731q extends C52712l implements C52670a<C0198r<String>> {

        /* renamed from: a */
        public static final C45731q f115587a = new C45731q();

        C45731q() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: a */
    public final C0198r<Boolean> mo92156a() {
        return (C0198r) this.f115555c.getValue();
    }

    /* renamed from: b */
    public final C0198r<EffectChannelResponse> mo92157b() {
        return (C0198r) this.f115556d.getValue();
    }

    /* renamed from: c */
    public final C0198r<String> mo92158c() {
        return (C0198r) this.f115557e.getValue();
    }

    /* renamed from: d */
    public final C0198r<CategoryPageModel> mo92159d() {
        return (C0198r) this.f115558f.getValue();
    }

    /* renamed from: e */
    public final C0198r<C45739a> mo92160e() {
        return (C0198r) this.f115559g.getValue();
    }

    /* renamed from: f */
    public final C0198r<C45739a> mo92161f() {
        return (C0198r) this.f115560h.getValue();
    }

    /* renamed from: g */
    public final C0198r<C45739a> mo92162g() {
        return (C0198r) this.f115561i.getValue();
    }

    /* renamed from: h */
    public final C0198r<Integer> mo92163h() {
        return (C0198r) this.f115562j.getValue();
    }

    /* renamed from: i */
    public final C0198r<Integer> mo92164i() {
        return (C0198r) this.f115563k.getValue();
    }

    /* renamed from: j */
    public final C0198r<Integer> mo92165j() {
        return (C0198r) this.f115564l.getValue();
    }

    /* renamed from: k */
    public final C0198r<Boolean> mo92166k() {
        return (C0198r) this.f115565m.getValue();
    }

    /* renamed from: l */
    public final C0198r<Boolean> mo92167l() {
        return (C0198r) this.f115566n.getValue();
    }

    /* renamed from: m */
    public final C0198r<Integer> mo92168m() {
        return (C0198r) this.f115567o.getValue();
    }

    /* renamed from: n */
    public final C0198r<String> mo92169n() {
        return (C0198r) this.f115568p.getValue();
    }

    /* renamed from: o */
    public final C0198r<String> mo92170o() {
        return (C0198r) this.f115569q.getValue();
    }

    /* renamed from: p */
    public final C0198r<String> mo92171p() {
        return (C0198r) this.f115570r.getValue();
    }
}
