package com.p683ss.android.ugc.gamora.recorder.p2482p.p2483a;

import android.arch.lifecycle.C0184k;
import com.bytedance.als.C2759d;
import com.bytedance.als.C2764h;
import com.bytedance.als.C2765i;
import com.bytedance.als.C2767k;
import com.bytedance.p780m.C12356a;
import com.bytedance.p780m.C12361b;
import com.bytedance.scene.C12924i;
import com.bytedance.scene.group.C12896b;
import com.bytedance.scene.navigation.C12942d;
import com.bytedance.scene.p837a.C12837c;
import com.bytedance.scene.p837a.p838a.C12830b;
import com.bytedance.scene.p840b.C12861f.C12863a;
import com.p683ss.android.ugc.aweme.scene.C18998a;
import com.p683ss.android.ugc.aweme.shortvideo.p2203g.C43859a;
import com.p683ss.android.ugc.gamora.recorder.p2482p.C49971b;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.gamora.recorder.p.a.f */
public final class C49952f extends C2764h<C49951e> implements C12356a, C49951e {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f125142a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49952f.class), "topMarginEvent", "getTopMarginEvent()Lcom/bytedance/als/MutableLiveEvent;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49952f.class), "toolbarScene", "getToolbarScene()Lcom/ss/android/ugc/gamora/recorder/toolbar/refactory/ToolbarScene;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49952f.class), "toolbarMoreScene", "getToolbarMoreScene()Lcom/ss/android/ugc/gamora/recorder/toolbar/refactory/ToolbarMoreScene;"))};

    /* renamed from: b */
    public final C49951e f125143b;

    /* renamed from: c */
    public final C12896b f125144c;

    /* renamed from: d */
    public final C49942b f125145d;

    /* renamed from: e */
    private final C43859a f125146e;

    /* renamed from: f */
    private final C52668f f125147f;

    /* renamed from: g */
    private final C52668f f125148g;

    /* renamed from: h */
    private final C52668f f125149h;

    /* renamed from: i */
    private final C12361b f125150i;

    /* renamed from: j */
    private final int f125151j;

    /* renamed from: k */
    private final List<C49971b> f125152k;

    /* renamed from: l */
    private final C49971b f125153l;

    /* renamed from: m */
    private final C52670a<C52860x> f125154m;

    /* renamed from: n */
    private boolean f125155n;

    /* renamed from: com.ss.android.ugc.gamora.recorder.p.a.f$a */
    static final class C49953a<T> implements C2767k<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49952f f125156a;

        C49953a(C49952f fVar) {
            this.f125156a = fVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f125156a.mo97761h().mo7350a((Boolean) obj);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.p.a.f$b */
    static final class C49954b<T> implements C2767k<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49952f f125157a;

        C49954b(C49952f fVar) {
            this.f125157a = fVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C52711k.m112236a((Object) bool, "it");
            if (bool.booleanValue()) {
                this.f125157a.f125144c.mo24409d((C12924i) this.f125157a.mo97762i());
            } else {
                this.f125157a.f125144c.mo24404c((C12924i) this.f125157a.mo97762i());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.p.a.f$c */
    static final class C49955c extends C52712l implements C52670a<C49960h> {

        /* renamed from: a */
        final /* synthetic */ C49952f f125158a;

        C49955c(C49952f fVar) {
            this.f125158a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C49960h(this.f125158a.f125145d, new C52670a<C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C49955c f125159a;

                {
                    this.f125159a = r1;
                }

                public final /* synthetic */ Object invoke() {
                    this.f125159a.f125158a.mo97759a(false);
                    return C52860x.f131107a;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.p.a.f$d */
    static final class C49957d extends C52712l implements C52670a<C49965i> {

        /* renamed from: a */
        final /* synthetic */ C49952f f125160a;

        C49957d(C49952f fVar) {
            this.f125160a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C49965i(this.f125160a.f125145d, this.f125160a.mo97761h());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.p.a.f$e */
    static final class C49958e extends C52712l implements C52670a<C2765i<Boolean>> {

        /* renamed from: a */
        public static final C49958e f125161a = new C49958e();

        C49958e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C2765i();
        }
    }

    /* renamed from: k */
    private final C49960h m107792k() {
        return (C49960h) this.f125149h.getValue();
    }

    /* renamed from: h */
    public final C2765i<Boolean> mo97761h() {
        return (C2765i) this.f125147f.getValue();
    }

    /* renamed from: i */
    public final C49965i mo97762i() {
        return (C49965i) this.f125148g.getValue();
    }

    /* renamed from: j */
    public final C12361b mo23370j() {
        return this.f125150i;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2759d mo7353a() {
        return this.f125143b;
    }

    public final void bO_() {
        super.bO_();
        C52670a<C52860x> aVar = this.f125154m;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f125145d.mo97748a(this.f125152k);
        this.f125145d.mo97751b(this.f125153l);
        this.f125144c.mo24389a(this.f125151j, (C12924i) mo97762i(), "ToolbarScene");
        C0184k kVar = this;
        this.f125146e.mo89403e().mo7352a(kVar, new C49953a(this));
        this.f125146e.mo89399c().mo7352a(kVar, new C49954b(this));
    }

    /* renamed from: a */
    public final void mo97756a(int i) {
        this.f125145d.mo97745a(i);
    }

    /* renamed from: a */
    public final void mo97757a(C49971b bVar) {
        C52711k.m112240b(bVar, "item");
        this.f125145d.mo97747a(bVar);
    }

    /* renamed from: a */
    public final void mo97758a(List<? extends C49971b> list) {
        C52711k.m112240b(list, "items");
        ArrayList arrayList = new ArrayList(this.f125145d.mo97744a());
        arrayList.addAll(list);
        this.f125145d.mo97748a((List<? extends C49971b>) arrayList);
    }

    /* renamed from: b */
    public final void mo97760b(List<? extends C49971b> list) {
        C52711k.m112240b(list, "items");
        ArrayList arrayList = new ArrayList(this.f125145d.mo97744a());
        for (C49971b remove : list) {
            arrayList.remove(remove);
        }
        this.f125145d.mo97748a((List<? extends C49971b>) arrayList);
    }

    /* renamed from: a */
    public final void mo97759a(boolean z) {
        if (this.f125144c.f33837e != null) {
            C12942d dVar = this.f125144c.f33837e;
            if (dVar == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) dVar, "parentScene.navigationScene!!");
            if (z) {
                if (mo97762i().mo24445C()) {
                    this.f125144c.mo24404c((C12924i) mo97762i());
                }
                if (!C18998a.m46171a(dVar, (C12924i) m107792k())) {
                    dVar.mo24522a((C12924i) m107792k(), new C12863a().mo24324a(true).mo24323a((C12837c) new C12830b()).mo24325a());
                }
            } else if (!mo97762i().mo24445C()) {
                this.f125144c.mo24409d((C12924i) mo97762i());
            }
        }
    }

    private C49952f(C12896b bVar, C12361b bVar2, int i, List<C49971b> list, C49971b bVar3, C52670a<C52860x> aVar, int i2, C49942b bVar4, boolean z) {
        C52711k.m112240b(bVar, "parentScene");
        C52711k.m112240b(bVar2, "diContainer");
        C52711k.m112240b(list, "items");
        C52711k.m112240b(bVar4, "toolbarManager");
        this.f125144c = bVar;
        this.f125150i = bVar2;
        this.f125151j = i;
        this.f125152k = list;
        this.f125153l = bVar3;
        this.f125154m = aVar;
        this.f125145d = bVar4;
        this.f125155n = z;
        this.f125146e = (C43859a) mo23370j().mo23373a(C43859a.class, (String) null);
        this.f125143b = this;
        this.f125147f = C52732g.m112285a(C49958e.f125161a);
        this.f125148g = C52732g.m112285a(new C49957d(this));
        this.f125149h = C52732g.m112285a(new C49955c(this));
        this.f125145d.mo97745a(i2);
    }

    public /* synthetic */ C49952f(C12896b bVar, C12361b bVar2, int i, List list, C49971b bVar3, C52670a aVar, int i2, C49942b bVar4, boolean z, int i3, C52707g gVar) {
        this(bVar, bVar2, R.id.c_q, list, bVar3, aVar, i2, new C49959g(), z);
    }
}
